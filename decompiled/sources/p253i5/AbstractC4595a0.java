package p253i5;

import p253i5.C4551D;

/* renamed from: i5.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4595a0 implements C4551D.g {

    /* renamed from: a */
    public static final Throwable f16761a = m19792a();

    /* renamed from: a */
    public static Throwable m19792a() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException | Error | RuntimeException e7) {
            return e7;
        }
    }
}
