package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.protobuf.A0 */
/* loaded from: classes.dex */
public abstract class AbstractC4012A0 {

    /* renamed from: a */
    public static final b f13234a;

    /* renamed from: com.google.protobuf.A0$a */
    public static class a {
        /* renamed from: h */
        public static void m16132h(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) {
            if (m16137m(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || m16137m(b9) || m16137m(b10)) {
                throw C4017D.m16239d();
            }
            int m16142r = ((b7 & 7) << 18) | (m16142r(b8) << 12) | (m16142r(b9) << 6) | m16142r(b10);
            cArr[i7] = m16136l(m16142r);
            cArr[i7 + 1] = m16141q(m16142r);
        }

        /* renamed from: i */
        public static void m16133i(byte b7, char[] cArr, int i7) {
            cArr[i7] = (char) b7;
        }

        /* renamed from: j */
        public static void m16134j(byte b7, byte b8, byte b9, char[] cArr, int i7) {
            if (m16137m(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || m16137m(b9)))) {
                throw C4017D.m16239d();
            }
            cArr[i7] = (char) (((b7 & 15) << 12) | (m16142r(b8) << 6) | m16142r(b9));
        }

        /* renamed from: k */
        public static void m16135k(byte b7, byte b8, char[] cArr, int i7) {
            if (b7 < -62 || m16137m(b8)) {
                throw C4017D.m16239d();
            }
            cArr[i7] = (char) (((b7 & 31) << 6) | m16142r(b8));
        }

        /* renamed from: l */
        public static char m16136l(int i7) {
            return (char) ((i7 >>> 10) + 55232);
        }

        /* renamed from: m */
        public static boolean m16137m(byte b7) {
            return b7 > -65;
        }

        /* renamed from: n */
        public static boolean m16138n(byte b7) {
            return b7 >= 0;
        }

        /* renamed from: o */
        public static boolean m16139o(byte b7) {
            return b7 < -16;
        }

        /* renamed from: p */
        public static boolean m16140p(byte b7) {
            return b7 < -32;
        }

        /* renamed from: q */
        public static char m16141q(int i7) {
            return (char) ((i7 & 1023) + 56320);
        }

        /* renamed from: r */
        public static int m16142r(byte b7) {
            return b7 & 63;
        }
    }

    /* renamed from: com.google.protobuf.A0$b */
    public static abstract class b {
        /* renamed from: j */
        public static int m16143j(ByteBuffer byteBuffer, int i7, int i8) {
            int m16114l = i7 + AbstractC4012A0.m16114l(byteBuffer, i7, i8);
            while (m16114l < i8) {
                int i9 = m16114l + 1;
                byte b7 = byteBuffer.get(m16114l);
                if (b7 >= 0) {
                    m16114l = i9;
                } else if (b7 < -32) {
                    if (i9 >= i8) {
                        return b7;
                    }
                    if (b7 < -62 || byteBuffer.get(i9) > -65) {
                        return -1;
                    }
                    m16114l += 2;
                } else {
                    if (b7 >= -16) {
                        if (i9 >= i8 - 2) {
                            return AbstractC4012A0.m16118p(byteBuffer, b7, i9, i8 - i9);
                        }
                        int i10 = m16114l + 2;
                        byte b8 = byteBuffer.get(i9);
                        if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                            int i11 = m16114l + 3;
                            if (byteBuffer.get(i10) <= -65) {
                                m16114l += 4;
                                if (byteBuffer.get(i11) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i9 >= i8 - 1) {
                        return AbstractC4012A0.m16118p(byteBuffer, b7, i9, i8 - i9);
                    }
                    int i12 = m16114l + 2;
                    byte b9 = byteBuffer.get(i9);
                    if (b9 > -65 || ((b7 == -32 && b9 < -96) || ((b7 == -19 && b9 >= -96) || byteBuffer.get(i12) > -65))) {
                        return -1;
                    }
                    m16114l += 3;
                }
            }
            return 0;
        }

        /* renamed from: a */
        public final String m16144a(ByteBuffer byteBuffer, int i7, int i8) {
            if (byteBuffer.hasArray()) {
                return mo16145b(byteBuffer.array(), byteBuffer.arrayOffset() + i7, i8);
            }
            return byteBuffer.isDirect() ? mo16147d(byteBuffer, i7, i8) : m16146c(byteBuffer, i7, i8);
        }

        /* renamed from: b */
        public abstract String mo16145b(byte[] bArr, int i7, int i8);

        /* renamed from: c */
        public final String m16146c(ByteBuffer byteBuffer, int i7, int i8) {
            if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = byteBuffer.get(i7);
                if (!a.m16138n(b7)) {
                    break;
                }
                i7++;
                a.m16133i(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = byteBuffer.get(i7);
                if (a.m16138n(b8)) {
                    int i13 = i11 + 1;
                    a.m16133i(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = byteBuffer.get(i12);
                        if (!a.m16138n(b9)) {
                            break;
                        }
                        i12++;
                        a.m16133i(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (a.m16140p(b8)) {
                    if (i12 >= i9) {
                        throw C4017D.m16239d();
                    }
                    i7 += 2;
                    a.m16135k(b8, byteBuffer.get(i12), cArr, i11);
                    i11++;
                } else if (a.m16139o(b8)) {
                    if (i12 >= i9 - 1) {
                        throw C4017D.m16239d();
                    }
                    int i14 = i7 + 2;
                    i7 += 3;
                    a.m16134j(b8, byteBuffer.get(i12), byteBuffer.get(i14), cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw C4017D.m16239d();
                    }
                    byte b10 = byteBuffer.get(i12);
                    int i15 = i7 + 3;
                    byte b11 = byteBuffer.get(i7 + 2);
                    i7 += 4;
                    a.m16132h(b8, b10, b11, byteBuffer.get(i15), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        /* renamed from: d */
        public abstract String mo16147d(ByteBuffer byteBuffer, int i7, int i8);

        /* renamed from: e */
        public abstract int mo16148e(CharSequence charSequence, byte[] bArr, int i7, int i8);

        /* renamed from: f */
        public final boolean m16149f(ByteBuffer byteBuffer, int i7, int i8) {
            return m16151h(0, byteBuffer, i7, i8) == 0;
        }

        /* renamed from: g */
        public final boolean m16150g(byte[] bArr, int i7, int i8) {
            return mo16152i(0, bArr, i7, i8) == 0;
        }

        /* renamed from: h */
        public final int m16151h(int i7, ByteBuffer byteBuffer, int i8, int i9) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo16154l(i7, byteBuffer, i8, i9) : m16153k(i7, byteBuffer, i8, i9);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return mo16152i(i7, byteBuffer.array(), i8 + arrayOffset, arrayOffset + i9);
        }

        /* renamed from: i */
        public abstract int mo16152i(int i7, byte[] bArr, int i8, int i9);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int m16153k(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.AbstractC4012A0.m16103a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.AbstractC4012A0.m16103a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.AbstractC4012A0.m16104b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = m16143j(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4012A0.b.m16153k(int, java.nio.ByteBuffer, int, int):int");
        }

        /* renamed from: l */
        public abstract int mo16154l(int i7, ByteBuffer byteBuffer, int i8, int i9);
    }

    /* renamed from: com.google.protobuf.A0$c */
    public static final class c extends b {
        /* renamed from: m */
        public static int m16155m(byte[] bArr, int i7, int i8) {
            while (i7 < i8 && bArr[i7] >= 0) {
                i7++;
            }
            if (i7 >= i8) {
                return 0;
            }
            return m16156n(bArr, i7, i8);
        }

        /* renamed from: n */
        public static int m16156n(byte[] bArr, int i7, int i8) {
            while (i7 < i8) {
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i9 >= i8) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i7 += 2;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 >= -16) {
                        if (i9 >= i8 - 2) {
                            return AbstractC4012A0.m16119q(bArr, i9, i8);
                        }
                        int i10 = i7 + 2;
                        byte b8 = bArr[i9];
                        if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                            int i11 = i7 + 3;
                            if (bArr[i10] <= -65) {
                                i7 += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i9 >= i8 - 1) {
                        return AbstractC4012A0.m16119q(bArr, i9, i8);
                    }
                    int i12 = i7 + 2;
                    byte b9 = bArr[i9];
                    if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                        i7 += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                i7 = i9;
            }
            return 0;
        }

        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: b */
        public String mo16145b(byte[] bArr, int i7, int i8) {
            if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (!a.m16138n(b7)) {
                    break;
                }
                i7++;
                a.m16133i(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (a.m16138n(b8)) {
                    int i13 = i11 + 1;
                    a.m16133i(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = bArr[i12];
                        if (!a.m16138n(b9)) {
                            break;
                        }
                        i12++;
                        a.m16133i(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (a.m16140p(b8)) {
                    if (i12 >= i9) {
                        throw C4017D.m16239d();
                    }
                    i7 += 2;
                    a.m16135k(b8, bArr[i12], cArr, i11);
                    i11++;
                } else if (a.m16139o(b8)) {
                    if (i12 >= i9 - 1) {
                        throw C4017D.m16239d();
                    }
                    int i14 = i7 + 2;
                    i7 += 3;
                    a.m16134j(b8, bArr[i12], bArr[i14], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw C4017D.m16239d();
                    }
                    byte b10 = bArr[i12];
                    int i15 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    a.m16132h(b8, b10, b11, bArr[i15], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: d */
        public String mo16147d(ByteBuffer byteBuffer, int i7, int i8) {
            return m16146c(byteBuffer, i7, i8);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo16148e(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4012A0.c.mo16148e(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo16152i(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.AbstractC4012A0.m16103a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.AbstractC4012A0.m16103a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.AbstractC4012A0.m16104b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = m16155m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4012A0.c.mo16152i(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: l */
        public int mo16154l(int i7, ByteBuffer byteBuffer, int i8, int i9) {
            return m16153k(i7, byteBuffer, i8, i9);
        }
    }

    /* renamed from: com.google.protobuf.A0$d */
    public static class d extends IllegalArgumentException {
        public d(int i7, int i8) {
            super("Unpaired surrogate at index " + i7 + " of " + i8);
        }
    }

    /* renamed from: com.google.protobuf.A0$e */
    public static final class e extends b {
        /* renamed from: m */
        public static boolean m16157m() {
            return AbstractC4090z0.m17089I() && AbstractC4090z0.m17090J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m16158n(long r10, int r12) {
            /*
                int r0 = m16160p(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = com.google.protobuf.AbstractC4090z0.m17127w(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = com.google.protobuf.AbstractC4090z0.m17127w(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = m16162r(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.AbstractC4090z0.m17127w(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = com.google.protobuf.AbstractC4090z0.m17127w(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = m16162r(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.AbstractC4090z0.m17127w(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = com.google.protobuf.AbstractC4090z0.m17127w(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.protobuf.AbstractC4090z0.m17127w(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4012A0.e.m16158n(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m16159o(byte[] r10, long r11, int r13) {
            /*
                int r0 = m16161q(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.protobuf.AbstractC4090z0.m17128x(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.protobuf.AbstractC4090z0.m17128x(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = m16163s(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.AbstractC4090z0.m17128x(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.protobuf.AbstractC4090z0.m17128x(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = m16163s(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.AbstractC4090z0.m17128x(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.protobuf.AbstractC4090z0.m17128x(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.protobuf.AbstractC4090z0.m17128x(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4012A0.e.m16159o(byte[], long, int):int");
        }

        /* renamed from: p */
        public static int m16160p(long j7, int i7) {
            if (i7 < 16) {
                return 0;
            }
            int i8 = (int) ((-j7) & 7);
            int i9 = i8;
            while (i9 > 0) {
                long j8 = 1 + j7;
                if (AbstractC4090z0.m17127w(j7) < 0) {
                    return i8 - i9;
                }
                i9--;
                j7 = j8;
            }
            int i10 = i7 - i8;
            while (i10 >= 8 && (AbstractC4090z0.m17084D(j7) & (-9187201950435737472L)) == 0) {
                j7 += 8;
                i10 -= 8;
            }
            return i7 - i10;
        }

        /* renamed from: q */
        public static int m16161q(byte[] bArr, long j7, int i7) {
            int i8 = 0;
            if (i7 < 16) {
                return 0;
            }
            int i9 = 8 - (((int) j7) & 7);
            while (i8 < i9) {
                long j8 = 1 + j7;
                if (AbstractC4090z0.m17128x(bArr, j7) < 0) {
                    return i8;
                }
                i8++;
                j7 = j8;
            }
            while (true) {
                int i10 = i8 + 8;
                if (i10 > i7 || (AbstractC4090z0.m17085E(bArr, AbstractC4090z0.f13621h + j7) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j7 += 8;
                i8 = i10;
            }
            while (i8 < i7) {
                long j9 = j7 + 1;
                if (AbstractC4090z0.m17128x(bArr, j7) < 0) {
                    return i8;
                }
                i8++;
                j7 = j9;
            }
            return i7;
        }

        /* renamed from: r */
        public static int m16162r(long j7, int i7, int i8) {
            if (i8 == 0) {
                return AbstractC4012A0.m16115m(i7);
            }
            if (i8 == 1) {
                return AbstractC4012A0.m16116n(i7, AbstractC4090z0.m17127w(j7));
            }
            if (i8 == 2) {
                return AbstractC4012A0.m16117o(i7, AbstractC4090z0.m17127w(j7), AbstractC4090z0.m17127w(j7 + 1));
            }
            throw new AssertionError();
        }

        /* renamed from: s */
        public static int m16163s(byte[] bArr, int i7, long j7, int i8) {
            if (i8 == 0) {
                return AbstractC4012A0.m16115m(i7);
            }
            if (i8 == 1) {
                return AbstractC4012A0.m16116n(i7, AbstractC4090z0.m17128x(bArr, j7));
            }
            if (i8 == 2) {
                return AbstractC4012A0.m16117o(i7, AbstractC4090z0.m17128x(bArr, j7), AbstractC4090z0.m17128x(bArr, j7 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: b */
        public String mo16145b(byte[] bArr, int i7, int i8) {
            Charset charset = AbstractC4015C.f13275b;
            String str = new String(bArr, i7, i8, charset);
            if (!str.contains("�")) {
                return str;
            }
            if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                return str;
            }
            throw C4017D.m16239d();
        }

        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: d */
        public String mo16147d(ByteBuffer byteBuffer, int i7, int i8) {
            if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            long m17115k = AbstractC4090z0.m17115k(byteBuffer) + i7;
            long j7 = i8 + m17115k;
            char[] cArr = new char[i8];
            int i9 = 0;
            while (m17115k < j7) {
                byte m17127w = AbstractC4090z0.m17127w(m17115k);
                if (!a.m16138n(m17127w)) {
                    break;
                }
                m17115k++;
                a.m16133i(m17127w, cArr, i9);
                i9++;
            }
            while (m17115k < j7) {
                long j8 = m17115k + 1;
                byte m17127w2 = AbstractC4090z0.m17127w(m17115k);
                if (a.m16138n(m17127w2)) {
                    int i10 = i9 + 1;
                    a.m16133i(m17127w2, cArr, i9);
                    while (j8 < j7) {
                        byte m17127w3 = AbstractC4090z0.m17127w(j8);
                        if (!a.m16138n(m17127w3)) {
                            break;
                        }
                        j8++;
                        a.m16133i(m17127w3, cArr, i10);
                        i10++;
                    }
                    i9 = i10;
                    m17115k = j8;
                } else if (a.m16140p(m17127w2)) {
                    if (j8 >= j7) {
                        throw C4017D.m16239d();
                    }
                    m17115k += 2;
                    a.m16135k(m17127w2, AbstractC4090z0.m17127w(j8), cArr, i9);
                    i9++;
                } else if (a.m16139o(m17127w2)) {
                    if (j8 >= j7 - 1) {
                        throw C4017D.m16239d();
                    }
                    long j9 = 2 + m17115k;
                    m17115k += 3;
                    a.m16134j(m17127w2, AbstractC4090z0.m17127w(j8), AbstractC4090z0.m17127w(j9), cArr, i9);
                    i9++;
                } else {
                    if (j8 >= j7 - 2) {
                        throw C4017D.m16239d();
                    }
                    byte m17127w4 = AbstractC4090z0.m17127w(j8);
                    long j10 = m17115k + 3;
                    byte m17127w5 = AbstractC4090z0.m17127w(2 + m17115k);
                    m17115k += 4;
                    a.m16132h(m17127w2, m17127w4, m17127w5, AbstractC4090z0.m17127w(j10), cArr, i9);
                    i9 += 2;
                }
            }
            return new String(cArr, 0, i9);
        }

        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: e */
        public int mo16148e(CharSequence charSequence, byte[] bArr, int i7, int i8) {
            long j7;
            String str;
            String str2;
            int i9;
            long j8;
            long j9;
            char charAt;
            long j10 = i7;
            long j11 = i8 + j10;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i8 || bArr.length - i8 < i7) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i7 + i8));
            }
            int i10 = 0;
            while (true) {
                j7 = 1;
                if (i10 >= length || (charAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                AbstractC4090z0.m17095O(bArr, j10, (byte) charAt);
                i10++;
                j10 = 1 + j10;
            }
            if (i10 == length) {
                return (int) j10;
            }
            while (i10 < length) {
                char charAt2 = charSequence.charAt(i10);
                if (charAt2 >= 128 || j10 >= j11) {
                    if (charAt2 >= 2048 || j10 > j11 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j10 > j11 - 3) {
                            if (j10 > j11 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i9)))) {
                                    throw new d(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j10);
                            }
                            int i11 = i10 + 1;
                            if (i11 != length) {
                                char charAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j8 = 1;
                                    AbstractC4090z0.m17095O(bArr, j10, (byte) ((codePoint >>> 18) | 240));
                                    j9 = j11;
                                    AbstractC4090z0.m17095O(bArr, j10 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = j10 + 3;
                                    AbstractC4090z0.m17095O(bArr, j10 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j10 += 4;
                                    AbstractC4090z0.m17095O(bArr, j12, (byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            throw new d(i10 - 1, length);
                        }
                        AbstractC4090z0.m17095O(bArr, j10, (byte) ((charAt2 >>> '\f') | 480));
                        long j13 = j10 + 2;
                        AbstractC4090z0.m17095O(bArr, j10 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j10 += 3;
                        AbstractC4090z0.m17095O(bArr, j13, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j14 = j10 + j7;
                        AbstractC4090z0.m17095O(bArr, j10, (byte) ((charAt2 >>> 6) | 960));
                        j10 += 2;
                        AbstractC4090z0.m17095O(bArr, j14, (byte) ((charAt2 & '?') | 128));
                    }
                    j9 = j11;
                    j8 = 1;
                } else {
                    AbstractC4090z0.m17095O(bArr, j10, (byte) charAt2);
                    j9 = j11;
                    str2 = str4;
                    j8 = j7;
                    j10 += j7;
                    str = str3;
                }
                i10++;
                str3 = str;
                str4 = str2;
                j7 = j8;
                j11 = j9;
            }
            return (int) j10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        
            if (com.google.protobuf.AbstractC4090z0.m17128x(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (com.google.protobuf.AbstractC4090z0.m17128x(r13, r1) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo16152i(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4012A0.e.mo16152i(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            if (com.google.protobuf.AbstractC4090z0.m17127w(r1) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        
            if (com.google.protobuf.AbstractC4090z0.m17127w(r1) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
        
            if (com.google.protobuf.AbstractC4090z0.m17127w(r1) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.AbstractC4012A0.b
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo16154l(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4012A0.e.mo16154l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f13234a = (!e.m16157m() || AbstractC4045d.m16430c()) ? new c() : new e();
    }

    /* renamed from: g */
    public static String m16109g(ByteBuffer byteBuffer, int i7, int i8) {
        return f13234a.m16144a(byteBuffer, i7, i8);
    }

    /* renamed from: h */
    public static String m16110h(byte[] bArr, int i7, int i8) {
        return f13234a.mo16145b(bArr, i7, i8);
    }

    /* renamed from: i */
    public static int m16111i(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        return f13234a.mo16148e(charSequence, bArr, i7, i8);
    }

    /* renamed from: j */
    public static int m16112j(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            if (i7 < length) {
                char charAt = charSequence.charAt(i7);
                if (charAt >= 2048) {
                    i8 += m16113k(charSequence, i7);
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

    /* renamed from: k */
    public static int m16113k(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i8 = 0;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            if (charAt < 2048) {
                i8 += (127 - charAt) >>> 31;
            } else {
                i8 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i7) < 65536) {
                        throw new d(i7, length);
                    }
                    i7++;
                }
            }
            i7++;
        }
        return i8;
    }

    /* renamed from: l */
    public static int m16114l(ByteBuffer byteBuffer, int i7, int i8) {
        int i9 = i8 - 7;
        int i10 = i7;
        while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
            i10 += 8;
        }
        return i10 - i7;
    }

    /* renamed from: m */
    public static int m16115m(int i7) {
        if (i7 > -12) {
            return -1;
        }
        return i7;
    }

    /* renamed from: n */
    public static int m16116n(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    /* renamed from: o */
    public static int m16117o(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }

    /* renamed from: p */
    public static int m16118p(ByteBuffer byteBuffer, int i7, int i8, int i9) {
        if (i9 == 0) {
            return m16115m(i7);
        }
        if (i9 == 1) {
            return m16116n(i7, byteBuffer.get(i8));
        }
        if (i9 == 2) {
            return m16117o(i7, byteBuffer.get(i8), byteBuffer.get(i8 + 1));
        }
        throw new AssertionError();
    }

    /* renamed from: q */
    public static int m16119q(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            return m16115m(b7);
        }
        if (i9 == 1) {
            return m16116n(b7, bArr[i7]);
        }
        if (i9 == 2) {
            return m16117o(b7, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: r */
    public static boolean m16120r(ByteBuffer byteBuffer) {
        return f13234a.m16149f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: s */
    public static boolean m16121s(byte[] bArr) {
        return f13234a.m16150g(bArr, 0, bArr.length);
    }

    /* renamed from: t */
    public static boolean m16122t(byte[] bArr, int i7, int i8) {
        return f13234a.m16150g(bArr, i7, i8);
    }

    /* renamed from: u */
    public static int m16123u(int i7, ByteBuffer byteBuffer, int i8, int i9) {
        return f13234a.m16151h(i7, byteBuffer, i8, i9);
    }

    /* renamed from: v */
    public static int m16124v(int i7, byte[] bArr, int i8, int i9) {
        return f13234a.mo16152i(i7, bArr, i8, i9);
    }
}
