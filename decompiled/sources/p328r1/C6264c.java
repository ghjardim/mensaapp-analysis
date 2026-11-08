package p328r1;

import p078L0.AbstractC0867b;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.c */
/* loaded from: classes.dex */
public final class C6264c implements InterfaceC6274m {

    /* renamed from: a */
    public final C5356y f22476a;

    /* renamed from: b */
    public final C5357z f22477b;

    /* renamed from: c */
    public final String f22478c;

    /* renamed from: d */
    public final int f22479d;

    /* renamed from: e */
    public String f22480e;

    /* renamed from: f */
    public InterfaceC0861T f22481f;

    /* renamed from: g */
    public int f22482g;

    /* renamed from: h */
    public int f22483h;

    /* renamed from: i */
    public boolean f22484i;

    /* renamed from: j */
    public long f22485j;

    /* renamed from: k */
    public C4327q f22486k;

    /* renamed from: l */
    public int f22487l;

    /* renamed from: m */
    public long f22488m;

    public C6264c() {
        this(null, 0);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        AbstractC5332a.m21804i(this.f22481f);
        while (c5357z.m21942a() > 0) {
            int i7 = this.f22482g;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(c5357z.m21942a(), this.f22487l - this.f22483h);
                        this.f22481f.mo564d(c5357z, min);
                        int i8 = this.f22483h + min;
                        this.f22483h = i8;
                        if (i8 == this.f22487l) {
                            AbstractC5332a.m21802g(this.f22488m != -9223372036854775807L);
                            this.f22481f.mo562c(this.f22488m, 1, this.f22487l, 0, null);
                            this.f22488m += this.f22485j;
                            this.f22482g = 0;
                        }
                    }
                } else if (m26191f(c5357z, this.f22477b.m21946e(), 128)) {
                    m26192g();
                    this.f22477b.m21939T(0);
                    this.f22481f.mo564d(this.f22477b, 128);
                    this.f22482g = 2;
                }
            } else if (m26193h(c5357z)) {
                this.f22482g = 1;
                this.f22477b.m21946e()[0] = 11;
                this.f22477b.m21946e()[1] = 119;
                this.f22483h = 2;
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22482g = 0;
        this.f22483h = 0;
        this.f22484i = false;
        this.f22488m = -9223372036854775807L;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22480e = dVar.m26175b();
        this.f22481f = interfaceC0885t.mo455b(dVar.m26176c(), 1);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22488m = j7;
    }

    /* renamed from: f */
    public final boolean m26191f(C5357z c5357z, byte[] bArr, int i7) {
        int min = Math.min(c5357z.m21942a(), i7 - this.f22483h);
        c5357z.m21953l(bArr, this.f22483h, min);
        int i8 = this.f22483h + min;
        this.f22483h = i8;
        return i8 == i7;
    }

    /* renamed from: g */
    public final void m26192g() {
        this.f22476a.m21916p(0);
        AbstractC0867b.b m3594f = AbstractC0867b.m3594f(this.f22476a);
        C4327q c4327q = this.f22486k;
        if (c4327q == null || m3594f.f2998d != c4327q.f15114B || m3594f.f2997c != c4327q.f15115C || !AbstractC5330M.m21729c(m3594f.f2995a, c4327q.f15138n)) {
            C4327q.b m18259j0 = new C4327q.b().m18250a0(this.f22480e).m18264o0(m3594f.f2995a).m18237N(m3594f.f2998d).m18265p0(m3594f.f2997c).m18254e0(this.f22478c).m18262m0(this.f22479d).m18259j0(m3594f.f3001g);
            if ("audio/ac3".equals(m3594f.f2995a)) {
                m18259j0.m18236M(m3594f.f3001g);
            }
            C4327q m18234K = m18259j0.m18234K();
            this.f22486k = m18234K;
            this.f22481f.mo566e(m18234K);
        }
        this.f22487l = m3594f.f2999e;
        this.f22485j = (m3594f.f3000f * 1000000) / this.f22486k.f15115C;
    }

    /* renamed from: h */
    public final boolean m26193h(C5357z c5357z) {
        while (true) {
            if (c5357z.m21942a() <= 0) {
                return false;
            }
            if (this.f22484i) {
                int m21926G = c5357z.m21926G();
                if (m21926G == 119) {
                    this.f22484i = false;
                    return true;
                }
                this.f22484i = m21926G == 11;
            } else {
                this.f22484i = c5357z.m21926G() == 11;
            }
        }
    }

    public C6264c(String str, int i7) {
        C5356y c5356y = new C5356y(new byte[128]);
        this.f22476a = c5356y;
        this.f22477b = new C5357z(c5356y.f18880a);
        this.f22482g = 0;
        this.f22488m = -9223372036854775807L;
        this.f22478c = str;
        this.f22479d = i7;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
    }
}
