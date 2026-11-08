package p108P2;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Iterator;
import java.util.Map;
import p334s.C6308a;

/* renamed from: P2.E0 */
/* loaded from: classes.dex */
public final class C1475E0 extends AbstractC1494G1 {

    /* renamed from: b */
    public final Map f4608b;

    /* renamed from: c */
    public final Map f4609c;

    /* renamed from: d */
    public long f4610d;

    public C1475E0(C1460C3 c1460c3) {
        super(c1460c3);
        this.f4609c = new C6308a();
        this.f4608b = new C6308a();
    }

    /* renamed from: i */
    public static /* synthetic */ void m5741i(C1475E0 c1475e0, String str, long j7) {
        c1475e0.mo5762h();
        AbstractC3802r.m15123e(str);
        Map map = c1475e0.f4609c;
        if (map.isEmpty()) {
            c1475e0.f4610d = j7;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            c1475e0.f5129a.mo5624b().m5941w().m5902a("Too many ads visible");
        } else {
            map.put(str, 1);
            c1475e0.f4608b.put(str, Long.valueOf(j7));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m5742j(C1475E0 c1475e0, String str, long j7) {
        c1475e0.mo5762h();
        AbstractC3802r.m15123e(str);
        Map map = c1475e0.f4609c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            c1475e0.f5129a.mo5624b().m5936r().m5903b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C1462C5 m5883t = c1475e0.f5129a.m5616N().m5883t(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            map.put(str, Integer.valueOf(intValue));
            return;
        }
        map.remove(str);
        Map map2 = c1475e0.f4608b;
        Long l7 = (Long) map2.get(str);
        if (l7 == null) {
            c1475e0.f5129a.mo5624b().m5936r().m5902a("First ad unit exposure time was never set");
        } else {
            long longValue = j7 - l7.longValue();
            map2.remove(str);
            c1475e0.m5749p(str, longValue, m5883t);
        }
        if (map.isEmpty()) {
            long j8 = c1475e0.f4610d;
            if (j8 == 0) {
                c1475e0.f5129a.mo5624b().m5936r().m5902a("First ad exposure time was never set");
            } else {
                c1475e0.m5748o(j7 - j8, m5883t);
                c1475e0.f4610d = 0L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m5744q(long j7) {
        Map map = this.f4608b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j7));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f4610d = j7;
    }

    /* renamed from: l */
    public final void m5745l(String str, long j7) {
        if (str == null || str.length() == 0) {
            this.f5129a.mo5624b().m5936r().m5902a("Ad unit id must be a non-empty string");
        } else {
            this.f5129a.mo5628f().m6446A(new RunnableC1658a(this, str, j7));
        }
    }

    /* renamed from: m */
    public final void m5746m(String str, long j7) {
        if (str == null || str.length() == 0) {
            this.f5129a.mo5624b().m5936r().m5902a("Ad unit id must be a non-empty string");
        } else {
            this.f5129a.mo5628f().m6446A(new RunnableC1447B(this, str, j7));
        }
    }

    /* renamed from: n */
    public final void m5747n(long j7) {
        C1462C5 m5883t = this.f5129a.m5616N().m5883t(false);
        Map map = this.f4608b;
        for (String str : map.keySet()) {
            m5749p(str, j7 - ((Long) map.get(str)).longValue(), m5883t);
        }
        if (!map.isEmpty()) {
            m5748o(j7 - this.f4610d, m5883t);
        }
        m5744q(j7);
    }

    /* renamed from: o */
    public final void m5748o(long j7, C1462C5 c1462c5) {
        if (c1462c5 == null) {
            this.f5129a.mo5624b().m5940v().m5902a("Not logging ad exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            this.f5129a.mo5624b().m5940v().m5903b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j7);
        C1473D7.m5669B(c1462c5, bundle, true);
        this.f5129a.m5613K().m6185F("am", "_xa", bundle);
    }

    /* renamed from: p */
    public final void m5749p(String str, long j7, C1462C5 c1462c5) {
        if (c1462c5 == null) {
            this.f5129a.mo5624b().m5940v().m5902a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            this.f5129a.mo5624b().m5940v().m5903b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j7);
        C1473D7.m5669B(c1462c5, bundle, true);
        this.f5129a.m5613K().m6185F("am", "_xu", bundle);
    }
}
