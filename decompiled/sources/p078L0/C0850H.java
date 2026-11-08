package p078L0;

import p078L0.InterfaceC0855M;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: L0.H */
/* loaded from: classes.dex */
public final class C0850H implements InterfaceC0855M {

    /* renamed from: a */
    public final long[] f2917a;

    /* renamed from: b */
    public final long[] f2918b;

    /* renamed from: c */
    public final long f2919c;

    /* renamed from: d */
    public final boolean f2920d;

    public C0850H(long[] jArr, long[] jArr2, long j7) {
        AbstractC5332a.m21796a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z6 = length > 0;
        this.f2920d = z6;
        if (!z6 || jArr2[0] <= 0) {
            this.f2917a = jArr;
            this.f2918b = jArr2;
        } else {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f2917a = jArr3;
            long[] jArr4 = new long[i7];
            this.f2918b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f2919c = j7;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return this.f2920d;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        if (!this.f2920d) {
            return new InterfaceC0855M.a(C0856N.f2940c);
        }
        int m21744h = AbstractC5330M.m21744h(this.f2918b, j7, true, true);
        C0856N c0856n = new C0856N(this.f2918b[m21744h], this.f2917a[m21744h]);
        if (c0856n.f2941a == j7 || m21744h == this.f2918b.length - 1) {
            return new InterfaceC0855M.a(c0856n);
        }
        int i7 = m21744h + 1;
        return new InterfaceC0855M.a(c0856n, new C0856N(this.f2918b[i7], this.f2917a[i7]));
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f2919c;
    }
}
