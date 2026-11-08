package p108P2;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbr;
import p024D2.C0185b;

/* renamed from: P2.d3 */
/* loaded from: classes.dex */
public final class RunnableC1689d3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzbr f5099a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnection f5100b;

    /* renamed from: c */
    public final /* synthetic */ ServiceConnectionC1698e3 f5101c;

    public RunnableC1689d3(ServiceConnectionC1698e3 serviceConnectionC1698e3, zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f5099a = zzbrVar;
        this.f5100b = serviceConnection;
        this.f5101c = serviceConnectionC1698e3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ServiceConnectionC1698e3 serviceConnectionC1698e3 = this.f5101c;
        str = serviceConnectionC1698e3.f5109a;
        C1707f3 c1707f3 = serviceConnectionC1698e3.f5110b;
        C1460C3 c1460c3 = c1707f3.f5128a;
        c1460c3.mo5628f().mo5762h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle zze = this.f5099a.zze(bundle);
            if (zze == null) {
                c1460c3.mo5624b().m5936r().m5902a("Install Referrer Service returned a null response");
            } else {
                bundle2 = zze;
            }
        } catch (Exception e7) {
            c1707f3.f5128a.mo5624b().m5936r().m5903b("Exception occurred while retrieving the Install Referrer", e7.getMessage());
        }
        C1460C3 c1460c32 = c1707f3.f5128a;
        c1460c32.mo5628f().mo5762h();
        C1460C3.m5599u();
        if (bundle2 != null) {
            long j7 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j7 == 0) {
                c1460c32.mo5624b().m5941w().m5902a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c1460c32.mo5624b().m5936r().m5902a("No referrer defined in Install Referrer response");
                } else {
                    c1460c32.mo5624b().m5940v().m5903b("InstallReferrer API result", string);
                    Bundle m5688E0 = c1460c32.m5619Q().m5688E0(Uri.parse("?".concat(string)));
                    if (m5688E0 == null) {
                        c1460c32.mo5624b().m5936r().m5902a("No campaign params defined in Install Referrer result");
                    } else {
                        if (m5688E0.containsKey("gclid") || m5688E0.containsKey("gbraid")) {
                            long j8 = bundle2.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j8 > 0) {
                                m5688E0.putLong("click_timestamp", j8);
                            }
                        }
                        if (j7 == c1460c32.m5611H().f5067h.m5979a()) {
                            c1460c32.mo5624b().m5940v().m5902a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c1460c32.m5635o()) {
                            c1460c32.m5611H().f5067h.m5980b(j7);
                            c1460c32.mo5624b().m5940v().m5903b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m5688E0.putString("_cis", "referrer API v2");
                            c1460c32.m5613K().m6184E("auto", "_cmp", m5688E0, str);
                        }
                    }
                }
            }
        }
        C0185b.m743b().m748c(c1460c32.mo5625c(), this.f5100b);
    }
}
