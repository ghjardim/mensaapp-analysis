package p108P2;

/* renamed from: P2.A6 */
/* loaded from: classes.dex */
public final class RunnableC1445A6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1828s7 f4511a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f4512b;

    public RunnableC1445A6(C1463C6 c1463c6, C1828s7 c1828s7, Runnable runnable) {
        this.f4511a = c1828s7;
        this.f4512b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1828s7 c1828s7 = this.f4511a;
        c1828s7.m6352q();
        c1828s7.m6350p(this.f4512b);
        c1828s7.m6357s0();
    }
}
