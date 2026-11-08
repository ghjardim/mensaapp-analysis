package com.google.protobuf;

import com.google.protobuf.AbstractC4015C;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.protobuf.f */
/* loaded from: classes.dex */
public abstract class AbstractC4049f {

    /* renamed from: a */
    public static volatile int f13369a = 100;

    /* renamed from: com.google.protobuf.f$a */
    public static final class a {

        /* renamed from: a */
        public int f13370a;

        /* renamed from: b */
        public long f13371b;

        /* renamed from: c */
        public Object f13372c;

        /* renamed from: d */
        public final C4071q f13373d;

        /* renamed from: e */
        public int f13374e;

        public a(C4071q c4071q) {
            c4071q.getClass();
            this.f13373d = c4071q;
        }
    }

    /* renamed from: A */
    public static int m16445A(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        C4013B c4013b = (C4013B) eVar;
        int m16453I = m16453I(bArr, i8, aVar);
        c4013b.m16170f(AbstractC4057j.m16523c(aVar.f13370a));
        while (m16453I < i9) {
            int m16453I2 = m16453I(bArr, m16453I, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16453I = m16453I(bArr, m16453I2, aVar);
            c4013b.m16170f(AbstractC4057j.m16523c(aVar.f13370a));
        }
        return m16453I;
    }

    /* renamed from: B */
    public static int m16446B(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        AbstractC4025L abstractC4025L = (AbstractC4025L) eVar;
        int m16456L = m16456L(bArr, i8, aVar);
        abstractC4025L.m16274b(AbstractC4057j.m16524d(aVar.f13371b));
        while (m16456L < i9) {
            int m16453I = m16453I(bArr, m16456L, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16456L = m16456L(bArr, m16453I, aVar);
            abstractC4025L.m16274b(AbstractC4057j.m16524d(aVar.f13371b));
        }
        return m16456L;
    }

    /* renamed from: C */
    public static int m16447C(byte[] bArr, int i7, a aVar) {
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a;
        if (i8 < 0) {
            throw C4017D.m16242g();
        }
        if (i8 == 0) {
            aVar.f13372c = StringUtils.EMPTY;
            return m16453I;
        }
        aVar.f13372c = new String(bArr, m16453I, i8, AbstractC4015C.f13275b);
        return m16453I + i8;
    }

    /* renamed from: D */
    public static int m16448D(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        int m16453I = m16453I(bArr, i8, aVar);
        int i10 = aVar.f13370a;
        if (i10 < 0) {
            throw C4017D.m16242g();
        }
        if (i10 == 0) {
            eVar.add(StringUtils.EMPTY);
        } else {
            eVar.add(new String(bArr, m16453I, i10, AbstractC4015C.f13275b));
            m16453I += i10;
        }
        while (m16453I < i9) {
            int m16453I2 = m16453I(bArr, m16453I, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16453I = m16453I(bArr, m16453I2, aVar);
            int i11 = aVar.f13370a;
            if (i11 < 0) {
                throw C4017D.m16242g();
            }
            if (i11 == 0) {
                eVar.add(StringUtils.EMPTY);
            } else {
                eVar.add(new String(bArr, m16453I, i11, AbstractC4015C.f13275b));
                m16453I += i11;
            }
        }
        return m16453I;
    }

    /* renamed from: E */
    public static int m16449E(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        int m16453I = m16453I(bArr, i8, aVar);
        int i10 = aVar.f13370a;
        if (i10 < 0) {
            throw C4017D.m16242g();
        }
        if (i10 == 0) {
            eVar.add(StringUtils.EMPTY);
        } else {
            int i11 = m16453I + i10;
            if (!AbstractC4012A0.m16122t(bArr, m16453I, i11)) {
                throw C4017D.m16239d();
            }
            eVar.add(new String(bArr, m16453I, i10, AbstractC4015C.f13275b));
            m16453I = i11;
        }
        while (m16453I < i9) {
            int m16453I2 = m16453I(bArr, m16453I, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16453I = m16453I(bArr, m16453I2, aVar);
            int i12 = aVar.f13370a;
            if (i12 < 0) {
                throw C4017D.m16242g();
            }
            if (i12 == 0) {
                eVar.add(StringUtils.EMPTY);
            } else {
                int i13 = m16453I + i12;
                if (!AbstractC4012A0.m16122t(bArr, m16453I, i13)) {
                    throw C4017D.m16239d();
                }
                eVar.add(new String(bArr, m16453I, i12, AbstractC4015C.f13275b));
                m16453I = i13;
            }
        }
        return m16453I;
    }

    /* renamed from: F */
    public static int m16450F(byte[] bArr, int i7, a aVar) {
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a;
        if (i8 < 0) {
            throw C4017D.m16242g();
        }
        if (i8 == 0) {
            aVar.f13372c = StringUtils.EMPTY;
            return m16453I;
        }
        aVar.f13372c = AbstractC4012A0.m16110h(bArr, m16453I, i8);
        return m16453I + i8;
    }

    /* renamed from: G */
    public static int m16451G(int i7, byte[] bArr, int i8, int i9, C4084w0 c4084w0, a aVar) {
        if (AbstractC4014B0.m16178a(i7) == 0) {
            throw C4017D.m16238c();
        }
        int m16179b = AbstractC4014B0.m16179b(i7);
        if (m16179b == 0) {
            int m16456L = m16456L(bArr, i8, aVar);
            c4084w0.m17001n(i7, Long.valueOf(aVar.f13371b));
            return m16456L;
        }
        if (m16179b == 1) {
            c4084w0.m17001n(i7, Long.valueOf(m16470j(bArr, i8)));
            return i8 + 8;
        }
        if (m16179b == 2) {
            int m16453I = m16453I(bArr, i8, aVar);
            int i10 = aVar.f13370a;
            if (i10 < 0) {
                throw C4017D.m16242g();
            }
            if (i10 > bArr.length - m16453I) {
                throw C4017D.m16246m();
            }
            if (i10 == 0) {
                c4084w0.m17001n(i7, AbstractC4055i.f13379b);
            } else {
                c4084w0.m17001n(i7, AbstractC4055i.m16501m(bArr, m16453I, i10));
            }
            return m16453I + i10;
        }
        if (m16179b != 3) {
            if (m16179b != 5) {
                throw C4017D.m16238c();
            }
            c4084w0.m17001n(i7, Integer.valueOf(m16468h(bArr, i8)));
            return i8 + 4;
        }
        C4084w0 m16990k = C4084w0.m16990k();
        int i11 = (i7 & (-8)) | 4;
        int i12 = aVar.f13374e + 1;
        aVar.f13374e = i12;
        m16461a(i12);
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int m16453I2 = m16453I(bArr, i8, aVar);
            int i14 = aVar.f13370a;
            if (i14 == i11) {
                i13 = i14;
                i8 = m16453I2;
                break;
            }
            i13 = i14;
            i8 = m16451G(i14, bArr, m16453I2, i9, m16990k, aVar);
        }
        aVar.f13374e--;
        if (i8 > i9 || i13 != i11) {
            throw C4017D.m16243h();
        }
        c4084w0.m17001n(i7, m16990k);
        return i8;
    }

    /* renamed from: H */
    public static int m16452H(int i7, byte[] bArr, int i8, a aVar) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            aVar.f13370a = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            aVar.f13370a = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            aVar.f13370a = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            aVar.f13370a = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                aVar.f13370a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    /* renamed from: I */
    public static int m16453I(byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return m16452H(b7, bArr, i8, aVar);
        }
        aVar.f13370a = b7;
        return i8;
    }

    /* renamed from: J */
    public static int m16454J(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        C4013B c4013b = (C4013B) eVar;
        int m16453I = m16453I(bArr, i8, aVar);
        c4013b.m16170f(aVar.f13370a);
        while (m16453I < i9) {
            int m16453I2 = m16453I(bArr, m16453I, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16453I = m16453I(bArr, m16453I2, aVar);
            c4013b.m16170f(aVar.f13370a);
        }
        return m16453I;
    }

    /* renamed from: K */
    public static int m16455K(long j7, byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        long j8 = (j7 & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i9 = 7;
        while (b7 < 0) {
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            i9 += 7;
            j8 |= (b8 & Byte.MAX_VALUE) << i9;
            i8 = i10;
            b7 = b8;
        }
        aVar.f13371b = j8;
        return i8;
    }

    /* renamed from: L */
    public static int m16456L(byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 < 0) {
            return m16455K(j7, bArr, i8, aVar);
        }
        aVar.f13371b = j7;
        return i8;
    }

    /* renamed from: M */
    public static int m16457M(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        AbstractC4025L abstractC4025L = (AbstractC4025L) eVar;
        int m16456L = m16456L(bArr, i8, aVar);
        abstractC4025L.m16274b(aVar.f13371b);
        while (m16456L < i9) {
            int m16453I = m16453I(bArr, m16456L, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16456L = m16456L(bArr, m16453I, aVar);
            abstractC4025L.m16274b(aVar.f13371b);
        }
        return m16456L;
    }

    /* renamed from: N */
    public static int m16458N(Object obj, InterfaceC4066n0 interfaceC4066n0, byte[] bArr, int i7, int i8, int i9, a aVar) {
        C4037Y c4037y = (C4037Y) interfaceC4066n0;
        int i10 = aVar.f13374e + 1;
        aVar.f13374e = i10;
        m16461a(i10);
        int m16370c0 = c4037y.m16370c0(obj, bArr, i7, i8, i9, aVar);
        aVar.f13374e--;
        aVar.f13372c = obj;
        return m16370c0;
    }

    /* renamed from: O */
    public static int m16459O(Object obj, InterfaceC4066n0 interfaceC4066n0, byte[] bArr, int i7, int i8, a aVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = m16452H(i10, bArr, i9, aVar);
            i10 = aVar.f13370a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw C4017D.m16246m();
        }
        int i12 = aVar.f13374e + 1;
        aVar.f13374e = i12;
        m16461a(i12);
        int i13 = i10 + i11;
        interfaceC4066n0.mo16381i(obj, bArr, i11, i13, aVar);
        aVar.f13374e--;
        aVar.f13372c = obj;
        return i13;
    }

    /* renamed from: P */
    public static int m16460P(int i7, byte[] bArr, int i8, int i9, a aVar) {
        if (AbstractC4014B0.m16178a(i7) == 0) {
            throw C4017D.m16238c();
        }
        int m16179b = AbstractC4014B0.m16179b(i7);
        if (m16179b == 0) {
            return m16456L(bArr, i8, aVar);
        }
        if (m16179b == 1) {
            return i8 + 8;
        }
        if (m16179b == 2) {
            return m16453I(bArr, i8, aVar) + aVar.f13370a;
        }
        if (m16179b != 3) {
            if (m16179b == 5) {
                return i8 + 4;
            }
            throw C4017D.m16238c();
        }
        int i10 = (i7 & (-8)) | 4;
        int i11 = 0;
        while (i8 < i9) {
            i8 = m16453I(bArr, i8, aVar);
            i11 = aVar.f13370a;
            if (i11 == i10) {
                break;
            }
            i8 = m16460P(i11, bArr, i8, i9, aVar);
        }
        if (i8 > i9 || i11 != i10) {
            throw C4017D.m16243h();
        }
        return i8;
    }

    /* renamed from: a */
    public static void m16461a(int i7) {
        if (i7 >= f13369a) {
            throw C4017D.m16244i();
        }
    }

    /* renamed from: b */
    public static int m16462b(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        AbstractC4051g abstractC4051g = (AbstractC4051g) eVar;
        int m16456L = m16456L(bArr, i8, aVar);
        abstractC4051g.m16488b(aVar.f13371b != 0);
        while (m16456L < i9) {
            int m16453I = m16453I(bArr, m16456L, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16456L = m16456L(bArr, m16453I, aVar);
            abstractC4051g.m16488b(aVar.f13371b != 0);
        }
        return m16456L;
    }

    /* renamed from: c */
    public static int m16463c(byte[] bArr, int i7, a aVar) {
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a;
        if (i8 < 0) {
            throw C4017D.m16242g();
        }
        if (i8 > bArr.length - m16453I) {
            throw C4017D.m16246m();
        }
        if (i8 == 0) {
            aVar.f13372c = AbstractC4055i.f13379b;
            return m16453I;
        }
        aVar.f13372c = AbstractC4055i.m16501m(bArr, m16453I, i8);
        return m16453I + i8;
    }

    /* renamed from: d */
    public static int m16464d(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        int m16453I = m16453I(bArr, i8, aVar);
        int i10 = aVar.f13370a;
        if (i10 < 0) {
            throw C4017D.m16242g();
        }
        if (i10 > bArr.length - m16453I) {
            throw C4017D.m16246m();
        }
        if (i10 == 0) {
            eVar.add(AbstractC4055i.f13379b);
        } else {
            eVar.add(AbstractC4055i.m16501m(bArr, m16453I, i10));
            m16453I += i10;
        }
        while (m16453I < i9) {
            int m16453I2 = m16453I(bArr, m16453I, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16453I = m16453I(bArr, m16453I2, aVar);
            int i11 = aVar.f13370a;
            if (i11 < 0) {
                throw C4017D.m16242g();
            }
            if (i11 > bArr.length - m16453I) {
                throw C4017D.m16246m();
            }
            if (i11 == 0) {
                eVar.add(AbstractC4055i.f13379b);
            } else {
                eVar.add(AbstractC4055i.m16501m(bArr, m16453I, i11));
                m16453I += i11;
            }
        }
        return m16453I;
    }

    /* renamed from: e */
    public static double m16465e(byte[] bArr, int i7) {
        return Double.longBitsToDouble(m16470j(bArr, i7));
    }

    /* renamed from: f */
    public static int m16466f(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        AbstractC4065n abstractC4065n = (AbstractC4065n) eVar;
        abstractC4065n.m16819b(m16465e(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int m16453I = m16453I(bArr, i10, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            abstractC4065n.m16819b(m16465e(bArr, m16453I));
            i10 = m16453I + 8;
        }
        return i10;
    }

    /* renamed from: g */
    public static int m16467g(int i7, byte[] bArr, int i8, int i9, Object obj, InterfaceC4034V interfaceC4034V, AbstractC4082v0 abstractC4082v0, a aVar) {
        aVar.f13373d.m16879a(interfaceC4034V, i7 >>> 3);
        return m16451G(i7, bArr, i8, i9, C4037Y.m16350v(obj), aVar);
    }

    /* renamed from: h */
    public static int m16468h(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
    }

    /* renamed from: i */
    public static int m16469i(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        C4013B c4013b = (C4013B) eVar;
        c4013b.m16170f(m16468h(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int m16453I = m16453I(bArr, i10, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            c4013b.m16170f(m16468h(bArr, m16453I));
            i10 = m16453I + 4;
        }
        return i10;
    }

    /* renamed from: j */
    public static long m16470j(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    /* renamed from: k */
    public static int m16471k(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        AbstractC4025L abstractC4025L = (AbstractC4025L) eVar;
        abstractC4025L.m16274b(m16470j(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int m16453I = m16453I(bArr, i10, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            abstractC4025L.m16274b(m16470j(bArr, m16453I));
            i10 = m16453I + 8;
        }
        return i10;
    }

    /* renamed from: l */
    public static float m16472l(byte[] bArr, int i7) {
        return Float.intBitsToFloat(m16468h(bArr, i7));
    }

    /* renamed from: m */
    public static int m16473m(int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        AbstractC4083w abstractC4083w = (AbstractC4083w) eVar;
        abstractC4083w.m16985b(m16472l(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int m16453I = m16453I(bArr, i10, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            abstractC4083w.m16985b(m16472l(bArr, m16453I));
            i10 = m16453I + 4;
        }
        return i10;
    }

    /* renamed from: n */
    public static int m16474n(InterfaceC4066n0 interfaceC4066n0, byte[] bArr, int i7, int i8, int i9, a aVar) {
        Object newInstance = interfaceC4066n0.newInstance();
        int m16458N = m16458N(newInstance, interfaceC4066n0, bArr, i7, i8, i9, aVar);
        interfaceC4066n0.mo16367b(newInstance);
        aVar.f13372c = newInstance;
        return m16458N;
    }

    /* renamed from: o */
    public static int m16475o(InterfaceC4066n0 interfaceC4066n0, int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        int i10 = (i7 & (-8)) | 4;
        int m16474n = m16474n(interfaceC4066n0, bArr, i8, i9, i10, aVar);
        eVar.add(aVar.f13372c);
        while (m16474n < i9) {
            int m16453I = m16453I(bArr, m16474n, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16474n = m16474n(interfaceC4066n0, bArr, m16453I, i9, i10, aVar);
            eVar.add(aVar.f13372c);
        }
        return m16474n;
    }

    /* renamed from: p */
    public static int m16476p(InterfaceC4066n0 interfaceC4066n0, byte[] bArr, int i7, int i8, a aVar) {
        Object newInstance = interfaceC4066n0.newInstance();
        int m16459O = m16459O(newInstance, interfaceC4066n0, bArr, i7, i8, aVar);
        interfaceC4066n0.mo16367b(newInstance);
        aVar.f13372c = newInstance;
        return m16459O;
    }

    /* renamed from: q */
    public static int m16477q(InterfaceC4066n0 interfaceC4066n0, int i7, byte[] bArr, int i8, int i9, AbstractC4015C.e eVar, a aVar) {
        int m16476p = m16476p(interfaceC4066n0, bArr, i8, i9, aVar);
        eVar.add(aVar.f13372c);
        while (m16476p < i9) {
            int m16453I = m16453I(bArr, m16476p, aVar);
            if (i7 != aVar.f13370a) {
                break;
            }
            m16476p = m16476p(interfaceC4066n0, bArr, m16453I, i9, aVar);
            eVar.add(aVar.f13372c);
        }
        return m16476p;
    }

    /* renamed from: r */
    public static int m16478r(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        AbstractC4051g abstractC4051g = (AbstractC4051g) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            m16453I = m16456L(bArr, m16453I, aVar);
            abstractC4051g.m16488b(aVar.f13371b != 0);
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }

    /* renamed from: s */
    public static int m16479s(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        AbstractC4065n abstractC4065n = (AbstractC4065n) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            abstractC4065n.m16819b(m16465e(bArr, m16453I));
            m16453I += 8;
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }

    /* renamed from: t */
    public static int m16480t(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        C4013B c4013b = (C4013B) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            c4013b.m16170f(m16468h(bArr, m16453I));
            m16453I += 4;
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }

    /* renamed from: u */
    public static int m16481u(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        AbstractC4025L abstractC4025L = (AbstractC4025L) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            abstractC4025L.m16274b(m16470j(bArr, m16453I));
            m16453I += 8;
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }

    /* renamed from: v */
    public static int m16482v(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        AbstractC4083w abstractC4083w = (AbstractC4083w) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            abstractC4083w.m16985b(m16472l(bArr, m16453I));
            m16453I += 4;
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }

    /* renamed from: w */
    public static int m16483w(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        C4013B c4013b = (C4013B) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            m16453I = m16453I(bArr, m16453I, aVar);
            c4013b.m16170f(AbstractC4057j.m16523c(aVar.f13370a));
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }

    /* renamed from: x */
    public static int m16484x(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        AbstractC4025L abstractC4025L = (AbstractC4025L) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            m16453I = m16456L(bArr, m16453I, aVar);
            abstractC4025L.m16274b(AbstractC4057j.m16524d(aVar.f13371b));
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }

    /* renamed from: y */
    public static int m16485y(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        C4013B c4013b = (C4013B) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            m16453I = m16453I(bArr, m16453I, aVar);
            c4013b.m16170f(aVar.f13370a);
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }

    /* renamed from: z */
    public static int m16486z(byte[] bArr, int i7, AbstractC4015C.e eVar, a aVar) {
        AbstractC4025L abstractC4025L = (AbstractC4025L) eVar;
        int m16453I = m16453I(bArr, i7, aVar);
        int i8 = aVar.f13370a + m16453I;
        while (m16453I < i8) {
            m16453I = m16456L(bArr, m16453I, aVar);
            abstractC4025L.m16274b(aVar.f13371b);
        }
        if (m16453I == i8) {
            return m16453I;
        }
        throw C4017D.m16246m();
    }
}
