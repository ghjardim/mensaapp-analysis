package p376x3;

import p376x3.InterfaceC6953h;

/* renamed from: x3.i */
/* loaded from: classes.dex */
public class C6954i extends AbstractC6955j {
    public C6954i(Object obj, Object obj2) {
        super(obj, obj2, C6952g.m28479i(), C6952g.m28479i());
    }

    @Override // p376x3.InterfaceC6953h
    /* renamed from: e */
    public boolean mo28475e() {
        return true;
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
        return new C6954i(obj, obj2, interfaceC6953h, interfaceC6953h2);
    }

    @Override // p376x3.AbstractC6955j
    /* renamed from: m */
    public InterfaceC6953h.a mo28477m() {
        return InterfaceC6953h.a.RED;
    }

    @Override // p376x3.InterfaceC6953h
    public int size() {
        return mo28481b().size() + 1 + mo28484f().size();
    }

    public C6954i(Object obj, Object obj2, InterfaceC6953h interfaceC6953h, InterfaceC6953h interfaceC6953h2) {
        super(obj, obj2, interfaceC6953h, interfaceC6953h2);
    }
}
