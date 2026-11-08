package p078L0;

import org.apache.tika.fork.ForkServer;
import p259j0.AbstractC5332a;

/* renamed from: L0.V */
/* loaded from: classes.dex */
public final class C0863V {

    /* renamed from: a */
    public final byte[] f2963a;

    /* renamed from: b */
    public final int f2964b;

    /* renamed from: c */
    public int f2965c;

    /* renamed from: d */
    public int f2966d;

    public C0863V(byte[] bArr) {
        this.f2963a = bArr;
        this.f2964b = bArr.length;
    }

    /* renamed from: a */
    public final void m3561a() {
        int i7;
        int i8 = this.f2965c;
        AbstractC5332a.m21802g(i8 >= 0 && (i8 < (i7 = this.f2964b) || (i8 == i7 && this.f2966d == 0)));
    }

    /* renamed from: b */
    public int m3562b() {
        return (this.f2965c * 8) + this.f2966d;
    }

    /* renamed from: c */
    public boolean m3563c() {
        boolean z6 = (((this.f2963a[this.f2965c] & ForkServer.ERROR) >> this.f2966d) & 1) == 1;
        m3565e(1);
        return z6;
    }

    /* renamed from: d */
    public int m3564d(int i7) {
        int i8 = this.f2965c;
        int min = Math.min(i7, 8 - this.f2966d);
        int i9 = i8 + 1;
        int i10 = ((this.f2963a[i8] & ForkServer.ERROR) >> this.f2966d) & (255 >> (8 - min));
        while (min < i7) {
            i10 |= (this.f2963a[i9] & ForkServer.ERROR) << min;
            min += 8;
            i9++;
        }
        int i11 = i10 & ((-1) >>> (32 - i7));
        m3565e(i7);
        return i11;
    }

    /* renamed from: e */
    public void m3565e(int i7) {
        int i8 = i7 / 8;
        int i9 = this.f2965c + i8;
        this.f2965c = i9;
        int i10 = this.f2966d + (i7 - (i8 * 8));
        this.f2966d = i10;
        if (i10 > 7) {
            this.f2965c = i9 + 1;
            this.f2966d = i10 - 8;
        }
        m3561a();
    }
}
