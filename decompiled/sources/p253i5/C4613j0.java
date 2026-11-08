package p253i5;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p237g5.AbstractC4420V;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: i5.j0 */
/* loaded from: classes2.dex */
public final class C4613j0 extends AbstractC4569M {

    /* renamed from: c */
    public static final ReferenceQueue f17046c = new ReferenceQueue();

    /* renamed from: d */
    public static final ConcurrentMap f17047d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final Logger f17048e = Logger.getLogger(C4613j0.class.getName());

    /* renamed from: b */
    public final a f17049b;

    /* renamed from: i5.j0$a */
    public static final class a extends WeakReference {

        /* renamed from: f */
        public static final boolean f17050f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g */
        public static final RuntimeException f17051g = m19996e();

        /* renamed from: a */
        public final ReferenceQueue f17052a;

        /* renamed from: b */
        public final ConcurrentMap f17053b;

        /* renamed from: c */
        public final String f17054c;

        /* renamed from: d */
        public final Reference f17055d;

        /* renamed from: e */
        public final AtomicBoolean f17056e;

        public a(C4613j0 c4613j0, AbstractC4420V abstractC4420V, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
            super(c4613j0, referenceQueue);
            this.f17056e = new AtomicBoolean();
            this.f17055d = new SoftReference(f17050f ? new RuntimeException("ManagedChannel allocation site") : f17051g);
            this.f17054c = abstractC4420V.toString();
            this.f17052a = referenceQueue;
            this.f17053b = concurrentMap;
            concurrentMap.put(this, this);
            m19995b(referenceQueue);
        }

        /* renamed from: b */
        public static int m19995b(ReferenceQueue referenceQueue) {
            int i7 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i7;
                }
                RuntimeException runtimeException = (RuntimeException) aVar.f17055d.get();
                aVar.m19997c();
                if (!aVar.f17056e.get()) {
                    i7++;
                    Level level = Level.SEVERE;
                    if (C4613j0.f17048e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(C4613j0.f17048e.getName());
                        logRecord.setParameters(new Object[]{aVar.f17054c});
                        logRecord.setThrown(runtimeException);
                        C4613j0.f17048e.log(logRecord);
                    }
                }
            }
        }

        /* renamed from: e */
        public static RuntimeException m19996e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        /* renamed from: c */
        public final void m19997c() {
            super.clear();
            this.f17053b.remove(this);
            this.f17055d.clear();
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            m19997c();
            m19995b(this.f17052a);
        }

        /* renamed from: d */
        public final void m19998d() {
            if (this.f17056e.getAndSet(true)) {
                return;
            }
            clear();
        }
    }

    public C4613j0(AbstractC4420V abstractC4420V) {
        this(abstractC4420V, f17046c, f17047d);
    }

    @Override // p253i5.AbstractC4569M, p237g5.AbstractC4420V
    /* renamed from: n */
    public AbstractC4420V mo18753n() {
        this.f17049b.m19998d();
        return super.mo18753n();
    }

    @Override // p253i5.AbstractC4569M, p237g5.AbstractC4420V
    /* renamed from: o */
    public AbstractC4420V mo18754o() {
        this.f17049b.m19998d();
        return super.mo18754o();
    }

    public C4613j0(AbstractC4420V abstractC4420V, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(abstractC4420V);
        this.f17049b = new a(this, abstractC4420V, referenceQueue, concurrentMap);
    }
}
