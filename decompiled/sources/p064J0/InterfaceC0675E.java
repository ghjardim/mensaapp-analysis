package p064J0;

import android.os.Handler;
import android.os.SystemClock;
import p064J0.InterfaceC0675E;
import p232g0.C4310P;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p292n0.C5747o;
import p292n0.C5749p;

/* renamed from: J0.E */
/* loaded from: classes.dex */
public interface InterfaceC0675E {

    /* renamed from: J0.E$a */
    public static final class a {

        /* renamed from: a */
        public final Handler f2283a;

        /* renamed from: b */
        public final InterfaceC0675E f2284b;

        public a(Handler handler, InterfaceC0675E interfaceC0675E) {
            this.f2283a = interfaceC0675E != null ? (Handler) AbstractC5332a.m21800e(handler) : null;
            this.f2284b = interfaceC0675E;
        }

        /* renamed from: A */
        public void m2702A(final Object obj) {
            if (this.f2283a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f2283a.post(new Runnable() { // from class: J0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2718w(obj, elapsedRealtime);
                    }
                });
            }
        }

        /* renamed from: B */
        public void m2703B(final long j7, final int i7) {
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2719x(j7, i7);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m2704C(final Exception exc) {
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2720y(exc);
                    }
                });
            }
        }

        /* renamed from: D */
        public void m2705D(final C4310P c4310p) {
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2721z(c4310p);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m2706k(final String str, final long j7, final long j8) {
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2712q(str, j7, j8);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m2707l(final String str) {
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2713r(str);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m2708m(final C5747o c5747o) {
            c5747o.m24177c();
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2714s(c5747o);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m2709n(final int i7, final long j7) {
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2715t(i7, j7);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m2710o(final C5747o c5747o) {
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2716u(c5747o);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m2711p(final C4327q c4327q, final C5749p c5749p) {
            Handler handler = this.f2283a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: J0.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0675E.a.this.m2717v(c4327q, c5749p);
                    }
                });
            }
        }

        /* renamed from: q */
        public final /* synthetic */ void m2712q(String str, long j7, long j8) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2685h(str, j7, j8);
        }

        /* renamed from: r */
        public final /* synthetic */ void m2713r(String str) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2683f(str);
        }

        /* renamed from: s */
        public final /* synthetic */ void m2714s(C5747o c5747o) {
            c5747o.m24177c();
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2684g(c5747o);
        }

        /* renamed from: t */
        public final /* synthetic */ void m2715t(int i7, long j7) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2686m(i7, j7);
        }

        /* renamed from: u */
        public final /* synthetic */ void m2716u(C5747o c5747o) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2687n(c5747o);
        }

        /* renamed from: v */
        public final /* synthetic */ void m2717v(C4327q c4327q, C5749p c5749p) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2689s(c4327q, c5749p);
        }

        /* renamed from: w */
        public final /* synthetic */ void m2718w(Object obj, long j7) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2688r(obj, j7);
        }

        /* renamed from: x */
        public final /* synthetic */ void m2719x(long j7, int i7) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2691z(j7, i7);
        }

        /* renamed from: y */
        public final /* synthetic */ void m2720y(Exception exc) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2690w(exc);
        }

        /* renamed from: z */
        public final /* synthetic */ void m2721z(C4310P c4310p) {
            ((InterfaceC0675E) AbstractC5330M.m21747i(this.f2284b)).mo2682a(c4310p);
        }
    }

    /* renamed from: a */
    void mo2682a(C4310P c4310p);

    /* renamed from: f */
    void mo2683f(String str);

    /* renamed from: g */
    void mo2684g(C5747o c5747o);

    /* renamed from: h */
    void mo2685h(String str, long j7, long j8);

    /* renamed from: m */
    void mo2686m(int i7, long j7);

    /* renamed from: n */
    void mo2687n(C5747o c5747o);

    /* renamed from: r */
    void mo2688r(Object obj, long j7);

    /* renamed from: s */
    void mo2689s(C4327q c4327q, C5749p c5749p);

    /* renamed from: w */
    void mo2690w(Exception exc);

    /* renamed from: z */
    void mo2691z(long j7, int i7);
}
