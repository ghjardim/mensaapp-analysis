package p256j$.util.stream;

import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import p256j$.util.AbstractC4994d;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.h3 */
/* loaded from: classes3.dex */
abstract class AbstractC5208h3 implements Spliterator {

    /* renamed from: a */
    final boolean f18609a;

    /* renamed from: b */
    final AbstractC5168b f18610b;

    /* renamed from: c */
    private Supplier f18611c;

    /* renamed from: d */
    Spliterator f18612d;

    /* renamed from: e */
    InterfaceC5264r2 f18613e;

    /* renamed from: f */
    BooleanSupplier f18614f;

    /* renamed from: g */
    long f18615g;

    /* renamed from: h */
    AbstractC5180d f18616h;

    /* renamed from: i */
    boolean f18617i;

    /* renamed from: d */
    abstract void mo21473d();

    /* renamed from: e */
    abstract AbstractC5208h3 mo21474e(Spliterator spliterator);

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    AbstractC5208h3(AbstractC5168b abstractC5168b, Supplier supplier, boolean z6) {
        this.f18610b = abstractC5168b;
        this.f18611c = supplier;
        this.f18612d = null;
        this.f18609a = z6;
    }

    AbstractC5208h3(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6) {
        this.f18610b = abstractC5168b;
        this.f18611c = null;
        this.f18612d = spliterator;
        this.f18609a = z6;
    }

    /* renamed from: c */
    final void m21564c() {
        if (this.f18612d == null) {
            this.f18612d = (Spliterator) this.f18611c.get();
            this.f18611c = null;
        }
    }

    /* renamed from: a */
    final boolean m21563a() {
        AbstractC5180d abstractC5180d = this.f18616h;
        if (abstractC5180d == null) {
            if (this.f18617i) {
                return false;
            }
            m21564c();
            mo21473d();
            this.f18615g = 0L;
            this.f18613e.mo21460l(this.f18612d.getExactSizeIfKnown());
            return m21562b();
        }
        long j7 = this.f18615g + 1;
        this.f18615g = j7;
        boolean z6 = j7 < abstractC5180d.count();
        if (z6) {
            return z6;
        }
        this.f18615g = 0L;
        this.f18616h.clear();
        return m21562b();
    }

    @Override // p256j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f18609a || this.f18616h != null || this.f18617i) {
            return null;
        }
        m21564c();
        Spliterator trySplit = this.f18612d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return mo21474e(trySplit);
    }

    /* renamed from: b */
    private boolean m21562b() {
        while (this.f18616h.count() == 0) {
            if (this.f18613e.mo21455n() || !this.f18614f.getAsBoolean()) {
                if (this.f18617i) {
                    return false;
                }
                this.f18613e.mo21459k();
                this.f18617i = true;
            }
        }
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        m21564c();
        return this.f18612d.estimateSize();
    }

    @Override // p256j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        m21564c();
        if (EnumC5196f3.SIZED.m21557o(this.f18610b.m21520K())) {
            return this.f18612d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        m21564c();
        int m21556z = EnumC5196f3.m21556z(this.f18610b.m21520K()) & EnumC5196f3.f18578f;
        return (m21556z & 64) != 0 ? (m21556z & (-16449)) | (this.f18612d.characteristics() & 16448) : m21556z;
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC4994d.m21347e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f18612d);
    }
}
