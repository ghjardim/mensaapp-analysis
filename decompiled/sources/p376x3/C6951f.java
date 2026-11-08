package p376x3;

import p376x3.InterfaceC6953h;

/* renamed from: x3.f */
/* loaded from: classes.dex */
public class C6951f extends AbstractC6955j {

    /* renamed from: e */
    public int f24864e;

    public C6951f(Object obj, Object obj2, InterfaceC6953h interfaceC6953h, InterfaceC6953h interfaceC6953h2) {
        super(obj, obj2, interfaceC6953h, interfaceC6953h2);
        this.f24864e = -1;
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: e */
    public boolean mo28475e() {
        return false;
    }

    @Override // p376x3.AbstractC6955j
    /* renamed from: k */
    public AbstractC6955j mo28476k(Object obj, Object obj2, InterfaceC6953h interfaceC6953h, InterfaceC6953h interfaceC6953h2) {
        if (obj == null) {
            obj = getKey();
        }
        if (obj2 == null) {
            obj2 = getValue();
        }
        if (interfaceC6953h == null) {
            interfaceC6953h = mo28481b();
        }
        if (interfaceC6953h2 == null) {
            interfaceC6953h2 = mo28484f();
        }
        return new C6951f(obj, obj2, interfaceC6953h, interfaceC6953h2);
    }

    @Override // p376x3.AbstractC6955j
    /* renamed from: m */
    public InterfaceC6953h.a mo28477m() {
        return InterfaceC6953h.a.BLACK;
    }

    @Override // p376x3.InterfaceC6953h
    public int size() {
        if (this.f24864e == -1) {
            this.f24864e = mo28481b().size() + 1 + mo28484f().size();
        }
        return this.f24864e;
    }

    @Override // p376x3.AbstractC6955j
    /* renamed from: t */
    public void mo28478t(InterfaceC6953h interfaceC6953h) {
        if (this.f24864e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.mo28478t(interfaceC6953h);
    }
}
