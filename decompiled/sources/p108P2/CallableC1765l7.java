package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.Callable;

/* renamed from: P2.l7 */
/* loaded from: classes.dex */
public final class CallableC1765l7 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5227a;

    /* renamed from: b */
    public final /* synthetic */ C1828s7 f5228b;

    public CallableC1765l7(C1828s7 c1828s7, C1482E7 c1482e7) {
        this.f5227a = c1482e7;
        this.f5228b = c1828s7;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1482E7 c1482e7 = this.f5227a;
        String str = (String) AbstractC3802r.m15129k(c1482e7.f4640a);
        C1828s7 c1828s7 = this.f5228b;
        C1771m4 m6317N0 = c1828s7.m6317N0(str);
        EnumC1762l4 enumC1762l4 = EnumC1762l4.ANALYTICS_STORAGE;
        if (m6317N0.m6115r(enumC1762l4) && C1771m4.m6103k(c1482e7.f4627B, 100).m6115r(enumC1762l4)) {
            return c1828s7.m6297B0(c1482e7).m5818d();
        }
        c1828s7.mo5624b().m5940v().m5902a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
