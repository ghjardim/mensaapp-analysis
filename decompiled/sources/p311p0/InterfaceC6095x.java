package p311p0;

import android.os.Handler;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p292n0.C5747o;
import p292n0.C5749p;
import p311p0.InterfaceC6095x;
import p311p0.InterfaceC6097z;

/* renamed from: p0.x */
/* loaded from: classes.dex */
public interface InterfaceC6095x {

    /* renamed from: p0.x$a */
    public static final class a {

        /* renamed from: a */
        public final Handler f21777a;

        /* renamed from: b */
        public final InterfaceC6095x f21778b;

        public a(Handler handler, InterfaceC6095x interfaceC6095x) {
            this.f21777a = interfaceC6095x != null ? (Handler) AbstractC5332a.m21800e(handler) : null;
            this.f21778b = interfaceC6095x;
        }

        /* renamed from: A */
        public final /* synthetic */ void m25413A(String str) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24105k(str);
        }

        /* renamed from: B */
        public final /* synthetic */ void m25414B(C5747o c5747o) {
            c5747o.m24177c();
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24103i(c5747o);
        }

        /* renamed from: C */
        public final /* synthetic */ void m25415C(C5747o c5747o) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24104j(c5747o);
        }

        /* renamed from: D */
        public final /* synthetic */ void m25416D(C4327q c4327q, C5749p c5749p) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24109q(c4327q, c5749p);
        }

        /* renamed from: E */
        public final /* synthetic */ void m25417E(long j7) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24110u(j7);
        }

        /* renamed from: F */
        public final /* synthetic */ void m25418F(boolean z6) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24100c(z6);
        }

        /* renamed from: G */
        public final /* synthetic */ void m25419G(int i7, long j7, long j8) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24112x(i7, j7, j8);
        }

        /* renamed from: H */
        public void m25420H(final long j7) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25417E(j7);
                    }
                });
            }
        }

        /* renamed from: I */
        public void m25421I(final boolean z6) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25418F(z6);
                    }
                });
            }
        }

        /* renamed from: J */
        public void m25422J(final int i7, final long j7, final long j8) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25419G(i7, j7, j8);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m25423m(final Exception exc) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25432v(exc);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m25424n(final Exception exc) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25433w(exc);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m25425o(final InterfaceC6097z.a aVar) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25434x(aVar);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m25426p(final InterfaceC6097z.a aVar) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25435y(aVar);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m25427q(final String str, final long j7, final long j8) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25436z(str, j7, j8);
                    }
                });
            }
        }

        /* renamed from: r */
        public void m25428r(final String str) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25413A(str);
                    }
                });
            }
        }

        /* renamed from: s */
        public void m25429s(final C5747o c5747o) {
            c5747o.m24177c();
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25414B(c5747o);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m25430t(final C5747o c5747o) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25415C(c5747o);
                    }
                });
            }
        }

        /* renamed from: u */
        public void m25431u(final C4327q c4327q, final C5749p c5749p) {
            Handler handler = this.f21777a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6095x.a.this.m25416D(c4327q, c5749p);
                    }
                });
            }
        }

        /* renamed from: v */
        public final /* synthetic */ void m25432v(Exception exc) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24111v(exc);
        }

        /* renamed from: w */
        public final /* synthetic */ void m25433w(Exception exc) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24101d(exc);
        }

        /* renamed from: x */
        public final /* synthetic */ void m25434x(InterfaceC6097z.a aVar) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24099b(aVar);
        }

        /* renamed from: y */
        public final /* synthetic */ void m25435y(InterfaceC6097z.a aVar) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24102e(aVar);
        }

        /* renamed from: z */
        public final /* synthetic */ void m25436z(String str, long j7, long j8) {
            ((InterfaceC6095x) AbstractC5330M.m21747i(this.f21778b)).mo24106l(str, j7, j8);
        }
    }

    /* renamed from: b */
    void mo24099b(InterfaceC6097z.a aVar);

    /* renamed from: c */
    void mo24100c(boolean z6);

    /* renamed from: d */
    void mo24101d(Exception exc);

    /* renamed from: e */
    void mo24102e(InterfaceC6097z.a aVar);

    /* renamed from: i */
    void mo24103i(C5747o c5747o);

    /* renamed from: j */
    void mo24104j(C5747o c5747o);

    /* renamed from: k */
    void mo24105k(String str);

    /* renamed from: l */
    void mo24106l(String str, long j7, long j8);

    /* renamed from: q */
    void mo24109q(C4327q c4327q, C5749p c5749p);

    /* renamed from: u */
    void mo24110u(long j7);

    /* renamed from: v */
    void mo24111v(Exception exc);

    /* renamed from: x */
    void mo24112x(int i7, long j7, long j8);
}
