package p292n0;

import java.io.IOException;
import p022D0.C0148e;
import p022D0.C0165m0;
import p022D0.C0173s;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0145c0;
import p043G0.AbstractC0349D;
import p043G0.C0350E;
import p043G0.InterfaceC0375y;
import p050H0.InterfaceC0533b;
import p232g0.AbstractC4303I;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p292n0.C5762v0;

/* renamed from: n0.y0 */
/* loaded from: classes.dex */
public final class C5768y0 {

    /* renamed from: a */
    public final InterfaceC0117C f21025a;

    /* renamed from: b */
    public final Object f21026b;

    /* renamed from: c */
    public final InterfaceC0145c0[] f21027c;

    /* renamed from: d */
    public boolean f21028d;

    /* renamed from: e */
    public boolean f21029e;

    /* renamed from: f */
    public C5770z0 f21030f;

    /* renamed from: g */
    public boolean f21031g;

    /* renamed from: h */
    public final boolean[] f21032h;

    /* renamed from: i */
    public final InterfaceC5707X0[] f21033i;

    /* renamed from: j */
    public final AbstractC0349D f21034j;

    /* renamed from: k */
    public final C5694Q0 f21035k;

    /* renamed from: l */
    public C5768y0 f21036l;

    /* renamed from: m */
    public C0165m0 f21037m;

    /* renamed from: n */
    public C0350E f21038n;

    /* renamed from: o */
    public long f21039o;

    /* renamed from: n0.y0$a */
    public interface a {
        /* renamed from: a */
        C5768y0 mo24178a(C5770z0 c5770z0, long j7);
    }

    public C5768y0(InterfaceC5707X0[] interfaceC5707X0Arr, long j7, AbstractC0349D abstractC0349D, InterfaceC0533b interfaceC0533b, C5694Q0 c5694q0, C5770z0 c5770z0, C0350E c0350e) {
        this.f21033i = interfaceC5707X0Arr;
        this.f21039o = j7;
        this.f21034j = abstractC0349D;
        this.f21035k = c5694q0;
        InterfaceC0120F.b bVar = c5770z0.f21041a;
        this.f21026b = bVar.f367a;
        this.f21030f = c5770z0;
        this.f21037m = C0165m0.f683d;
        this.f21038n = c0350e;
        this.f21027c = new InterfaceC0145c0[interfaceC5707X0Arr.length];
        this.f21032h = new boolean[interfaceC5707X0Arr.length];
        this.f21025a = m24386f(bVar, c5694q0, interfaceC0533b, c5770z0.f21042b, c5770z0.f21044d);
    }

    /* renamed from: f */
    public static InterfaceC0117C m24386f(InterfaceC0120F.b bVar, C5694Q0 c5694q0, InterfaceC0533b interfaceC0533b, long j7, long j8) {
        InterfaceC0117C m23814h = c5694q0.m23814h(bVar, interfaceC0533b, j7);
        return j8 != -9223372036854775807L ? new C0148e(m23814h, true, 0L, j8) : m23814h;
    }

    /* renamed from: w */
    public static void m24387w(C5694Q0 c5694q0, InterfaceC0117C interfaceC0117C) {
        try {
            if (interfaceC0117C instanceof C0148e) {
                c5694q0.m23827z(((C0148e) interfaceC0117C).f575a);
            } else {
                c5694q0.m23827z(interfaceC0117C);
            }
        } catch (RuntimeException e7) {
            AbstractC5346o.m21863d("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* renamed from: A */
    public long m24388A(long j7) {
        return j7 - m24402m();
    }

    /* renamed from: B */
    public long m24389B(long j7) {
        return j7 + m24402m();
    }

    /* renamed from: C */
    public void m24390C() {
        InterfaceC0117C interfaceC0117C = this.f21025a;
        if (interfaceC0117C instanceof C0148e) {
            long j7 = this.f21030f.f21044d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            ((C0148e) interfaceC0117C).m596w(0L, j7);
        }
    }

    /* renamed from: a */
    public long m24391a(C0350E c0350e, long j7, boolean z6) {
        return m24392b(c0350e, j7, z6, new boolean[this.f21033i.length]);
    }

    /* renamed from: b */
    public long m24392b(C0350E c0350e, long j7, boolean z6, boolean[] zArr) {
        int i7 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= c0350e.f1301a) {
                break;
            }
            boolean[] zArr2 = this.f21032h;
            if (z6 || !c0350e.m1385b(this.f21038n, i7)) {
                z7 = false;
            }
            zArr2[i7] = z7;
            i7++;
        }
        m24397h(this.f21027c);
        m24396g();
        this.f21038n = c0350e;
        m24398i();
        long mo316n = this.f21025a.mo316n(c0350e.f1303c, this.f21032h, this.f21027c, zArr, j7);
        m24393c(this.f21027c);
        this.f21029e = false;
        int i8 = 0;
        while (true) {
            InterfaceC0145c0[] interfaceC0145c0Arr = this.f21027c;
            if (i8 >= interfaceC0145c0Arr.length) {
                return mo316n;
            }
            if (interfaceC0145c0Arr[i8] != null) {
                AbstractC5332a.m21802g(c0350e.m1386c(i8));
                if (this.f21033i[i8].mo23907j() != -2) {
                    this.f21029e = true;
                }
            } else {
                AbstractC5332a.m21802g(c0350e.f1303c[i8] == null);
            }
            i8++;
        }
    }

    /* renamed from: c */
    public final void m24393c(InterfaceC0145c0[] interfaceC0145c0Arr) {
        int i7 = 0;
        while (true) {
            InterfaceC5707X0[] interfaceC5707X0Arr = this.f21033i;
            if (i7 >= interfaceC5707X0Arr.length) {
                return;
            }
            if (interfaceC5707X0Arr[i7].mo23907j() == -2 && this.f21038n.m1386c(i7)) {
                interfaceC0145c0Arr[i7] = new C0173s();
            }
            i7++;
        }
    }

    /* renamed from: d */
    public boolean m24394d(C5770z0 c5770z0) {
        if (C5664B0.m23751d(this.f21030f.f21045e, c5770z0.f21045e)) {
            C5770z0 c5770z02 = this.f21030f;
            if (c5770z02.f21042b == c5770z0.f21042b && c5770z02.f21041a.equals(c5770z0.f21041a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m24395e(long j7, float f7, long j8) {
        AbstractC5332a.m21802g(m24409t());
        this.f21025a.mo311e(new C5762v0.b().m24371f(m24388A(j7)).m24372g(f7).m24370e(j8).m24369d());
    }

    /* renamed from: g */
    public final void m24396g() {
        if (!m24409t()) {
            return;
        }
        int i7 = 0;
        while (true) {
            C0350E c0350e = this.f21038n;
            if (i7 >= c0350e.f1301a) {
                return;
            }
            boolean m1386c = c0350e.m1386c(i7);
            InterfaceC0375y interfaceC0375y = this.f21038n.f1303c[i7];
            if (m1386c && interfaceC0375y != null) {
                interfaceC0375y.mo394h();
            }
            i7++;
        }
    }

    /* renamed from: h */
    public final void m24397h(InterfaceC0145c0[] interfaceC0145c0Arr) {
        int i7 = 0;
        while (true) {
            InterfaceC5707X0[] interfaceC5707X0Arr = this.f21033i;
            if (i7 >= interfaceC5707X0Arr.length) {
                return;
            }
            if (interfaceC5707X0Arr[i7].mo23907j() == -2) {
                interfaceC0145c0Arr[i7] = null;
            }
            i7++;
        }
    }

    /* renamed from: i */
    public final void m24398i() {
        if (!m24409t()) {
            return;
        }
        int i7 = 0;
        while (true) {
            C0350E c0350e = this.f21038n;
            if (i7 >= c0350e.f1301a) {
                return;
            }
            boolean m1386c = c0350e.m1386c(i7);
            InterfaceC0375y interfaceC0375y = this.f21038n.f1303c[i7];
            if (m1386c && interfaceC0375y != null) {
                interfaceC0375y.mo399m();
            }
            i7++;
        }
    }

    /* renamed from: j */
    public long m24399j() {
        if (!this.f21028d) {
            return this.f21030f.f21042b;
        }
        long mo312f = this.f21029e ? this.f21025a.mo312f() : Long.MIN_VALUE;
        return mo312f == Long.MIN_VALUE ? this.f21030f.f21045e : mo312f;
    }

    /* renamed from: k */
    public C5768y0 m24400k() {
        return this.f21036l;
    }

    /* renamed from: l */
    public long m24401l() {
        if (this.f21028d) {
            return this.f21025a.mo309a();
        }
        return 0L;
    }

    /* renamed from: m */
    public long m24402m() {
        return this.f21039o;
    }

    /* renamed from: n */
    public long m24403n() {
        return this.f21030f.f21042b + this.f21039o;
    }

    /* renamed from: o */
    public C0165m0 m24404o() {
        return this.f21037m;
    }

    /* renamed from: p */
    public C0350E m24405p() {
        return this.f21038n;
    }

    /* renamed from: q */
    public void m24406q(float f7, AbstractC4303I abstractC4303I) {
        this.f21028d = true;
        this.f21037m = this.f21025a.mo320t();
        C0350E m24412x = m24412x(f7, abstractC4303I);
        C5770z0 c5770z0 = this.f21030f;
        long j7 = c5770z0.f21042b;
        long j8 = c5770z0.f21045e;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        long m24391a = m24391a(m24412x, j7, false);
        long j9 = this.f21039o;
        C5770z0 c5770z02 = this.f21030f;
        this.f21039o = j9 + (c5770z02.f21042b - m24391a);
        this.f21030f = c5770z02.m24416b(m24391a);
    }

    /* renamed from: r */
    public boolean m24407r() {
        try {
            if (this.f21028d) {
                for (InterfaceC0145c0 interfaceC0145c0 : this.f21027c) {
                    if (interfaceC0145c0 != null) {
                        interfaceC0145c0.mo488c();
                    }
                }
            } else {
                this.f21025a.mo315l();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    /* renamed from: s */
    public boolean m24408s() {
        return this.f21028d && (!this.f21029e || this.f21025a.mo312f() == Long.MIN_VALUE);
    }

    /* renamed from: t */
    public final boolean m24409t() {
        return this.f21036l == null;
    }

    /* renamed from: u */
    public void m24410u(long j7) {
        AbstractC5332a.m21802g(m24409t());
        if (this.f21028d) {
            this.f21025a.mo314h(m24388A(j7));
        }
    }

    /* renamed from: v */
    public void m24411v() {
        m24396g();
        m24387w(this.f21035k, this.f21025a);
    }

    /* renamed from: x */
    public C0350E m24412x(float f7, AbstractC4303I abstractC4303I) {
        C0350E mo1361j = this.f21034j.mo1361j(this.f21033i, m24404o(), this.f21030f.f21041a, abstractC4303I);
        for (int i7 = 0; i7 < mo1361j.f1301a; i7++) {
            if (mo1361j.m1386c(i7)) {
                if (mo1361j.f1303c[i7] == null && this.f21033i[i7].mo23907j() != -2) {
                    r3 = false;
                }
                AbstractC5332a.m21802g(r3);
            } else {
                AbstractC5332a.m21802g(mo1361j.f1303c[i7] == null);
            }
        }
        for (InterfaceC0375y interfaceC0375y : mo1361j.f1303c) {
            if (interfaceC0375y != null) {
                interfaceC0375y.mo406t(f7);
            }
        }
        return mo1361j;
    }

    /* renamed from: y */
    public void m24413y(C5768y0 c5768y0) {
        if (c5768y0 == this.f21036l) {
            return;
        }
        m24396g();
        this.f21036l = c5768y0;
        m24398i();
    }

    /* renamed from: z */
    public void m24414z(long j7) {
        this.f21039o = j7;
    }
}
