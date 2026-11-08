package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC3299j0 {

    /* renamed from: a */
    public static final b f10529a;

    /* renamed from: androidx.datastore.preferences.protobuf.j0$a */
    public static class a {
        /* renamed from: h */
        public static void m12731h(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) {
            if (m12736m(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || m12736m(b9) || m12736m(b10)) {
                throw C3313v.m12844d();
            }
            int m12741r = ((b7 & 7) << 18) | (m12741r(b8) << 12) | (m12741r(b9) << 6) | m12741r(b10);
            cArr[i7] = m12735l(m12741r);
            cArr[i7 + 1] = m12740q(m12741r);
        }

        /* renamed from: i */
        public static void m12732i(byte b7, char[] cArr, int i7) {
            cArr[i7] = (char) b7;
        }

        /* renamed from: j */
        public static void m12733j(byte b7, byte b8, byte b9, char[] cArr, int i7) {
            if (m12736m(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || m12736m(b9)))) {
                throw C3313v.m12844d();
            }
            cArr[i7] = (char) (((b7 & 15) << 12) | (m12741r(b8) << 6) | m12741r(b9));
        }

        /* renamed from: k */
        public static void m12734k(byte b7, byte b8, char[] cArr, int i7) {
            if (b7 < -62 || m12736m(b8)) {
                throw C3313v.m12844d();
            }
            cArr[i7] = (char) (((b7 & 31) << 6) | m12741r(b8));
        }

        /* renamed from: l */
        public static char m12735l(int i7) {
            return (char) ((i7 >>> 10) + 55232);
        }

        /* renamed from: m */
        public static boolean m12736m(byte b7) {
            return b7 > -65;
        }

        /* renamed from: n */
        public static boolean m12737n(byte b7) {
            return b7 >= 0;
        }

        /* renamed from: o */
        public static boolean m12738o(byte b7) {
            return b7 < -16;
        }

        /* renamed from: p */
        public static boolean m12739p(byte b7) {
            return b7 < -32;
        }

        /* renamed from: q */
        public static char m12740q(int i7) {
            return (char) ((i7 & 1023) + 56320);
        }

        /* renamed from: r */
        public static int m12741r(byte b7) {
            return b7 & 63;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j0$b */
    public static abstract class b {
        /* renamed from: a */
        public abstract String mo12742a(byte[] bArr, int i7, int i8);

        /* renamed from: b */
        public abstract int mo12743b(String str, byte[] bArr, int i7, int i8);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j0$c */
    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.AbstractC3299j0.b
        /* renamed from: a */
        public String mo12742a(byte[] bArr, int i7, int i8) {
            if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (!a.m12737n(b7)) {
                    break;
                }
                i7++;
                a.m12732i(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (a.m12737n(b8)) {
                    int i13 = i11 + 1;
                    a.m12732i(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = bArr[i12];
                        if (!a.m12737n(b9)) {
                            break;
                        }
                        i12++;
                        a.m12732i(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (a.m12739p(b8)) {
                    if (i12 >= i9) {
                        throw C3313v.m12844d();
                    }
                    i7 += 2;
                    a.m12734k(b8, bArr[i12], cArr, i11);
                    i11++;
                } else if (a.m12738o(b8)) {
                    if (i12 >= i9 - 1) {
                        throw C3313v.m12844d();
                    }
                    int i14 = i7 + 2;
                    i7 += 3;
                    a.m12733j(b8, bArr[i12], bArr[i14], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw C3313v.m12844d();
                    }
                    byte b10 = bArr[i12];
                    int i15 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    a.m12731h(b8, b10, b11, bArr[i15], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.AbstractC3299j0.b
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo12743b(java.lang.String r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC3299j0.c.mo12743b(java.lang.String, byte[], int, int):int");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j0$d */
    public static class d extends IllegalArgumentException {
        public d(int i7, int i8) {
            super("Unpaired surrogate at index " + i7 + " of " + i8);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j0$e */
    public static final class e extends b {
        /* renamed from: c */
        public static boolean m12744c() {
            return AbstractC3297i0.m12598B() && AbstractC3297i0.m12599C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3299j0.b
        /* renamed from: a */
        public String mo12742a(byte[] bArr, int i7, int i8) {
            Charset charset = AbstractC3312u.f10663b;
            String str = new String(bArr, i7, i8, charset);
            if (str.indexOf(65533) < 0) {
                return str;
            }
            if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                return str;
            }
            throw C3313v.m12844d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3299j0.b
        /* renamed from: b */
        public int mo12743b(String str, byte[] bArr, int i7, int i8) {
            long j7;
            String str2;
            String str3;
            int i9;
            long j8;
            long j9;
            char charAt;
            long j10 = i7;
            long j11 = i8 + j10;
            int length = str.length();
            String str4 = " at index ";
            String str5 = "Failed writing ";
            if (length > i8 || bArr.length - i8 < i7) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i7 + i8));
            }
            int i10 = 0;
            while (true) {
                j7 = 1;
                if (i10 >= length || (charAt = str.charAt(i10)) >= 128) {
                    break;
                }
                AbstractC3297i0.m12604H(bArr, j10, (byte) charAt);
                i10++;
                j10 = 1 + j10;
            }
            if (i10 == length) {
                return (int) j10;
            }
            while (i10 < length) {
                char charAt2 = str.charAt(i10);
                if (charAt2 >= 128 || j10 >= j11) {
                    if (charAt2 >= 2048 || j10 > j11 - 2) {
                        str2 = str4;
                        str3 = str5;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j10 > j11 - 3) {
                            if (j10 > j11 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i9)))) {
                                    throw new d(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str3 + charAt2 + str2 + j10);
                            }
                            int i11 = i10 + 1;
                            if (i11 != length) {
                                char charAt3 = str.charAt(i11);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j8 = 1;
                                    AbstractC3297i0.m12604H(bArr, j10, (byte) ((codePoint >>> 18) | 240));
                                    j9 = j11;
                                    AbstractC3297i0.m12604H(bArr, j10 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = j10 + 3;
                                    AbstractC3297i0.m12604H(bArr, j10 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j10 += 4;
                                    AbstractC3297i0.m12604H(bArr, j12, (byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            throw new d(i10 - 1, length);
                        }
                        AbstractC3297i0.m12604H(bArr, j10, (byte) ((charAt2 >>> '\f') | 480));
                        long j13 = j10 + 2;
                        AbstractC3297i0.m12604H(bArr, j10 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j10 += 3;
                        AbstractC3297i0.m12604H(bArr, j13, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str2 = str4;
                        str3 = str5;
                        long j14 = j10 + j7;
                        AbstractC3297i0.m12604H(bArr, j10, (byte) ((charAt2 >>> 6) | 960));
                        j10 += 2;
                        AbstractC3297i0.m12604H(bArr, j14, (byte) ((charAt2 & '?') | 128));
                    }
                    j9 = j11;
                    j8 = 1;
                } else {
                    AbstractC3297i0.m12604H(bArr, j10, (byte) charAt2);
                    j9 = j11;
                    str3 = str5;
                    j8 = j7;
                    j10 += j7;
                    str2 = str4;
                }
                i10++;
                str4 = str2;
                str5 = str3;
                j7 = j8;
                j11 = j9;
            }
            return (int) j10;
        }
    }

    static {
        f10529a = (!e.m12744c() || AbstractC3286d.m12327c()) ? new c() : new e();
    }

    /* renamed from: a */
    public static String m12720a(byte[] bArr, int i7, int i8) {
        return f10529a.mo12742a(bArr, i7, i8);
    }

    /* renamed from: b */
    public static int m12721b(String str, byte[] bArr, int i7, int i8) {
        return f10529a.mo12743b(str, bArr, i7, i8);
    }

    /* renamed from: c */
    public static int m12722c(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length && str.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            if (i7 < length) {
                char charAt = str.charAt(i7);
                if (charAt >= 2048) {
                    i8 += m12723d(str, i7);
                    break;
                }
                i8 += (127 - charAt) >>> 31;
                i7++;
            } else {
                break;
            }
        }
        if (i8 >= length) {
            return i8;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i8 + 4294967296L));
    }

    /* renamed from: d */
    public static int m12723d(String str, int i7) {
        int length = str.length();
        int i8 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt < 2048) {
                i8 += (127 - charAt) >>> 31;
            } else {
                i8 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(str, i7) < 65536) {
                        throw new d(i7, length);
                    }
                    i7++;
                }
            }
            i7++;
        }
        return i8;
    }
}
