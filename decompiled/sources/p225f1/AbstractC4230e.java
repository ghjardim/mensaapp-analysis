package p225f1;

import p259j0.AbstractC5330M;

/* renamed from: f1.e */
/* loaded from: classes.dex */
public abstract class AbstractC4230e {

    /* renamed from: f1.e$b */
    public static final class b {

        /* renamed from: a */
        public final long[] f14484a;

        /* renamed from: b */
        public final int[] f14485b;

        /* renamed from: c */
        public final int f14486c;

        /* renamed from: d */
        public final long[] f14487d;

        /* renamed from: e */
        public final int[] f14488e;

        /* renamed from: f */
        public final long f14489f;

        public b(long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
            this.f14484a = jArr;
            this.f14485b = iArr;
            this.f14486c = i7;
            this.f14487d = jArr2;
            this.f14488e = iArr2;
            this.f14489f = j7;
        }
    }

    /* renamed from: a */
    public static b m17714a(int i7, long[] jArr, int[] iArr, long j7) {
        int i8 = 8192 / i7;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += AbstractC5330M.m21753k(i10, i8);
        }
        long[] jArr2 = new long[i9];
        int[] iArr2 = new int[i9];
        long[] jArr3 = new long[i9];
        int[] iArr3 = new int[i9];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            long j8 = jArr[i14];
            while (i15 > 0) {
                int min = Math.min(i8, i15);
                jArr2[i12] = j8;
                int i16 = i7 * min;
                iArr2[i12] = i16;
                i13 = Math.max(i13, i16);
                jArr3[i12] = i11 * j7;
                iArr3[i12] = 1;
                j8 += iArr2[i12];
                i11 += min;
                i15 -= min;
                i12++;
            }
        }
        return new b(jArr2, iArr2, i13, jArr3, iArr3, j7 * i11);
    }
}
