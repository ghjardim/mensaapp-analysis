package p292n0;

import android.content.Context;
import android.net.wifi.WifiManager;
import p259j0.AbstractC5346o;

/* renamed from: n0.g1 */
/* loaded from: classes.dex */
public final class C5732g1 {

    /* renamed from: a */
    public final Context f20769a;

    /* renamed from: b */
    public WifiManager.WifiLock f20770b;

    /* renamed from: c */
    public boolean f20771c;

    /* renamed from: d */
    public boolean f20772d;

    public C5732g1(Context context) {
        this.f20769a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m24134a(boolean z6) {
        if (z6 && this.f20770b == null) {
            WifiManager wifiManager = (WifiManager) this.f20769a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                AbstractC5346o.m21867h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f20770b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f20771c = z6;
        m24136c();
    }

    /* renamed from: b */
    public void m24135b(boolean z6) {
        this.f20772d = z6;
        m24136c();
    }

    /* renamed from: c */
    public final void m24136c() {
        WifiManager.WifiLock wifiLock = this.f20770b;
        if (wifiLock == null) {
            return;
        }
        if (this.f20771c && this.f20772d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
