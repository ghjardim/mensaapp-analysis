package p088M3;

import org.apache.tika.utils.StringUtils;
import p116Q3.AbstractC2133b;

/* renamed from: M3.f */
/* loaded from: classes.dex */
public final class C1164f implements Comparable {

    /* renamed from: c */
    public static final C1164f f3754c = m4474f(StringUtils.EMPTY, StringUtils.EMPTY);

    /* renamed from: a */
    public final String f3755a;

    /* renamed from: b */
    public final String f3756b;

    public C1164f(String str, String str2) {
        this.f3755a = str;
        this.f3756b = str2;
    }

    /* renamed from: f */
    public static C1164f m4474f(String str, String str2) {
        return new C1164f(str, str2);
    }

    /* renamed from: g */
    public static C1164f m4475g(String str) {
        C1179u m4565v = C1179u.m4565v(str);
        AbstractC2133b.m7217d(m4565v.m4471q() > 3 && m4565v.m4468m(0).equals("projects") && m4565v.m4468m(2).equals("databases"), "Tried to parse an invalid resource name: %s", m4565v);
        return new C1164f(m4565v.m4468m(1), m4565v.m4468m(3));
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1164f c1164f) {
        int compareTo = this.f3755a.compareTo(c1164f.f3755a);
        return compareTo != 0 ? compareTo : this.f3756b.compareTo(c1164f.f3756b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1164f.class != obj.getClass()) {
            return false;
        }
        C1164f c1164f = (C1164f) obj;
        return this.f3755a.equals(c1164f.f3755a) && this.f3756b.equals(c1164f.f3756b);
    }

    /* renamed from: h */
    public String m4477h() {
        return this.f3756b;
    }

    public int hashCode() {
        return (this.f3755a.hashCode() * 31) + this.f3756b.hashCode();
    }

    /* renamed from: i */
    public String m4478i() {
        return this.f3755a;
    }

    public String toString() {
        return "DatabaseId(" + this.f3755a + ", " + this.f3756b + ")";
    }
}
