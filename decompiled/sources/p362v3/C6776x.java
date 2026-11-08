package p362v3;

import p137T3.InterfaceC2447b;

/* renamed from: v3.x */
/* loaded from: classes.dex */
public class C6776x implements InterfaceC2447b {

    /* renamed from: c */
    public static final Object f24370c = new Object();

    /* renamed from: a */
    public volatile Object f24371a = f24370c;

    /* renamed from: b */
    public volatile InterfaceC2447b f24372b;

    public C6776x(InterfaceC2447b interfaceC2447b) {
        this.f24372b = interfaceC2447b;
    }

    @Override // p137T3.InterfaceC2447b
    public Object get() {
        Object obj = this.f24371a;
        Object obj2 = f24370c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f24371a;
                    if (obj == obj2) {
                        obj = this.f24372b.get();
                        this.f24371a = obj;
                        this.f24372b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
