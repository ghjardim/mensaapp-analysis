package p284m0;

/* renamed from: m0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5553a {

    /* renamed from: a */
    public int f20062a;

    /* renamed from: i */
    public final void m23272i(int i7) {
        this.f20062a = i7 | this.f20062a;
    }

    /* renamed from: j */
    public void mo19253j() {
        this.f20062a = 0;
    }

    /* renamed from: k */
    public final boolean m23273k(int i7) {
        return (this.f20062a & i7) == i7;
    }

    /* renamed from: l */
    public final boolean m23274l() {
        return m23273k(268435456);
    }

    /* renamed from: m */
    public final boolean m23275m() {
        return m23273k(4);
    }

    /* renamed from: n */
    public final boolean m23276n() {
        return m23273k(134217728);
    }

    /* renamed from: o */
    public final boolean m23277o() {
        return m23273k(1);
    }

    /* renamed from: p */
    public final boolean m23278p() {
        return m23273k(536870912);
    }

    /* renamed from: q */
    public final void m23279q(int i7) {
        this.f20062a = i7;
    }
}
