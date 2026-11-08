package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.C3643a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;

/* renamed from: androidx.datastore.preferences.protobuf.g */
/* loaded from: classes.dex */
public abstract class AbstractC3292g {

    /* renamed from: f */
    public static volatile int f10460f = 100;

    /* renamed from: a */
    public int f10461a;

    /* renamed from: b */
    public int f10462b;

    /* renamed from: c */
    public int f10463c;

    /* renamed from: d */
    public C3294h f10464d;

    /* renamed from: e */
    public boolean f10465e;

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    public static final class b extends AbstractC3292g {

        /* renamed from: g */
        public final byte[] f10466g;

        /* renamed from: h */
        public final boolean f10467h;

        /* renamed from: i */
        public int f10468i;

        /* renamed from: j */
        public int f10469j;

        /* renamed from: k */
        public int f10470k;

        /* renamed from: l */
        public int f10471l;

        /* renamed from: m */
        public int f10472m;

        /* renamed from: n */
        public boolean f10473n;

        /* renamed from: o */
        public int f10474o;

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: A */
        public String mo12386A() {
            int m12416L = m12416L();
            if (m12416L > 0) {
                int i7 = this.f10468i;
                int i8 = this.f10470k;
                if (m12416L <= i7 - i8) {
                    String str = new String(this.f10466g, i8, m12416L, AbstractC3312u.f10663b);
                    this.f10470k += m12416L;
                    return str;
                }
            }
            if (m12416L == 0) {
                return StringUtils.EMPTY;
            }
            if (m12416L < 0) {
                throw C3313v.m12847g();
            }
            throw C3313v.m12851m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: B */
        public String mo12387B() {
            int m12416L = m12416L();
            if (m12416L > 0) {
                int i7 = this.f10468i;
                int i8 = this.f10470k;
                if (m12416L <= i7 - i8) {
                    String m12720a = AbstractC3299j0.m12720a(this.f10466g, i8, m12416L);
                    this.f10470k += m12416L;
                    return m12720a;
                }
            }
            if (m12416L == 0) {
                return StringUtils.EMPTY;
            }
            if (m12416L <= 0) {
                throw C3313v.m12847g();
            }
            throw C3313v.m12851m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: C */
        public int mo12388C() {
            if (mo12396f()) {
                this.f10472m = 0;
                return 0;
            }
            int m12416L = m12416L();
            this.f10472m = m12416L;
            if (AbstractC3301k0.m12745a(m12416L) != 0) {
                return this.f10472m;
            }
            throw C3313v.m12843c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: D */
        public int mo12389D() {
            return m12416L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: E */
        public long mo12390E() {
            return m12417M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: F */
        public boolean mo12391F(int i7) {
            int m12746b = AbstractC3301k0.m12746b(i7);
            if (m12746b == 0) {
                m12421Q();
                return true;
            }
            if (m12746b == 1) {
                m12420P(8);
                return true;
            }
            if (m12746b == 2) {
                m12420P(m12416L());
                return true;
            }
            if (m12746b == 3) {
                m12392G();
                mo12393a(AbstractC3301k0.m12747c(AbstractC3301k0.m12745a(i7), 4));
                return true;
            }
            if (m12746b == 4) {
                return false;
            }
            if (m12746b != 5) {
                throw C3313v.m12845e();
            }
            m12420P(4);
            return true;
        }

        /* renamed from: H */
        public byte m12412H() {
            int i7 = this.f10470k;
            if (i7 == this.f10468i) {
                throw C3313v.m12851m();
            }
            byte[] bArr = this.f10466g;
            this.f10470k = i7 + 1;
            return bArr[i7];
        }

        /* renamed from: I */
        public byte[] m12413I(int i7) {
            if (i7 > 0) {
                int i8 = this.f10468i;
                int i9 = this.f10470k;
                if (i7 <= i8 - i9) {
                    int i10 = i7 + i9;
                    this.f10470k = i10;
                    return Arrays.copyOfRange(this.f10466g, i9, i10);
                }
            }
            if (i7 > 0) {
                throw C3313v.m12851m();
            }
            if (i7 == 0) {
                return AbstractC3312u.f10665d;
            }
            throw C3313v.m12847g();
        }

        /* renamed from: J */
        public int m12414J() {
            int i7 = this.f10470k;
            if (this.f10468i - i7 < 4) {
                throw C3313v.m12851m();
            }
            byte[] bArr = this.f10466g;
            this.f10470k = i7 + 4;
            return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
        }

        /* renamed from: K */
        public long m12415K() {
            int i7 = this.f10470k;
            if (this.f10468i - i7 < 8) {
                throw C3313v.m12851m();
            }
            byte[] bArr = this.f10466g;
            this.f10470k = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }

        /* renamed from: L */
        public int m12416L() {
            int i7;
            int i8 = this.f10470k;
            int i9 = this.f10468i;
            if (i9 != i8) {
                byte[] bArr = this.f10466g;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f10470k = i10;
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
                    this.f10470k = i11;
                    return i7;
                }
            }
            return (int) m12418N();
        }

        /* renamed from: M */
        public long m12417M() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f10470k;
            int i8 = this.f10468i;
            if (i8 != i7) {
                byte[] bArr = this.f10466g;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f10470k = i9;
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
                    this.f10470k = i10;
                    return j7;
                }
            }
            return m12418N();
        }

        /* renamed from: N */
        public long m12418N() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((m12412H() & 128) == 0) {
                    return j7;
                }
            }
            throw C3313v.m12846f();
        }

        /* renamed from: O */
        public final void m12419O() {
            int i7 = this.f10468i + this.f10469j;
            this.f10468i = i7;
            int i8 = i7 - this.f10471l;
            int i9 = this.f10474o;
            if (i8 <= i9) {
                this.f10469j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f10469j = i10;
            this.f10468i = i7 - i10;
        }

        /* renamed from: P */
        public void m12420P(int i7) {
            if (i7 >= 0) {
                int i8 = this.f10468i;
                int i9 = this.f10470k;
                if (i7 <= i8 - i9) {
                    this.f10470k = i9 + i7;
                    return;
                }
            }
            if (i7 >= 0) {
                throw C3313v.m12851m();
            }
            throw C3313v.m12847g();
        }

        /* renamed from: Q */
        public final void m12421Q() {
            if (this.f10468i - this.f10470k >= 10) {
                m12422R();
            } else {
                m12423S();
            }
        }

        /* renamed from: R */
        public final void m12422R() {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f10466g;
                int i8 = this.f10470k;
                this.f10470k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C3313v.m12846f();
        }

        /* renamed from: S */
        public final void m12423S() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m12412H() >= 0) {
                    return;
                }
            }
            throw C3313v.m12846f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: a */
        public void mo12393a(int i7) {
            if (this.f10472m != i7) {
                throw C3313v.m12842b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: e */
        public int mo12395e() {
            return this.f10470k - this.f10471l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: f */
        public boolean mo12396f() {
            return this.f10470k == this.f10468i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: l */
        public void mo12397l(int i7) {
            this.f10474o = i7;
            m12419O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: m */
        public int mo12398m(int i7) {
            if (i7 < 0) {
                throw C3313v.m12847g();
            }
            int mo12395e = i7 + mo12395e();
            if (mo12395e < 0) {
                throw C3313v.m12848h();
            }
            int i8 = this.f10474o;
            if (mo12395e > i8) {
                throw C3313v.m12851m();
            }
            this.f10474o = mo12395e;
            m12419O();
            return i8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: n */
        public boolean mo12399n() {
            return m12417M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: o */
        public AbstractC3290f mo12400o() {
            int m12416L = m12416L();
            if (m12416L > 0) {
                int i7 = this.f10468i;
                int i8 = this.f10470k;
                if (m12416L <= i7 - i8) {
                    AbstractC3290f m12342u = (this.f10467h && this.f10473n) ? AbstractC3290f.m12342u(this.f10466g, i8, m12416L) : AbstractC3290f.m12338h(this.f10466g, i8, m12416L);
                    this.f10470k += m12416L;
                    return m12342u;
                }
            }
            return m12416L == 0 ? AbstractC3290f.f10449b : AbstractC3290f.m12341t(m12413I(m12416L));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: p */
        public double mo12401p() {
            return Double.longBitsToDouble(m12415K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: q */
        public int mo12402q() {
            return m12416L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: r */
        public int mo12403r() {
            return m12414J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: s */
        public long mo12404s() {
            return m12415K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: t */
        public float mo12405t() {
            return Float.intBitsToFloat(m12414J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: u */
        public int mo12406u() {
            return m12416L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: v */
        public long mo12407v() {
            return m12417M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: w */
        public int mo12408w() {
            return m12414J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: x */
        public long mo12409x() {
            return m12415K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: y */
        public int mo12410y() {
            return AbstractC3292g.m12379c(m12416L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: z */
        public long mo12411z() {
            return AbstractC3292g.m12380d(m12417M());
        }

        public b(byte[] bArr, int i7, int i8, boolean z6) {
            super();
            this.f10474o = C3643a.e.API_PRIORITY_OTHER;
            this.f10466g = bArr;
            this.f10468i = i8 + i7;
            this.f10470k = i7;
            this.f10471l = i7;
            this.f10467h = z6;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static final class c extends AbstractC3292g {

        /* renamed from: g */
        public final InputStream f10475g;

        /* renamed from: h */
        public final byte[] f10476h;

        /* renamed from: i */
        public int f10477i;

        /* renamed from: j */
        public int f10478j;

        /* renamed from: k */
        public int f10479k;

        /* renamed from: l */
        public int f10480l;

        /* renamed from: m */
        public int f10481m;

        /* renamed from: n */
        public int f10482n;

        /* renamed from: H */
        public static int m12424H(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (C3313v e7) {
                e7.m12853j();
                throw e7;
            }
        }

        /* renamed from: I */
        public static int m12425I(InputStream inputStream, byte[] bArr, int i7, int i8) {
            try {
                return inputStream.read(bArr, i7, i8);
            } catch (C3313v e7) {
                e7.m12853j();
                throw e7;
            }
        }

        /* renamed from: T */
        private void m12426T() {
            int i7 = this.f10477i + this.f10478j;
            this.f10477i = i7;
            int i8 = this.f10481m + i7;
            int i9 = this.f10482n;
            if (i8 <= i9) {
                this.f10478j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f10478j = i10;
            this.f10477i = i7 - i10;
        }

        /* renamed from: V */
        public static long m12427V(InputStream inputStream, long j7) {
            try {
                return inputStream.skip(j7);
            } catch (C3313v e7) {
                e7.m12853j();
                throw e7;
            }
        }

        /* renamed from: Y */
        private void m12428Y() {
            if (this.f10477i - this.f10479k >= 10) {
                m12429Z();
            } else {
                m12430a0();
            }
        }

        /* renamed from: Z */
        private void m12429Z() {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f10476h;
                int i8 = this.f10479k;
                this.f10479k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C3313v.m12846f();
        }

        /* renamed from: a0 */
        private void m12430a0() {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m12432K() >= 0) {
                    return;
                }
            }
            throw C3313v.m12846f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: A */
        public String mo12386A() {
            int m12438Q = m12438Q();
            if (m12438Q > 0) {
                int i7 = this.f10477i;
                int i8 = this.f10479k;
                if (m12438Q <= i7 - i8) {
                    String str = new String(this.f10476h, i8, m12438Q, AbstractC3312u.f10663b);
                    this.f10479k += m12438Q;
                    return str;
                }
            }
            if (m12438Q == 0) {
                return StringUtils.EMPTY;
            }
            if (m12438Q < 0) {
                throw C3313v.m12847g();
            }
            if (m12438Q > this.f10477i) {
                return new String(m12433L(m12438Q, false), AbstractC3312u.f10663b);
            }
            m12441U(m12438Q);
            String str2 = new String(this.f10476h, this.f10479k, m12438Q, AbstractC3312u.f10663b);
            this.f10479k += m12438Q;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: B */
        public String mo12387B() {
            byte[] m12433L;
            int m12438Q = m12438Q();
            int i7 = this.f10479k;
            int i8 = this.f10477i;
            if (m12438Q <= i8 - i7 && m12438Q > 0) {
                m12433L = this.f10476h;
                this.f10479k = i7 + m12438Q;
            } else {
                if (m12438Q == 0) {
                    return StringUtils.EMPTY;
                }
                if (m12438Q < 0) {
                    throw C3313v.m12847g();
                }
                i7 = 0;
                if (m12438Q <= i8) {
                    m12441U(m12438Q);
                    m12433L = this.f10476h;
                    this.f10479k = m12438Q;
                } else {
                    m12433L = m12433L(m12438Q, false);
                }
            }
            return AbstractC3299j0.m12720a(m12433L, i7, m12438Q);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: C */
        public int mo12388C() {
            if (mo12396f()) {
                this.f10480l = 0;
                return 0;
            }
            int m12438Q = m12438Q();
            this.f10480l = m12438Q;
            if (AbstractC3301k0.m12745a(m12438Q) != 0) {
                return this.f10480l;
            }
            throw C3313v.m12843c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: D */
        public int mo12389D() {
            return m12438Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: E */
        public long mo12390E() {
            return m12439R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: F */
        public boolean mo12391F(int i7) {
            int m12746b = AbstractC3301k0.m12746b(i7);
            if (m12746b == 0) {
                m12428Y();
                return true;
            }
            if (m12746b == 1) {
                m12442W(8);
                return true;
            }
            if (m12746b == 2) {
                m12442W(m12438Q());
                return true;
            }
            if (m12746b == 3) {
                m12392G();
                mo12393a(AbstractC3301k0.m12747c(AbstractC3301k0.m12745a(i7), 4));
                return true;
            }
            if (m12746b == 4) {
                return false;
            }
            if (m12746b != 5) {
                throw C3313v.m12845e();
            }
            m12442W(4);
            return true;
        }

        /* renamed from: J */
        public final AbstractC3290f m12431J(int i7) {
            byte[] m12434M = m12434M(i7);
            if (m12434M != null) {
                return AbstractC3290f.m12337g(m12434M);
            }
            int i8 = this.f10479k;
            int i9 = this.f10477i;
            int i10 = i9 - i8;
            this.f10481m += i9;
            this.f10479k = 0;
            this.f10477i = 0;
            List<byte[]> m12435N = m12435N(i7 - i10);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f10476h, i8, bArr, 0, i10);
            for (byte[] bArr2 : m12435N) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return AbstractC3290f.m12341t(bArr);
        }

        /* renamed from: K */
        public byte m12432K() {
            if (this.f10479k == this.f10477i) {
                m12441U(1);
            }
            byte[] bArr = this.f10476h;
            int i7 = this.f10479k;
            this.f10479k = i7 + 1;
            return bArr[i7];
        }

        /* renamed from: L */
        public final byte[] m12433L(int i7, boolean z6) {
            byte[] m12434M = m12434M(i7);
            if (m12434M != null) {
                return z6 ? (byte[]) m12434M.clone() : m12434M;
            }
            int i8 = this.f10479k;
            int i9 = this.f10477i;
            int i10 = i9 - i8;
            this.f10481m += i9;
            this.f10479k = 0;
            this.f10477i = 0;
            List<byte[]> m12435N = m12435N(i7 - i10);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f10476h, i8, bArr, 0, i10);
            for (byte[] bArr2 : m12435N) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: M */
        public final byte[] m12434M(int i7) {
            if (i7 == 0) {
                return AbstractC3312u.f10665d;
            }
            if (i7 < 0) {
                throw C3313v.m12847g();
            }
            int i8 = this.f10481m;
            int i9 = this.f10479k;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f10463c > 0) {
                throw C3313v.m12850l();
            }
            int i11 = this.f10482n;
            if (i10 > i11) {
                m12442W((i11 - i8) - i9);
                throw C3313v.m12851m();
            }
            int i12 = this.f10477i - i9;
            int i13 = i7 - i12;
            if (i13 >= 4096 && i13 > m12424H(this.f10475g)) {
                return null;
            }
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f10476h, this.f10479k, bArr, 0, i12);
            this.f10481m += this.f10477i;
            this.f10479k = 0;
            this.f10477i = 0;
            while (i12 < i7) {
                int m12425I = m12425I(this.f10475g, bArr, i12, i7 - i12);
                if (m12425I == -1) {
                    throw C3313v.m12851m();
                }
                this.f10481m += m12425I;
                i12 += m12425I;
            }
            return bArr;
        }

        /* renamed from: N */
        public final List m12435N(int i7) {
            ArrayList arrayList = new ArrayList();
            while (i7 > 0) {
                int min = Math.min(i7, 4096);
                byte[] bArr = new byte[min];
                int i8 = 0;
                while (i8 < min) {
                    int read = this.f10475g.read(bArr, i8, min - i8);
                    if (read == -1) {
                        throw C3313v.m12851m();
                    }
                    this.f10481m += read;
                    i8 += read;
                }
                i7 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: O */
        public int m12436O() {
            int i7 = this.f10479k;
            if (this.f10477i - i7 < 4) {
                m12441U(4);
                i7 = this.f10479k;
            }
            byte[] bArr = this.f10476h;
            this.f10479k = i7 + 4;
            return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
        }

        /* renamed from: P */
        public long m12437P() {
            int i7 = this.f10479k;
            if (this.f10477i - i7 < 8) {
                m12441U(8);
                i7 = this.f10479k;
            }
            byte[] bArr = this.f10476h;
            this.f10479k = i7 + 8;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }

        /* renamed from: Q */
        public int m12438Q() {
            int i7;
            int i8 = this.f10479k;
            int i9 = this.f10477i;
            if (i9 != i8) {
                byte[] bArr = this.f10476h;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f10479k = i10;
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
                    this.f10479k = i11;
                    return i7;
                }
            }
            return (int) m12440S();
        }

        /* renamed from: R */
        public long m12439R() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f10479k;
            int i8 = this.f10477i;
            if (i8 != i7) {
                byte[] bArr = this.f10476h;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f10479k = i9;
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
                    this.f10479k = i10;
                    return j7;
                }
            }
            return m12440S();
        }

        /* renamed from: S */
        public long m12440S() {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                j7 |= (r3 & Byte.MAX_VALUE) << i7;
                if ((m12432K() & 128) == 0) {
                    return j7;
                }
            }
            throw C3313v.m12846f();
        }

        /* renamed from: U */
        public final void m12441U(int i7) {
            if (m12444b0(i7)) {
                return;
            }
            if (i7 <= (this.f10463c - this.f10481m) - this.f10479k) {
                throw C3313v.m12851m();
            }
            throw C3313v.m12850l();
        }

        /* renamed from: W */
        public void m12442W(int i7) {
            int i8 = this.f10477i;
            int i9 = this.f10479k;
            if (i7 > i8 - i9 || i7 < 0) {
                m12443X(i7);
            } else {
                this.f10479k = i9 + i7;
            }
        }

        /* renamed from: X */
        public final void m12443X(int i7) {
            if (i7 < 0) {
                throw C3313v.m12847g();
            }
            int i8 = this.f10481m;
            int i9 = this.f10479k;
            int i10 = i8 + i9 + i7;
            int i11 = this.f10482n;
            if (i10 > i11) {
                m12442W((i11 - i8) - i9);
                throw C3313v.m12851m();
            }
            this.f10481m = i8 + i9;
            int i12 = this.f10477i - i9;
            this.f10477i = 0;
            this.f10479k = 0;
            while (i12 < i7) {
                try {
                    long j7 = i7 - i12;
                    long m12427V = m12427V(this.f10475g, j7);
                    if (m12427V < 0 || m12427V > j7) {
                        throw new IllegalStateException(this.f10475g.getClass() + "#skip returned invalid result: " + m12427V + "\nThe InputStream implementation is buggy.");
                    }
                    if (m12427V == 0) {
                        break;
                    } else {
                        i12 += (int) m12427V;
                    }
                } finally {
                    this.f10481m += i12;
                    m12426T();
                }
            }
            if (i12 >= i7) {
                return;
            }
            int i13 = this.f10477i;
            int i14 = i13 - this.f10479k;
            this.f10479k = i13;
            m12441U(1);
            while (true) {
                int i15 = i7 - i14;
                int i16 = this.f10477i;
                if (i15 <= i16) {
                    this.f10479k = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f10479k = i16;
                    m12441U(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: a */
        public void mo12393a(int i7) {
            if (this.f10480l != i7) {
                throw C3313v.m12842b();
            }
        }

        /* renamed from: b0 */
        public final boolean m12444b0(int i7) {
            int i8 = this.f10479k;
            int i9 = i8 + i7;
            int i10 = this.f10477i;
            if (i9 <= i10) {
                throw new IllegalStateException("refillBuffer() called when " + i7 + " bytes were already available in buffer");
            }
            int i11 = this.f10463c;
            int i12 = this.f10481m;
            if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.f10482n) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.f10476h;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f10481m += i8;
                this.f10477i -= i8;
                this.f10479k = 0;
            }
            InputStream inputStream = this.f10475g;
            byte[] bArr2 = this.f10476h;
            int i13 = this.f10477i;
            int m12425I = m12425I(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.f10463c - this.f10481m) - i13));
            if (m12425I == 0 || m12425I < -1 || m12425I > this.f10476h.length) {
                throw new IllegalStateException(this.f10475g.getClass() + "#read(byte[]) returned invalid result: " + m12425I + "\nThe InputStream implementation is buggy.");
            }
            if (m12425I <= 0) {
                return false;
            }
            this.f10477i += m12425I;
            m12426T();
            if (this.f10477i >= i7) {
                return true;
            }
            return m12444b0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: e */
        public int mo12395e() {
            return this.f10481m + this.f10479k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: f */
        public boolean mo12396f() {
            return this.f10479k == this.f10477i && !m12444b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: l */
        public void mo12397l(int i7) {
            this.f10482n = i7;
            m12426T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: m */
        public int mo12398m(int i7) {
            if (i7 < 0) {
                throw C3313v.m12847g();
            }
            int i8 = i7 + this.f10481m + this.f10479k;
            if (i8 < 0) {
                throw C3313v.m12848h();
            }
            int i9 = this.f10482n;
            if (i8 > i9) {
                throw C3313v.m12851m();
            }
            this.f10482n = i8;
            m12426T();
            return i9;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: n */
        public boolean mo12399n() {
            return m12439R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: o */
        public AbstractC3290f mo12400o() {
            int m12438Q = m12438Q();
            int i7 = this.f10477i;
            int i8 = this.f10479k;
            if (m12438Q <= i7 - i8 && m12438Q > 0) {
                AbstractC3290f m12338h = AbstractC3290f.m12338h(this.f10476h, i8, m12438Q);
                this.f10479k += m12438Q;
                return m12338h;
            }
            if (m12438Q == 0) {
                return AbstractC3290f.f10449b;
            }
            if (m12438Q >= 0) {
                return m12431J(m12438Q);
            }
            throw C3313v.m12847g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: p */
        public double mo12401p() {
            return Double.longBitsToDouble(m12437P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: q */
        public int mo12402q() {
            return m12438Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: r */
        public int mo12403r() {
            return m12436O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: s */
        public long mo12404s() {
            return m12437P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: t */
        public float mo12405t() {
            return Float.intBitsToFloat(m12436O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: u */
        public int mo12406u() {
            return m12438Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: v */
        public long mo12407v() {
            return m12439R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: w */
        public int mo12408w() {
            return m12436O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: x */
        public long mo12409x() {
            return m12437P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: y */
        public int mo12410y() {
            return AbstractC3292g.m12379c(m12438Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3292g
        /* renamed from: z */
        public long mo12411z() {
            return AbstractC3292g.m12380d(m12439R());
        }

        public c(InputStream inputStream, int i7) {
            super();
            this.f10482n = C3643a.e.API_PRIORITY_OTHER;
            AbstractC3312u.m12835b(inputStream, "input");
            this.f10475g = inputStream;
            this.f10476h = new byte[i7];
            this.f10477i = 0;
            this.f10479k = 0;
            this.f10481m = 0;
        }
    }

    /* renamed from: c */
    public static int m12379c(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    /* renamed from: d */
    public static long m12380d(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    /* renamed from: g */
    public static AbstractC3292g m12381g(InputStream inputStream) {
        return m12382h(inputStream, 4096);
    }

    /* renamed from: h */
    public static AbstractC3292g m12382h(InputStream inputStream, int i7) {
        if (i7 > 0) {
            return inputStream == null ? m12383i(AbstractC3312u.f10665d) : new c(inputStream, i7);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: i */
    public static AbstractC3292g m12383i(byte[] bArr) {
        return m12384j(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public static AbstractC3292g m12384j(byte[] bArr, int i7, int i8) {
        return m12385k(bArr, i7, i8, false);
    }

    /* renamed from: k */
    public static AbstractC3292g m12385k(byte[] bArr, int i7, int i8, boolean z6) {
        b bVar = new b(bArr, i7, i8, z6);
        try {
            bVar.mo12398m(i8);
            return bVar;
        } catch (C3313v e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* renamed from: A */
    public abstract String mo12386A();

    /* renamed from: B */
    public abstract String mo12387B();

    /* renamed from: C */
    public abstract int mo12388C();

    /* renamed from: D */
    public abstract int mo12389D();

    /* renamed from: E */
    public abstract long mo12390E();

    /* renamed from: F */
    public abstract boolean mo12391F(int i7);

    /* renamed from: G */
    public void m12392G() {
        int mo12388C;
        do {
            mo12388C = mo12388C();
            if (mo12388C == 0) {
                return;
            }
            m12394b();
            this.f10461a++;
            this.f10461a--;
        } while (mo12391F(mo12388C));
    }

    /* renamed from: a */
    public abstract void mo12393a(int i7);

    /* renamed from: b */
    public void m12394b() {
        if (this.f10461a >= this.f10462b) {
            throw C3313v.m12849i();
        }
    }

    /* renamed from: e */
    public abstract int mo12395e();

    /* renamed from: f */
    public abstract boolean mo12396f();

    /* renamed from: l */
    public abstract void mo12397l(int i7);

    /* renamed from: m */
    public abstract int mo12398m(int i7);

    /* renamed from: n */
    public abstract boolean mo12399n();

    /* renamed from: o */
    public abstract AbstractC3290f mo12400o();

    /* renamed from: p */
    public abstract double mo12401p();

    /* renamed from: q */
    public abstract int mo12402q();

    /* renamed from: r */
    public abstract int mo12403r();

    /* renamed from: s */
    public abstract long mo12404s();

    /* renamed from: t */
    public abstract float mo12405t();

    /* renamed from: u */
    public abstract int mo12406u();

    /* renamed from: v */
    public abstract long mo12407v();

    /* renamed from: w */
    public abstract int mo12408w();

    /* renamed from: x */
    public abstract long mo12409x();

    /* renamed from: y */
    public abstract int mo12410y();

    /* renamed from: z */
    public abstract long mo12411z();

    public AbstractC3292g() {
        this.f10462b = f10460f;
        this.f10463c = C3643a.e.API_PRIORITY_OTHER;
        this.f10465e = false;
    }
}
