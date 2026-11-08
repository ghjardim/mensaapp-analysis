package p256j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Supplier;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.b */
/* loaded from: classes3.dex */
abstract class AbstractC5168b implements InterfaceC5204h {

    /* renamed from: a */
    private final AbstractC5168b f18536a;

    /* renamed from: b */
    private final AbstractC5168b f18537b;

    /* renamed from: c */
    protected final int f18538c;

    /* renamed from: d */
    private AbstractC5168b f18539d;

    /* renamed from: e */
    private int f18540e;

    /* renamed from: f */
    private int f18541f;

    /* renamed from: g */
    private Spliterator f18542g;

    /* renamed from: h */
    private boolean f18543h;

    /* renamed from: i */
    private boolean f18544i;

    /* renamed from: j */
    private Runnable f18545j;

    /* renamed from: k */
    private boolean f18546k;

    /* renamed from: F */
    abstract InterfaceC5094M0 mo21429F(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6, IntFunction intFunction);

    /* renamed from: H */
    abstract boolean mo21430H(Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2);

    /* renamed from: I */
    abstract EnumC5202g3 mo21431I();

    /* renamed from: N */
    abstract InterfaceC5054E0 mo21432N(long j7, IntFunction intFunction);

    /* renamed from: Q */
    abstract boolean mo21367Q();

    /* renamed from: R */
    abstract InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2);

    /* renamed from: U */
    abstract Spliterator mo21433U(AbstractC5168b abstractC5168b, Supplier supplier, boolean z6);

    AbstractC5168b(Spliterator spliterator, int i7, boolean z6) {
        this.f18537b = null;
        this.f18542g = spliterator;
        this.f18536a = this;
        int i8 = EnumC5196f3.f18579g & i7;
        this.f18538c = i8;
        this.f18541f = (~(i8 << 1)) & EnumC5196f3.f18584l;
        this.f18540e = 0;
        this.f18546k = z6;
    }

    AbstractC5168b(AbstractC5168b abstractC5168b, int i7) {
        if (abstractC5168b.f18543h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC5168b.f18543h = true;
        abstractC5168b.f18539d = this;
        this.f18537b = abstractC5168b;
        this.f18538c = EnumC5196f3.f18580h & i7;
        this.f18541f = EnumC5196f3.m21552l(i7, abstractC5168b.f18541f);
        AbstractC5168b abstractC5168b2 = abstractC5168b.f18536a;
        this.f18536a = abstractC5168b2;
        if (mo21367Q()) {
            abstractC5168b2.f18544i = true;
        }
        this.f18540e = abstractC5168b.f18540e + 1;
    }

    /* renamed from: D */
    final Object m21516D(InterfaceC5092L3 interfaceC5092L3) {
        if (this.f18543h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f18543h = true;
        if (this.f18536a.f18546k) {
            return interfaceC5092L3.mo21423c(this, m21512S(interfaceC5092L3.mo21424d()));
        }
        return interfaceC5092L3.mo21422b(this, m21512S(interfaceC5092L3.mo21424d()));
    }

    /* renamed from: E */
    final InterfaceC5094M0 m21517E(IntFunction intFunction) {
        AbstractC5168b abstractC5168b;
        if (this.f18543h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f18543h = true;
        if (this.f18536a.f18546k && (abstractC5168b = this.f18537b) != null && mo21367Q()) {
            this.f18540e = 0;
            return mo21471O(abstractC5168b, abstractC5168b.m21512S(0), intFunction);
        }
        return m21515C(m21512S(0), true, intFunction);
    }

    /* renamed from: T */
    final Spliterator m21523T() {
        AbstractC5168b abstractC5168b = this.f18536a;
        if (this != abstractC5168b) {
            throw new IllegalStateException();
        }
        if (this.f18543h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f18543h = true;
        Spliterator spliterator = abstractC5168b.f18542g;
        if (spliterator != null) {
            abstractC5168b.f18542g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final InterfaceC5204h sequential() {
        this.f18536a.f18546k = false;
        return this;
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final InterfaceC5204h parallel() {
        this.f18536a.f18546k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f18543h = true;
        this.f18542g = null;
        AbstractC5168b abstractC5168b = this.f18536a;
        Runnable runnable = abstractC5168b.f18545j;
        if (runnable != null) {
            abstractC5168b.f18545j = null;
            runnable.run();
        }
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final InterfaceC5204h onClose(Runnable runnable) {
        if (this.f18543h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC5168b abstractC5168b = this.f18536a;
        Runnable runnable2 = abstractC5168b.f18545j;
        if (runnable2 != null) {
            runnable = new RunnableC5087K3(runnable2, runnable);
        }
        abstractC5168b.f18545j = runnable;
        return this;
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public Spliterator spliterator() {
        if (this.f18543h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f18543h = true;
        AbstractC5168b abstractC5168b = this.f18536a;
        if (this == abstractC5168b) {
            Spliterator spliterator = abstractC5168b.f18542g;
            if (spliterator != null) {
                abstractC5168b.f18542g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return mo21433U(this, new C5162a(0, this), abstractC5168b.f18546k);
    }

    /* renamed from: M */
    final /* synthetic */ Spliterator m21522M() {
        return m21512S(0);
    }

    /* renamed from: C */
    final InterfaceC5094M0 m21515C(Spliterator spliterator, boolean z6, IntFunction intFunction) {
        if (this.f18536a.f18546k) {
            return mo21429F(this, spliterator, z6, intFunction);
        }
        InterfaceC5054E0 mo21432N = mo21432N(m21518G(spliterator), intFunction);
        m21524V(spliterator, mo21432N);
        return mo21432N.mo21444a();
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final boolean isParallel() {
        return this.f18536a.f18546k;
    }

    /* renamed from: S */
    private Spliterator m21512S(int i7) {
        int i8;
        int i9;
        AbstractC5168b abstractC5168b = this.f18536a;
        Spliterator spliterator = abstractC5168b.f18542g;
        if (spliterator != null) {
            abstractC5168b.f18542g = null;
            if (abstractC5168b.f18546k && abstractC5168b.f18544i) {
                AbstractC5168b abstractC5168b2 = abstractC5168b.f18539d;
                int i10 = 1;
                while (abstractC5168b != this) {
                    int i11 = abstractC5168b2.f18538c;
                    if (abstractC5168b2.mo21367Q()) {
                        if (EnumC5196f3.SHORT_CIRCUIT.m21557o(i11)) {
                            i11 &= ~EnumC5196f3.f18593u;
                        }
                        spliterator = abstractC5168b2.mo21489P(abstractC5168b, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i8 = (~EnumC5196f3.f18592t) & i11;
                            i9 = EnumC5196f3.f18591s;
                        } else {
                            i8 = (~EnumC5196f3.f18591s) & i11;
                            i9 = EnumC5196f3.f18592t;
                        }
                        i11 = i8 | i9;
                        i10 = 0;
                    }
                    abstractC5168b2.f18540e = i10;
                    abstractC5168b2.f18541f = EnumC5196f3.m21552l(i11, abstractC5168b.f18541f);
                    i10++;
                    AbstractC5168b abstractC5168b3 = abstractC5168b2;
                    abstractC5168b2 = abstractC5168b2.f18539d;
                    abstractC5168b = abstractC5168b3;
                }
            }
            if (i7 != 0) {
                this.f18541f = EnumC5196f3.m21552l(i7, this.f18541f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* renamed from: J */
    final EnumC5202g3 m21519J() {
        AbstractC5168b abstractC5168b = this;
        while (abstractC5168b.f18540e > 0) {
            abstractC5168b = abstractC5168b.f18537b;
        }
        return abstractC5168b.mo21431I();
    }

    /* renamed from: G */
    final long m21518G(Spliterator spliterator) {
        if (EnumC5196f3.SIZED.m21557o(this.f18541f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* renamed from: V */
    final InterfaceC5264r2 m21524V(Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2) {
        m21513A(spliterator, m21525W((InterfaceC5264r2) Objects.requireNonNull(interfaceC5264r2)));
        return interfaceC5264r2;
    }

    /* renamed from: A */
    final void m21513A(Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2) {
        Objects.requireNonNull(interfaceC5264r2);
        if (!EnumC5196f3.SHORT_CIRCUIT.m21557o(this.f18541f)) {
            interfaceC5264r2.mo21460l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC5264r2);
            interfaceC5264r2.mo21459k();
            return;
        }
        m21514B(spliterator, interfaceC5264r2);
    }

    /* renamed from: B */
    final boolean m21514B(Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2) {
        AbstractC5168b abstractC5168b = this;
        while (abstractC5168b.f18540e > 0) {
            abstractC5168b = abstractC5168b.f18537b;
        }
        interfaceC5264r2.mo21460l(spliterator.getExactSizeIfKnown());
        boolean mo21430H = abstractC5168b.mo21430H(spliterator, interfaceC5264r2);
        interfaceC5264r2.mo21459k();
        return mo21430H;
    }

    /* renamed from: K */
    final int m21520K() {
        return this.f18541f;
    }

    /* renamed from: L */
    final boolean m21521L() {
        return EnumC5196f3.ORDERED.m21557o(this.f18541f);
    }

    /* renamed from: W */
    final InterfaceC5264r2 m21525W(InterfaceC5264r2 interfaceC5264r2) {
        Objects.requireNonNull(interfaceC5264r2);
        AbstractC5168b abstractC5168b = this;
        while (abstractC5168b.f18540e > 0) {
            AbstractC5168b abstractC5168b2 = abstractC5168b.f18537b;
            interfaceC5264r2 = abstractC5168b.mo21472R(abstractC5168b2.f18541f, interfaceC5264r2);
            abstractC5168b = abstractC5168b2;
        }
        return interfaceC5264r2;
    }

    /* renamed from: X */
    final Spliterator m21526X(Spliterator spliterator) {
        return this.f18540e == 0 ? spliterator : mo21433U(this, new C5162a(6, spliterator), this.f18536a.f18546k);
    }

    /* renamed from: O */
    InterfaceC5094M0 mo21471O(AbstractC5168b abstractC5168b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* renamed from: P */
    Spliterator mo21489P(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        return mo21471O(abstractC5168b, spliterator, new C5251p(15)).spliterator();
    }
}
