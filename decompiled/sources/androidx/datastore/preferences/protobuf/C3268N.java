package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;
import p207d.AbstractC4094d;

/* renamed from: androidx.datastore.preferences.protobuf.N */
/* loaded from: classes.dex */
public final class C3268N implements InterfaceC3278Y {

    /* renamed from: a */
    public final InterfaceC3264J f10400a;

    /* renamed from: b */
    public final AbstractC3291f0 f10401b;

    /* renamed from: c */
    public final boolean f10402c;

    /* renamed from: d */
    public final AbstractC3305n f10403d;

    public C3268N(AbstractC3291f0 abstractC3291f0, AbstractC3305n abstractC3305n, InterfaceC3264J interfaceC3264J) {
        this.f10401b = abstractC3291f0;
        this.f10402c = abstractC3305n.mo12759e(interfaceC3264J);
        this.f10403d = abstractC3305n;
        this.f10400a = interfaceC3264J;
    }

    /* renamed from: i */
    private int m12172i(AbstractC3291f0 abstractC3291f0, Object obj) {
        return abstractC3291f0.mo12367i(abstractC3291f0.mo12365g(obj));
    }

    /* renamed from: j */
    private void m12173j(AbstractC3291f0 abstractC3291f0, AbstractC3305n abstractC3305n, Object obj, InterfaceC3277X interfaceC3277X, C3304m c3304m) {
        Object mo12364f = abstractC3291f0.mo12364f(obj);
        C3308q mo12758d = abstractC3305n.mo12758d(obj);
        do {
            try {
                if (interfaceC3277X.mo12229w() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC3291f0.mo12373o(obj, mo12364f);
            }
        } while (m12175l(interfaceC3277X, c3304m, abstractC3305n, mo12758d, abstractC3291f0, mo12364f));
    }

    /* renamed from: k */
    public static C3268N m12174k(AbstractC3291f0 abstractC3291f0, AbstractC3305n abstractC3305n, InterfaceC3264J interfaceC3264J) {
        return new C3268N(abstractC3291f0, abstractC3305n, interfaceC3264J);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    /* renamed from: a */
    public void mo12140a(Object obj, Object obj2) {
        AbstractC3281a0.m12245F(this.f10401b, obj, obj2);
        if (this.f10402c) {
            AbstractC3281a0.m12243D(this.f10403d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    /* renamed from: b */
    public void mo12142b(Object obj) {
        this.f10401b.mo12368j(obj);
        this.f10403d.mo12760f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    /* renamed from: c */
    public final boolean mo12144c(Object obj) {
        return this.f10403d.mo12757c(obj).m12783k();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    /* renamed from: d */
    public boolean mo12145d(Object obj, Object obj2) {
        if (!this.f10401b.mo12365g(obj).equals(this.f10401b.mo12365g(obj2))) {
            return false;
        }
        if (this.f10402c) {
            return this.f10403d.mo12757c(obj).equals(this.f10403d.mo12757c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    /* renamed from: e */
    public int mo12147e(Object obj) {
        int m12172i = m12172i(this.f10401b, obj);
        return this.f10402c ? m12172i + this.f10403d.mo12757c(obj).m12779f() : m12172i;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    /* renamed from: f */
    public int mo12149f(Object obj) {
        int hashCode = this.f10401b.mo12365g(obj).hashCode();
        return this.f10402c ? (hashCode * 53) + this.f10403d.mo12757c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    /* renamed from: g */
    public void mo12151g(Object obj, InterfaceC3277X interfaceC3277X, C3304m c3304m) {
        m12173j(this.f10401b, this.f10403d, obj, interfaceC3277X, c3304m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    /* renamed from: h */
    public void mo12153h(Object obj, InterfaceC3303l0 interfaceC3303l0) {
        Iterator m12784n = this.f10403d.mo12757c(obj).m12784n();
        if (m12784n.hasNext()) {
            AbstractC4094d.m17162a(((Map.Entry) m12784n.next()).getKey());
            throw null;
        }
        m12176m(this.f10401b, obj, interfaceC3303l0);
    }

    /* renamed from: l */
    public final boolean m12175l(InterfaceC3277X interfaceC3277X, C3304m c3304m, AbstractC3305n abstractC3305n, C3308q c3308q, AbstractC3291f0 abstractC3291f0, Object obj) {
        int mo12223q = interfaceC3277X.mo12223q();
        int i7 = 0;
        if (mo12223q != AbstractC3301k0.f10530a) {
            if (AbstractC3301k0.m12746b(mo12223q) != 2) {
                return interfaceC3277X.mo12195C();
            }
            Object mo12756b = abstractC3305n.mo12756b(c3304m, this.f10400a, AbstractC3301k0.m12745a(mo12223q));
            if (mo12756b == null) {
                return abstractC3291f0.m12371m(obj, interfaceC3277X, 0);
            }
            abstractC3305n.mo12762h(interfaceC3277X, mo12756b, c3304m, c3308q);
            return true;
        }
        Object obj2 = null;
        AbstractC3290f abstractC3290f = null;
        while (interfaceC3277X.mo12229w() != Integer.MAX_VALUE) {
            int mo12223q2 = interfaceC3277X.mo12223q();
            if (mo12223q2 == AbstractC3301k0.f10532c) {
                i7 = interfaceC3277X.mo12217k();
                obj2 = abstractC3305n.mo12756b(c3304m, this.f10400a, i7);
            } else if (mo12223q2 == AbstractC3301k0.f10533d) {
                if (obj2 != null) {
                    abstractC3305n.mo12762h(interfaceC3277X, obj2, c3304m, c3308q);
                } else {
                    abstractC3290f = interfaceC3277X.mo12232z();
                }
            } else if (!interfaceC3277X.mo12195C()) {
                break;
            }
        }
        if (interfaceC3277X.mo12223q() != AbstractC3301k0.f10531b) {
            throw C3313v.m12842b();
        }
        if (abstractC3290f != null) {
            if (obj2 != null) {
                abstractC3305n.mo12763i(abstractC3290f, obj2, c3304m, c3308q);
            } else {
                abstractC3291f0.mo12362d(obj, i7, abstractC3290f);
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void m12176m(AbstractC3291f0 abstractC3291f0, Object obj, InterfaceC3303l0 interfaceC3303l0) {
        abstractC3291f0.mo12377s(abstractC3291f0.mo12365g(obj), interfaceC3303l0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3278Y
    public Object newInstance() {
        InterfaceC3264J interfaceC3264J = this.f10400a;
        return interfaceC3264J instanceof AbstractC3311t ? ((AbstractC3311t) interfaceC3264J).m12811I() : interfaceC3264J.mo12095c().mo12097h();
    }
}
