package p186a3;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import p171Y2.AbstractC2932o;
import p195b3.AbstractC3524d;
import p256j$.util.Objects;

/* renamed from: a3.a */
/* loaded from: classes.dex */
public abstract class AbstractC3106a {

    /* renamed from: a */
    public static final AbstractC3106a f9590a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    public static final AbstractC3106a f9591b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    public static final AbstractC3106a f9592c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    public static final AbstractC3106a f9593d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    public static final AbstractC3106a f9594e = new b("base16()", "0123456789ABCDEF");

    /* renamed from: a3.a$a */
    public static final class a {

        /* renamed from: a */
        public final String f9595a;

        /* renamed from: b */
        public final char[] f9596b;

        /* renamed from: c */
        public final int f9597c;

        /* renamed from: d */
        public final int f9598d;

        /* renamed from: e */
        public final int f9599e;

        /* renamed from: f */
        public final int f9600f;

        /* renamed from: g */
        public final byte[] f9601g;

        /* renamed from: h */
        public final boolean[] f9602h;

        /* renamed from: i */
        public final boolean f9603i;

        public a(String str, char[] cArr) {
            this(str, cArr, m11342b(cArr), false);
        }

        /* renamed from: b */
        public static byte[] m11342b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i7 = 0; i7 < cArr.length; i7++) {
                char c7 = cArr[i7];
                boolean z6 = true;
                AbstractC2932o.m10563f(c7 < 128, "Non-ASCII character: %s", c7);
                if (bArr[c7] != -1) {
                    z6 = false;
                }
                AbstractC2932o.m10563f(z6, "Duplicate character: %s", c7);
                bArr[c7] = (byte) i7;
            }
            return bArr;
        }

        /* renamed from: c */
        public int m11343c(char c7) {
            if (c7 > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c7));
            }
            byte b7 = this.f9601g[c7];
            if (b7 != -1) {
                return b7;
            }
            if (c7 <= ' ' || c7 == 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c7));
            }
            throw new d("Unrecognized character: " + c7);
        }

        /* renamed from: d */
        public char m11344d(int i7) {
            return this.f9596b[i7];
        }

        /* renamed from: e */
        public boolean m11345e(int i7) {
            return this.f9602h[i7 % this.f9599e];
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9603i == aVar.f9603i && Arrays.equals(this.f9596b, aVar.f9596b);
        }

        /* renamed from: f */
        public boolean m11346f(char c7) {
            byte[] bArr = this.f9601g;
            return c7 < bArr.length && bArr[c7] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f9596b) + (this.f9603i ? 1231 : 1237);
        }

        public String toString() {
            return this.f9595a;
        }

        public a(String str, char[] cArr, byte[] bArr, boolean z6) {
            this.f9595a = (String) AbstractC2932o.m10572o(str);
            this.f9596b = (char[]) AbstractC2932o.m10572o(cArr);
            try {
                int m14162e = AbstractC3524d.m14162e(cArr.length, RoundingMode.UNNECESSARY);
                this.f9598d = m14162e;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(m14162e);
                int i7 = 1 << (3 - numberOfTrailingZeros);
                this.f9599e = i7;
                this.f9600f = m14162e >> numberOfTrailingZeros;
                this.f9597c = cArr.length - 1;
                this.f9601g = bArr;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 < this.f9600f; i8++) {
                    zArr[AbstractC3524d.m14159b(i8 * 8, this.f9598d, RoundingMode.CEILING)] = true;
                }
                this.f9602h = zArr;
                this.f9603i = z6;
            } catch (ArithmeticException e7) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e7);
            }
        }
    }

    /* renamed from: a3.a$b */
    public static final class b extends e {

        /* renamed from: h */
        public final char[] f9604h;

        public b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // p186a3.AbstractC3106a.e, p186a3.AbstractC3106a
        /* renamed from: d */
        public int mo11333d(byte[] bArr, CharSequence charSequence) {
            AbstractC2932o.m10572o(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < charSequence.length()) {
                bArr[i8] = (byte) ((this.f9605f.m11343c(charSequence.charAt(i7)) << 4) | this.f9605f.m11343c(charSequence.charAt(i7 + 1)));
                i7 += 2;
                i8++;
            }
            return i8;
        }

        @Override // p186a3.AbstractC3106a.e, p186a3.AbstractC3106a
        /* renamed from: g */
        public void mo11336g(Appendable appendable, byte[] bArr, int i7, int i8) {
            AbstractC2932o.m10572o(appendable);
            AbstractC2932o.m10577t(i7, i7 + i8, bArr.length);
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = bArr[i7 + i9] & ForkServer.ERROR;
                appendable.append(this.f9604h[i10]);
                appendable.append(this.f9604h[i10 | 256]);
            }
        }

        @Override // p186a3.AbstractC3106a.e
        /* renamed from: n */
        public AbstractC3106a mo11347n(a aVar, Character ch) {
            return new b(aVar);
        }

        public b(a aVar) {
            super(aVar, null);
            this.f9604h = new char[512];
            AbstractC2932o.m10561d(aVar.f9596b.length == 16);
            for (int i7 = 0; i7 < 256; i7++) {
                this.f9604h[i7] = aVar.m11344d(i7 >>> 4);
                this.f9604h[i7 | 256] = aVar.m11344d(i7 & 15);
            }
        }
    }

    /* renamed from: a3.a$c */
    public static final class c extends e {
        public c(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // p186a3.AbstractC3106a.e, p186a3.AbstractC3106a
        /* renamed from: d */
        public int mo11333d(byte[] bArr, CharSequence charSequence) {
            AbstractC2932o.m10572o(bArr);
            CharSequence mo11340l = mo11340l(charSequence);
            if (!this.f9605f.m11345e(mo11340l.length())) {
                throw new d("Invalid input length " + mo11340l.length());
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < mo11340l.length()) {
                int i9 = i7 + 2;
                int m11343c = (this.f9605f.m11343c(mo11340l.charAt(i7)) << 18) | (this.f9605f.m11343c(mo11340l.charAt(i7 + 1)) << 12);
                int i10 = i8 + 1;
                bArr[i8] = (byte) (m11343c >>> 16);
                if (i9 < mo11340l.length()) {
                    int i11 = i7 + 3;
                    int m11343c2 = m11343c | (this.f9605f.m11343c(mo11340l.charAt(i9)) << 6);
                    int i12 = i8 + 2;
                    bArr[i10] = (byte) ((m11343c2 >>> 8) & 255);
                    if (i11 < mo11340l.length()) {
                        i7 += 4;
                        i8 += 3;
                        bArr[i12] = (byte) ((m11343c2 | this.f9605f.m11343c(mo11340l.charAt(i11))) & 255);
                    } else {
                        i8 = i12;
                        i7 = i11;
                    }
                } else {
                    i8 = i10;
                    i7 = i9;
                }
            }
            return i8;
        }

        @Override // p186a3.AbstractC3106a.e, p186a3.AbstractC3106a
        /* renamed from: g */
        public void mo11336g(Appendable appendable, byte[] bArr, int i7, int i8) {
            AbstractC2932o.m10572o(appendable);
            int i9 = i7 + i8;
            AbstractC2932o.m10577t(i7, i9, bArr.length);
            while (i8 >= 3) {
                int i10 = i7 + 2;
                int i11 = ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7] & ForkServer.ERROR) << 16);
                i7 += 3;
                int i12 = i11 | (bArr[i10] & ForkServer.ERROR);
                appendable.append(this.f9605f.m11344d(i12 >>> 18));
                appendable.append(this.f9605f.m11344d((i12 >>> 12) & 63));
                appendable.append(this.f9605f.m11344d((i12 >>> 6) & 63));
                appendable.append(this.f9605f.m11344d(i12 & 63));
                i8 -= 3;
            }
            if (i7 < i9) {
                m11348m(appendable, bArr, i7, i9 - i7);
            }
        }

        @Override // p186a3.AbstractC3106a.e
        /* renamed from: n */
        public AbstractC3106a mo11347n(a aVar, Character ch) {
            return new c(aVar, ch);
        }

        public c(a aVar, Character ch) {
            super(aVar, ch);
            AbstractC2932o.m10561d(aVar.f9596b.length == 64);
        }
    }

    /* renamed from: a3.a$d */
    public static final class d extends IOException {
        public d(String str) {
            super(str);
        }
    }

    /* renamed from: a3.a$e */
    public static class e extends AbstractC3106a {

        /* renamed from: f */
        public final a f9605f;

        /* renamed from: g */
        public final Character f9606g;

        public e(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // p186a3.AbstractC3106a
        /* renamed from: d */
        public int mo11333d(byte[] bArr, CharSequence charSequence) {
            a aVar;
            AbstractC2932o.m10572o(bArr);
            CharSequence mo11340l = mo11340l(charSequence);
            if (!this.f9605f.m11345e(mo11340l.length())) {
                throw new d("Invalid input length " + mo11340l.length());
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < mo11340l.length()) {
                long j7 = 0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    aVar = this.f9605f;
                    if (i9 >= aVar.f9599e) {
                        break;
                    }
                    j7 <<= aVar.f9598d;
                    if (i7 + i9 < mo11340l.length()) {
                        j7 |= this.f9605f.m11343c(mo11340l.charAt(i10 + i7));
                        i10++;
                    }
                    i9++;
                }
                int i11 = aVar.f9600f;
                int i12 = (i11 * 8) - (i10 * aVar.f9598d);
                int i13 = (i11 - 1) * 8;
                while (i13 >= i12) {
                    bArr[i8] = (byte) ((j7 >>> i13) & 255);
                    i13 -= 8;
                    i8++;
                }
                i7 += this.f9605f.f9599e;
            }
            return i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f9605f.equals(eVar.f9605f) && Objects.equals(this.f9606g, eVar.f9606g);
        }

        @Override // p186a3.AbstractC3106a
        /* renamed from: g */
        public void mo11336g(Appendable appendable, byte[] bArr, int i7, int i8) {
            AbstractC2932o.m10572o(appendable);
            AbstractC2932o.m10577t(i7, i7 + i8, bArr.length);
            int i9 = 0;
            while (i9 < i8) {
                m11348m(appendable, bArr, i7 + i9, Math.min(this.f9605f.f9600f, i8 - i9));
                i9 += this.f9605f.f9600f;
            }
        }

        public int hashCode() {
            return this.f9605f.hashCode() ^ Objects.hashCode(this.f9606g);
        }

        @Override // p186a3.AbstractC3106a
        /* renamed from: i */
        public int mo11337i(int i7) {
            return (int) (((this.f9605f.f9598d * i7) + 7) / 8);
        }

        @Override // p186a3.AbstractC3106a
        /* renamed from: j */
        public int mo11338j(int i7) {
            a aVar = this.f9605f;
            return aVar.f9599e * AbstractC3524d.m14159b(i7, aVar.f9600f, RoundingMode.CEILING);
        }

        @Override // p186a3.AbstractC3106a
        /* renamed from: k */
        public AbstractC3106a mo11339k() {
            return this.f9606g == null ? this : mo11347n(this.f9605f, null);
        }

        @Override // p186a3.AbstractC3106a
        /* renamed from: l */
        public CharSequence mo11340l(CharSequence charSequence) {
            AbstractC2932o.m10572o(charSequence);
            Character ch = this.f9606g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* renamed from: m */
        public void m11348m(Appendable appendable, byte[] bArr, int i7, int i8) {
            AbstractC2932o.m10572o(appendable);
            AbstractC2932o.m10577t(i7, i7 + i8, bArr.length);
            int i9 = 0;
            AbstractC2932o.m10561d(i8 <= this.f9605f.f9600f);
            long j7 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                j7 = (j7 | (bArr[i7 + i10] & ForkServer.ERROR)) << 8;
            }
            int i11 = ((i8 + 1) * 8) - this.f9605f.f9598d;
            while (i9 < i8 * 8) {
                a aVar = this.f9605f;
                appendable.append(aVar.m11344d(((int) (j7 >>> (i11 - i9))) & aVar.f9597c));
                i9 += this.f9605f.f9598d;
            }
            if (this.f9606g != null) {
                while (i9 < this.f9605f.f9600f * 8) {
                    appendable.append(this.f9606g.charValue());
                    i9 += this.f9605f.f9598d;
                }
            }
        }

        /* renamed from: n */
        public AbstractC3106a mo11347n(a aVar, Character ch) {
            return new e(aVar, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f9605f);
            if (8 % this.f9605f.f9598d != 0) {
                if (this.f9606g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f9606g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public e(a aVar, Character ch) {
            this.f9605f = (a) AbstractC2932o.m10572o(aVar);
            AbstractC2932o.m10568k(ch == null || !aVar.m11346f(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f9606g = ch;
        }
    }

    /* renamed from: a */
    public static AbstractC3106a m11329a() {
        return f9590a;
    }

    /* renamed from: h */
    public static byte[] m11330h(byte[] bArr, int i7) {
        if (i7 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        return bArr2;
    }

    /* renamed from: b */
    public final byte[] m11331b(CharSequence charSequence) {
        try {
            return m11332c(charSequence);
        } catch (d e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* renamed from: c */
    public final byte[] m11332c(CharSequence charSequence) {
        CharSequence mo11340l = mo11340l(charSequence);
        byte[] bArr = new byte[mo11337i(mo11340l.length())];
        return m11330h(bArr, mo11333d(bArr, mo11340l));
    }

    /* renamed from: d */
    public abstract int mo11333d(byte[] bArr, CharSequence charSequence);

    /* renamed from: e */
    public String m11334e(byte[] bArr) {
        return m11335f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public final String m11335f(byte[] bArr, int i7, int i8) {
        AbstractC2932o.m10577t(i7, i7 + i8, bArr.length);
        StringBuilder sb = new StringBuilder(mo11338j(i8));
        try {
            mo11336g(sb, bArr, i7, i8);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    /* renamed from: g */
    public abstract void mo11336g(Appendable appendable, byte[] bArr, int i7, int i8);

    /* renamed from: i */
    public abstract int mo11337i(int i7);

    /* renamed from: j */
    public abstract int mo11338j(int i7);

    /* renamed from: k */
    public abstract AbstractC3106a mo11339k();

    /* renamed from: l */
    public abstract CharSequence mo11340l(CharSequence charSequence);
}
