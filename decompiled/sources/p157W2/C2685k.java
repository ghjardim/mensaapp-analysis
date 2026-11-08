package p157W2;

/* renamed from: W2.k */
/* loaded from: classes.dex */
public final class C2685k implements InterfaceC2689o {

    /* renamed from: c */
    public static final Object f7934c = new Object();

    /* renamed from: a */
    public volatile InterfaceC2689o f7935a;

    /* renamed from: b */
    public volatile Object f7936b = f7934c;

    public C2685k(InterfaceC2689o interfaceC2689o) {
        this.f7935a = interfaceC2689o;
    }

    /* renamed from: b */
    public static InterfaceC2689o m9181b(InterfaceC2689o interfaceC2689o) {
        return interfaceC2689o instanceof C2685k ? interfaceC2689o : new C2685k(interfaceC2689o);
    }

    @Override // p157W2.InterfaceC2689o
    /* renamed from: a */
    public final Object mo9182a() {
        Object obj = this.f7936b;
        Object obj2 = f7934c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f7936b;
                    if (obj == obj2) {
                        obj = this.f7935a.mo9182a();
                        Object obj3 = this.f7936b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f7936b = obj;
                        this.f7935a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
