package p328r1;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p178Z2.AbstractC3033v;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.AbstractC6283v;
import p328r1.InterfaceC6259K;

/* renamed from: r1.u */
/* loaded from: classes.dex */
public final class C6282u implements InterfaceC6274m {

    /* renamed from: e */
    public String f22737e;

    /* renamed from: f */
    public InterfaceC0861T f22738f;

    /* renamed from: i */
    public boolean f22741i;

    /* renamed from: k */
    public int f22743k;

    /* renamed from: l */
    public int f22744l;

    /* renamed from: n */
    public int f22746n;

    /* renamed from: o */
    public int f22747o;

    /* renamed from: s */
    public int f22751s;

    /* renamed from: u */
    public boolean f22753u;

    /* renamed from: d */
    public int f22736d = 0;

    /* renamed from: a */
    public final C5357z f22733a = new C5357z(new byte[15], 2);

    /* renamed from: b */
    public final C5356y f22734b = new C5356y();

    /* renamed from: c */
    public final C5357z f22735c = new C5357z();

    /* renamed from: p */
    public AbstractC6283v.b f22748p = new AbstractC6283v.b();

    /* renamed from: q */
    public int f22749q = -2147483647;

    /* renamed from: r */
    public int f22750r = -1;

    /* renamed from: t */
    public long f22752t = -1;

    /* renamed from: j */
    public boolean f22742j = true;

    /* renamed from: m */
    public boolean f22745m = true;

    /* renamed from: g */
    public double f22739g = -9.223372036854776E18d;

    /* renamed from: h */
    public double f22740h = -9.223372036854776E18d;

    /* renamed from: k */
    private boolean m26291k(C5357z c5357z) {
        int i7 = this.f22743k;
        if ((i7 & 2) == 0) {
            c5357z.m21939T(c5357z.m21948g());
            return false;
        }
        if ((i7 & 4) != 0) {
            return true;
        }
        while (c5357z.m21942a() > 0) {
            int i8 = this.f22744l << 8;
            this.f22744l = i8;
            int m21926G = i8 | c5357z.m21926G();
            this.f22744l = m21926G;
            if (AbstractC6283v.m26302e(m21926G)) {
                c5357z.m21939T(c5357z.m21947f() - 3);
                this.f22744l = 0;
                return true;
            }
        }
        return false;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        AbstractC5332a.m21804i(this.f22738f);
        while (c5357z.m21942a() > 0) {
            int i7 = this.f22736d;
            if (i7 != 0) {
                if (i7 == 1) {
                    m26292f(c5357z, this.f22733a, false);
                    if (this.f22733a.m21942a() != 0) {
                        this.f22745m = false;
                    } else if (m26295i()) {
                        this.f22733a.m21939T(0);
                        InterfaceC0861T interfaceC0861T = this.f22738f;
                        C5357z c5357z2 = this.f22733a;
                        interfaceC0861T.mo564d(c5357z2, c5357z2.m21948g());
                        this.f22733a.m21935P(2);
                        this.f22735c.m21935P(this.f22748p.f22756c);
                        this.f22745m = true;
                        this.f22736d = 2;
                    } else if (this.f22733a.m21948g() < 15) {
                        C5357z c5357z3 = this.f22733a;
                        c5357z3.m21938S(c5357z3.m21948g() + 1);
                        this.f22745m = false;
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException();
                    }
                    if (m26296j(this.f22748p.f22754a)) {
                        m26292f(c5357z, this.f22735c, true);
                    }
                    m26297l(c5357z);
                    int i8 = this.f22746n;
                    AbstractC6283v.b bVar = this.f22748p;
                    if (i8 == bVar.f22756c) {
                        int i9 = bVar.f22754a;
                        if (i9 == 1) {
                            m26294h(new C5356y(this.f22735c.m21946e()));
                        } else if (i9 == 17) {
                            this.f22751s = AbstractC6283v.m26303f(new C5356y(this.f22735c.m21946e()));
                        } else if (i9 == 2) {
                            m26293g();
                        }
                        this.f22736d = 1;
                    }
                }
            } else if (m26291k(c5357z)) {
                this.f22736d = 1;
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22736d = 0;
        this.f22744l = 0;
        this.f22733a.m21935P(2);
        this.f22746n = 0;
        this.f22747o = 0;
        this.f22749q = -2147483647;
        this.f22750r = -1;
        this.f22751s = 0;
        this.f22752t = -1L;
        this.f22753u = false;
        this.f22741i = false;
        this.f22745m = true;
        this.f22742j = true;
        this.f22739g = -9.223372036854776E18d;
        this.f22740h = -9.223372036854776E18d;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22737e = dVar.m26175b();
        this.f22738f = interfaceC0885t.mo455b(dVar.m26176c(), 1);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22743k = i7;
        if (!this.f22742j && (this.f22747o != 0 || !this.f22745m)) {
            this.f22741i = true;
        }
        if (j7 != -9223372036854775807L) {
            if (this.f22741i) {
                this.f22740h = j7;
            } else {
                this.f22739g = j7;
            }
        }
    }

    /* renamed from: f */
    public final void m26292f(C5357z c5357z, C5357z c5357z2, boolean z6) {
        int m21947f = c5357z.m21947f();
        int min = Math.min(c5357z.m21942a(), c5357z2.m21942a());
        c5357z.m21953l(c5357z2.m21946e(), c5357z2.m21947f(), min);
        c5357z2.m21940U(min);
        if (z6) {
            c5357z.m21939T(m21947f);
        }
    }

    /* renamed from: g */
    public final void m26293g() {
        int i7;
        if (this.f22753u) {
            this.f22742j = false;
            i7 = 1;
        } else {
            i7 = 0;
        }
        double d7 = ((this.f22750r - this.f22751s) * 1000000.0d) / this.f22749q;
        long round = Math.round(this.f22739g);
        if (this.f22741i) {
            this.f22741i = false;
            this.f22739g = this.f22740h;
        } else {
            this.f22739g += d7;
        }
        this.f22738f.mo562c(round, i7, this.f22747o, 0, null);
        this.f22753u = false;
        this.f22751s = 0;
        this.f22747o = 0;
    }

    /* renamed from: h */
    public final void m26294h(C5356y c5356y) {
        AbstractC6283v.c m26305h = AbstractC6283v.m26305h(c5356y);
        this.f22749q = m26305h.f22758b;
        this.f22750r = m26305h.f22759c;
        long j7 = this.f22752t;
        long j8 = this.f22748p.f22755b;
        if (j7 != j8) {
            this.f22752t = j8;
            String str = "mhm1";
            if (m26305h.f22757a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(m26305h.f22757a));
            }
            byte[] bArr = m26305h.f22760d;
            this.f22738f.mo566e(new C4327q.b().m18250a0(this.f22737e).m18264o0("audio/mhm1").m18265p0(this.f22749q).m18238O(str).m18251b0((bArr == null || bArr.length <= 0) ? null : AbstractC3033v.m11052w(AbstractC5330M.f18805f, bArr)).m18234K());
        }
        this.f22753u = true;
    }

    /* renamed from: i */
    public final boolean m26295i() {
        int m21948g = this.f22733a.m21948g();
        this.f22734b.m21915o(this.f22733a.m21946e(), m21948g);
        boolean m26304g = AbstractC6283v.m26304g(this.f22734b, this.f22748p);
        if (m26304g) {
            this.f22746n = 0;
            this.f22747o += this.f22748p.f22756c + m21948g;
        }
        return m26304g;
    }

    /* renamed from: j */
    public final boolean m26296j(int i7) {
        return i7 == 1 || i7 == 17;
    }

    /* renamed from: l */
    public final void m26297l(C5357z c5357z) {
        int min = Math.min(c5357z.m21942a(), this.f22748p.f22756c - this.f22746n);
        this.f22738f.mo564d(c5357z, min);
        this.f22746n += min;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
    }
}
