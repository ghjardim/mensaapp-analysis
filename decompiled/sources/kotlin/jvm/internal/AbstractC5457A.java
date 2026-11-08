package kotlin.jvm.internal;

import java.util.Map;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p069J5.InterfaceC0805q;
import p076K5.InterfaceC0834a;
import p371w5.InterfaceC6919b;

/* renamed from: kotlin.jvm.internal.A */
/* loaded from: classes2.dex */
public abstract class AbstractC5457A {
    /* renamed from: a */
    public static Map m23003a(Object obj) {
        if (obj instanceof InterfaceC0834a) {
            m23010h(obj, "kotlin.collections.MutableMap");
        }
        return m23005c(obj);
    }

    /* renamed from: b */
    public static Object m23004b(Object obj, int i7) {
        if (obj != null && !m23007e(obj, i7)) {
            m23010h(obj, "kotlin.jvm.functions.Function" + i7);
        }
        return obj;
    }

    /* renamed from: c */
    public static Map m23005c(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e7) {
            throw m23009g(e7);
        }
    }

    /* renamed from: d */
    public static int m23006d(Object obj) {
        if (obj instanceof InterfaceC5465h) {
            return ((InterfaceC5465h) obj).getArity();
        }
        if (obj instanceof InterfaceC0789a) {
            return 0;
        }
        if (obj instanceof InterfaceC0800l) {
            return 1;
        }
        if (obj instanceof InterfaceC0804p) {
            return 2;
        }
        return obj instanceof InterfaceC0805q ? 3 : -1;
    }

    /* renamed from: e */
    public static boolean m23007e(Object obj, int i7) {
        return (obj instanceof InterfaceC6919b) && m23006d(obj) == i7;
    }

    /* renamed from: f */
    public static Throwable m23008f(Throwable th) {
        return AbstractC5469l.m23032i(th, AbstractC5457A.class.getName());
    }

    /* renamed from: g */
    public static ClassCastException m23009g(ClassCastException classCastException) {
        throw ((ClassCastException) m23008f(classCastException));
    }

    /* renamed from: h */
    public static void m23010h(Object obj, String str) {
        m23011i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: i */
    public static void m23011i(String str) {
        throw m23009g(new ClassCastException(str));
    }
}
