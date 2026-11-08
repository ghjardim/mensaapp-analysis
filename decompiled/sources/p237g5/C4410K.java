package p237g5;

import java.util.concurrent.atomic.AtomicLong;
import p171Y2.AbstractC2932o;

/* renamed from: g5.K */
/* loaded from: classes2.dex */
public final class C4410K {

    /* renamed from: d */
    public static final AtomicLong f15630d = new AtomicLong();

    /* renamed from: a */
    public final String f15631a;

    /* renamed from: b */
    public final String f15632b;

    /* renamed from: c */
    public final long f15633c;

    public C4410K(String str, String str2, long j7) {
        AbstractC2932o.m10573p(str, "typeName");
        AbstractC2932o.m10562e(!str.isEmpty(), "empty type");
        this.f15631a = str;
        this.f15632b = str2;
        this.f15633c = j7;
    }

    /* renamed from: a */
    public static C4410K m18664a(Class cls, String str) {
        return m18665b(m18666c(cls), str);
    }

    /* renamed from: b */
    public static C4410K m18665b(String str, String str2) {
        return new C4410K(str, str2, m18667e());
    }

    /* renamed from: c */
    public static String m18666c(Class cls) {
        String simpleName = ((Class) AbstractC2932o.m10573p(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    /* renamed from: e */
    public static long m18667e() {
        return f15630d.incrementAndGet();
    }

    /* renamed from: d */
    public long m18668d() {
        return this.f15633c;
    }

    /* renamed from: f */
    public String m18669f() {
        return this.f15631a + "<" + this.f15633c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m18669f());
        if (this.f15632b != null) {
            sb.append(": (");
            sb.append(this.f15632b);
            sb.append(')');
        }
        return sb.toString();
    }
}
