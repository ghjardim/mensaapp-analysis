package p328r1;

import p078L0.InterfaceC0885t;
import p259j0.AbstractC5330M;
import p259j0.C5322E;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.E */
/* loaded from: classes.dex */
public final class C6253E implements InterfaceC6259K {

    /* renamed from: a */
    public final InterfaceC6252D f22407a;

    /* renamed from: b */
    public final C5357z f22408b = new C5357z(32);

    /* renamed from: c */
    public int f22409c;

    /* renamed from: d */
    public int f22410d;

    /* renamed from: e */
    public boolean f22411e;

    /* renamed from: f */
    public boolean f22412f;

    public C6253E(InterfaceC6252D interfaceC6252D) {
        this.f22407a = interfaceC6252D;
    }

    @Override // p328r1.InterfaceC6259K
    /* renamed from: a */
    public void mo26133a(C5357z c5357z, int i7) {
        boolean z6 = (i7 & 1) != 0;
        int m21947f = z6 ? c5357z.m21947f() + c5357z.m21926G() : -1;
        if (this.f22412f) {
            if (!z6) {
                return;
            }
            this.f22412f = false;
            c5357z.m21939T(m21947f);
            this.f22410d = 0;
        }
        while (c5357z.m21942a() > 0) {
            int i8 = this.f22410d;
            if (i8 < 3) {
                if (i8 == 0) {
                    int m21926G = c5357z.m21926G();
                    c5357z.m21939T(c5357z.m21947f() - 1);
                    if (m21926G == 255) {
                        this.f22412f = true;
                        return;
                    }
                }
                int min = Math.min(c5357z.m21942a(), 3 - this.f22410d);
                c5357z.m21953l(this.f22408b.m21946e(), this.f22410d, min);
                int i9 = this.f22410d + min;
                this.f22410d = i9;
                if (i9 == 3) {
                    this.f22408b.m21939T(0);
                    this.f22408b.m21938S(3);
                    this.f22408b.m21940U(1);
                    int m21926G2 = this.f22408b.m21926G();
                    int m21926G3 = this.f22408b.m21926G();
                    this.f22411e = (m21926G2 & 128) != 0;
                    this.f22409c = (((m21926G2 & 15) << 8) | m21926G3) + 3;
                    int m21943b = this.f22408b.m21943b();
                    int i10 = this.f22409c;
                    if (m21943b < i10) {
                        this.f22408b.m21944c(Math.min(4098, Math.max(i10, this.f22408b.m21943b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c5357z.m21942a(), this.f22409c - this.f22410d);
                c5357z.m21953l(this.f22408b.m21946e(), this.f22410d, min2);
                int i11 = this.f22410d + min2;
                this.f22410d = i11;
                int i12 = this.f22409c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (!this.f22411e) {
                        this.f22408b.m21938S(i12);
                    } else {
                        if (AbstractC5330M.m21782x(this.f22408b.m21946e(), 0, this.f22409c, -1) != 0) {
                            this.f22412f = true;
                            return;
                        }
                        this.f22408b.m21938S(this.f22409c - 4);
                    }
                    this.f22408b.m21939T(0);
                    this.f22407a.mo26131a(this.f22408b);
                    this.f22410d = 0;
                }
            }
        }
    }

    @Override // p328r1.InterfaceC6259K
    /* renamed from: b */
    public void mo26134b() {
        this.f22412f = true;
    }

    @Override // p328r1.InterfaceC6259K
    /* renamed from: c */
    public void mo26135c(C5322E c5322e, InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        this.f22407a.mo26132c(c5322e, interfaceC0885t, dVar);
        this.f22412f = true;
    }
}
