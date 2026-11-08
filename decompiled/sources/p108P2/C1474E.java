package p108P2;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Iterator;

/* renamed from: P2.E */
/* loaded from: classes.dex */
public final class C1474E {

    /* renamed from: a */
    public final String f4602a;

    /* renamed from: b */
    public final String f4603b;

    /* renamed from: c */
    public final String f4604c;

    /* renamed from: d */
    public final long f4605d;

    /* renamed from: e */
    public final long f4606e;

    /* renamed from: f */
    public final C1501H f4607f;

    public C1474E(C1460C3 c1460c3, String str, String str2, String str3, long j7, long j8, Bundle bundle) {
        C1501H c1501h;
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15123e(str3);
        this.f4602a = str2;
        this.f4603b = str3;
        this.f4604c = true == TextUtils.isEmpty(str) ? null : str;
        this.f4605d = j7;
        this.f4606e = j8;
        if (j8 != 0 && j8 > j7) {
            c1460c3.mo5624b().m5941w().m5903b("Event created with reverse previous/current timestamps. appId", C1558N2.m5932z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c1501h = new C1501H(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c1460c3.mo5624b().m5936r().m5902a("Param name can't be null");
                    it.remove();
                } else {
                    Object m5725r = c1460c3.m5619Q().m5725r(next, bundle2.get(next));
                    if (m5725r == null) {
                        c1460c3.mo5624b().m5941w().m5903b("Param value can't be null", c1460c3.m5609F().m5759e(next));
                        it.remove();
                    } else {
                        c1460c3.m5619Q().m5691G(bundle2, next, m5725r);
                    }
                }
            }
            c1501h = new C1501H(bundle2);
        }
        this.f4607f = c1501h;
    }

    /* renamed from: a */
    public final C1474E m5740a(C1460C3 c1460c3, long j7) {
        return new C1474E(c1460c3, this.f4604c, this.f4602a, this.f4603b, this.f4605d, j7, this.f4607f);
    }

    public final String toString() {
        return "Event{appId='" + this.f4602a + "', name='" + this.f4603b + "', params=" + this.f4607f.toString() + "}";
    }

    public C1474E(C1460C3 c1460c3, String str, String str2, String str3, long j7, long j8, C1501H c1501h) {
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15123e(str3);
        AbstractC3802r.m15129k(c1501h);
        this.f4602a = str2;
        this.f4603b = str3;
        this.f4604c = true == TextUtils.isEmpty(str) ? null : str;
        this.f4605d = j7;
        this.f4606e = j8;
        if (j8 != 0 && j8 > j7) {
            c1460c3.mo5624b().m5941w().m5904c("Event created with reverse previous/current timestamps. appId, name", C1558N2.m5932z(str2), C1558N2.m5932z(str3));
        }
        this.f4607f = c1501h;
    }
}
