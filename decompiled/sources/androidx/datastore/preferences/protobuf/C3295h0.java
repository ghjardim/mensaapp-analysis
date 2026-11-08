package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.h0 */
/* loaded from: classes.dex */
public class C3295h0 extends AbstractC3291f0 {
    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C3293g0 mo12365g(Object obj) {
        return ((AbstractC3311t) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo12366h(C3293g0 c3293g0) {
        return c3293g0.m12455d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo12367i(C3293g0 c3293g0) {
        return c3293g0.m12456e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3293g0 mo12369k(C3293g0 c3293g0, C3293g0 c3293g02) {
        return C3293g0.m12445c().equals(c3293g02) ? c3293g0 : C3293g0.m12445c().equals(c3293g0) ? C3293g0.m12448j(c3293g0, c3293g02) : c3293g0.m12458i(c3293g02);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3293g0 mo12372n() {
        return C3293g0.m12449k();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo12373o(Object obj, C3293g0 c3293g0) {
        mo12374p(obj, c3293g0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo12374p(Object obj, C3293g0 c3293g0) {
        ((AbstractC3311t) obj).unknownFields = c3293g0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public C3293g0 mo12376r(C3293g0 c3293g0) {
        c3293g0.m12457h();
        return c3293g0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo12377s(C3293g0 c3293g0, InterfaceC3303l0 interfaceC3303l0) {
        c3293g0.m12461p(interfaceC3303l0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo12378t(C3293g0 c3293g0, InterfaceC3303l0 interfaceC3303l0) {
        c3293g0.m12462r(interfaceC3303l0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: j */
    public void mo12368j(Object obj) {
        mo12365g(obj).m12457h();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: q */
    public boolean mo12375q(InterfaceC3277X interfaceC3277X) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo12359a(C3293g0 c3293g0, int i7, int i8) {
        c3293g0.m12460n(AbstractC3301k0.m12747c(i7, 5), Integer.valueOf(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo12360b(C3293g0 c3293g0, int i7, long j7) {
        c3293g0.m12460n(AbstractC3301k0.m12747c(i7, 1), Long.valueOf(j7));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo12361c(C3293g0 c3293g0, int i7, C3293g0 c3293g02) {
        c3293g0.m12460n(AbstractC3301k0.m12747c(i7, 3), c3293g02);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo12362d(C3293g0 c3293g0, int i7, AbstractC3290f abstractC3290f) {
        c3293g0.m12460n(AbstractC3301k0.m12747c(i7, 2), abstractC3290f);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo12363e(C3293g0 c3293g0, int i7, long j7) {
        c3293g0.m12460n(AbstractC3301k0.m12747c(i7, 0), Long.valueOf(j7));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3291f0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C3293g0 mo12364f(Object obj) {
        C3293g0 mo12365g = mo12365g(obj);
        if (mo12365g != C3293g0.m12445c()) {
            return mo12365g;
        }
        C3293g0 m12449k = C3293g0.m12449k();
        mo12374p(obj, m12449k);
        return m12449k;
    }
}
