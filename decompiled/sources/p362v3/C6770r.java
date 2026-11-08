package p362v3;

/* renamed from: v3.r */
/* loaded from: classes.dex */
public final class C6770r {

    /* renamed from: a */
    public final C6751F f24361a;

    /* renamed from: b */
    public final int f24362b;

    /* renamed from: c */
    public final int f24363c;

    public C6770r(Class cls, int i7, int i8) {
        this(C6751F.m27706b(cls), i7, i8);
    }

    /* renamed from: a */
    public static C6770r m27793a(Class cls) {
        return new C6770r(cls, 0, 2);
    }

    /* renamed from: b */
    public static String m27794b(int i7) {
        if (i7 == 0) {
            return "direct";
        }
        if (i7 == 1) {
            return "provider";
        }
        if (i7 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i7);
    }

    /* renamed from: h */
    public static C6770r m27795h(Class cls) {
        return new C6770r(cls, 0, 0);
    }

    /* renamed from: i */
    public static C6770r m27796i(Class cls) {
        return new C6770r(cls, 0, 1);
    }

    /* renamed from: j */
    public static C6770r m27797j(C6751F c6751f) {
        return new C6770r(c6751f, 0, 1);
    }

    /* renamed from: k */
    public static C6770r m27798k(Class cls) {
        return new C6770r(cls, 1, 0);
    }

    /* renamed from: l */
    public static C6770r m27799l(C6751F c6751f) {
        return new C6770r(c6751f, 1, 0);
    }

    /* renamed from: m */
    public static C6770r m27800m(Class cls) {
        return new C6770r(cls, 1, 1);
    }

    /* renamed from: n */
    public static C6770r m27801n(Class cls) {
        return new C6770r(cls, 2, 0);
    }

    /* renamed from: c */
    public C6751F m27802c() {
        return this.f24361a;
    }

    /* renamed from: d */
    public boolean m27803d() {
        return this.f24363c == 2;
    }

    /* renamed from: e */
    public boolean m27804e() {
        return this.f24363c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6770r)) {
            return false;
        }
        C6770r c6770r = (C6770r) obj;
        return this.f24361a.equals(c6770r.f24361a) && this.f24362b == c6770r.f24362b && this.f24363c == c6770r.f24363c;
    }

    /* renamed from: f */
    public boolean m27805f() {
        return this.f24362b == 1;
    }

    /* renamed from: g */
    public boolean m27806g() {
        return this.f24362b == 2;
    }

    public int hashCode() {
        return ((((this.f24361a.hashCode() ^ 1000003) * 1000003) ^ this.f24362b) * 1000003) ^ this.f24363c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f24361a);
        sb.append(", type=");
        int i7 = this.f24362b;
        sb.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m27794b(this.f24363c));
        sb.append("}");
        return sb.toString();
    }

    public C6770r(C6751F c6751f, int i7, int i8) {
        this.f24361a = (C6751F) AbstractC6750E.m27703c(c6751f, "Null dependency anInterface.");
        this.f24362b = i7;
        this.f24363c = i8;
    }
}
