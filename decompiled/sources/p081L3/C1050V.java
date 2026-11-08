package p081L3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p088M3.C1170l;

/* renamed from: L3.V */
/* loaded from: classes.dex */
public class C1050V implements InterfaceC1100n0 {

    /* renamed from: a */
    public C1103o0 f3471a;

    /* renamed from: b */
    public final C1067c0 f3472b;

    /* renamed from: c */
    public Set f3473c;

    public C1050V(C1067c0 c1067c0) {
        this.f3472b = c1067c0;
    }

    /* renamed from: a */
    public final boolean m4157a(C1170l c1170l) {
        if (this.f3472b.mo4221i().m4258k(c1170l) || m4158c(c1170l)) {
            return true;
        }
        C1103o0 c1103o0 = this.f3471a;
        return c1103o0 != null && c1103o0.m4365c(c1170l);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: b */
    public void mo4099b() {
        C1070d0 mo4220h = this.f3472b.mo4220h();
        ArrayList arrayList = new ArrayList();
        for (C1170l c1170l : this.f3473c) {
            if (!m4157a(c1170l)) {
                arrayList.add(c1170l);
            }
        }
        mo4220h.removeAll(arrayList);
        this.f3473c = null;
    }

    /* renamed from: c */
    public final boolean m4158c(C1170l c1170l) {
        Iterator it = this.f3472b.m4228r().iterator();
        while (it.hasNext()) {
            if (((C1061a0) it.next()).m4205l(c1170l)) {
                return true;
            }
        }
        return false;
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: d */
    public void mo4100d() {
        this.f3473c = new HashSet();
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: e */
    public long mo4101e() {
        return -1L;
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: f */
    public void mo4102f(C1170l c1170l) {
        if (m4157a(c1170l)) {
            this.f3473c.remove(c1170l);
        } else {
            this.f3473c.add(c1170l);
        }
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: i */
    public void mo4103i(C1170l c1170l) {
        this.f3473c.add(c1170l);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: j */
    public void mo4104j(C1170l c1170l) {
        this.f3473c.add(c1170l);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: k */
    public void mo4105k(C1038O1 c1038o1) {
        C1073e0 mo4221i = this.f3472b.mo4221i();
        Iterator it = mo4221i.mo4071g(c1038o1.m4119h()).iterator();
        while (it.hasNext()) {
            this.f3473c.add((C1170l) it.next());
        }
        mo4221i.m4264q(c1038o1);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: n */
    public void mo4106n(C1170l c1170l) {
        this.f3473c.remove(c1170l);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: o */
    public void mo4107o(C1103o0 c1103o0) {
        this.f3471a = c1103o0;
    }
}
