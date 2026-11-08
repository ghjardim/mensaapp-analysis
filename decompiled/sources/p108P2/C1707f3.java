package p108P2;

import p045G2.C0384e;
import p045G2.C0385f;

/* renamed from: P2.f3 */
/* loaded from: classes.dex */
public final class C1707f3 {

    /* renamed from: a */
    public final C1460C3 f5128a;

    public C1707f3(C1828s7 c1828s7) {
        this.f5128a = c1828s7.m6315M0();
    }

    /* renamed from: a */
    public final boolean m6069a() {
        try {
            C1460C3 c1460c3 = this.f5128a;
            C0384e m1578a = C0385f.m1578a(c1460c3.mo5625c());
            if (m1578a != null) {
                return m1578a.m1575e("com.android.vending", 128).versionCode >= 80837300;
            }
            c1460c3.mo5624b().m5940v().m5902a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e7) {
            this.f5128a.mo5624b().m5940v().m5903b("Failed to retrieve Play Store version for Install Referrer", e7);
            return false;
        }
    }
}
