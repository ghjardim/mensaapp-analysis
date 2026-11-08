package org.apache.tika.pipes.async;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.PipesClient;
import org.apache.tika.pipes.PipesReporter;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import org.apache.tika.pipes.pipesiterator.TotalCounter;
import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class AsyncProcessor implements Closeable {
    private static final InterfaceC6304d LOG = AbstractC6306f.m26394k(AsyncProcessor.class);
    private static long MAX_OFFER_WAIT_MS = 120000;
    static final int PARSER_FUTURE_CODE = 1;
    static final int WATCHER_FUTURE_CODE = 3;
    private boolean addedEmitterSemaphores;
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue<EmitData> emitData;
    private final ExecutorCompletionService<Integer> executorCompletionService;
    private final ExecutorService executorService;
    private final ArrayBlockingQueue<FetchEmitTuple> fetchEmitTuples;
    boolean isShuttingDown;
    private volatile int numEmitterThreadsFinished;
    private volatile int numParserThreadsFinished;
    private final AtomicLong totalProcessed;

    public class FetchEmitWorker implements Callable<Integer> {
        private final AsyncConfig asyncConfig;
        private final ArrayBlockingQueue<EmitData> emitDataQueue;
        private final ArrayBlockingQueue<FetchEmitTuple> fetchEmitTuples;

        private boolean shouldEmit(PipesResult pipesResult) {
            if (pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS || pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS_WITH_EXCEPTION) {
                return true;
            }
            return pipesResult.isIntermediate() && this.asyncConfig.isEmitIntermediateResults();
        }

        private FetchEmitWorker(AsyncConfig asyncConfig, ArrayBlockingQueue<FetchEmitTuple> arrayBlockingQueue, ArrayBlockingQueue<EmitData> arrayBlockingQueue2) {
            this.asyncConfig = asyncConfig;
            this.fetchEmitTuples = arrayBlockingQueue;
            this.emitDataQueue = arrayBlockingQueue2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Integer call() {
            PipesResult pipesResult;
            PipesClient pipesClient = new PipesClient(this.asyncConfig);
            while (true) {
                try {
                    FetchEmitTuple poll = this.fetchEmitTuples.poll(1L, TimeUnit.SECONDS);
                    if (poll == null) {
                        if (AsyncProcessor.LOG.mo26371o()) {
                            AsyncProcessor.LOG.mo26381y("null fetch emit tuple");
                        }
                    } else {
                        if (poll == PipesIterator.COMPLETED_SEMAPHORE) {
                            if (AsyncProcessor.LOG.mo26371o()) {
                                AsyncProcessor.LOG.mo26381y("hit completed semaphore");
                            }
                            pipesClient.close();
                            return 1;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            pipesResult = pipesClient.process(poll);
                        } catch (IOException e7) {
                            AsyncProcessor.LOG.mo26377u("pipesClient crash", e7);
                            pipesResult = PipesResult.UNSPECIFIED_CRASH;
                        }
                        if (AsyncProcessor.LOG.mo26371o()) {
                            AsyncProcessor.LOG.mo26363g("timer -- pipes client process: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (shouldEmit(pipesResult)) {
                            AsyncProcessor.LOG.mo26381y("adding result to emitter queue: " + pipesResult.getEmitData());
                            if (!this.emitDataQueue.offer(pipesResult.getEmitData(), AsyncProcessor.MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                                throw new RuntimeException("Couldn't offer emit data to queue within " + AsyncProcessor.MAX_OFFER_WAIT_MS + " ms");
                            }
                        }
                        if (AsyncProcessor.LOG.mo26371o()) {
                            AsyncProcessor.LOG.mo26363g("timer -- offered: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                        }
                        this.asyncConfig.getPipesReporter().report(poll, pipesResult, System.currentTimeMillis() - currentTimeMillis);
                        AsyncProcessor.this.totalProcessed.incrementAndGet();
                    }
                } catch (Throwable th) {
                    try {
                        pipesClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public AsyncProcessor(Path path) {
        this(path, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$new$0() {
        while (true) {
            try {
                Thread.sleep(500L);
                checkActive();
            } catch (InterruptedException unused) {
                return 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCounter$1(TotalCounter totalCounter) {
        totalCounter.startTotalCount();
        PipesReporter pipesReporter = this.asyncConfig.getPipesReporter();
        TotalCountResult.STATUS status = totalCounter.getTotalCount().getStatus();
        while (status == TotalCountResult.STATUS.NOT_COMPLETED) {
            try {
                Thread.sleep(500L);
                TotalCountResult totalCount = totalCounter.getTotalCount();
                LOG.mo26365i("counter total  {} {} ", totalCount.getStatus(), Long.valueOf(totalCount.getTotalCount()));
                pipesReporter.report(totalCount);
                status = totalCount.getStatus();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private void startCounter(final TotalCounter totalCounter) {
        Thread thread = new Thread(new Runnable() { // from class: org.apache.tika.pipes.async.c
            @Override // java.lang.Runnable
            public final void run() {
                AsyncProcessor.this.lambda$startCounter$1(totalCounter);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    public synchronized boolean checkActive() {
        boolean z6;
        try {
            Future<Integer> poll = this.executorCompletionService.poll();
            z6 = true;
            if (poll != null) {
                try {
                    Integer num = poll.get();
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        this.numParserThreadsFinished++;
                        LOG.mo26374r("fetchEmitWorker finished, total {}", Integer.valueOf(this.numParserThreadsFinished));
                    } else if (intValue == 2) {
                        this.numEmitterThreadsFinished++;
                        LOG.mo26374r("emitter thread finished, total {}", Integer.valueOf(this.numEmitterThreadsFinished));
                    } else {
                        if (intValue != 3) {
                            throw new IllegalArgumentException("Don't recognize this future code: " + num);
                        }
                        LOG.mo26370n("watcher thread finished");
                    }
                } catch (ExecutionException e7) {
                    LOG.mo26364h("execution exception", e7);
                    this.asyncConfig.getPipesReporter().error(e7);
                    throw new RuntimeException(e7);
                }
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && !this.addedEmitterSemaphores) {
                for (int i7 = 0; i7 < this.asyncConfig.getNumEmitters(); i7++) {
                    try {
                        if (!this.emitData.offer(AsyncEmitter.EMIT_DATA_STOP_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                            throw new RuntimeException("Couldn't offer emit data stop semaphore within " + MAX_OFFER_WAIT_MS + " ms");
                        }
                    } catch (InterruptedException e8) {
                        throw new RuntimeException(e8);
                    }
                }
                this.addedEmitterSemaphores = true;
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && this.numEmitterThreadsFinished == this.asyncConfig.getNumEmitters()) {
                z6 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.executorService.shutdownNow();
        this.asyncConfig.getPipesReporter().close();
    }

    public void finished() {
        for (int i7 = 0; i7 < this.asyncConfig.getNumClients(); i7++) {
            if (!this.fetchEmitTuples.offer(PipesIterator.COMPLETED_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Couldn't offer completed semaphore within " + MAX_OFFER_WAIT_MS + " ms");
            }
        }
    }

    public int getCapacity() {
        return this.fetchEmitTuples.remainingCapacity();
    }

    public long getTotalProcessed() {
        return this.totalProcessed.get();
    }

    public synchronized boolean offer(List<FetchEmitTuple> list, long j7) {
        if (this.isShuttingDown) {
            throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
        }
        if (list.size() > this.asyncConfig.getQueueSize()) {
            throw new OfferLargerThanQueueSize(list.size(), this.asyncConfig.getQueueSize());
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (long currentTimeMillis2 = System.currentTimeMillis(); currentTimeMillis2 - currentTimeMillis < j7; currentTimeMillis2 = System.currentTimeMillis()) {
            if (this.fetchEmitTuples.remainingCapacity() > list.size()) {
                try {
                    this.fetchEmitTuples.addAll(list);
                    return true;
                } catch (IllegalStateException e7) {
                    LOG.mo26378v("couldn't add full list", e7);
                }
            }
            Thread.sleep(100L);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncProcessor(Path path, PipesIterator pipesIterator) {
        Path absolutePath;
        Path absolutePath2;
        boolean equals;
        Path absolutePath3;
        Path absolutePath4;
        this.totalProcessed = new AtomicLong(0L);
        this.numParserThreadsFinished = 0;
        this.numEmitterThreadsFinished = 0;
        this.addedEmitterSemaphores = false;
        this.isShuttingDown = false;
        AsyncConfig load = AsyncConfig.load(path);
        this.asyncConfig = load;
        this.fetchEmitTuples = new ArrayBlockingQueue<>(load.getQueueSize());
        this.emitData = new ArrayBlockingQueue<>(100);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(load.getNumClients() + load.getNumEmitters() + 1);
        this.executorService = newFixedThreadPool;
        ExecutorCompletionService<Integer> executorCompletionService = new ExecutorCompletionService<>(newFixedThreadPool);
        this.executorCompletionService = executorCompletionService;
        try {
            absolutePath = path.toAbsolutePath();
            absolutePath2 = load.getTikaConfig().toAbsolutePath();
            equals = absolutePath.equals(absolutePath2);
            if (!equals) {
                InterfaceC6304d interfaceC6304d = LOG;
                absolutePath3 = path.toAbsolutePath();
                absolutePath4 = load.getTikaConfig().toAbsolutePath();
                interfaceC6304d.mo26369m("TikaConfig for AsyncProcessor ({}) is different from TikaConfig for workers ({}). If this is intended, please ignore this warning.", absolutePath3, absolutePath4);
            }
            executorCompletionService.submit(new Callable() { // from class: org.apache.tika.pipes.async.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Integer lambda$new$0;
                    lambda$new$0 = AsyncProcessor.this.lambda$new$0();
                    return lambda$new$0;
                }
            });
            if (pipesIterator != 0 && (pipesIterator instanceof TotalCounter)) {
                LOG.mo26370n("going to total counts");
                startCounter((TotalCounter) pipesIterator);
            }
            for (int i7 = 0; i7 < this.asyncConfig.getNumClients(); i7++) {
                this.executorCompletionService.submit(new FetchEmitWorker(this.asyncConfig, this.fetchEmitTuples, this.emitData));
            }
            EmitterManager load2 = EmitterManager.load(this.asyncConfig.getTikaConfig());
            for (int i8 = 0; i8 < this.asyncConfig.getNumEmitters(); i8++) {
                this.executorCompletionService.submit(new AsyncEmitter(this.asyncConfig, this.emitData, load2));
            }
        } catch (Exception e7) {
            LOG.mo26364h("problem initializing AsyncProcessor", e7);
            this.executorService.shutdownNow();
            this.asyncConfig.getPipesReporter().error(e7);
            throw e7;
        }
    }

    public synchronized boolean offer(FetchEmitTuple fetchEmitTuple, long j7) {
        if (this.fetchEmitTuples != null) {
            if (!this.isShuttingDown) {
                checkActive();
            } else {
                throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
            }
        } else {
            throw new IllegalStateException("queue hasn't been initialized yet.");
        }
        return this.fetchEmitTuples.offer(fetchEmitTuple, j7, TimeUnit.MILLISECONDS);
    }
}
