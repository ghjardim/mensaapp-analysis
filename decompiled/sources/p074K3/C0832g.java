package p074K3;

import com.google.protobuf.AbstractC4055i;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: K3.g */
/* loaded from: classes.dex */
public class C0832g {

    /* renamed from: c */
    public static final byte[][] f2867c = {new byte[]{0, 0}, new byte[]{Byte.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, Byte.MIN_VALUE}, new byte[]{-1, -64}};

    /* renamed from: b */
    public int f2869b = 0;

    /* renamed from: a */
    public byte[] f2868a = new byte[1024];

    /* renamed from: a */
    public byte[] m3470a() {
        return Arrays.copyOf(this.f2868a, this.f2869b);
    }

    /* renamed from: b */
    public final void m3471b(int i7) {
        int i8 = i7 + this.f2869b;
        byte[] bArr = this.f2868a;
        if (i8 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i8) {
            i8 = length;
        }
        this.f2868a = Arrays.copyOf(bArr, i8);
    }

    /* renamed from: c */
    public void m3472c(byte[] bArr) {
        m3471b(bArr.length);
        for (byte b7 : bArr) {
            byte[] bArr2 = this.f2868a;
            int i7 = this.f2869b;
            this.f2869b = i7 + 1;
            bArr2[i7] = b7;
        }
    }

    /* renamed from: d */
    public final int m3473d(long j7) {
        if (j7 < 0) {
            j7 = ~j7;
        }
        return AbstractC0831f.m3469a(65 - Long.numberOfLeadingZeros(j7), 7, RoundingMode.UP);
    }

    /* renamed from: e */
    public final int m3474e(long j7) {
        return AbstractC0831f.m3469a(64 - Long.numberOfLeadingZeros(j7), 8, RoundingMode.UP);
    }

    /* renamed from: f */
    public final void m3475f(byte b7) {
        if (b7 == 0) {
            m3481l((byte) 0);
            m3481l((byte) -1);
        } else if (b7 != -1) {
            m3481l(b7);
        } else {
            m3481l((byte) -1);
            m3481l((byte) 0);
        }
    }

    /* renamed from: g */
    public final void m3476g(byte b7) {
        if (b7 == 0) {
            m3482m((byte) 0);
            m3482m((byte) -1);
        } else if (b7 != -1) {
            m3482m(b7);
        } else {
            m3482m((byte) -1);
            m3482m((byte) 0);
        }
    }

    /* renamed from: h */
    public void m3477h(AbstractC4055i abstractC4055i) {
        for (int i7 = 0; i7 < abstractC4055i.size(); i7++) {
            m3475f(abstractC4055i.mo16437f(i7));
        }
        m3485p();
    }

    /* renamed from: i */
    public void m3478i(AbstractC4055i abstractC4055i) {
        for (int i7 = 0; i7 < abstractC4055i.size(); i7++) {
            m3476g(abstractC4055i.mo16437f(i7));
        }
        m3486q();
    }

    /* renamed from: j */
    public void m3479j(double d7) {
        long doubleToLongBits = Double.doubleToLongBits(d7);
        m3489t(doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    /* renamed from: k */
    public void m3480k(double d7) {
        long doubleToLongBits = Double.doubleToLongBits(d7);
        m3490u(doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    /* renamed from: l */
    public final void m3481l(byte b7) {
        m3471b(1);
        byte[] bArr = this.f2868a;
        int i7 = this.f2869b;
        this.f2869b = i7 + 1;
        bArr[i7] = b7;
    }

    /* renamed from: m */
    public final void m3482m(byte b7) {
        m3471b(1);
        byte[] bArr = this.f2868a;
        int i7 = this.f2869b;
        this.f2869b = i7 + 1;
        bArr[i7] = (byte) (~b7);
    }

    /* renamed from: n */
    public void m3483n() {
        m3481l((byte) -1);
        m3481l((byte) -1);
    }

    /* renamed from: o */
    public void m3484o() {
        m3482m((byte) -1);
        m3482m((byte) -1);
    }

    /* renamed from: p */
    public final void m3485p() {
        m3481l((byte) 0);
        m3481l((byte) 1);
    }

    /* renamed from: q */
    public final void m3486q() {
        m3482m((byte) 0);
        m3482m((byte) 1);
    }

    /* renamed from: r */
    public void m3487r(long j7) {
        int i7;
        long j8 = j7 < 0 ? ~j7 : j7;
        if (j8 < 64) {
            m3471b(1);
            byte[] bArr = this.f2868a;
            int i8 = this.f2869b;
            this.f2869b = i8 + 1;
            bArr[i8] = (byte) (j7 ^ f2867c[1][0]);
            return;
        }
        int m3473d = m3473d(j8);
        m3471b(m3473d);
        if (m3473d < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(m3473d)));
        }
        byte b7 = j7 < 0 ? (byte) -1 : (byte) 0;
        int i9 = this.f2869b;
        if (m3473d == 10) {
            i7 = 2 + i9;
            byte[] bArr2 = this.f2868a;
            bArr2[i9] = b7;
            bArr2[i9 + 1] = b7;
        } else if (m3473d == 9) {
            i7 = i9 + 1;
            this.f2868a[i9] = b7;
        } else {
            i7 = i9;
        }
        for (int i10 = (m3473d - 1) + i9; i10 >= i7; i10--) {
            this.f2868a[i10] = (byte) (255 & j7);
            j7 >>= 8;
        }
        byte[] bArr3 = this.f2868a;
        int i11 = this.f2869b;
        byte b8 = bArr3[i11];
        byte[] bArr4 = f2867c[m3473d];
        bArr3[i11] = (byte) (b8 ^ bArr4[0]);
        int i12 = i11 + 1;
        bArr3[i12] = (byte) (bArr4[1] ^ bArr3[i12]);
        this.f2869b = i11 + m3473d;
    }

    /* renamed from: s */
    public void m3488s(long j7) {
        m3487r(~j7);
    }

    /* renamed from: t */
    public void m3489t(long j7) {
        int m3474e = m3474e(j7);
        m3471b(m3474e + 1);
        byte[] bArr = this.f2868a;
        int i7 = this.f2869b;
        int i8 = i7 + 1;
        this.f2869b = i8;
        bArr[i7] = (byte) m3474e;
        int i9 = i8 + m3474e;
        while (true) {
            i9--;
            int i10 = this.f2869b;
            if (i9 < i10) {
                this.f2869b = i10 + m3474e;
                return;
            } else {
                this.f2868a[i9] = (byte) (255 & j7);
                j7 >>>= 8;
            }
        }
    }

    /* renamed from: u */
    public void m3490u(long j7) {
        int m3474e = m3474e(j7);
        m3471b(m3474e + 1);
        byte[] bArr = this.f2868a;
        int i7 = this.f2869b;
        int i8 = i7 + 1;
        this.f2869b = i8;
        bArr[i7] = (byte) (~m3474e);
        int i9 = i8 + m3474e;
        while (true) {
            i9--;
            int i10 = this.f2869b;
            if (i9 < i10) {
                this.f2869b = i10 + m3474e;
                return;
            } else {
                this.f2868a[i9] = (byte) (~(255 & j7));
                j7 >>>= 8;
            }
        }
    }

    /* renamed from: v */
    public void m3491v(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            if (charAt < 128) {
                m3475f((byte) charAt);
            } else if (charAt < 2048) {
                m3475f((byte) ((charAt >>> 6) | 960));
                m3475f((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                m3475f((byte) ((charAt >>> '\f') | 480));
                m3475f((byte) (((charAt >>> 6) & 63) | 128));
                m3475f((byte) ((charAt & '?') | 128));
            } else {
                int codePointAt = Character.codePointAt(charSequence, i7);
                i7++;
                m3475f((byte) ((codePointAt >>> 18) | 240));
                m3475f((byte) (((codePointAt >>> 12) & 63) | 128));
                m3475f((byte) (((codePointAt >>> 6) & 63) | 128));
                m3475f((byte) ((codePointAt & 63) | 128));
            }
            i7++;
        }
        m3485p();
    }

    /* renamed from: w */
    public void m3492w(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            if (charAt < 128) {
                m3476g((byte) charAt);
            } else if (charAt < 2048) {
                m3476g((byte) ((charAt >>> 6) | 960));
                m3476g((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                m3476g((byte) ((charAt >>> '\f') | 480));
                m3476g((byte) (((charAt >>> 6) & 63) | 128));
                m3476g((byte) ((charAt & '?') | 128));
            } else {
                int codePointAt = Character.codePointAt(charSequence, i7);
                i7++;
                m3476g((byte) ((codePointAt >>> 18) | 240));
                m3476g((byte) (((codePointAt >>> 12) & 63) | 128));
                m3476g((byte) (((codePointAt >>> 6) & 63) | 128));
                m3476g((byte) ((codePointAt & 63) | 128));
            }
            i7++;
        }
        m3486q();
    }
}
