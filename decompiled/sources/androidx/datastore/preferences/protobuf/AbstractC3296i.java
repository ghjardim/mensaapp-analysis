package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3299j0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.i */
/* loaded from: classes.dex */
public abstract class AbstractC3296i extends AbstractC3288e {

    /* renamed from: c */
    public static final Logger f10494c = Logger.getLogger(AbstractC3296i.class.getName());

    /* renamed from: d */
    public static final boolean f10495d = AbstractC3297i0.m12598B();

    /* renamed from: a */
    public C3298j f10496a;

    /* renamed from: b */
    public boolean f10497b;

    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    public static abstract class b extends AbstractC3296i {

        /* renamed from: e */
        public final byte[] f10498e;

        /* renamed from: f */
        public final int f10499f;

        /* renamed from: g */
        public int f10500g;

        /* renamed from: h */
        public int f10501h;

        public b(int i7) {
            super();
            if (i7 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i7, 20)];
            this.f10498e = bArr;
            this.f10499f = bArr.length;
        }

        /* renamed from: R0 */
        public final void m12585R0(byte b7) {
            byte[] bArr = this.f10498e;
            int i7 = this.f10500g;
            this.f10500g = i7 + 1;
            bArr[i7] = b7;
            this.f10501h++;
        }

        /* renamed from: S0 */
        public final void m12586S0(int i7) {
            byte[] bArr = this.f10498e;
            int i8 = this.f10500g;
            int i9 = i8 + 1;
            this.f10500g = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.f10500g = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.f10500g = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f10500g = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
            this.f10501h += 4;
        }

        /* renamed from: T0 */
        public final void m12587T0(long j7) {
            byte[] bArr = this.f10498e;
            int i7 = this.f10500g;
            int i8 = i7 + 1;
            this.f10500g = i8;
            bArr[i7] = (byte) (j7 & 255);
            int i9 = i7 + 2;
            this.f10500g = i9;
            bArr[i8] = (byte) ((j7 >> 8) & 255);
            int i10 = i7 + 3;
            this.f10500g = i10;
            bArr[i9] = (byte) ((j7 >> 16) & 255);
            int i11 = i7 + 4;
            this.f10500g = i11;
            bArr[i10] = (byte) (255 & (j7 >> 24));
            int i12 = i7 + 5;
            this.f10500g = i12;
            bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
            int i13 = i7 + 6;
            this.f10500g = i13;
            bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
            int i14 = i7 + 7;
            this.f10500g = i14;
            bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
            this.f10500g = i7 + 8;
            bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
            this.f10501h += 8;
        }

        /* renamed from: U0 */
        public final void m12588U0(int i7) {
            if (i7 >= 0) {
                m12590W0(i7);
            } else {
                m12591X0(i7);
            }
        }

        /* renamed from: V0 */
        public final void m12589V0(int i7, int i8) {
            m12590W0(AbstractC3301k0.m12747c(i7, i8));
        }

        /* renamed from: W0 */
        public final void m12590W0(int i7) {
            if (!AbstractC3296i.f10495d) {
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.f10498e;
                    int i8 = this.f10500g;
                    this.f10500g = i8 + 1;
                    bArr[i8] = (byte) ((i7 | 128) & 255);
                    this.f10501h++;
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.f10498e;
                int i9 = this.f10500g;
                this.f10500g = i9 + 1;
                bArr2[i9] = (byte) i7;
                this.f10501h++;
                return;
            }
            long j7 = this.f10500g;
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.f10498e;
                int i10 = this.f10500g;
                this.f10500g = i10 + 1;
                AbstractC3297i0.m12604H(bArr3, i10, (byte) ((i7 | 128) & 255));
                i7 >>>= 7;
            }
            byte[] bArr4 = this.f10498e;
            int i11 = this.f10500g;
            this.f10500g = i11 + 1;
            AbstractC3297i0.m12604H(bArr4, i11, (byte) i7);
            this.f10501h += (int) (this.f10500g - j7);
        }

        /* renamed from: X0 */
        public final void m12591X0(long j7) {
            if (!AbstractC3296i.f10495d) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f10498e;
                    int i7 = this.f10500g;
                    this.f10500g = i7 + 1;
                    bArr[i7] = (byte) ((((int) j7) | 128) & 255);
                    this.f10501h++;
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f10498e;
                int i8 = this.f10500g;
                this.f10500g = i8 + 1;
                bArr2[i8] = (byte) j7;
                this.f10501h++;
                return;
            }
            long j8 = this.f10500g;
            while ((j7 & (-128)) != 0) {
                byte[] bArr3 = this.f10498e;
                int i9 = this.f10500g;
                this.f10500g = i9 + 1;
                AbstractC3297i0.m12604H(bArr3, i9, (byte) ((((int) j7) | 128) & 255));
                j7 >>>= 7;
            }
            byte[] bArr4 = this.f10498e;
            int i10 = this.f10500g;
            this.f10500g = i10 + 1;
            AbstractC3297i0.m12604H(bArr4, i10, (byte) j7);
            this.f10501h += (int) (this.f10500g - j8);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$c */
    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$d */
    public static final class d extends b {

        /* renamed from: i */
        public final OutputStream f10502i;

        public d(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f10502i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: A0 */
        public void mo12538A0(int i7, InterfaceC3264J interfaceC3264J) {
            mo12550M0(1, 3);
            mo12551N0(2, i7);
            m12595b1(3, interfaceC3264J);
            mo12550M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: B0 */
        public void mo12539B0(int i7, AbstractC3290f abstractC3290f) {
            mo12550M0(1, 3);
            mo12551N0(2, i7);
            mo12563e0(3, abstractC3290f);
            mo12550M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: K0 */
        public void mo12548K0(int i7, String str) {
            mo12550M0(i7, 2);
            mo12549L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: L0 */
        public void mo12549L0(String str) {
            int m12722c;
            try {
                int length = str.length() * 3;
                int m12507Q = AbstractC3296i.m12507Q(length);
                int i7 = m12507Q + length;
                int i8 = this.f10499f;
                if (i7 > i8) {
                    byte[] bArr = new byte[length];
                    int m12721b = AbstractC3299j0.m12721b(str, bArr, 0, length);
                    mo12552O0(m12721b);
                    mo12332a(bArr, 0, m12721b);
                    return;
                }
                if (i7 > i8 - this.f10500g) {
                    m12592Y0();
                }
                int m12507Q2 = AbstractC3296i.m12507Q(str.length());
                int i9 = this.f10500g;
                try {
                    if (m12507Q2 == m12507Q) {
                        int i10 = i9 + m12507Q2;
                        this.f10500g = i10;
                        int m12721b2 = AbstractC3299j0.m12721b(str, this.f10498e, i10, this.f10499f - i10);
                        this.f10500g = i9;
                        m12722c = (m12721b2 - i9) - m12507Q2;
                        m12590W0(m12722c);
                        this.f10500g = m12721b2;
                    } else {
                        m12722c = AbstractC3299j0.m12722c(str);
                        m12590W0(m12722c);
                        this.f10500g = AbstractC3299j0.m12721b(str, this.f10498e, this.f10500g, m12722c);
                    }
                    this.f10501h += m12722c;
                } catch (AbstractC3299j0.d e7) {
                    this.f10501h -= this.f10500g - i9;
                    this.f10500g = i9;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new c(e8);
                }
            } catch (AbstractC3299j0.d e9) {
                m12556W(str, e9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: M0 */
        public void mo12550M0(int i7, int i8) {
            mo12552O0(AbstractC3301k0.m12747c(i7, i8));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: N0 */
        public void mo12551N0(int i7, int i8) {
            m12593Z0(20);
            m12589V0(i7, 0);
            m12590W0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: O0 */
        public void mo12552O0(int i7) {
            m12593Z0(5);
            m12590W0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: P0 */
        public void mo12553P0(int i7, long j7) {
            m12593Z0(20);
            m12589V0(i7, 0);
            m12591X0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: Q0 */
        public void mo12554Q0(long j7) {
            m12593Z0(10);
            m12591X0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: V */
        public void mo12555V() {
            if (this.f10500g > 0) {
                m12592Y0();
            }
        }

        /* renamed from: Y0 */
        public final void m12592Y0() {
            this.f10502i.write(this.f10498e, 0, this.f10500g);
            this.f10500g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: Z */
        public void mo12558Z(byte b7) {
            if (this.f10500g == this.f10499f) {
                m12592Y0();
            }
            m12585R0(b7);
        }

        /* renamed from: Z0 */
        public final void m12593Z0(int i7) {
            if (this.f10499f - this.f10500g < i7) {
                m12592Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i, androidx.datastore.preferences.protobuf.AbstractC3288e
        /* renamed from: a */
        public void mo12332a(byte[] bArr, int i7, int i8) {
            m12594a1(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: a0 */
        public void mo12559a0(int i7, boolean z6) {
            m12593Z0(11);
            m12589V0(i7, 0);
            m12585R0(z6 ? (byte) 1 : (byte) 0);
        }

        /* renamed from: a1 */
        public void m12594a1(byte[] bArr, int i7, int i8) {
            int i9 = this.f10499f;
            int i10 = this.f10500g;
            if (i9 - i10 >= i8) {
                System.arraycopy(bArr, i7, this.f10498e, i10, i8);
                this.f10500g += i8;
                this.f10501h += i8;
                return;
            }
            int i11 = i9 - i10;
            System.arraycopy(bArr, i7, this.f10498e, i10, i11);
            int i12 = i7 + i11;
            int i13 = i8 - i11;
            this.f10500g = this.f10499f;
            this.f10501h += i11;
            m12592Y0();
            if (i13 <= this.f10499f) {
                System.arraycopy(bArr, i12, this.f10498e, 0, i13);
                this.f10500g = i13;
            } else {
                this.f10502i.write(bArr, i12, i13);
            }
            this.f10501h += i13;
        }

        /* renamed from: b1 */
        public void m12595b1(int i7, InterfaceC3264J interfaceC3264J) {
            mo12550M0(i7, 2);
            mo12584z0(interfaceC3264J);
        }

        /* renamed from: c1 */
        public void m12596c1(InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y) {
            mo12552O0(((AbstractC3280a) interfaceC3264J).mo12234f(interfaceC3278Y));
            interfaceC3278Y.mo12153h(interfaceC3264J, this.f10496a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: d0 */
        public void mo12562d0(byte[] bArr, int i7, int i8) {
            mo12552O0(i8);
            m12594a1(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: e0 */
        public void mo12563e0(int i7, AbstractC3290f abstractC3290f) {
            mo12550M0(i7, 2);
            mo12564f0(abstractC3290f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: f0 */
        public void mo12564f0(AbstractC3290f abstractC3290f) {
            mo12552O0(abstractC3290f.size());
            abstractC3290f.mo12352w(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: k0 */
        public void mo12569k0(int i7, int i8) {
            m12593Z0(14);
            m12589V0(i7, 5);
            m12586S0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: l0 */
        public void mo12570l0(int i7) {
            m12593Z0(4);
            m12586S0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: m0 */
        public void mo12571m0(int i7, long j7) {
            m12593Z0(18);
            m12589V0(i7, 1);
            m12587T0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: n0 */
        public void mo12572n0(long j7) {
            m12593Z0(8);
            m12587T0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: u0 */
        public void mo12579u0(int i7, int i8) {
            m12593Z0(20);
            m12589V0(i7, 0);
            m12588U0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: v0 */
        public void mo12580v0(int i7) {
            if (i7 >= 0) {
                mo12552O0(i7);
            } else {
                mo12554Q0(i7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: y0 */
        public void mo12583y0(int i7, InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y) {
            mo12550M0(i7, 2);
            m12596c1(interfaceC3264J, interfaceC3278Y);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3296i
        /* renamed from: z0 */
        public void mo12584z0(InterfaceC3264J interfaceC3264J) {
            mo12552O0(interfaceC3264J.mo12094b());
            interfaceC3264J.mo12096d(this);
        }
    }

    /* renamed from: A */
    public static int m12491A(InterfaceC3264J interfaceC3264J) {
        return m12536y(interfaceC3264J.mo12094b());
    }

    /* renamed from: B */
    public static int m12492B(InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y) {
        return m12536y(((AbstractC3280a) interfaceC3264J).mo12234f(interfaceC3278Y));
    }

    /* renamed from: C */
    public static int m12493C(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    /* renamed from: D */
    public static int m12494D(int i7, AbstractC3290f abstractC3290f) {
        return (m12505O(1) * 2) + m12506P(2, i7) + m12517f(3, abstractC3290f);
    }

    /* renamed from: E */
    public static int m12495E(int i7, int i8) {
        return m12505O(i7) + m12496F(i8);
    }

    /* renamed from: F */
    public static int m12496F(int i7) {
        return 4;
    }

    /* renamed from: G */
    public static int m12497G(int i7, long j7) {
        return m12505O(i7) + m12498H(j7);
    }

    /* renamed from: H */
    public static int m12498H(long j7) {
        return 8;
    }

    /* renamed from: I */
    public static int m12499I(int i7, int i8) {
        return m12505O(i7) + m12500J(i8);
    }

    /* renamed from: J */
    public static int m12500J(int i7) {
        return m12507Q(m12510T(i7));
    }

    /* renamed from: K */
    public static int m12501K(int i7, long j7) {
        return m12505O(i7) + m12502L(j7);
    }

    /* renamed from: L */
    public static int m12502L(long j7) {
        return m12509S(m12511U(j7));
    }

    /* renamed from: M */
    public static int m12503M(int i7, String str) {
        return m12505O(i7) + m12504N(str);
    }

    /* renamed from: N */
    public static int m12504N(String str) {
        int length;
        try {
            length = AbstractC3299j0.m12722c(str);
        } catch (AbstractC3299j0.d unused) {
            length = str.getBytes(AbstractC3312u.f10663b).length;
        }
        return m12536y(length);
    }

    /* renamed from: O */
    public static int m12505O(int i7) {
        return m12507Q(AbstractC3301k0.m12747c(i7, 0));
    }

    /* renamed from: P */
    public static int m12506P(int i7, int i8) {
        return m12505O(i7) + m12507Q(i8);
    }

    /* renamed from: Q */
    public static int m12507Q(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    /* renamed from: R */
    public static int m12508R(int i7, long j7) {
        return m12505O(i7) + m12509S(j7);
    }

    /* renamed from: S */
    public static int m12509S(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    /* renamed from: T */
    public static int m12510T(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    /* renamed from: U */
    public static long m12511U(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    /* renamed from: Y */
    public static AbstractC3296i m12512Y(OutputStream outputStream, int i7) {
        return new d(outputStream, i7);
    }

    /* renamed from: c */
    public static int m12514c(int i7, boolean z6) {
        return m12505O(i7) + m12515d(z6);
    }

    /* renamed from: d */
    public static int m12515d(boolean z6) {
        return 1;
    }

    /* renamed from: e */
    public static int m12516e(byte[] bArr) {
        return m12536y(bArr.length);
    }

    /* renamed from: f */
    public static int m12517f(int i7, AbstractC3290f abstractC3290f) {
        return m12505O(i7) + m12518g(abstractC3290f);
    }

    /* renamed from: g */
    public static int m12518g(AbstractC3290f abstractC3290f) {
        return m12536y(abstractC3290f.size());
    }

    /* renamed from: h */
    public static int m12519h(int i7, double d7) {
        return m12505O(i7) + m12520i(d7);
    }

    /* renamed from: i */
    public static int m12520i(double d7) {
        return 8;
    }

    /* renamed from: j */
    public static int m12521j(int i7, int i8) {
        return m12505O(i7) + m12522k(i8);
    }

    /* renamed from: k */
    public static int m12522k(int i7) {
        return m12533v(i7);
    }

    /* renamed from: l */
    public static int m12523l(int i7, int i8) {
        return m12505O(i7) + m12524m(i8);
    }

    /* renamed from: m */
    public static int m12524m(int i7) {
        return 4;
    }

    /* renamed from: n */
    public static int m12525n(int i7, long j7) {
        return m12505O(i7) + m12526o(j7);
    }

    /* renamed from: o */
    public static int m12526o(long j7) {
        return 8;
    }

    /* renamed from: p */
    public static int m12527p(int i7, float f7) {
        return m12505O(i7) + m12528q(f7);
    }

    /* renamed from: q */
    public static int m12528q(float f7) {
        return 4;
    }

    /* renamed from: r */
    public static int m12529r(int i7, InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y) {
        return (m12505O(i7) * 2) + m12531t(interfaceC3264J, interfaceC3278Y);
    }

    /* renamed from: s */
    public static int m12530s(InterfaceC3264J interfaceC3264J) {
        return interfaceC3264J.mo12094b();
    }

    /* renamed from: t */
    public static int m12531t(InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y) {
        return ((AbstractC3280a) interfaceC3264J).mo12234f(interfaceC3278Y);
    }

    /* renamed from: u */
    public static int m12532u(int i7, int i8) {
        return m12505O(i7) + m12533v(i8);
    }

    /* renamed from: v */
    public static int m12533v(int i7) {
        return m12509S(i7);
    }

    /* renamed from: w */
    public static int m12534w(int i7, long j7) {
        return m12505O(i7) + m12535x(j7);
    }

    /* renamed from: x */
    public static int m12535x(long j7) {
        return m12509S(j7);
    }

    /* renamed from: y */
    public static int m12536y(int i7) {
        return m12507Q(i7) + i7;
    }

    /* renamed from: z */
    public static int m12537z(int i7, InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y) {
        return m12505O(i7) + m12492B(interfaceC3264J, interfaceC3278Y);
    }

    /* renamed from: A0 */
    public abstract void mo12538A0(int i7, InterfaceC3264J interfaceC3264J);

    /* renamed from: B0 */
    public abstract void mo12539B0(int i7, AbstractC3290f abstractC3290f);

    /* renamed from: C0 */
    public final void m12540C0(int i7, int i8) {
        mo12569k0(i7, i8);
    }

    /* renamed from: D0 */
    public final void m12541D0(int i7) {
        mo12570l0(i7);
    }

    /* renamed from: E0 */
    public final void m12542E0(int i7, long j7) {
        mo12571m0(i7, j7);
    }

    /* renamed from: F0 */
    public final void m12543F0(long j7) {
        mo12572n0(j7);
    }

    /* renamed from: G0 */
    public final void m12544G0(int i7, int i8) {
        mo12551N0(i7, m12510T(i8));
    }

    /* renamed from: H0 */
    public final void m12545H0(int i7) {
        mo12552O0(m12510T(i7));
    }

    /* renamed from: I0 */
    public final void m12546I0(int i7, long j7) {
        mo12553P0(i7, m12511U(j7));
    }

    /* renamed from: J0 */
    public final void m12547J0(long j7) {
        mo12554Q0(m12511U(j7));
    }

    /* renamed from: K0 */
    public abstract void mo12548K0(int i7, String str);

    /* renamed from: L0 */
    public abstract void mo12549L0(String str);

    /* renamed from: M0 */
    public abstract void mo12550M0(int i7, int i8);

    /* renamed from: N0 */
    public abstract void mo12551N0(int i7, int i8);

    /* renamed from: O0 */
    public abstract void mo12552O0(int i7);

    /* renamed from: P0 */
    public abstract void mo12553P0(int i7, long j7);

    /* renamed from: Q0 */
    public abstract void mo12554Q0(long j7);

    /* renamed from: V */
    public abstract void mo12555V();

    /* renamed from: W */
    public final void m12556W(String str, AbstractC3299j0.d dVar) {
        f10494c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC3312u.f10663b);
        try {
            mo12552O0(bytes.length);
            mo12332a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new c(e7);
        }
    }

    /* renamed from: X */
    public boolean m12557X() {
        return this.f10497b;
    }

    /* renamed from: Z */
    public abstract void mo12558Z(byte b7);

    @Override // androidx.datastore.preferences.protobuf.AbstractC3288e
    /* renamed from: a */
    public abstract void mo12332a(byte[] bArr, int i7, int i8);

    /* renamed from: a0 */
    public abstract void mo12559a0(int i7, boolean z6);

    /* renamed from: b0 */
    public final void m12560b0(boolean z6) {
        mo12558Z(z6 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: c0 */
    public final void m12561c0(byte[] bArr) {
        mo12562d0(bArr, 0, bArr.length);
    }

    /* renamed from: d0 */
    public abstract void mo12562d0(byte[] bArr, int i7, int i8);

    /* renamed from: e0 */
    public abstract void mo12563e0(int i7, AbstractC3290f abstractC3290f);

    /* renamed from: f0 */
    public abstract void mo12564f0(AbstractC3290f abstractC3290f);

    /* renamed from: g0 */
    public final void m12565g0(int i7, double d7) {
        mo12571m0(i7, Double.doubleToRawLongBits(d7));
    }

    /* renamed from: h0 */
    public final void m12566h0(double d7) {
        mo12572n0(Double.doubleToRawLongBits(d7));
    }

    /* renamed from: i0 */
    public final void m12567i0(int i7, int i8) {
        mo12579u0(i7, i8);
    }

    /* renamed from: j0 */
    public final void m12568j0(int i7) {
        mo12580v0(i7);
    }

    /* renamed from: k0 */
    public abstract void mo12569k0(int i7, int i8);

    /* renamed from: l0 */
    public abstract void mo12570l0(int i7);

    /* renamed from: m0 */
    public abstract void mo12571m0(int i7, long j7);

    /* renamed from: n0 */
    public abstract void mo12572n0(long j7);

    /* renamed from: o0 */
    public final void m12573o0(int i7, float f7) {
        mo12569k0(i7, Float.floatToRawIntBits(f7));
    }

    /* renamed from: p0 */
    public final void m12574p0(float f7) {
        mo12570l0(Float.floatToRawIntBits(f7));
    }

    /* renamed from: q0 */
    public final void m12575q0(int i7, InterfaceC3264J interfaceC3264J) {
        mo12550M0(i7, 3);
        m12577s0(interfaceC3264J);
        mo12550M0(i7, 4);
    }

    /* renamed from: r0 */
    public final void m12576r0(int i7, InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y) {
        mo12550M0(i7, 3);
        m12578t0(interfaceC3264J, interfaceC3278Y);
        mo12550M0(i7, 4);
    }

    /* renamed from: s0 */
    public final void m12577s0(InterfaceC3264J interfaceC3264J) {
        interfaceC3264J.mo12096d(this);
    }

    /* renamed from: t0 */
    public final void m12578t0(InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y) {
        interfaceC3278Y.mo12153h(interfaceC3264J, this.f10496a);
    }

    /* renamed from: u0 */
    public abstract void mo12579u0(int i7, int i8);

    /* renamed from: v0 */
    public abstract void mo12580v0(int i7);

    /* renamed from: w0 */
    public final void m12581w0(int i7, long j7) {
        mo12553P0(i7, j7);
    }

    /* renamed from: x0 */
    public final void m12582x0(long j7) {
        mo12554Q0(j7);
    }

    /* renamed from: y0 */
    public abstract void mo12583y0(int i7, InterfaceC3264J interfaceC3264J, InterfaceC3278Y interfaceC3278Y);

    /* renamed from: z0 */
    public abstract void mo12584z0(InterfaceC3264J interfaceC3264J);

    public AbstractC3296i() {
    }
}
