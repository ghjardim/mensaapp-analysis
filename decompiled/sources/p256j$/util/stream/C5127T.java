package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.T */
/* loaded from: classes3.dex */
final class C5127T extends CountedCompleter {

    /* renamed from: a */
    private Spliterator f18488a;

    /* renamed from: b */
    private final InterfaceC5264r2 f18489b;

    /* renamed from: c */
    private final AbstractC5168b f18490c;

    /* renamed from: d */
    private long f18491d;

    C5127T(AbstractC5168b abstractC5168b, Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2) {
        super(null);
        this.f18489b = interfaceC5264r2;
        this.f18490c = abstractC5168b;
        this.f18488a = spliterator;
        this.f18491d = 0L;
    }

    C5127T(C5127T c5127t, Spliterator spliterator) {
        super(c5127t);
        this.f18488a = spliterator;
        this.f18489b = c5127t.f18489b;
        this.f18491d = c5127t.f18491d;
        this.f18490c = c5127t.f18490c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18488a;
        long estimateSize = spliterator.estimateSize();
        long j7 = this.f18491d;
        if (j7 == 0) {
            j7 = AbstractC5186e.m21547g(estimateSize);
            this.f18491d = j7;
        }
        boolean m21557o = EnumC5196f3.SHORT_CIRCUIT.m21557o(this.f18490c.m21520K());
        InterfaceC5264r2 interfaceC5264r2 = this.f18489b;
        boolean z6 = false;
        C5127T c5127t = this;
        while (true) {
            if (m21557o && interfaceC5264r2.mo21455n()) {
                break;
            }
            if (estimateSize <= j7 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            C5127T c5127t2 = new C5127T(c5127t, trySplit);
            c5127t.addToPendingCount(1);
            if (z6) {
                spliterator = trySplit;
            } else {
                C5127T c5127t3 = c5127t;
                c5127t = c5127t2;
                c5127t2 = c5127t3;
            }
            z6 = !z6;
            c5127t.fork();
            c5127t = c5127t2;
            estimateSize = spliterator.estimateSize();
        }
        c5127t.f18490c.m21513A(spliterator, interfaceC5264r2);
        c5127t.f18488a = null;
        c5127t.propagateCompletion();
    }
}
