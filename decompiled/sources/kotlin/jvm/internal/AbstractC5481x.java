package kotlin.jvm.internal;

import org.apache.tika.utils.StringUtils;
import p111P5.InterfaceC1969c;
import p111P5.InterfaceC1971e;
import p111P5.InterfaceC1972f;
import p111P5.InterfaceC1973g;
import p111P5.InterfaceC1974h;

/* renamed from: kotlin.jvm.internal.x */
/* loaded from: classes2.dex */
public abstract class AbstractC5481x {

    /* renamed from: a */
    public static final C5482y f19711a;

    /* renamed from: b */
    public static final InterfaceC1969c[] f19712b;

    static {
        C5482y c5482y = null;
        try {
            c5482y = (C5482y) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c5482y == null) {
            c5482y = new C5482y();
        }
        f19711a = c5482y;
        f19712b = new InterfaceC1969c[0];
    }

    /* renamed from: a */
    public static InterfaceC1972f m23039a(AbstractC5466i abstractC5466i) {
        return f19711a.m23046a(abstractC5466i);
    }

    /* renamed from: b */
    public static InterfaceC1969c m23040b(Class cls) {
        return f19711a.m23047b(cls);
    }

    /* renamed from: c */
    public static InterfaceC1971e m23041c(Class cls) {
        return f19711a.m23048c(cls, StringUtils.EMPTY);
    }

    /* renamed from: d */
    public static InterfaceC1973g m23042d(AbstractC5472o abstractC5472o) {
        return f19711a.m23049d(abstractC5472o);
    }

    /* renamed from: e */
    public static InterfaceC1974h m23043e(AbstractC5474q abstractC5474q) {
        return f19711a.m23050e(abstractC5474q);
    }

    /* renamed from: f */
    public static String m23044f(InterfaceC5465h interfaceC5465h) {
        return f19711a.m23051f(interfaceC5465h);
    }

    /* renamed from: g */
    public static String m23045g(AbstractC5470m abstractC5470m) {
        return f19711a.m23052g(abstractC5470m);
    }
}
