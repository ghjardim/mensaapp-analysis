package p217e1;

import android.util.Pair;
import p078L0.C0856N;
import p078L0.InterfaceC0855M;
import p176Z0.C2970l;
import p259j0.AbstractC5330M;

/* renamed from: e1.c */
/* loaded from: classes.dex */
public final class C4154c implements InterfaceC4158g {

    /* renamed from: a */
    public final long[] f13924a;

    /* renamed from: b */
    public final long[] f13925b;

    /* renamed from: c */
    public final long f13926c;

    public C4154c(long[] jArr, long[] jArr2, long j7) {
        this.f13924a = jArr;
        this.f13925b = jArr2;
        this.f13926c = j7 == -9223372036854775807L ? AbstractC5330M.m21692K0(jArr2[jArr2.length - 1]) : j7;
    }

    /* renamed from: a */
    public static C4154c m17461a(long j7, C2970l c2970l, long j8) {
        int length = c2970l.f9118e.length;
        int i7 = length + 1;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        jArr[0] = j7;
        long j9 = 0;
        jArr2[0] = 0;
        for (int i8 = 1; i8 <= length; i8++) {
            int i9 = i8 - 1;
            j7 += c2970l.f9116c + c2970l.f9118e[i9];
            j9 += c2970l.f9117d + c2970l.f9119f[i9];
            jArr[i8] = j7;
            jArr2[i8] = j9;
        }
        return new C4154c(jArr, jArr2, j8);
    }

    /* renamed from: b */
    public static Pair m17462b(long j7, long[] jArr, long[] jArr2) {
        int m21744h = AbstractC5330M.m21744h(jArr, j7, true, true);
        long j8 = jArr[m21744h];
        long j9 = jArr2[m21744h];
        int i7 = m21744h + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j8), Long.valueOf(j9));
        }
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) ((jArr[i7] == j8 ? 0.0d : (j7 - j8) / (r6 - j8)) * (jArr2[i7] - j9))) + j9));
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: c */
    public long mo17455c(long j7) {
        return AbstractC5330M.m21692K0(((Long) m17462b(j7, this.f13924a, this.f13925b).second).longValue());
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: e */
    public long mo17456e() {
        return -1L;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return true;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        Pair m17462b = m17462b(AbstractC5330M.m21758l1(AbstractC5330M.m21768q(j7, 0L, this.f13926c)), this.f13925b, this.f13924a);
        return new InterfaceC0855M.a(new C0856N(AbstractC5330M.m21692K0(((Long) m17462b.first).longValue()), ((Long) m17462b.second).longValue()));
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: k */
    public int mo17457k() {
        return -2147483647;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f13926c;
    }
}
