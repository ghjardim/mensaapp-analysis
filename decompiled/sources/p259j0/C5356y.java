package p259j0;

import java.nio.charset.Charset;
import org.apache.tika.fork.ForkServer;

/* renamed from: j0.y */
/* loaded from: classes.dex */
public final class C5356y {

    /* renamed from: a */
    public byte[] f18880a;

    /* renamed from: b */
    public int f18881b;

    /* renamed from: c */
    public int f18882c;

    /* renamed from: d */
    public int f18883d;

    public C5356y() {
        this.f18880a = AbstractC5330M.f18805f;
    }

    /* renamed from: a */
    public final void m21901a() {
        int i7;
        int i8 = this.f18881b;
        AbstractC5332a.m21802g(i8 >= 0 && (i8 < (i7 = this.f18883d) || (i8 == i7 && this.f18882c == 0)));
    }

    /* renamed from: b */
    public int m21902b() {
        return ((this.f18883d - this.f18881b) * 8) - this.f18882c;
    }

    /* renamed from: c */
    public void m21903c() {
        if (this.f18882c == 0) {
            return;
        }
        this.f18882c = 0;
        this.f18881b++;
        m21901a();
    }

    /* renamed from: d */
    public int m21904d() {
        AbstractC5332a.m21802g(this.f18882c == 0);
        return this.f18881b;
    }

    /* renamed from: e */
    public int m21905e() {
        return (this.f18881b * 8) + this.f18882c;
    }

    /* renamed from: f */
    public void m21906f(int i7, int i8) {
        if (i8 < 32) {
            i7 &= (1 << i8) - 1;
        }
        int min = Math.min(8 - this.f18882c, i8);
        int i9 = this.f18882c;
        int i10 = (8 - i9) - min;
        byte[] bArr = this.f18880a;
        int i11 = this.f18881b;
        byte b7 = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b7;
        int i12 = i8 - min;
        bArr[i11] = (byte) (b7 | ((i7 >>> i12) << i10));
        int i13 = i11 + 1;
        while (i12 > 8) {
            this.f18880a[i13] = (byte) (i7 >>> (i12 - 8));
            i12 -= 8;
            i13++;
        }
        int i14 = 8 - i12;
        byte[] bArr2 = this.f18880a;
        byte b8 = (byte) (bArr2[i13] & ((1 << i14) - 1));
        bArr2[i13] = b8;
        bArr2[i13] = (byte) (((i7 & ((1 << i12) - 1)) << i14) | b8);
        m21918r(i8);
        m21901a();
    }

    /* renamed from: g */
    public boolean m21907g() {
        boolean z6 = (this.f18880a[this.f18881b] & (128 >> this.f18882c)) != 0;
        m21917q();
        return z6;
    }

    /* renamed from: h */
    public int m21908h(int i7) {
        int i8;
        if (i7 == 0) {
            return 0;
        }
        this.f18882c += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f18882c;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f18882c = i10;
            byte[] bArr = this.f18880a;
            int i11 = this.f18881b;
            this.f18881b = i11 + 1;
            i9 |= (bArr[i11] & ForkServer.ERROR) << i10;
        }
        byte[] bArr2 = this.f18880a;
        int i12 = this.f18881b;
        int i13 = ((-1) >>> (32 - i7)) & (i9 | ((bArr2[i12] & ForkServer.ERROR) >> (8 - i8)));
        if (i8 == 8) {
            this.f18882c = 0;
            this.f18881b = i12 + 1;
        }
        m21901a();
        return i13;
    }

    /* renamed from: i */
    public void m21909i(byte[] bArr, int i7, int i8) {
        int i9 = (i8 >> 3) + i7;
        while (i7 < i9) {
            byte[] bArr2 = this.f18880a;
            int i10 = this.f18881b;
            int i11 = i10 + 1;
            this.f18881b = i11;
            byte b7 = bArr2[i10];
            int i12 = this.f18882c;
            byte b8 = (byte) (b7 << i12);
            bArr[i7] = b8;
            bArr[i7] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b8);
            i7++;
        }
        int i13 = i8 & 7;
        if (i13 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i9] & (255 >> i13));
        bArr[i9] = b9;
        int i14 = this.f18882c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f18880a;
            int i15 = this.f18881b;
            this.f18881b = i15 + 1;
            bArr[i9] = (byte) (b9 | ((bArr3[i15] & ForkServer.ERROR) << i14));
            this.f18882c = i14 - 8;
        }
        int i16 = this.f18882c + i13;
        this.f18882c = i16;
        byte[] bArr4 = this.f18880a;
        int i17 = this.f18881b;
        bArr[i9] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i9]);
        if (i16 == 8) {
            this.f18882c = 0;
            this.f18881b = i17 + 1;
        }
        m21901a();
    }

    /* renamed from: j */
    public long m21910j(int i7) {
        return i7 <= 32 ? AbstractC5330M.m21755k1(m21908h(i7)) : AbstractC5330M.m21752j1(m21908h(i7 - 32), m21908h(32));
    }

    /* renamed from: k */
    public void m21911k(byte[] bArr, int i7, int i8) {
        AbstractC5332a.m21802g(this.f18882c == 0);
        System.arraycopy(this.f18880a, this.f18881b, bArr, i7, i8);
        this.f18881b += i8;
        m21901a();
    }

    /* renamed from: l */
    public String m21912l(int i7, Charset charset) {
        byte[] bArr = new byte[i7];
        m21911k(bArr, 0, i7);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void m21913m(C5357z c5357z) {
        m21915o(c5357z.m21946e(), c5357z.m21948g());
        m21916p(c5357z.m21947f() * 8);
    }

    /* renamed from: n */
    public void m21914n(byte[] bArr) {
        m21915o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void m21915o(byte[] bArr, int i7) {
        this.f18880a = bArr;
        this.f18881b = 0;
        this.f18882c = 0;
        this.f18883d = i7;
    }

    /* renamed from: p */
    public void m21916p(int i7) {
        int i8 = i7 / 8;
        this.f18881b = i8;
        this.f18882c = i7 - (i8 * 8);
        m21901a();
    }

    /* renamed from: q */
    public void m21917q() {
        int i7 = this.f18882c + 1;
        this.f18882c = i7;
        if (i7 == 8) {
            this.f18882c = 0;
            this.f18881b++;
        }
        m21901a();
    }

    /* renamed from: r */
    public void m21918r(int i7) {
        int i8 = i7 / 8;
        int i9 = this.f18881b + i8;
        this.f18881b = i9;
        int i10 = this.f18882c + (i7 - (i8 * 8));
        this.f18882c = i10;
        if (i10 > 7) {
            this.f18881b = i9 + 1;
            this.f18882c = i10 - 8;
        }
        m21901a();
    }

    /* renamed from: s */
    public void m21919s(int i7) {
        AbstractC5332a.m21802g(this.f18882c == 0);
        this.f18881b += i7;
        m21901a();
    }

    public C5356y(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C5356y(byte[] bArr, int i7) {
        this.f18880a = bArr;
        this.f18883d = i7;
    }
}
