package p349t6;

/* renamed from: t6.q */
/* loaded from: classes2.dex */
public abstract class AbstractC6579q {

    /* renamed from: a */
    public static b f23587a = null;

    /* renamed from: b */
    public static boolean f23588b = false;

    /* renamed from: t6.q$b */
    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    /* renamed from: a */
    public static Class m27314a() {
        int i7;
        b m27315b = m27315b();
        if (m27315b == null) {
            return null;
        }
        Class[] classContext = m27315b.getClassContext();
        String name = AbstractC6579q.class.getName();
        int i8 = 0;
        while (i8 < classContext.length && !name.equals(classContext[i8].getName())) {
            i8++;
        }
        if (i8 >= classContext.length || (i7 = i8 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i7];
    }

    /* renamed from: b */
    public static b m27315b() {
        b bVar = f23587a;
        if (bVar != null) {
            return bVar;
        }
        if (f23588b) {
            return null;
        }
        b m27316c = m27316c();
        f23587a = m27316c;
        f23588b = true;
        return m27316c;
    }

    /* renamed from: c */
    public static b m27316c() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m27317d(String str) {
        String m27318e = m27318e(str);
        if (m27318e == null) {
            return false;
        }
        return m27318e.equalsIgnoreCase("true");
    }

    /* renamed from: e */
    public static String m27318e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
