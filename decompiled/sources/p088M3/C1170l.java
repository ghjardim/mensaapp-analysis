package p088M3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p116Q3.AbstractC2133b;
import p376x3.C6950e;

/* renamed from: M3.l */
/* loaded from: classes.dex */
public final class C1170l implements Comparable {

    /* renamed from: b */
    public static final Comparator f3759b;

    /* renamed from: c */
    public static final C6950e f3760c;

    /* renamed from: a */
    public final C1179u f3761a;

    static {
        Comparator comparator = new Comparator() { // from class: M3.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C1170l) obj).compareTo((C1170l) obj2);
            }
        };
        f3759b = comparator;
        f3760c = new C6950e(Collections.emptyList(), comparator);
    }

    public C1170l(C1179u c1179u) {
        AbstractC2133b.m7217d(m4500q(c1179u), "Not a document key path: %s", c1179u);
        this.f3761a = c1179u;
    }

    /* renamed from: b */
    public static Comparator m4494b() {
        return f3759b;
    }

    /* renamed from: g */
    public static C1170l m4495g() {
        return m4499k(Collections.emptyList());
    }

    /* renamed from: h */
    public static C6950e m4496h() {
        return f3760c;
    }

    /* renamed from: i */
    public static C1170l m4497i(String str) {
        C1179u m4565v = C1179u.m4565v(str);
        AbstractC2133b.m7217d(m4565v.m4471q() > 4 && m4565v.m4468m(0).equals("projects") && m4565v.m4468m(2).equals("databases") && m4565v.m4468m(4).equals("documents"), "Tried to parse an invalid key: %s", m4565v);
        return m4498j((C1179u) m4565v.m4472r(5));
    }

    /* renamed from: j */
    public static C1170l m4498j(C1179u c1179u) {
        return new C1170l(c1179u);
    }

    /* renamed from: k */
    public static C1170l m4499k(List list) {
        return new C1170l(C1179u.m4564u(list));
    }

    /* renamed from: q */
    public static boolean m4500q(C1179u c1179u) {
        return c1179u.m4471q() % 2 == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1170l.class != obj.getClass()) {
            return false;
        }
        return this.f3761a.equals(((C1170l) obj).f3761a);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1170l c1170l) {
        return this.f3761a.compareTo(c1170l.f3761a);
    }

    public int hashCode() {
        return this.f3761a.hashCode();
    }

    /* renamed from: l */
    public String m4502l() {
        return this.f3761a.m4468m(r0.m4471q() - 2);
    }

    /* renamed from: m */
    public C1179u m4503m() {
        return (C1179u) this.f3761a.m4473s();
    }

    /* renamed from: n */
    public String m4504n() {
        return this.f3761a.m4467l();
    }

    /* renamed from: o */
    public C1179u m4505o() {
        return this.f3761a;
    }

    /* renamed from: p */
    public boolean m4506p(String str) {
        if (this.f3761a.m4471q() >= 2) {
            C1179u c1179u = this.f3761a;
            if (((String) c1179u.f3753a.get(c1179u.m4471q() - 2)).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f3761a.toString();
    }
}
