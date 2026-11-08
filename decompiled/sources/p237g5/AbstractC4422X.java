package p237g5;

/* renamed from: g5.X */
/* loaded from: classes2.dex */
public abstract class AbstractC4422X {

    /* renamed from: g5.X$a */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: d */
    public static AbstractC4422X m18759d() {
        AbstractC4422X m18766d = C4423Y.m18763b().m18766d();
        if (m18766d != null) {
            return m18766d;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* renamed from: a */
    public abstract AbstractC4421W mo18760a(String str);

    /* renamed from: b */
    public abstract boolean mo18761b();

    /* renamed from: c */
    public abstract int mo18762c();
}
