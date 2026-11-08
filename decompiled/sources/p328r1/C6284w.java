package p328r1;

import java.util.Arrays;
import p259j0.AbstractC5332a;

/* renamed from: r1.w */
/* loaded from: classes.dex */
public final class C6284w {

    /* renamed from: a */
    public final int f22761a;

    /* renamed from: b */
    public boolean f22762b;

    /* renamed from: c */
    public boolean f22763c;

    /* renamed from: d */
    public byte[] f22764d;

    /* renamed from: e */
    public int f22765e;

    public C6284w(int i7, int i8) {
        this.f22761a = i7;
        byte[] bArr = new byte[i8 + 3];
        this.f22764d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m26314a(byte[] bArr, int i7, int i8) {
        if (this.f22762b) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f22764d;
            int length = bArr2.length;
            int i10 = this.f22765e;
            if (length < i10 + i9) {
                this.f22764d = Arrays.copyOf(bArr2, (i10 + i9) * 2);
            }
            System.arraycopy(bArr, i7, this.f22764d, this.f22765e, i9);
            this.f22765e += i9;
        }
    }

    /* renamed from: b */
    public boolean m26315b(int i7) {
        if (!this.f22762b) {
            return false;
        }
        this.f22765e -= i7;
        this.f22762b = false;
        this.f22763c = true;
        return true;
    }

    /* renamed from: c */
    public boolean m26316c() {
        return this.f22763c;
    }

    /* renamed from: d */
    public void m26317d() {
        this.f22762b = false;
        this.f22763c = false;
    }

    /* renamed from: e */
    public void m26318e(int i7) {
        AbstractC5332a.m21802g(!this.f22762b);
        boolean z6 = i7 == this.f22761a;
        this.f22762b = z6;
        if (z6) {
            this.f22765e = 3;
            this.f22763c = false;
        }
    }
}
