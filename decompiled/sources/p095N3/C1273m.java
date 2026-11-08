package p095N3;

import p088M3.C1177s;
import p088M3.C1181w;
import p116Q3.AbstractC2133b;

/* renamed from: N3.m */
/* loaded from: classes.dex */
public final class C1273m {

    /* renamed from: c */
    public static final C1273m f4009c = new C1273m(null, null);

    /* renamed from: a */
    public final C1181w f4010a;

    /* renamed from: b */
    public final Boolean f4011b;

    public C1273m(C1181w c1181w, Boolean bool) {
        AbstractC2133b.m7217d(c1181w == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f4010a = c1181w;
        this.f4011b = bool;
    }

    /* renamed from: a */
    public static C1273m m4868a(boolean z6) {
        return new C1273m(null, Boolean.valueOf(z6));
    }

    /* renamed from: f */
    public static C1273m m4869f(C1181w c1181w) {
        return new C1273m(c1181w, null);
    }

    /* renamed from: b */
    public Boolean m4870b() {
        return this.f4011b;
    }

    /* renamed from: c */
    public C1181w m4871c() {
        return this.f4010a;
    }

    /* renamed from: d */
    public boolean m4872d() {
        return this.f4010a == null && this.f4011b == null;
    }

    /* renamed from: e */
    public boolean m4873e(C1177s c1177s) {
        if (this.f4010a != null) {
            return c1177s.mo4482c() && c1177s.mo4490k().equals(this.f4010a);
        }
        Boolean bool = this.f4011b;
        if (bool != null) {
            return bool.booleanValue() == c1177s.mo4482c();
        }
        AbstractC2133b.m7217d(m4872d(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1273m.class != obj.getClass()) {
            return false;
        }
        C1273m c1273m = (C1273m) obj;
        C1181w c1181w = this.f4010a;
        if (c1181w == null ? c1273m.f4010a != null : !c1181w.equals(c1273m.f4010a)) {
            return false;
        }
        Boolean bool = this.f4011b;
        Boolean bool2 = c1273m.f4011b;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public int hashCode() {
        C1181w c1181w = this.f4010a;
        int hashCode = (c1181w != null ? c1181w.hashCode() : 0) * 31;
        Boolean bool = this.f4011b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        if (m4872d()) {
            return "Precondition{<none>}";
        }
        if (this.f4010a != null) {
            return "Precondition{updateTime=" + this.f4010a + "}";
        }
        if (this.f4011b == null) {
            throw AbstractC2133b.m7214a("Invalid Precondition", new Object[0]);
        }
        return "Precondition{exists=" + this.f4011b + "}";
    }
}
