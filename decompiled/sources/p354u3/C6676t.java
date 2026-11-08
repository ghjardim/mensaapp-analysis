package p354u3;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zze;
import p003A2.C0019a;
import p031E2.C0271g;
import p219e3.C4176f;

/* renamed from: u3.t */
/* loaded from: classes.dex */
public final class C6676t {

    /* renamed from: h */
    public static C0019a f24082h = new C0019a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    public final C4176f f24083a;

    /* renamed from: b */
    public volatile long f24084b;

    /* renamed from: c */
    public volatile long f24085c;

    /* renamed from: d */
    public long f24086d;

    /* renamed from: e */
    public HandlerThread f24087e;

    /* renamed from: f */
    public Handler f24088f;

    /* renamed from: g */
    public Runnable f24089g;

    public C6676t(C4176f c4176f) {
        f24082h.m64f("Initializing TokenRefresher", new Object[0]);
        C4176f c4176f2 = (C4176f) AbstractC3802r.m15129k(c4176f);
        this.f24083a = c4176f2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f24087e = handlerThread;
        handlerThread.start();
        this.f24088f = new zze(this.f24087e.getLooper());
        this.f24089g = new RunnableC6682w(this, c4176f2.m17533q());
        this.f24086d = 300000L;
    }

    /* renamed from: b */
    public final void m27588b() {
        this.f24088f.removeCallbacks(this.f24089g);
    }

    /* renamed from: c */
    public final void m27589c() {
        f24082h.m64f("Scheduling refresh for " + (this.f24084b - this.f24086d), new Object[0]);
        m27588b();
        this.f24085c = Math.max((this.f24084b - C0271g.m1116d().mo1110a()) - this.f24086d, 0L) / 1000;
        this.f24088f.postDelayed(this.f24089g, this.f24085c * 1000);
    }

    /* renamed from: d */
    public final void m27590d() {
        int i7 = (int) this.f24085c;
        this.f24085c = (i7 == 30 || i7 == 60 || i7 == 120 || i7 == 240 || i7 == 480) ? 2 * this.f24085c : i7 != 960 ? 30L : 960L;
        this.f24084b = C0271g.m1116d().mo1110a() + (this.f24085c * 1000);
        f24082h.m64f("Scheduling refresh for " + this.f24084b, new Object[0]);
        this.f24088f.postDelayed(this.f24089g, this.f24085c * 1000);
    }
}
