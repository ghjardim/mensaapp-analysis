package p197b5;

import java.util.List;
import p232g0.AbstractC4296B;
import p232g0.AbstractC4299E;
import p232g0.AbstractC4303I;
import p232g0.C4297C;
import p232g0.C4306L;
import p232g0.C4310P;
import p232g0.C4312b;
import p232g0.C4322l;
import p232g0.C4331u;
import p232g0.C4333w;
import p232g0.C4334x;
import p232g0.InterfaceC4298D;
import p248i0.C4504b;
import p292n0.InterfaceC5763w;

/* renamed from: b5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3530a implements InterfaceC4298D.d {

    /* renamed from: a */
    public boolean f11933a = false;

    /* renamed from: b */
    public boolean f11934b = false;

    /* renamed from: c */
    public final InterfaceC5763w f11935c;

    /* renamed from: d */
    public final InterfaceC3550u f11936d;

    /* renamed from: b5.a$a */
    public enum a {
        ROTATE_0(0),
        ROTATE_90(90),
        ROTATE_180(180),
        ROTATE_270(270);


        /* renamed from: a */
        public final int f11942a;

        a(int i7) {
            this.f11942a = i7;
        }

        /* renamed from: f */
        public static a m14265f(int i7) {
            for (a aVar : values()) {
                if (aVar.f11942a == i7) {
                    return aVar;
                }
            }
            throw new IllegalArgumentException("Invalid rotation degrees specified: " + i7);
        }

        /* renamed from: g */
        public int m14266g() {
            return this.f11942a;
        }
    }

    public AbstractC3530a(InterfaceC5763w interfaceC5763w, InterfaceC3550u interfaceC3550u) {
        this.f11935c = interfaceC5763w;
        this.f11936d = interfaceC3550u;
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: A */
    public /* synthetic */ void mo14232A(int i7) {
        AbstractC4299E.m18011o(this, i7);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: B */
    public /* synthetic */ void mo14233B(boolean z6) {
        AbstractC4299E.m18005i(this, z6);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: C */
    public /* synthetic */ void mo14234C(int i7) {
        AbstractC4299E.m18014r(this, i7);
    }

    /* renamed from: D */
    public abstract void mo14235D();

    /* renamed from: E */
    public final void m14236E(boolean z6) {
        if (this.f11933a == z6) {
            return;
        }
        this.f11933a = z6;
        if (z6) {
            this.f11936d.mo14329f();
        } else {
            this.f11936d.mo14328e();
        }
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: F */
    public /* synthetic */ void mo14237F(C4312b c4312b) {
        AbstractC4299E.m17997a(this, c4312b);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: G */
    public /* synthetic */ void mo14238G(boolean z6) {
        AbstractC4299E.m18004h(this, z6);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: H */
    public /* synthetic */ void mo14239H(float f7) {
        AbstractC4299E.m17996A(this, f7);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: J */
    public void mo14240J(int i7) {
        if (i7 == 2) {
            m14236E(true);
            this.f11936d.mo14324a(this.f11935c.mo17987y());
        } else if (i7 != 3) {
            if (i7 == 4) {
                this.f11936d.mo14330g();
            }
        } else if (!this.f11934b) {
            this.f11934b = true;
            mo14235D();
        }
        if (i7 != 2) {
            m14236E(false);
        }
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: M */
    public void mo14241M(AbstractC4296B abstractC4296B) {
        m14236E(false);
        if (abstractC4296B.f14762a == 1002) {
            this.f11935c.mo17977o();
            this.f11935c.mo17968f();
            return;
        }
        this.f11936d.mo14327d("VideoError", "Video player had error " + abstractC4296B, null);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: P */
    public /* synthetic */ void mo14242P(AbstractC4296B abstractC4296B) {
        AbstractC4299E.m18012p(this, abstractC4296B);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: Q */
    public /* synthetic */ void mo14243Q(InterfaceC4298D interfaceC4298D, InterfaceC4298D.c cVar) {
        AbstractC4299E.m18003g(this, interfaceC4298D, cVar);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: R */
    public /* synthetic */ void mo14244R(AbstractC4303I abstractC4303I, int i7) {
        AbstractC4299E.m18020x(this, abstractC4303I, i7);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: T */
    public /* synthetic */ void mo14245T(int i7, boolean z6) {
        AbstractC4299E.m18002f(this, i7, z6);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: V */
    public /* synthetic */ void mo14246V(boolean z6, int i7) {
        AbstractC4299E.m18013q(this, z6, i7);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: W */
    public /* synthetic */ void mo14247W(C4331u c4331u, int i7) {
        AbstractC4299E.m18006j(this, c4331u, i7);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: X */
    public /* synthetic */ void mo14248X(int i7) {
        AbstractC4299E.m18017u(this, i7);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: Y */
    public /* synthetic */ void mo14249Y() {
        AbstractC4299E.m18016t(this);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: a */
    public /* synthetic */ void mo14250a(C4310P c4310p) {
        AbstractC4299E.m18022z(this, c4310p);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: b0 */
    public /* synthetic */ void mo14251b0(boolean z6, int i7) {
        AbstractC4299E.m18009m(this, z6, i7);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: c */
    public /* synthetic */ void mo14252c(boolean z6) {
        AbstractC4299E.m18018v(this, z6);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: c0 */
    public /* synthetic */ void mo14253c0(C4306L c4306l) {
        AbstractC4299E.m18021y(this, c4306l);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: e0 */
    public /* synthetic */ void mo14254e0(C4333w c4333w) {
        AbstractC4299E.m18007k(this, c4333w);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: f0 */
    public /* synthetic */ void mo14255f0(InterfaceC4298D.b bVar) {
        AbstractC4299E.m17998b(this, bVar);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: j0 */
    public /* synthetic */ void mo14256j0(C4322l c4322l) {
        AbstractC4299E.m18001e(this, c4322l);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: k0 */
    public /* synthetic */ void mo14257k0(int i7, int i8) {
        AbstractC4299E.m18019w(this, i7, i8);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: o */
    public /* synthetic */ void mo14258o(C4334x c4334x) {
        AbstractC4299E.m18008l(this, c4334x);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: o0 */
    public /* synthetic */ void mo14259o0(InterfaceC4298D.e eVar, InterfaceC4298D.e eVar2, int i7) {
        AbstractC4299E.m18015s(this, eVar, eVar2, i7);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: p */
    public /* synthetic */ void mo14260p(C4297C c4297c) {
        AbstractC4299E.m18010n(this, c4297c);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: p0 */
    public void mo14261p0(boolean z6) {
        this.f11936d.mo14325b(z6);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: t */
    public /* synthetic */ void mo14262t(List list) {
        AbstractC4299E.m18000d(this, list);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: y */
    public /* synthetic */ void mo14263y(C4504b c4504b) {
        AbstractC4299E.m17999c(this, c4504b);
    }
}
