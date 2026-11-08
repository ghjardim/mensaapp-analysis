package p185a2;

import p364v5.InterfaceC6784a;

/* renamed from: a2.a */
/* loaded from: classes.dex */
public final class C3102a implements InterfaceC6784a {

    /* renamed from: c */
    public static final Object f9585c = new Object();

    /* renamed from: a */
    public volatile InterfaceC6784a f9586a;

    /* renamed from: b */
    public volatile Object f9587b = f9585c;

    public C3102a(InterfaceC6784a interfaceC6784a) {
        this.f9586a = interfaceC6784a;
    }

    /* renamed from: a */
    public static InterfaceC6784a m11323a(InterfaceC6784a interfaceC6784a) {
        AbstractC3105d.m11327b(interfaceC6784a);
        return interfaceC6784a instanceof C3102a ? interfaceC6784a : new C3102a(interfaceC6784a);
    }

    /* renamed from: b */
    public static Object m11324b(Object obj, Object obj2) {
        if (obj == f9585c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p364v5.InterfaceC6784a
    public Object get() {
        Object obj = this.f9587b;
        Object obj2 = f9585c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f9587b;
                    if (obj == obj2) {
                        obj = this.f9586a.get();
                        this.f9587b = m11324b(this.f9587b, obj);
                        this.f9586a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
