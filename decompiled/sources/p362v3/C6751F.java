package p362v3;

import org.apache.tika.utils.StringUtils;

/* renamed from: v3.F */
/* loaded from: classes.dex */
public final class C6751F {

    /* renamed from: a */
    public final Class f24304a;

    /* renamed from: b */
    public final Class f24305b;

    /* renamed from: v3.F$a */
    public @interface a {
    }

    public C6751F(Class cls, Class cls2) {
        this.f24304a = cls;
        this.f24305b = cls2;
    }

    /* renamed from: a */
    public static C6751F m27705a(Class cls, Class cls2) {
        return new C6751F(cls, cls2);
    }

    /* renamed from: b */
    public static C6751F m27706b(Class cls) {
        return new C6751F(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6751F.class != obj.getClass()) {
            return false;
        }
        C6751F c6751f = (C6751F) obj;
        if (this.f24305b.equals(c6751f.f24305b)) {
            return this.f24304a.equals(c6751f.f24304a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f24305b.hashCode() * 31) + this.f24304a.hashCode();
    }

    public String toString() {
        if (this.f24304a == a.class) {
            return this.f24305b.getName();
        }
        return "@" + this.f24304a.getName() + StringUtils.SPACE + this.f24305b.getName();
    }
}
