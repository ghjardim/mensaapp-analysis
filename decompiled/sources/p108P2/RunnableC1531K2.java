package p108P2;

import android.util.Log;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: P2.K2 */
/* loaded from: classes.dex */
public final class RunnableC1531K2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4784a;

    /* renamed from: b */
    public final /* synthetic */ String f4785b;

    /* renamed from: c */
    public final /* synthetic */ Object f4786c;

    /* renamed from: d */
    public final /* synthetic */ Object f4787d;

    /* renamed from: e */
    public final /* synthetic */ Object f4788e;

    /* renamed from: f */
    public final /* synthetic */ C1558N2 f4789f;

    public RunnableC1531K2(C1558N2 c1558n2, int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f4784a = i7;
        this.f4785b = str;
        this.f4786c = obj;
        this.f4787d = obj2;
        this.f4788e = obj3;
        this.f4789f = c1558n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c7;
        long j7;
        char c8;
        long j8;
        C1558N2 c1558n2 = this.f4789f;
        C1680c3 m5611H = c1558n2.f5129a.m5611H();
        if (!m5611H.m6081n()) {
            Log.println(6, c1558n2.m5933D(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c7 = c1558n2.f4834c;
        if (c7 == 0) {
            C1460C3 c1460c3 = c1558n2.f5129a;
            if (c1460c3.m5605B().m6144l()) {
                c1460c3.mo5623a();
                c1558n2.f4834c = 'C';
            } else {
                c1460c3.mo5623a();
                c1558n2.f4834c = 'c';
            }
        }
        j7 = c1558n2.f4835d;
        if (j7 < 0) {
            c1558n2.f5129a.m5605B().m6124B();
            c1558n2.f4835d = 119002L;
        }
        char charAt = "01VDIWEA?".charAt(this.f4784a);
        c8 = c1558n2.f4834c;
        j8 = c1558n2.f4835d;
        String str = this.f4785b;
        String str2 = "2" + charAt + c8 + j8 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + C1558N2.m5925A(true, str, this.f4786c, this.f4787d, this.f4788e);
        if (str2.length() > 1024) {
            str2 = str.substring(0, 1024);
        }
        C1653Z2 c1653z2 = m5611H.f5065f;
        if (c1653z2 != null) {
            c1653z2.m5982b(str2, 1L);
        }
    }
}
