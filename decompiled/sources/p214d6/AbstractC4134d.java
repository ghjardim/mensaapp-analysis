package p214d6;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5469l;
import p206c6.C3601M;
import p206c6.C3616d;
import p206c6.C3619g;
import p378x5.AbstractC7029t;
import p378x5.AbstractC7032w;

/* renamed from: d6.d */
/* loaded from: classes2.dex */
public abstract class AbstractC4134d {

    /* renamed from: a */
    public static final C3619g f13841a;

    /* renamed from: b */
    public static final C3619g f13842b;

    /* renamed from: c */
    public static final C3619g f13843c;

    /* renamed from: d */
    public static final C3619g f13844d;

    /* renamed from: e */
    public static final C3619g f13845e;

    static {
        C3619g.a aVar = C3619g.f12117d;
        f13841a = aVar.m14654a("/");
        f13842b = aVar.m14654a("\\");
        f13843c = aVar.m14654a("/\\");
        f13844d = aVar.m14654a(".");
        f13845e = aVar.m14654a("..");
    }

    /* renamed from: j */
    public static final C3601M m17340j(C3601M c3601m, C3601M child, boolean z6) {
        AbstractC5469l.m23028e(c3601m, "<this>");
        AbstractC5469l.m23028e(child, "child");
        if (child.m14488i() || child.m14498s() != null) {
            return child;
        }
        C3619g m17343m = m17343m(c3601m);
        if (m17343m == null && (m17343m = m17343m(child)) == null) {
            m17343m = m17349s(C3601M.f12053c);
        }
        C3616d c3616d = new C3616d();
        c3616d.m14625l0(c3601m.m14485f());
        if (c3616d.m14618c0() > 0) {
            c3616d.m14625l0(m17343m);
        }
        c3616d.m14625l0(child.m14485f());
        return m17347q(c3616d, z6);
    }

    /* renamed from: k */
    public static final C3601M m17341k(String str, boolean z6) {
        AbstractC5469l.m23028e(str, "<this>");
        return m17347q(new C3616d().mo14506O(str), z6);
    }

    /* renamed from: l */
    public static final int m17342l(C3601M c3601m) {
        int m14640v = C3619g.m14640v(c3601m.m14485f(), f13841a, 0, 2, null);
        return m14640v != -1 ? m14640v : C3619g.m14640v(c3601m.m14485f(), f13842b, 0, 2, null);
    }

    /* renamed from: m */
    public static final C3619g m17343m(C3601M c3601m) {
        C3619g m14485f = c3601m.m14485f();
        C3619g c3619g = f13841a;
        if (C3619g.m14639q(m14485f, c3619g, 0, 2, null) != -1) {
            return c3619g;
        }
        C3619g m14485f2 = c3601m.m14485f();
        C3619g c3619g2 = f13842b;
        if (C3619g.m14639q(m14485f2, c3619g2, 0, 2, null) != -1) {
            return c3619g2;
        }
        return null;
    }

    /* renamed from: n */
    public static final boolean m17344n(C3601M c3601m) {
        return c3601m.m14485f().m14646h(f13845e) && (c3601m.m14485f().size() == 2 || c3601m.m14485f().mo14547x(c3601m.m14485f().size() + (-3), f13841a, 0, 1) || c3601m.m14485f().mo14547x(c3601m.m14485f().size() + (-3), f13842b, 0, 1));
    }

    /* renamed from: o */
    public static final int m17345o(C3601M c3601m) {
        if (c3601m.m14485f().size() == 0) {
            return -1;
        }
        if (c3601m.m14485f().m14647i(0) == 47) {
            return 1;
        }
        if (c3601m.m14485f().m14647i(0) == 92) {
            if (c3601m.m14485f().size() <= 2 || c3601m.m14485f().m14647i(1) != 92) {
                return 1;
            }
            int m14651o = c3601m.m14485f().m14651o(f13842b, 2);
            return m14651o == -1 ? c3601m.m14485f().size() : m14651o;
        }
        if (c3601m.m14485f().size() > 2 && c3601m.m14485f().m14647i(1) == 58 && c3601m.m14485f().m14647i(2) == 92) {
            char m14647i = (char) c3601m.m14485f().m14647i(0);
            if ('a' <= m14647i && m14647i < '{') {
                return 3;
            }
            if ('A' <= m14647i && m14647i < '[') {
                return 3;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public static final boolean m17346p(C3616d c3616d, C3619g c3619g) {
        if (!AbstractC5469l.m23024a(c3619g, f13842b) || c3616d.m14618c0() < 2 || c3616d.m14627o(1L) != 58) {
            return false;
        }
        char m14627o = (char) c3616d.m14627o(0L);
        return ('a' <= m14627o && m14627o < '{') || ('A' <= m14627o && m14627o < '[');
    }

    /* renamed from: q */
    public static final C3601M m17347q(C3616d c3616d, boolean z6) {
        C3619g c3619g;
        C3619g mo14519p;
        AbstractC5469l.m23028e(c3616d, "<this>");
        C3616d c3616d2 = new C3616d();
        C3619g c3619g2 = null;
        int i7 = 0;
        while (true) {
            if (!c3616d.m14633y(0L, f13841a)) {
                c3619g = f13842b;
                if (!c3616d.m14633y(0L, c3619g)) {
                    break;
                }
            }
            byte readByte = c3616d.readByte();
            if (c3619g2 == null) {
                c3619g2 = m17348r(readByte);
            }
            i7++;
        }
        boolean z7 = i7 >= 2 && AbstractC5469l.m23024a(c3619g2, c3619g);
        if (z7) {
            AbstractC5469l.m23025b(c3619g2);
            c3616d2.m14625l0(c3619g2);
            c3616d2.m14625l0(c3619g2);
        } else if (i7 > 0) {
            AbstractC5469l.m23025b(c3619g2);
            c3616d2.m14625l0(c3619g2);
        } else {
            long m14630v = c3616d.m14630v(f13843c);
            if (c3619g2 == null) {
                c3619g2 = m14630v == -1 ? m17349s(C3601M.f12053c) : m17348r(c3616d.m14627o(m14630v));
            }
            if (m17346p(c3616d, c3619g2)) {
                if (m14630v == 2) {
                    c3616d2.mo14482s(c3616d, 3L);
                } else {
                    c3616d2.mo14482s(c3616d, 2L);
                }
            }
        }
        boolean z8 = c3616d2.m14618c0() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c3616d.mo14523z()) {
            long m14630v2 = c3616d.m14630v(f13843c);
            if (m14630v2 == -1) {
                mo14519p = c3616d.m14606F();
            } else {
                mo14519p = c3616d.mo14519p(m14630v2);
                c3616d.readByte();
            }
            C3619g c3619g3 = f13845e;
            if (AbstractC5469l.m23024a(mo14519p, c3619g3)) {
                if (!z8 || !arrayList.isEmpty()) {
                    if (!z6 || (!z8 && (arrayList.isEmpty() || AbstractC5469l.m23024a(AbstractC7032w.m28879E(arrayList), c3619g3)))) {
                        arrayList.add(mo14519p);
                    } else if (!z7 || arrayList.size() != 1) {
                        AbstractC7029t.m28873s(arrayList);
                    }
                }
            } else if (!AbstractC5469l.m23024a(mo14519p, f13844d) && !AbstractC5469l.m23024a(mo14519p, C3619g.f12118e)) {
                arrayList.add(mo14519p);
            }
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                c3616d2.m14625l0(c3619g2);
            }
            c3616d2.m14625l0((C3619g) arrayList.get(i8));
        }
        if (c3616d2.m14618c0() == 0) {
            c3616d2.m14625l0(f13844d);
        }
        return new C3601M(c3616d2.m14606F());
    }

    /* renamed from: r */
    public static final C3619g m17348r(byte b7) {
        if (b7 == 47) {
            return f13841a;
        }
        if (b7 == 92) {
            return f13842b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b7));
    }

    /* renamed from: s */
    public static final C3619g m17349s(String str) {
        if (AbstractC5469l.m23024a(str, "/")) {
            return f13841a;
        }
        if (AbstractC5469l.m23024a(str, "\\")) {
            return f13842b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
