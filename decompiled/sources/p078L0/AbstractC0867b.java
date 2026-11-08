package p078L0;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p232g0.C4323m;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.C5356y;
import p259j0.C5357z;

/* renamed from: L0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0867b {

    /* renamed from: a */
    public static final int[] f2989a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f2990b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f2991c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f2992d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f2993e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f2994f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: L0.b$b */
    public static final class b {

        /* renamed from: a */
        public final String f2995a;

        /* renamed from: b */
        public final int f2996b;

        /* renamed from: c */
        public final int f2997c;

        /* renamed from: d */
        public final int f2998d;

        /* renamed from: e */
        public final int f2999e;

        /* renamed from: f */
        public final int f3000f;

        /* renamed from: g */
        public final int f3001g;

        public b(String str, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f2995a = str;
            this.f2996b = i7;
            this.f2998d = i8;
            this.f2997c = i9;
            this.f2999e = i10;
            this.f3000f = i11;
            this.f3001g = i12;
        }
    }

    /* renamed from: a */
    public static int m3589a(int i7, int i8, int i9) {
        return (i7 * i8) / (i9 * 32);
    }

    /* renamed from: b */
    public static int m3590b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i7 = position; i7 <= limit; i7++) {
            if ((AbstractC5330M.m21701P(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                return i7 - position;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static int m3591c(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 < 0) {
            return -1;
        }
        int[] iArr = f2990b;
        if (i7 >= iArr.length || i8 < 0) {
            return -1;
        }
        int[] iArr2 = f2994f;
        if (i9 >= iArr2.length) {
            return -1;
        }
        int i10 = iArr[i7];
        if (i10 == 44100) {
            return (iArr2[i9] + (i8 % 2)) * 2;
        }
        int i11 = f2993e[i9];
        return i10 == 32000 ? i11 * 6 : i11 * 4;
    }

    /* renamed from: d */
    public static C4327q m3592d(C5357z c5357z, String str, String str2, C4323m c4323m) {
        C5356y c5356y = new C5356y();
        c5356y.m21913m(c5357z);
        int i7 = f2990b[c5356y.m21908h(2)];
        c5356y.m21918r(8);
        int i8 = f2992d[c5356y.m21908h(3)];
        if (c5356y.m21908h(1) != 0) {
            i8++;
        }
        int i9 = f2993e[c5356y.m21908h(5)] * PipesIterator.DEFAULT_QUEUE_SIZE;
        c5356y.m21903c();
        c5357z.m21939T(c5356y.m21904d());
        return new C4327q.b().m18250a0(str).m18264o0("audio/ac3").m18237N(i8).m18265p0(i7).m18244U(c4323m).m18254e0(str2).m18236M(i9).m18259j0(i9).m18234K();
    }

    /* renamed from: e */
    public static int m3593e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f2989a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* renamed from: f */
    public static b m3594f(C5356y c5356y) {
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int m21905e = c5356y.m21905e();
        c5356y.m21918r(40);
        boolean z6 = c5356y.m21908h(5) > 10;
        c5356y.m21916p(m21905e);
        int i19 = -1;
        if (z6) {
            c5356y.m21918r(16);
            int m21908h = c5356y.m21908h(2);
            if (m21908h == 0) {
                i19 = 0;
            } else if (m21908h == 1) {
                i19 = 1;
            } else if (m21908h == 2) {
                i19 = 2;
            }
            c5356y.m21918r(3);
            int m21908h2 = (c5356y.m21908h(11) + 1) * 2;
            int m21908h3 = c5356y.m21908h(2);
            if (m21908h3 == 3) {
                i14 = f2991c[c5356y.m21908h(2)];
                i13 = 3;
                i15 = 6;
            } else {
                int m21908h4 = c5356y.m21908h(2);
                int i20 = f2989a[m21908h4];
                i13 = m21908h4;
                i14 = f2990b[m21908h3];
                i15 = i20;
            }
            int i21 = i15 * 256;
            int m3589a = m3589a(m21908h2, i14, i15);
            int m21908h5 = c5356y.m21908h(3);
            boolean m21907g = c5356y.m21907g();
            i7 = f2992d[m21908h5] + (m21907g ? 1 : 0);
            c5356y.m21918r(10);
            if (c5356y.m21907g()) {
                c5356y.m21918r(8);
            }
            if (m21908h5 == 0) {
                c5356y.m21918r(5);
                if (c5356y.m21907g()) {
                    c5356y.m21918r(8);
                }
            }
            if (i19 == 1 && c5356y.m21907g()) {
                c5356y.m21918r(16);
            }
            if (c5356y.m21907g()) {
                if (m21908h5 > 2) {
                    c5356y.m21918r(2);
                }
                if ((m21908h5 & 1) == 0 || m21908h5 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    c5356y.m21918r(6);
                }
                if ((m21908h5 & 4) != 0) {
                    c5356y.m21918r(i17);
                }
                if (m21907g && c5356y.m21907g()) {
                    c5356y.m21918r(5);
                }
                if (i19 == 0) {
                    if (c5356y.m21907g()) {
                        i18 = 6;
                        c5356y.m21918r(6);
                    } else {
                        i18 = 6;
                    }
                    if (m21908h5 == 0 && c5356y.m21907g()) {
                        c5356y.m21918r(i18);
                    }
                    if (c5356y.m21907g()) {
                        c5356y.m21918r(i18);
                    }
                    int m21908h6 = c5356y.m21908h(2);
                    if (m21908h6 == 1) {
                        c5356y.m21918r(5);
                    } else if (m21908h6 == 2) {
                        c5356y.m21918r(12);
                    } else if (m21908h6 == 3) {
                        int m21908h7 = c5356y.m21908h(5);
                        if (c5356y.m21907g()) {
                            c5356y.m21918r(5);
                            if (c5356y.m21907g()) {
                                c5356y.m21918r(4);
                            }
                            if (c5356y.m21907g()) {
                                c5356y.m21918r(4);
                            }
                            if (c5356y.m21907g()) {
                                c5356y.m21918r(4);
                            }
                            if (c5356y.m21907g()) {
                                c5356y.m21918r(4);
                            }
                            if (c5356y.m21907g()) {
                                c5356y.m21918r(4);
                            }
                            if (c5356y.m21907g()) {
                                c5356y.m21918r(4);
                            }
                            if (c5356y.m21907g()) {
                                c5356y.m21918r(4);
                            }
                            if (c5356y.m21907g()) {
                                if (c5356y.m21907g()) {
                                    c5356y.m21918r(4);
                                }
                                if (c5356y.m21907g()) {
                                    c5356y.m21918r(4);
                                }
                            }
                        }
                        if (c5356y.m21907g()) {
                            c5356y.m21918r(5);
                            if (c5356y.m21907g()) {
                                c5356y.m21918r(7);
                                if (c5356y.m21907g()) {
                                    c5356y.m21918r(8);
                                }
                            }
                        }
                        c5356y.m21918r((m21908h7 + 2) * 8);
                        c5356y.m21903c();
                    }
                    if (m21908h5 < 2) {
                        if (c5356y.m21907g()) {
                            c5356y.m21918r(14);
                        }
                        if (m21908h5 == 0 && c5356y.m21907g()) {
                            c5356y.m21918r(14);
                        }
                    }
                    if (c5356y.m21907g()) {
                        if (i13 == 0) {
                            c5356y.m21918r(5);
                        } else {
                            for (int i22 = 0; i22 < i15; i22++) {
                                if (c5356y.m21907g()) {
                                    c5356y.m21918r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c5356y.m21907g()) {
                c5356y.m21918r(5);
                if (m21908h5 == 2) {
                    c5356y.m21918r(4);
                }
                if (m21908h5 >= 6) {
                    c5356y.m21918r(2);
                }
                if (c5356y.m21907g()) {
                    c5356y.m21918r(8);
                }
                if (m21908h5 == 0 && c5356y.m21907g()) {
                    c5356y.m21918r(8);
                }
                if (m21908h3 < 3) {
                    c5356y.m21917q();
                }
            }
            if (i19 == 0 && i13 != 3) {
                c5356y.m21917q();
            }
            if (i19 == 2 && (i13 == 3 || c5356y.m21907g())) {
                i16 = 6;
                c5356y.m21918r(6);
            } else {
                i16 = 6;
            }
            str = (c5356y.m21907g() && c5356y.m21908h(i16) == 1 && c5356y.m21908h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i8 = i19;
            i9 = i21;
            i11 = m21908h2;
            i12 = i14;
            i10 = m3589a;
        } else {
            c5356y.m21918r(32);
            int m21908h8 = c5356y.m21908h(2);
            String str2 = m21908h8 == 3 ? null : "audio/ac3";
            int m21908h9 = c5356y.m21908h(6);
            int i23 = f2993e[m21908h9 / 2] * PipesIterator.DEFAULT_QUEUE_SIZE;
            int m3591c = m3591c(m21908h8, m21908h9);
            c5356y.m21918r(8);
            int m21908h10 = c5356y.m21908h(3);
            if ((m21908h10 & 1) != 0 && m21908h10 != 1) {
                c5356y.m21918r(2);
            }
            if ((m21908h10 & 4) != 0) {
                c5356y.m21918r(2);
            }
            if (m21908h10 == 2) {
                c5356y.m21918r(2);
            }
            int[] iArr = f2990b;
            int i24 = m21908h8 < iArr.length ? iArr[m21908h8] : -1;
            i7 = f2992d[m21908h10] + (c5356y.m21907g() ? 1 : 0);
            i8 = -1;
            str = str2;
            i9 = 1536;
            i10 = i23;
            i11 = m3591c;
            i12 = i24;
        }
        return new b(str, i8, i7, i12, i11, i9, i10);
    }

    /* renamed from: g */
    public static int m3595g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & ForkServer.ERROR) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b7 = bArr[4];
        return m3591c((b7 & 192) >> 6, b7 & 63);
    }

    /* renamed from: h */
    public static C4327q m3596h(C5357z c5357z, String str, String str2, C4323m c4323m) {
        String str3;
        C5356y c5356y = new C5356y();
        c5356y.m21913m(c5357z);
        int m21908h = c5356y.m21908h(13) * PipesIterator.DEFAULT_QUEUE_SIZE;
        c5356y.m21918r(3);
        int i7 = f2990b[c5356y.m21908h(2)];
        c5356y.m21918r(10);
        int i8 = f2992d[c5356y.m21908h(3)];
        if (c5356y.m21908h(1) != 0) {
            i8++;
        }
        c5356y.m21918r(3);
        int m21908h2 = c5356y.m21908h(4);
        c5356y.m21918r(1);
        if (m21908h2 > 0) {
            c5356y.m21918r(6);
            if (c5356y.m21908h(1) != 0) {
                i8 += 2;
            }
            c5356y.m21918r(1);
        }
        if (c5356y.m21902b() > 7) {
            c5356y.m21918r(7);
            if (c5356y.m21908h(1) != 0) {
                str3 = "audio/eac3-joc";
                c5356y.m21903c();
                c5357z.m21939T(c5356y.m21904d());
                return new C4327q.b().m18250a0(str).m18264o0(str3).m18237N(i8).m18265p0(i7).m18244U(c4323m).m18254e0(str2).m18259j0(m21908h).m18234K();
            }
        }
        str3 = "audio/eac3";
        c5356y.m21903c();
        c5357z.m21939T(c5356y.m21904d());
        return new C4327q.b().m18250a0(str).m18264o0(str3).m18237N(i8).m18265p0(i7).m18244U(c4323m).m18254e0(str2).m18259j0(m21908h).m18234K();
    }

    /* renamed from: i */
    public static int m3597i(ByteBuffer byteBuffer, int i7) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i7) + ((byteBuffer.get((byteBuffer.position() + i7) + 7) & ForkServer.ERROR) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: j */
    public static int m3598j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b7 = bArr[7];
            if ((b7 & 254) == 186) {
                return 40 << ((bArr[(b7 & ForkServer.ERROR) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
