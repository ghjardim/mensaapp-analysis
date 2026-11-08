package p108P2;

/* renamed from: P2.Z3 */
/* loaded from: classes.dex */
public final class RunnableC1654Z3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1519J f5018a;

    /* renamed from: b */
    public final /* synthetic */ String f5019b;

    /* renamed from: c */
    public final /* synthetic */ BinderC1699e4 f5020c;

    public RunnableC1654Z3(BinderC1699e4 binderC1699e4, C1519J c1519j, String str) {
        this.f5018a = c1519j;
        this.f5019b = str;
        this.f5020c = binderC1699e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f5020c;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        c1828s72.m6368y(this.f5018a, this.f5019b);
    }
}
