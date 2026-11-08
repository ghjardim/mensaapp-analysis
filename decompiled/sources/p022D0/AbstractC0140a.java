package p022D0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0127M;
import p232g0.AbstractC4303I;
import p232g0.C4331u;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5511y;
import p300o0.C5912w1;
import p335s0.InterfaceC6362v;

/* renamed from: D0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0140a implements InterfaceC0120F {

    /* renamed from: a */
    public final ArrayList f527a = new ArrayList(1);

    /* renamed from: b */
    public final HashSet f528b = new HashSet(1);

    /* renamed from: c */
    public final InterfaceC0127M.a f529c = new InterfaceC0127M.a();

    /* renamed from: d */
    public final InterfaceC6362v.a f530d = new InterfaceC6362v.a();

    /* renamed from: e */
    public Looper f531e;

    /* renamed from: f */
    public AbstractC4303I f532f;

    /* renamed from: n */
    public C5912w1 f533n;

    /* renamed from: A */
    public final C5912w1 m520A() {
        return (C5912w1) AbstractC5332a.m21804i(this.f533n);
    }

    /* renamed from: B */
    public final boolean m521B() {
        return !this.f528b.isEmpty();
    }

    /* renamed from: C */
    public abstract void mo410C(InterfaceC5511y interfaceC5511y);

    /* renamed from: D */
    public final void m522D(AbstractC4303I abstractC4303I) {
        this.f532f = abstractC4303I;
        Iterator it = this.f527a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0120F.c) it.next()).mo346a(this, abstractC4303I);
        }
    }

    /* renamed from: E */
    public abstract void mo286E();

    @Override // p022D0.InterfaceC0120F
    /* renamed from: a */
    public /* synthetic */ void mo294a(C4331u c4331u) {
        AbstractC0118D.m325c(this, c4331u);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: c */
    public final void mo328c(Handler handler, InterfaceC0127M interfaceC0127M) {
        AbstractC5332a.m21800e(handler);
        AbstractC5332a.m21800e(interfaceC0127M);
        this.f529c.m364g(handler, interfaceC0127M);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: d */
    public final void mo329d(Handler handler, InterfaceC6362v interfaceC6362v) {
        AbstractC5332a.m21800e(handler);
        AbstractC5332a.m21800e(interfaceC6362v);
        this.f530d.m26638g(handler, interfaceC6362v);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: g */
    public final void mo330g(InterfaceC0120F.c cVar, InterfaceC5511y interfaceC5511y, C5912w1 c5912w1) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f531e;
        AbstractC5332a.m21796a(looper == null || looper == myLooper);
        this.f533n = c5912w1;
        AbstractC4303I abstractC4303I = this.f532f;
        this.f527a.add(cVar);
        if (this.f531e == null) {
            this.f531e = myLooper;
            this.f528b.add(cVar);
            mo410C(interfaceC5511y);
        } else if (abstractC4303I != null) {
            mo332j(cVar);
            cVar.mo346a(this, abstractC4303I);
        }
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: j */
    public final void mo332j(InterfaceC0120F.c cVar) {
        AbstractC5332a.m21800e(this.f531e);
        boolean isEmpty = this.f528b.isEmpty();
        this.f528b.add(cVar);
        if (isEmpty) {
            mo528z();
        }
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: l */
    public final void mo333l(InterfaceC0127M interfaceC0127M) {
        this.f529c.m360B(interfaceC0127M);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: o */
    public /* synthetic */ boolean mo334o() {
        return AbstractC0118D.m324b(this);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: p */
    public final void mo335p(InterfaceC0120F.c cVar) {
        boolean isEmpty = this.f528b.isEmpty();
        this.f528b.remove(cVar);
        if (isEmpty || !this.f528b.isEmpty()) {
            return;
        }
        mo527y();
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: q */
    public /* synthetic */ AbstractC4303I mo336q() {
        return AbstractC0118D.m323a(this);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: s */
    public final void mo337s(InterfaceC0120F.c cVar) {
        this.f527a.remove(cVar);
        if (!this.f527a.isEmpty()) {
            mo335p(cVar);
            return;
        }
        this.f531e = null;
        this.f532f = null;
        this.f533n = null;
        this.f528b.clear();
        mo286E();
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: t */
    public final void mo338t(InterfaceC6362v interfaceC6362v) {
        this.f530d.m26651t(interfaceC6362v);
    }

    /* renamed from: u */
    public final InterfaceC6362v.a m523u(int i7, InterfaceC0120F.b bVar) {
        return this.f530d.m26652u(i7, bVar);
    }

    /* renamed from: v */
    public final InterfaceC6362v.a m524v(InterfaceC0120F.b bVar) {
        return this.f530d.m26652u(0, bVar);
    }

    /* renamed from: w */
    public final InterfaceC0127M.a m525w(int i7, InterfaceC0120F.b bVar) {
        return this.f529c.m363E(i7, bVar);
    }

    /* renamed from: x */
    public final InterfaceC0127M.a m526x(InterfaceC0120F.b bVar) {
        return this.f529c.m363E(0, bVar);
    }

    /* renamed from: y */
    public void mo527y() {
    }

    /* renamed from: z */
    public void mo528z() {
    }
}
