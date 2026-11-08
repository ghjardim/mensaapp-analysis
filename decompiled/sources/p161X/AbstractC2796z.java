package p161X;

import p161X.AbstractComponentCallbacksC2786p;
import p334s.C6318k;

/* renamed from: X.z */
/* loaded from: classes.dex */
public abstract class AbstractC2796z {

    /* renamed from: a */
    public static final C6318k f8524a = new C6318k();

    /* renamed from: b */
    public static boolean m9971b(ClassLoader classLoader, String str) {
        try {
            return AbstractComponentCallbacksC2786p.class.isAssignableFrom(m9972c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Class m9972c(ClassLoader classLoader, String str) {
        C6318k c6318k = f8524a;
        C6318k c6318k2 = (C6318k) c6318k.get(classLoader);
        if (c6318k2 == null) {
            c6318k2 = new C6318k();
            c6318k.put(classLoader, c6318k2);
        }
        Class cls = (Class) c6318k2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c6318k2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class m9973d(ClassLoader classLoader, String str) {
        try {
            return m9972c(classLoader, str);
        } catch (ClassCastException e7) {
            throw new AbstractComponentCallbacksC2786p.h("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e7);
        } catch (ClassNotFoundException e8) {
            throw new AbstractComponentCallbacksC2786p.h("Unable to instantiate fragment " + str + ": make sure class name exists", e8);
        }
    }

    /* renamed from: a */
    public abstract AbstractComponentCallbacksC2786p mo9528a(ClassLoader classLoader, String str);
}
