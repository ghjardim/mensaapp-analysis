package p273k5;

/* renamed from: k5.k */
/* loaded from: classes2.dex */
public enum EnumC5454k {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: a */
    public final String f19690a;

    EnumC5454k(String str) {
        this.f19690a = str;
    }

    /* renamed from: b */
    public static EnumC5454k m22999b(String str) {
        if ("TLSv1.3".equals(str)) {
            return TLS_1_3;
        }
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: " + str);
    }
}
