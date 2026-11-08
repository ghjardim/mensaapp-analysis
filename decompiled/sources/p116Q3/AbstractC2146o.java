package p116Q3;

import android.net.Uri;
import com.google.firebase.firestore.C3949c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import org.apache.tika.utils.StringUtils;
import p046G3.AbstractC0453u;
import p046G3.C0404Q;
import p046G3.C0421e;
import p046G3.C0464z0;
import p046G3.InterfaceC0405S;
import p046G3.InterfaceC0427h;
import p046G3.InterfaceC0432j0;
import p046G3.InterfaceC0446q0;
import p046G3.InterfaceC0449s;
import p046G3.InterfaceC0456v0;
import p219e3.C4188r;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: Q3.o */
/* loaded from: classes.dex */
public abstract class AbstractC2146o {

    /* renamed from: a */
    public static final ConcurrentMap f6492a = new ConcurrentHashMap();

    /* renamed from: Q3.o$a */
    public static class a {

        /* renamed from: a */
        public final Class f6493a;

        /* renamed from: b */
        public final Constructor f6494b;

        /* renamed from: c */
        public final boolean f6495c;

        /* renamed from: d */
        public final boolean f6496d;

        /* renamed from: e */
        public final Map f6497e = new HashMap();

        /* renamed from: g */
        public final Map f6499g = new HashMap();

        /* renamed from: f */
        public final Map f6498f = new HashMap();

        /* renamed from: h */
        public final Map f6500h = new HashMap();

        /* renamed from: i */
        public final HashSet f6501i = new HashSet();

        /* renamed from: j */
        public final HashSet f6502j = new HashSet();

        public a(Class cls) {
            this.f6493a = cls;
            this.f6495c = cls.isAnnotationPresent(InterfaceC0456v0.class);
            this.f6496d = !cls.isAnnotationPresent(InterfaceC0405S.class);
            Constructor constructor = null;
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                constructor = declaredConstructor;
            } catch (NoSuchMethodException unused) {
            }
            this.f6494b = constructor;
            for (Method method : cls.getMethods()) {
                if (m7286n(method)) {
                    String m7283j = m7283j(method);
                    m7288b(m7283j);
                    method.setAccessible(true);
                    if (this.f6498f.containsKey(m7283j)) {
                        throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                    }
                    this.f6498f.put(m7283j, method);
                    m7290e(method);
                }
            }
            for (Field field : cls.getFields()) {
                if (m7285m(field)) {
                    m7288b(m7282i(field));
                    m7289d(field);
                }
            }
            HashMap hashMap = new HashMap();
            Class cls2 = cls;
            do {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (m7287o(method2)) {
                        String m7283j2 = m7283j(method2);
                        String str = (String) this.f6497e.get(m7283j2.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else {
                            if (!str.equals(m7283j2)) {
                                throw new RuntimeException("Found setter on " + cls2.getName() + " with invalid case-sensitive name: " + method2.getName());
                            }
                            if (method2.isBridge()) {
                                hashMap.put(m7283j2, method2);
                            } else {
                                Method method3 = (Method) this.f6499g.get(m7283j2);
                                Method method4 = (Method) hashMap.get(m7283j2);
                                if (method3 == null) {
                                    method2.setAccessible(true);
                                    this.f6499g.put(m7283j2, method2);
                                    m7291f(method2);
                                } else if (!m7281h(method2, method3) && (method4 == null || !m7281h(method2, method4))) {
                                    if (cls2 == cls) {
                                        throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method2.getName());
                                    }
                                    throw new RuntimeException("Found conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                                }
                            }
                        }
                    }
                }
                for (Field field2 : cls2.getDeclaredFields()) {
                    String m7282i = m7282i(field2);
                    if (this.f6497e.containsKey(m7282i.toLowerCase(Locale.US)) && !this.f6500h.containsKey(m7282i)) {
                        field2.setAccessible(true);
                        this.f6500h.put(m7282i, field2);
                        m7289d(field2);
                    }
                }
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    break;
                }
            } while (!cls2.equals(Object.class));
            if (this.f6497e.isEmpty()) {
                throw new RuntimeException("No properties to serialize found on class " + cls.getName());
            }
            Iterator it = this.f6502j.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!this.f6499g.containsKey(str2) && !this.f6500h.containsKey(str2)) {
                    throw new RuntimeException("@DocumentId is annotated on property " + str2 + " of class " + cls.getName() + " but no field or public setter was found");
                }
            }
        }

        /* renamed from: c */
        public static String m7280c(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(InterfaceC0432j0.class)) {
                return ((InterfaceC0432j0) accessibleObject.getAnnotation(InterfaceC0432j0.class)).value();
            }
            return null;
        }

        /* renamed from: h */
        public static boolean m7281h(Method method, Method method2) {
            AbstractC2146o.m7274d(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            AbstractC2146o.m7274d(returnType.equals(cls), "Expected void return type");
            AbstractC2146o.m7274d(method2.getReturnType().equals(cls), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            AbstractC2146o.m7274d(parameterTypes.length == 1, "Expected exactly one parameter");
            AbstractC2146o.m7274d(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        /* renamed from: i */
        public static String m7282i(Field field) {
            String m7280c = m7280c(field);
            return m7280c != null ? m7280c : field.getName();
        }

        /* renamed from: j */
        public static String m7283j(Method method) {
            String m7280c = m7280c(method);
            return m7280c != null ? m7280c : m7284l(method.getName());
        }

        /* renamed from: l */
        public static String m7284l(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int i7 = 0; i7 < 3; i7++) {
                String str3 = strArr[i7];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i8 = 0; i8 < charArray.length && Character.isUpperCase(charArray[i8]); i8++) {
                charArray[i8] = Character.toLowerCase(charArray[i8]);
            }
            return new String(charArray);
        }

        /* renamed from: m */
        public static boolean m7285m(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(InterfaceC0449s.class)) ? false : true;
        }

        /* renamed from: n */
        public static boolean m7286n(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isBridge() || method.isAnnotationPresent(InterfaceC0449s.class)) ? false : true;
        }

        /* renamed from: o */
        public static boolean m7287o(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(InterfaceC0449s.class);
        }

        /* renamed from: b */
        public final void m7288b(String str) {
            Map map = this.f6497e;
            Locale locale = Locale.US;
            String str2 = (String) map.put(str.toLowerCase(locale), str);
            if (str2 == null || str.equals(str2)) {
                return;
            }
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        /* renamed from: d */
        public final void m7289d(Field field) {
            if (field.isAnnotationPresent(InterfaceC0446q0.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != C4188r.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                this.f6501i.add(m7282i(field));
            }
            if (field.isAnnotationPresent(InterfaceC0427h.class)) {
                m7292g("Field", "is", field.getType());
                this.f6502j.add(m7282i(field));
            }
        }

        /* renamed from: e */
        public final void m7290e(Method method) {
            if (method.isAnnotationPresent(InterfaceC0446q0.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Date.class && returnType != C4188r.class) {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
                this.f6501i.add(m7283j(method));
            }
            if (method.isAnnotationPresent(InterfaceC0427h.class)) {
                m7292g("Method", "returns", method.getReturnType());
                this.f6502j.add(m7283j(method));
            }
        }

        /* renamed from: f */
        public final void m7291f(Method method) {
            if (method.isAnnotationPresent(InterfaceC0446q0.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            }
            if (method.isAnnotationPresent(InterfaceC0427h.class)) {
                m7292g("Method", "accepts", method.getParameterTypes()[0]);
                this.f6502j.add(m7283j(method));
            }
        }

        /* renamed from: g */
        public final void m7292g(String str, String str2, Type type) {
            if (type == String.class || type == C3949c.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + StringUtils.SPACE + type + " instead of String or DocumentReference.");
        }

        /* renamed from: k */
        public Map m7293k(Object obj, b bVar) {
            Object obj2;
            if (!this.f6493a.isAssignableFrom(obj.getClass())) {
                throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + this.f6493a);
            }
            HashMap hashMap = new HashMap();
            for (String str : this.f6497e.values()) {
                if (!this.f6502j.contains(str)) {
                    if (this.f6498f.containsKey(str)) {
                        obj2 = AbstractC2132a.m7212a((Method) this.f6498f.get(str), obj, new Object[0]);
                    } else {
                        Field field = (Field) this.f6500h.get(str);
                        if (field == null) {
                            throw new IllegalStateException("Bean property without field or getter: " + str);
                        }
                        try {
                            obj2 = field.get(obj);
                        } catch (IllegalAccessException e7) {
                            throw new RuntimeException(e7);
                        }
                    }
                    hashMap.put(str, (this.f6501i.contains(str) && obj2 == null) ? AbstractC0453u.m1683g() : AbstractC2146o.m7277g(obj2, bVar.m7294a(str)));
                }
            }
            return hashMap;
        }
    }

    /* renamed from: Q3.o$b */
    public static class b {

        /* renamed from: d */
        public static final b f6503d = new b(null, null, 0);

        /* renamed from: a */
        public final int f6504a;

        /* renamed from: b */
        public final b f6505b;

        /* renamed from: c */
        public final String f6506c;

        public b(b bVar, String str, int i7) {
            this.f6505b = bVar;
            this.f6506c = str;
            this.f6504a = i7;
        }

        /* renamed from: a */
        public b m7294a(String str) {
            return new b(this, str, this.f6504a + 1);
        }

        /* renamed from: b */
        public int m7295b() {
            return this.f6504a;
        }

        public String toString() {
            int i7 = this.f6504a;
            if (i7 == 0) {
                return StringUtils.EMPTY;
            }
            if (i7 == 1) {
                return this.f6506c;
            }
            return this.f6505b.toString() + "." + this.f6506c;
        }
    }

    /* renamed from: c */
    public static Object m7273c(Object obj) {
        return m7276f(obj);
    }

    /* renamed from: d */
    public static void m7274d(boolean z6, String str) {
        if (z6) {
            return;
        }
        throw new RuntimeException("Hard assert failed: " + str);
    }

    /* renamed from: e */
    public static a m7275e(Class cls) {
        ConcurrentMap concurrentMap = f6492a;
        a aVar = (a) concurrentMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(cls);
        concurrentMap.put(cls, aVar2);
        return aVar2;
    }

    /* renamed from: f */
    public static Object m7276f(Object obj) {
        return m7277g(obj, b.f6503d);
    }

    /* renamed from: g */
    public static Object m7277g(Object obj, b bVar) {
        if (bVar.m7295b() > 500) {
            throw m7278h(bVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                return obj;
            }
            throw m7278h(bVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", obj.getClass().getSimpleName()));
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof Character) {
            throw m7278h(bVar, "Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw m7278h(bVar, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                hashMap.put(str, m7277g(entry.getValue(), bVar.m7294a(str)));
            }
            return hashMap;
        }
        if (!(obj instanceof Collection)) {
            if (obj.getClass().isArray()) {
                throw m7278h(bVar, "Serializing Arrays is not supported, please use Lists instead");
            }
            if (!(obj instanceof Enum)) {
                return ((obj instanceof Date) || (obj instanceof C4188r) || (obj instanceof C0404Q) || (obj instanceof C0421e) || (obj instanceof C3949c) || (obj instanceof AbstractC0453u) || (obj instanceof C0464z0)) ? obj : ((obj instanceof Uri) || (obj instanceof URI) || (obj instanceof URL)) ? obj.toString() : m7275e(obj.getClass()).m7293k(obj, bVar);
            }
            String name = ((Enum) obj).name();
            try {
                return a.m7282i(obj.getClass().getField(name));
            } catch (NoSuchFieldException unused) {
                return name;
            }
        }
        if (!(obj instanceof List)) {
            throw m7278h(bVar, "Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(m7277g(list.get(i7), bVar.m7294a("[" + i7 + "]")));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static IllegalArgumentException m7278h(b bVar, String str) {
        String str2 = "Could not serialize object. " + str;
        if (bVar.m7295b() > 0) {
            str2 = str2 + " (found in field '" + bVar.toString() + "')";
        }
        return new IllegalArgumentException(str2);
    }
}
