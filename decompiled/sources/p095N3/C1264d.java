package p095N3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p088M3.C1176r;

/* renamed from: N3.d */
/* loaded from: classes.dex */
public final class C1264d {

    /* renamed from: b */
    public static C1264d f3988b = m4827b(new HashSet());

    /* renamed from: a */
    public final Set f3989a;

    public C1264d(Set set) {
        this.f3989a = set;
    }

    /* renamed from: b */
    public static C1264d m4827b(Set set) {
        return new C1264d(set);
    }

    /* renamed from: a */
    public boolean m4828a(C1176r c1176r) {
        Iterator it = this.f3989a.iterator();
        while (it.hasNext()) {
            if (((C1176r) it.next()).m4470p(c1176r)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public Set m4829c() {
        return this.f3989a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1264d.class != obj.getClass()) {
            return false;
        }
        return this.f3989a.equals(((C1264d) obj).f3989a);
    }

    public int hashCode() {
        return this.f3989a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f3989a.toString() + "}";
    }
}
