package p171Y2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* renamed from: Y2.i */
/* loaded from: classes.dex */
public abstract class AbstractC2926i {

    /* renamed from: Y2.i$b */
    public static final class b {

        /* renamed from: a */
        public final String f9015a;

        /* renamed from: b */
        public final C7190b f9016b;

        /* renamed from: c */
        public C7190b f9017c;

        /* renamed from: d */
        public boolean f9018d;

        /* renamed from: e */
        public boolean f9019e;

        /* renamed from: Y2.i$b$a */
        public static final class a extends C7190b {
            public a() {
            }
        }

        /* renamed from: Y2.i$b$b, reason: collision with other inner class name */
        public static class C7190b {

            /* renamed from: a */
            public String f9020a;

            /* renamed from: b */
            public Object f9021b;

            /* renamed from: c */
            public C7190b f9022c;
        }

        /* renamed from: l */
        public static boolean m10536l(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof AbstractC2929l ? !((AbstractC2929l) obj).mo10506c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* renamed from: a */
        public b m10537a(String str, double d7) {
            return m10546j(str, String.valueOf(d7));
        }

        /* renamed from: b */
        public b m10538b(String str, int i7) {
            return m10546j(str, String.valueOf(i7));
        }

        /* renamed from: c */
        public b m10539c(String str, long j7) {
            return m10546j(str, String.valueOf(j7));
        }

        /* renamed from: d */
        public b m10540d(String str, Object obj) {
            return m10544h(str, obj);
        }

        /* renamed from: e */
        public b m10541e(String str, boolean z6) {
            return m10546j(str, String.valueOf(z6));
        }

        /* renamed from: f */
        public final C7190b m10542f() {
            C7190b c7190b = new C7190b();
            this.f9017c.f9022c = c7190b;
            this.f9017c = c7190b;
            return c7190b;
        }

        /* renamed from: g */
        public final b m10543g(Object obj) {
            m10542f().f9021b = obj;
            return this;
        }

        /* renamed from: h */
        public final b m10544h(String str, Object obj) {
            C7190b m10542f = m10542f();
            m10542f.f9021b = obj;
            m10542f.f9020a = (String) AbstractC2932o.m10572o(str);
            return this;
        }

        /* renamed from: i */
        public final a m10545i() {
            a aVar = new a();
            this.f9017c.f9022c = aVar;
            this.f9017c = aVar;
            return aVar;
        }

        /* renamed from: j */
        public final b m10546j(String str, Object obj) {
            a m10545i = m10545i();
            m10545i.f9021b = obj;
            m10545i.f9020a = (String) AbstractC2932o.m10572o(str);
            return this;
        }

        /* renamed from: k */
        public b m10547k(Object obj) {
            return m10543g(obj);
        }

        /* renamed from: m */
        public b m10548m() {
            this.f9018d = true;
            return this;
        }

        public String toString() {
            boolean z6 = this.f9018d;
            boolean z7 = this.f9019e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f9015a);
            sb.append('{');
            String str = StringUtils.EMPTY;
            for (C7190b c7190b = this.f9016b.f9022c; c7190b != null; c7190b = c7190b.f9022c) {
                Object obj = c7190b.f9021b;
                if (!(c7190b instanceof a)) {
                    if (obj == null) {
                        if (z6) {
                        }
                    } else if (z7 && m10536l(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c7190b.f9020a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        public b(String str) {
            C7190b c7190b = new C7190b();
            this.f9016b = c7190b;
            this.f9017c = c7190b;
            this.f9018d = false;
            this.f9019e = false;
            this.f9015a = (String) AbstractC2932o.m10572o(str);
        }
    }

    /* renamed from: a */
    public static Object m10533a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static b m10534b(Class cls) {
        return new b(cls.getSimpleName());
    }

    /* renamed from: c */
    public static b m10535c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
