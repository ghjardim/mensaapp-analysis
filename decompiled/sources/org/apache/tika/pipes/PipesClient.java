package org.apache.tika.pipes;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ProcessBuilder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.utils.ProcessUtils;
import org.apache.tika.utils.StringUtils;
import p254i6.C4654i;
import p265j6.C5395e;
import p272k4.C5410A;
import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class PipesClient implements Closeable {
    private static final int MAX_BYTES_BEFORE_READY = 20000;
    private static final long WAIT_ON_DESTROY_MS = 10000;
    private DataInputStream input;
    private DataOutputStream output;
    private final PipesConfigBase pipesConfig;
    private Process process;
    private static final InterfaceC6304d LOG = AbstractC6306f.m26394k(PipesClient.class);
    private static AtomicInteger CLIENT_COUNTER = new AtomicInteger(0);
    private final Object[] executorServiceLock = new Object[0];
    private volatile boolean closed = false;
    private ExecutorService executorService = Executors.newFixedThreadPool(1);
    private int filesProcessed = 0;
    private final int pipesClientId = CLIENT_COUNTER.getAndIncrement();

    /* renamed from: org.apache.tika.pipes.PipesClient$1 */
    public static /* synthetic */ class C60001 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS;

        static {
            int[] iArr = new int[PipesServer.STATUS.values().length];
            $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS = iArr;
            try {
                iArr[PipesServer.STATUS.OOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMITTER_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCHER_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCHER_INITIALIZATION_EXCEPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCH_EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.INTERMEDIATE_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PARSE_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PARSE_EXCEPTION_NO_EMIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMPTY_OUTPUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.READY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.CALL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FAILED_TO_START.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public PipesClient(PipesConfigBase pipesConfigBase) {
        this.pipesConfig = pipesConfigBase;
    }

    private PipesResult actuallyProcess(final FetchEmitTuple fetchEmitTuple) {
        boolean isAlive;
        boolean isAlive2;
        final long currentTimeMillis = System.currentTimeMillis();
        final PipesResult[] pipesResultArr = new PipesResult[1];
        FutureTask futureTask = new FutureTask(new Callable() { // from class: org.apache.tika.pipes.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                PipesResult lambda$actuallyProcess$0;
                lambda$actuallyProcess$0 = PipesClient.this.lambda$actuallyProcess$0(fetchEmitTuple, currentTimeMillis, pipesResultArr);
                return lambda$actuallyProcess$0;
            }
        });
        try {
            try {
                try {
                    if (!this.closed) {
                        this.executorService.execute(futureTask);
                        PipesResult pipesResult = (PipesResult) futureTask.get(this.pipesConfig.getTimeoutMillis(), TimeUnit.MILLISECONDS);
                        futureTask.cancel(true);
                        return pipesResult;
                    }
                    throw new IllegalArgumentException("pipesClientId=" + this.pipesClientId + ": PipesClient closed");
                } catch (TimeoutException unused) {
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    destroyForcibly();
                    LOG.mo26367k("pipesClientId={} client timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis2));
                    PipesResult buildFatalResult = buildFatalResult(PipesResult.TIMEOUT, pipesResultArr);
                    futureTask.cancel(true);
                    return buildFatalResult;
                }
            } catch (InterruptedException e7) {
                destroyForcibly();
                throw e7;
            } catch (ExecutionException e8) {
                InterfaceC6304d interfaceC6304d = LOG;
                interfaceC6304d.mo26364h("pipesClientId=" + this.pipesClientId + ": execution exception", e8);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                pauseThenDestroy();
                isAlive = this.process.isAlive();
                if (!isAlive && 17 == this.process.exitValue()) {
                    interfaceC6304d.mo26367k("pipesClientId={} server timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis3));
                    PipesResult buildFatalResult2 = buildFatalResult(PipesResult.TIMEOUT, pipesResultArr);
                    futureTask.cancel(true);
                    return buildFatalResult2;
                }
                this.process.waitFor(500L, TimeUnit.MILLISECONDS);
                isAlive2 = this.process.isAlive();
                if (isAlive2) {
                    interfaceC6304d.mo26367k("pipesClientId={} crash: {} in {} ms with no exit code available", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis3));
                } else {
                    interfaceC6304d.mo26367k("pipesClientId={} crash: {} in {} ms with exit code {}", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis3), Integer.valueOf(this.process.exitValue()));
                }
                PipesResult buildFatalResult3 = buildFatalResult(PipesResult.UNSPECIFIED_CRASH, pipesResultArr);
                futureTask.cancel(true);
                return buildFatalResult3;
            }
        } catch (Throwable th) {
            futureTask.cancel(true);
            throw th;
        }
    }

    private PipesResult buildFatalResult(PipesResult pipesResult, PipesResult[] pipesResultArr) {
        if (pipesResultArr[0] == null) {
            return pipesResult;
        }
        InterfaceC6304d interfaceC6304d = LOG;
        if (interfaceC6304d.mo26371o()) {
            interfaceC6304d.mo26363g("intermediate result: {}", pipesResultArr[0].getEmitData());
        }
        pipesResultArr[0].getEmitData().getMetadataList().get(0).set(TikaCoreProperties.PIPES_RESULT, pipesResult.getStatus().toString());
        return new PipesResult(pipesResult.getStatus(), pipesResultArr[0].getEmitData(), true);
    }

    private PipesResult deserializeEmitData() {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(C4654i.m20181a().m20185m(bArr).m20184l());
            try {
                EmitData emitData = (EmitData) objectInputStream.readObject();
                String containerStackTrace = emitData.getContainerStackTrace();
                if (StringUtils.isBlank(containerStackTrace)) {
                    PipesResult pipesResult = new PipesResult(emitData);
                    objectInputStream.close();
                    return pipesResult;
                }
                PipesResult pipesResult2 = new PipesResult(emitData, containerStackTrace);
                objectInputStream.close();
                return pipesResult2;
            } finally {
            }
        } catch (ClassNotFoundException e7) {
            LOG.mo26364h("class not found exception deserializing data", e7);
            throw new RuntimeException(e7);
        }
    }

    private PipesResult deserializeIntermediateResult(EmitKey emitKey, ParseContext parseContext) {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(C4654i.m20181a().m20185m(bArr).m20184l());
            try {
                PipesResult pipesResult = new PipesResult(PipesResult.STATUS.INTERMEDIATE_RESULT, new EmitData(emitKey, Collections.singletonList((Metadata) objectInputStream.readObject())), true);
                objectInputStream.close();
                return pipesResult;
            } finally {
            }
        } catch (ClassNotFoundException e7) {
            LOG.mo26364h("class not found exception deserializing data", e7);
            throw new RuntimeException(e7);
        }
    }

    private void destroyForcibly() {
        boolean isAlive;
        this.process.destroyForcibly();
        this.process.waitFor(10000L, TimeUnit.MILLISECONDS);
        try {
            this.input.close();
        } catch (IOException unused) {
        }
        try {
            this.output.close();
        } catch (IOException unused2) {
        }
        isAlive = this.process.isAlive();
        if (isAlive) {
            LOG.mo26375s("Process still alive after {}ms", 10000L);
        }
    }

    private String[] getCommandline() {
        Path absolutePath;
        String path;
        List<String> forkedJvmArgs = this.pipesConfig.getForkedJvmArgs();
        String str = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        String str2 = null;
        for (String str3 : forkedJvmArgs) {
            if (str3.startsWith("-Djava.awt.headless")) {
                z7 = true;
            }
            if (str3.equals("-cp") || str3.equals("--classpath")) {
                z6 = true;
            }
            if (str3.equals("-XX:+ExitOnOutOfMemoryError") || str3.equals("-XX:+CrashOnOutOfMemoryError")) {
                z8 = true;
            }
            if (str3.startsWith("-Dlog4j.configuration")) {
                z9 = true;
            }
            if (str3.startsWith("-Xloggc:")) {
                str2 = str3.replace("${pipesClientId}", "id-" + this.pipesClientId);
                str = str3;
            }
        }
        if (str != null && str2 != null) {
            forkedJvmArgs.remove(str);
            forkedJvmArgs.add(str2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProcessUtils.escapeCommandLine(this.pipesConfig.getJavaPath()));
        if (!z6) {
            arrayList.add("-cp");
            arrayList.add(System.getProperty("java.class.path"));
        }
        if (!z7) {
            arrayList.add("-Djava.awt.headless=true");
        }
        if (z8) {
            LOG.mo26380x("I notice that you have an exit/crash on OOM. If you run heavy external processes like tesseract, this setting may result in orphaned processes which could be disastrous for performance.");
        }
        if (!z9) {
            arrayList.add("-Dlog4j.configurationFile=classpath:pipes-fork-server-default-log4j2.xml");
        }
        arrayList.add("-DpipesClientId=" + this.pipesClientId);
        arrayList.addAll(forkedJvmArgs);
        arrayList.add("org.apache.tika.pipes.PipesServer");
        absolutePath = this.pipesConfig.getTikaConfig().toAbsolutePath();
        path = absolutePath.toString();
        arrayList.add(ProcessUtils.escapeCommandLine(path));
        arrayList.add(Long.toString(this.pipesConfig.getMaxForEmitBatchBytes()));
        arrayList.add(Long.toString(this.pipesConfig.getTimeoutMillis()));
        arrayList.add(Long.toString(this.pipesConfig.getShutdownClientAfterMillis()));
        LOG.mo26360d("pipesClientId={}: commandline: {}", Integer.valueOf(this.pipesClientId), arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static String getMsg(String str, C5395e c5395e) {
        String m22298h = c5395e.m22298h(StandardCharsets.UTF_8);
        if (StringUtils.isBlank(m22298h)) {
            return str;
        }
        return str + "So far, I've read: >" + m22298h + "<";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ PipesResult lambda$actuallyProcess$0(FetchEmitTuple fetchEmitTuple, long j7, PipesResult[] pipesResultArr) {
        C5395e m22309l = C5395e.m22307o().m22309l();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(m22309l);
        try {
            objectOutputStream.writeObject(fetchEmitTuple);
            objectOutputStream.close();
            byte[] mo22295c = m22309l.mo22295c();
            this.output.write(PipesServer.STATUS.CALL.getByte());
            this.output.writeInt(mo22295c.length);
            this.output.write(mo22295c);
            this.output.flush();
            InterfaceC6304d interfaceC6304d = LOG;
            if (interfaceC6304d.mo26371o()) {
                interfaceC6304d.mo26365i("pipesClientId={}: timer -- write tuple: {} ms", Integer.valueOf(this.pipesClientId), Long.valueOf(System.currentTimeMillis() - j7));
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException("thread interrupt");
            }
            PipesResult readResults = readResults(fetchEmitTuple, j7);
            while (readResults.getStatus().equals(PipesResult.STATUS.INTERMEDIATE_RESULT)) {
                pipesResultArr[0] = readResults;
                readResults = readResults(fetchEmitTuple, j7);
            }
            InterfaceC6304d interfaceC6304d2 = LOG;
            if (interfaceC6304d2.mo26361e()) {
                interfaceC6304d2.mo26374r("finished reading result in {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            if (interfaceC6304d2.mo26371o()) {
                interfaceC6304d2.mo26365i("pipesClientId={}: timer -- read result: {} ms", Integer.valueOf(this.pipesClientId), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            return readResults.getStatus() == PipesResult.STATUS.OOM ? buildFatalResult(readResults, pipesResultArr) : readResults;
        } catch (Throwable th) {
            try {
                objectOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$restart$1(C5395e c5395e) {
        boolean isAlive;
        int read = this.input.read();
        int i7 = 1;
        while (i7 < MAX_BYTES_BEFORE_READY && read != PipesServer.STATUS.READY.getByte()) {
            if (read == -1) {
                int i8 = this.pipesClientId;
                isAlive = this.process.isAlive();
                throw new RuntimeException(getMsg("pipesClientId=" + i8 + ": Couldn't start server -- read EOF before 'ready' byte.\n process isAlive=" + isAlive, c5395e));
            }
            c5395e.write(read);
            read = this.input.read();
            i7++;
        }
        if (i7 < MAX_BYTES_BEFORE_READY) {
            if (c5395e.m22308r() > 0) {
                LOG.mo26369m("pipesClientId={}: From forked process before start byte: {}", Integer.valueOf(this.pipesClientId), c5395e.m22298h(StandardCharsets.UTF_8));
            }
            return 1;
        }
        throw new RuntimeException(getMsg("pipesClientId=" + this.pipesClientId + ": Couldn't start server: read too many bytes before 'ready' byte.\n Make absolutely certain that your logger is not writing to stdout.\n", c5395e));
    }

    private void pauseThenDestroy() {
        try {
            this.process.waitFor(200L, TimeUnit.MILLISECONDS);
        } finally {
            destroyForcibly();
        }
    }

    private boolean ping() {
        boolean isAlive;
        Process process = this.process;
        if (process != null) {
            isAlive = process.isAlive();
            if (isAlive) {
                try {
                    DataOutputStream dataOutputStream = this.output;
                    PipesServer.STATUS status = PipesServer.STATUS.PING;
                    dataOutputStream.write(status.getByte());
                    this.output.flush();
                    if (this.input.read() == status.getByte()) {
                        return true;
                    }
                } catch (IOException unused) {
                }
            }
        }
        return false;
    }

    private PipesResult readMessage(PipesResult.STATUS status) {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        return new PipesResult(status, new String(bArr, StandardCharsets.UTF_8));
    }

    private PipesResult readResults(FetchEmitTuple fetchEmitTuple, long j7) {
        int read = this.input.read();
        long currentTimeMillis = System.currentTimeMillis() - j7;
        try {
            PipesServer.STATUS lookup = PipesServer.STATUS.lookup(read);
            switch (C60001.$SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[lookup.ordinal()]) {
                case 1:
                    LOG.mo26367k("pipesClientId={} oom: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return PipesResult.OOM;
                case 2:
                    LOG.mo26367k("pipesClientId={} server response timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return PipesResult.TIMEOUT;
                case 3:
                    LOG.mo26367k("pipesClientId={} emit exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.EMIT_EXCEPTION);
                case 4:
                    LOG.mo26367k("pipesClientId={} emitter not found: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.NO_EMITTER_FOUND);
                case 5:
                    LOG.mo26367k("pipesClientId={} fetcher not found: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.NO_FETCHER_FOUND);
                case 6:
                    LOG.mo26367k("pipesClientId={} fetcher initialization exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.FETCHER_INITIALIZATION_EXCEPTION);
                case 7:
                    LOG.mo26367k("pipesClientId={} fetch exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.FETCH_EXCEPTION);
                case 8:
                    LOG.mo26376t("pipesClientId={} intermediate success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return deserializeIntermediateResult(fetchEmitTuple.getEmitKey(), fetchEmitTuple.getParseContext());
                case 9:
                    LOG.mo26376t("pipesClientId={} parse success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return deserializeEmitData();
                case 10:
                    return readMessage(PipesResult.STATUS.PARSE_EXCEPTION_NO_EMIT);
                case 11:
                    LOG.mo26376t("pipesClientId={} emit success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return PipesResult.EMIT_SUCCESS;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    return readMessage(PipesResult.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION);
                case 13:
                    return PipesResult.EMPTY_OUTPUT;
                case 14:
                case 15:
                case 16:
                case 17:
                    throw new IOException("Not expecting this status: " + lookup);
                default:
                    throw new IOException("Need to handle procesing for: " + lookup);
            }
        } catch (IllegalArgumentException e7) {
            throw new IOException("problem reading response from server: " + (read > -1 ? String.format(Locale.US, "%02x", Byte.valueOf((byte) read)) : "-1"), e7);
        }
    }

    private void restart() {
        ProcessBuilder.Redirect redirect;
        boolean waitFor;
        if (this.process != null) {
            InterfaceC6304d interfaceC6304d = LOG;
            interfaceC6304d.mo26370n("process still alive; trying to destroy it");
            destroyForcibly();
            Process process = this.process;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            waitFor = process.waitFor(30L, timeUnit);
            if (!waitFor) {
                interfaceC6304d.mo26358b("pipesClientId={}: process has not yet ended", Integer.valueOf(this.pipesClientId));
            }
            this.executorService.shutdownNow();
            if (!this.executorService.awaitTermination(30L, timeUnit)) {
                interfaceC6304d.mo26358b("pipesClientId={}: executorService has not yet shutdown", Integer.valueOf(this.pipesClientId));
            }
            synchronized (this.executorServiceLock) {
                if (this.closed) {
                    throw new IllegalArgumentException("pipesClientId=" + this.pipesClientId + ": PipesClient closed");
                }
                this.executorService = Executors.newFixedThreadPool(1);
            }
            interfaceC6304d.mo26357a("pipesClientId={}: restarting process", Integer.valueOf(this.pipesClientId));
        } else {
            LOG.mo26357a("pipesClientId={}: starting process", Integer.valueOf(this.pipesClientId));
        }
        ProcessBuilder processBuilder = new ProcessBuilder(getCommandline());
        redirect = ProcessBuilder.Redirect.INHERIT;
        processBuilder.redirectError(redirect);
        try {
            this.process = processBuilder.start();
            this.input = new DataInputStream(this.process.getInputStream());
            this.output = new DataOutputStream(this.process.getOutputStream());
            final C5395e m22309l = C5395e.m22307o().m22309l();
            FutureTask futureTask = new FutureTask(new Callable() { // from class: org.apache.tika.pipes.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Integer lambda$restart$1;
                    lambda$restart$1 = PipesClient.this.lambda$restart$1(m22309l);
                    return lambda$restart$1;
                }
            });
            long currentTimeMillis = System.currentTimeMillis();
            this.executorService.submit(futureTask);
            try {
                try {
                    try {
                        futureTask.get(this.pipesConfig.getStartupTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } finally {
                        futureTask.cancel(true);
                    }
                } catch (InterruptedException e7) {
                    destroyForcibly();
                    throw e7;
                }
            } catch (ExecutionException e8) {
                LOG.mo26364h("pipesClientId=" + this.pipesClientId + ": couldn't start server", e8);
                destroyForcibly();
                throw new RuntimeException(e8);
            } catch (TimeoutException e9) {
                LOG.mo26373q("pipesClientId={} didn't receive ready byte from server within StartupTimeoutMillis {}; ms elapsed {}; did read >{}<", Integer.valueOf(this.pipesClientId), Long.valueOf(this.pipesConfig.getStartupTimeoutMillis()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), m22309l.m22298h(StandardCharsets.UTF_8));
                destroyForcibly();
                throw e9;
            }
        } catch (Exception e10) {
            LOG.mo26364h("failed to start client", e10);
            throw new FailedToStartClientException(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.process != null) {
            try {
                destroyForcibly();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.executorServiceLock) {
            try {
                ExecutorService executorService = this.executorService;
                if (executorService != null) {
                    executorService.shutdownNow();
                }
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getFilesProcessed() {
        return this.filesProcessed;
    }

    public PipesResult process(FetchEmitTuple fetchEmitTuple) {
        if (ping()) {
            if (this.pipesConfig.getMaxFilesProcessedPerProcess() > 0 && this.filesProcessed >= this.pipesConfig.getMaxFilesProcessedPerProcess()) {
                LOG.mo26382z("pipesClientId={}: restarting server after hitting max files: {}", Integer.valueOf(this.pipesClientId), Integer.valueOf(this.filesProcessed));
            }
            return actuallyProcess(fetchEmitTuple);
        }
        boolean z6 = false;
        while (!z6) {
            try {
                restart();
                z6 = true;
            } catch (TimeoutException unused) {
                LOG.mo26369m("pipesClientId={}: couldn't restart within {} ms (startupTimeoutMillis)", Integer.valueOf(this.pipesClientId), Long.valueOf(this.pipesConfig.getStartupTimeoutMillis()));
                Thread.sleep(this.pipesConfig.getSleepOnStartupTimeoutMillis());
            }
        }
        return actuallyProcess(fetchEmitTuple);
    }
}
