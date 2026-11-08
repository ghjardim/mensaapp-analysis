package p217e1;

import p078L0.AbstractC0851I;
import p078L0.C0856N;
import p078L0.InterfaceC0855M;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: e1.h */
/* loaded from: classes.dex */
public final class C4159h implements InterfaceC4158g {

    /* renamed from: a */
    public final long[] f13949a;

    /* renamed from: b */
    public final long[] f13950b;

    /* renamed from: c */
    public final long f13951c;

    /* renamed from: d */
    public final long f13952d;

    /* renamed from: e */
    public final int f13953e;

    public C4159h(long[] jArr, long[] jArr2, long j7, long j8, int i7) {
        this.f13949a = jArr;
        this.f13950b = jArr2;
        this.f13951c = j7;
        this.f13952d = j8;
        this.f13953e = i7;
    }

    /* renamed from: a */
    public static C4159h m17482a(long j7, long j8, AbstractC0851I.a aVar, C5357z c5357z) {
        int m21926G;
        c5357z.m21940U(10);
        int m21957p = c5357z.m21957p();
        if (m21957p <= 0) {
            return null;
        }
        int i7 = aVar.f2931d;
        long m21718X0 = AbstractC5330M.m21718X0(m21957p, (i7 >= 32000 ? 1152 : 576) * 1000000, i7);
        int m21932M = c5357z.m21932M();
        int m21932M2 = c5357z.m21932M();
        int m21932M3 = c5357z.m21932M();
        c5357z.m21940U(2);
        long j9 = j8 + aVar.f2930c;
        long[] jArr = new long[m21932M];
        long[] jArr2 = new long[m21932M];
        int i8 = 0;
        long j10 = j8;
        while (i8 < m21932M) {
            int i9 = m21932M2;
            long j11 = j9;
            jArr[i8] = (i8 * m21718X0) / m21932M;
            jArr2[i8] = Math.max(j10, j11);
            if (m21932M3 == 1) {
                m21926G = c5357z.m21926G();
            } else if (m21932M3 == 2) {
                m21926G = c5357z.m21932M();
            } else if (m21932M3 == 3) {
                m21926G = c5357z.m21929J();
            } else {
                if (m21932M3 != 4) {
                    return null;
                }
                m21926G = c5357z.m21930K();
            }
            j10 += m21926G * i9;
            i8++;
            m21932M = m21932M;
            m21932M2 = i9;
            j9 = j11;
        }
        if (j7 != -1 && j7 != j10) {
            AbstractC5346o.m21867h("VbriSeeker", "VBRI data size mismatch: " + j7 + ", " + j10);
        }
        return new C4159h(jArr, jArr2, m21718X0, j10, aVar.f2933f);
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: c */
    public long mo17455c(long j7) {
        return this.f13949a[AbstractC5330M.m21744h(this.f13950b, j7, true, true)];
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: e */
    public long mo17456e() {
        return this.f13952d;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return true;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        int m21744h = AbstractC5330M.m21744h(this.f13949a, j7, true, true);
        C0856N c0856n = new C0856N(this.f13949a[m21744h], this.f13950b[m21744h]);
        if (c0856n.f2941a >= j7 || m21744h == this.f13949a.length - 1) {
            return new InterfaceC0855M.a(c0856n);
        }
        int i7 = m21744h + 1;
        return new InterfaceC0855M.a(c0856n, new C0856N(this.f13949a[i7], this.f13950b[i7]));
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: k */
    public int mo17457k() {
        return this.f13953e;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f13951c;
    }
}
