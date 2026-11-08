package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p125R5.AbstractC2291q;
import p207d.AbstractC4094d;
import p378x5.AbstractC7023n;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public final class C3352q {

    /* renamed from: a */
    public static final C3352q f10762a = new C3352q();

    /* renamed from: b */
    public static final Map f10763b = new HashMap();

    /* renamed from: c */
    public static final Map f10764c = new HashMap();

    /* renamed from: c */
    public static final String m12952c(String className) {
        AbstractC5469l.m23028e(className, "className");
        return AbstractC2291q.m7743s(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    /* renamed from: f */
    public static final InterfaceC3347l m12953f(Object object) {
        AbstractC5469l.m23028e(object, "object");
        boolean z6 = object instanceof InterfaceC3347l;
        boolean z7 = object instanceof DefaultLifecycleObserver;
        if (z6 && z7) {
            return new C3340e((DefaultLifecycleObserver) object, (InterfaceC3347l) object);
        }
        if (z7) {
            return new C3340e((DefaultLifecycleObserver) object, null);
        }
        if (z6) {
            return (InterfaceC3347l) object;
        }
        Class<?> cls = object.getClass();
        C3352q c3352q = f10762a;
        if (c3352q.m12956d(cls) != 2) {
            return new C3360y(object);
        }
        Object obj = f10764c.get(cls);
        AbstractC5469l.m23025b(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c3352q.m12954a((Constructor) list.get(0), object);
            return new C3328K(null);
        }
        int size = list.size();
        InterfaceC3342g[] interfaceC3342gArr = new InterfaceC3342g[size];
        for (int i7 = 0; i7 < size; i7++) {
            f10762a.m12954a((Constructor) list.get(i7), object);
            interfaceC3342gArr[i7] = null;
        }
        return new C3338c(interfaceC3342gArr);
    }

    /* renamed from: a */
    public final InterfaceC3342g m12954a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            AbstractC5469l.m23027d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC4094d.m17162a(newInstance);
            return null;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Constructor m12955b(Class cls) {
        try {
            Package r12 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r12 != null ? r12.getName() : StringUtils.EMPTY;
            AbstractC5469l.m23027d(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                AbstractC5469l.m23027d(name, "name");
                name = name.substring(fullPackage.length() + 1);
                AbstractC5469l.m23027d(name, "this as java.lang.String).substring(startIndex)");
            }
            AbstractC5469l.m23027d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String m12952c = m12952c(name);
            if (fullPackage.length() != 0) {
                m12952c = fullPackage + '.' + m12952c;
            }
            Class<?> cls2 = Class.forName(m12952c);
            AbstractC5469l.m23026c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: d */
    public final int m12956d(Class cls) {
        Map map = f10763b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m12958g = m12958g(cls);
        map.put(cls, Integer.valueOf(m12958g));
        return m12958g;
    }

    /* renamed from: e */
    public final boolean m12957e(Class cls) {
        return cls != null && InterfaceC3348m.class.isAssignableFrom(cls);
    }

    /* renamed from: g */
    public final int m12958g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor m12955b = m12955b(cls);
        if (m12955b != null) {
            f10764c.put(cls, AbstractC7023n.m28856b(m12955b));
            return 2;
        }
        if (C3337b.f10725c.m12914d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (m12957e(superclass)) {
            AbstractC5469l.m23027d(superclass, "superclass");
            if (m12956d(superclass) == 1) {
                return 1;
            }
            Object obj = f10764c.get(superclass);
            AbstractC5469l.m23025b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC5469l.m23027d(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (m12957e(intrface)) {
                AbstractC5469l.m23027d(intrface, "intrface");
                if (m12956d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f10764c.get(intrface);
                AbstractC5469l.m23025b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f10764c.put(cls, arrayList);
        return 2;
    }
}
