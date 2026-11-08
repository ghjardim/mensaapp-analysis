package p273k5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p206c6.C3616d;

/* renamed from: k5.h */
/* loaded from: classes2.dex */
public class C5451h {

    /* renamed from: b */
    public static final Logger f19650b = Logger.getLogger(C5451h.class.getName());

    /* renamed from: c */
    public static final String[] f19651c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d */
    public static final C5451h f19652d = m22982d();

    /* renamed from: a */
    public final Provider f19653a;

    /* renamed from: k5.h$a */
    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", null);
        }
    }

    /* renamed from: k5.h$b */
    public class b implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* renamed from: k5.h$c */
    public class c implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", null);
        }
    }

    /* renamed from: k5.h$d */
    public static class d extends C5451h {

        /* renamed from: e */
        public final C5450g f19654e;

        /* renamed from: f */
        public final C5450g f19655f;

        /* renamed from: g */
        public final Method f19656g;

        /* renamed from: h */
        public final Method f19657h;

        /* renamed from: i */
        public final C5450g f19658i;

        /* renamed from: j */
        public final C5450g f19659j;

        /* renamed from: k */
        public final h f19660k;

        public d(C5450g c5450g, C5450g c5450g2, Method method, Method method2, C5450g c5450g3, C5450g c5450g4, Provider provider, h hVar) {
            super(provider);
            this.f19654e = c5450g;
            this.f19655f = c5450g2;
            this.f19656g = method;
            this.f19657h = method2;
            this.f19658i = c5450g3;
            this.f19659j = c5450g4;
            this.f19660k = hVar;
        }

        @Override // p273k5.C5451h
        /* renamed from: c */
        public void mo22988c(SSLSocket sSLSocket, String str, List list) {
            if (str != null) {
                this.f19654e.m22978e(sSLSocket, Boolean.TRUE);
                this.f19655f.m22978e(sSLSocket, str);
            }
            if (this.f19659j.m22980g(sSLSocket)) {
                this.f19659j.m22979f(sSLSocket, C5451h.m22981b(list));
            }
        }

        @Override // p273k5.C5451h
        /* renamed from: h */
        public String mo22990h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f19658i.m22980g(sSLSocket) && (bArr = (byte[]) this.f19658i.m22979f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, AbstractC5455l.f19692b);
            }
            return null;
        }

        @Override // p273k5.C5451h
        /* renamed from: i */
        public h mo22991i() {
            return this.f19660k;
        }
    }

    /* renamed from: k5.h$e */
    public static class e extends C5451h {

        /* renamed from: e */
        public final Method f19661e;

        /* renamed from: f */
        public final Method f19662f;

        public /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // p273k5.C5451h
        /* renamed from: c */
        public void mo22988c(SSLSocket sSLSocket, String str, List list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EnumC5452i enumC5452i = (EnumC5452i) it.next();
                if (enumC5452i != EnumC5452i.HTTP_1_0) {
                    arrayList.add(enumC5452i.toString());
                }
            }
            try {
                this.f19661e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // p273k5.C5451h
        /* renamed from: h */
        public String mo22990h(SSLSocket sSLSocket) {
            try {
                return (String) this.f19662f.invoke(sSLSocket, null);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // p273k5.C5451h
        /* renamed from: i */
        public h mo22991i() {
            return h.ALPN_AND_NPN;
        }

        public e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f19661e = method;
            this.f19662f = method2;
        }
    }

    /* renamed from: k5.h$f */
    public static class f extends C5451h {

        /* renamed from: e */
        public final Method f19663e;

        /* renamed from: f */
        public final Method f19664f;

        /* renamed from: g */
        public final Method f19665g;

        /* renamed from: h */
        public final Class f19666h;

        /* renamed from: i */
        public final Class f19667i;

        public f(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
            super(provider);
            this.f19663e = method;
            this.f19664f = method2;
            this.f19665g = method3;
            this.f19666h = cls;
            this.f19667i = cls2;
        }

        @Override // p273k5.C5451h
        /* renamed from: a */
        public void mo22987a(SSLSocket sSLSocket) {
            try {
                this.f19665g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e7) {
                C5451h.f19650b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e7);
            }
        }

        @Override // p273k5.C5451h
        /* renamed from: c */
        public void mo22988c(SSLSocket sSLSocket, String str, List list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                EnumC5452i enumC5452i = (EnumC5452i) list.get(i7);
                if (enumC5452i != EnumC5452i.HTTP_1_0) {
                    arrayList.add(enumC5452i.toString());
                }
            }
            try {
                this.f19663e.invoke(null, sSLSocket, Proxy.newProxyInstance(C5451h.class.getClassLoader(), new Class[]{this.f19666h, this.f19667i}, new g(arrayList)));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // p273k5.C5451h
        /* renamed from: h */
        public String mo22990h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f19664f.invoke(null, sSLSocket));
                if (!gVar.f19669b && gVar.f19670c == null) {
                    C5451h.f19650b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.f19669b) {
                    return null;
                }
                return gVar.f19670c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // p273k5.C5451h
        /* renamed from: i */
        public h mo22991i() {
            return h.ALPN_AND_NPN;
        }
    }

    /* renamed from: k5.h$g */
    public static class g implements InvocationHandler {

        /* renamed from: a */
        public final List f19668a;

        /* renamed from: b */
        public boolean f19669b;

        /* renamed from: c */
        public String f19670c;

        public g(List list) {
            this.f19668a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = AbstractC5455l.f19691a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f19669b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f19668a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f19668a.contains(list.get(i7))) {
                            String str = (String) list.get(i7);
                            this.f19670c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f19668a.get(0);
                    this.f19670c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f19670c = (String) objArr[0];
            return null;
        }
    }

    /* renamed from: k5.h$h */
    public enum h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public C5451h(Provider provider) {
        this.f19653a = provider;
    }

    /* renamed from: b */
    public static byte[] m22981b(List list) {
        C3616d c3616d = new C3616d();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            EnumC5452i enumC5452i = (EnumC5452i) list.get(i7);
            if (enumC5452i != EnumC5452i.HTTP_1_0) {
                c3616d.mo14505A(enumC5452i.toString().length());
                c3616d.mo14506O(enumC5452i.toString());
            }
        }
        return c3616d.m14603D();
    }

    /* renamed from: d */
    public static C5451h m22982d() {
        Method method;
        Method method2;
        Method method3;
        Provider m22984f = m22984f();
        a aVar = null;
        if (m22984f != null) {
            C5450g c5450g = new C5450g(null, "setUseSessionTickets", Boolean.TYPE);
            C5450g c5450g2 = new C5450g(null, "setHostname", String.class);
            C5450g c5450g3 = new C5450g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            C5450g c5450g4 = new C5450g(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method3 = cls.getMethod("untagSocket", Socket.class);
                    method2 = method;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = method;
                    method3 = null;
                    return new d(c5450g, c5450g2, method2, method3, c5450g3, c5450g4, m22984f, (!m22984f.getName().equals("GmsCore_OpenSSL") || m22984f.getName().equals("Conscrypt") || m22984f.getName().equals("Ssl_Guard")) ? h.ALPN_AND_NPN : m22986k() ? h.ALPN_AND_NPN : m22985j() ? h.NPN : h.NONE);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            return new d(c5450g, c5450g2, method2, method3, c5450g3, c5450g4, m22984f, (!m22984f.getName().equals("GmsCore_OpenSSL") || m22984f.getName().equals("Conscrypt") || m22984f.getName().equals("Ssl_Guard")) ? h.ALPN_AND_NPN : m22986k() ? h.ALPN_AND_NPN : m22985j() ? h.NPN : h.NONE);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), null);
                    return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), aVar);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    return new C5451h(provider);
                }
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused4) {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
            }
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: e */
    public static C5451h m22983e() {
        return f19652d;
    }

    /* renamed from: f */
    public static Provider m22984f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f19651c) {
                if (str.equals(provider.getClass().getName())) {
                    f19650b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f19650b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    /* renamed from: j */
    public static boolean m22985j() {
        try {
            C5451h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e7) {
            f19650b.log(Level.FINE, "Can't find class", (Throwable) e7);
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m22986k() {
        try {
            C5451h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e7) {
            f19650b.log(Level.FINE, "Can't find class", (Throwable) e7);
            return false;
        }
    }

    /* renamed from: g */
    public Provider m22989g() {
        return this.f19653a;
    }

    /* renamed from: h */
    public String mo22990h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public h mo22991i() {
        return h.NONE;
    }

    /* renamed from: a */
    public void mo22987a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo22988c(SSLSocket sSLSocket, String str, List list) {
    }
}
