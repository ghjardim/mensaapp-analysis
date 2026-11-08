package p328r1;

import org.apache.tika.fork.ForkServer;
import p078L0.AbstractC0851I;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.t */
/* loaded from: classes.dex */
public final class C6281t implements InterfaceC6274m {

    /* renamed from: a */
    public final C5357z f22720a;

    /* renamed from: b */
    public final AbstractC0851I.a f22721b;

    /* renamed from: c */
    public final String f22722c;

    /* renamed from: d */
    public final int f22723d;

    /* renamed from: e */
    public InterfaceC0861T f22724e;

    /* renamed from: f */
    public String f22725f;

    /* renamed from: g */
    public int f22726g;

    /* renamed from: h */
    public int f22727h;

    /* renamed from: i */
    public boolean f22728i;

    /* renamed from: j */
    public boolean f22729j;

    /* renamed from: k */
    public long f22730k;

    /* renamed from: l */
    public int f22731l;

    /* renamed from: m */
    public long f22732m;

    public C6281t() {
        this(null, 0);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        AbstractC5332a.m21804i(this.f22724e);
        while (c5357z.m21942a() > 0) {
            int i7 = this.f22726g;
            if (i7 == 0) {
                m26288f(c5357z);
            } else if (i7 == 1) {
                m26290h(c5357z);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                m26289g(c5357z);
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22726g = 0;
        this.f22727h = 0;
        this.f22729j = false;
        this.f22732m = -9223372036854775807L;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22725f = dVar.m26175b();
        this.f22724e = interfaceC0885t.mo455b(dVar.m26176c(), 1);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22732m = j7;
    }

    /* renamed from: f */
    public final void m26288f(C5357z c5357z) {
        byte[] m21946e = c5357z.m21946e();
        int m21948g = c5357z.m21948g();
        for (int m21947f = c5357z.m21947f(); m21947f < m21948g; m21947f++) {
            byte b7 = m21946e[m21947f];
            boolean z6 = (b7 & ForkServer.ERROR) == 255;
            boolean z7 = this.f22729j && (b7 & 224) == 224;
            this.f22729j = z6;
            if (z7) {
                c5357z.m21939T(m21947f + 1);
                this.f22729j = false;
                this.f22720a.m21946e()[1] = m21946e[m21947f];
                this.f22727h = 2;
                this.f22726g = 1;
                return;
            }
        }
        c5357z.m21939T(m21948g);
    }

    /* renamed from: g */
    public final void m26289g(C5357z c5357z) {
        int min = Math.min(c5357z.m21942a(), this.f22731l - this.f22727h);
        this.f22724e.mo564d(c5357z, min);
        int i7 = this.f22727h + min;
        this.f22727h = i7;
        if (i7 < this.f22731l) {
            return;
        }
        AbstractC5332a.m21802g(this.f22732m != -9223372036854775807L);
        this.f22724e.mo562c(this.f22732m, 1, this.f22731l, 0, null);
        this.f22732m += this.f22730k;
        this.f22727h = 0;
        this.f22726g = 0;
    }

    /* renamed from: h */
    public final void m26290h(C5357z c5357z) {
        int min = Math.min(c5357z.m21942a(), 4 - this.f22727h);
        c5357z.m21953l(this.f22720a.m21946e(), this.f22727h, min);
        int i7 = this.f22727h + min;
        this.f22727h = i7;
        if (i7 < 4) {
            return;
        }
        this.f22720a.m21939T(0);
        if (!this.f22721b.m3541a(this.f22720a.m21957p())) {
            this.f22727h = 0;
            this.f22726g = 1;
            return;
        }
        this.f22731l = this.f22721b.f2930c;
        if (!this.f22728i) {
            this.f22730k = (r8.f2934g * 1000000) / r8.f2931d;
            this.f22724e.mo566e(new C4327q.b().m18250a0(this.f22725f).m18264o0(this.f22721b.f2929b).m18255f0(4096).m18237N(this.f22721b.f2932e).m18265p0(this.f22721b.f2931d).m18254e0(this.f22722c).m18262m0(this.f22723d).m18234K());
            this.f22728i = true;
        }
        this.f22720a.m21939T(0);
        this.f22724e.mo564d(this.f22720a, 4);
        this.f22726g = 2;
    }

    public C6281t(String str, int i7) {
        this.f22726g = 0;
        C5357z c5357z = new C5357z(4);
        this.f22720a = c5357z;
        c5357z.m21946e()[0] = -1;
        this.f22721b = new AbstractC0851I.a();
        this.f22732m = -9223372036854775807L;
        this.f22722c = str;
        this.f22723d = i7;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
    }
}
