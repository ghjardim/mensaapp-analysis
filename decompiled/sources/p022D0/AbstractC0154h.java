package p022D0;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0127M;
import p232g0.AbstractC4303I;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5511y;
import p335s0.AbstractC6355o;
import p335s0.InterfaceC6362v;

/* renamed from: D0.h */
/* loaded from: classes.dex */
public abstract class AbstractC0154h extends AbstractC0140a {

    /* renamed from: o */
    public final HashMap f642o = new HashMap();

    /* renamed from: p */
    public Handler f643p;

    /* renamed from: q */
    public InterfaceC5511y f644q;

    /* renamed from: D0.h$a */
    public final class a implements InterfaceC0127M, InterfaceC6362v {

        /* renamed from: a */
        public final Object f645a;

        /* renamed from: b */
        public InterfaceC0127M.a f646b;

        /* renamed from: c */
        public InterfaceC6362v.a f647c;

        public a(Object obj) {
            this.f646b = AbstractC0154h.this.m526x(null);
            this.f647c = AbstractC0154h.this.m524v(null);
            this.f645a = obj;
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: D */
        public /* synthetic */ void mo623D(int i7, InterfaceC0120F.b bVar) {
            AbstractC6355o.m26631a(this, i7, bVar);
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: E */
        public void mo624E(int i7, InterfaceC0120F.b bVar) {
            if (m627a(i7, bVar)) {
                this.f647c.m26641j();
            }
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: I */
        public void mo625I(int i7, InterfaceC0120F.b bVar) {
            if (m627a(i7, bVar)) {
                this.f647c.m26644m();
            }
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: K */
        public void mo347K(int i7, InterfaceC0120F.b bVar, C0116B c0116b) {
            if (m627a(i7, bVar)) {
                this.f646b.m366i(m629c(c0116b, bVar));
            }
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: O */
        public void mo626O(int i7, InterfaceC0120F.b bVar) {
            if (m627a(i7, bVar)) {
                this.f647c.m26639h();
            }
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: S */
        public void mo348S(int i7, InterfaceC0120F.b bVar, C0179y c0179y, C0116B c0116b) {
            if (m627a(i7, bVar)) {
                this.f646b.m375r(c0179y, m629c(c0116b, bVar));
            }
        }

        /* renamed from: a */
        public final boolean m627a(int i7, InterfaceC0120F.b bVar) {
            InterfaceC0120F.b bVar2;
            if (bVar != null) {
                bVar2 = AbstractC0154h.this.mo411G(this.f645a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int mo620I = AbstractC0154h.this.mo620I(this.f645a, i7);
            InterfaceC0127M.a aVar = this.f646b;
            if (aVar.f397a != mo620I || !AbstractC5330M.m21729c(aVar.f398b, bVar2)) {
                this.f646b = AbstractC0154h.this.m525w(mo620I, bVar2);
            }
            InterfaceC6362v.a aVar2 = this.f647c;
            if (aVar2.f23013a == mo620I && AbstractC5330M.m21729c(aVar2.f23014b, bVar2)) {
                return true;
            }
            this.f647c = AbstractC0154h.this.m523u(mo620I, bVar2);
            return true;
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: a0 */
        public void mo628a0(int i7, InterfaceC0120F.b bVar, Exception exc) {
            if (m627a(i7, bVar)) {
                this.f647c.m26643l(exc);
            }
        }

        /* renamed from: c */
        public final C0116B m629c(C0116B c0116b, InterfaceC0120F.b bVar) {
            long mo619H = AbstractC0154h.this.mo619H(this.f645a, c0116b.f365f, bVar);
            long mo619H2 = AbstractC0154h.this.mo619H(this.f645a, c0116b.f366g, bVar);
            return (mo619H == c0116b.f365f && mo619H2 == c0116b.f366g) ? c0116b : new C0116B(c0116b.f360a, c0116b.f361b, c0116b.f362c, c0116b.f363d, c0116b.f364e, mo619H, mo619H2);
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: d0 */
        public void mo349d0(int i7, InterfaceC0120F.b bVar, C0116B c0116b) {
            if (m627a(i7, bVar)) {
                this.f646b.m362D(m629c(c0116b, bVar));
            }
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: g0 */
        public void mo630g0(int i7, InterfaceC0120F.b bVar, int i8) {
            if (m627a(i7, bVar)) {
                this.f647c.m26642k(i8);
            }
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: h0 */
        public void mo350h0(int i7, InterfaceC0120F.b bVar, C0179y c0179y, C0116B c0116b) {
            if (m627a(i7, bVar)) {
                this.f646b.m378u(c0179y, m629c(c0116b, bVar));
            }
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: l0 */
        public void mo351l0(int i7, InterfaceC0120F.b bVar, C0179y c0179y, C0116B c0116b) {
            if (m627a(i7, bVar)) {
                this.f646b.m359A(c0179y, m629c(c0116b, bVar));
            }
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: m0 */
        public void mo631m0(int i7, InterfaceC0120F.b bVar) {
            if (m627a(i7, bVar)) {
                this.f647c.m26640i();
            }
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: n0 */
        public void mo352n0(int i7, InterfaceC0120F.b bVar, C0179y c0179y, C0116B c0116b, IOException iOException, boolean z6) {
            if (m627a(i7, bVar)) {
                this.f646b.m381x(c0179y, m629c(c0116b, bVar), iOException, z6);
            }
        }
    }

    /* renamed from: D0.h$b */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC0120F f649a;

        /* renamed from: b */
        public final InterfaceC0120F.c f650b;

        /* renamed from: c */
        public final a f651c;

        public b(InterfaceC0120F interfaceC0120F, InterfaceC0120F.c cVar, a aVar) {
            this.f649a = interfaceC0120F;
            this.f650b = cVar;
            this.f651c = aVar;
        }
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        this.f644q = interfaceC5511y;
        this.f643p = AbstractC5330M.m21671A();
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
        for (b bVar : this.f642o.values()) {
            bVar.f649a.mo337s(bVar.f650b);
            bVar.f649a.mo333l(bVar.f651c);
            bVar.f649a.mo338t(bVar.f651c);
        }
        this.f642o.clear();
    }

    /* renamed from: G */
    public abstract InterfaceC0120F.b mo411G(Object obj, InterfaceC0120F.b bVar);

    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract void m621J(Object obj, InterfaceC0120F interfaceC0120F, AbstractC4303I abstractC4303I);

    /* renamed from: L */
    public final void m622L(final Object obj, InterfaceC0120F interfaceC0120F) {
        AbstractC5332a.m21796a(!this.f642o.containsKey(obj));
        InterfaceC0120F.c cVar = new InterfaceC0120F.c() { // from class: D0.g
            @Override // p022D0.InterfaceC0120F.c
            /* renamed from: a */
            public final void mo346a(InterfaceC0120F interfaceC0120F2, AbstractC4303I abstractC4303I) {
                AbstractC0154h.this.m621J(obj, interfaceC0120F2, abstractC4303I);
            }
        };
        a aVar = new a(obj);
        this.f642o.put(obj, new b(interfaceC0120F, cVar, aVar));
        interfaceC0120F.mo328c((Handler) AbstractC5332a.m21800e(this.f643p), aVar);
        interfaceC0120F.mo329d((Handler) AbstractC5332a.m21800e(this.f643p), aVar);
        interfaceC0120F.mo330g(cVar, this.f644q, m520A());
        if (m521B()) {
            return;
        }
        interfaceC0120F.mo335p(cVar);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
        Iterator it = this.f642o.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f649a.mo298n();
        }
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: y */
    public void mo527y() {
        for (b bVar : this.f642o.values()) {
            bVar.f649a.mo335p(bVar.f650b);
        }
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: z */
    public void mo528z() {
        for (b bVar : this.f642o.values()) {
            bVar.f649a.mo332j(bVar.f650b);
        }
    }

    /* renamed from: I */
    public int mo620I(Object obj, int i7) {
        return i7;
    }

    /* renamed from: H */
    public long mo619H(Object obj, long j7, InterfaceC0120F.b bVar) {
        return j7;
    }
}
