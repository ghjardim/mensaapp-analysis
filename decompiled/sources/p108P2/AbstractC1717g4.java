package p108P2;

/* renamed from: P2.g4 */
/* loaded from: classes.dex */
public abstract class AbstractC1717g4 extends AbstractC1708f4 {

    /* renamed from: b */
    public boolean f5134b;

    public AbstractC1717g4(C1460C3 c1460c3) {
        super(c1460c3);
        this.f5129a.m5630j();
    }

    /* renamed from: j */
    public abstract boolean mo5654j();

    /* renamed from: k */
    public final void m6078k() {
        if (!m6081n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void m6079l() {
        if (this.f5134b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo5654j()) {
            return;
        }
        this.f5129a.m5629i();
        this.f5134b = true;
    }

    /* renamed from: m */
    public final void m6080m() {
        if (this.f5134b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo5717i();
        this.f5129a.m5629i();
        this.f5134b = true;
    }

    /* renamed from: n */
    public final boolean m6081n() {
        return this.f5134b;
    }

    /* renamed from: i */
    public void mo5717i() {
    }
}
