package p268k0;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import p232g0.C4318h;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public abstract class AbstractC5400d {

    /* renamed from: a */
    public static final byte[] f19246a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f19247b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f19248c = new Object();

    /* renamed from: d */
    public static int[] f19249d = new int[10];

    /* renamed from: k0.d$a */
    public static final class a {

        /* renamed from: a */
        public final int f19250a;

        /* renamed from: b */
        public final boolean f19251b;

        /* renamed from: c */
        public final int f19252c;

        /* renamed from: d */
        public final int f19253d;

        /* renamed from: e */
        public final int f19254e;

        /* renamed from: f */
        public final int f19255f;

        /* renamed from: g */
        public final int f19256g;

        /* renamed from: h */
        public final int[] f19257h;

        /* renamed from: i */
        public final int f19258i;

        /* renamed from: j */
        public final int f19259j;

        /* renamed from: k */
        public final int f19260k;

        /* renamed from: l */
        public final int f19261l;

        /* renamed from: m */
        public final float f19262m;

        /* renamed from: n */
        public final int f19263n;

        /* renamed from: o */
        public final int f19264o;

        /* renamed from: p */
        public final int f19265p;

        /* renamed from: q */
        public final int f19266q;

        public a(int i7, boolean z6, int i8, int i9, int i10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f7, int i17, int i18, int i19, int i20) {
            this.f19250a = i7;
            this.f19251b = z6;
            this.f19252c = i8;
            this.f19253d = i9;
            this.f19254e = i10;
            this.f19255f = i11;
            this.f19256g = i12;
            this.f19257h = iArr;
            this.f19258i = i13;
            this.f19259j = i14;
            this.f19260k = i15;
            this.f19261l = i16;
            this.f19262m = f7;
            this.f19263n = i17;
            this.f19264o = i18;
            this.f19265p = i19;
            this.f19266q = i20;
        }
    }

    /* renamed from: k0.d$b */
    public static final class b {

        /* renamed from: a */
        public final int f19267a;

        /* renamed from: b */
        public final int f19268b;

        /* renamed from: c */
        public final boolean f19269c;

        public b(int i7, int i8, boolean z6) {
            this.f19267a = i7;
            this.f19268b = i8;
            this.f19269c = z6;
        }
    }

    /* renamed from: k0.d$c */
    public static final class c {

        /* renamed from: a */
        public final int f19270a;

        /* renamed from: b */
        public final int f19271b;

        /* renamed from: c */
        public final int f19272c;

        /* renamed from: d */
        public final int f19273d;

        /* renamed from: e */
        public final int f19274e;

        /* renamed from: f */
        public final int f19275f;

        /* renamed from: g */
        public final int f19276g;

        /* renamed from: h */
        public final float f19277h;

        /* renamed from: i */
        public final int f19278i;

        /* renamed from: j */
        public final int f19279j;

        /* renamed from: k */
        public final boolean f19280k;

        /* renamed from: l */
        public final boolean f19281l;

        /* renamed from: m */
        public final int f19282m;

        /* renamed from: n */
        public final int f19283n;

        /* renamed from: o */
        public final int f19284o;

        /* renamed from: p */
        public final boolean f19285p;

        /* renamed from: q */
        public final int f19286q;

        /* renamed from: r */
        public final int f19287r;

        /* renamed from: s */
        public final int f19288s;

        /* renamed from: t */
        public final int f19289t;

        public c(int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f7, int i14, int i15, boolean z6, boolean z7, int i16, int i17, int i18, boolean z8, int i19, int i20, int i21, int i22) {
            this.f19270a = i7;
            this.f19271b = i8;
            this.f19272c = i9;
            this.f19273d = i10;
            this.f19274e = i11;
            this.f19275f = i12;
            this.f19276g = i13;
            this.f19277h = f7;
            this.f19278i = i14;
            this.f19279j = i15;
            this.f19280k = z6;
            this.f19281l = z7;
            this.f19282m = i16;
            this.f19283n = i17;
            this.f19284o = i18;
            this.f19285p = z8;
            this.f19286q = i19;
            this.f19287r = i20;
            this.f19288s = i21;
            this.f19289t = i22;
        }
    }

    /* renamed from: a */
    public static void m22316a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m22317b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i7 + 1;
            if (i9 >= position) {
                byteBuffer.clear();
                return;
            }
            int i10 = byteBuffer.get(i7) & ForkServer.ERROR;
            if (i8 == 3) {
                if (i10 == 1 && (byteBuffer.get(i9) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i7 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i10 == 0) {
                i8++;
            }
            if (i10 != 0) {
                i8 = 0;
            }
            i7 = i9;
        }
    }

    /* renamed from: c */
    public static int m22318c(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        AbstractC5332a.m21802g(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            m22316a(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            m22316a(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            m22316a(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b7 = bArr[i11];
            if ((b7 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b7 == 1) {
                    m22316a(zArr);
                    return i12;
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    /* renamed from: d */
    public static int m22319d(byte[] bArr, int i7, int i8) {
        while (i7 < i8 - 2) {
            if (bArr[i7] == 0 && bArr[i7 + 1] == 0 && bArr[i7 + 2] == 3) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    /* renamed from: e */
    public static int m22320e(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m22321f(byte[] bArr, int i7) {
        return bArr[i7 + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m22322g(String str, byte b7) {
        if ("video/avc".equals(str) && (b7 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b7 & 126) >> 1) == 39;
    }

    /* renamed from: h */
    public static a m22323h(byte[] bArr, int i7, int i8) {
        return m22324i(bArr, i7 + 2, i8);
    }

    /* renamed from: i */
    public static a m22324i(byte[] bArr, int i7, int i8) {
        float f7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C5401e c5401e = new C5401e(bArr, i7, i8);
        c5401e.m22345l(4);
        int m22338e = c5401e.m22338e(3);
        c5401e.m22344k();
        int m22338e2 = c5401e.m22338e(2);
        boolean m22337d = c5401e.m22337d();
        int m22338e3 = c5401e.m22338e(5);
        int i14 = 0;
        for (int i15 = 0; i15 < 32; i15++) {
            if (c5401e.m22337d()) {
                i14 |= 1 << i15;
            }
        }
        int[] iArr = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr[i16] = c5401e.m22338e(8);
        }
        int m22338e4 = c5401e.m22338e(8);
        int i17 = 0;
        for (int i18 = 0; i18 < m22338e; i18++) {
            if (c5401e.m22337d()) {
                i17 += 89;
            }
            if (c5401e.m22337d()) {
                i17 += 8;
            }
        }
        c5401e.m22345l(i17);
        if (m22338e > 0) {
            c5401e.m22345l((8 - m22338e) * 2);
        }
        int m22341h = c5401e.m22341h();
        int m22341h2 = c5401e.m22341h();
        if (m22341h2 == 3) {
            c5401e.m22344k();
        }
        int m22341h3 = c5401e.m22341h();
        int m22341h4 = c5401e.m22341h();
        if (c5401e.m22337d()) {
            int m22341h5 = c5401e.m22341h();
            int m22341h6 = c5401e.m22341h();
            int m22341h7 = c5401e.m22341h();
            int m22341h8 = c5401e.m22341h();
            m22341h3 -= ((m22341h2 == 1 || m22341h2 == 2) ? 2 : 1) * (m22341h5 + m22341h6);
            m22341h4 -= (m22341h2 == 1 ? 2 : 1) * (m22341h7 + m22341h8);
        }
        int i19 = m22341h4;
        int i20 = m22341h3;
        int i21 = i19;
        int m22341h9 = c5401e.m22341h();
        int m22341h10 = c5401e.m22341h();
        int m22341h11 = c5401e.m22341h();
        int i22 = -1;
        int i23 = -1;
        for (int i24 = c5401e.m22337d() ? 0 : m22338e; i24 <= m22338e; i24++) {
            c5401e.m22341h();
            i23 = Math.max(c5401e.m22341h(), i23);
            c5401e.m22341h();
        }
        c5401e.m22341h();
        c5401e.m22341h();
        c5401e.m22341h();
        c5401e.m22341h();
        c5401e.m22341h();
        c5401e.m22341h();
        if (c5401e.m22337d() && c5401e.m22337d()) {
            m22329n(c5401e);
        }
        c5401e.m22345l(2);
        if (c5401e.m22337d()) {
            c5401e.m22345l(8);
            c5401e.m22341h();
            c5401e.m22341h();
            c5401e.m22344k();
        }
        m22332q(c5401e);
        if (c5401e.m22337d()) {
            int m22341h12 = c5401e.m22341h();
            for (int i25 = 0; i25 < m22341h12; i25++) {
                c5401e.m22345l(m22341h11 + 5);
            }
        }
        c5401e.m22345l(2);
        float f8 = 1.0f;
        if (c5401e.m22337d()) {
            if (c5401e.m22337d()) {
                int m22338e5 = c5401e.m22338e(8);
                if (m22338e5 == 255) {
                    int m22338e6 = c5401e.m22338e(16);
                    int m22338e7 = c5401e.m22338e(16);
                    if (m22338e6 != 0 && m22338e7 != 0) {
                        f8 = m22338e6 / m22338e7;
                    }
                } else {
                    float[] fArr = f19247b;
                    if (m22338e5 < fArr.length) {
                        f8 = fArr[m22338e5];
                    } else {
                        AbstractC5346o.m21867h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + m22338e5);
                    }
                }
            }
            if (c5401e.m22337d()) {
                c5401e.m22344k();
            }
            if (c5401e.m22337d()) {
                c5401e.m22345l(3);
                i13 = c5401e.m22337d() ? 1 : 2;
                if (c5401e.m22337d()) {
                    int m22338e8 = c5401e.m22338e(8);
                    int m22338e9 = c5401e.m22338e(8);
                    c5401e.m22345l(8);
                    i22 = C4318h.m18143j(m22338e8);
                    i12 = C4318h.m18144k(m22338e9);
                } else {
                    i12 = -1;
                }
            } else {
                i12 = -1;
                i13 = -1;
            }
            if (c5401e.m22337d()) {
                c5401e.m22341h();
                c5401e.m22341h();
            }
            c5401e.m22344k();
            if (c5401e.m22337d()) {
                i21 *= 2;
            }
            i11 = i12;
            i10 = i13;
            f7 = f8;
            i9 = i21;
        } else {
            f7 = 1.0f;
            i9 = i21;
            i10 = -1;
            i11 = -1;
        }
        return new a(m22338e2, m22337d, m22338e3, i14, m22341h2, m22341h9, m22341h10, iArr, m22338e4, m22341h, i20, i9, f7, i23, i22, i10, i11);
    }

    /* renamed from: j */
    public static b m22325j(byte[] bArr, int i7, int i8) {
        return m22326k(bArr, i7 + 1, i8);
    }

    /* renamed from: k */
    public static b m22326k(byte[] bArr, int i7, int i8) {
        C5401e c5401e = new C5401e(bArr, i7, i8);
        int m22341h = c5401e.m22341h();
        int m22341h2 = c5401e.m22341h();
        c5401e.m22344k();
        return new b(m22341h, m22341h2, c5401e.m22337d());
    }

    /* renamed from: l */
    public static c m22327l(byte[] bArr, int i7, int i8) {
        return m22328m(bArr, i7 + 1, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p268k0.AbstractC5400d.c m22328m(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p268k0.AbstractC5400d.m22328m(byte[], int, int):k0.d$c");
    }

    /* renamed from: n */
    public static void m22329n(C5401e c5401e) {
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = 0;
            while (i8 < 6) {
                int i9 = 1;
                if (c5401e.m22337d()) {
                    int min = Math.min(64, 1 << ((i7 << 1) + 4));
                    if (i7 > 1) {
                        c5401e.m22340g();
                    }
                    for (int i10 = 0; i10 < min; i10++) {
                        c5401e.m22340g();
                    }
                } else {
                    c5401e.m22341h();
                }
                if (i7 == 3) {
                    i9 = 3;
                }
                i8 += i9;
            }
        }
    }

    /* renamed from: o */
    public static void m22330o(C5401e c5401e) {
        int m22341h = c5401e.m22341h() + 1;
        c5401e.m22345l(8);
        for (int i7 = 0; i7 < m22341h; i7++) {
            c5401e.m22341h();
            c5401e.m22341h();
            c5401e.m22344k();
        }
        c5401e.m22345l(20);
    }

    /* renamed from: p */
    public static void m22331p(C5401e c5401e, int i7) {
        int i8 = 8;
        int i9 = 8;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i8 != 0) {
                i8 = ((c5401e.m22340g() + i9) + 256) % 256;
            }
            if (i8 != 0) {
                i9 = i8;
            }
        }
    }

    /* renamed from: q */
    public static void m22332q(C5401e c5401e) {
        int m22341h = c5401e.m22341h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < m22341h; i9++) {
            if (i9 == 0 || !c5401e.m22337d()) {
                int m22341h2 = c5401e.m22341h();
                int m22341h3 = c5401e.m22341h();
                int[] iArr3 = new int[m22341h2];
                int i10 = 0;
                while (i10 < m22341h2) {
                    iArr3[i10] = (i10 > 0 ? iArr3[i10 - 1] : 0) - (c5401e.m22341h() + 1);
                    c5401e.m22344k();
                    i10++;
                }
                int[] iArr4 = new int[m22341h3];
                int i11 = 0;
                while (i11 < m22341h3) {
                    iArr4[i11] = (i11 > 0 ? iArr4[i11 - 1] : 0) + c5401e.m22341h() + 1;
                    c5401e.m22344k();
                    i11++;
                }
                i7 = m22341h2;
                iArr = iArr3;
                i8 = m22341h3;
                iArr2 = iArr4;
            } else {
                int i12 = i7 + i8;
                int m22341h4 = (1 - ((c5401e.m22337d() ? 1 : 0) * 2)) * (c5401e.m22341h() + 1);
                int i13 = i12 + 1;
                boolean[] zArr = new boolean[i13];
                for (int i14 = 0; i14 <= i12; i14++) {
                    if (c5401e.m22337d()) {
                        zArr[i14] = true;
                    } else {
                        zArr[i14] = c5401e.m22337d();
                    }
                }
                int[] iArr5 = new int[i13];
                int[] iArr6 = new int[i13];
                int i15 = 0;
                for (int i16 = i8 - 1; i16 >= 0; i16--) {
                    int i17 = iArr2[i16] + m22341h4;
                    if (i17 < 0 && zArr[i7 + i16]) {
                        iArr5[i15] = i17;
                        i15++;
                    }
                }
                if (m22341h4 < 0 && zArr[i12]) {
                    iArr5[i15] = m22341h4;
                    i15++;
                }
                for (int i18 = 0; i18 < i7; i18++) {
                    int i19 = iArr[i18] + m22341h4;
                    if (i19 < 0 && zArr[i18]) {
                        iArr5[i15] = i19;
                        i15++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i15);
                int i20 = 0;
                for (int i21 = i7 - 1; i21 >= 0; i21--) {
                    int i22 = iArr[i21] + m22341h4;
                    if (i22 > 0 && zArr[i21]) {
                        iArr6[i20] = i22;
                        i20++;
                    }
                }
                if (m22341h4 > 0 && zArr[i12]) {
                    iArr6[i20] = m22341h4;
                    i20++;
                }
                for (int i23 = 0; i23 < i8; i23++) {
                    int i24 = iArr2[i23] + m22341h4;
                    if (i24 > 0 && zArr[i7 + i23]) {
                        iArr6[i20] = i24;
                        i20++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i20);
                iArr = copyOf;
                i7 = i15;
                i8 = i20;
            }
        }
    }

    /* renamed from: r */
    public static int m22333r(byte[] bArr, int i7) {
        int i8;
        synchronized (f19248c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                try {
                    i9 = m22319d(bArr, i9, i7);
                    if (i9 < i7) {
                        int[] iArr = f19249d;
                        if (iArr.length <= i10) {
                            f19249d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f19249d[i10] = i9;
                        i9 += 3;
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f19249d[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }
}
