package p217e1;

import p078L0.AbstractC0851I;
import p259j0.AbstractC5330M;
import p259j0.C5357z;

/* renamed from: e1.i */
/* loaded from: classes.dex */
public final class C4160i {

    /* renamed from: a */
    public final AbstractC0851I.a f13954a;

    /* renamed from: b */
    public final long f13955b;

    /* renamed from: c */
    public final long f13956c;

    /* renamed from: d */
    public final int f13957d;

    /* renamed from: e */
    public final int f13958e;

    /* renamed from: f */
    public final long[] f13959f;

    public C4160i(AbstractC0851I.a aVar, long j7, long j8, long[] jArr, int i7, int i8) {
        this.f13954a = new AbstractC0851I.a(aVar);
        this.f13955b = j7;
        this.f13956c = j8;
        this.f13959f = jArr;
        this.f13957d = i7;
        this.f13958e = i8;
    }

    /* renamed from: b */
    public static C4160i m17483b(AbstractC0851I.a aVar, C5357z c5357z) {
        long[] jArr;
        int i7;
        int i8;
        int m21957p = c5357z.m21957p();
        int m21930K = (m21957p & 1) != 0 ? c5357z.m21930K() : -1;
        long m21928I = (m21957p & 2) != 0 ? c5357z.m21928I() : -1L;
        if ((m21957p & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i9 = 0; i9 < 100; i9++) {
                jArr2[i9] = c5357z.m21926G();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((m21957p & 8) != 0) {
            c5357z.m21940U(4);
        }
        if (c5357z.m21942a() >= 24) {
            c5357z.m21940U(21);
            int m21929J = c5357z.m21929J();
            i8 = m21929J & 4095;
            i7 = (16773120 & m21929J) >> 12;
        } else {
            i7 = -1;
            i8 = -1;
        }
        return new C4160i(aVar, m21930K, m21928I, jArr, i7, i8);
    }

    /* renamed from: a */
    public long m17484a() {
        long j7 = this.f13955b;
        if (j7 == -1 || j7 == 0) {
            return -9223372036854775807L;
        }
        return AbstractC5330M.m21716W0((j7 * r2.f2934g) - 1, this.f13954a.f2931d);
    }
}
