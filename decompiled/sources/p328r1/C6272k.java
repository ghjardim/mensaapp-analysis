package p328r1;

import java.util.concurrent.atomic.AtomicInteger;
import p078L0.AbstractC0881p;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p203c3.AbstractC3577g;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.k */
/* loaded from: classes.dex */
public final class C6272k implements InterfaceC6274m {

    /* renamed from: a */
    public final C5357z f22545a;

    /* renamed from: c */
    public final String f22547c;

    /* renamed from: d */
    public final int f22548d;

    /* renamed from: e */
    public String f22549e;

    /* renamed from: f */
    public InterfaceC0861T f22550f;

    /* renamed from: h */
    public int f22552h;

    /* renamed from: i */
    public int f22553i;

    /* renamed from: j */
    public long f22554j;

    /* renamed from: k */
    public C4327q f22555k;

    /* renamed from: l */
    public int f22556l;

    /* renamed from: m */
    public int f22557m;

    /* renamed from: g */
    public int f22551g = 0;

    /* renamed from: p */
    public long f22560p = -9223372036854775807L;

    /* renamed from: b */
    public final AtomicInteger f22546b = new AtomicInteger();

    /* renamed from: n */
    public int f22558n = -1;

    /* renamed from: o */
    public int f22559o = -1;

    public C6272k(String str, int i7, int i8) {
        this.f22545a = new C5357z(new byte[i8]);
        this.f22547c = str;
        this.f22548d = i7;
    }

    /* renamed from: f */
    private boolean m26228f(C5357z c5357z, byte[] bArr, int i7) {
        int min = Math.min(c5357z.m21942a(), i7 - this.f22552h);
        c5357z.m21953l(bArr, this.f22552h, min);
        int i8 = this.f22552h + min;
        this.f22552h = i8;
        return i8 == i7;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        AbstractC5332a.m21804i(this.f22550f);
        while (c5357z.m21942a() > 0) {
            switch (this.f22551g) {
                case 0:
                    if (!m26232j(c5357z)) {
                        break;
                    } else {
                        int i7 = this.f22557m;
                        if (i7 != 3 && i7 != 4) {
                            if (i7 != 1) {
                                this.f22551g = 2;
                                break;
                            } else {
                                this.f22551g = 1;
                                break;
                            }
                        } else {
                            this.f22551g = 4;
                            break;
                        }
                    }
                case 1:
                    if (!m26228f(c5357z, this.f22545a.m21946e(), 18)) {
                        break;
                    } else {
                        m26229g();
                        this.f22545a.m21939T(0);
                        this.f22550f.mo564d(this.f22545a, 18);
                        this.f22551g = 6;
                        break;
                    }
                case 2:
                    if (!m26228f(c5357z, this.f22545a.m21946e(), 7)) {
                        break;
                    } else {
                        this.f22558n = AbstractC0881p.m3683j(this.f22545a.m21946e());
                        this.f22551g = 3;
                        break;
                    }
                case 3:
                    if (!m26228f(c5357z, this.f22545a.m21946e(), this.f22558n)) {
                        break;
                    } else {
                        m26230h();
                        this.f22545a.m21939T(0);
                        this.f22550f.mo564d(this.f22545a, this.f22558n);
                        this.f22551g = 6;
                        break;
                    }
                case 4:
                    if (!m26228f(c5357z, this.f22545a.m21946e(), 6)) {
                        break;
                    } else {
                        int m3685l = AbstractC0881p.m3685l(this.f22545a.m21946e());
                        this.f22559o = m3685l;
                        int i8 = this.f22552h;
                        if (i8 > m3685l) {
                            int i9 = i8 - m3685l;
                            this.f22552h = i8 - i9;
                            c5357z.m21939T(c5357z.m21947f() - i9);
                        }
                        this.f22551g = 5;
                        break;
                    }
                case 5:
                    if (!m26228f(c5357z, this.f22545a.m21946e(), this.f22559o)) {
                        break;
                    } else {
                        m26231i();
                        this.f22545a.m21939T(0);
                        this.f22550f.mo564d(this.f22545a, this.f22559o);
                        this.f22551g = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(c5357z.m21942a(), this.f22556l - this.f22552h);
                    this.f22550f.mo564d(c5357z, min);
                    int i10 = this.f22552h + min;
                    this.f22552h = i10;
                    if (i10 == this.f22556l) {
                        AbstractC5332a.m21802g(this.f22560p != -9223372036854775807L);
                        this.f22550f.mo562c(this.f22560p, this.f22557m == 4 ? 0 : 1, this.f22556l, 0, null);
                        this.f22560p += this.f22554j;
                        this.f22551g = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22551g = 0;
        this.f22552h = 0;
        this.f22553i = 0;
        this.f22560p = -9223372036854775807L;
        this.f22546b.set(0);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22549e = dVar.m26175b();
        this.f22550f = interfaceC0885t.mo455b(dVar.m26176c(), 1);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22560p = j7;
    }

    /* renamed from: g */
    public final void m26229g() {
        byte[] m21946e = this.f22545a.m21946e();
        if (this.f22555k == null) {
            C4327q m3681h = AbstractC0881p.m3681h(m21946e, this.f22549e, this.f22547c, this.f22548d, null);
            this.f22555k = m3681h;
            this.f22550f.mo566e(m3681h);
        }
        this.f22556l = AbstractC0881p.m3675b(m21946e);
        this.f22554j = AbstractC3577g.m14421d(AbstractC5330M.m21716W0(AbstractC0881p.m3680g(m21946e), this.f22555k.f15115C));
    }

    /* renamed from: h */
    public final void m26230h() {
        AbstractC0881p.b m3682i = AbstractC0881p.m3682i(this.f22545a.m21946e());
        m26233k(m3682i);
        this.f22556l = m3682i.f3101d;
        long j7 = m3682i.f3102e;
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        this.f22554j = j7;
    }

    /* renamed from: i */
    public final void m26231i() {
        AbstractC0881p.b m3684k = AbstractC0881p.m3684k(this.f22545a.m21946e(), this.f22546b);
        if (this.f22557m == 3) {
            m26233k(m3684k);
        }
        this.f22556l = m3684k.f3101d;
        long j7 = m3684k.f3102e;
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        this.f22554j = j7;
    }

    /* renamed from: j */
    public final boolean m26232j(C5357z c5357z) {
        while (c5357z.m21942a() > 0) {
            int i7 = this.f22553i << 8;
            this.f22553i = i7;
            int m21926G = i7 | c5357z.m21926G();
            this.f22553i = m21926G;
            int m3676c = AbstractC0881p.m3676c(m21926G);
            this.f22557m = m3676c;
            if (m3676c != 0) {
                byte[] m21946e = this.f22545a.m21946e();
                int i8 = this.f22553i;
                m21946e[0] = (byte) ((i8 >> 24) & 255);
                m21946e[1] = (byte) ((i8 >> 16) & 255);
                m21946e[2] = (byte) ((i8 >> 8) & 255);
                m21946e[3] = (byte) (i8 & 255);
                this.f22552h = 4;
                this.f22553i = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void m26233k(AbstractC0881p.b bVar) {
        int i7;
        int i8 = bVar.f3099b;
        if (i8 == -2147483647 || (i7 = bVar.f3100c) == -1) {
            return;
        }
        C4327q c4327q = this.f22555k;
        if (c4327q != null && i7 == c4327q.f15114B && i8 == c4327q.f15115C && AbstractC5330M.m21729c(bVar.f3098a, c4327q.f15138n)) {
            return;
        }
        C4327q c4327q2 = this.f22555k;
        C4327q m18234K = (c4327q2 == null ? new C4327q.b() : c4327q2.m18193a()).m18250a0(this.f22549e).m18264o0(bVar.f3098a).m18237N(bVar.f3100c).m18265p0(bVar.f3099b).m18254e0(this.f22547c).m18262m0(this.f22548d).m18234K();
        this.f22555k = m18234K;
        this.f22550f.mo566e(m18234K);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
    }
}
