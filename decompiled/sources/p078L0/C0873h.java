package p078L0;

import java.util.Arrays;
import p078L0.InterfaceC0855M;
import p259j0.AbstractC5330M;

/* renamed from: L0.h */
/* loaded from: classes.dex */
public final class C0873h implements InterfaceC0855M {

    /* renamed from: a */
    public final int f3043a;

    /* renamed from: b */
    public final int[] f3044b;

    /* renamed from: c */
    public final long[] f3045c;

    /* renamed from: d */
    public final long[] f3046d;

    /* renamed from: e */
    public final long[] f3047e;

    /* renamed from: f */
    public final long f3048f;

    public C0873h(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3044b = iArr;
        this.f3045c = jArr;
        this.f3046d = jArr2;
        this.f3047e = jArr3;
        int length = iArr.length;
        this.f3043a = length;
        if (length > 0) {
            this.f3048f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f3048f = 0L;
        }
    }

    /* renamed from: a */
    public int m3651a(long j7) {
        return AbstractC5330M.m21744h(this.f3047e, j7, true, true);
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return true;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        int m3651a = m3651a(j7);
        C0856N c0856n = new C0856N(this.f3047e[m3651a], this.f3045c[m3651a]);
        if (c0856n.f2941a >= j7 || m3651a == this.f3043a - 1) {
            return new InterfaceC0855M.a(c0856n);
        }
        int i7 = m3651a + 1;
        return new InterfaceC0855M.a(c0856n, new C0856N(this.f3047e[i7], this.f3045c[i7]));
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f3048f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f3043a + ", sizes=" + Arrays.toString(this.f3044b) + ", offsets=" + Arrays.toString(this.f3045c) + ", timeUs=" + Arrays.toString(this.f3047e) + ", durationsUs=" + Arrays.toString(this.f3046d) + ")";
    }
}
