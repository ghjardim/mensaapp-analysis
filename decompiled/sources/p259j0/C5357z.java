package p259j0;

import java.nio.charset.Charset;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2922e;
import p178Z2.AbstractC3037z;
import p203c3.AbstractC3573c;
import p203c3.AbstractC3580j;

/* renamed from: j0.z */
/* loaded from: classes.dex */
public final class C5357z {

    /* renamed from: d */
    public static final char[] f18884d = {'\r', '\n'};

    /* renamed from: e */
    public static final char[] f18885e = {'\n'};

    /* renamed from: f */
    public static final AbstractC3037z f18886f = AbstractC3037z.m11112x(AbstractC2922e.f9008a, AbstractC2922e.f9010c, AbstractC2922e.f9013f, AbstractC2922e.f9011d, AbstractC2922e.f9012e);

    /* renamed from: a */
    public byte[] f18887a;

    /* renamed from: b */
    public int f18888b;

    /* renamed from: c */
    public int f18889c;

    public C5357z() {
        this.f18887a = AbstractC5330M.f18805f;
    }

    /* renamed from: A */
    public String m21920A() {
        return m21955n((char) 0);
    }

    /* renamed from: B */
    public String m21921B(int i7) {
        if (i7 == 0) {
            return StringUtils.EMPTY;
        }
        int i8 = this.f18888b;
        int i9 = (i8 + i7) - 1;
        String m21689J = AbstractC5330M.m21689J(this.f18887a, i8, (i9 >= this.f18889c || this.f18887a[i9] != 0) ? i7 : i7 - 1);
        this.f18888b += i7;
        return m21689J;
    }

    /* renamed from: C */
    public short m21922C() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = (bArr[i7] & ForkServer.ERROR) << 8;
        this.f18888b = i7 + 2;
        return (short) ((bArr[i8] & ForkServer.ERROR) | i9);
    }

    /* renamed from: D */
    public String m21923D(int i7) {
        return m21924E(i7, AbstractC2922e.f9010c);
    }

    /* renamed from: E */
    public String m21924E(int i7, Charset charset) {
        String str = new String(this.f18887a, this.f18888b, i7, charset);
        this.f18888b += i7;
        return str;
    }

    /* renamed from: F */
    public int m21925F() {
        return (m21926G() << 21) | (m21926G() << 14) | (m21926G() << 7) | m21926G();
    }

    /* renamed from: G */
    public int m21926G() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        this.f18888b = i7 + 1;
        return bArr[i7] & ForkServer.ERROR;
    }

    /* renamed from: H */
    public int m21927H() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = (bArr[i7] & ForkServer.ERROR) << 8;
        this.f18888b = i7 + 2;
        int i10 = (bArr[i8] & ForkServer.ERROR) | i9;
        this.f18888b = i7 + 4;
        return i10;
    }

    /* renamed from: I */
    public long m21928I() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        this.f18888b = i7 + 1;
        this.f18888b = i7 + 2;
        this.f18888b = i7 + 3;
        long j7 = ((bArr[i7] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f18888b = i7 + 4;
        return (bArr[r4] & 255) | j7;
    }

    /* renamed from: J */
    public int m21929J() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = (bArr[i7] & ForkServer.ERROR) << 16;
        int i10 = i7 + 2;
        this.f18888b = i10;
        int i11 = ((bArr[i8] & ForkServer.ERROR) << 8) | i9;
        this.f18888b = i7 + 3;
        return (bArr[i10] & ForkServer.ERROR) | i11;
    }

    /* renamed from: K */
    public int m21930K() {
        int m21957p = m21957p();
        if (m21957p >= 0) {
            return m21957p;
        }
        throw new IllegalStateException("Top bit not zero: " + m21957p);
    }

    /* renamed from: L */
    public long m21931L() {
        long m21967z = m21967z();
        if (m21967z >= 0) {
            return m21967z;
        }
        throw new IllegalStateException("Top bit not zero: " + m21967z);
    }

    /* renamed from: M */
    public int m21932M() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = (bArr[i7] & ForkServer.ERROR) << 8;
        this.f18888b = i7 + 2;
        return (bArr[i8] & ForkServer.ERROR) | i9;
    }

    /* renamed from: N */
    public long m21933N() {
        int i7;
        int i8;
        long j7 = this.f18887a[this.f18888b];
        int i9 = 7;
        while (true) {
            if (i9 < 0) {
                break;
            }
            if (((1 << i9) & j7) != 0) {
                i9--;
            } else if (i9 < 6) {
                j7 &= r6 - 1;
                i8 = 7 - i9;
            } else if (i9 == 7) {
                i8 = 1;
            }
        }
        i8 = 0;
        if (i8 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j7);
        }
        for (i7 = 1; i7 < i8; i7++) {
            if ((this.f18887a[this.f18888b + i7] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j7);
            }
            j7 = (j7 << 6) | (r3 & 63);
        }
        this.f18888b += i8;
        return j7;
    }

    /* renamed from: O */
    public Charset m21934O() {
        if (m21942a() >= 3) {
            byte[] bArr = this.f18887a;
            int i7 = this.f18888b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f18888b = i7 + 3;
                return AbstractC2922e.f9010c;
            }
        }
        if (m21942a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f18887a;
        int i8 = this.f18888b;
        byte b7 = bArr2[i8];
        if (b7 == -2 && bArr2[i8 + 1] == -1) {
            this.f18888b = i8 + 2;
            return AbstractC2922e.f9011d;
        }
        if (b7 != -1 || bArr2[i8 + 1] != -2) {
            return null;
        }
        this.f18888b = i8 + 2;
        return AbstractC2922e.f9012e;
    }

    /* renamed from: P */
    public void m21935P(int i7) {
        m21937R(m21943b() < i7 ? new byte[i7] : this.f18887a, i7);
    }

    /* renamed from: Q */
    public void m21936Q(byte[] bArr) {
        m21937R(bArr, bArr.length);
    }

    /* renamed from: R */
    public void m21937R(byte[] bArr, int i7) {
        this.f18887a = bArr;
        this.f18889c = i7;
        this.f18888b = 0;
    }

    /* renamed from: S */
    public void m21938S(int i7) {
        AbstractC5332a.m21796a(i7 >= 0 && i7 <= this.f18887a.length);
        this.f18889c = i7;
    }

    /* renamed from: T */
    public void m21939T(int i7) {
        AbstractC5332a.m21796a(i7 >= 0 && i7 <= this.f18889c);
        this.f18888b = i7;
    }

    /* renamed from: U */
    public void m21940U(int i7) {
        m21939T(this.f18888b + i7);
    }

    /* renamed from: V */
    public final void m21941V(Charset charset) {
        if (m21954m(charset, f18884d) == '\r') {
            m21954m(charset, f18885e);
        }
    }

    /* renamed from: a */
    public int m21942a() {
        return this.f18889c - this.f18888b;
    }

    /* renamed from: b */
    public int m21943b() {
        return this.f18887a.length;
    }

    /* renamed from: c */
    public void m21944c(int i7) {
        if (i7 > m21943b()) {
            this.f18887a = Arrays.copyOf(this.f18887a, i7);
        }
    }

    /* renamed from: d */
    public final int m21945d(Charset charset) {
        int i7;
        if (charset.equals(AbstractC2922e.f9010c) || charset.equals(AbstractC2922e.f9008a)) {
            i7 = 1;
        } else {
            if (!charset.equals(AbstractC2922e.f9013f) && !charset.equals(AbstractC2922e.f9012e) && !charset.equals(AbstractC2922e.f9011d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i7 = 2;
        }
        int i8 = this.f18888b;
        while (true) {
            int i9 = this.f18889c;
            if (i8 >= i9 - (i7 - 1)) {
                return i9;
            }
            if ((charset.equals(AbstractC2922e.f9010c) || charset.equals(AbstractC2922e.f9008a)) && AbstractC5330M.m21678D0(this.f18887a[i8])) {
                return i8;
            }
            if (charset.equals(AbstractC2922e.f9013f) || charset.equals(AbstractC2922e.f9011d)) {
                byte[] bArr = this.f18887a;
                if (bArr[i8] == 0 && AbstractC5330M.m21678D0(bArr[i8 + 1])) {
                    return i8;
                }
            }
            if (charset.equals(AbstractC2922e.f9012e)) {
                byte[] bArr2 = this.f18887a;
                if (bArr2[i8 + 1] == 0 && AbstractC5330M.m21678D0(bArr2[i8])) {
                    return i8;
                }
            }
            i8 += i7;
        }
    }

    /* renamed from: e */
    public byte[] m21946e() {
        return this.f18887a;
    }

    /* renamed from: f */
    public int m21947f() {
        return this.f18888b;
    }

    /* renamed from: g */
    public int m21948g() {
        return this.f18889c;
    }

    /* renamed from: h */
    public char m21949h(Charset charset) {
        AbstractC5332a.m21797b(f18886f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m21950i(charset) >> 16);
    }

    /* renamed from: i */
    public final int m21950i(Charset charset) {
        byte m14409a;
        char m14411c;
        int i7 = 1;
        if ((charset.equals(AbstractC2922e.f9010c) || charset.equals(AbstractC2922e.f9008a)) && m21942a() >= 1) {
            m14409a = (byte) AbstractC3573c.m14409a(AbstractC3580j.m14443b(this.f18887a[this.f18888b]));
        } else {
            if ((charset.equals(AbstractC2922e.f9013f) || charset.equals(AbstractC2922e.f9011d)) && m21942a() >= 2) {
                byte[] bArr = this.f18887a;
                int i8 = this.f18888b;
                m14411c = AbstractC3573c.m14411c(bArr[i8], bArr[i8 + 1]);
            } else {
                if (!charset.equals(AbstractC2922e.f9012e) || m21942a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f18887a;
                int i9 = this.f18888b;
                m14411c = AbstractC3573c.m14411c(bArr2[i9 + 1], bArr2[i9]);
            }
            m14409a = (byte) m14411c;
            i7 = 2;
        }
        return (AbstractC3573c.m14409a(m14409a) << 16) + i7;
    }

    /* renamed from: j */
    public int m21951j() {
        return this.f18887a[this.f18888b] & ForkServer.ERROR;
    }

    /* renamed from: k */
    public void m21952k(C5356y c5356y, int i7) {
        m21953l(c5356y.f18880a, 0, i7);
        c5356y.m21916p(0);
    }

    /* renamed from: l */
    public void m21953l(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f18887a, this.f18888b, bArr, i7, i8);
        this.f18888b += i8;
    }

    /* renamed from: m */
    public final char m21954m(Charset charset, char[] cArr) {
        int m21950i = m21950i(charset);
        if (m21950i == 0) {
            return (char) 0;
        }
        char c7 = (char) (m21950i >> 16);
        if (!AbstractC3573c.m14410b(cArr, c7)) {
            return (char) 0;
        }
        this.f18888b += m21950i & 65535;
        return c7;
    }

    /* renamed from: n */
    public String m21955n(char c7) {
        if (m21942a() == 0) {
            return null;
        }
        int i7 = this.f18888b;
        while (i7 < this.f18889c && this.f18887a[i7] != c7) {
            i7++;
        }
        byte[] bArr = this.f18887a;
        int i8 = this.f18888b;
        String m21689J = AbstractC5330M.m21689J(bArr, i8, i7 - i8);
        this.f18888b = i7;
        if (i7 < this.f18889c) {
            this.f18888b = i7 + 1;
        }
        return m21689J;
    }

    /* renamed from: o */
    public double m21956o() {
        return Double.longBitsToDouble(m21967z());
    }

    /* renamed from: p */
    public int m21957p() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = (bArr[i7] & ForkServer.ERROR) << 24;
        int i10 = i7 + 2;
        this.f18888b = i10;
        int i11 = ((bArr[i8] & ForkServer.ERROR) << 16) | i9;
        int i12 = i7 + 3;
        this.f18888b = i12;
        int i13 = i11 | ((bArr[i10] & ForkServer.ERROR) << 8);
        this.f18888b = i7 + 4;
        return (bArr[i12] & ForkServer.ERROR) | i13;
    }

    /* renamed from: q */
    public int m21958q() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = ((bArr[i7] & ForkServer.ERROR) << 24) >> 8;
        int i10 = i7 + 2;
        this.f18888b = i10;
        int i11 = ((bArr[i8] & ForkServer.ERROR) << 8) | i9;
        this.f18888b = i7 + 3;
        return (bArr[i10] & ForkServer.ERROR) | i11;
    }

    /* renamed from: r */
    public String m21959r() {
        return m21960s(AbstractC2922e.f9010c);
    }

    /* renamed from: s */
    public String m21960s(Charset charset) {
        AbstractC5332a.m21797b(f18886f.contains(charset), "Unsupported charset: " + charset);
        if (m21942a() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC2922e.f9008a)) {
            m21934O();
        }
        String m21924E = m21924E(m21945d(charset) - this.f18888b, charset);
        if (this.f18888b == this.f18889c) {
            return m21924E;
        }
        m21941V(charset);
        return m21924E;
    }

    /* renamed from: t */
    public int m21961t() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = bArr[i7] & ForkServer.ERROR;
        int i10 = i7 + 2;
        this.f18888b = i10;
        int i11 = ((bArr[i8] & ForkServer.ERROR) << 8) | i9;
        int i12 = i7 + 3;
        this.f18888b = i12;
        int i13 = i11 | ((bArr[i10] & ForkServer.ERROR) << 16);
        this.f18888b = i7 + 4;
        return ((bArr[i12] & ForkServer.ERROR) << 24) | i13;
    }

    /* renamed from: u */
    public long m21962u() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        this.f18888b = i7 + 1;
        this.f18888b = i7 + 2;
        this.f18888b = i7 + 3;
        long j7 = (bArr[i7] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f18888b = i7 + 4;
        long j8 = j7 | ((bArr[r8] & 255) << 24);
        this.f18888b = i7 + 5;
        long j9 = j8 | ((bArr[r7] & 255) << 32);
        this.f18888b = i7 + 6;
        long j10 = j9 | ((bArr[r8] & 255) << 40);
        this.f18888b = i7 + 7;
        long j11 = j10 | ((bArr[r7] & 255) << 48);
        this.f18888b = i7 + 8;
        return ((bArr[r8] & 255) << 56) | j11;
    }

    /* renamed from: v */
    public short m21963v() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = bArr[i7] & ForkServer.ERROR;
        this.f18888b = i7 + 2;
        return (short) (((bArr[i8] & ForkServer.ERROR) << 8) | i9);
    }

    /* renamed from: w */
    public long m21964w() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        this.f18888b = i7 + 1;
        this.f18888b = i7 + 2;
        this.f18888b = i7 + 3;
        long j7 = (bArr[i7] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f18888b = i7 + 4;
        return ((bArr[r4] & 255) << 24) | j7;
    }

    /* renamed from: x */
    public int m21965x() {
        int m21961t = m21961t();
        if (m21961t >= 0) {
            return m21961t;
        }
        throw new IllegalStateException("Top bit not zero: " + m21961t);
    }

    /* renamed from: y */
    public int m21966y() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        int i8 = i7 + 1;
        this.f18888b = i8;
        int i9 = bArr[i7] & ForkServer.ERROR;
        this.f18888b = i7 + 2;
        return ((bArr[i8] & ForkServer.ERROR) << 8) | i9;
    }

    /* renamed from: z */
    public long m21967z() {
        byte[] bArr = this.f18887a;
        int i7 = this.f18888b;
        this.f18888b = i7 + 1;
        this.f18888b = i7 + 2;
        this.f18888b = i7 + 3;
        long j7 = ((bArr[i7] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f18888b = i7 + 4;
        long j8 = j7 | ((bArr[r4] & 255) << 32);
        this.f18888b = i7 + 5;
        long j9 = j8 | ((bArr[r7] & 255) << 24);
        this.f18888b = i7 + 6;
        long j10 = j9 | ((bArr[r4] & 255) << 16);
        this.f18888b = i7 + 7;
        long j11 = j10 | ((bArr[r7] & 255) << 8);
        this.f18888b = i7 + 8;
        return (bArr[r4] & 255) | j11;
    }

    public C5357z(int i7) {
        this.f18887a = new byte[i7];
        this.f18889c = i7;
    }

    public C5357z(byte[] bArr) {
        this.f18887a = bArr;
        this.f18889c = bArr.length;
    }

    public C5357z(byte[] bArr, int i7) {
        this.f18887a = bArr;
        this.f18889c = i7;
    }
}
