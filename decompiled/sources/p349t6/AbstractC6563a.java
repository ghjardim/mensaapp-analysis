package p349t6;

import java.io.Serializable;
import p333r6.AbstractC6303c;
import p333r6.InterfaceC6304d;
import p333r6.InterfaceC6307g;
import p341s6.EnumC6401b;

/* renamed from: t6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6563a implements InterfaceC6304d, Serializable {
    /* renamed from: A */
    public final void m27279A(EnumC6401b enumC6401b, InterfaceC6307g interfaceC6307g, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            mo26732C(enumC6401b, interfaceC6307g, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            mo26732C(enumC6401b, interfaceC6307g, str, new Object[]{obj, obj2}, null);
        }
    }

    /* renamed from: B */
    public final void m27280B(EnumC6401b enumC6401b, InterfaceC6307g interfaceC6307g, String str, Object[] objArr) {
        Throwable m27284a = AbstractC6567e.m27284a(objArr);
        if (m27284a != null) {
            mo26732C(enumC6401b, interfaceC6307g, str, AbstractC6567e.m27285b(objArr), m27284a);
        } else {
            mo26732C(enumC6401b, interfaceC6307g, str, objArr, null);
        }
    }

    /* renamed from: C */
    public abstract void mo26732C(EnumC6401b enumC6401b, InterfaceC6307g interfaceC6307g, String str, Object[] objArr, Throwable th);

    /* renamed from: D */
    public final void m27281D(EnumC6401b enumC6401b, InterfaceC6307g interfaceC6307g, String str, Throwable th) {
        mo26732C(enumC6401b, interfaceC6307g, str, null, th);
    }

    /* renamed from: E */
    public final void m27282E(EnumC6401b enumC6401b, InterfaceC6307g interfaceC6307g, String str, Object obj) {
        mo26732C(enumC6401b, interfaceC6307g, str, new Object[]{obj}, null);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: a */
    public void mo26357a(String str, Object obj) {
        if (mo26368l()) {
            m27282E(EnumC6401b.INFO, null, str, obj);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: b */
    public void mo26358b(String str, Object obj) {
        if (mo26359c()) {
            m27282E(EnumC6401b.WARN, null, str, obj);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: d */
    public void mo26360d(String str, Object obj, Object obj2) {
        if (mo26361e()) {
            m27279A(EnumC6401b.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: f */
    public /* synthetic */ boolean mo26362f(EnumC6401b enumC6401b) {
        return AbstractC6303c.m26356a(this, enumC6401b);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: g */
    public void mo26363g(String str, Object obj) {
        if (mo26371o()) {
            m27282E(EnumC6401b.TRACE, null, str, obj);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: h */
    public void mo26364h(String str, Throwable th) {
        if (mo26366j()) {
            m27281D(EnumC6401b.ERROR, null, str, th);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: i */
    public void mo26365i(String str, Object obj, Object obj2) {
        if (mo26371o()) {
            m27279A(EnumC6401b.TRACE, null, str, obj, obj2);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: k */
    public void mo26367k(String str, Object... objArr) {
        if (mo26359c()) {
            m27280B(EnumC6401b.WARN, null, str, objArr);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: m */
    public void mo26369m(String str, Object obj, Object obj2) {
        if (mo26359c()) {
            m27279A(EnumC6401b.WARN, null, str, obj, obj2);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: n */
    public void mo26370n(String str) {
        if (mo26361e()) {
            m27281D(EnumC6401b.DEBUG, null, str, null);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: p */
    public void mo26372p(String str, Object obj, Object obj2) {
        if (mo26366j()) {
            m27279A(EnumC6401b.ERROR, null, str, obj, obj2);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: q */
    public void mo26373q(String str, Object... objArr) {
        if (mo26366j()) {
            m27280B(EnumC6401b.ERROR, null, str, objArr);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: r */
    public void mo26374r(String str, Object obj) {
        if (mo26361e()) {
            m27282E(EnumC6401b.DEBUG, null, str, obj);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: s */
    public void mo26375s(String str, Object obj) {
        if (mo26366j()) {
            m27282E(EnumC6401b.ERROR, null, str, obj);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: t */
    public void mo26376t(String str, Object... objArr) {
        if (mo26361e()) {
            m27280B(EnumC6401b.DEBUG, null, str, objArr);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: u */
    public void mo26377u(String str, Throwable th) {
        if (mo26359c()) {
            m27281D(EnumC6401b.WARN, null, str, th);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: v */
    public void mo26378v(String str, Throwable th) {
        if (mo26361e()) {
            m27281D(EnumC6401b.DEBUG, null, str, th);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: w */
    public void mo26379w(String str) {
        if (mo26368l()) {
            m27281D(EnumC6401b.INFO, null, str, null);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: x */
    public void mo26380x(String str) {
        if (mo26359c()) {
            m27281D(EnumC6401b.WARN, null, str, null);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: y */
    public void mo26381y(String str) {
        if (mo26371o()) {
            m27281D(EnumC6401b.TRACE, null, str, null);
        }
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: z */
    public void mo26382z(String str, Object obj, Object obj2) {
        if (mo26368l()) {
            m27279A(EnumC6401b.INFO, null, str, obj, obj2);
        }
    }
}
