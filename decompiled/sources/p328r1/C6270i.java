package p328r1;

import java.util.Arrays;
import java.util.Collections;
import org.apache.tika.fork.ForkServer;
import p078L0.AbstractC0866a;
import p078L0.C0879n;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.i */
/* loaded from: classes.dex */
public final class C6270i implements InterfaceC6274m {

    /* renamed from: w */
    public static final byte[] f22520w = {73, 68, 51};

    /* renamed from: a */
    public final boolean f22521a;

    /* renamed from: b */
    public final C5356y f22522b;

    /* renamed from: c */
    public final C5357z f22523c;

    /* renamed from: d */
    public final String f22524d;

    /* renamed from: e */
    public final int f22525e;

    /* renamed from: f */
    public String f22526f;

    /* renamed from: g */
    public InterfaceC0861T f22527g;

    /* renamed from: h */
    public InterfaceC0861T f22528h;

    /* renamed from: i */
    public int f22529i;

    /* renamed from: j */
    public int f22530j;

    /* renamed from: k */
    public int f22531k;

    /* renamed from: l */
    public boolean f22532l;

    /* renamed from: m */
    public boolean f22533m;

    /* renamed from: n */
    public int f22534n;

    /* renamed from: o */
    public int f22535o;

    /* renamed from: p */
    public int f22536p;

    /* renamed from: q */
    public boolean f22537q;

    /* renamed from: r */
    public long f22538r;

    /* renamed from: s */
    public int f22539s;

    /* renamed from: t */
    public long f22540t;

    /* renamed from: u */
    public InterfaceC0861T f22541u;

    /* renamed from: v */
    public long f22542v;

    public C6270i(boolean z6) {
        this(z6, null, 0);
    }

    /* renamed from: i */
    private boolean m26206i(C5357z c5357z, byte[] bArr, int i7) {
        int min = Math.min(c5357z.m21942a(), i7 - this.f22530j);
        c5357z.m21953l(bArr, this.f22530j, min);
        int i8 = this.f22530j + min;
        this.f22530j = i8;
        return i8 == i7;
    }

    /* renamed from: m */
    public static boolean m26207m(int i7) {
        return (i7 & 65526) == 65520;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        m26208f();
        while (c5357z.m21942a() > 0) {
            int i7 = this.f22529i;
            if (i7 == 0) {
                m26211j(c5357z);
            } else if (i7 == 1) {
                m26209g(c5357z);
            } else if (i7 != 2) {
                if (i7 == 3) {
                    if (m26206i(c5357z, this.f22522b.f18880a, this.f22532l ? 7 : 5)) {
                        m26214n();
                    }
                } else {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    m26216p(c5357z);
                }
            } else if (m26206i(c5357z, this.f22523c.m21946e(), 10)) {
                m26215o();
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22540t = -9223372036854775807L;
        m26217q();
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22526f = dVar.m26175b();
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(dVar.m26176c(), 1);
        this.f22527g = mo455b;
        this.f22541u = mo455b;
        if (!this.f22521a) {
            this.f22528h = new C0879n();
            return;
        }
        dVar.m26174a();
        InterfaceC0861T mo455b2 = interfaceC0885t.mo455b(dVar.m26176c(), 5);
        this.f22528h = mo455b2;
        mo455b2.mo566e(new C4327q.b().m18250a0(dVar.m26175b()).m18264o0("application/id3").m18234K());
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22540t = j7;
    }

    /* renamed from: f */
    public final void m26208f() {
        AbstractC5332a.m21800e(this.f22527g);
        AbstractC5330M.m21747i(this.f22541u);
        AbstractC5330M.m21747i(this.f22528h);
    }

    /* renamed from: g */
    public final void m26209g(C5357z c5357z) {
        if (c5357z.m21942a() == 0) {
            return;
        }
        this.f22522b.f18880a[0] = c5357z.m21946e()[c5357z.m21947f()];
        this.f22522b.m21916p(2);
        int m21908h = this.f22522b.m21908h(4);
        int i7 = this.f22535o;
        if (i7 != -1 && m21908h != i7) {
            m26217q();
            return;
        }
        if (!this.f22533m) {
            this.f22533m = true;
            this.f22534n = this.f22536p;
            this.f22535o = m21908h;
        }
        m26220t();
    }

    /* renamed from: h */
    public final boolean m26210h(C5357z c5357z, int i7) {
        c5357z.m21939T(i7 + 1);
        if (!m26223w(c5357z, this.f22522b.f18880a, 1)) {
            return false;
        }
        this.f22522b.m21916p(4);
        int m21908h = this.f22522b.m21908h(1);
        int i8 = this.f22534n;
        if (i8 != -1 && m21908h != i8) {
            return false;
        }
        if (this.f22535o != -1) {
            if (!m26223w(c5357z, this.f22522b.f18880a, 1)) {
                return true;
            }
            this.f22522b.m21916p(2);
            if (this.f22522b.m21908h(4) != this.f22535o) {
                return false;
            }
            c5357z.m21939T(i7 + 2);
        }
        if (!m26223w(c5357z, this.f22522b.f18880a, 4)) {
            return true;
        }
        this.f22522b.m21916p(14);
        int m21908h2 = this.f22522b.m21908h(13);
        if (m21908h2 < 7) {
            return false;
        }
        byte[] m21946e = c5357z.m21946e();
        int m21948g = c5357z.m21948g();
        int i9 = i7 + m21908h2;
        if (i9 >= m21948g) {
            return true;
        }
        byte b7 = m21946e[i9];
        if (b7 == -1) {
            int i10 = i9 + 1;
            if (i10 == m21948g) {
                return true;
            }
            return m26213l((byte) -1, m21946e[i10]) && ((m21946e[i10] & 8) >> 3) == m21908h;
        }
        if (b7 != 73) {
            return false;
        }
        int i11 = i9 + 1;
        if (i11 == m21948g) {
            return true;
        }
        if (m21946e[i11] != 68) {
            return false;
        }
        int i12 = i9 + 2;
        return i12 == m21948g || m21946e[i12] == 51;
    }

    /* renamed from: j */
    public final void m26211j(C5357z c5357z) {
        byte[] m21946e = c5357z.m21946e();
        int m21947f = c5357z.m21947f();
        int m21948g = c5357z.m21948g();
        while (m21947f < m21948g) {
            int i7 = m21947f + 1;
            byte b7 = m21946e[m21947f];
            int i8 = b7 & ForkServer.ERROR;
            if (this.f22531k == 512 && m26213l((byte) -1, (byte) i8) && (this.f22533m || m26210h(c5357z, m21947f - 1))) {
                this.f22536p = (b7 & 8) >> 3;
                this.f22532l = (b7 & 1) == 0;
                if (this.f22533m) {
                    m26220t();
                } else {
                    m26218r();
                }
                c5357z.m21939T(i7);
                return;
            }
            int i9 = this.f22531k;
            int i10 = i8 | i9;
            if (i10 == 329) {
                this.f22531k = 768;
            } else if (i10 == 511) {
                this.f22531k = 512;
            } else if (i10 == 836) {
                this.f22531k = 1024;
            } else if (i10 == 1075) {
                m26221u();
                c5357z.m21939T(i7);
                return;
            } else if (i9 != 256) {
                this.f22531k = 256;
            }
            m21947f = i7;
        }
        c5357z.m21939T(m21947f);
    }

    /* renamed from: k */
    public long m26212k() {
        return this.f22538r;
    }

    /* renamed from: l */
    public final boolean m26213l(byte b7, byte b8) {
        return m26207m(((b7 & ForkServer.ERROR) << 8) | (b8 & ForkServer.ERROR));
    }

    /* renamed from: n */
    public final void m26214n() {
        this.f22522b.m21916p(0);
        if (this.f22537q) {
            this.f22522b.m21918r(10);
        } else {
            int i7 = 2;
            int m21908h = this.f22522b.m21908h(2) + 1;
            if (m21908h != 2) {
                AbstractC5346o.m21867h("AdtsReader", "Detected audio object type: " + m21908h + ", but assuming AAC LC.");
            } else {
                i7 = m21908h;
            }
            this.f22522b.m21918r(5);
            byte[] m3583b = AbstractC0866a.m3583b(i7, this.f22535o, this.f22522b.m21908h(3));
            AbstractC0866a.b m3587f = AbstractC0866a.m3587f(m3583b);
            C4327q m18234K = new C4327q.b().m18250a0(this.f22526f).m18264o0("audio/mp4a-latm").m18238O(m3587f.f2988c).m18237N(m3587f.f2987b).m18265p0(m3587f.f2986a).m18251b0(Collections.singletonList(m3583b)).m18254e0(this.f22524d).m18262m0(this.f22525e).m18234K();
            this.f22538r = 1024000000 / m18234K.f15115C;
            this.f22527g.mo566e(m18234K);
            this.f22537q = true;
        }
        this.f22522b.m21918r(4);
        int m21908h2 = this.f22522b.m21908h(13);
        int i8 = m21908h2 - 7;
        if (this.f22532l) {
            i8 = m21908h2 - 9;
        }
        m26222v(this.f22527g, this.f22538r, 0, i8);
    }

    /* renamed from: o */
    public final void m26215o() {
        this.f22528h.mo564d(this.f22523c, 10);
        this.f22523c.m21939T(6);
        m26222v(this.f22528h, 0L, 10, this.f22523c.m21925F() + 10);
    }

    /* renamed from: p */
    public final void m26216p(C5357z c5357z) {
        int min = Math.min(c5357z.m21942a(), this.f22539s - this.f22530j);
        this.f22541u.mo564d(c5357z, min);
        int i7 = this.f22530j + min;
        this.f22530j = i7;
        if (i7 == this.f22539s) {
            AbstractC5332a.m21802g(this.f22540t != -9223372036854775807L);
            this.f22541u.mo562c(this.f22540t, 1, this.f22539s, 0, null);
            this.f22540t += this.f22542v;
            m26219s();
        }
    }

    /* renamed from: q */
    public final void m26217q() {
        this.f22533m = false;
        m26219s();
    }

    /* renamed from: r */
    public final void m26218r() {
        this.f22529i = 1;
        this.f22530j = 0;
    }

    /* renamed from: s */
    public final void m26219s() {
        this.f22529i = 0;
        this.f22530j = 0;
        this.f22531k = 256;
    }

    /* renamed from: t */
    public final void m26220t() {
        this.f22529i = 3;
        this.f22530j = 0;
    }

    /* renamed from: u */
    public final void m26221u() {
        this.f22529i = 2;
        this.f22530j = f22520w.length;
        this.f22539s = 0;
        this.f22523c.m21939T(0);
    }

    /* renamed from: v */
    public final void m26222v(InterfaceC0861T interfaceC0861T, long j7, int i7, int i8) {
        this.f22529i = 4;
        this.f22530j = i7;
        this.f22541u = interfaceC0861T;
        this.f22542v = j7;
        this.f22539s = i8;
    }

    /* renamed from: w */
    public final boolean m26223w(C5357z c5357z, byte[] bArr, int i7) {
        if (c5357z.m21942a() < i7) {
            return false;
        }
        c5357z.m21953l(bArr, 0, i7);
        return true;
    }

    public C6270i(boolean z6, String str, int i7) {
        this.f22522b = new C5356y(new byte[7]);
        this.f22523c = new C5357z(Arrays.copyOf(f22520w, 10));
        m26219s();
        this.f22534n = -1;
        this.f22535o = -1;
        this.f22538r = -9223372036854775807L;
        this.f22540t = -9223372036854775807L;
        this.f22521a = z6;
        this.f22524d = str;
        this.f22525e = i7;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
    }
}
