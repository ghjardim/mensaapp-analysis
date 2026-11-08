package org.apache.tika.pipes.async;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.apache.tika.pipes.async.AsyncEmitter;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.TikaEmitterException;
import org.apache.tika.utils.ExceptionUtils;
import p256j$.time.Instant;
import p256j$.time.temporal.ChronoUnit;
import p256j$.util.Map;
import p256j$.util.function.Function$CC;
import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class AsyncEmitter implements Callable<Integer> {
    static final int EMITTER_FUTURE_CODE = 2;
    static final EmitData EMIT_DATA_STOP_SEMAPHORE = new EmitData(null, null, null);
    private static final InterfaceC6304d LOG = AbstractC6306f.m26394k(AsyncEmitter.class);
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue<EmitData> emitDataQueue;
    private final EmitterManager emitterManager;
    Instant lastEmitted = Instant.now();

    public class EmitDataCache {
        private final long maxBytes;
        long estimatedSize = 0;
        int size = 0;
        Map<String, List<EmitData>> map = new HashMap();

        public EmitDataCache(long j7) {
            this.maxBytes = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void emitAll() {
            AsyncEmitter.LOG.mo26360d("about to emit {} files, {} estimated bytes", Integer.valueOf(this.size), Long.valueOf(this.estimatedSize));
            int i7 = 0;
            for (Map.Entry<String, List<EmitData>> entry : this.map.entrySet()) {
                tryToEmit(AsyncEmitter.this.emitterManager.getEmitter(entry.getKey()), entry.getValue());
                i7 += entry.getValue().size();
            }
            AsyncEmitter.LOG.mo26374r("emitted: {} files", Integer.valueOf(i7));
            this.estimatedSize = 0L;
            this.size = 0;
            this.map.clear();
            AsyncEmitter.this.lastEmitted = Instant.now();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ List lambda$add$0(String str) {
            return new ArrayList();
        }

        private void tryToEmit(Emitter emitter, List<EmitData> list) {
            try {
                emitter.emit(list);
            } catch (IOException | TikaEmitterException e7) {
                AsyncEmitter.LOG.mo26369m("emitter class ({}): {}", emitter.getClass(), ExceptionUtils.getStackTrace(e7));
            }
        }

        public void add(EmitData emitData) {
            this.size++;
            long estimatedSizeBytes = emitData.getEstimatedSizeBytes();
            if (this.estimatedSize + estimatedSizeBytes > this.maxBytes) {
                AsyncEmitter.LOG.mo26360d("estimated size ({}) > maxBytes({}), going to emitAll", Long.valueOf(this.estimatedSize + estimatedSizeBytes), Long.valueOf(this.maxBytes));
                emitAll();
            }
            List list = (List) Map.EL.computeIfAbsent(this.map, emitData.getEmitKey().getEmitterName(), new Function() { // from class: org.apache.tika.pipes.async.a
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    List lambda$add$0;
                    lambda$add$0 = AsyncEmitter.EmitDataCache.lambda$add$0((String) obj);
                    return lambda$add$0;
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            updateEstimatedSize(estimatedSizeBytes);
            list.add(emitData);
        }

        public void updateEstimatedSize(long j7) {
            this.estimatedSize += j7;
        }
    }

    public AsyncEmitter(AsyncConfig asyncConfig, ArrayBlockingQueue<EmitData> arrayBlockingQueue, EmitterManager emitterManager) {
        this.asyncConfig = asyncConfig;
        this.emitDataQueue = arrayBlockingQueue;
        this.emitterManager = emitterManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Integer call() {
        EmitDataCache emitDataCache = new EmitDataCache(this.asyncConfig.getEmitMaxEstimatedBytes());
        while (true) {
            EmitData poll = this.emitDataQueue.poll(500L, TimeUnit.MILLISECONDS);
            if (poll == EMIT_DATA_STOP_SEMAPHORE) {
                emitDataCache.emitAll();
                return 2;
            }
            if (poll != null) {
                emitDataCache.add(poll);
            } else {
                LOG.mo26381y("Nothing on the async queue");
            }
            InterfaceC6304d interfaceC6304d = LOG;
            interfaceC6304d.mo26360d("cache size: ({}) bytes and extract count: {}", Long.valueOf(emitDataCache.estimatedSize), Integer.valueOf(emitDataCache.size));
            long between = ChronoUnit.MILLIS.between(this.lastEmitted, Instant.now());
            if (between > this.asyncConfig.getEmitWithinMillis()) {
                interfaceC6304d.mo26360d("{} elapsed > {}, going to emitAll", Long.valueOf(between), Long.valueOf(this.asyncConfig.getEmitWithinMillis()));
                emitDataCache.emitAll();
            }
        }
    }
}
