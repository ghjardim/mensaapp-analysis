package p362v3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p256j$.util.DesugarCollections;

/* renamed from: v3.c */
/* loaded from: classes.dex */
public final class C6755c {

    /* renamed from: a */
    public final String f24317a;

    /* renamed from: b */
    public final Set f24318b;

    /* renamed from: c */
    public final Set f24319c;

    /* renamed from: d */
    public final int f24320d;

    /* renamed from: e */
    public final int f24321e;

    /* renamed from: f */
    public final InterfaceC6760h f24322f;

    /* renamed from: g */
    public final Set f24323g;

    /* renamed from: c */
    public static b m27718c(Class cls) {
        return new b(cls, new Class[0]);
    }

    /* renamed from: d */
    public static b m27719d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    /* renamed from: e */
    public static b m27720e(C6751F c6751f) {
        return new b(c6751f, new C6751F[0]);
    }

    /* renamed from: f */
    public static b m27721f(C6751F c6751f, C6751F... c6751fArr) {
        return new b(c6751f, c6751fArr);
    }

    /* renamed from: l */
    public static C6755c m27722l(final Object obj, Class cls) {
        return m27723m(cls).m27741f(new InterfaceC6760h() { // from class: v3.a
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                Object m27724q;
                m27724q = C6755c.m27724q(obj, interfaceC6757e);
                return m27724q;
            }
        }).m27739d();
    }

    /* renamed from: m */
    public static b m27723m(Class cls) {
        return m27718c(cls).m27742g();
    }

    /* renamed from: s */
    public static C6755c m27726s(final Object obj, Class cls, Class... clsArr) {
        return m27719d(cls, clsArr).m27741f(new InterfaceC6760h() { // from class: v3.b
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                Object m27725r;
                m27725r = C6755c.m27725r(obj, interfaceC6757e);
                return m27725r;
            }
        }).m27739d();
    }

    /* renamed from: g */
    public Set m27727g() {
        return this.f24319c;
    }

    /* renamed from: h */
    public InterfaceC6760h m27728h() {
        return this.f24322f;
    }

    /* renamed from: i */
    public String m27729i() {
        return this.f24317a;
    }

    /* renamed from: j */
    public Set m27730j() {
        return this.f24318b;
    }

    /* renamed from: k */
    public Set m27731k() {
        return this.f24323g;
    }

    /* renamed from: n */
    public boolean m27732n() {
        return this.f24320d == 1;
    }

    /* renamed from: o */
    public boolean m27733o() {
        return this.f24320d == 2;
    }

    /* renamed from: p */
    public boolean m27734p() {
        return this.f24321e == 0;
    }

    /* renamed from: t */
    public C6755c m27735t(InterfaceC6760h interfaceC6760h) {
        return new C6755c(this.f24317a, this.f24318b, this.f24319c, this.f24320d, this.f24321e, interfaceC6760h, this.f24323g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f24318b.toArray()) + ">{" + this.f24320d + ", type=" + this.f24321e + ", deps=" + Arrays.toString(this.f24319c.toArray()) + "}";
    }

    /* renamed from: v3.c$b */
    public static class b {

        /* renamed from: a */
        public String f24324a;

        /* renamed from: b */
        public final Set f24325b;

        /* renamed from: c */
        public final Set f24326c;

        /* renamed from: d */
        public int f24327d;

        /* renamed from: e */
        public int f24328e;

        /* renamed from: f */
        public InterfaceC6760h f24329f;

        /* renamed from: g */
        public final Set f24330g;

        /* renamed from: b */
        public b m27737b(C6770r c6770r) {
            AbstractC6750E.m27703c(c6770r, "Null dependency");
            m27745j(c6770r.m27802c());
            this.f24326c.add(c6770r);
            return this;
        }

        /* renamed from: c */
        public b m27738c() {
            return m27744i(1);
        }

        /* renamed from: d */
        public C6755c m27739d() {
            AbstractC6750E.m27704d(this.f24329f != null, "Missing required property: factory.");
            return new C6755c(this.f24324a, new HashSet(this.f24325b), new HashSet(this.f24326c), this.f24327d, this.f24328e, this.f24329f, this.f24330g);
        }

        /* renamed from: e */
        public b m27740e() {
            return m27744i(2);
        }

        /* renamed from: f */
        public b m27741f(InterfaceC6760h interfaceC6760h) {
            this.f24329f = (InterfaceC6760h) AbstractC6750E.m27703c(interfaceC6760h, "Null factory");
            return this;
        }

        /* renamed from: g */
        public final b m27742g() {
            this.f24328e = 1;
            return this;
        }

        /* renamed from: h */
        public b m27743h(String str) {
            this.f24324a = str;
            return this;
        }

        /* renamed from: i */
        public final b m27744i(int i7) {
            AbstractC6750E.m27704d(this.f24327d == 0, "Instantiation type has already been set.");
            this.f24327d = i7;
            return this;
        }

        /* renamed from: j */
        public final void m27745j(C6751F c6751f) {
            AbstractC6750E.m27701a(!this.f24325b.contains(c6751f), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b(Class cls, Class... clsArr) {
            this.f24324a = null;
            HashSet hashSet = new HashSet();
            this.f24325b = hashSet;
            this.f24326c = new HashSet();
            this.f24327d = 0;
            this.f24328e = 0;
            this.f24330g = new HashSet();
            AbstractC6750E.m27703c(cls, "Null interface");
            hashSet.add(C6751F.m27706b(cls));
            for (Class cls2 : clsArr) {
                AbstractC6750E.m27703c(cls2, "Null interface");
                this.f24325b.add(C6751F.m27706b(cls2));
            }
        }

        public b(C6751F c6751f, C6751F... c6751fArr) {
            this.f24324a = null;
            HashSet hashSet = new HashSet();
            this.f24325b = hashSet;
            this.f24326c = new HashSet();
            this.f24327d = 0;
            this.f24328e = 0;
            this.f24330g = new HashSet();
            AbstractC6750E.m27703c(c6751f, "Null interface");
            hashSet.add(c6751f);
            for (C6751F c6751f2 : c6751fArr) {
                AbstractC6750E.m27703c(c6751f2, "Null interface");
            }
            Collections.addAll(this.f24325b, c6751fArr);
        }
    }

    public C6755c(String str, Set set, Set set2, int i7, int i8, InterfaceC6760h interfaceC6760h, Set set3) {
        this.f24317a = str;
        this.f24318b = DesugarCollections.unmodifiableSet(set);
        this.f24319c = DesugarCollections.unmodifiableSet(set2);
        this.f24320d = i7;
        this.f24321e = i8;
        this.f24322f = interfaceC6760h;
        this.f24323g = DesugarCollections.unmodifiableSet(set3);
    }

    /* renamed from: q */
    public static /* synthetic */ Object m27724q(Object obj, InterfaceC6757e interfaceC6757e) {
        return obj;
    }

    /* renamed from: r */
    public static /* synthetic */ Object m27725r(Object obj, InterfaceC6757e interfaceC6757e) {
        return obj;
    }
}
