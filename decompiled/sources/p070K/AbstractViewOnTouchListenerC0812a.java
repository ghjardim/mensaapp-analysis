package p070K;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p049H.AbstractC0475B;

/* renamed from: K.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0812a implements View.OnTouchListener {

    /* renamed from: y */
    public static final int f2805y = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    public final View f2808c;

    /* renamed from: d */
    public Runnable f2809d;

    /* renamed from: n */
    public int f2812n;

    /* renamed from: o */
    public int f2813o;

    /* renamed from: s */
    public boolean f2817s;

    /* renamed from: t */
    public boolean f2818t;

    /* renamed from: u */
    public boolean f2819u;

    /* renamed from: v */
    public boolean f2820v;

    /* renamed from: w */
    public boolean f2821w;

    /* renamed from: x */
    public boolean f2822x;

    /* renamed from: a */
    public final a f2806a = new a();

    /* renamed from: b */
    public final Interpolator f2807b = new AccelerateInterpolator();

    /* renamed from: e */
    public float[] f2810e = {0.0f, 0.0f};

    /* renamed from: f */
    public float[] f2811f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: p */
    public float[] f2814p = {0.0f, 0.0f};

    /* renamed from: q */
    public float[] f2815q = {0.0f, 0.0f};

    /* renamed from: r */
    public float[] f2816r = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: K.a$a */
    public static class a {

        /* renamed from: a */
        public int f2823a;

        /* renamed from: b */
        public int f2824b;

        /* renamed from: c */
        public float f2825c;

        /* renamed from: d */
        public float f2826d;

        /* renamed from: j */
        public float f2832j;

        /* renamed from: k */
        public int f2833k;

        /* renamed from: e */
        public long f2827e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f2831i = -1;

        /* renamed from: f */
        public long f2828f = 0;

        /* renamed from: g */
        public int f2829g = 0;

        /* renamed from: h */
        public int f2830h = 0;

        /* renamed from: a */
        public void m3373a() {
            if (this.f2828f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m3379g = m3379g(m3377e(currentAnimationTimeMillis));
            long j7 = currentAnimationTimeMillis - this.f2828f;
            this.f2828f = currentAnimationTimeMillis;
            float f7 = j7 * m3379g;
            this.f2829g = (int) (this.f2825c * f7);
            this.f2830h = (int) (f7 * this.f2826d);
        }

        /* renamed from: b */
        public int m3374b() {
            return this.f2829g;
        }

        /* renamed from: c */
        public int m3375c() {
            return this.f2830h;
        }

        /* renamed from: d */
        public int m3376d() {
            float f7 = this.f2825c;
            return (int) (f7 / Math.abs(f7));
        }

        /* renamed from: e */
        public final float m3377e(long j7) {
            if (j7 < this.f2827e) {
                return 0.0f;
            }
            long j8 = this.f2831i;
            if (j8 < 0 || j7 < j8) {
                return AbstractViewOnTouchListenerC0812a.m3351e((j7 - r0) / this.f2823a, 0.0f, 1.0f) * 0.5f;
            }
            float f7 = this.f2832j;
            return (1.0f - f7) + (f7 * AbstractViewOnTouchListenerC0812a.m3351e((j7 - j8) / this.f2833k, 0.0f, 1.0f));
        }

        /* renamed from: f */
        public int m3378f() {
            float f7 = this.f2826d;
            return (int) (f7 / Math.abs(f7));
        }

        /* renamed from: g */
        public final float m3379g(float f7) {
            return ((-4.0f) * f7 * f7) + (f7 * 4.0f);
        }

        /* renamed from: h */
        public boolean m3380h() {
            return this.f2831i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2831i + ((long) this.f2833k);
        }

        /* renamed from: i */
        public void m3381i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2833k = AbstractViewOnTouchListenerC0812a.m3352f((int) (currentAnimationTimeMillis - this.f2827e), 0, this.f2824b);
            this.f2832j = m3377e(currentAnimationTimeMillis);
            this.f2831i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m3382j(int i7) {
            this.f2824b = i7;
        }

        /* renamed from: k */
        public void m3383k(int i7) {
            this.f2823a = i7;
        }

        /* renamed from: l */
        public void m3384l(float f7, float f8) {
            this.f2825c = f7;
            this.f2826d = f8;
        }

        /* renamed from: m */
        public void m3385m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2827e = currentAnimationTimeMillis;
            this.f2831i = -1L;
            this.f2828f = currentAnimationTimeMillis;
            this.f2832j = 0.5f;
            this.f2829g = 0;
            this.f2830h = 0;
        }
    }

    /* renamed from: K.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0812a abstractViewOnTouchListenerC0812a = AbstractViewOnTouchListenerC0812a.this;
            if (abstractViewOnTouchListenerC0812a.f2820v) {
                if (abstractViewOnTouchListenerC0812a.f2818t) {
                    abstractViewOnTouchListenerC0812a.f2818t = false;
                    abstractViewOnTouchListenerC0812a.f2806a.m3385m();
                }
                a aVar = AbstractViewOnTouchListenerC0812a.this.f2806a;
                if (aVar.m3380h() || !AbstractViewOnTouchListenerC0812a.this.m3371u()) {
                    AbstractViewOnTouchListenerC0812a.this.f2820v = false;
                    return;
                }
                AbstractViewOnTouchListenerC0812a abstractViewOnTouchListenerC0812a2 = AbstractViewOnTouchListenerC0812a.this;
                if (abstractViewOnTouchListenerC0812a2.f2819u) {
                    abstractViewOnTouchListenerC0812a2.f2819u = false;
                    abstractViewOnTouchListenerC0812a2.m3355c();
                }
                aVar.m3373a();
                AbstractViewOnTouchListenerC0812a.this.mo3360j(aVar.m3374b(), aVar.m3375c());
                AbstractC0475B.m1726D(AbstractViewOnTouchListenerC0812a.this.f2808c, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0812a(View view) {
        this.f2808c = view;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = (int) ((1575.0f * f7) + 0.5f);
        m3365o(f8, f8);
        float f9 = (int) ((f7 * 315.0f) + 0.5f);
        m3366p(f9, f9);
        m3362l(1);
        m3364n(Float.MAX_VALUE, Float.MAX_VALUE);
        m3369s(0.2f, 0.2f);
        m3370t(1.0f, 1.0f);
        m3361k(f2805y);
        m3368r(500);
        m3367q(500);
    }

    /* renamed from: e */
    public static float m3351e(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    /* renamed from: f */
    public static int m3352f(int i7, int i8, int i9) {
        return i7 > i9 ? i9 : i7 < i8 ? i8 : i7;
    }

    /* renamed from: a */
    public abstract boolean mo3353a(int i7);

    /* renamed from: b */
    public abstract boolean mo3354b(int i7);

    /* renamed from: c */
    public void m3355c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2808c.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: d */
    public final float m3356d(int i7, float f7, float f8, float f9) {
        float m3358h = m3358h(this.f2810e[i7], f8, this.f2811f[i7], f7);
        if (m3358h == 0.0f) {
            return 0.0f;
        }
        float f10 = this.f2814p[i7];
        float f11 = this.f2815q[i7];
        float f12 = this.f2816r[i7];
        float f13 = f10 * f9;
        return m3358h > 0.0f ? m3351e(m3358h * f13, f11, f12) : -m3351e((-m3358h) * f13, f11, f12);
    }

    /* renamed from: g */
    public final float m3357g(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f2812n;
        if (i7 == 0 || i7 == 1) {
            if (f7 < f8) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f8);
                }
                if (this.f2820v && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f7 < 0.0f) {
            return f7 / (-f8);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float m3358h(float f7, float f8, float f9, float f10) {
        float interpolation;
        float m3351e = m3351e(f7 * f8, 0.0f, f9);
        float m3357g = m3357g(f8 - f10, m3351e) - m3357g(f10, m3351e);
        if (m3357g < 0.0f) {
            interpolation = -this.f2807b.getInterpolation(-m3357g);
        } else {
            if (m3357g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2807b.getInterpolation(m3357g);
        }
        return m3351e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public final void m3359i() {
        if (this.f2818t) {
            this.f2820v = false;
        } else {
            this.f2806a.m3381i();
        }
    }

    /* renamed from: j */
    public abstract void mo3360j(int i7, int i8);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC0812a m3361k(int i7) {
        this.f2813o = i7;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC0812a m3362l(int i7) {
        this.f2812n = i7;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC0812a m3363m(boolean z6) {
        if (this.f2821w && !z6) {
            m3359i();
        }
        this.f2821w = z6;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC0812a m3364n(float f7, float f8) {
        float[] fArr = this.f2811f;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC0812a m3365o(float f7, float f8) {
        float[] fArr = this.f2816r;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2821w
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m3359i()
            goto L58
        L1a:
            r5.f2819u = r2
            r5.f2817s = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2808c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m3356d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2808c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m3356d(r2, r7, r6, r3)
            K.a$a r7 = r5.f2806a
            r7.m3384l(r0, r6)
            boolean r6 = r5.f2820v
            if (r6 != 0) goto L58
            boolean r6 = r5.m3371u()
            if (r6 == 0) goto L58
            r5.m3372v()
        L58:
            boolean r6 = r5.f2822x
            if (r6 == 0) goto L61
            boolean r6 = r5.f2820v
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p070K.AbstractViewOnTouchListenerC0812a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC0812a m3366p(float f7, float f8) {
        float[] fArr = this.f2815q;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC0812a m3367q(int i7) {
        this.f2806a.m3382j(i7);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC0812a m3368r(int i7) {
        this.f2806a.m3383k(i7);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC0812a m3369s(float f7, float f8) {
        float[] fArr = this.f2810e;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC0812a m3370t(float f7, float f8) {
        float[] fArr = this.f2814p;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    public boolean m3371u() {
        a aVar = this.f2806a;
        int m3378f = aVar.m3378f();
        int m3376d = aVar.m3376d();
        return (m3378f != 0 && mo3354b(m3378f)) || (m3376d != 0 && mo3353a(m3376d));
    }

    /* renamed from: v */
    public final void m3372v() {
        int i7;
        if (this.f2809d == null) {
            this.f2809d = new b();
        }
        this.f2820v = true;
        this.f2818t = true;
        if (this.f2817s || (i7 = this.f2813o) <= 0) {
            this.f2809d.run();
        } else {
            AbstractC0475B.m1727E(this.f2808c, this.f2809d, i7);
        }
        this.f2817s = true;
    }
}
