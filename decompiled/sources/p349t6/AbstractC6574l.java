package p349t6;

import java.io.PrintStream;

/* renamed from: t6.l */
/* loaded from: classes2.dex */
public abstract class AbstractC6574l {

    /* renamed from: a */
    public static final String[] f23561a = {"System.out", "stdout", "sysout"};

    /* renamed from: b */
    public static final b f23562b = m27295e();

    /* renamed from: c */
    public static final a f23563c = m27297g();

    /* renamed from: t6.l$a */
    public enum a {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);


        /* renamed from: a */
        public int f23569a;

        a(int i7) {
            this.f23569a = i7;
        }
    }

    /* renamed from: t6.l$b */
    public enum b {
        Stderr,
        Stdout
    }

    /* renamed from: a */
    public static void m27291a(String str) {
        if (m27298h(a.DEBUG)) {
            m27294d().println("SLF4J(D): " + str);
        }
    }

    /* renamed from: b */
    public static final void m27292b(String str) {
        m27294d().println("SLF4J(E): " + str);
    }

    /* renamed from: c */
    public static final void m27293c(String str, Throwable th) {
        m27294d().println("SLF4J(E): " + str);
        m27294d().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m27294d());
    }

    /* renamed from: d */
    public static PrintStream m27294d() {
        return f23562b.ordinal() != 1 ? System.err : System.out;
    }

    /* renamed from: e */
    public static b m27295e() {
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property == null || property.isEmpty()) {
            return b.Stderr;
        }
        for (String str : f23561a) {
            if (str.equalsIgnoreCase(property)) {
                return b.Stdout;
            }
        }
        return b.Stderr;
    }

    /* renamed from: f */
    public static void m27296f(String str) {
        if (m27298h(a.INFO)) {
            m27294d().println("SLF4J(I): " + str);
        }
    }

    /* renamed from: g */
    public static a m27297g() {
        String property = System.getProperty("slf4j.internal.verbosity");
        return (property == null || property.isEmpty()) ? a.INFO : property.equalsIgnoreCase("DEBUG") ? a.DEBUG : property.equalsIgnoreCase("ERROR") ? a.ERROR : property.equalsIgnoreCase("WARN") ? a.WARN : a.INFO;
    }

    /* renamed from: h */
    public static boolean m27298h(a aVar) {
        return aVar.f23569a >= f23563c.f23569a;
    }

    /* renamed from: i */
    public static final void m27299i(String str) {
        if (m27298h(a.WARN)) {
            m27294d().println("SLF4J(W): " + str);
        }
    }
}
