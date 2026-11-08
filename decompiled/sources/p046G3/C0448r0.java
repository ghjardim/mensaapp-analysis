package p046G3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p095N3.C1264d;
import p116Q3.AbstractC2157z;

/* renamed from: G3.r0 */
/* loaded from: classes.dex */
public final class C0448r0 {

    /* renamed from: c */
    public static final C0448r0 f1596c = new C0448r0(false, null);

    /* renamed from: d */
    public static final C0448r0 f1597d = new C0448r0(true, null);

    /* renamed from: a */
    public final boolean f1598a;

    /* renamed from: b */
    public final C1264d f1599b;

    public C0448r0(boolean z6, C1264d c1264d) {
        AbstractC2157z.m7328a(c1264d == null || z6, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f1598a = z6;
        this.f1599b = c1264d;
    }

    /* renamed from: c */
    public static C0448r0 m1657c() {
        return f1597d;
    }

    /* renamed from: d */
    public static C0448r0 m1658d(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C0451t) it.next()).m1675c());
        }
        return new C0448r0(true, C1264d.m4827b(hashSet));
    }

    /* renamed from: a */
    public C1264d m1659a() {
        return this.f1599b;
    }

    /* renamed from: b */
    public boolean m1660b() {
        return this.f1598a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0448r0.class != obj.getClass()) {
            return false;
        }
        C0448r0 c0448r0 = (C0448r0) obj;
        if (this.f1598a != c0448r0.f1598a) {
            return false;
        }
        C1264d c1264d = this.f1599b;
        C1264d c1264d2 = c0448r0.f1599b;
        return c1264d != null ? c1264d.equals(c1264d2) : c1264d2 == null;
    }

    public int hashCode() {
        int i7 = (this.f1598a ? 1 : 0) * 31;
        C1264d c1264d = this.f1599b;
        return i7 + (c1264d != null ? c1264d.hashCode() : 0);
    }
}
