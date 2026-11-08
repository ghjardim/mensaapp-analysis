package p206c6;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p214d6.AbstractC4134d;

/* renamed from: c6.M */
/* loaded from: classes2.dex */
public final class C3601M implements Comparable {

    /* renamed from: b */
    public static final a f12052b = new a(null);

    /* renamed from: c */
    public static final String f12053c;

    /* renamed from: a */
    public final C3619g f12054a;

    /* renamed from: c6.M$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C3601M m14499d(a aVar, File file, boolean z6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z6 = false;
            }
            return aVar.m14502a(file, z6);
        }

        /* renamed from: e */
        public static /* synthetic */ C3601M m14500e(a aVar, String str, boolean z6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z6 = false;
            }
            return aVar.m14503b(str, z6);
        }

        /* renamed from: f */
        public static /* synthetic */ C3601M m14501f(a aVar, Path path, boolean z6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z6 = false;
            }
            return aVar.m14504c(path, z6);
        }

        /* renamed from: a */
        public final C3601M m14502a(File file, boolean z6) {
            AbstractC5469l.m23028e(file, "<this>");
            String file2 = file.toString();
            AbstractC5469l.m23027d(file2, "toString()");
            return m14503b(file2, z6);
        }

        /* renamed from: b */
        public final C3601M m14503b(String str, boolean z6) {
            AbstractC5469l.m23028e(str, "<this>");
            return AbstractC4134d.m17341k(str, z6);
        }

        /* renamed from: c */
        public final C3601M m14504c(Path path, boolean z6) {
            AbstractC5469l.m23028e(path, "<this>");
            return m14503b(path.toString(), z6);
        }

        public a() {
        }
    }

    static {
        String separator = File.separator;
        AbstractC5469l.m23027d(separator, "separator");
        f12053c = separator;
    }

    public C3601M(C3619g bytes) {
        AbstractC5469l.m23028e(bytes, "bytes");
        this.f12054a = bytes;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3601M other) {
        AbstractC5469l.m23028e(other, "other");
        return m14485f().compareTo(other.m14485f());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3601M) && AbstractC5469l.m23024a(((C3601M) obj).m14485f(), m14485f());
    }

    /* renamed from: f */
    public final C3619g m14485f() {
        return this.f12054a;
    }

    /* renamed from: g */
    public final C3601M m14486g() {
        int m17345o;
        m17345o = AbstractC4134d.m17345o(this);
        if (m17345o == -1) {
            return null;
        }
        return new C3601M(m14485f().mo14533C(0, m17345o));
    }

    /* renamed from: h */
    public final List m14487h() {
        int m17345o;
        ArrayList arrayList = new ArrayList();
        m17345o = AbstractC4134d.m17345o(this);
        if (m17345o == -1) {
            m17345o = 0;
        } else if (m17345o < m14485f().size() && m14485f().m14647i(m17345o) == 92) {
            m17345o++;
        }
        int size = m14485f().size();
        int i7 = m17345o;
        while (m17345o < size) {
            if (m14485f().m14647i(m17345o) == 47 || m14485f().m14647i(m17345o) == 92) {
                arrayList.add(m14485f().mo14533C(i7, m17345o));
                i7 = m17345o + 1;
            }
            m17345o++;
        }
        if (i7 < m14485f().size()) {
            arrayList.add(m14485f().mo14533C(i7, m14485f().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return m14485f().hashCode();
    }

    /* renamed from: i */
    public final boolean m14488i() {
        int m17345o;
        m17345o = AbstractC4134d.m17345o(this);
        return m17345o != -1;
    }

    /* renamed from: j */
    public final String m14489j() {
        return m14490k().m14644G();
    }

    /* renamed from: k */
    public final C3619g m14490k() {
        int m17342l;
        m17342l = AbstractC4134d.m17342l(this);
        return m17342l != -1 ? C3619g.m14637D(m14485f(), m17342l + 1, 0, 2, null) : (m14498s() == null || m14485f().size() != 2) ? m14485f() : C3619g.f12118e;
    }

    /* renamed from: l */
    public final C3601M m14491l() {
        return f12052b.m14503b(toString(), true);
    }

    /* renamed from: m */
    public final C3601M m14492m() {
        C3619g c3619g;
        C3619g c3619g2;
        C3619g c3619g3;
        boolean m17344n;
        int m17342l;
        C3601M c3601m;
        C3619g c3619g4;
        C3619g c3619g5;
        C3619g m14485f = m14485f();
        c3619g = AbstractC4134d.f13844d;
        if (AbstractC5469l.m23024a(m14485f, c3619g)) {
            return null;
        }
        C3619g m14485f2 = m14485f();
        c3619g2 = AbstractC4134d.f13841a;
        if (AbstractC5469l.m23024a(m14485f2, c3619g2)) {
            return null;
        }
        C3619g m14485f3 = m14485f();
        c3619g3 = AbstractC4134d.f13842b;
        if (AbstractC5469l.m23024a(m14485f3, c3619g3)) {
            return null;
        }
        m17344n = AbstractC4134d.m17344n(this);
        if (m17344n) {
            return null;
        }
        m17342l = AbstractC4134d.m17342l(this);
        if (m17342l != 2 || m14498s() == null) {
            if (m17342l == 1) {
                C3619g m14485f4 = m14485f();
                c3619g5 = AbstractC4134d.f13842b;
                if (m14485f4.m14643B(c3619g5)) {
                    return null;
                }
            }
            if (m17342l != -1 || m14498s() == null) {
                if (m17342l == -1) {
                    c3619g4 = AbstractC4134d.f13844d;
                    return new C3601M(c3619g4);
                }
                if (m17342l != 0) {
                    return new C3601M(C3619g.m14637D(m14485f(), 0, m17342l, 1, null));
                }
                c3601m = new C3601M(C3619g.m14637D(m14485f(), 0, 1, 1, null));
            } else {
                if (m14485f().size() == 2) {
                    return null;
                }
                c3601m = new C3601M(C3619g.m14637D(m14485f(), 0, 2, 1, null));
            }
        } else {
            if (m14485f().size() == 3) {
                return null;
            }
            c3601m = new C3601M(C3619g.m14637D(m14485f(), 0, 3, 1, null));
        }
        return c3601m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r9 = p214d6.AbstractC4134d.m17343m(r8);
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p206c6.C3601M m14493n(p206c6.C3601M r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC5469l.m23028e(r9, r0)
            c6.M r0 = r8.m14486g()
            c6.M r1 = r9.m14486g()
            boolean r0 = kotlin.jvm.internal.AbstractC5469l.m23024a(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Ld6
            java.util.List r0 = r8.m14487h()
            java.util.List r2 = r9.m14487h()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = r4
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.AbstractC5469l.m23024a(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            c6.g r3 = r8.m14485f()
            int r3 = r3.size()
            c6.g r6 = r9.m14485f()
            int r6 = r6.size()
            if (r3 != r6) goto L5d
            c6.M$a r9 = p206c6.C3601M.f12052b
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            c6.M r9 = p206c6.C3601M.a.m14500e(r9, r0, r4, r2, r1)
            goto Lb4
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            c6.g r6 = p214d6.AbstractC4134d.m17333c()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lb5
            c6.d r1 = new c6.d
            r1.<init>()
            c6.g r9 = p214d6.AbstractC4134d.m17336f(r9)
            if (r9 != 0) goto L87
            c6.g r9 = p214d6.AbstractC4134d.m17336f(r8)
            if (r9 != 0) goto L87
            java.lang.String r9 = p206c6.C3601M.f12053c
            c6.g r9 = p214d6.AbstractC4134d.m17339i(r9)
        L87:
            int r2 = r2.size()
            r3 = r5
        L8c:
            if (r3 >= r2) goto L9b
            c6.g r6 = p214d6.AbstractC4134d.m17333c()
            r1.m14625l0(r6)
            r1.m14625l0(r9)
            int r3 = r3 + 1
            goto L8c
        L9b:
            int r2 = r0.size()
        L9f:
            if (r5 >= r2) goto Lb0
            java.lang.Object r3 = r0.get(r5)
            c6.g r3 = (p206c6.C3619g) r3
            r1.m14625l0(r3)
            r1.m14625l0(r9)
            int r5 = r5 + 1
            goto L9f
        Lb0:
            c6.M r9 = p214d6.AbstractC4134d.m17347q(r1, r4)
        Lb4:
            return r9
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Ld6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p206c6.C3601M.m14493n(c6.M):c6.M");
    }

    /* renamed from: o */
    public final C3601M m14494o(C3601M child, boolean z6) {
        AbstractC5469l.m23028e(child, "child");
        return AbstractC4134d.m17340j(this, child, z6);
    }

    /* renamed from: p */
    public final C3601M m14495p(String child) {
        AbstractC5469l.m23028e(child, "child");
        return AbstractC4134d.m17340j(this, AbstractC4134d.m17347q(new C3616d().mo14506O(child), false), false);
    }

    /* renamed from: q */
    public final File m14496q() {
        return new File(toString());
    }

    /* renamed from: r */
    public final Path m14497r() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        AbstractC5469l.m23027d(path, "get(toString())");
        return path;
    }

    /* renamed from: s */
    public final Character m14498s() {
        C3619g c3619g;
        C3619g m14485f = m14485f();
        c3619g = AbstractC4134d.f13841a;
        if (C3619g.m14639q(m14485f, c3619g, 0, 2, null) != -1 || m14485f().size() < 2 || m14485f().m14647i(1) != 58) {
            return null;
        }
        char m14647i = (char) m14485f().m14647i(0);
        if (('a' > m14647i || m14647i >= '{') && ('A' > m14647i || m14647i >= '[')) {
            return null;
        }
        return Character.valueOf(m14647i);
    }

    public String toString() {
        return m14485f().m14644G();
    }
}
