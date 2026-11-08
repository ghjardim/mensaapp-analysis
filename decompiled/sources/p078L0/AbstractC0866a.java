package p078L0;

import org.apache.tika.utils.XMLReaderUtils;
import p232g0.C4295A;
import p259j0.AbstractC5346o;
import p259j0.C5356y;

/* renamed from: L0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0866a {

    /* renamed from: a */
    public static final int[] f2984a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f2985b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: L0.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f2986a;

        /* renamed from: b */
        public final int f2987b;

        /* renamed from: c */
        public final String f2988c;

        public b(int i7, int i8, String str) {
            this.f2986a = i7;
            this.f2987b = i8;
            this.f2988c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m3582a(int i7, int i8) {
        int i9 = 0;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int[] iArr = f2984a;
            if (i11 >= iArr.length) {
                break;
            }
            if (i7 == iArr[i11]) {
                i10 = i11;
            }
            i11++;
        }
        int i12 = -1;
        while (true) {
            int[] iArr2 = f2985b;
            if (i9 >= iArr2.length) {
                break;
            }
            if (i8 == iArr2[i9]) {
                i12 = i9;
            }
            i9++;
        }
        if (i7 != -1 && i12 != -1) {
            return m3583b(2, i10, i12);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i7 + ", " + i8);
    }

    /* renamed from: b */
    public static byte[] m3583b(int i7, int i8, int i9) {
        return new byte[]{(byte) (((i7 << 3) & 248) | ((i8 >> 1) & 7)), (byte) (((i8 << 7) & 128) | ((i9 << 3) & 120))};
    }

    /* renamed from: c */
    public static int m3584c(C5356y c5356y) {
        int m21908h = c5356y.m21908h(5);
        return m21908h == 31 ? c5356y.m21908h(6) + 32 : m21908h;
    }

    /* renamed from: d */
    public static int m3585d(C5356y c5356y) {
        int m21908h = c5356y.m21908h(4);
        if (m21908h == 15) {
            if (c5356y.m21902b() >= 24) {
                return c5356y.m21908h(24);
            }
            throw C4295A.m17943a("AAC header insufficient data", null);
        }
        if (m21908h < 13) {
            return f2984a[m21908h];
        }
        throw C4295A.m17943a("AAC header wrong Sampling Frequency Index", null);
    }

    /* renamed from: e */
    public static b m3586e(C5356y c5356y, boolean z6) {
        int m3584c = m3584c(c5356y);
        int m3585d = m3585d(c5356y);
        int m21908h = c5356y.m21908h(4);
        String str = "mp4a.40." + m3584c;
        if (m3584c == 5 || m3584c == 29) {
            m3585d = m3585d(c5356y);
            m3584c = m3584c(c5356y);
            if (m3584c == 22) {
                m21908h = c5356y.m21908h(4);
            }
        }
        if (z6) {
            if (m3584c != 1 && m3584c != 2 && m3584c != 3 && m3584c != 4 && m3584c != 6 && m3584c != 7 && m3584c != 17) {
                switch (m3584c) {
                    case 19:
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C4295A.m17947e("Unsupported audio object type: " + m3584c);
                }
            }
            m3588g(c5356y, m3584c, m21908h);
            switch (m3584c) {
                case 17:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                    int m21908h2 = c5356y.m21908h(2);
                    if (m21908h2 == 2 || m21908h2 == 3) {
                        throw C4295A.m17947e("Unsupported epConfig: " + m21908h2);
                    }
            }
        }
        int i7 = f2985b[m21908h];
        if (i7 != -1) {
            return new b(m3585d, i7, str);
        }
        throw C4295A.m17943a(null, null);
    }

    /* renamed from: f */
    public static b m3587f(byte[] bArr) {
        return m3586e(new C5356y(bArr), false);
    }

    /* renamed from: g */
    public static void m3588g(C5356y c5356y, int i7, int i8) {
        if (c5356y.m21907g()) {
            AbstractC5346o.m21867h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c5356y.m21907g()) {
            c5356y.m21918r(14);
        }
        boolean m21907g = c5356y.m21907g();
        if (i8 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i7 == 6 || i7 == 20) {
            c5356y.m21918r(3);
        }
        if (m21907g) {
            if (i7 == 22) {
                c5356y.m21918r(16);
            }
            if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                c5356y.m21918r(3);
            }
            c5356y.m21918r(1);
        }
    }
}
