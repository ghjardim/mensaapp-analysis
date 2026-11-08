package p108P2;

/* renamed from: P2.h2 */
/* loaded from: classes.dex */
public abstract class AbstractC1724h2 extends AbstractC1494G1 {

    /* renamed from: b */
    public boolean f5145b;

    public AbstractC1724h2(C1460C3 c1460c3) {
        super(c1460c3);
        this.f5129a.m5630j();
    }

    /* renamed from: i */
    public final void m6082i() {
        if (!m6085m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m6083j() {
        if (this.f5145b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo5563n()) {
            return;
        }
        this.f5129a.m5629i();
        this.f5145b = true;
    }

    /* renamed from: k */
    public final void m6084k() {
        if (this.f5145b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo5562l();
        this.f5129a.m5629i();
        this.f5145b = true;
    }

    /* renamed from: m */
    public final boolean m6085m() {
        return this.f5145b;
    }

    /* renamed from: n */
    public abstract boolean mo5563n();

    /* renamed from: l */
    public void mo5562l() {
    }
}
