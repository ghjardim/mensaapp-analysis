package p264j5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import p171Y2.AbstractC2932o;
import p253i5.AbstractC4580S;
import p273k5.AbstractC5455l;
import p273k5.C5450g;
import p273k5.C5451h;
import p273k5.EnumC5452i;

/* renamed from: j5.k */
/* loaded from: classes2.dex */
public class C5382k {

    /* renamed from: b */
    public static final Logger f19186b = Logger.getLogger(C5382k.class.getName());

    /* renamed from: c */
    public static final C5451h f19187c = C5451h.m22983e();

    /* renamed from: d */
    public static C5382k f19188d = m22254d(C5382k.class.getClassLoader());

    /* renamed from: a */
    public final C5451h f19189a;

    /* renamed from: j5.k$a */
    public static final class a extends C5382k {

        /* renamed from: e */
        public static final C5450g f19190e;

        /* renamed from: f */
        public static final C5450g f19191f;

        /* renamed from: g */
        public static final C5450g f19192g;

        /* renamed from: h */
        public static final C5450g f19193h;

        /* renamed from: i */
        public static final C5450g f19194i;

        /* renamed from: j */
        public static final C5450g f19195j;

        /* renamed from: k */
        public static final Method f19196k;

        /* renamed from: l */
        public static final Method f19197l;

        /* renamed from: m */
        public static final Method f19198m;

        /* renamed from: n */
        public static final Method f19199n;

        /* renamed from: o */
        public static final Method f19200o;

        /* renamed from: p */
        public static final Method f19201p;

        /* renamed from: q */
        public static final Constructor f19202q;

        /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(9:2|3|4|5|6|7|9|10|11)|(2:12|13)|14|15|16|17|19|20|21|22|23|24|(1:(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|9|10|11|(2:12|13)|14|15|16|17|19|20|21|22|23|24|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ed, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
        
            p264j5.C5382k.f19186b.log(java.util.logging.Level.FINER, "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
        
            p264j5.C5382k.f19186b.log(java.util.logging.Level.FINER, "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
        
            r2 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
        
            r2 = r1;
         */
        static {
            /*
                Method dump skipped, instructions count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p264j5.C5382k.a.<clinit>():void");
        }

        public a(C5451h c5451h) {
            super(c5451h);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
        @Override // p264j5.C5382k
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo22258c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List r11) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p264j5.C5382k.a.mo22258c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // p264j5.C5382k
        /* renamed from: f */
        public String mo22259f(SSLSocket sSLSocket) {
            Method method = f19200o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, null);
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    if (!(e8.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e8);
                    }
                    C5382k.f19186b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f19189a.mo22991i() == C5451h.h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f19192g.m22979f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, AbstractC5455l.f19692b);
                    }
                } catch (Exception e9) {
                    C5382k.f19186b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e9);
                }
            }
            if (this.f19189a.mo22991i() != C5451h.h.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f19194i.m22979f(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, AbstractC5455l.f19692b);
                    }
                } catch (Exception e10) {
                    C5382k.f19186b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e10);
                }
            }
            return null;
        }

        @Override // p264j5.C5382k
        /* renamed from: h */
        public String mo22260h(SSLSocket sSLSocket, String str, List list) {
            String mo22259f = mo22259f(sSLSocket);
            return mo22259f == null ? super.mo22260h(sSLSocket, str, list) : mo22259f;
        }
    }

    public C5382k(C5451h c5451h) {
        this.f19189a = (C5451h) AbstractC2932o.m10573p(c5451h, "platform");
    }

    /* renamed from: d */
    public static C5382k m22254d(ClassLoader classLoader) {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e7) {
            f19186b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e7);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e8) {
                f19186b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e8);
                return new C5382k(f19187c);
            }
        }
        return new a(f19187c);
    }

    /* renamed from: e */
    public static C5382k m22255e() {
        return f19188d;
    }

    /* renamed from: g */
    public static boolean m22256g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            AbstractC4580S.m19597c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static String[] m22257i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC5452i) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: c */
    public void mo22258c(SSLSocket sSLSocket, String str, List list) {
        this.f19189a.mo22988c(sSLSocket, str, list);
    }

    /* renamed from: f */
    public String mo22259f(SSLSocket sSLSocket) {
        return this.f19189a.mo22990h(sSLSocket);
    }

    /* renamed from: h */
    public String mo22260h(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            mo22258c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String mo22259f = mo22259f(sSLSocket);
            if (mo22259f != null) {
                return mo22259f;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f19189a.mo22987a(sSLSocket);
        }
    }
}
