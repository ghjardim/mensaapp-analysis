package p376x3;

import java.util.Comparator;
import p376x3.InterfaceC6953h;

/* renamed from: x3.j */
/* loaded from: classes.dex */
public abstract class AbstractC6955j implements InterfaceC6953h {

    /* renamed from: a */
    public final Object f24869a;

    /* renamed from: b */
    public final Object f24870b;

    /* renamed from: c */
    public InterfaceC6953h f24871c;

    /* renamed from: d */
    public final InterfaceC6953h f24872d;

    public AbstractC6955j(Object obj, Object obj2, InterfaceC6953h interfaceC6953h, InterfaceC6953h interfaceC6953h2) {
        this.f24869a = obj;
        this.f24870b = obj2;
        this.f24871c = interfaceC6953h == null ? C6952g.m28479i() : interfaceC6953h;
        this.f24872d = interfaceC6953h2 == null ? C6952g.m28479i() : interfaceC6953h2;
    }

    /* renamed from: p */
    public static InterfaceC6953h.a m28487p(InterfaceC6953h interfaceC6953h) {
        return interfaceC6953h.mo28475e() ? InterfaceC6953h.a.BLACK : InterfaceC6953h.a.RED;
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: b */
    public InterfaceC6953h mo28481b() {
        return this.f24871c;
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: c */
    public InterfaceC6953h mo28482c(Object obj, Object obj2, Comparator comparator) {
        int compare = comparator.compare(obj, this.f24869a);
        return (compare < 0 ? mo28476k(null, null, this.f24871c.mo28482c(obj, obj2, comparator), null) : compare == 0 ? mo28476k(obj, obj2, null, null) : mo28476k(null, null, null, this.f24872d.mo28482c(obj, obj2, comparator))).m28490l();
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: d */
    public InterfaceC6953h mo28483d(Object obj, Comparator comparator) {
        AbstractC6955j mo28476k;
        if (comparator.compare(obj, this.f24869a) < 0) {
            AbstractC6955j m28491n = (this.f24871c.isEmpty() || this.f24871c.mo28475e() || ((AbstractC6955j) this.f24871c).f24871c.mo28475e()) ? this : m28491n();
            mo28476k = m28491n.mo28476k(null, null, m28491n.f24871c.mo28483d(obj, comparator), null);
        } else {
            AbstractC6955j m28495s = this.f24871c.mo28475e() ? m28495s() : this;
            if (!m28495s.f24872d.isEmpty() && !m28495s.f24872d.mo28475e() && !((AbstractC6955j) m28495s.f24872d).f24871c.mo28475e()) {
                m28495s = m28495s.m28492o();
            }
            if (comparator.compare(obj, m28495s.f24869a) == 0) {
                if (m28495s.f24872d.isEmpty()) {
                    return C6952g.m28479i();
                }
                InterfaceC6953h mo28485g = m28495s.f24872d.mo28485g();
                m28495s = m28495s.mo28476k(mo28485g.getKey(), mo28485g.getValue(), null, ((AbstractC6955j) m28495s.f24872d).m28493q());
            }
            mo28476k = m28495s.mo28476k(null, null, null, m28495s.f24872d.mo28483d(obj, comparator));
        }
        return mo28476k.m28490l();
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: f */
    public InterfaceC6953h mo28484f() {
        return this.f24872d;
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: g */
    public InterfaceC6953h mo28485g() {
        return this.f24871c.isEmpty() ? this : this.f24871c.mo28485g();
    }

    @Override // p376x3.InterfaceC6953h
    public Object getKey() {
        return this.f24869a;
    }

    @Override // p376x3.InterfaceC6953h
    public Object getValue() {
        return this.f24870b;
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: h */
    public InterfaceC6953h mo28486h() {
        return this.f24872d.isEmpty() ? this : this.f24872d.mo28486h();
    }

    /* renamed from: i */
    public final AbstractC6955j m28488i() {
        InterfaceC6953h interfaceC6953h = this.f24871c;
        InterfaceC6953h mo28480a = interfaceC6953h.mo28480a(null, null, m28487p(interfaceC6953h), null, null);
        InterfaceC6953h interfaceC6953h2 = this.f24872d;
        return mo28480a(null, null, m28487p(this), mo28480a, interfaceC6953h2.mo28480a(null, null, m28487p(interfaceC6953h2), null, null));
    }

    @Override // p376x3.InterfaceC6953h
    public boolean isEmpty() {
        return false;
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC6955j mo28480a(Object obj, Object obj2, InterfaceC6953h.a aVar, InterfaceC6953h interfaceC6953h, InterfaceC6953h interfaceC6953h2) {
        if (obj == null) {
            obj = this.f24869a;
        }
        if (obj2 == null) {
            obj2 = this.f24870b;
        }
        if (interfaceC6953h == null) {
            interfaceC6953h = this.f24871c;
        }
        if (interfaceC6953h2 == null) {
            interfaceC6953h2 = this.f24872d;
        }
        return aVar == InterfaceC6953h.a.RED ? new C6954i(obj, obj2, interfaceC6953h, interfaceC6953h2) : new C6951f(obj, obj2, interfaceC6953h, interfaceC6953h2);
    }

    /* renamed from: k */
    public abstract AbstractC6955j mo28476k(Object obj, Object obj2, InterfaceC6953h interfaceC6953h, InterfaceC6953h interfaceC6953h2);

    /* renamed from: l */
    public final AbstractC6955j m28490l() {
        AbstractC6955j m28494r = (!this.f24872d.mo28475e() || this.f24871c.mo28475e()) ? this : m28494r();
        if (m28494r.f24871c.mo28475e() && ((AbstractC6955j) m28494r.f24871c).f24871c.mo28475e()) {
            m28494r = m28494r.m28495s();
        }
        return (m28494r.f24871c.mo28475e() && m28494r.f24872d.mo28475e()) ? m28494r.m28488i() : m28494r;
    }

    /* renamed from: m */
    public abstract InterfaceC6953h.a mo28477m();

    /* renamed from: n */
    public final AbstractC6955j m28491n() {
        AbstractC6955j m28488i = m28488i();
        return m28488i.mo28484f().mo28481b().mo28475e() ? m28488i.mo28476k(null, null, null, ((AbstractC6955j) m28488i.mo28484f()).m28495s()).m28494r().m28488i() : m28488i;
    }

    /* renamed from: o */
    public final AbstractC6955j m28492o() {
        AbstractC6955j m28488i = m28488i();
        return m28488i.mo28481b().mo28481b().mo28475e() ? m28488i.m28495s().m28488i() : m28488i;
    }

    /* renamed from: q */
    public final InterfaceC6953h m28493q() {
        if (this.f24871c.isEmpty()) {
            return C6952g.m28479i();
        }
        AbstractC6955j m28491n = (mo28481b().mo28475e() || mo28481b().mo28481b().mo28475e()) ? this : m28491n();
        return m28491n.mo28476k(null, null, ((AbstractC6955j) m28491n.f24871c).m28493q(), null).m28490l();
    }

    /* renamed from: r */
    public final AbstractC6955j m28494r() {
        return (AbstractC6955j) this.f24872d.mo28480a(null, null, mo28477m(), mo28480a(null, null, InterfaceC6953h.a.RED, null, ((AbstractC6955j) this.f24872d).f24871c), null);
    }

    /* renamed from: s */
    public final AbstractC6955j m28495s() {
        return (AbstractC6955j) this.f24871c.mo28480a(null, null, mo28477m(), null, mo28480a(null, null, InterfaceC6953h.a.RED, ((AbstractC6955j) this.f24871c).f24872d, null));
    }

    /* renamed from: t */
    public void mo28478t(InterfaceC6953h interfaceC6953h) {
        this.f24871c = interfaceC6953h;
    }
}
