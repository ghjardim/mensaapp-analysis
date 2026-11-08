package p292n0;

import android.content.Context;
import android.os.PowerManager;
import p259j0.AbstractC5346o;

/* renamed from: n0.f1 */
/* loaded from: classes.dex */
public final class C5729f1 {

    /* renamed from: a */
    public final Context f20764a;

    /* renamed from: b */
    public PowerManager.WakeLock f20765b;

    /* renamed from: c */
    public boolean f20766c;

    /* renamed from: d */
    public boolean f20767d;

    public C5729f1(Context context) {
        this.f20764a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m24130a(boolean z6) {
        if (z6 && this.f20765b == null) {
            PowerManager powerManager = (PowerManager) this.f20764a.getSystemService("power");
            if (powerManager == null) {
                AbstractC5346o.m21867h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f20765b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f20766c = z6;
        m24132c();
    }

    /* renamed from: b */
    public void m24131b(boolean z6) {
        this.f20767d = z6;
        m24132c();
    }

    /* renamed from: c */
    public final void m24132c() {
        PowerManager.WakeLock wakeLock = this.f20765b;
        if (wakeLock == null) {
            return;
        }
        if (this.f20766c && this.f20767d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
