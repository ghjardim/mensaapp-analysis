package p081L3;

import java.util.HashMap;
import java.util.Map;
import p053H3.C0564j;
import p081L3.C1041Q;
import p116Q3.AbstractC2133b;
import p116Q3.InterfaceC2123A;

/* renamed from: L3.c0 */
/* loaded from: classes.dex */
public final class C1067c0 extends AbstractC1085i0 {

    /* renamed from: j */
    public InterfaceC1100n0 f3512j;

    /* renamed from: k */
    public boolean f3513k;

    /* renamed from: c */
    public final C1052W f3505c = new C1052W();

    /* renamed from: d */
    public final Map f3506d = new HashMap();

    /* renamed from: f */
    public final C1054X f3508f = new C1054X();

    /* renamed from: g */
    public final C1073e0 f3509g = new C1073e0(this);

    /* renamed from: h */
    public final C1046T f3510h = new C1046T();

    /* renamed from: i */
    public final C1070d0 f3511i = new C1070d0();

    /* renamed from: e */
    public final Map f3507e = new HashMap();

    /* renamed from: o */
    public static C1067c0 m4211o() {
        C1067c0 c1067c0 = new C1067c0();
        c1067c0.m4231u(new C1050V(c1067c0));
        return c1067c0;
    }

    /* renamed from: p */
    public static C1067c0 m4212p(C1041Q.b bVar, C1105p c1105p) {
        C1067c0 c1067c0 = new C1067c0();
        c1067c0.m4231u(new C1058Z(c1067c0, bVar, c1105p));
        return c1067c0;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: a */
    public InterfaceC1060a mo4213a() {
        return this.f3510h;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: b */
    public InterfaceC1063b mo4214b(C0564j c0564j) {
        C1048U c1048u = (C1048U) this.f3507e.get(c0564j);
        if (c1048u != null) {
            return c1048u;
        }
        C1048U c1048u2 = new C1048U();
        this.f3507e.put(c0564j, c1048u2);
        return c1048u2;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: c */
    public InterfaceC1078g mo4215c() {
        return this.f3505c;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: e */
    public InterfaceC1076f0 mo4217e(C0564j c0564j, InterfaceC1096m interfaceC1096m) {
        C1061a0 c1061a0 = (C1061a0) this.f3506d.get(c0564j);
        if (c1061a0 != null) {
            return c1061a0;
        }
        C1061a0 c1061a02 = new C1061a0(this, c0564j);
        this.f3506d.put(c0564j, c1061a02);
        return c1061a02;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: f */
    public InterfaceC1079g0 mo4218f() {
        return new C1064b0();
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: g */
    public InterfaceC1100n0 mo4219g() {
        return this.f3512j;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: j */
    public boolean mo4222j() {
        return this.f3513k;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: k */
    public Object mo4223k(String str, InterfaceC2123A interfaceC2123A) {
        this.f3512j.mo4100d();
        try {
            return interfaceC2123A.get();
        } finally {
            this.f3512j.mo4099b();
        }
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: l */
    public void mo4224l(String str, Runnable runnable) {
        this.f3512j.mo4100d();
        try {
            runnable.run();
        } finally {
            this.f3512j.mo4099b();
        }
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: m */
    public void mo4225m() {
        AbstractC2133b.m7217d(this.f3513k, "MemoryPersistence shutdown without start", new Object[0]);
        this.f3513k = false;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: n */
    public void mo4226n() {
        AbstractC2133b.m7217d(!this.f3513k, "MemoryPersistence double-started!", new Object[0]);
        this.f3513k = true;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C1054X mo4216d(C0564j c0564j) {
        return this.f3508f;
    }

    /* renamed from: r */
    public Iterable m4228r() {
        return this.f3506d.values();
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C1070d0 mo4220h() {
        return this.f3511i;
    }

    @Override // p081L3.AbstractC1085i0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C1073e0 mo4221i() {
        return this.f3509g;
    }

    /* renamed from: u */
    public final void m4231u(InterfaceC1100n0 interfaceC1100n0) {
        this.f3512j = interfaceC1100n0;
    }
}
