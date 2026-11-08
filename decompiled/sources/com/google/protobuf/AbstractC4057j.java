package com.google.protobuf;

import com.google.android.gms.common.api.C3643a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.protobuf.j */
/* loaded from: classes.dex */
public abstract class AbstractC4057j {

    /* renamed from: f */
    public static volatile int f13392f = 100;

    /* renamed from: a */
    public int f13393a;

    /* renamed from: b */
    public int f13394b;

    /* renamed from: c */
    public int f13395c;

    /* renamed from: d */
    public C4059k f13396d;

    /* renamed from: e */
    public boolean f13397e;

    /* renamed from: com.google.protobuf.j$b */
    public static final class b extends AbstractC4057j {

        /* renamed from: g */
        public final byte[] f13398g;

        /* renamed from: h */
        public final boolean f13399h;

        /* renamed from: i */
        public int f13400i;

        /* renamed from: j */
        public int f13401j;

        /* renamed from: k */
        public int f13402k;

        /* renamed from: l */
        public int f13403l;

        /* renamed from: m */
        public int f13404m;

        /* renamed from: n */
        public boolean f13405n;

        /* renamed from: o */
        public int f13406o;

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: A */
        public int mo16532A() {
            return AbstractC4057j.m16523c(m16564P());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: B */
        public long mo16533B() {
            return AbstractC4057j.m16524d(m16565Q());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: C */
        public String mo16534C() {
            int m16564P = m16564P();
            if (m16564P > 0) {
                int i7 = this.f13400i;
                int i8 = this.f13402k;
                if (m16564P <= i7 - i8) {
                    String str = new String(this.f13398g, i8, m16564P, AbstractC4015C.f13275b);
                    this.f13402k += m16564P;
                    return str;
                }
            }
            if (m16564P == 0) {
                return StringUtils.EMPTY;
            }
            if (m16564P < 0) {
                throw C4017D.m16242g();
            }
            throw C4017D.m16246m();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: D */
        public String mo16535D() {
            int m16564P = m16564P();
            if (m16564P > 0) {
                int i7 = this.f13400i;
                int i8 = this.f13402k;
                if (m16564P <= i7 - i8) {
                    String m16110h = AbstractC4012A0.m16110h(this.f13398g, i8, m16564P);
                    this.f13402k += m16564P;
                    return m16110h;
                }
            }
            if (m16564P == 0) {
                return StringUtils.EMPTY;
            }
            if (m16564P <= 0) {
                throw C4017D.m16242g();
            }
            throw C4017D.m16246m();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: E */
        public int mo16536E() {
            if (mo16546f()) {
                this.f13404m = 0;
                return 0;
            }
            int m16564P = m16564P();
            this.f13404m = m16564P;
            if (AbstractC4014B0.m16178a(m16564P) != 0) {
                return this.f13404m;
            }
            throw C4017D.m16238c();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: F */
        public int mo16537F() {
            return m16564P();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: G */
        public long mo16538G() {
            return m16565Q();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: J */
        public boolean mo16541J(int i7) {
            int m16179b = AbstractC4014B0.m16179b(i7);
            if (m16179b == 0) {
                m16569U();
                return true;
            }
            if (m16179b == 1) {
                m16568T(8);
                return true;
            }
            if (m16179b == 2) {
                m16568T(m16564P());
                return true;
            }
            if (m16179b == 3) {
                m16542K();
                mo16543a(AbstractC4014B0.m16180c(AbstractC4014B0.m16178a(i7), 4));
                return true;
            }
            if (m16179b == 4) {
                return false;
            }
            if (m16179b != 5) {
                throw C4017D.m16240e();
            }
            m16568T(4);
            return true;
        }

        /* renamed from: L */
        public byte m16560L() {
            int i7 = this.f13402k;
            if (i7 == this.f13400i) {
                throw C4017D.m16246m();
            }
            byte[] bArr = this.f13398g;
            this.f13402k = i7 + 1;
            return bArr[i7];
        }

        /* renamed from: M */
        public byte[] m16561M(int i7) {
            if (i7 > 0) {
                int i8 = this.f13400i;
                int i9 = this.f13402k;
                if (i7 <= i8 - i9) {
                    int i10 = i7 + i9;
                    this.f13402k = i10;
                    return Arrays.copyOfRange(this.f13398g, i9, i10);
                }
            }
            if (i7 > 0) {
                throw C4017D.m16246m();
            }
            if (i7 == 0) {
                return AbstractC4015C.f13277d;
            }
            throw C4017D.m16242g();
        }

        /* renamed from: N */
        public int m16562N() {
            int i7 = this.f13402k;
            if (this.f13400i - i7 < 4) {
                throw C4017D.m16246m();
            }
            byte[] bArr = this.f13398g;
            this.f13402k = i7 + 4;
            return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
        }

        /* renamed from: O */
        public long m16563O() {
            int i7 = this.f13402k;
            if (this.f13400i - i7 < 8) {
                throw C4017D.m16246m();
            }
            byte[] bArr = this.f13398g;
            this.f13402k = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }

        /* renamed from: P */
        public int m16564P() {
            int i7;
            int i8 = this.f13402k;
            int i9 = this.f13400i;
            if (i9 != i8) {
                byte[] bArr = this.f13398g;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f13402k = i10;
                    return b7;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b7;
                    if (i12 < 0) {
                        i7 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            i7 = i14 ^ 16256;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                i7 = (-2080896) ^ i16;
                            } else {
                                i13 = i8 + 5;
                                byte b8 = bArr[i15];
                                int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i15 = i8 + 6;
                                    if (bArr[i13] < 0) {
                                        i13 = i8 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i8 + 8;
                                            if (bArr[i13] < 0) {
                                                i13 = i8 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i11 = i18;
                                                        i7 = i17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i17;
                                }
                                i7 = i17;
                            }
                            i11 = i15;
                        }
                        i11 = i13;
                    }
                    this.f13402k = i11;
                    return i7;
                }
            }
            return (int) m16566R();
        }

        /* renamed from: Q */
        public long m16565Q() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f13402k;
            int i8 = this.f13400i;
            if (i8 != i7) {
                byte[] bArr = this.f13398g;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f13402k = i9;
                    return b7;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b7;
                    if (i11 < 0) {
                        j7 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            j7 = i13 ^ 16256;
                            i10 = i12;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                long j10 = (-2080896) ^ i15;
                                i10 = i14;
                                j7 = j10;
                            } else {
                                long j11 = i15;
                                i10 = i7 + 5;
                                long j12 = j11 ^ (bArr[i14] << 28);
                                if (j12 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    int i16 = i7 + 6;
                                    long j13 = j12 ^ (bArr[i10] << 35);
                                    if (j13 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        i10 = i7 + 7;
                                        j12 = j13 ^ (bArr[i16] << 42);
                                        if (j12 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            i16 = i7 + 8;
                                            j13 = j12 ^ (bArr[i10] << 49);
                                            if (j13 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                i10 = i7 + 9;
                                                long j14 = (j13 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i10 = i17;
                                                    }
                                                }
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    j7 = j13 ^ j8;
                                    i10 = i16;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    this.f13402k = i10;
                    return j7;
                }
            }
            return m16566R();
        }

        /* renamed from: R */
        public long m16566R() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((m16560L() & 128) == 0) {
                    return j7;
                }
            }
            throw C4017D.m16241f();
        }

        /* renamed from: S */
        public final void m16567S() {
            int i7 = this.f13400i + this.f13401j;
            this.f13400i = i7;
            int i8 = i7 - this.f13403l;
            int i9 = this.f13406o;
            if (i8 <= i9) {
                this.f13401j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f13401j = i10;
            this.f13400i = i7 - i10;
        }

        /* renamed from: T */
        public void m16568T(int i7) {
            if (i7 >= 0) {
                int i8 = this.f13400i;
                int i9 = this.f13402k;
                if (i7 <= i8 - i9) {
                    this.f13402k = i9 + i7;
                    return;
                }
            }
            if (i7 >= 0) {
                throw C4017D.m16246m();
            }
            throw C4017D.m16242g();
        }

        /* renamed from: U */
        public final void m16569U() {
            if (this.f13400i - this.f13402k >= 10) {
                m16570V();
            } else {
                m16571W();
            }
        }

        /* renamed from: V */
        public final void m16570V() {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f13398g;
                int i8 = this.f13402k;
                this.f13402k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C4017D.m16241f();
        }

        /* renamed from: W */
        public final void m16571W() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m16560L() >= 0) {
                    return;
                }
            }
            throw C4017D.m16241f();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: a */
        public void mo16543a(int i7) {
            if (this.f13404m != i7) {
                throw C4017D.m16237b();
            }
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: e */
        public int mo16545e() {
            return this.f13402k - this.f13403l;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: f */
        public boolean mo16546f() {
            return this.f13402k == this.f13400i;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: n */
        public void mo16547n(int i7) {
            this.f13406o = i7;
            m16567S();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: o */
        public int mo16548o(int i7) {
            if (i7 < 0) {
                throw C4017D.m16242g();
            }
            int mo16545e = i7 + mo16545e();
            if (mo16545e < 0) {
                throw C4017D.m16243h();
            }
            int i8 = this.f13406o;
            if (mo16545e > i8) {
                throw C4017D.m16246m();
            }
            this.f13406o = mo16545e;
            m16567S();
            return i8;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: p */
        public boolean mo16549p() {
            return m16565Q() != 0;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: q */
        public AbstractC4055i mo16550q() {
            int m16564P = m16564P();
            if (m16564P > 0) {
                int i7 = this.f13400i;
                int i8 = this.f13402k;
                if (m16564P <= i7 - i8) {
                    AbstractC4055i m16494L = (this.f13399h && this.f13405n) ? AbstractC4055i.m16494L(this.f13398g, i8, m16564P) : AbstractC4055i.m16501m(this.f13398g, i8, m16564P);
                    this.f13402k += m16564P;
                    return m16494L;
                }
            }
            return m16564P == 0 ? AbstractC4055i.f13379b : AbstractC4055i.m16493J(m16561M(m16564P));
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: r */
        public double mo16551r() {
            return Double.longBitsToDouble(m16563O());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: s */
        public int mo16552s() {
            return m16564P();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: t */
        public int mo16553t() {
            return m16562N();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: u */
        public long mo16554u() {
            return m16563O();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: v */
        public float mo16555v() {
            return Float.intBitsToFloat(m16562N());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: w */
        public int mo16556w() {
            return m16564P();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: x */
        public long mo16557x() {
            return m16565Q();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: y */
        public int mo16558y() {
            return m16562N();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: z */
        public long mo16559z() {
            return m16563O();
        }

        public b(byte[] bArr, int i7, int i8, boolean z6) {
            super();
            this.f13406o = C3643a.e.API_PRIORITY_OTHER;
            this.f13398g = bArr;
            this.f13400i = i8 + i7;
            this.f13402k = i7;
            this.f13403l = i7;
            this.f13399h = z6;
        }
    }

    /* renamed from: com.google.protobuf.j$c */
    public static final class c extends AbstractC4057j {

        /* renamed from: g */
        public final Iterable f13407g;

        /* renamed from: h */
        public final Iterator f13408h;

        /* renamed from: i */
        public ByteBuffer f13409i;

        /* renamed from: j */
        public final boolean f13410j;

        /* renamed from: k */
        public boolean f13411k;

        /* renamed from: l */
        public int f13412l;

        /* renamed from: m */
        public int f13413m;

        /* renamed from: n */
        public int f13414n;

        /* renamed from: o */
        public int f13415o;

        /* renamed from: p */
        public int f13416p;

        /* renamed from: q */
        public int f13417q;

        /* renamed from: r */
        public long f13418r;

        /* renamed from: s */
        public long f13419s;

        /* renamed from: t */
        public long f13420t;

        /* renamed from: u */
        public long f13421u;

        /* renamed from: U */
        private void m16572U() {
            int i7 = this.f13412l + this.f13413m;
            this.f13412l = i7;
            int i8 = i7 - this.f13417q;
            int i9 = this.f13414n;
            if (i8 <= i9) {
                this.f13413m = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f13413m = i10;
            this.f13412l = i7 - i10;
        }

        /* renamed from: X */
        private void m16573X() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m16576N() >= 0) {
                    return;
                }
            }
            throw C4017D.m16241f();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: A */
        public int mo16532A() {
            return AbstractC4057j.m16523c(m16580R());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: B */
        public long mo16533B() {
            return AbstractC4057j.m16524d(m16581S());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: C */
        public String mo16534C() {
            int m16580R = m16580R();
            if (m16580R > 0) {
                long j7 = m16580R;
                long j8 = this.f13421u;
                long j9 = this.f13418r;
                if (j7 <= j8 - j9) {
                    byte[] bArr = new byte[m16580R];
                    AbstractC4090z0.m17120p(j9, bArr, 0L, j7);
                    String str = new String(bArr, AbstractC4015C.f13275b);
                    this.f13418r += j7;
                    return str;
                }
            }
            if (m16580R > 0 && m16580R <= m16583V()) {
                byte[] bArr2 = new byte[m16580R];
                m16577O(bArr2, 0, m16580R);
                return new String(bArr2, AbstractC4015C.f13275b);
            }
            if (m16580R == 0) {
                return StringUtils.EMPTY;
            }
            if (m16580R < 0) {
                throw C4017D.m16242g();
            }
            throw C4017D.m16246m();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: D */
        public String mo16535D() {
            int m16580R = m16580R();
            if (m16580R > 0) {
                long j7 = m16580R;
                long j8 = this.f13421u;
                long j9 = this.f13418r;
                if (j7 <= j8 - j9) {
                    String m16109g = AbstractC4012A0.m16109g(this.f13409i, (int) (j9 - this.f13419s), m16580R);
                    this.f13418r += j7;
                    return m16109g;
                }
            }
            if (m16580R >= 0 && m16580R <= m16583V()) {
                byte[] bArr = new byte[m16580R];
                m16577O(bArr, 0, m16580R);
                return AbstractC4012A0.m16110h(bArr, 0, m16580R);
            }
            if (m16580R == 0) {
                return StringUtils.EMPTY;
            }
            if (m16580R <= 0) {
                throw C4017D.m16242g();
            }
            throw C4017D.m16246m();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: E */
        public int mo16536E() {
            if (mo16546f()) {
                this.f13415o = 0;
                return 0;
            }
            int m16580R = m16580R();
            this.f13415o = m16580R;
            if (AbstractC4014B0.m16178a(m16580R) != 0) {
                return this.f13415o;
            }
            throw C4017D.m16238c();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: F */
        public int mo16537F() {
            return m16580R();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: G */
        public long mo16538G() {
            return m16581S();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: J */
        public boolean mo16541J(int i7) {
            int m16179b = AbstractC4014B0.m16179b(i7);
            if (m16179b == 0) {
                m16573X();
                return true;
            }
            if (m16179b == 1) {
                m16584W(8);
                return true;
            }
            if (m16179b == 2) {
                m16584W(m16580R());
                return true;
            }
            if (m16179b == 3) {
                m16542K();
                mo16543a(AbstractC4014B0.m16180c(AbstractC4014B0.m16178a(i7), 4));
                return true;
            }
            if (m16179b == 4) {
                return false;
            }
            if (m16179b != 5) {
                throw C4017D.m16240e();
            }
            m16584W(4);
            return true;
        }

        /* renamed from: L */
        public final long m16574L() {
            return this.f13421u - this.f13418r;
        }

        /* renamed from: M */
        public final void m16575M() {
            if (!this.f13408h.hasNext()) {
                throw C4017D.m16246m();
            }
            m16586Z();
        }

        /* renamed from: N */
        public byte m16576N() {
            if (m16574L() == 0) {
                m16575M();
            }
            long j7 = this.f13418r;
            this.f13418r = 1 + j7;
            return AbstractC4090z0.m17127w(j7);
        }

        /* renamed from: O */
        public final void m16577O(byte[] bArr, int i7, int i8) {
            if (i8 < 0 || i8 > m16583V()) {
                if (i8 > 0) {
                    throw C4017D.m16246m();
                }
                if (i8 != 0) {
                    throw C4017D.m16242g();
                }
                return;
            }
            int i9 = i8;
            while (i9 > 0) {
                if (m16574L() == 0) {
                    m16575M();
                }
                int min = Math.min(i9, (int) m16574L());
                long j7 = min;
                AbstractC4090z0.m17120p(this.f13418r, bArr, (i8 - i9) + i7, j7);
                i9 -= min;
                this.f13418r += j7;
            }
        }

        /* renamed from: P */
        public int m16578P() {
            if (m16574L() < 4) {
                return (m16576N() & ForkServer.ERROR) | ((m16576N() & ForkServer.ERROR) << 8) | ((m16576N() & ForkServer.ERROR) << 16) | ((m16576N() & ForkServer.ERROR) << 24);
            }
            long j7 = this.f13418r;
            this.f13418r = 4 + j7;
            return ((AbstractC4090z0.m17127w(j7 + 3) & ForkServer.ERROR) << 24) | (AbstractC4090z0.m17127w(j7) & ForkServer.ERROR) | ((AbstractC4090z0.m17127w(1 + j7) & ForkServer.ERROR) << 8) | ((AbstractC4090z0.m17127w(2 + j7) & ForkServer.ERROR) << 16);
        }

        /* renamed from: Q */
        public long m16579Q() {
            long m16576N;
            byte m16576N2;
            if (m16574L() >= 8) {
                long j7 = this.f13418r;
                this.f13418r = 8 + j7;
                m16576N = (AbstractC4090z0.m17127w(j7) & 255) | ((AbstractC4090z0.m17127w(1 + j7) & 255) << 8) | ((AbstractC4090z0.m17127w(2 + j7) & 255) << 16) | ((AbstractC4090z0.m17127w(3 + j7) & 255) << 24) | ((AbstractC4090z0.m17127w(4 + j7) & 255) << 32) | ((AbstractC4090z0.m17127w(5 + j7) & 255) << 40) | ((AbstractC4090z0.m17127w(6 + j7) & 255) << 48);
                m16576N2 = AbstractC4090z0.m17127w(j7 + 7);
            } else {
                m16576N = (m16576N() & 255) | ((m16576N() & 255) << 8) | ((m16576N() & 255) << 16) | ((m16576N() & 255) << 24) | ((m16576N() & 255) << 32) | ((m16576N() & 255) << 40) | ((m16576N() & 255) << 48);
                m16576N2 = m16576N();
            }
            return ((m16576N2 & 255) << 56) | m16576N;
        }

        /* renamed from: R */
        public int m16580R() {
            int i7;
            long j7 = this.f13418r;
            if (this.f13421u != j7) {
                long j8 = j7 + 1;
                byte m17127w = AbstractC4090z0.m17127w(j7);
                if (m17127w >= 0) {
                    this.f13418r++;
                    return m17127w;
                }
                if (this.f13421u - this.f13418r >= 10) {
                    long j9 = 2 + j7;
                    int m17127w2 = (AbstractC4090z0.m17127w(j8) << 7) ^ m17127w;
                    if (m17127w2 < 0) {
                        i7 = m17127w2 ^ (-128);
                    } else {
                        long j10 = 3 + j7;
                        int m17127w3 = (AbstractC4090z0.m17127w(j9) << 14) ^ m17127w2;
                        if (m17127w3 >= 0) {
                            i7 = m17127w3 ^ 16256;
                        } else {
                            long j11 = 4 + j7;
                            int m17127w4 = m17127w3 ^ (AbstractC4090z0.m17127w(j10) << 21);
                            if (m17127w4 < 0) {
                                i7 = (-2080896) ^ m17127w4;
                            } else {
                                j10 = 5 + j7;
                                byte m17127w5 = AbstractC4090z0.m17127w(j11);
                                int i8 = (m17127w4 ^ (m17127w5 << 28)) ^ 266354560;
                                if (m17127w5 < 0) {
                                    j11 = 6 + j7;
                                    if (AbstractC4090z0.m17127w(j10) < 0) {
                                        j10 = 7 + j7;
                                        if (AbstractC4090z0.m17127w(j11) < 0) {
                                            j11 = 8 + j7;
                                            if (AbstractC4090z0.m17127w(j10) < 0) {
                                                j10 = 9 + j7;
                                                if (AbstractC4090z0.m17127w(j11) < 0) {
                                                    long j12 = j7 + 10;
                                                    if (AbstractC4090z0.m17127w(j10) >= 0) {
                                                        i7 = i8;
                                                        j9 = j12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i8;
                                }
                                i7 = i8;
                            }
                            j9 = j11;
                        }
                        j9 = j10;
                    }
                    this.f13418r = j9;
                    return i7;
                }
            }
            return (int) m16582T();
        }

        /* renamed from: S */
        public long m16581S() {
            long j7;
            long j8;
            long j9;
            long j10 = this.f13418r;
            if (this.f13421u != j10) {
                long j11 = j10 + 1;
                byte m17127w = AbstractC4090z0.m17127w(j10);
                if (m17127w >= 0) {
                    this.f13418r++;
                    return m17127w;
                }
                if (this.f13421u - this.f13418r >= 10) {
                    long j12 = 2 + j10;
                    int m17127w2 = (AbstractC4090z0.m17127w(j11) << 7) ^ m17127w;
                    if (m17127w2 < 0) {
                        j7 = m17127w2 ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int m17127w3 = (AbstractC4090z0.m17127w(j12) << 14) ^ m17127w2;
                        if (m17127w3 >= 0) {
                            j7 = m17127w3 ^ 16256;
                            j12 = j13;
                        } else {
                            long j14 = 4 + j10;
                            int m17127w4 = m17127w3 ^ (AbstractC4090z0.m17127w(j13) << 21);
                            if (m17127w4 < 0) {
                                j7 = (-2080896) ^ m17127w4;
                                j12 = j14;
                            } else {
                                long j15 = 5 + j10;
                                long m17127w5 = (AbstractC4090z0.m17127w(j14) << 28) ^ m17127w4;
                                if (m17127w5 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    long j16 = 6 + j10;
                                    long m17127w6 = m17127w5 ^ (AbstractC4090z0.m17127w(j15) << 35);
                                    if (m17127w6 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        j15 = 7 + j10;
                                        m17127w5 = m17127w6 ^ (AbstractC4090z0.m17127w(j16) << 42);
                                        if (m17127w5 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            j16 = 8 + j10;
                                            m17127w6 = m17127w5 ^ (AbstractC4090z0.m17127w(j15) << 49);
                                            if (m17127w6 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                j15 = 9 + j10;
                                                long m17127w7 = (m17127w6 ^ (AbstractC4090z0.m17127w(j16) << 56)) ^ 71499008037633920L;
                                                if (m17127w7 < 0) {
                                                    long j17 = j10 + 10;
                                                    if (AbstractC4090z0.m17127w(j15) >= 0) {
                                                        j7 = m17127w7;
                                                        j12 = j17;
                                                    }
                                                } else {
                                                    j7 = m17127w7;
                                                    j12 = j15;
                                                }
                                            }
                                        }
                                    }
                                    j7 = j8 ^ m17127w6;
                                    j12 = j16;
                                }
                                j7 = j9 ^ m17127w5;
                                j12 = j15;
                            }
                        }
                    }
                    this.f13418r = j12;
                    return j7;
                }
            }
            return m16582T();
        }

        /* renamed from: T */
        public long m16582T() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((m16576N() & 128) == 0) {
                    return j7;
                }
            }
            throw C4017D.m16241f();
        }

        /* renamed from: V */
        public final int m16583V() {
            return (int) (((this.f13412l - this.f13416p) - this.f13418r) + this.f13419s);
        }

        /* renamed from: W */
        public void m16584W(int i7) {
            if (i7 < 0 || i7 > ((this.f13412l - this.f13416p) - this.f13418r) + this.f13419s) {
                if (i7 >= 0) {
                    throw C4017D.m16246m();
                }
                throw C4017D.m16242g();
            }
            while (i7 > 0) {
                if (m16574L() == 0) {
                    m16575M();
                }
                int min = Math.min(i7, (int) m16574L());
                i7 -= min;
                this.f13418r += min;
            }
        }

        /* renamed from: Y */
        public final ByteBuffer m16585Y(int i7, int i8) {
            int position = this.f13409i.position();
            int limit = this.f13409i.limit();
            ByteBuffer byteBuffer = this.f13409i;
            try {
                try {
                    byteBuffer.position(i7);
                    byteBuffer.limit(i8);
                    return this.f13409i.slice();
                } catch (IllegalArgumentException unused) {
                    throw C4017D.m16246m();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        /* renamed from: Z */
        public final void m16586Z() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f13408h.next();
            this.f13409i = byteBuffer;
            this.f13416p += (int) (this.f13418r - this.f13419s);
            long position = byteBuffer.position();
            this.f13418r = position;
            this.f13419s = position;
            this.f13421u = this.f13409i.limit();
            long m17115k = AbstractC4090z0.m17115k(this.f13409i);
            this.f13420t = m17115k;
            this.f13418r += m17115k;
            this.f13419s += m17115k;
            this.f13421u += m17115k;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: a */
        public void mo16543a(int i7) {
            if (this.f13415o != i7) {
                throw C4017D.m16237b();
            }
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: e */
        public int mo16545e() {
            return (int) (((this.f13416p - this.f13417q) + this.f13418r) - this.f13419s);
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: f */
        public boolean mo16546f() {
            return (((long) this.f13416p) + this.f13418r) - this.f13419s == ((long) this.f13412l);
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: n */
        public void mo16547n(int i7) {
            this.f13414n = i7;
            m16572U();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: o */
        public int mo16548o(int i7) {
            if (i7 < 0) {
                throw C4017D.m16242g();
            }
            int mo16545e = i7 + mo16545e();
            int i8 = this.f13414n;
            if (mo16545e > i8) {
                throw C4017D.m16246m();
            }
            this.f13414n = mo16545e;
            m16572U();
            return i8;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: p */
        public boolean mo16549p() {
            return m16581S() != 0;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: q */
        public AbstractC4055i mo16550q() {
            int m16580R = m16580R();
            if (m16580R > 0) {
                long j7 = m16580R;
                long j8 = this.f13421u;
                long j9 = this.f13418r;
                if (j7 <= j8 - j9) {
                    if (this.f13410j && this.f13411k) {
                        int i7 = (int) (j9 - this.f13420t);
                        AbstractC4055i m16492I = AbstractC4055i.m16492I(m16585Y(i7, m16580R + i7));
                        this.f13418r += j7;
                        return m16492I;
                    }
                    byte[] bArr = new byte[m16580R];
                    AbstractC4090z0.m17120p(j9, bArr, 0L, j7);
                    this.f13418r += j7;
                    return AbstractC4055i.m16493J(bArr);
                }
            }
            if (m16580R <= 0 || m16580R > m16583V()) {
                if (m16580R == 0) {
                    return AbstractC4055i.f13379b;
                }
                if (m16580R < 0) {
                    throw C4017D.m16242g();
                }
                throw C4017D.m16246m();
            }
            if (!this.f13410j || !this.f13411k) {
                byte[] bArr2 = new byte[m16580R];
                m16577O(bArr2, 0, m16580R);
                return AbstractC4055i.m16493J(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (m16580R > 0) {
                if (m16574L() == 0) {
                    m16575M();
                }
                int min = Math.min(m16580R, (int) m16574L());
                int i8 = (int) (this.f13418r - this.f13420t);
                arrayList.add(AbstractC4055i.m16492I(m16585Y(i8, i8 + min)));
                m16580R -= min;
                this.f13418r += min;
            }
            return AbstractC4055i.m16499k(arrayList);
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: r */
        public double mo16551r() {
            return Double.longBitsToDouble(m16579Q());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: s */
        public int mo16552s() {
            return m16580R();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: t */
        public int mo16553t() {
            return m16578P();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: u */
        public long mo16554u() {
            return m16579Q();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: v */
        public float mo16555v() {
            return Float.intBitsToFloat(m16578P());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: w */
        public int mo16556w() {
            return m16580R();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: x */
        public long mo16557x() {
            return m16581S();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: y */
        public int mo16558y() {
            return m16578P();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: z */
        public long mo16559z() {
            return m16579Q();
        }

        public c(Iterable iterable, int i7, boolean z6) {
            super();
            this.f13414n = C3643a.e.API_PRIORITY_OTHER;
            this.f13412l = i7;
            this.f13407g = iterable;
            this.f13408h = iterable.iterator();
            this.f13410j = z6;
            this.f13416p = 0;
            this.f13417q = 0;
            if (i7 != 0) {
                m16586Z();
                return;
            }
            this.f13409i = AbstractC4015C.f13278e;
            this.f13418r = 0L;
            this.f13419s = 0L;
            this.f13421u = 0L;
            this.f13420t = 0L;
        }
    }

    /* renamed from: com.google.protobuf.j$d */
    public static final class d extends AbstractC4057j {

        /* renamed from: g */
        public final InputStream f13422g;

        /* renamed from: h */
        public final byte[] f13423h;

        /* renamed from: i */
        public int f13424i;

        /* renamed from: j */
        public int f13425j;

        /* renamed from: k */
        public int f13426k;

        /* renamed from: l */
        public int f13427l;

        /* renamed from: m */
        public int f13428m;

        /* renamed from: n */
        public int f13429n;

        /* renamed from: L */
        public static int m16587L(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (C4017D e7) {
                e7.m16248j();
                throw e7;
            }
        }

        /* renamed from: M */
        public static int m16588M(InputStream inputStream, byte[] bArr, int i7, int i8) {
            try {
                return inputStream.read(bArr, i7, i8);
            } catch (C4017D e7) {
                e7.m16248j();
                throw e7;
            }
        }

        /* renamed from: X */
        private void m16589X() {
            int i7 = this.f13424i + this.f13425j;
            this.f13424i = i7;
            int i8 = this.f13428m + i7;
            int i9 = this.f13429n;
            if (i8 <= i9) {
                this.f13425j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f13425j = i10;
            this.f13424i = i7 - i10;
        }

        /* renamed from: Z */
        public static long m16590Z(InputStream inputStream, long j7) {
            try {
                return inputStream.skip(j7);
            } catch (C4017D e7) {
                e7.m16248j();
                throw e7;
            }
        }

        /* renamed from: c0 */
        private void m16591c0() {
            if (this.f13424i - this.f13426k >= 10) {
                m16592d0();
            } else {
                m16593e0();
            }
        }

        /* renamed from: d0 */
        private void m16592d0() {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f13423h;
                int i8 = this.f13426k;
                this.f13426k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C4017D.m16241f();
        }

        /* renamed from: e0 */
        private void m16593e0() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m16595O() >= 0) {
                    return;
                }
            }
            throw C4017D.m16241f();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: A */
        public int mo16532A() {
            return AbstractC4057j.m16523c(m16601U());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: B */
        public long mo16533B() {
            return AbstractC4057j.m16524d(m16602V());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: C */
        public String mo16534C() {
            int m16601U = m16601U();
            if (m16601U > 0) {
                int i7 = this.f13424i;
                int i8 = this.f13426k;
                if (m16601U <= i7 - i8) {
                    String str = new String(this.f13423h, i8, m16601U, AbstractC4015C.f13275b);
                    this.f13426k += m16601U;
                    return str;
                }
            }
            if (m16601U == 0) {
                return StringUtils.EMPTY;
            }
            if (m16601U < 0) {
                throw C4017D.m16242g();
            }
            if (m16601U > this.f13424i) {
                return new String(m16596P(m16601U, false), AbstractC4015C.f13275b);
            }
            m16604Y(m16601U);
            String str2 = new String(this.f13423h, this.f13426k, m16601U, AbstractC4015C.f13275b);
            this.f13426k += m16601U;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: D */
        public String mo16535D() {
            byte[] m16596P;
            int m16601U = m16601U();
            int i7 = this.f13426k;
            int i8 = this.f13424i;
            if (m16601U <= i8 - i7 && m16601U > 0) {
                m16596P = this.f13423h;
                this.f13426k = i7 + m16601U;
            } else {
                if (m16601U == 0) {
                    return StringUtils.EMPTY;
                }
                if (m16601U < 0) {
                    throw C4017D.m16242g();
                }
                i7 = 0;
                if (m16601U <= i8) {
                    m16604Y(m16601U);
                    m16596P = this.f13423h;
                    this.f13426k = m16601U;
                } else {
                    m16596P = m16596P(m16601U, false);
                }
            }
            return AbstractC4012A0.m16110h(m16596P, i7, m16601U);
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: E */
        public int mo16536E() {
            if (mo16546f()) {
                this.f13427l = 0;
                return 0;
            }
            int m16601U = m16601U();
            this.f13427l = m16601U;
            if (AbstractC4014B0.m16178a(m16601U) != 0) {
                return this.f13427l;
            }
            throw C4017D.m16238c();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: F */
        public int mo16537F() {
            return m16601U();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: G */
        public long mo16538G() {
            return m16602V();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: J */
        public boolean mo16541J(int i7) {
            int m16179b = AbstractC4014B0.m16179b(i7);
            if (m16179b == 0) {
                m16591c0();
                return true;
            }
            if (m16179b == 1) {
                m16605a0(8);
                return true;
            }
            if (m16179b == 2) {
                m16605a0(m16601U());
                return true;
            }
            if (m16179b == 3) {
                m16542K();
                mo16543a(AbstractC4014B0.m16180c(AbstractC4014B0.m16178a(i7), 4));
                return true;
            }
            if (m16179b == 4) {
                return false;
            }
            if (m16179b != 5) {
                throw C4017D.m16240e();
            }
            m16605a0(4);
            return true;
        }

        /* renamed from: N */
        public final AbstractC4055i m16594N(int i7) {
            byte[] m16597Q = m16597Q(i7);
            if (m16597Q != null) {
                return AbstractC4055i.m16500l(m16597Q);
            }
            int i8 = this.f13426k;
            int i9 = this.f13424i;
            int i10 = i9 - i8;
            this.f13428m += i9;
            this.f13426k = 0;
            this.f13424i = 0;
            List<byte[]> m16598R = m16598R(i7 - i10);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f13423h, i8, bArr, 0, i10);
            for (byte[] bArr2 : m16598R) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return AbstractC4055i.m16493J(bArr);
        }

        /* renamed from: O */
        public byte m16595O() {
            if (this.f13426k == this.f13424i) {
                m16604Y(1);
            }
            byte[] bArr = this.f13423h;
            int i7 = this.f13426k;
            this.f13426k = i7 + 1;
            return bArr[i7];
        }

        /* renamed from: P */
        public final byte[] m16596P(int i7, boolean z6) {
            byte[] m16597Q = m16597Q(i7);
            if (m16597Q != null) {
                return z6 ? (byte[]) m16597Q.clone() : m16597Q;
            }
            int i8 = this.f13426k;
            int i9 = this.f13424i;
            int i10 = i9 - i8;
            this.f13428m += i9;
            this.f13426k = 0;
            this.f13424i = 0;
            List<byte[]> m16598R = m16598R(i7 - i10);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f13423h, i8, bArr, 0, i10);
            for (byte[] bArr2 : m16598R) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: Q */
        public final byte[] m16597Q(int i7) {
            if (i7 == 0) {
                return AbstractC4015C.f13277d;
            }
            if (i7 < 0) {
                throw C4017D.m16242g();
            }
            int i8 = this.f13428m;
            int i9 = this.f13426k;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f13395c > 0) {
                throw C4017D.m16245l();
            }
            int i11 = this.f13429n;
            if (i10 > i11) {
                m16605a0((i11 - i8) - i9);
                throw C4017D.m16246m();
            }
            int i12 = this.f13424i - i9;
            int i13 = i7 - i12;
            if (i13 >= 4096 && i13 > m16587L(this.f13422g)) {
                return null;
            }
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f13423h, this.f13426k, bArr, 0, i12);
            this.f13428m += this.f13424i;
            this.f13426k = 0;
            this.f13424i = 0;
            while (i12 < i7) {
                int m16588M = m16588M(this.f13422g, bArr, i12, i7 - i12);
                if (m16588M == -1) {
                    throw C4017D.m16246m();
                }
                this.f13428m += m16588M;
                i12 += m16588M;
            }
            return bArr;
        }

        /* renamed from: R */
        public final List m16598R(int i7) {
            ArrayList arrayList = new ArrayList();
            while (i7 > 0) {
                int min = Math.min(i7, 4096);
                byte[] bArr = new byte[min];
                int i8 = 0;
                while (i8 < min) {
                    int read = this.f13422g.read(bArr, i8, min - i8);
                    if (read == -1) {
                        throw C4017D.m16246m();
                    }
                    this.f13428m += read;
                    i8 += read;
                }
                i7 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: S */
        public int m16599S() {
            int i7 = this.f13426k;
            if (this.f13424i - i7 < 4) {
                m16604Y(4);
                i7 = this.f13426k;
            }
            byte[] bArr = this.f13423h;
            this.f13426k = i7 + 4;
            return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
        }

        /* renamed from: T */
        public long m16600T() {
            int i7 = this.f13426k;
            if (this.f13424i - i7 < 8) {
                m16604Y(8);
                i7 = this.f13426k;
            }
            byte[] bArr = this.f13423h;
            this.f13426k = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }

        /* renamed from: U */
        public int m16601U() {
            int i7;
            int i8 = this.f13426k;
            int i9 = this.f13424i;
            if (i9 != i8) {
                byte[] bArr = this.f13423h;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f13426k = i10;
                    return b7;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b7;
                    if (i12 < 0) {
                        i7 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            i7 = i14 ^ 16256;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                i7 = (-2080896) ^ i16;
                            } else {
                                i13 = i8 + 5;
                                byte b8 = bArr[i15];
                                int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i15 = i8 + 6;
                                    if (bArr[i13] < 0) {
                                        i13 = i8 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i8 + 8;
                                            if (bArr[i13] < 0) {
                                                i13 = i8 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i11 = i18;
                                                        i7 = i17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i17;
                                }
                                i7 = i17;
                            }
                            i11 = i15;
                        }
                        i11 = i13;
                    }
                    this.f13426k = i11;
                    return i7;
                }
            }
            return (int) m16603W();
        }

        /* renamed from: V */
        public long m16602V() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f13426k;
            int i8 = this.f13424i;
            if (i8 != i7) {
                byte[] bArr = this.f13423h;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f13426k = i9;
                    return b7;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b7;
                    if (i11 < 0) {
                        j7 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            j7 = i13 ^ 16256;
                            i10 = i12;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                long j10 = (-2080896) ^ i15;
                                i10 = i14;
                                j7 = j10;
                            } else {
                                long j11 = i15;
                                i10 = i7 + 5;
                                long j12 = j11 ^ (bArr[i14] << 28);
                                if (j12 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    int i16 = i7 + 6;
                                    long j13 = j12 ^ (bArr[i10] << 35);
                                    if (j13 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        i10 = i7 + 7;
                                        j12 = j13 ^ (bArr[i16] << 42);
                                        if (j12 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            i16 = i7 + 8;
                                            j13 = j12 ^ (bArr[i10] << 49);
                                            if (j13 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                i10 = i7 + 9;
                                                long j14 = (j13 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i10 = i17;
                                                    }
                                                }
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    j7 = j13 ^ j8;
                                    i10 = i16;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    this.f13426k = i10;
                    return j7;
                }
            }
            return m16603W();
        }

        /* renamed from: W */
        public long m16603W() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((m16595O() & 128) == 0) {
                    return j7;
                }
            }
            throw C4017D.m16241f();
        }

        /* renamed from: Y */
        public final void m16604Y(int i7) {
            if (m16607f0(i7)) {
                return;
            }
            if (i7 <= (this.f13395c - this.f13428m) - this.f13426k) {
                throw C4017D.m16246m();
            }
            throw C4017D.m16245l();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: a */
        public void mo16543a(int i7) {
            if (this.f13427l != i7) {
                throw C4017D.m16237b();
            }
        }

        /* renamed from: a0 */
        public void m16605a0(int i7) {
            int i8 = this.f13424i;
            int i9 = this.f13426k;
            if (i7 > i8 - i9 || i7 < 0) {
                m16606b0(i7);
            } else {
                this.f13426k = i9 + i7;
            }
        }

        /* renamed from: b0 */
        public final void m16606b0(int i7) {
            if (i7 < 0) {
                throw C4017D.m16242g();
            }
            int i8 = this.f13428m;
            int i9 = this.f13426k;
            int i10 = i8 + i9 + i7;
            int i11 = this.f13429n;
            if (i10 > i11) {
                m16605a0((i11 - i8) - i9);
                throw C4017D.m16246m();
            }
            this.f13428m = i8 + i9;
            int i12 = this.f13424i - i9;
            this.f13424i = 0;
            this.f13426k = 0;
            while (i12 < i7) {
                try {
                    long j7 = i7 - i12;
                    long m16590Z = m16590Z(this.f13422g, j7);
                    if (m16590Z < 0 || m16590Z > j7) {
                        throw new IllegalStateException(this.f13422g.getClass() + "#skip returned invalid result: " + m16590Z + "\nThe InputStream implementation is buggy.");
                    }
                    if (m16590Z == 0) {
                        break;
                    } else {
                        i12 += (int) m16590Z;
                    }
                } finally {
                    this.f13428m += i12;
                    m16589X();
                }
            }
            if (i12 >= i7) {
                return;
            }
            int i13 = this.f13424i;
            int i14 = i13 - this.f13426k;
            this.f13426k = i13;
            m16604Y(1);
            while (true) {
                int i15 = i7 - i14;
                int i16 = this.f13424i;
                if (i15 <= i16) {
                    this.f13426k = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f13426k = i16;
                    m16604Y(1);
                }
            }
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: e */
        public int mo16545e() {
            return this.f13428m + this.f13426k;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: f */
        public boolean mo16546f() {
            return this.f13426k == this.f13424i && !m16607f0(1);
        }

        /* renamed from: f0 */
        public final boolean m16607f0(int i7) {
            int i8 = this.f13426k;
            int i9 = i8 + i7;
            int i10 = this.f13424i;
            if (i9 <= i10) {
                throw new IllegalStateException("refillBuffer() called when " + i7 + " bytes were already available in buffer");
            }
            int i11 = this.f13395c;
            int i12 = this.f13428m;
            if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.f13429n) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.f13423h;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f13428m += i8;
                this.f13424i -= i8;
                this.f13426k = 0;
            }
            InputStream inputStream = this.f13422g;
            byte[] bArr2 = this.f13423h;
            int i13 = this.f13424i;
            int m16588M = m16588M(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.f13395c - this.f13428m) - i13));
            if (m16588M == 0 || m16588M < -1 || m16588M > this.f13423h.length) {
                throw new IllegalStateException(this.f13422g.getClass() + "#read(byte[]) returned invalid result: " + m16588M + "\nThe InputStream implementation is buggy.");
            }
            if (m16588M <= 0) {
                return false;
            }
            this.f13424i += m16588M;
            m16589X();
            if (this.f13424i >= i7) {
                return true;
            }
            return m16607f0(i7);
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: n */
        public void mo16547n(int i7) {
            this.f13429n = i7;
            m16589X();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: o */
        public int mo16548o(int i7) {
            if (i7 < 0) {
                throw C4017D.m16242g();
            }
            int i8 = i7 + this.f13428m + this.f13426k;
            int i9 = this.f13429n;
            if (i8 > i9) {
                throw C4017D.m16246m();
            }
            this.f13429n = i8;
            m16589X();
            return i9;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: p */
        public boolean mo16549p() {
            return m16602V() != 0;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: q */
        public AbstractC4055i mo16550q() {
            int m16601U = m16601U();
            int i7 = this.f13424i;
            int i8 = this.f13426k;
            if (m16601U <= i7 - i8 && m16601U > 0) {
                AbstractC4055i m16501m = AbstractC4055i.m16501m(this.f13423h, i8, m16601U);
                this.f13426k += m16601U;
                return m16501m;
            }
            if (m16601U == 0) {
                return AbstractC4055i.f13379b;
            }
            if (m16601U >= 0) {
                return m16594N(m16601U);
            }
            throw C4017D.m16242g();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: r */
        public double mo16551r() {
            return Double.longBitsToDouble(m16600T());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: s */
        public int mo16552s() {
            return m16601U();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: t */
        public int mo16553t() {
            return m16599S();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: u */
        public long mo16554u() {
            return m16600T();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: v */
        public float mo16555v() {
            return Float.intBitsToFloat(m16599S());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: w */
        public int mo16556w() {
            return m16601U();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: x */
        public long mo16557x() {
            return m16602V();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: y */
        public int mo16558y() {
            return m16599S();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: z */
        public long mo16559z() {
            return m16600T();
        }

        public d(InputStream inputStream, int i7) {
            super();
            this.f13429n = C3643a.e.API_PRIORITY_OTHER;
            AbstractC4015C.m16184b(inputStream, "input");
            this.f13422g = inputStream;
            this.f13423h = new byte[i7];
            this.f13424i = 0;
            this.f13426k = 0;
            this.f13428m = 0;
        }
    }

    /* renamed from: com.google.protobuf.j$e */
    public static final class e extends AbstractC4057j {

        /* renamed from: g */
        public final ByteBuffer f13430g;

        /* renamed from: h */
        public final boolean f13431h;

        /* renamed from: i */
        public final long f13432i;

        /* renamed from: j */
        public long f13433j;

        /* renamed from: k */
        public long f13434k;

        /* renamed from: l */
        public long f13435l;

        /* renamed from: m */
        public int f13436m;

        /* renamed from: n */
        public int f13437n;

        /* renamed from: o */
        public boolean f13438o;

        /* renamed from: p */
        public int f13439p;

        /* renamed from: M */
        public static boolean m16608M() {
            return AbstractC4090z0.m17090J();
        }

        /* renamed from: T */
        private void m16609T() {
            long j7 = this.f13433j + this.f13436m;
            this.f13433j = j7;
            int i7 = (int) (j7 - this.f13435l);
            int i8 = this.f13439p;
            if (i7 <= i8) {
                this.f13436m = 0;
                return;
            }
            int i9 = i7 - i8;
            this.f13436m = i9;
            this.f13433j = j7 - i9;
        }

        /* renamed from: U */
        private int m16610U() {
            return (int) (this.f13433j - this.f13434k);
        }

        /* renamed from: W */
        private void m16611W() {
            if (m16610U() >= 10) {
                m16612X();
            } else {
                m16613Y();
            }
        }

        /* renamed from: X */
        private void m16612X() {
            for (int i7 = 0; i7 < 10; i7++) {
                long j7 = this.f13434k;
                this.f13434k = 1 + j7;
                if (AbstractC4090z0.m17127w(j7) >= 0) {
                    return;
                }
            }
            throw C4017D.m16241f();
        }

        /* renamed from: Y */
        private void m16613Y() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m16615N() >= 0) {
                    return;
                }
            }
            throw C4017D.m16241f();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: A */
        public int mo16532A() {
            return AbstractC4057j.m16523c(m16618Q());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: B */
        public long mo16533B() {
            return AbstractC4057j.m16524d(m16619R());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: C */
        public String mo16534C() {
            int m16618Q = m16618Q();
            if (m16618Q <= 0 || m16618Q > m16610U()) {
                if (m16618Q == 0) {
                    return StringUtils.EMPTY;
                }
                if (m16618Q < 0) {
                    throw C4017D.m16242g();
                }
                throw C4017D.m16246m();
            }
            byte[] bArr = new byte[m16618Q];
            long j7 = m16618Q;
            AbstractC4090z0.m17120p(this.f13434k, bArr, 0L, j7);
            String str = new String(bArr, AbstractC4015C.f13275b);
            this.f13434k += j7;
            return str;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: D */
        public String mo16535D() {
            int m16618Q = m16618Q();
            if (m16618Q > 0 && m16618Q <= m16610U()) {
                String m16109g = AbstractC4012A0.m16109g(this.f13430g, m16614L(this.f13434k), m16618Q);
                this.f13434k += m16618Q;
                return m16109g;
            }
            if (m16618Q == 0) {
                return StringUtils.EMPTY;
            }
            if (m16618Q <= 0) {
                throw C4017D.m16242g();
            }
            throw C4017D.m16246m();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: E */
        public int mo16536E() {
            if (mo16546f()) {
                this.f13437n = 0;
                return 0;
            }
            int m16618Q = m16618Q();
            this.f13437n = m16618Q;
            if (AbstractC4014B0.m16178a(m16618Q) != 0) {
                return this.f13437n;
            }
            throw C4017D.m16238c();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: F */
        public int mo16537F() {
            return m16618Q();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: G */
        public long mo16538G() {
            return m16619R();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: J */
        public boolean mo16541J(int i7) {
            int m16179b = AbstractC4014B0.m16179b(i7);
            if (m16179b == 0) {
                m16611W();
                return true;
            }
            if (m16179b == 1) {
                m16621V(8);
                return true;
            }
            if (m16179b == 2) {
                m16621V(m16618Q());
                return true;
            }
            if (m16179b == 3) {
                m16542K();
                mo16543a(AbstractC4014B0.m16180c(AbstractC4014B0.m16178a(i7), 4));
                return true;
            }
            if (m16179b == 4) {
                return false;
            }
            if (m16179b != 5) {
                throw C4017D.m16240e();
            }
            m16621V(4);
            return true;
        }

        /* renamed from: L */
        public final int m16614L(long j7) {
            return (int) (j7 - this.f13432i);
        }

        /* renamed from: N */
        public byte m16615N() {
            long j7 = this.f13434k;
            if (j7 == this.f13433j) {
                throw C4017D.m16246m();
            }
            this.f13434k = 1 + j7;
            return AbstractC4090z0.m17127w(j7);
        }

        /* renamed from: O */
        public int m16616O() {
            long j7 = this.f13434k;
            if (this.f13433j - j7 < 4) {
                throw C4017D.m16246m();
            }
            this.f13434k = 4 + j7;
            return ((AbstractC4090z0.m17127w(j7 + 3) & ForkServer.ERROR) << 24) | (AbstractC4090z0.m17127w(j7) & ForkServer.ERROR) | ((AbstractC4090z0.m17127w(1 + j7) & ForkServer.ERROR) << 8) | ((AbstractC4090z0.m17127w(2 + j7) & ForkServer.ERROR) << 16);
        }

        /* renamed from: P */
        public long m16617P() {
            long j7 = this.f13434k;
            if (this.f13433j - j7 < 8) {
                throw C4017D.m16246m();
            }
            this.f13434k = 8 + j7;
            return ((AbstractC4090z0.m17127w(j7 + 7) & 255) << 56) | (AbstractC4090z0.m17127w(j7) & 255) | ((AbstractC4090z0.m17127w(1 + j7) & 255) << 8) | ((AbstractC4090z0.m17127w(2 + j7) & 255) << 16) | ((AbstractC4090z0.m17127w(3 + j7) & 255) << 24) | ((AbstractC4090z0.m17127w(4 + j7) & 255) << 32) | ((AbstractC4090z0.m17127w(5 + j7) & 255) << 40) | ((AbstractC4090z0.m17127w(6 + j7) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.AbstractC4090z0.m17127w(r3) < 0) goto L34;
         */
        /* renamed from: Q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m16618Q() {
            /*
                r9 = this;
                long r0 = r9.f13434k
                long r2 = r9.f13433j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.AbstractC4090z0.m17127w(r0)
                if (r4 < 0) goto L16
                r9.f13434k = r2
                return r4
            L16:
                long r5 = r9.f13433j
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.AbstractC4090z0.m17127w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.AbstractC4090z0.m17127w(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.AbstractC4090z0.m17127w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.AbstractC4090z0.m17127w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.AbstractC4090z0.m17127w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.AbstractC4090z0.m17127w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.AbstractC4090z0.m17127w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.AbstractC4090z0.m17127w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.AbstractC4090z0.m17127w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.m16620S()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f13434k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4057j.e.m16618Q():int");
        }

        /* renamed from: R */
        public long m16619R() {
            long j7;
            long j8;
            long j9;
            int i7;
            long j10 = this.f13434k;
            if (this.f13433j != j10) {
                long j11 = 1 + j10;
                byte m17127w = AbstractC4090z0.m17127w(j10);
                if (m17127w >= 0) {
                    this.f13434k = j11;
                    return m17127w;
                }
                if (this.f13433j - j11 >= 9) {
                    long j12 = 2 + j10;
                    int m17127w2 = (AbstractC4090z0.m17127w(j11) << 7) ^ m17127w;
                    if (m17127w2 >= 0) {
                        long j13 = 3 + j10;
                        int m17127w3 = m17127w2 ^ (AbstractC4090z0.m17127w(j12) << 14);
                        if (m17127w3 >= 0) {
                            j7 = m17127w3 ^ 16256;
                            j12 = j13;
                        } else {
                            j12 = 4 + j10;
                            int m17127w4 = m17127w3 ^ (AbstractC4090z0.m17127w(j13) << 21);
                            if (m17127w4 < 0) {
                                i7 = (-2080896) ^ m17127w4;
                            } else {
                                long j14 = 5 + j10;
                                long m17127w5 = m17127w4 ^ (AbstractC4090z0.m17127w(j12) << 28);
                                if (m17127w5 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    long j15 = 6 + j10;
                                    long m17127w6 = m17127w5 ^ (AbstractC4090z0.m17127w(j14) << 35);
                                    if (m17127w6 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        j14 = 7 + j10;
                                        m17127w5 = m17127w6 ^ (AbstractC4090z0.m17127w(j15) << 42);
                                        if (m17127w5 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            j15 = 8 + j10;
                                            m17127w6 = m17127w5 ^ (AbstractC4090z0.m17127w(j14) << 49);
                                            if (m17127w6 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                long j16 = j10 + 9;
                                                long m17127w7 = (m17127w6 ^ (AbstractC4090z0.m17127w(j15) << 56)) ^ 71499008037633920L;
                                                if (m17127w7 < 0) {
                                                    long j17 = j10 + 10;
                                                    if (AbstractC4090z0.m17127w(j16) >= 0) {
                                                        j12 = j17;
                                                        j7 = m17127w7;
                                                    }
                                                } else {
                                                    j7 = m17127w7;
                                                    j12 = j16;
                                                }
                                            }
                                        }
                                    }
                                    j7 = j8 ^ m17127w6;
                                    j12 = j15;
                                }
                                j7 = j9 ^ m17127w5;
                                j12 = j14;
                            }
                        }
                        this.f13434k = j12;
                        return j7;
                    }
                    i7 = m17127w2 ^ (-128);
                    j7 = i7;
                    this.f13434k = j12;
                    return j7;
                }
            }
            return m16620S();
        }

        /* renamed from: S */
        public long m16620S() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((m16615N() & 128) == 0) {
                    return j7;
                }
            }
            throw C4017D.m16241f();
        }

        /* renamed from: V */
        public void m16621V(int i7) {
            if (i7 >= 0 && i7 <= m16610U()) {
                this.f13434k += i7;
            } else {
                if (i7 >= 0) {
                    throw C4017D.m16246m();
                }
                throw C4017D.m16242g();
            }
        }

        /* renamed from: Z */
        public final ByteBuffer m16622Z(long j7, long j8) {
            int position = this.f13430g.position();
            int limit = this.f13430g.limit();
            ByteBuffer byteBuffer = this.f13430g;
            try {
                try {
                    byteBuffer.position(m16614L(j7));
                    byteBuffer.limit(m16614L(j8));
                    return this.f13430g.slice();
                } catch (IllegalArgumentException e7) {
                    C4017D m16246m = C4017D.m16246m();
                    m16246m.initCause(e7);
                    throw m16246m;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: a */
        public void mo16543a(int i7) {
            if (this.f13437n != i7) {
                throw C4017D.m16237b();
            }
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: e */
        public int mo16545e() {
            return (int) (this.f13434k - this.f13435l);
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: f */
        public boolean mo16546f() {
            return this.f13434k == this.f13433j;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: n */
        public void mo16547n(int i7) {
            this.f13439p = i7;
            m16609T();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: o */
        public int mo16548o(int i7) {
            if (i7 < 0) {
                throw C4017D.m16242g();
            }
            int mo16545e = i7 + mo16545e();
            int i8 = this.f13439p;
            if (mo16545e > i8) {
                throw C4017D.m16246m();
            }
            this.f13439p = mo16545e;
            m16609T();
            return i8;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: p */
        public boolean mo16549p() {
            return m16619R() != 0;
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: q */
        public AbstractC4055i mo16550q() {
            int m16618Q = m16618Q();
            if (m16618Q <= 0 || m16618Q > m16610U()) {
                if (m16618Q == 0) {
                    return AbstractC4055i.f13379b;
                }
                if (m16618Q < 0) {
                    throw C4017D.m16242g();
                }
                throw C4017D.m16246m();
            }
            if (this.f13431h && this.f13438o) {
                long j7 = this.f13434k;
                long j8 = m16618Q;
                ByteBuffer m16622Z = m16622Z(j7, j7 + j8);
                this.f13434k += j8;
                return AbstractC4055i.m16492I(m16622Z);
            }
            byte[] bArr = new byte[m16618Q];
            long j9 = m16618Q;
            AbstractC4090z0.m17120p(this.f13434k, bArr, 0L, j9);
            this.f13434k += j9;
            return AbstractC4055i.m16493J(bArr);
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: r */
        public double mo16551r() {
            return Double.longBitsToDouble(m16617P());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: s */
        public int mo16552s() {
            return m16618Q();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: t */
        public int mo16553t() {
            return m16616O();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: u */
        public long mo16554u() {
            return m16617P();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: v */
        public float mo16555v() {
            return Float.intBitsToFloat(m16616O());
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: w */
        public int mo16556w() {
            return m16618Q();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: x */
        public long mo16557x() {
            return m16619R();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: y */
        public int mo16558y() {
            return m16616O();
        }

        @Override // com.google.protobuf.AbstractC4057j
        /* renamed from: z */
        public long mo16559z() {
            return m16617P();
        }

        public e(ByteBuffer byteBuffer, boolean z6) {
            super();
            this.f13439p = C3643a.e.API_PRIORITY_OTHER;
            this.f13430g = byteBuffer;
            long m17115k = AbstractC4090z0.m17115k(byteBuffer);
            this.f13432i = m17115k;
            this.f13433j = byteBuffer.limit() + m17115k;
            long position = m17115k + byteBuffer.position();
            this.f13434k = position;
            this.f13435l = position;
            this.f13431h = z6;
        }
    }

    /* renamed from: c */
    public static int m16523c(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    /* renamed from: d */
    public static long m16524d(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    /* renamed from: g */
    public static AbstractC4057j m16525g(InputStream inputStream) {
        return m16526h(inputStream, 4096);
    }

    /* renamed from: h */
    public static AbstractC4057j m16526h(InputStream inputStream, int i7) {
        if (i7 > 0) {
            return inputStream == null ? m16529k(AbstractC4015C.f13277d) : new d(inputStream, i7);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: i */
    public static AbstractC4057j m16527i(Iterable iterable, boolean z6) {
        Iterator it = iterable.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i8 += byteBuffer.remaining();
            i7 = byteBuffer.hasArray() ? i7 | 1 : byteBuffer.isDirect() ? i7 | 2 : i7 | 4;
        }
        return i7 == 2 ? new c(iterable, i8, z6) : m16525g(new C4018E(iterable));
    }

    /* renamed from: j */
    public static AbstractC4057j m16528j(ByteBuffer byteBuffer, boolean z6) {
        if (byteBuffer.hasArray()) {
            return m16531m(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z6);
        }
        if (byteBuffer.isDirect() && e.m16608M()) {
            return new e(byteBuffer, z6);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m16531m(bArr, 0, remaining, true);
    }

    /* renamed from: k */
    public static AbstractC4057j m16529k(byte[] bArr) {
        return m16530l(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static AbstractC4057j m16530l(byte[] bArr, int i7, int i8) {
        return m16531m(bArr, i7, i8, false);
    }

    /* renamed from: m */
    public static AbstractC4057j m16531m(byte[] bArr, int i7, int i8, boolean z6) {
        b bVar = new b(bArr, i7, i8, z6);
        try {
            bVar.mo16548o(i8);
            return bVar;
        } catch (C4017D e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* renamed from: A */
    public abstract int mo16532A();

    /* renamed from: B */
    public abstract long mo16533B();

    /* renamed from: C */
    public abstract String mo16534C();

    /* renamed from: D */
    public abstract String mo16535D();

    /* renamed from: E */
    public abstract int mo16536E();

    /* renamed from: F */
    public abstract int mo16537F();

    /* renamed from: G */
    public abstract long mo16538G();

    /* renamed from: H */
    public final int m16539H(int i7) {
        if (i7 >= 0) {
            int i8 = this.f13394b;
            this.f13394b = i7;
            return i8;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i7);
    }

    /* renamed from: I */
    public final int m16540I(int i7) {
        if (i7 >= 0) {
            int i8 = this.f13395c;
            this.f13395c = i7;
            return i8;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i7);
    }

    /* renamed from: J */
    public abstract boolean mo16541J(int i7);

    /* renamed from: K */
    public void m16542K() {
        int mo16536E;
        do {
            mo16536E = mo16536E();
            if (mo16536E == 0) {
                return;
            }
            m16544b();
            this.f13393a++;
            this.f13393a--;
        } while (mo16541J(mo16536E));
    }

    /* renamed from: a */
    public abstract void mo16543a(int i7);

    /* renamed from: b */
    public void m16544b() {
        if (this.f13393a >= this.f13394b) {
            throw C4017D.m16244i();
        }
    }

    /* renamed from: e */
    public abstract int mo16545e();

    /* renamed from: f */
    public abstract boolean mo16546f();

    /* renamed from: n */
    public abstract void mo16547n(int i7);

    /* renamed from: o */
    public abstract int mo16548o(int i7);

    /* renamed from: p */
    public abstract boolean mo16549p();

    /* renamed from: q */
    public abstract AbstractC4055i mo16550q();

    /* renamed from: r */
    public abstract double mo16551r();

    /* renamed from: s */
    public abstract int mo16552s();

    /* renamed from: t */
    public abstract int mo16553t();

    /* renamed from: u */
    public abstract long mo16554u();

    /* renamed from: v */
    public abstract float mo16555v();

    /* renamed from: w */
    public abstract int mo16556w();

    /* renamed from: x */
    public abstract long mo16557x();

    /* renamed from: y */
    public abstract int mo16558y();

    /* renamed from: z */
    public abstract long mo16559z();

    public AbstractC4057j() {
        this.f13394b = f13392f;
        this.f13395c = C3643a.e.API_PRIORITY_OTHER;
        this.f13397e = false;
    }
}
