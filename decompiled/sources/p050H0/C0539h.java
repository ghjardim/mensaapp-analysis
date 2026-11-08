package p050H0;

import java.util.Arrays;
import p050H0.InterfaceC0533b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: H0.h */
/* loaded from: classes.dex */
public final class C0539h implements InterfaceC0533b {

    /* renamed from: a */
    public final boolean f1739a;

    /* renamed from: b */
    public final int f1740b;

    /* renamed from: c */
    public final byte[] f1741c;

    /* renamed from: d */
    public int f1742d;

    /* renamed from: e */
    public int f1743e;

    /* renamed from: f */
    public int f1744f;

    /* renamed from: g */
    public C0532a[] f1745g;

    public C0539h(boolean z6, int i7) {
        this(z6, i7, 0);
    }

    @Override // p050H0.InterfaceC0533b
    /* renamed from: a */
    public synchronized void mo2039a(C0532a c0532a) {
        C0532a[] c0532aArr = this.f1745g;
        int i7 = this.f1744f;
        this.f1744f = i7 + 1;
        c0532aArr[i7] = c0532a;
        this.f1743e--;
        notifyAll();
    }

    @Override // p050H0.InterfaceC0533b
    /* renamed from: b */
    public synchronized C0532a mo2040b() {
        C0532a c0532a;
        try {
            this.f1743e++;
            int i7 = this.f1744f;
            if (i7 > 0) {
                C0532a[] c0532aArr = this.f1745g;
                int i8 = i7 - 1;
                this.f1744f = i8;
                c0532a = (C0532a) AbstractC5332a.m21800e(c0532aArr[i8]);
                this.f1745g[this.f1744f] = null;
            } else {
                c0532a = new C0532a(new byte[this.f1740b], 0);
                int i9 = this.f1743e;
                C0532a[] c0532aArr2 = this.f1745g;
                if (i9 > c0532aArr2.length) {
                    this.f1745g = (C0532a[]) Arrays.copyOf(c0532aArr2, c0532aArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0532a;
    }

    @Override // p050H0.InterfaceC0533b
    /* renamed from: c */
    public synchronized void mo2041c() {
        try {
            int i7 = 0;
            int max = Math.max(0, AbstractC5330M.m21753k(this.f1742d, this.f1740b) - this.f1743e);
            int i8 = this.f1744f;
            if (max >= i8) {
                return;
            }
            if (this.f1741c != null) {
                int i9 = i8 - 1;
                while (i7 <= i9) {
                    C0532a c0532a = (C0532a) AbstractC5332a.m21800e(this.f1745g[i7]);
                    if (c0532a.f1728a == this.f1741c) {
                        i7++;
                    } else {
                        C0532a c0532a2 = (C0532a) AbstractC5332a.m21800e(this.f1745g[i9]);
                        if (c0532a2.f1728a != this.f1741c) {
                            i9--;
                        } else {
                            C0532a[] c0532aArr = this.f1745g;
                            c0532aArr[i7] = c0532a2;
                            c0532aArr[i9] = c0532a;
                            i9--;
                            i7++;
                        }
                    }
                }
                max = Math.max(max, i7);
                if (max >= this.f1744f) {
                    return;
                }
            }
            Arrays.fill(this.f1745g, max, this.f1744f, (Object) null);
            this.f1744f = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p050H0.InterfaceC0533b
    /* renamed from: d */
    public synchronized void mo2042d(InterfaceC0533b.a aVar) {
        while (aVar != null) {
            try {
                C0532a[] c0532aArr = this.f1745g;
                int i7 = this.f1744f;
                this.f1744f = i7 + 1;
                c0532aArr[i7] = aVar.mo515a();
                this.f1743e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // p050H0.InterfaceC0533b
    /* renamed from: e */
    public int mo2043e() {
        return this.f1740b;
    }

    /* renamed from: f */
    public synchronized int m2067f() {
        return this.f1743e * this.f1740b;
    }

    /* renamed from: g */
    public synchronized void m2068g() {
        if (this.f1739a) {
            m2069h(0);
        }
    }

    /* renamed from: h */
    public synchronized void m2069h(int i7) {
        boolean z6 = i7 < this.f1742d;
        this.f1742d = i7;
        if (z6) {
            mo2041c();
        }
    }

    public C0539h(boolean z6, int i7, int i8) {
        AbstractC5332a.m21796a(i7 > 0);
        AbstractC5332a.m21796a(i8 >= 0);
        this.f1739a = z6;
        this.f1740b = i7;
        this.f1744f = i8;
        this.f1745g = new C0532a[i8 + 100];
        if (i8 <= 0) {
            this.f1741c = null;
            return;
        }
        this.f1741c = new byte[i8 * i7];
        for (int i9 = 0; i9 < i8; i9++) {
            this.f1745g[i9] = new C0532a(this.f1741c, i9 * i7);
        }
    }
}
