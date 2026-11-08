package p108P2;

/* renamed from: P2.d7 */
/* loaded from: classes.dex */
public abstract class AbstractC1693d7 extends AbstractC1625V6 {

    /* renamed from: c */
    public boolean f5108c;

    public AbstractC1693d7(C1828s7 c1828s7) {
        super(c1828s7);
        this.f4967b.m6332c0();
    }

    /* renamed from: i */
    public final void m6015i() {
        if (!m6017k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m6016j() {
        if (this.f5108c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo5961l();
        this.f4967b.m6294A();
        this.f5108c = true;
    }

    /* renamed from: k */
    public final boolean m6017k() {
        return this.f5108c;
    }

    /* renamed from: l */
    public abstract boolean mo5961l();
}
