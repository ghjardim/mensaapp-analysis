package p328r1;

import p078L0.AbstractC0868c;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.f */
/* loaded from: classes.dex */
public final class C6267f implements InterfaceC6274m {

    /* renamed from: a */
    public final C5356y f22493a;

    /* renamed from: b */
    public final C5357z f22494b;

    /* renamed from: c */
    public final String f22495c;

    /* renamed from: d */
    public final int f22496d;

    /* renamed from: e */
    public String f22497e;

    /* renamed from: f */
    public InterfaceC0861T f22498f;

    /* renamed from: g */
    public int f22499g;

    /* renamed from: h */
    public int f22500h;

    /* renamed from: i */
    public boolean f22501i;

    /* renamed from: j */
    public boolean f22502j;

    /* renamed from: k */
    public long f22503k;

    /* renamed from: l */
    public C4327q f22504l;

    /* renamed from: m */
    public int f22505m;

    /* renamed from: n */
    public long f22506n;

    public C6267f() {
        this(null, 0);
    }

    /* renamed from: f */
    private boolean m26196f(C5357z c5357z, byte[] bArr, int i7) {
        int min = Math.min(c5357z.m21942a(), i7 - this.f22500h);
        c5357z.m21953l(bArr, this.f22500h, min);
        int i8 = this.f22500h + min;
        this.f22500h = i8;
        return i8 == i7;
    }

    /* renamed from: g */
    private void m26197g() {
        this.f22493a.m21916p(0);
        AbstractC0868c.b m3602d = AbstractC0868c.m3602d(this.f22493a);
        C4327q c4327q = this.f22504l;
        if (c4327q == null || m3602d.f3005c != c4327q.f15114B || m3602d.f3004b != c4327q.f15115C || !"audio/ac4".equals(c4327q.f15138n)) {
            C4327q m18234K = new C4327q.b().m18250a0(this.f22497e).m18264o0("audio/ac4").m18237N(m3602d.f3005c).m18265p0(m3602d.f3004b).m18254e0(this.f22495c).m18262m0(this.f22496d).m18234K();
            this.f22504l = m18234K;
            this.f22498f.mo566e(m18234K);
        }
        this.f22505m = m3602d.f3006d;
        this.f22503k = (m3602d.f3007e * 1000000) / this.f22504l.f15115C;
    }

    /* renamed from: h */
    private boolean m26198h(C5357z c5357z) {
        int m21926G;
        while (true) {
            if (c5357z.m21942a() <= 0) {
                return false;
            }
            if (this.f22501i) {
                m21926G = c5357z.m21926G();
                this.f22501i = m21926G == 172;
                if (m21926G == 64 || m21926G == 65) {
                    break;
                }
            } else {
                this.f22501i = c5357z.m21926G() == 172;
            }
        }
        this.f22502j = m21926G == 65;
        return true;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        AbstractC5332a.m21804i(this.f22498f);
        while (c5357z.m21942a() > 0) {
            int i7 = this.f22499g;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(c5357z.m21942a(), this.f22505m - this.f22500h);
                        this.f22498f.mo564d(c5357z, min);
                        int i8 = this.f22500h + min;
                        this.f22500h = i8;
                        if (i8 == this.f22505m) {
                            AbstractC5332a.m21802g(this.f22506n != -9223372036854775807L);
                            this.f22498f.mo562c(this.f22506n, 1, this.f22505m, 0, null);
                            this.f22506n += this.f22503k;
                            this.f22499g = 0;
                        }
                    }
                } else if (m26196f(c5357z, this.f22494b.m21946e(), 16)) {
                    m26197g();
                    this.f22494b.m21939T(0);
                    this.f22498f.mo564d(this.f22494b, 16);
                    this.f22499g = 2;
                }
            } else if (m26198h(c5357z)) {
                this.f22499g = 1;
                this.f22494b.m21946e()[0] = -84;
                this.f22494b.m21946e()[1] = (byte) (this.f22502j ? 65 : 64);
                this.f22500h = 2;
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22499g = 0;
        this.f22500h = 0;
        this.f22501i = false;
        this.f22502j = false;
        this.f22506n = -9223372036854775807L;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22497e = dVar.m26175b();
        this.f22498f = interfaceC0885t.mo455b(dVar.m26176c(), 1);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22506n = j7;
    }

    public C6267f(String str, int i7) {
        C5356y c5356y = new C5356y(new byte[16]);
        this.f22493a = c5356y;
        this.f22494b = new C5357z(c5356y.f18880a);
        this.f22499g = 0;
        this.f22500h = 0;
        this.f22501i = false;
        this.f22502j = false;
        this.f22506n = -9223372036854775807L;
        this.f22495c = str;
        this.f22496d = i7;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
    }
}
