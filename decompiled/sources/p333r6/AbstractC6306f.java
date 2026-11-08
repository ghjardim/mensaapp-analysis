package p333r6;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import p341s6.C6403d;
import p349t6.AbstractC6574l;
import p349t6.AbstractC6579q;
import p349t6.C6571i;
import p349t6.C6575m;
import p349t6.C6577o;
import p357u6.InterfaceC6698b;

/* renamed from: r6.f */
/* loaded from: classes2.dex */
public abstract class AbstractC6306f {

    /* renamed from: a */
    public static volatile int f22843a;

    /* renamed from: e */
    public static volatile InterfaceC6698b f22847e;

    /* renamed from: b */
    public static final C6577o f22844b = new C6577o();

    /* renamed from: c */
    public static final C6571i f22845c = new C6571i();

    /* renamed from: d */
    public static boolean f22846d = AbstractC6579q.m27317d("slf4j.detectLoggerNameMismatch");

    /* renamed from: f */
    public static final String[] f22848f = {"2.0"};

    /* renamed from: A */
    public static final void m26383A() {
        try {
            String mo27288c = f22847e.mo27288c();
            boolean z6 = false;
            for (String str : f22848f) {
                if (mo27288c.startsWith(str)) {
                    z6 = true;
                }
            }
            if (z6) {
                return;
            }
            AbstractC6574l.m27299i("The requested version " + mo27288c + " by your slf4j provider is not compatible with " + Arrays.asList(f22848f).toString());
            AbstractC6574l.m27299i("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (Throwable th) {
            AbstractC6574l.m27293c("Unexpected problem occurred during version sanity check", th);
        }
    }

    /* renamed from: b */
    public static final void m26385b() {
        try {
            List m26391h = m26391h();
            m26408y(m26391h);
            if (m26391h == null || m26391h.isEmpty()) {
                f22843a = 4;
                AbstractC6574l.m27299i("No SLF4J providers were found.");
                AbstractC6574l.m27299i("Defaulting to no-operation (NOP) logger implementation");
                AbstractC6574l.m27299i("See https://www.slf4j.org/codes.html#noProviders for further details.");
                m26407x(m26390g());
            } else {
                f22847e = (InterfaceC6698b) m26391h.get(0);
                f22847e.mo27286a();
                f22843a = 3;
                m26406w(m26391h);
            }
            m26403t();
        } catch (Exception e7) {
            m26389f(e7);
            throw new IllegalStateException("Unexpected initialization failure", e7);
        }
    }

    /* renamed from: c */
    public static void m26386c(C6403d c6403d, int i7) {
        if (c6403d.m26737c().m27304C()) {
            m26387d(i7);
        } else {
            if (c6403d.m26737c().m27305D()) {
                return;
            }
            m26388e();
        }
    }

    /* renamed from: d */
    public static void m26387d(int i7) {
        AbstractC6574l.m27299i("A number (" + i7 + ") of logging calls during the initialization phase have been intercepted and are");
        AbstractC6574l.m27299i("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        AbstractC6574l.m27299i("See also https://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: e */
    public static void m26388e() {
        AbstractC6574l.m27299i("The following set of substitute loggers may have been accessed");
        AbstractC6574l.m27299i("during the initialization phase. Logging calls during this");
        AbstractC6574l.m27299i("phase were not honored. However, subsequent logging calls to these");
        AbstractC6574l.m27299i("loggers will work as normally expected.");
        AbstractC6574l.m27299i("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: f */
    public static void m26389f(Throwable th) {
        f22843a = 2;
        AbstractC6574l.m27293c("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: g */
    public static Set m26390g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = AbstractC6306f.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e7) {
            AbstractC6574l.m27293c("Error getting resources from path", e7);
        }
        return linkedHashSet;
    }

    /* renamed from: h */
    public static List m26391h() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = AbstractC6306f.class.getClassLoader();
        InterfaceC6698b m26400q = m26400q(classLoader);
        if (m26400q != null) {
            arrayList.add(m26400q);
            return arrayList;
        }
        Iterator it = m26397n(classLoader).iterator();
        while (it.hasNext()) {
            m26409z(arrayList, it);
        }
        return arrayList;
    }

    /* renamed from: i */
    public static void m26392i() {
        C6577o c6577o = f22844b;
        synchronized (c6577o) {
            try {
                c6577o.m27313d().m27312e();
                for (C6575m c6575m : c6577o.m27313d().m27311d()) {
                    c6575m.m27308G(m26395l(c6575m.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public static InterfaceC6301a m26393j() {
        return m26396m().mo27287b();
    }

    /* renamed from: k */
    public static InterfaceC6304d m26394k(Class cls) {
        Class m27314a;
        InterfaceC6304d m26395l = m26395l(cls.getName());
        if (f22846d && (m27314a = AbstractC6579q.m27314a()) != null && m26401r(cls, m27314a)) {
            AbstractC6574l.m27299i(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", m26395l.getName(), m27314a.getName()));
            AbstractC6574l.m27299i("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return m26395l;
    }

    /* renamed from: l */
    public static InterfaceC6304d m26395l(String str) {
        return m26393j().mo26355a(str);
    }

    /* renamed from: m */
    public static InterfaceC6698b m26396m() {
        if (f22843a == 0) {
            synchronized (AbstractC6306f.class) {
                try {
                    if (f22843a == 0) {
                        f22843a = 1;
                        m26402s();
                    }
                } finally {
                }
            }
        }
        int i7 = f22843a;
        if (i7 == 1) {
            return f22844b;
        }
        if (i7 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i7 == 3) {
            return f22847e;
        }
        if (i7 == 4) {
            return f22845c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* renamed from: n */
    public static ServiceLoader m26397n(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(InterfaceC6698b.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: r6.e
            @Override // java.security.PrivilegedAction
            public final Object run() {
                ServiceLoader m26399p;
                m26399p = AbstractC6306f.m26399p(classLoader);
                return m26399p;
            }
        });
    }

    /* renamed from: o */
    public static boolean m26398o(List list) {
        return list.size() > 1;
    }

    /* renamed from: p */
    public static /* synthetic */ ServiceLoader m26399p(ClassLoader classLoader) {
        return ServiceLoader.load(InterfaceC6698b.class, classLoader);
    }

    /* renamed from: q */
    public static InterfaceC6698b m26400q(ClassLoader classLoader) {
        String property = System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                AbstractC6574l.m27296f(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
                return (InterfaceC6698b) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e7) {
                AbstractC6574l.m27293c(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e7);
                return null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                AbstractC6574l.m27293c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (IllegalAccessException e9) {
                e = e9;
                AbstractC6574l.m27293c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InstantiationException e10) {
                e = e10;
                AbstractC6574l.m27293c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (NoSuchMethodException e11) {
                e = e11;
                AbstractC6574l.m27293c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e12) {
                e = e12;
                AbstractC6574l.m27293c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    /* renamed from: r */
    public static boolean m26401r(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: s */
    public static final void m26402s() {
        m26385b();
        if (f22843a == 3) {
            m26383A();
        }
    }

    /* renamed from: t */
    public static void m26403t() {
        m26392i();
        m26404u();
        f22844b.m27313d().m27309b();
    }

    /* renamed from: u */
    public static void m26404u() {
        LinkedBlockingQueue m27310c = f22844b.m27313d().m27310c();
        int size = m27310c.size();
        ArrayList<C6403d> arrayList = new ArrayList(128);
        int i7 = 0;
        while (m27310c.drainTo(arrayList, 128) != 0) {
            for (C6403d c6403d : arrayList) {
                m26405v(c6403d);
                int i8 = i7 + 1;
                if (i7 == 0) {
                    m26386c(c6403d, size);
                }
                i7 = i8;
            }
            arrayList.clear();
        }
    }

    /* renamed from: v */
    public static void m26405v(C6403d c6403d) {
        if (c6403d == null) {
            return;
        }
        C6575m m26737c = c6403d.m26737c();
        String name = m26737c.getName();
        if (m26737c.m27306E()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (m26737c.m27305D()) {
            return;
        }
        if (!m26737c.m27304C()) {
            AbstractC6574l.m27299i(name);
        } else if (m26737c.mo26362f(c6403d.m26736b())) {
            m26737c.m27307F(c6403d);
        }
    }

    /* renamed from: w */
    public static void m26406w(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (m26398o(list)) {
            AbstractC6574l.m27296f("Actual provider is of type [" + list.get(0) + "]");
            return;
        }
        AbstractC6574l.m27291a("Connected with provider of type [" + ((InterfaceC6698b) list.get(0)).getClass().getName() + "]");
    }

    /* renamed from: x */
    public static void m26407x(Set set) {
        if (set.isEmpty()) {
            return;
        }
        AbstractC6574l.m27299i("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC6574l.m27299i("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC6574l.m27299i("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* renamed from: y */
    public static void m26408y(List list) {
        if (m26398o(list)) {
            AbstractC6574l.m27299i("Class path contains multiple SLF4J providers.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC6574l.m27299i("Found provider [" + ((InterfaceC6698b) it.next()) + "]");
            }
            AbstractC6574l.m27299i("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: z */
    public static void m26409z(List list, Iterator it) {
        try {
            list.add((InterfaceC6698b) it.next());
        } catch (ServiceConfigurationError e7) {
            AbstractC6574l.m27292b("A service provider failed to instantiate:\n" + e7.getMessage());
        }
    }
}
