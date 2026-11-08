package p328r1;

import java.util.Collections;
import p078L0.AbstractC0866a;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4295A;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.s */
/* loaded from: classes.dex */
public final class C6280s implements InterfaceC6274m {

    /* renamed from: a */
    public final String f22698a;

    /* renamed from: b */
    public final int f22699b;

    /* renamed from: c */
    public final C5357z f22700c;

    /* renamed from: d */
    public final C5356y f22701d;

    /* renamed from: e */
    public InterfaceC0861T f22702e;

    /* renamed from: f */
    public String f22703f;

    /* renamed from: g */
    public C4327q f22704g;

    /* renamed from: h */
    public int f22705h;

    /* renamed from: i */
    public int f22706i;

    /* renamed from: j */
    public int f22707j;

    /* renamed from: k */
    public int f22708k;

    /* renamed from: l */
    public long f22709l;

    /* renamed from: m */
    public boolean f22710m;

    /* renamed from: n */
    public int f22711n;

    /* renamed from: o */
    public int f22712o;

    /* renamed from: p */
    public int f22713p;

    /* renamed from: q */
    public boolean f22714q;

    /* renamed from: r */
    public long f22715r;

    /* renamed from: s */
    public int f22716s;

    /* renamed from: t */
    public long f22717t;

    /* renamed from: u */
    public int f22718u;

    /* renamed from: v */
    public String f22719v;

    public C6280s(String str, int i7) {
        this.f22698a = str;
        this.f22699b = i7;
        C5357z c5357z = new C5357z(1024);
        this.f22700c = c5357z;
        this.f22701d = new C5356y(c5357z.m21946e());
        this.f22709l = -9223372036854775807L;
    }

    /* renamed from: f */
    public static long m26280f(C5356y c5356y) {
        return c5356y.m21908h((c5356y.m21908h(2) + 1) * 8);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        AbstractC5332a.m21804i(this.f22702e);
        while (c5357z.m21942a() > 0) {
            int i7 = this.f22705h;
            if (i7 != 0) {
                if (i7 == 1) {
                    int m21926G = c5357z.m21926G();
                    if ((m21926G & 224) == 224) {
                        this.f22708k = m21926G;
                        this.f22705h = 2;
                    } else if (m21926G != 86) {
                        this.f22705h = 0;
                    }
                } else if (i7 == 2) {
                    int m21926G2 = ((this.f22708k & (-225)) << 8) | c5357z.m21926G();
                    this.f22707j = m21926G2;
                    if (m21926G2 > this.f22700c.m21946e().length) {
                        m26287m(this.f22707j);
                    }
                    this.f22706i = 0;
                    this.f22705h = 3;
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c5357z.m21942a(), this.f22707j - this.f22706i);
                    c5357z.m21953l(this.f22701d.f18880a, this.f22706i, min);
                    int i8 = this.f22706i + min;
                    this.f22706i = i8;
                    if (i8 == this.f22707j) {
                        this.f22701d.m21916p(0);
                        m26281g(this.f22701d);
                        this.f22705h = 0;
                    }
                }
            } else if (c5357z.m21926G() == 86) {
                this.f22705h = 1;
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22705h = 0;
        this.f22709l = -9223372036854775807L;
        this.f22710m = false;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22702e = interfaceC0885t.mo455b(dVar.m26176c(), 1);
        this.f22703f = dVar.m26175b();
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22709l = j7;
    }

    /* renamed from: g */
    public final void m26281g(C5356y c5356y) {
        if (!c5356y.m21907g()) {
            this.f22710m = true;
            m26286l(c5356y);
        } else if (!this.f22710m) {
            return;
        }
        if (this.f22711n != 0) {
            throw C4295A.m17943a(null, null);
        }
        if (this.f22712o != 0) {
            throw C4295A.m17943a(null, null);
        }
        m26285k(c5356y, m26284j(c5356y));
        if (this.f22714q) {
            c5356y.m21918r((int) this.f22715r);
        }
    }

    /* renamed from: h */
    public final int m26282h(C5356y c5356y) {
        int m21902b = c5356y.m21902b();
        AbstractC0866a.b m3586e = AbstractC0866a.m3586e(c5356y, true);
        this.f22719v = m3586e.f2988c;
        this.f22716s = m3586e.f2986a;
        this.f22718u = m3586e.f2987b;
        return m21902b - c5356y.m21902b();
    }

    /* renamed from: i */
    public final void m26283i(C5356y c5356y) {
        int m21908h = c5356y.m21908h(3);
        this.f22713p = m21908h;
        if (m21908h == 0) {
            c5356y.m21918r(8);
            return;
        }
        if (m21908h == 1) {
            c5356y.m21918r(9);
            return;
        }
        if (m21908h == 3 || m21908h == 4 || m21908h == 5) {
            c5356y.m21918r(6);
        } else {
            if (m21908h != 6 && m21908h != 7) {
                throw new IllegalStateException();
            }
            c5356y.m21918r(1);
        }
    }

    /* renamed from: j */
    public final int m26284j(C5356y c5356y) {
        int m21908h;
        if (this.f22713p != 0) {
            throw C4295A.m17943a(null, null);
        }
        int i7 = 0;
        do {
            m21908h = c5356y.m21908h(8);
            i7 += m21908h;
        } while (m21908h == 255);
        return i7;
    }

    /* renamed from: k */
    public final void m26285k(C5356y c5356y, int i7) {
        int m21905e = c5356y.m21905e();
        if ((m21905e & 7) == 0) {
            this.f22700c.m21939T(m21905e >> 3);
        } else {
            c5356y.m21909i(this.f22700c.m21946e(), 0, i7 * 8);
            this.f22700c.m21939T(0);
        }
        this.f22702e.mo564d(this.f22700c, i7);
        AbstractC5332a.m21802g(this.f22709l != -9223372036854775807L);
        this.f22702e.mo562c(this.f22709l, 1, i7, 0, null);
        this.f22709l += this.f22717t;
    }

    /* renamed from: l */
    public final void m26286l(C5356y c5356y) {
        boolean m21907g;
        int m21908h = c5356y.m21908h(1);
        int m21908h2 = m21908h == 1 ? c5356y.m21908h(1) : 0;
        this.f22711n = m21908h2;
        if (m21908h2 != 0) {
            throw C4295A.m17943a(null, null);
        }
        if (m21908h == 1) {
            m26280f(c5356y);
        }
        if (!c5356y.m21907g()) {
            throw C4295A.m17943a(null, null);
        }
        this.f22712o = c5356y.m21908h(6);
        int m21908h3 = c5356y.m21908h(4);
        int m21908h4 = c5356y.m21908h(3);
        if (m21908h3 != 0 || m21908h4 != 0) {
            throw C4295A.m17943a(null, null);
        }
        if (m21908h == 0) {
            int m21905e = c5356y.m21905e();
            int m26282h = m26282h(c5356y);
            c5356y.m21916p(m21905e);
            byte[] bArr = new byte[(m26282h + 7) / 8];
            c5356y.m21909i(bArr, 0, m26282h);
            C4327q m18234K = new C4327q.b().m18250a0(this.f22703f).m18264o0("audio/mp4a-latm").m18238O(this.f22719v).m18237N(this.f22718u).m18265p0(this.f22716s).m18251b0(Collections.singletonList(bArr)).m18254e0(this.f22698a).m18262m0(this.f22699b).m18234K();
            if (!m18234K.equals(this.f22704g)) {
                this.f22704g = m18234K;
                this.f22717t = 1024000000 / m18234K.f15115C;
                this.f22702e.mo566e(m18234K);
            }
        } else {
            c5356y.m21918r(((int) m26280f(c5356y)) - m26282h(c5356y));
        }
        m26283i(c5356y);
        boolean m21907g2 = c5356y.m21907g();
        this.f22714q = m21907g2;
        this.f22715r = 0L;
        if (m21907g2) {
            if (m21908h == 1) {
                this.f22715r = m26280f(c5356y);
            } else {
                do {
                    m21907g = c5356y.m21907g();
                    this.f22715r = (this.f22715r << 8) + c5356y.m21908h(8);
                } while (m21907g);
            }
        }
        if (c5356y.m21907g()) {
            c5356y.m21918r(8);
        }
    }

    /* renamed from: m */
    public final void m26287m(int i7) {
        this.f22700c.m21935P(i7);
        this.f22701d.m21914n(this.f22700c.m21946e());
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
    }
}
