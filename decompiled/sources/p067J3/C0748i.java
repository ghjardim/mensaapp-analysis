package p067J3;

import java.util.List;
import p067J3.C0735b0;
import p088M3.AbstractC1184z;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;

/* renamed from: J3.i */
/* loaded from: classes.dex */
public final class C0748i {

    /* renamed from: a */
    public final boolean f2640a;

    /* renamed from: b */
    public final List f2641b;

    public C0748i(List list, boolean z6) {
        this.f2641b = list;
        this.f2640a = z6;
    }

    /* renamed from: a */
    public final int m3198a(List list, InterfaceC1167i interfaceC1167i) {
        int m4599i;
        AbstractC2133b.m7217d(this.f2641b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i7 = 0;
        for (int i8 = 0; i8 < this.f2641b.size(); i8++) {
            C0735b0 c0735b0 = (C0735b0) list.get(i8);
            C5413D c5413d = (C5413D) this.f2641b.get(i8);
            if (c0735b0.f2571b.equals(C1176r.f3773b)) {
                AbstractC2133b.m7217d(AbstractC1184z.m4583C(c5413d), "Bound has a non-key value where the key path is being used %s", c5413d);
                m4599i = C1170l.m4497i(c5413d.m22460t0()).compareTo(interfaceC1167i.getKey());
            } else {
                C5413D mo4485f = interfaceC1167i.mo4485f(c0735b0.m3087c());
                AbstractC2133b.m7217d(mo4485f != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                m4599i = AbstractC1184z.m4599i(c5413d, mo4485f);
            }
            if (c0735b0.m3086b().equals(C0735b0.a.DESCENDING)) {
                m4599i *= -1;
            }
            i7 = m4599i;
            if (i7 != 0) {
                break;
            }
        }
        return i7;
    }

    /* renamed from: b */
    public List m3199b() {
        return this.f2641b;
    }

    /* renamed from: c */
    public boolean m3200c() {
        return this.f2640a;
    }

    /* renamed from: d */
    public String m3201d() {
        StringBuilder sb = new StringBuilder();
        boolean z6 = true;
        for (C5413D c5413d : this.f2641b) {
            if (!z6) {
                sb.append(",");
            }
            sb.append(AbstractC1184z.m4592b(c5413d));
            z6 = false;
        }
        return sb.toString();
    }

    /* renamed from: e */
    public boolean m3202e(List list, InterfaceC1167i interfaceC1167i) {
        int m3198a = m3198a(list, interfaceC1167i);
        if (this.f2640a) {
            if (m3198a < 0) {
                return false;
            }
        } else if (m3198a <= 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0748i.class != obj.getClass()) {
            return false;
        }
        C0748i c0748i = (C0748i) obj;
        return this.f2640a == c0748i.f2640a && this.f2641b.equals(c0748i.f2641b);
    }

    /* renamed from: f */
    public boolean m3203f(List list, InterfaceC1167i interfaceC1167i) {
        int m3198a = m3198a(list, interfaceC1167i);
        if (this.f2640a) {
            if (m3198a > 0) {
                return false;
            }
        } else if (m3198a >= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f2640a ? 1 : 0) * 31) + this.f2641b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.f2640a);
        sb.append(", position=");
        for (int i7 = 0; i7 < this.f2641b.size(); i7++) {
            if (i7 > 0) {
                sb.append(" and ");
            }
            sb.append(AbstractC1184z.m4592b((C5413D) this.f2641b.get(i7)));
        }
        sb.append(")");
        return sb.toString();
    }
}
