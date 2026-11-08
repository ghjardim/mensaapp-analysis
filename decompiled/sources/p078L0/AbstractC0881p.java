package p078L0;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p232g0.C4295A;
import p232g0.C4323m;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.C5356y;

/* renamed from: L0.p */
/* loaded from: classes.dex */
public abstract class AbstractC0881p {

    /* renamed from: a */
    public static final int[] f3089a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    public static final int[] f3090b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    public static final int[] f3091c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final int[] f3092d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e */
    public static final int[] f3093e = {5, 8, 10, 12};

    /* renamed from: f */
    public static final int[] f3094f = {6, 9, 12, 15};

    /* renamed from: g */
    public static final int[] f3095g = {2, 4, 6, 8};

    /* renamed from: h */
    public static final int[] f3096h = {9, 11, 13, 16};

    /* renamed from: i */
    public static final int[] f3097i = {5, 8, 10, 12};

    /* renamed from: L0.p$b */
    public static final class b {

        /* renamed from: a */
        public final String f3098a;

        /* renamed from: b */
        public final int f3099b;

        /* renamed from: c */
        public final int f3100c;

        /* renamed from: d */
        public final int f3101d;

        /* renamed from: e */
        public final long f3102e;

        /* renamed from: f */
        public final int f3103f;

        public b(String str, int i7, int i8, int i9, long j7, int i10) {
            this.f3098a = str;
            this.f3100c = i7;
            this.f3099b = i8;
            this.f3101d = i9;
            this.f3102e = j7;
            this.f3103f = i10;
        }
    }

    /* renamed from: a */
    public static void m3674a(byte[] bArr, int i7) {
        int i8 = i7 - 2;
        if (((bArr[i7 - 1] & ForkServer.ERROR) | ((bArr[i8] << 8) & 65535)) != AbstractC5330M.m21778v(bArr, 0, i8, 65535)) {
            throw C4295A.m17943a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m3675b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p078L0.AbstractC0881p.m3675b(byte[]):int");
    }

    /* renamed from: c */
    public static int m3676c(int i7) {
        if (i7 == 2147385345 || i7 == -25230976 || i7 == 536864768 || i7 == -14745368) {
            return 1;
        }
        if (i7 == 1683496997 || i7 == 622876772) {
            return 2;
        }
        if (i7 == 1078008818 || i7 == -233094848) {
            return 3;
        }
        return (i7 == 1908687592 || i7 == -398277519) ? 4 : 0;
    }

    /* renamed from: d */
    public static C5356y m3677d(byte[] bArr) {
        byte b7 = bArr[0];
        if (b7 == Byte.MAX_VALUE || b7 == 100 || b7 == 64 || b7 == 113) {
            return new C5356y(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m3678e(copyOf)) {
            for (int i7 = 0; i7 < copyOf.length - 1; i7 += 2) {
                byte b8 = copyOf[i7];
                int i8 = i7 + 1;
                copyOf[i7] = copyOf[i8];
                copyOf[i8] = b8;
            }
        }
        C5356y c5356y = new C5356y(copyOf);
        if (copyOf[0] == 31) {
            C5356y c5356y2 = new C5356y(copyOf);
            while (c5356y2.m21902b() >= 16) {
                c5356y2.m21918r(2);
                c5356y.m21906f(c5356y2.m21908h(14), 14);
            }
        }
        c5356y.m21914n(copyOf);
        return c5356y;
    }

    /* renamed from: e */
    public static boolean m3678e(byte[] bArr) {
        byte b7 = bArr[0];
        return b7 == -2 || b7 == -1 || b7 == 37 || b7 == -14 || b7 == -24;
    }

    /* renamed from: f */
    public static int m3679f(ByteBuffer byteBuffer) {
        int i7;
        byte b7;
        int i8;
        byte b8;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b9 = byteBuffer.get(position);
        if (b9 != -2) {
            if (b9 == -1) {
                i7 = (byteBuffer.get(position + 4) & 7) << 4;
                b8 = byteBuffer.get(position + 7);
            } else if (b9 != 31) {
                i7 = (byteBuffer.get(position + 4) & 1) << 6;
                b7 = byteBuffer.get(position + 5);
            } else {
                i7 = (byteBuffer.get(position + 5) & 7) << 4;
                b8 = byteBuffer.get(position + 6);
            }
            i8 = b8 & 60;
            return (((i8 >> 2) | i7) + 1) * 32;
        }
        i7 = (byteBuffer.get(position + 5) & 1) << 6;
        b7 = byteBuffer.get(position + 4);
        i8 = b7 & 252;
        return (((i8 >> 2) | i7) + 1) * 32;
    }

    /* renamed from: g */
    public static int m3680g(byte[] bArr) {
        int i7;
        byte b7;
        int i8;
        byte b8;
        byte b9 = bArr[0];
        if (b9 != -2) {
            if (b9 == -1) {
                i7 = (bArr[4] & 7) << 4;
                b8 = bArr[7];
            } else if (b9 != 31) {
                i7 = (bArr[4] & 1) << 6;
                b7 = bArr[5];
            } else {
                i7 = (bArr[5] & 7) << 4;
                b8 = bArr[6];
            }
            i8 = b8 & 60;
            return (((i8 >> 2) | i7) + 1) * 32;
        }
        i7 = (bArr[5] & 1) << 6;
        b7 = bArr[4];
        i8 = b7 & 252;
        return (((i8 >> 2) | i7) + 1) * 32;
    }

    /* renamed from: h */
    public static C4327q m3681h(byte[] bArr, String str, String str2, int i7, C4323m c4323m) {
        C5356y m3677d = m3677d(bArr);
        m3677d.m21918r(60);
        int i8 = f3089a[m3677d.m21908h(6)];
        int i9 = f3090b[m3677d.m21908h(4)];
        int m21908h = m3677d.m21908h(5);
        int[] iArr = f3091c;
        int i10 = m21908h >= iArr.length ? -1 : (iArr[m21908h] * PipesIterator.DEFAULT_QUEUE_SIZE) / 2;
        m3677d.m21918r(10);
        return new C4327q.b().m18250a0(str).m18264o0("audio/vnd.dts").m18236M(i10).m18237N(i8 + (m3677d.m21908h(2) > 0 ? 1 : 0)).m18265p0(i9).m18244U(c4323m).m18254e0(str2).m18262m0(i7).m18234K();
    }

    /* renamed from: i */
    public static b m3682i(byte[] bArr) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j7;
        int i12;
        C5356y m3677d = m3677d(bArr);
        m3677d.m21918r(40);
        int m21908h = m3677d.m21908h(2);
        if (m3677d.m21907g()) {
            i7 = 20;
            i8 = 12;
        } else {
            i7 = 16;
            i8 = 8;
        }
        m3677d.m21918r(i8);
        int m21908h2 = m3677d.m21908h(i7) + 1;
        boolean m21907g = m3677d.m21907g();
        int i13 = 0;
        if (m21907g) {
            i9 = m3677d.m21908h(2);
            int m21908h3 = (m3677d.m21908h(3) + 1) * 512;
            if (m3677d.m21907g()) {
                m3677d.m21918r(36);
            }
            int m21908h4 = m3677d.m21908h(3) + 1;
            int m21908h5 = m3677d.m21908h(3) + 1;
            if (m21908h4 != 1 || m21908h5 != 1) {
                throw C4295A.m17947e("Multiple audio presentations or assets not supported");
            }
            int i14 = m21908h + 1;
            int m21908h6 = m3677d.m21908h(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                if (((m21908h6 >> i15) & 1) == 1) {
                    m3677d.m21918r(8);
                }
            }
            if (m3677d.m21907g()) {
                m3677d.m21918r(2);
                int m21908h7 = (m3677d.m21908h(2) + 1) << 2;
                int m21908h8 = m3677d.m21908h(2) + 1;
                while (i13 < m21908h8) {
                    m3677d.m21918r(m21908h7);
                    i13++;
                }
            }
            i13 = m21908h3;
        } else {
            i9 = -1;
        }
        m3677d.m21918r(i7);
        m3677d.m21918r(12);
        if (m21907g) {
            if (m3677d.m21907g()) {
                m3677d.m21918r(4);
            }
            if (m3677d.m21907g()) {
                m3677d.m21918r(24);
            }
            if (m3677d.m21907g()) {
                m3677d.m21919s(m3677d.m21908h(10) + 1);
            }
            m3677d.m21918r(5);
            int i16 = f3092d[m3677d.m21908h(4)];
            i11 = m3677d.m21908h(8) + 1;
            i10 = i16;
        } else {
            i10 = -2147483647;
            i11 = -1;
        }
        if (m21907g) {
            if (i9 == 0) {
                i12 = 32000;
            } else if (i9 == 1) {
                i12 = 44100;
            } else {
                if (i9 != 2) {
                    throw C4295A.m17943a("Unsupported reference clock code in DTS HD header: " + i9, null);
                }
                i12 = 48000;
            }
            j7 = AbstractC5330M.m21718X0(i13, 1000000L, i12);
        } else {
            j7 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", i11, i10, m21908h2, j7, 0);
    }

    /* renamed from: j */
    public static int m3683j(byte[] bArr) {
        C5356y m3677d = m3677d(bArr);
        m3677d.m21918r(42);
        return m3677d.m21908h(m3677d.m21907g() ? 12 : 8) + 1;
    }

    /* renamed from: k */
    public static b m3684k(byte[] bArr, AtomicInteger atomicInteger) {
        int i7;
        long j7;
        int i8;
        int i9;
        C5356y m3677d = m3677d(bArr);
        int i10 = m3677d.m21908h(32) == 1078008818 ? 1 : 0;
        int m3686m = m3686m(m3677d, f3093e, true) + 1;
        if (i10 == 0) {
            i7 = -2147483647;
            j7 = -9223372036854775807L;
        } else {
            if (!m3677d.m21907g()) {
                throw C4295A.m17947e("Only supports full channel mask-based audio presentation");
            }
            m3674a(bArr, m3686m);
            int m21908h = m3677d.m21908h(2);
            if (m21908h == 0) {
                i8 = 512;
            } else if (m21908h == 1) {
                i8 = 480;
            } else {
                if (m21908h != 2) {
                    throw C4295A.m17943a("Unsupported base duration index in DTS UHD header: " + m21908h, null);
                }
                i8 = 384;
            }
            int m21908h2 = i8 * (m3677d.m21908h(3) + 1);
            int m21908h3 = m3677d.m21908h(2);
            if (m21908h3 == 0) {
                i9 = 32000;
            } else if (m21908h3 == 1) {
                i9 = 44100;
            } else {
                if (m21908h3 != 2) {
                    throw C4295A.m17943a("Unsupported clock rate index in DTS UHD header: " + m21908h3, null);
                }
                i9 = 48000;
            }
            if (m3677d.m21907g()) {
                m3677d.m21918r(36);
            }
            i7 = (1 << m3677d.m21908h(2)) * i9;
            j7 = AbstractC5330M.m21718X0(m21908h2, 1000000L, i9);
        }
        int i11 = i7;
        long j8 = j7;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += m3686m(m3677d, f3094f, true);
        }
        if (i10 != 0) {
            atomicInteger.set(m3686m(m3677d, f3095g, true));
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i11, m3686m + i12 + (atomicInteger.get() != 0 ? m3686m(m3677d, f3096h, true) : 0), j8, 0);
    }

    /* renamed from: l */
    public static int m3685l(byte[] bArr) {
        C5356y m3677d = m3677d(bArr);
        m3677d.m21918r(32);
        return m3686m(m3677d, f3097i, true) + 1;
    }

    /* renamed from: m */
    public static int m3686m(C5356y c5356y, int[] iArr, boolean z6) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < 3 && c5356y.m21907g(); i9++) {
            i8++;
        }
        if (z6) {
            int i10 = 0;
            while (i7 < i8) {
                i10 += 1 << iArr[i7];
                i7++;
            }
            i7 = i10;
        }
        return i7 + c5356y.m21908h(iArr[i8]);
    }
}
