package androidx.lifecycle;

import androidx.lifecycle.AbstractC3345j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C3337b {

    /* renamed from: c */
    public static C3337b f10725c = new C3337b();

    /* renamed from: a */
    public final Map f10726a = new HashMap();

    /* renamed from: b */
    public final Map f10727b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    public static class a {

        /* renamed from: a */
        public final Map f10728a = new HashMap();

        /* renamed from: b */
        public final Map f10729b;

        public a(Map map) {
            this.f10729b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC3345j.a aVar = (AbstractC3345j.a) entry.getValue();
                List list = (List) this.f10728a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f10728a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        /* renamed from: b */
        public static void m12916b(List list, InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).m12918a(interfaceC3349n, aVar, obj);
                }
            }
        }

        /* renamed from: a */
        public void m12917a(InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar, Object obj) {
            m12916b((List) this.f10728a.get(aVar), interfaceC3349n, aVar, obj);
            m12916b((List) this.f10728a.get(AbstractC3345j.a.ON_ANY), interfaceC3349n, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b */
    public static final class b {

        /* renamed from: a */
        public final int f10730a;

        /* renamed from: b */
        public final Method f10731b;

        public b(int i7, Method method) {
            this.f10730a = i7;
            this.f10731b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void m12918a(InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar, Object obj) {
            try {
                int i7 = this.f10730a;
                if (i7 == 0) {
                    this.f10731b.invoke(obj, null);
                } else if (i7 == 1) {
                    this.f10731b.invoke(obj, interfaceC3349n);
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    this.f10731b.invoke(obj, interfaceC3349n, aVar);
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Failed to call observer method", e8.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10730a == bVar.f10730a && this.f10731b.getName().equals(bVar.f10731b.getName());
        }

        public int hashCode() {
            return (this.f10730a * 31) + this.f10731b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final a m12911a(Class cls, Method[] methodArr) {
        int i7;
        a m12913c;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m12913c = m12913c(superclass)) != null) {
            hashMap.putAll(m12913c.f10729b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m12913c(cls2).f10729b.entrySet()) {
                m12915e(hashMap, (b) entry.getKey(), (AbstractC3345j.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m12912b(cls);
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            InterfaceC3357v interfaceC3357v = (InterfaceC3357v) method.getAnnotation(InterfaceC3357v.class);
            if (interfaceC3357v != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC3349n.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                AbstractC3345j.a value = interfaceC3357v.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC3345j.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC3345j.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m12915e(hashMap, new b(i7, method), value, cls);
                z6 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f10726a.put(cls, aVar);
        this.f10727b.put(cls, Boolean.valueOf(z6));
        return aVar;
    }

    /* renamed from: b */
    public final Method[] m12912b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e7) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
        }
    }

    /* renamed from: c */
    public a m12913c(Class cls) {
        a aVar = (a) this.f10726a.get(cls);
        return aVar != null ? aVar : m12911a(cls, null);
    }

    /* renamed from: d */
    public boolean m12914d(Class cls) {
        Boolean bool = (Boolean) this.f10727b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m12912b = m12912b(cls);
        for (Method method : m12912b) {
            if (((InterfaceC3357v) method.getAnnotation(InterfaceC3357v.class)) != null) {
                m12911a(cls, m12912b);
                return true;
            }
        }
        this.f10727b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void m12915e(Map map, b bVar, AbstractC3345j.a aVar, Class cls) {
        AbstractC3345j.a aVar2 = (AbstractC3345j.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f10731b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
