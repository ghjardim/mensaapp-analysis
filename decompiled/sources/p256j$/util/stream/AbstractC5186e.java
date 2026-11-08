package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.e */
/* loaded from: classes3.dex */
abstract class AbstractC5186e extends CountedCompleter {

    /* renamed from: g */
    private static final int f18562g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a */
    protected final AbstractC5168b f18563a;

    /* renamed from: b */
    protected Spliterator f18564b;

    /* renamed from: c */
    protected long f18565c;

    /* renamed from: d */
    protected AbstractC5186e f18566d;

    /* renamed from: e */
    protected AbstractC5186e f18567e;

    /* renamed from: f */
    private Object f18568f;

    /* renamed from: a */
    protected abstract Object mo21447a();

    /* renamed from: e */
    protected abstract AbstractC5186e mo21448e(Spliterator spliterator);

    protected AbstractC5186e(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        super(null);
        this.f18563a = abstractC5168b;
        this.f18564b = spliterator;
        this.f18565c = 0L;
    }

    protected AbstractC5186e(AbstractC5186e abstractC5186e, Spliterator spliterator) {
        super(abstractC5186e);
        this.f18564b = spliterator;
        this.f18563a = abstractC5186e.f18563a;
        this.f18565c = abstractC5186e.f18565c;
    }

    /* renamed from: b */
    public static int m21546b() {
        return f18562g;
    }

    /* renamed from: g */
    public static long m21547g(long j7) {
        long j8 = j7 / f18562g;
        if (j8 > 0) {
            return j8;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f18568f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    protected Object mo21539c() {
        return this.f18568f;
    }

    /* renamed from: f */
    protected void mo21540f(Object obj) {
        this.f18568f = obj;
    }

    /* renamed from: d */
    protected final boolean m21548d() {
        return ((AbstractC5186e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18564b;
        long estimateSize = spliterator.estimateSize();
        long j7 = this.f18565c;
        if (j7 == 0) {
            j7 = m21547g(estimateSize);
            this.f18565c = j7;
        }
        boolean z6 = false;
        AbstractC5186e abstractC5186e = this;
        while (estimateSize > j7 && (trySplit = spliterator.trySplit()) != null) {
            AbstractC5186e mo21448e = abstractC5186e.mo21448e(trySplit);
            abstractC5186e.f18566d = mo21448e;
            AbstractC5186e mo21448e2 = abstractC5186e.mo21448e(spliterator);
            abstractC5186e.f18567e = mo21448e2;
            abstractC5186e.setPendingCount(1);
            if (z6) {
                spliterator = trySplit;
                abstractC5186e = mo21448e;
                mo21448e = mo21448e2;
            } else {
                abstractC5186e = mo21448e2;
            }
            z6 = !z6;
            mo21448e.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC5186e.mo21540f(abstractC5186e.mo21447a());
        abstractC5186e.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f18564b = null;
        this.f18567e = null;
        this.f18566d = null;
    }
}
