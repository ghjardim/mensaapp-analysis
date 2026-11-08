package kotlin.jvm.internal;

import p111P5.InterfaceC1969c;
import p111P5.InterfaceC1971e;
import p111P5.InterfaceC1972f;
import p111P5.InterfaceC1973g;
import p111P5.InterfaceC1974h;

/* renamed from: kotlin.jvm.internal.y */
/* loaded from: classes2.dex */
public class C5482y {
    /* renamed from: b */
    public InterfaceC1969c m23047b(Class cls) {
        return new C5462e(cls);
    }

    /* renamed from: c */
    public InterfaceC1971e m23048c(Class cls, String str) {
        return new C5471n(cls, str);
    }

    /* renamed from: f */
    public String m23051f(InterfaceC5465h interfaceC5465h) {
        String obj = interfaceC5465h.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: g */
    public String m23052g(AbstractC5470m abstractC5470m) {
        return m23051f(abstractC5470m);
    }

    /* renamed from: a */
    public InterfaceC1972f m23046a(AbstractC5466i abstractC5466i) {
        return abstractC5466i;
    }

    /* renamed from: d */
    public InterfaceC1973g m23049d(AbstractC5472o abstractC5472o) {
        return abstractC5472o;
    }

    /* renamed from: e */
    public InterfaceC1974h m23050e(AbstractC5474q abstractC5474q) {
        return abstractC5474q;
    }
}
