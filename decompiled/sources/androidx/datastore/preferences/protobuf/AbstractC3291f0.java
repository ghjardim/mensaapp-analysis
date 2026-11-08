package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC3291f0 {

    /* renamed from: a */
    public static volatile int f10459a = 100;

    /* renamed from: a */
    public abstract void mo12359a(Object obj, int i7, int i8);

    /* renamed from: b */
    public abstract void mo12360b(Object obj, int i7, long j7);

    /* renamed from: c */
    public abstract void mo12361c(Object obj, int i7, Object obj2);

    /* renamed from: d */
    public abstract void mo12362d(Object obj, int i7, AbstractC3290f abstractC3290f);

    /* renamed from: e */
    public abstract void mo12363e(Object obj, int i7, long j7);

    /* renamed from: f */
    public abstract Object mo12364f(Object obj);

    /* renamed from: g */
    public abstract Object mo12365g(Object obj);

    /* renamed from: h */
    public abstract int mo12366h(Object obj);

    /* renamed from: i */
    public abstract int mo12367i(Object obj);

    /* renamed from: j */
    public abstract void mo12368j(Object obj);

    /* renamed from: k */
    public abstract Object mo12369k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m12370l(Object obj, InterfaceC3277X interfaceC3277X, int i7) {
        while (interfaceC3277X.mo12229w() != Integer.MAX_VALUE && m12371m(obj, interfaceC3277X, i7)) {
        }
    }

    /* renamed from: m */
    public final boolean m12371m(Object obj, InterfaceC3277X interfaceC3277X, int i7) {
        int mo12223q = interfaceC3277X.mo12223q();
        int m12745a = AbstractC3301k0.m12745a(mo12223q);
        int m12746b = AbstractC3301k0.m12746b(mo12223q);
        if (m12746b == 0) {
            mo12363e(obj, m12745a, interfaceC3277X.mo12199G());
            return true;
        }
        if (m12746b == 1) {
            mo12360b(obj, m12745a, interfaceC3277X.mo12209c());
            return true;
        }
        if (m12746b == 2) {
            mo12362d(obj, m12745a, interfaceC3277X.mo12232z());
            return true;
        }
        if (m12746b != 3) {
            if (m12746b == 4) {
                return false;
            }
            if (m12746b != 5) {
                throw C3313v.m12845e();
            }
            mo12359a(obj, m12745a, interfaceC3277X.mo12213g());
            return true;
        }
        Object mo12372n = mo12372n();
        int m12747c = AbstractC3301k0.m12747c(m12745a, 4);
        int i8 = i7 + 1;
        if (i8 >= f10459a) {
            throw C3313v.m12849i();
        }
        m12370l(mo12372n, interfaceC3277X, i8);
        if (m12747c != interfaceC3277X.mo12223q()) {
            throw C3313v.m12842b();
        }
        mo12361c(obj, m12745a, mo12376r(mo12372n));
        return true;
    }

    /* renamed from: n */
    public abstract Object mo12372n();

    /* renamed from: o */
    public abstract void mo12373o(Object obj, Object obj2);

    /* renamed from: p */
    public abstract void mo12374p(Object obj, Object obj2);

    /* renamed from: q */
    public abstract boolean mo12375q(InterfaceC3277X interfaceC3277X);

    /* renamed from: r */
    public abstract Object mo12376r(Object obj);

    /* renamed from: s */
    public abstract void mo12377s(Object obj, InterfaceC3303l0 interfaceC3303l0);

    /* renamed from: t */
    public abstract void mo12378t(Object obj, InterfaceC3303l0 interfaceC3303l0);
}
