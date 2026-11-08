package p088M3;

import java.util.ArrayList;
import java.util.List;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;

/* renamed from: M3.e */
/* loaded from: classes.dex */
public abstract class AbstractC1163e implements Comparable {

    /* renamed from: a */
    public final List f3753a;

    public AbstractC1163e(List list) {
        this.f3753a = list;
    }

    /* renamed from: h */
    public static int m4459h(String str, String str2) {
        boolean m4461o = m4461o(str);
        boolean m4461o2 = m4461o(str2);
        if (m4461o && !m4461o2) {
            return -1;
        }
        if (m4461o || !m4461o2) {
            return (m4461o && m4461o2) ? Long.compare(m4460k(str), m4460k(str2)) : AbstractC2131I.m7200o(str, str2);
        }
        return 1;
    }

    /* renamed from: k */
    public static long m4460k(String str) {
        return Long.parseLong(str.substring(4, str.length() - 2));
    }

    /* renamed from: o */
    public static boolean m4461o(String str) {
        return str.startsWith("__id") && str.endsWith("__");
    }

    /* renamed from: b */
    public AbstractC1163e m4462b(AbstractC1163e abstractC1163e) {
        ArrayList arrayList = new ArrayList(this.f3753a);
        arrayList.addAll(abstractC1163e.f3753a);
        return mo4466j(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1163e) && compareTo((AbstractC1163e) obj) == 0;
    }

    /* renamed from: f */
    public AbstractC1163e m4463f(String str) {
        ArrayList arrayList = new ArrayList(this.f3753a);
        arrayList.add(str);
        return mo4466j(arrayList);
    }

    /* renamed from: g */
    public abstract String mo4464g();

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f3753a.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC1163e abstractC1163e) {
        int m4471q = m4471q();
        int m4471q2 = abstractC1163e.m4471q();
        for (int i7 = 0; i7 < m4471q && i7 < m4471q2; i7++) {
            int m4459h = m4459h(m4468m(i7), abstractC1163e.m4468m(i7));
            if (m4459h != 0) {
                return m4459h;
            }
        }
        return AbstractC2131I.m7197l(m4471q, m4471q2);
    }

    /* renamed from: j */
    public abstract AbstractC1163e mo4466j(List list);

    /* renamed from: l */
    public String m4467l() {
        return (String) this.f3753a.get(m4471q() - 1);
    }

    /* renamed from: m */
    public String m4468m(int i7) {
        return (String) this.f3753a.get(i7);
    }

    /* renamed from: n */
    public boolean m4469n() {
        return m4471q() == 0;
    }

    /* renamed from: p */
    public boolean m4470p(AbstractC1163e abstractC1163e) {
        if (m4471q() > abstractC1163e.m4471q()) {
            return false;
        }
        for (int i7 = 0; i7 < m4471q(); i7++) {
            if (!m4468m(i7).equals(abstractC1163e.m4468m(i7))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public int m4471q() {
        return this.f3753a.size();
    }

    /* renamed from: r */
    public AbstractC1163e m4472r(int i7) {
        int m4471q = m4471q();
        AbstractC2133b.m7217d(m4471q >= i7, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i7), Integer.valueOf(m4471q));
        return mo4466j(this.f3753a.subList(i7, m4471q));
    }

    /* renamed from: s */
    public AbstractC1163e m4473s() {
        return mo4466j(this.f3753a.subList(0, m4471q() - 1));
    }

    public String toString() {
        return mo4464g();
    }
}
