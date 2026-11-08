package p108P2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import org.apache.tika.metadata.ClimateForcast;

/* renamed from: P2.K7 */
/* loaded from: classes.dex */
public final class C1536K7 {

    /* renamed from: a */
    public final C1460C3 f4796a;

    public C1536K7(C1460C3 c1460c3) {
        this.f4796a = c1460c3;
    }

    /* renamed from: a */
    public final void m5897a(String str, Bundle bundle) {
        String uri;
        C1460C3 c1460c3 = this.f4796a;
        c1460c3.mo5628f().mo5762h();
        if (c1460c3.m5635o()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        c1460c3.m5611H().f5084y.m5987b(uri);
        c1460c3.m5611H().f5085z.m5980b(c1460c3.mo5626d().mo1110a());
    }

    /* renamed from: b */
    public final void m5898b() {
        C1460C3 c1460c3 = this.f4796a;
        c1460c3.mo5628f().mo5762h();
        if (m5900d()) {
            if (m5901e()) {
                c1460c3.m5611H().f5084y.m5987b(null);
                Bundle bundle = new Bundle();
                bundle.putString(ClimateForcast.SOURCE, "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                c1460c3.m5613K().m6185F("auto", "_cmpx", bundle);
            } else {
                String m5986a = c1460c3.m5611H().f5084y.m5986a();
                if (TextUtils.isEmpty(m5986a)) {
                    c1460c3.mo5624b().m5938t().m5902a("Cache still valid but referrer not found");
                } else {
                    long m5979a = c1460c3.m5611H().f5085z.m5979a() / 3600000;
                    Uri parse = Uri.parse(m5986a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (m5979a - 1) * 3600000);
                    Object obj = pair.first;
                    c1460c3.m5613K().m6185F(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                c1460c3.m5611H().f5084y.m5987b(null);
            }
            c1460c3.m5611H().f5085z.m5980b(0L);
        }
    }

    /* renamed from: c */
    public final void m5899c() {
        if (m5900d() && m5901e()) {
            this.f4796a.m5611H().f5084y.m5987b(null);
        }
    }

    /* renamed from: d */
    public final boolean m5900d() {
        return this.f4796a.m5611H().f5085z.m5979a() > 0;
    }

    /* renamed from: e */
    public final boolean m5901e() {
        if (!m5900d()) {
            return false;
        }
        C1460C3 c1460c3 = this.f4796a;
        return c1460c3.mo5626d().mo1110a() - c1460c3.m5611H().f5085z.m5979a() > c1460c3.m5605B().m6125C(null, AbstractC1805q2.f5396j0);
    }
}
