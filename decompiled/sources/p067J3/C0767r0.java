package p067J3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p088M3.C1176r;
import p088M3.C1178t;
import p095N3.C1264d;
import p095N3.C1265e;
import p095N3.InterfaceC1276p;
import p256j$.util.DesugarCollections;

/* renamed from: J3.r0 */
/* loaded from: classes.dex */
public class C0767r0 {

    /* renamed from: a */
    public final EnumC0775v0 f2740a;

    /* renamed from: b */
    public final Set f2741b = new HashSet();

    /* renamed from: c */
    public final ArrayList f2742c = new ArrayList();

    public C0767r0(EnumC0775v0 enumC0775v0) {
        this.f2740a = enumC0775v0;
    }

    /* renamed from: b */
    public void m3287b(C1176r c1176r) {
        this.f2741b.add(c1176r);
    }

    /* renamed from: c */
    public void m3288c(C1176r c1176r, InterfaceC1276p interfaceC1276p) {
        this.f2742c.add(new C1265e(c1176r, interfaceC1276p));
    }

    /* renamed from: d */
    public boolean m3289d(C1176r c1176r) {
        Iterator it = this.f2741b.iterator();
        while (it.hasNext()) {
            if (c1176r.m4470p((C1176r) it.next())) {
                return true;
            }
        }
        Iterator it2 = this.f2742c.iterator();
        while (it2.hasNext()) {
            if (c1176r.m4470p(((C1265e) it2.next()).m4830a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public List m3290e() {
        return this.f2742c;
    }

    /* renamed from: f */
    public C0769s0 m3291f() {
        return new C0769s0(this, C1176r.f3774c, false, null);
    }

    /* renamed from: g */
    public C0771t0 m3292g(C1178t c1178t) {
        return new C0771t0(c1178t, C1264d.m4827b(this.f2741b), DesugarCollections.unmodifiableList(this.f2742c));
    }

    /* renamed from: h */
    public C0771t0 m3293h(C1178t c1178t, C1264d c1264d) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2742c.iterator();
        while (it.hasNext()) {
            C1265e c1265e = (C1265e) it.next();
            if (c1264d.m4828a(c1265e.m4830a())) {
                arrayList.add(c1265e);
            }
        }
        return new C0771t0(c1178t, c1264d, DesugarCollections.unmodifiableList(arrayList));
    }

    /* renamed from: i */
    public C0771t0 m3294i(C1178t c1178t) {
        return new C0771t0(c1178t, null, DesugarCollections.unmodifiableList(this.f2742c));
    }

    /* renamed from: j */
    public C0773u0 m3295j(C1178t c1178t) {
        return new C0773u0(c1178t, C1264d.m4827b(this.f2741b), DesugarCollections.unmodifiableList(this.f2742c));
    }
}
