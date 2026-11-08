package p078L0;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p162X0.C2797a;
import p178Z2.AbstractC3033v;
import p201c1.C3569a;
import p232g0.C4295A;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: L0.W */
/* loaded from: classes.dex */
public abstract class AbstractC0864W {

    /* renamed from: L0.W$a */
    public static final class a {

        /* renamed from: a */
        public final String f2967a;

        /* renamed from: b */
        public final String[] f2968b;

        /* renamed from: c */
        public final int f2969c;

        public a(String str, String[] strArr, int i7) {
            this.f2967a = str;
            this.f2968b = strArr;
            this.f2969c = i7;
        }
    }

    /* renamed from: L0.W$b */
    public static final class b {

        /* renamed from: a */
        public final boolean f2970a;

        /* renamed from: b */
        public final int f2971b;

        /* renamed from: c */
        public final int f2972c;

        /* renamed from: d */
        public final int f2973d;

        public b(boolean z6, int i7, int i8, int i9) {
            this.f2970a = z6;
            this.f2971b = i7;
            this.f2972c = i8;
            this.f2973d = i9;
        }
    }

    /* renamed from: L0.W$c */
    public static final class c {

        /* renamed from: a */
        public final int f2974a;

        /* renamed from: b */
        public final int f2975b;

        /* renamed from: c */
        public final int f2976c;

        /* renamed from: d */
        public final int f2977d;

        /* renamed from: e */
        public final int f2978e;

        /* renamed from: f */
        public final int f2979f;

        /* renamed from: g */
        public final int f2980g;

        /* renamed from: h */
        public final int f2981h;

        /* renamed from: i */
        public final boolean f2982i;

        /* renamed from: j */
        public final byte[] f2983j;

        public c(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z6, byte[] bArr) {
            this.f2974a = i7;
            this.f2975b = i8;
            this.f2976c = i9;
            this.f2977d = i10;
            this.f2978e = i11;
            this.f2979f = i12;
            this.f2980g = i13;
            this.f2981h = i14;
            this.f2982i = z6;
            this.f2983j = bArr;
        }
    }

    /* renamed from: a */
    public static int[] m3566a(int i7) {
        if (i7 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i7 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i7 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i7 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i7 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    /* renamed from: b */
    public static int m3567b(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    /* renamed from: c */
    public static long m3568c(long j7, long j8) {
        return (long) Math.floor(Math.pow(j7, 1.0d / j8));
    }

    /* renamed from: d */
    public static C4334x m3569d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            String[] m21740f1 = AbstractC5330M.m21740f1(str, "=");
            if (m21740f1.length != 2) {
                AbstractC5346o.m21867h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (m21740f1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C2797a.m9974a(new C5357z(Base64.decode(m21740f1[1], 0))));
                } catch (RuntimeException e7) {
                    AbstractC5346o.m21868i("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new C3569a(m21740f1[0], m21740f1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4334x(arrayList);
    }

    /* renamed from: e */
    public static AbstractC3033v m3570e(byte[] bArr) {
        C5357z c5357z = new C5357z(bArr);
        c5357z.m21940U(1);
        int i7 = 0;
        while (c5357z.m21942a() > 0 && c5357z.m21951j() == 255) {
            i7 += 255;
            c5357z.m21940U(1);
        }
        int m21926G = i7 + c5357z.m21926G();
        int i8 = 0;
        while (c5357z.m21942a() > 0 && c5357z.m21951j() == 255) {
            i8 += 255;
            c5357z.m21940U(1);
        }
        int m21926G2 = i8 + c5357z.m21926G();
        byte[] bArr2 = new byte[m21926G];
        int m21947f = c5357z.m21947f();
        System.arraycopy(bArr, m21947f, bArr2, 0, m21926G);
        int i9 = m21947f + m21926G + m21926G2;
        int length = bArr.length - i9;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i9, bArr3, 0, length);
        return AbstractC3033v.m11052w(bArr2, bArr3);
    }

    /* renamed from: f */
    public static void m3571f(C0863V c0863v) {
        int m3564d = c0863v.m3564d(6) + 1;
        for (int i7 = 0; i7 < m3564d; i7++) {
            int m3564d2 = c0863v.m3564d(16);
            if (m3564d2 == 0) {
                c0863v.m3565e(8);
                c0863v.m3565e(16);
                c0863v.m3565e(16);
                c0863v.m3565e(6);
                c0863v.m3565e(8);
                int m3564d3 = c0863v.m3564d(4) + 1;
                for (int i8 = 0; i8 < m3564d3; i8++) {
                    c0863v.m3565e(8);
                }
            } else {
                if (m3564d2 != 1) {
                    throw C4295A.m17943a("floor type greater than 1 not decodable: " + m3564d2, null);
                }
                int m3564d4 = c0863v.m3564d(5);
                int[] iArr = new int[m3564d4];
                int i9 = -1;
                for (int i10 = 0; i10 < m3564d4; i10++) {
                    int m3564d5 = c0863v.m3564d(4);
                    iArr[i10] = m3564d5;
                    if (m3564d5 > i9) {
                        i9 = m3564d5;
                    }
                }
                int i11 = i9 + 1;
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr2[i12] = c0863v.m3564d(3) + 1;
                    int m3564d6 = c0863v.m3564d(2);
                    if (m3564d6 > 0) {
                        c0863v.m3565e(8);
                    }
                    for (int i13 = 0; i13 < (1 << m3564d6); i13++) {
                        c0863v.m3565e(8);
                    }
                }
                c0863v.m3565e(2);
                int m3564d7 = c0863v.m3564d(4);
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < m3564d4; i16++) {
                    i14 += iArr2[iArr[i16]];
                    while (i15 < i14) {
                        c0863v.m3565e(m3564d7);
                        i15++;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static void m3572g(int i7, C0863V c0863v) {
        int m3564d = c0863v.m3564d(6) + 1;
        for (int i8 = 0; i8 < m3564d; i8++) {
            int m3564d2 = c0863v.m3564d(16);
            if (m3564d2 != 0) {
                AbstractC5346o.m21862c("VorbisUtil", "mapping type other than 0 not supported: " + m3564d2);
            } else {
                int m3564d3 = c0863v.m3563c() ? c0863v.m3564d(4) + 1 : 1;
                if (c0863v.m3563c()) {
                    int m3564d4 = c0863v.m3564d(8) + 1;
                    for (int i9 = 0; i9 < m3564d4; i9++) {
                        int i10 = i7 - 1;
                        c0863v.m3565e(m3567b(i10));
                        c0863v.m3565e(m3567b(i10));
                    }
                }
                if (c0863v.m3564d(2) != 0) {
                    throw C4295A.m17943a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (m3564d3 > 1) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        c0863v.m3565e(4);
                    }
                }
                for (int i12 = 0; i12 < m3564d3; i12++) {
                    c0863v.m3565e(8);
                    c0863v.m3565e(8);
                    c0863v.m3565e(8);
                }
            }
        }
    }

    /* renamed from: h */
    public static b[] m3573h(C0863V c0863v) {
        int m3564d = c0863v.m3564d(6) + 1;
        b[] bVarArr = new b[m3564d];
        for (int i7 = 0; i7 < m3564d; i7++) {
            bVarArr[i7] = new b(c0863v.m3563c(), c0863v.m3564d(16), c0863v.m3564d(16), c0863v.m3564d(8));
        }
        return bVarArr;
    }

    /* renamed from: i */
    public static void m3574i(C0863V c0863v) {
        int m3564d = c0863v.m3564d(6) + 1;
        for (int i7 = 0; i7 < m3564d; i7++) {
            if (c0863v.m3564d(16) > 2) {
                throw C4295A.m17943a("residueType greater than 2 is not decodable", null);
            }
            c0863v.m3565e(24);
            c0863v.m3565e(24);
            c0863v.m3565e(24);
            int m3564d2 = c0863v.m3564d(6) + 1;
            c0863v.m3565e(8);
            int[] iArr = new int[m3564d2];
            for (int i8 = 0; i8 < m3564d2; i8++) {
                iArr[i8] = ((c0863v.m3563c() ? c0863v.m3564d(5) : 0) * 8) + c0863v.m3564d(3);
            }
            for (int i9 = 0; i9 < m3564d2; i9++) {
                for (int i10 = 0; i10 < 8; i10++) {
                    if ((iArr[i9] & (1 << i10)) != 0) {
                        c0863v.m3565e(8);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public static a m3575j(C5357z c5357z) {
        return m3576k(c5357z, true, true);
    }

    /* renamed from: k */
    public static a m3576k(C5357z c5357z, boolean z6, boolean z7) {
        if (z6) {
            m3580o(3, c5357z, false);
        }
        String m21923D = c5357z.m21923D((int) c5357z.m21964w());
        int length = m21923D.length();
        long m21964w = c5357z.m21964w();
        String[] strArr = new String[(int) m21964w];
        int i7 = length + 15;
        for (int i8 = 0; i8 < m21964w; i8++) {
            String m21923D2 = c5357z.m21923D((int) c5357z.m21964w());
            strArr[i8] = m21923D2;
            i7 = i7 + 4 + m21923D2.length();
        }
        if (z7 && (c5357z.m21926G() & 1) == 0) {
            throw C4295A.m17943a("framing bit expected to be set", null);
        }
        return new a(m21923D, strArr, i7 + 1);
    }

    /* renamed from: l */
    public static c m3577l(C5357z c5357z) {
        m3580o(1, c5357z, false);
        int m21965x = c5357z.m21965x();
        int m21926G = c5357z.m21926G();
        int m21965x2 = c5357z.m21965x();
        int m21961t = c5357z.m21961t();
        if (m21961t <= 0) {
            m21961t = -1;
        }
        int m21961t2 = c5357z.m21961t();
        if (m21961t2 <= 0) {
            m21961t2 = -1;
        }
        int m21961t3 = c5357z.m21961t();
        if (m21961t3 <= 0) {
            m21961t3 = -1;
        }
        int m21926G2 = c5357z.m21926G();
        return new c(m21965x, m21926G, m21965x2, m21961t, m21961t2, m21961t3, (int) Math.pow(2.0d, m21926G2 & 15), (int) Math.pow(2.0d, (m21926G2 & 240) >> 4), (c5357z.m21926G() & 1) > 0, Arrays.copyOf(c5357z.m21946e(), c5357z.m21948g()));
    }

    /* renamed from: m */
    public static b[] m3578m(C5357z c5357z, int i7) {
        m3580o(5, c5357z, false);
        int m21926G = c5357z.m21926G() + 1;
        C0863V c0863v = new C0863V(c5357z.m21946e());
        c0863v.m3565e(c5357z.m21947f() * 8);
        for (int i8 = 0; i8 < m21926G; i8++) {
            m3579n(c0863v);
        }
        int m3564d = c0863v.m3564d(6) + 1;
        for (int i9 = 0; i9 < m3564d; i9++) {
            if (c0863v.m3564d(16) != 0) {
                throw C4295A.m17943a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        m3571f(c0863v);
        m3574i(c0863v);
        m3572g(i7, c0863v);
        b[] m3573h = m3573h(c0863v);
        if (c0863v.m3563c()) {
            return m3573h;
        }
        throw C4295A.m17943a("framing bit after modes not set as expected", null);
    }

    /* renamed from: n */
    public static void m3579n(C0863V c0863v) {
        if (c0863v.m3564d(24) != 5653314) {
            throw C4295A.m17943a("expected code book to start with [0x56, 0x43, 0x42] at " + c0863v.m3562b(), null);
        }
        int m3564d = c0863v.m3564d(16);
        int m3564d2 = c0863v.m3564d(24);
        int i7 = 0;
        if (c0863v.m3563c()) {
            c0863v.m3565e(5);
            while (i7 < m3564d2) {
                i7 += c0863v.m3564d(m3567b(m3564d2 - i7));
            }
        } else {
            boolean m3563c = c0863v.m3563c();
            while (i7 < m3564d2) {
                if (!m3563c) {
                    c0863v.m3565e(5);
                } else if (c0863v.m3563c()) {
                    c0863v.m3565e(5);
                }
                i7++;
            }
        }
        int m3564d3 = c0863v.m3564d(4);
        if (m3564d3 > 2) {
            throw C4295A.m17943a("lookup type greater than 2 not decodable: " + m3564d3, null);
        }
        if (m3564d3 == 1 || m3564d3 == 2) {
            c0863v.m3565e(32);
            c0863v.m3565e(32);
            int m3564d4 = c0863v.m3564d(4) + 1;
            c0863v.m3565e(1);
            c0863v.m3565e((int) ((m3564d3 == 1 ? m3564d != 0 ? m3568c(m3564d2, m3564d) : 0L : m3564d * m3564d2) * m3564d4));
        }
    }

    /* renamed from: o */
    public static boolean m3580o(int i7, C5357z c5357z, boolean z6) {
        if (c5357z.m21942a() < 7) {
            if (z6) {
                return false;
            }
            throw C4295A.m17943a("too short header: " + c5357z.m21942a(), null);
        }
        if (c5357z.m21926G() != i7) {
            if (z6) {
                return false;
            }
            throw C4295A.m17943a("expected header type " + Integer.toHexString(i7), null);
        }
        if (c5357z.m21926G() == 118 && c5357z.m21926G() == 111 && c5357z.m21926G() == 114 && c5357z.m21926G() == 98 && c5357z.m21926G() == 105 && c5357z.m21926G() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw C4295A.m17943a("expected characters 'vorbis'", null);
    }
}
