package p328r1;

import org.apache.tika.utils.XMLReaderUtils;
import p195b3.AbstractC3524d;
import p195b3.AbstractC3525e;
import p232g0.C4295A;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: r1.v */
/* loaded from: classes.dex */
public abstract class AbstractC6283v {

    /* renamed from: r1.v$b */
    public static class b {

        /* renamed from: a */
        public int f22754a;

        /* renamed from: b */
        public long f22755b;

        /* renamed from: c */
        public int f22756c;
    }

    /* renamed from: r1.v$c */
    public static class c {

        /* renamed from: a */
        public final int f22757a;

        /* renamed from: b */
        public final int f22758b;

        /* renamed from: c */
        public final int f22759c;

        /* renamed from: d */
        public final byte[] f22760d;

        public c(int i7, int i8, int i9, byte[] bArr) {
            this.f22757a = i7;
            this.f22758b = i8;
            this.f22759c = i9;
            this.f22760d = bArr;
        }
    }

    /* renamed from: a */
    public static int m26298a(int i7) {
        if (i7 == 0) {
            return 768;
        }
        if (i7 == 1) {
            return 1024;
        }
        if (i7 == 2 || i7 == 3) {
            return 2048;
        }
        if (i7 == 4) {
            return 4096;
        }
        throw C4295A.m17947e("Unsupported coreSbrFrameLengthIndex " + i7);
    }

    /* renamed from: b */
    public static double m26299b(int i7) {
        switch (i7) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw C4295A.m17947e("Unsupported sampling rate " + i7);
        }
    }

    /* renamed from: c */
    public static int m26300c(int i7) {
        switch (i7) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 7350;
            case 13:
            case 14:
            default:
                throw C4295A.m17947e("Unsupported sampling rate index " + i7);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return 38400;
            case 19:
                return 34150;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    /* renamed from: d */
    public static int m26301d(int i7) {
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        int i8 = 2;
        if (i7 != 2) {
            i8 = 3;
            if (i7 != 3) {
                if (i7 == 4) {
                    return 1;
                }
                throw C4295A.m17947e("Unsupported coreSbrFrameLengthIndex " + i7);
            }
        }
        return i8;
    }

    /* renamed from: e */
    public static boolean m26302e(int i7) {
        return (i7 & 16777215) == 12583333;
    }

    /* renamed from: f */
    public static int m26303f(C5356y c5356y) {
        if (!c5356y.m21907g()) {
            return 0;
        }
        c5356y.m21918r(2);
        return c5356y.m21908h(13);
    }

    /* renamed from: g */
    public static boolean m26304g(C5356y c5356y, b bVar) {
        c5356y.m21904d();
        int m26308k = m26308k(c5356y, 3, 8, 8);
        bVar.f22754a = m26308k;
        if (m26308k == -1) {
            return false;
        }
        long m26309l = m26309l(c5356y, 2, 8, 32);
        bVar.f22755b = m26309l;
        if (m26309l == -1) {
            return false;
        }
        if (m26309l > 16) {
            throw C4295A.m17947e("Contains sub-stream with an invalid packet label " + bVar.f22755b);
        }
        if (m26309l == 0) {
            int i7 = bVar.f22754a;
            if (i7 == 1) {
                throw C4295A.m17943a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i7 == 2) {
                throw C4295A.m17943a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i7 == 17) {
                throw C4295A.m17943a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int m26308k2 = m26308k(c5356y, 11, 24, 24);
        bVar.f22756c = m26308k2;
        return m26308k2 != -1;
    }

    /* renamed from: h */
    public static c m26305h(C5356y c5356y) {
        int m21908h = c5356y.m21908h(8);
        int m21908h2 = c5356y.m21908h(5);
        int m21908h3 = m21908h2 == 31 ? c5356y.m21908h(24) : m26300c(m21908h2);
        int m21908h4 = c5356y.m21908h(3);
        int m26298a = m26298a(m21908h4);
        int m26301d = m26301d(m21908h4);
        c5356y.m21918r(2);
        m26313p(c5356y);
        m26310m(c5356y, m26307j(c5356y), m26301d);
        byte[] bArr = null;
        if (c5356y.m21907g()) {
            int m26308k = m26308k(c5356y, 2, 4, 8) + 1;
            for (int i7 = 0; i7 < m26308k; i7++) {
                int m26308k2 = m26308k(c5356y, 4, 8, 16);
                int m26308k3 = m26308k(c5356y, 4, 8, 16);
                if (m26308k2 == 7) {
                    int m21908h5 = c5356y.m21908h(4) + 1;
                    c5356y.m21918r(4);
                    byte[] bArr2 = new byte[m21908h5];
                    for (int i8 = 0; i8 < m21908h5; i8++) {
                        bArr2[i8] = (byte) c5356y.m21908h(8);
                    }
                    bArr = bArr2;
                } else {
                    c5356y.m21918r(m26308k3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double m26299b = m26299b(m21908h3);
        return new c(m21908h, (int) (m21908h3 * m26299b), (int) (m26298a * m26299b), bArr3);
    }

    /* renamed from: i */
    public static boolean m26306i(C5356y c5356y) {
        c5356y.m21918r(3);
        boolean m21907g = c5356y.m21907g();
        if (m21907g) {
            c5356y.m21918r(13);
        }
        return m21907g;
    }

    /* renamed from: j */
    public static int m26307j(C5356y c5356y) {
        int m21908h = c5356y.m21908h(5);
        int i7 = 0;
        for (int i8 = 0; i8 < m21908h + 1; i8++) {
            int m21908h2 = c5356y.m21908h(3);
            i7 += m26308k(c5356y, 5, 8, 16) + 1;
            if ((m21908h2 == 0 || m21908h2 == 2) && c5356y.m21907g()) {
                m26313p(c5356y);
            }
        }
        return i7;
    }

    /* renamed from: k */
    public static int m26308k(C5356y c5356y, int i7, int i8, int i9) {
        AbstractC5332a.m21796a(Math.max(Math.max(i7, i8), i9) <= 31);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        AbstractC3524d.m14158a(AbstractC3524d.m14158a(i10, i11), 1 << i9);
        if (c5356y.m21902b() < i7) {
            return -1;
        }
        int m21908h = c5356y.m21908h(i7);
        if (m21908h != i10) {
            return m21908h;
        }
        if (c5356y.m21902b() < i8) {
            return -1;
        }
        int m21908h2 = c5356y.m21908h(i8);
        int i12 = m21908h + m21908h2;
        if (m21908h2 != i11) {
            return i12;
        }
        if (c5356y.m21902b() < i9) {
            return -1;
        }
        return i12 + c5356y.m21908h(i9);
    }

    /* renamed from: l */
    public static long m26309l(C5356y c5356y, int i7, int i8, int i9) {
        AbstractC5332a.m21796a(Math.max(Math.max(i7, i8), i9) <= 63);
        long j7 = (1 << i7) - 1;
        long j8 = (1 << i8) - 1;
        AbstractC3525e.m14165a(AbstractC3525e.m14165a(j7, j8), 1 << i9);
        if (c5356y.m21902b() < i7) {
            return -1L;
        }
        long m21910j = c5356y.m21910j(i7);
        if (m21910j != j7) {
            return m21910j;
        }
        if (c5356y.m21902b() < i8) {
            return -1L;
        }
        long m21910j2 = c5356y.m21910j(i8);
        long j9 = m21910j + m21910j2;
        if (m21910j2 != j8) {
            return j9;
        }
        if (c5356y.m21902b() < i9) {
            return -1L;
        }
        return j9 + c5356y.m21910j(i9);
    }

    /* renamed from: m */
    public static void m26310m(C5356y c5356y, int i7, int i8) {
        int i9;
        int m26308k = m26308k(c5356y, 4, 8, 16) + 1;
        c5356y.m21917q();
        for (int i10 = 0; i10 < m26308k; i10++) {
            int m21908h = c5356y.m21908h(2);
            if (m21908h == 0) {
                m26306i(c5356y);
                if (i8 > 0) {
                    m26312o(c5356y);
                }
            } else if (m21908h == 1) {
                if (m26306i(c5356y)) {
                    c5356y.m21917q();
                }
                if (i8 > 0) {
                    m26312o(c5356y);
                    i9 = c5356y.m21908h(2);
                } else {
                    i9 = 0;
                }
                if (i9 > 0) {
                    c5356y.m21918r(6);
                    int m21908h2 = c5356y.m21908h(2);
                    c5356y.m21918r(4);
                    if (c5356y.m21907g()) {
                        c5356y.m21918r(5);
                    }
                    if (i9 == 2 || i9 == 3) {
                        c5356y.m21918r(6);
                    }
                    if (m21908h2 == 2) {
                        c5356y.m21917q();
                    }
                }
                int floor = ((int) Math.floor(Math.log(i7 - 1) / Math.log(2.0d))) + 1;
                int m21908h3 = c5356y.m21908h(2);
                if (m21908h3 > 0 && c5356y.m21907g()) {
                    c5356y.m21918r(floor);
                }
                if (c5356y.m21907g()) {
                    c5356y.m21918r(floor);
                }
                if (i8 == 0 && m21908h3 == 0) {
                    c5356y.m21917q();
                }
            } else if (m21908h == 3) {
                m26308k(c5356y, 4, 8, 16);
                int m26308k2 = m26308k(c5356y, 4, 8, 16);
                if (c5356y.m21907g()) {
                    m26308k(c5356y, 8, 16, 0);
                }
                c5356y.m21917q();
                if (m26308k2 > 0) {
                    c5356y.m21918r(m26308k2 * 8);
                }
            }
        }
    }

    /* renamed from: n */
    public static void m26311n(C5356y c5356y, int i7) {
        int m21908h;
        boolean m21907g = c5356y.m21907g();
        int i8 = m21907g ? 1 : 5;
        int i9 = m21907g ? 7 : 5;
        int i10 = m21907g ? 8 : 6;
        int i11 = 0;
        while (i11 < i7) {
            if (c5356y.m21907g()) {
                c5356y.m21918r(7);
                m21908h = 0;
            } else {
                if (c5356y.m21908h(2) == 3 && c5356y.m21908h(i9) * i8 != 0) {
                    c5356y.m21917q();
                }
                m21908h = c5356y.m21908h(i10) * i8;
                if (m21908h != 0 && m21908h != 180) {
                    c5356y.m21917q();
                }
                c5356y.m21917q();
            }
            if (m21908h != 0 && m21908h != 180 && c5356y.m21907g()) {
                i11++;
            }
            i11++;
        }
    }

    /* renamed from: o */
    public static void m26312o(C5356y c5356y) {
        c5356y.m21918r(3);
        c5356y.m21918r(8);
        boolean m21907g = c5356y.m21907g();
        boolean m21907g2 = c5356y.m21907g();
        if (m21907g) {
            c5356y.m21918r(5);
        }
        if (m21907g2) {
            c5356y.m21918r(6);
        }
    }

    /* renamed from: p */
    public static void m26313p(C5356y c5356y) {
        int m21908h = c5356y.m21908h(2);
        if (m21908h == 0) {
            c5356y.m21918r(6);
            return;
        }
        int m26308k = m26308k(c5356y, 5, 8, 16) + 1;
        if (m21908h == 1) {
            c5356y.m21918r(m26308k * 7);
        } else if (m21908h == 2) {
            m26311n(c5356y, m26308k);
        }
    }
}
