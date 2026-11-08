package p064J0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;

/* renamed from: J0.s */
/* loaded from: classes.dex */
public final class C0696s {

    /* renamed from: a */
    public final C0686i f2419a = new C0686i();

    /* renamed from: b */
    public final b f2420b;

    /* renamed from: c */
    public final c f2421c;

    /* renamed from: d */
    public boolean f2422d;

    /* renamed from: e */
    public Surface f2423e;

    /* renamed from: f */
    public float f2424f;

    /* renamed from: g */
    public float f2425g;

    /* renamed from: h */
    public float f2426h;

    /* renamed from: i */
    public float f2427i;

    /* renamed from: j */
    public int f2428j;

    /* renamed from: k */
    public long f2429k;

    /* renamed from: l */
    public long f2430l;

    /* renamed from: m */
    public long f2431m;

    /* renamed from: n */
    public long f2432n;

    /* renamed from: o */
    public long f2433o;

    /* renamed from: p */
    public long f2434p;

    /* renamed from: q */
    public long f2435q;

    /* renamed from: J0.s$a */
    public static final class a {
        /* renamed from: a */
        public static void m2966a(Surface surface, float f7) {
            try {
                surface.setFrameRate(f7, f7 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e7) {
                AbstractC5346o.m21863d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
            }
        }
    }

    /* renamed from: J0.s$c */
    public static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        public static final c f2438f = new c();

        /* renamed from: a */
        public volatile long f2439a = -9223372036854775807L;

        /* renamed from: b */
        public final Handler f2440b;

        /* renamed from: c */
        public final HandlerThread f2441c;

        /* renamed from: d */
        public Choreographer f2442d;

        /* renamed from: e */
        public int f2443e;

        public c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f2441c = handlerThread;
            handlerThread.start();
            Handler m21786z = AbstractC5330M.m21786z(handlerThread.getLooper(), this);
            this.f2440b = m21786z;
            m21786z.sendEmptyMessage(1);
        }

        /* renamed from: d */
        public static c m2970d() {
            return f2438f;
        }

        /* renamed from: a */
        public void m2971a() {
            this.f2440b.sendEmptyMessage(2);
        }

        /* renamed from: b */
        public final void m2972b() {
            Choreographer choreographer = this.f2442d;
            if (choreographer != null) {
                int i7 = this.f2443e + 1;
                this.f2443e = i7;
                if (i7 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* renamed from: c */
        public final void m2973c() {
            try {
                this.f2442d = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                AbstractC5346o.m21868i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            this.f2439a = j7;
            ((Choreographer) AbstractC5332a.m21800e(this.f2442d)).postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m2974e() {
            this.f2440b.sendEmptyMessage(3);
        }

        /* renamed from: f */
        public final void m2975f() {
            Choreographer choreographer = this.f2442d;
            if (choreographer != null) {
                int i7 = this.f2443e - 1;
                this.f2443e = i7;
                if (i7 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f2439a = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 1) {
                m2973c();
                return true;
            }
            if (i7 == 2) {
                m2972b();
                return true;
            }
            if (i7 != 3) {
                return false;
            }
            m2975f();
            return true;
        }
    }

    public C0696s(Context context) {
        b m2953f = m2953f(context);
        this.f2420b = m2953f;
        this.f2421c = m2953f != null ? c.m2970d() : null;
        this.f2429k = -9223372036854775807L;
        this.f2430l = -9223372036854775807L;
        this.f2424f = -1.0f;
        this.f2427i = 1.0f;
        this.f2428j = 0;
    }

    /* renamed from: c */
    public static boolean m2949c(long j7, long j8) {
        return Math.abs(j7 - j8) <= 20000000;
    }

    /* renamed from: e */
    public static long m2950e(long j7, long j8, long j9) {
        long j10;
        long j11 = j8 + (((j7 - j8) / j9) * j9);
        if (j7 <= j11) {
            j10 = j11 - j9;
        } else {
            j11 = j9 + j11;
            j10 = j11;
        }
        return j11 - j7 < j7 - j10 ? j11 : j10;
    }

    /* renamed from: b */
    public long m2951b(long j7) {
        long j8;
        c cVar;
        if (this.f2434p != -1 && this.f2419a.m2812e()) {
            long m2808a = this.f2435q + ((long) ((this.f2419a.m2808a() * (this.f2431m - this.f2434p)) / this.f2427i));
            if (m2949c(j7, m2808a)) {
                j8 = m2808a;
                this.f2432n = this.f2431m;
                this.f2433o = j8;
                cVar = this.f2421c;
                if (cVar != null || this.f2429k == -9223372036854775807L) {
                    return j8;
                }
                long j9 = cVar.f2439a;
                return j9 == -9223372036854775807L ? j8 : m2950e(j8, j9, this.f2429k) - this.f2430l;
            }
            m2961n();
        }
        j8 = j7;
        this.f2432n = this.f2431m;
        this.f2433o = j8;
        cVar = this.f2421c;
        if (cVar != null) {
        }
        return j8;
    }

    /* renamed from: d */
    public final void m2952d() {
        Surface surface;
        if (AbstractC5330M.f18800a < 30 || (surface = this.f2423e) == null || this.f2428j == Integer.MIN_VALUE || this.f2426h == 0.0f) {
            return;
        }
        this.f2426h = 0.0f;
        a.m2966a(surface, 0.0f);
    }

    /* renamed from: f */
    public final b m2953f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    /* renamed from: g */
    public void m2954g(float f7) {
        this.f2424f = f7;
        this.f2419a.m2814g();
        m2964q();
    }

    /* renamed from: h */
    public void m2955h(long j7) {
        long j8 = this.f2432n;
        if (j8 != -1) {
            this.f2434p = j8;
            this.f2435q = this.f2433o;
        }
        this.f2431m++;
        this.f2419a.m2813f(j7 * 1000);
        m2964q();
    }

    /* renamed from: i */
    public void m2956i(float f7) {
        this.f2427i = f7;
        m2961n();
        m2965r(false);
    }

    /* renamed from: j */
    public void m2957j() {
        m2961n();
    }

    /* renamed from: k */
    public void m2958k() {
        this.f2422d = true;
        m2961n();
        if (this.f2420b != null) {
            ((c) AbstractC5332a.m21800e(this.f2421c)).m2971a();
            this.f2420b.m2968b();
        }
        m2965r(false);
    }

    /* renamed from: l */
    public void m2959l() {
        this.f2422d = false;
        b bVar = this.f2420b;
        if (bVar != null) {
            bVar.m2969c();
            ((c) AbstractC5332a.m21800e(this.f2421c)).m2974e();
        }
        m2952d();
    }

    /* renamed from: m */
    public void m2960m(Surface surface) {
        if (surface instanceof C0692o) {
            surface = null;
        }
        if (this.f2423e == surface) {
            return;
        }
        m2952d();
        this.f2423e = surface;
        m2965r(true);
    }

    /* renamed from: n */
    public final void m2961n() {
        this.f2431m = 0L;
        this.f2434p = -1L;
        this.f2432n = -1L;
    }

    /* renamed from: o */
    public void m2962o(int i7) {
        if (this.f2428j == i7) {
            return;
        }
        this.f2428j = i7;
        m2965r(true);
    }

    /* renamed from: p */
    public final void m2963p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f2429k = refreshRate;
            this.f2430l = (refreshRate * 80) / 100;
        } else {
            AbstractC5346o.m21867h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f2429k = -9223372036854775807L;
            this.f2430l = -9223372036854775807L;
        }
    }

    /* renamed from: q */
    public final void m2964q() {
        if (AbstractC5330M.f18800a < 30 || this.f2423e == null) {
            return;
        }
        float m2809b = this.f2419a.m2812e() ? this.f2419a.m2809b() : this.f2424f;
        float f7 = this.f2425g;
        if (m2809b == f7) {
            return;
        }
        if (m2809b != -1.0f && f7 != -1.0f) {
            if (Math.abs(m2809b - this.f2425g) < ((!this.f2419a.m2812e() || this.f2419a.m2811d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (m2809b == -1.0f && this.f2419a.m2810c() < 30) {
            return;
        }
        this.f2425g = m2809b;
        m2965r(false);
    }

    /* renamed from: r */
    public final void m2965r(boolean z6) {
        Surface surface;
        float f7;
        if (AbstractC5330M.f18800a < 30 || (surface = this.f2423e) == null || this.f2428j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f2422d) {
            float f8 = this.f2425g;
            if (f8 != -1.0f) {
                f7 = f8 * this.f2427i;
                if (z6 && this.f2426h == f7) {
                    return;
                }
                this.f2426h = f7;
                a.m2966a(surface, f7);
            }
        }
        f7 = 0.0f;
        if (z6) {
        }
        this.f2426h = f7;
        a.m2966a(surface, f7);
    }

    /* renamed from: J0.s$b */
    public final class b implements DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f2436a;

        public b(DisplayManager displayManager) {
            this.f2436a = displayManager;
        }

        /* renamed from: a */
        public final Display m2967a() {
            return this.f2436a.getDisplay(0);
        }

        /* renamed from: b */
        public void m2968b() {
            this.f2436a.registerDisplayListener(this, AbstractC5330M.m21671A());
            C0696s.this.m2963p(m2967a());
        }

        /* renamed from: c */
        public void m2969c() {
            this.f2436a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i7) {
            if (i7 == 0) {
                C0696s.this.m2963p(m2967a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i7) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i7) {
        }
    }
}
