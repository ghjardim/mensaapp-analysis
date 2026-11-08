package p092N0;

import java.util.Arrays;
import p078L0.C0856N;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0884s;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: N0.e */
/* loaded from: classes.dex */
public final class C1246e {

    /* renamed from: a */
    public final InterfaceC0861T f3949a;

    /* renamed from: b */
    public final int f3950b;

    /* renamed from: c */
    public final int f3951c;

    /* renamed from: d */
    public final long f3952d;

    /* renamed from: e */
    public final int f3953e;

    /* renamed from: f */
    public int f3954f;

    /* renamed from: g */
    public int f3955g;

    /* renamed from: h */
    public int f3956h;

    /* renamed from: i */
    public int f3957i;

    /* renamed from: j */
    public int f3958j;

    /* renamed from: k */
    public long[] f3959k;

    /* renamed from: l */
    public int[] f3960l;

    public C1246e(int i7, int i8, long j7, int i9, InterfaceC0861T interfaceC0861T) {
        boolean z6 = true;
        if (i8 != 1 && i8 != 2) {
            z6 = false;
        }
        AbstractC5332a.m21796a(z6);
        this.f3952d = j7;
        this.f3953e = i9;
        this.f3949a = interfaceC0861T;
        this.f3950b = m4773d(i7, i8 == 2 ? 1667497984 : 1651965952);
        this.f3951c = i8 == 2 ? m4773d(i7, 1650720768) : -1;
        this.f3959k = new long[512];
        this.f3960l = new int[512];
    }

    /* renamed from: d */
    public static int m4773d(int i7, int i8) {
        return (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48) | i8;
    }

    /* renamed from: a */
    public void m4774a() {
        this.f3956h++;
    }

    /* renamed from: b */
    public void m4775b(long j7) {
        if (this.f3958j == this.f3960l.length) {
            long[] jArr = this.f3959k;
            this.f3959k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f3960l;
            this.f3960l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f3959k;
        int i7 = this.f3958j;
        jArr2[i7] = j7;
        this.f3960l[i7] = this.f3957i;
        this.f3958j = i7 + 1;
    }

    /* renamed from: c */
    public void m4776c() {
        this.f3959k = Arrays.copyOf(this.f3959k, this.f3958j);
        this.f3960l = Arrays.copyOf(this.f3960l, this.f3958j);
    }

    /* renamed from: e */
    public final long m4777e(int i7) {
        return (this.f3952d * i7) / this.f3953e;
    }

    /* renamed from: f */
    public long m4778f() {
        return m4777e(this.f3956h);
    }

    /* renamed from: g */
    public long m4779g() {
        return m4777e(1);
    }

    /* renamed from: h */
    public final C0856N m4780h(int i7) {
        return new C0856N(this.f3960l[i7] * m4779g(), this.f3959k[i7]);
    }

    /* renamed from: i */
    public InterfaceC0855M.a m4781i(long j7) {
        int m4779g = (int) (j7 / m4779g());
        int m21741g = AbstractC5330M.m21741g(this.f3960l, m4779g, true, true);
        if (this.f3960l[m21741g] == m4779g) {
            return new InterfaceC0855M.a(m4780h(m21741g));
        }
        C0856N m4780h = m4780h(m21741g);
        int i7 = m21741g + 1;
        return i7 < this.f3959k.length ? new InterfaceC0855M.a(m4780h, m4780h(i7)) : new InterfaceC0855M.a(m4780h);
    }

    /* renamed from: j */
    public boolean m4782j(int i7) {
        return this.f3950b == i7 || this.f3951c == i7;
    }

    /* renamed from: k */
    public void m4783k() {
        this.f3957i++;
    }

    /* renamed from: l */
    public boolean m4784l() {
        return Arrays.binarySearch(this.f3960l, this.f3956h) >= 0;
    }

    /* renamed from: m */
    public boolean m4785m(InterfaceC0884s interfaceC0884s) {
        int i7 = this.f3955g;
        int mo558a = i7 - this.f3949a.mo558a(interfaceC0884s, i7, false);
        this.f3955g = mo558a;
        boolean z6 = mo558a == 0;
        if (z6) {
            if (this.f3954f > 0) {
                this.f3949a.mo562c(m4778f(), m4784l() ? 1 : 0, this.f3954f, 0, null);
            }
            m4774a();
        }
        return z6;
    }

    /* renamed from: n */
    public void m4786n(int i7) {
        this.f3954f = i7;
        this.f3955g = i7;
    }

    /* renamed from: o */
    public void m4787o(long j7) {
        if (this.f3958j == 0) {
            this.f3956h = 0;
        } else {
            this.f3956h = this.f3960l[AbstractC5330M.m21744h(this.f3959k, j7, true, true)];
        }
    }
}
