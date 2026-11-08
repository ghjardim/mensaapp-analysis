package p328r1;

import p078L0.InterfaceC0885t;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5322E;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.y */
/* loaded from: classes.dex */
public final class C6286y implements InterfaceC6259K {

    /* renamed from: a */
    public final InterfaceC6274m f22769a;

    /* renamed from: b */
    public final C5356y f22770b = new C5356y(new byte[10]);

    /* renamed from: c */
    public int f22771c = 0;

    /* renamed from: d */
    public int f22772d;

    /* renamed from: e */
    public C5322E f22773e;

    /* renamed from: f */
    public boolean f22774f;

    /* renamed from: g */
    public boolean f22775g;

    /* renamed from: h */
    public boolean f22776h;

    /* renamed from: i */
    public int f22777i;

    /* renamed from: j */
    public int f22778j;

    /* renamed from: k */
    public boolean f22779k;

    /* renamed from: l */
    public long f22780l;

    public C6286y(InterfaceC6274m interfaceC6274m) {
        this.f22769a = interfaceC6274m;
    }

    @Override // p328r1.InterfaceC6259K
    /* renamed from: a */
    public void mo26133a(C5357z c5357z, int i7) {
        AbstractC5332a.m21804i(this.f22773e);
        if ((i7 & 1) != 0) {
            int i8 = this.f22771c;
            if (i8 != 0 && i8 != 1) {
                if (i8 == 2) {
                    AbstractC5346o.m21867h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f22778j != -1) {
                        AbstractC5346o.m21867h("PesReader", "Unexpected start indicator: expected " + this.f22778j + " more bytes");
                    }
                    this.f22769a.mo26189d(c5357z.m21948g() == 0);
                }
            }
            m26324h(1);
        }
        while (c5357z.m21942a() > 0) {
            int i9 = this.f22771c;
            if (i9 == 0) {
                c5357z.m21940U(c5357z.m21942a());
            } else if (i9 != 1) {
                if (i9 == 2) {
                    if (m26321e(c5357z, this.f22770b.f18880a, Math.min(10, this.f22777i)) && m26321e(c5357z, null, this.f22777i)) {
                        m26323g();
                        i7 |= this.f22779k ? 4 : 0;
                        this.f22769a.mo26190e(this.f22780l, i7);
                        m26324h(3);
                    }
                } else {
                    if (i9 != 3) {
                        throw new IllegalStateException();
                    }
                    int m21942a = c5357z.m21942a();
                    int i10 = this.f22778j;
                    int i11 = i10 == -1 ? 0 : m21942a - i10;
                    if (i11 > 0) {
                        m21942a -= i11;
                        c5357z.m21938S(c5357z.m21947f() + m21942a);
                    }
                    this.f22769a.mo26186a(c5357z);
                    int i12 = this.f22778j;
                    if (i12 != -1) {
                        int i13 = i12 - m21942a;
                        this.f22778j = i13;
                        if (i13 == 0) {
                            this.f22769a.mo26189d(false);
                            m26324h(1);
                        }
                    }
                }
            } else if (m26321e(c5357z, this.f22770b.f18880a, 9)) {
                m26324h(m26322f() ? 2 : 0);
            }
        }
    }

    @Override // p328r1.InterfaceC6259K
    /* renamed from: b */
    public void mo26134b() {
        this.f22771c = 0;
        this.f22772d = 0;
        this.f22776h = false;
        this.f22769a.mo26187b();
    }

    @Override // p328r1.InterfaceC6259K
    /* renamed from: c */
    public void mo26135c(C5322E c5322e, InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        this.f22773e = c5322e;
        this.f22769a.mo26188c(interfaceC0885t, dVar);
    }

    /* renamed from: d */
    public boolean m26320d(boolean z6) {
        return this.f22771c == 3 && this.f22778j == -1 && !(z6 && (this.f22769a instanceof C6275n));
    }

    /* renamed from: e */
    public final boolean m26321e(C5357z c5357z, byte[] bArr, int i7) {
        int min = Math.min(c5357z.m21942a(), i7 - this.f22772d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c5357z.m21940U(min);
        } else {
            c5357z.m21953l(bArr, this.f22772d, min);
        }
        int i8 = this.f22772d + min;
        this.f22772d = i8;
        return i8 == i7;
    }

    /* renamed from: f */
    public final boolean m26322f() {
        this.f22770b.m21916p(0);
        int m21908h = this.f22770b.m21908h(24);
        if (m21908h != 1) {
            AbstractC5346o.m21867h("PesReader", "Unexpected start code prefix: " + m21908h);
            this.f22778j = -1;
            return false;
        }
        this.f22770b.m21918r(8);
        int m21908h2 = this.f22770b.m21908h(16);
        this.f22770b.m21918r(5);
        this.f22779k = this.f22770b.m21907g();
        this.f22770b.m21918r(2);
        this.f22774f = this.f22770b.m21907g();
        this.f22775g = this.f22770b.m21907g();
        this.f22770b.m21918r(6);
        int m21908h3 = this.f22770b.m21908h(8);
        this.f22777i = m21908h3;
        if (m21908h2 == 0) {
            this.f22778j = -1;
        } else {
            int i7 = (m21908h2 - 3) - m21908h3;
            this.f22778j = i7;
            if (i7 < 0) {
                AbstractC5346o.m21867h("PesReader", "Found negative packet payload size: " + this.f22778j);
                this.f22778j = -1;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m26323g() {
        this.f22770b.m21916p(0);
        this.f22780l = -9223372036854775807L;
        if (this.f22774f) {
            this.f22770b.m21918r(4);
            this.f22770b.m21918r(1);
            this.f22770b.m21918r(1);
            long m21908h = (this.f22770b.m21908h(3) << 30) | (this.f22770b.m21908h(15) << 15) | this.f22770b.m21908h(15);
            this.f22770b.m21918r(1);
            if (!this.f22776h && this.f22775g) {
                this.f22770b.m21918r(4);
                this.f22770b.m21918r(1);
                this.f22770b.m21918r(1);
                this.f22770b.m21918r(1);
                this.f22773e.m21651b((this.f22770b.m21908h(3) << 30) | (this.f22770b.m21908h(15) << 15) | this.f22770b.m21908h(15));
                this.f22776h = true;
            }
            this.f22780l = this.f22773e.m21651b(m21908h);
        }
    }

    /* renamed from: h */
    public final void m26324h(int i7) {
        this.f22771c = i7;
        this.f22772d = 0;
    }
}
