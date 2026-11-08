package p108P2;

/* renamed from: P2.M3 */
/* loaded from: classes.dex */
public final class RunnableC1550M3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4819a;

    /* renamed from: b */
    public final /* synthetic */ String f4820b;

    /* renamed from: c */
    public final /* synthetic */ String f4821c;

    /* renamed from: d */
    public final /* synthetic */ long f4822d;

    /* renamed from: e */
    public final /* synthetic */ BinderC1699e4 f4823e;

    public RunnableC1550M3(BinderC1699e4 binderC1699e4, String str, String str2, String str3, long j7) {
        this.f4819a = str;
        this.f4820b = str2;
        this.f4821c = str3;
        this.f4822d = j7;
        this.f4823e = binderC1699e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        String str = this.f4819a;
        if (str == null) {
            BinderC1699e4 binderC1699e4 = this.f4823e;
            String str2 = this.f4820b;
            c1828s72 = binderC1699e4.f5111a;
            c1828s72.m6342i0(str2, null);
            return;
        }
        C1462C5 c1462c5 = new C1462C5(this.f4821c, str, this.f4822d);
        BinderC1699e4 binderC1699e42 = this.f4823e;
        String str3 = this.f4820b;
        c1828s7 = binderC1699e42.f5111a;
        c1828s7.m6342i0(str3, c1462c5);
    }
}
