package com.google.protobuf;

/* renamed from: com.google.protobuf.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC4082v0 {

    /* renamed from: a */
    public static volatile int f13588a = 100;

    /* renamed from: a */
    public abstract void mo16965a(Object obj, int i7, int i8);

    /* renamed from: b */
    public abstract void mo16966b(Object obj, int i7, long j7);

    /* renamed from: c */
    public abstract void mo16967c(Object obj, int i7, Object obj2);

    /* renamed from: d */
    public abstract void mo16968d(Object obj, int i7, AbstractC4055i abstractC4055i);

    /* renamed from: e */
    public abstract void mo16969e(Object obj, int i7, long j7);

    /* renamed from: f */
    public abstract Object mo16970f(Object obj);

    /* renamed from: g */
    public abstract Object mo16971g(Object obj);

    /* renamed from: h */
    public abstract int mo16972h(Object obj);

    /* renamed from: i */
    public abstract int mo16973i(Object obj);

    /* renamed from: j */
    public abstract void mo16974j(Object obj);

    /* renamed from: k */
    public abstract Object mo16975k(Object obj, Object obj2);

    /* renamed from: l */
    public final void m16976l(Object obj, InterfaceC4062l0 interfaceC4062l0, int i7) {
        while (interfaceC4062l0.mo16676w() != Integer.MAX_VALUE && m16977m(obj, interfaceC4062l0, i7)) {
        }
    }

    /* renamed from: m */
    public final boolean m16977m(Object obj, InterfaceC4062l0 interfaceC4062l0, int i7) {
        int mo16670q = interfaceC4062l0.mo16670q();
        int m16178a = AbstractC4014B0.m16178a(mo16670q);
        int m16179b = AbstractC4014B0.m16179b(mo16670q);
        if (m16179b == 0) {
            mo16969e(obj, m16178a, interfaceC4062l0.mo16635G());
            return true;
        }
        if (m16179b == 1) {
            mo16966b(obj, m16178a, interfaceC4062l0.mo16656c());
            return true;
        }
        if (m16179b == 2) {
            mo16968d(obj, m16178a, interfaceC4062l0.mo16679z());
            return true;
        }
        if (m16179b != 3) {
            if (m16179b == 4) {
                return false;
            }
            if (m16179b != 5) {
                throw C4017D.m16240e();
            }
            mo16965a(obj, m16178a, interfaceC4062l0.mo16660g());
            return true;
        }
        Object mo16978n = mo16978n();
        int m16180c = AbstractC4014B0.m16180c(m16178a, 4);
        int i8 = i7 + 1;
        if (i8 >= f13588a) {
            throw C4017D.m16244i();
        }
        m16976l(mo16978n, interfaceC4062l0, i8);
        if (m16180c != interfaceC4062l0.mo16670q()) {
            throw C4017D.m16237b();
        }
        mo16967c(obj, m16178a, mo16982r(mo16978n));
        return true;
    }

    /* renamed from: n */
    public abstract Object mo16978n();

    /* renamed from: o */
    public abstract void mo16979o(Object obj, Object obj2);

    /* renamed from: p */
    public abstract void mo16980p(Object obj, Object obj2);

    /* renamed from: q */
    public abstract boolean mo16981q(InterfaceC4062l0 interfaceC4062l0);

    /* renamed from: r */
    public abstract Object mo16982r(Object obj);

    /* renamed from: s */
    public abstract void mo16983s(Object obj, InterfaceC4016C0 interfaceC4016C0);

    /* renamed from: t */
    public abstract void mo16984t(Object obj, InterfaceC4016C0 interfaceC4016C0);
}
