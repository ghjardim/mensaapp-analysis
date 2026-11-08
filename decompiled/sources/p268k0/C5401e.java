package p268k0;

import org.apache.tika.fork.ForkServer;
import p259j0.AbstractC5332a;

/* renamed from: k0.e */
/* loaded from: classes.dex */
public final class C5401e {

    /* renamed from: a */
    public byte[] f19290a;

    /* renamed from: b */
    public int f19291b;

    /* renamed from: c */
    public int f19292c;

    /* renamed from: d */
    public int f19293d;

    public C5401e(byte[] bArr, int i7, int i8) {
        m22342i(bArr, i7, i8);
    }

    /* renamed from: a */
    public final void m22334a() {
        int i7;
        int i8 = this.f19292c;
        AbstractC5332a.m21802g(i8 >= 0 && (i8 < (i7 = this.f19291b) || (i8 == i7 && this.f19293d == 0)));
    }

    /* renamed from: b */
    public boolean m22335b(int i7) {
        int i8 = this.f19292c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f19293d + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f19291b) {
                break;
            }
            if (m22343j(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f19291b;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m22336c() {
        int i7 = this.f19292c;
        int i8 = this.f19293d;
        int i9 = 0;
        while (this.f19292c < this.f19291b && !m22337d()) {
            i9++;
        }
        boolean z6 = this.f19292c == this.f19291b;
        this.f19292c = i7;
        this.f19293d = i8;
        return !z6 && m22335b((i9 * 2) + 1);
    }

    /* renamed from: d */
    public boolean m22337d() {
        boolean z6 = (this.f19290a[this.f19292c] & (128 >> this.f19293d)) != 0;
        m22344k();
        return z6;
    }

    /* renamed from: e */
    public int m22338e(int i7) {
        int i8;
        this.f19293d += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f19293d;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f19293d = i10;
            byte[] bArr = this.f19290a;
            int i11 = this.f19292c;
            i9 |= (bArr[i11] & ForkServer.ERROR) << i10;
            if (!m22343j(i11 + 1)) {
                r3 = 1;
            }
            this.f19292c = i11 + r3;
        }
        byte[] bArr2 = this.f19290a;
        int i12 = this.f19292c;
        int i13 = ((-1) >>> (32 - i7)) & (i9 | ((bArr2[i12] & ForkServer.ERROR) >> (8 - i8)));
        if (i8 == 8) {
            this.f19293d = 0;
            this.f19292c = i12 + (m22343j(i12 + 1) ? 2 : 1);
        }
        m22334a();
        return i13;
    }

    /* renamed from: f */
    public final int m22339f() {
        int i7 = 0;
        while (!m22337d()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? m22338e(i7) : 0);
    }

    /* renamed from: g */
    public int m22340g() {
        int m22339f = m22339f();
        return (m22339f % 2 == 0 ? -1 : 1) * ((m22339f + 1) / 2);
    }

    /* renamed from: h */
    public int m22341h() {
        return m22339f();
    }

    /* renamed from: i */
    public void m22342i(byte[] bArr, int i7, int i8) {
        this.f19290a = bArr;
        this.f19292c = i7;
        this.f19291b = i8;
        this.f19293d = 0;
        m22334a();
    }

    /* renamed from: j */
    public final boolean m22343j(int i7) {
        if (2 <= i7 && i7 < this.f19291b) {
            byte[] bArr = this.f19290a;
            if (bArr[i7] == 3 && bArr[i7 - 2] == 0 && bArr[i7 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m22344k() {
        int i7 = this.f19293d + 1;
        this.f19293d = i7;
        if (i7 == 8) {
            this.f19293d = 0;
            int i8 = this.f19292c;
            this.f19292c = i8 + (m22343j(i8 + 1) ? 2 : 1);
        }
        m22334a();
    }

    /* renamed from: l */
    public void m22345l(int i7) {
        int i8 = this.f19292c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        this.f19292c = i10;
        int i11 = this.f19293d + (i7 - (i9 * 8));
        this.f19293d = i11;
        if (i11 > 7) {
            this.f19292c = i10 + 1;
            this.f19293d = i11 - 8;
        }
        while (true) {
            i8++;
            if (i8 > this.f19292c) {
                m22334a();
                return;
            } else if (m22343j(i8)) {
                this.f19292c++;
                i8 += 2;
            }
        }
    }
}
