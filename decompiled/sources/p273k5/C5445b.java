package p273k5;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: k5.b */
/* loaded from: classes2.dex */
public final class C5445b {

    /* renamed from: e */
    public static final EnumC5444a[] f19624e;

    /* renamed from: f */
    public static final C5445b f19625f;

    /* renamed from: g */
    public static final C5445b f19626g;

    /* renamed from: h */
    public static final C5445b f19627h;

    /* renamed from: a */
    public final boolean f19628a;

    /* renamed from: b */
    public final String[] f19629b;

    /* renamed from: c */
    public final String[] f19630c;

    /* renamed from: d */
    public final boolean f19631d;

    static {
        EnumC5444a[] enumC5444aArr = {EnumC5444a.TLS_AES_128_GCM_SHA256, EnumC5444a.TLS_AES_256_GCM_SHA384, EnumC5444a.TLS_CHACHA20_POLY1305_SHA256, EnumC5444a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC5444a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC5444a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC5444a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC5444a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC5444a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, EnumC5444a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC5444a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC5444a.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC5444a.TLS_RSA_WITH_AES_256_GCM_SHA384, EnumC5444a.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC5444a.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC5444a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f19624e = enumC5444aArr;
        b m22946g = new b(true).m22946g(enumC5444aArr);
        EnumC5454k enumC5454k = EnumC5454k.TLS_1_3;
        EnumC5454k enumC5454k2 = EnumC5454k.TLS_1_2;
        C5445b m22944e = m22946g.m22949j(enumC5454k, enumC5454k2).m22947h(true).m22944e();
        f19625f = m22944e;
        f19626g = new b(m22944e).m22949j(enumC5454k, enumC5454k2, EnumC5454k.TLS_1_1, EnumC5454k.TLS_1_0).m22947h(true).m22944e();
        f19627h = new b(false).m22944e();
    }

    /* renamed from: c */
    public void m22935c(SSLSocket sSLSocket, boolean z6) {
        C5445b m22937e = m22937e(sSLSocket, z6);
        sSLSocket.setEnabledProtocols(m22937e.f19630c);
        String[] strArr = m22937e.f19629b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* renamed from: d */
    public List m22936d() {
        String[] strArr = this.f19629b;
        if (strArr == null) {
            return null;
        }
        EnumC5444a[] enumC5444aArr = new EnumC5444a[strArr.length];
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.f19629b;
            if (i7 >= strArr2.length) {
                return AbstractC5455l.m23000a(enumC5444aArr);
            }
            enumC5444aArr[i7] = EnumC5444a.m22932b(strArr2[i7]);
            i7++;
        }
    }

    /* renamed from: e */
    public final C5445b m22937e(SSLSocket sSLSocket, boolean z6) {
        String[] strArr;
        if (this.f19629b != null) {
            strArr = (String[]) AbstractC5455l.m23002c(String.class, this.f19629b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z6 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length;
            String[] strArr2 = new String[length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        return new b(this).m22945f(strArr).m22948i((String[]) AbstractC5455l.m23002c(String.class, this.f19630c, sSLSocket.getEnabledProtocols())).m22944e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5445b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5445b c5445b = (C5445b) obj;
        boolean z6 = this.f19628a;
        if (z6 != c5445b.f19628a) {
            return false;
        }
        return !z6 || (Arrays.equals(this.f19629b, c5445b.f19629b) && Arrays.equals(this.f19630c, c5445b.f19630c) && this.f19631d == c5445b.f19631d);
    }

    /* renamed from: f */
    public boolean m22938f() {
        return this.f19631d;
    }

    /* renamed from: g */
    public List m22939g() {
        EnumC5454k[] enumC5454kArr = new EnumC5454k[this.f19630c.length];
        int i7 = 0;
        while (true) {
            String[] strArr = this.f19630c;
            if (i7 >= strArr.length) {
                return AbstractC5455l.m23000a(enumC5454kArr);
            }
            enumC5454kArr[i7] = EnumC5454k.m22999b(strArr[i7]);
            i7++;
        }
    }

    public int hashCode() {
        if (this.f19628a) {
            return ((((527 + Arrays.hashCode(this.f19629b)) * 31) + Arrays.hashCode(this.f19630c)) * 31) + (!this.f19631d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f19628a) {
            return "ConnectionSpec()";
        }
        List m22936d = m22936d();
        return "ConnectionSpec(cipherSuites=" + (m22936d == null ? "[use default]" : m22936d.toString()) + ", tlsVersions=" + m22939g() + ", supportsTlsExtensions=" + this.f19631d + ")";
    }

    /* renamed from: k5.b$b */
    public static final class b {

        /* renamed from: a */
        public boolean f19632a;

        /* renamed from: b */
        public String[] f19633b;

        /* renamed from: c */
        public String[] f19634c;

        /* renamed from: d */
        public boolean f19635d;

        public b(boolean z6) {
            this.f19632a = z6;
        }

        /* renamed from: e */
        public C5445b m22944e() {
            return new C5445b(this);
        }

        /* renamed from: f */
        public b m22945f(String... strArr) {
            if (!this.f19632a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f19633b = null;
            } else {
                this.f19633b = (String[]) strArr.clone();
            }
            return this;
        }

        /* renamed from: g */
        public b m22946g(EnumC5444a... enumC5444aArr) {
            if (!this.f19632a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[enumC5444aArr.length];
            for (int i7 = 0; i7 < enumC5444aArr.length; i7++) {
                strArr[i7] = enumC5444aArr[i7].f19623a;
            }
            this.f19633b = strArr;
            return this;
        }

        /* renamed from: h */
        public b m22947h(boolean z6) {
            if (!this.f19632a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f19635d = z6;
            return this;
        }

        /* renamed from: i */
        public b m22948i(String... strArr) {
            if (!this.f19632a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f19634c = null;
            } else {
                this.f19634c = (String[]) strArr.clone();
            }
            return this;
        }

        /* renamed from: j */
        public b m22949j(EnumC5454k... enumC5454kArr) {
            if (!this.f19632a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (enumC5454kArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[enumC5454kArr.length];
            for (int i7 = 0; i7 < enumC5454kArr.length; i7++) {
                strArr[i7] = enumC5454kArr[i7].f19690a;
            }
            this.f19634c = strArr;
            return this;
        }

        public b(C5445b c5445b) {
            this.f19632a = c5445b.f19628a;
            this.f19633b = c5445b.f19629b;
            this.f19634c = c5445b.f19630c;
            this.f19635d = c5445b.f19631d;
        }
    }

    public C5445b(b bVar) {
        this.f19628a = bVar.f19632a;
        this.f19629b = bVar.f19633b;
        this.f19630c = bVar.f19634c;
        this.f19631d = bVar.f19635d;
    }
}
