package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p256j$.util.Spliterator;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.util.stream.S */
/* loaded from: classes3.dex */
final class C5122S extends CountedCompleter {

    /* renamed from: a */
    private final AbstractC5168b f18468a;

    /* renamed from: b */
    private Spliterator f18469b;

    /* renamed from: c */
    private final long f18470c;

    /* renamed from: d */
    private final ConcurrentHashMap f18471d;

    /* renamed from: e */
    private final AbstractC5113Q f18472e;

    /* renamed from: f */
    private final C5122S f18473f;

    /* renamed from: g */
    private InterfaceC5094M0 f18474g;

    protected C5122S(AbstractC5168b abstractC5168b, Spliterator spliterator, AbstractC5113Q abstractC5113Q) {
        super(null);
        this.f18468a = abstractC5168b;
        this.f18469b = spliterator;
        this.f18470c = AbstractC5186e.m21547g(spliterator.estimateSize());
        this.f18471d = new ConcurrentHashMap(Math.max(16, AbstractC5186e.m21546b() << 1));
        this.f18472e = abstractC5113Q;
        this.f18473f = null;
    }

    C5122S(C5122S c5122s, Spliterator spliterator, C5122S c5122s2) {
        super(c5122s);
        this.f18468a = c5122s.f18468a;
        this.f18469b = spliterator;
        this.f18470c = c5122s.f18470c;
        this.f18471d = c5122s.f18471d;
        this.f18472e = c5122s.f18472e;
        this.f18473f = c5122s2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18469b;
        long j7 = this.f18470c;
        boolean z6 = false;
        C5122S c5122s = this;
        while (spliterator.estimateSize() > j7 && (trySplit = spliterator.trySplit()) != null) {
            C5122S c5122s2 = new C5122S(c5122s, trySplit, c5122s.f18473f);
            C5122S c5122s3 = new C5122S(c5122s, spliterator, c5122s2);
            c5122s.addToPendingCount(1);
            c5122s3.addToPendingCount(1);
            c5122s.f18471d.put(c5122s2, c5122s3);
            if (c5122s.f18473f != null) {
                c5122s2.addToPendingCount(1);
                if (c5122s.f18471d.replace(c5122s.f18473f, c5122s, c5122s2)) {
                    c5122s.addToPendingCount(-1);
                } else {
                    c5122s2.addToPendingCount(-1);
                }
            }
            if (z6) {
                spliterator = trySplit;
                c5122s = c5122s2;
                c5122s2 = c5122s3;
            } else {
                c5122s = c5122s3;
            }
            z6 = !z6;
            c5122s2.fork();
        }
        if (c5122s.getPendingCount() > 0) {
            C5261r c5261r = new C5261r(5);
            AbstractC5168b abstractC5168b = c5122s.f18468a;
            InterfaceC5054E0 mo21432N = abstractC5168b.mo21432N(abstractC5168b.m21518G(spliterator), c5261r);
            c5122s.f18468a.m21524V(spliterator, mo21432N);
            c5122s.f18474g = mo21432N.mo21444a();
            c5122s.f18469b = null;
        }
        c5122s.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC5094M0 interfaceC5094M0 = this.f18474g;
        if (interfaceC5094M0 != null) {
            interfaceC5094M0.forEach(this.f18472e);
            this.f18474g = null;
        } else {
            Spliterator spliterator = this.f18469b;
            if (spliterator != null) {
                this.f18468a.m21524V(spliterator, this.f18472e);
                this.f18469b = null;
            }
        }
        C5122S c5122s = (C5122S) this.f18471d.remove(this);
        if (c5122s != null) {
            c5122s.tryComplete();
        }
    }
}
