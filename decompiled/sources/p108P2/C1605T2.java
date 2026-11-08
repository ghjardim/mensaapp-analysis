package p108P2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzhv;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: P2.T2 */
/* loaded from: classes.dex */
public final class C1605T2 extends AbstractC1693d7 {
    public C1605T2(C1828s7 c1828s7) {
        super(c1828s7);
    }

    @Override // p108P2.AbstractC1693d7
    /* renamed from: l */
    public final boolean mo5961l() {
        return false;
    }

    /* renamed from: m */
    public final void m5962m(C1513I2 c1513i2, Map map, InterfaceC1574P2 interfaceC1574P2) {
        mo5762h();
        m6015i();
        AbstractC3802r.m15129k(c1513i2);
        AbstractC3802r.m15129k(interfaceC1574P2);
        C1711f7 m6324R0 = this.f4967b.m6324R0();
        Uri.Builder builder = new Uri.Builder();
        String m5826h = c1513i2.m5826h();
        if (TextUtils.isEmpty(m5826h)) {
            m5826h = c1513i2.m5812a();
        }
        Uri.Builder appendQueryParameter = builder.scheme((String) AbstractC1805q2.f5383f.m6159a(null)).encodedAuthority((String) AbstractC1805q2.f5386g.m6159a(null)).path("config/app/".concat(String.valueOf(m5826h))).appendQueryParameter("platform", "android");
        m6324R0.f5129a.m5605B().m6124B();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(119002L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            this.f5129a.mo5628f().m6455z(new RunnableC1589R2(this, c1513i2.m5816c(), new URI(uri).toURL(), null, map, interfaceC1574P2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            this.f5129a.mo5624b().m5936r().m5904c("Failed to parse config URL. Not fetching. appId", C1558N2.m5932z(c1513i2.m5816c()), uri);
        }
    }

    /* renamed from: n */
    public final void m5963n(String str, C1702e7 c1702e7, zzhv zzhvVar, InterfaceC1574P2 interfaceC1574P2) {
        mo5762h();
        m6015i();
        try {
            URL url = new URI(c1702e7.m6061c()).toURL();
            this.f4967b.m6334e();
            this.f5129a.mo5628f().m6455z(new RunnableC1589R2(this, str, url, zzhvVar.zzcd(), c1702e7.m6062d(), interfaceC1574P2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            this.f5129a.mo5624b().m5936r().m5904c("Failed to parse URL. Not uploading MeasurementBatch. appId", C1558N2.m5932z(str), c1702e7.m6061c());
        }
    }

    /* renamed from: o */
    public final boolean m5964o() {
        m6015i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f5129a.mo5625c().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
