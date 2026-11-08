package p362v3;

import java.util.HashSet;
import java.util.Set;
import p039F3.C0333a;
import p039F3.InterfaceC0335c;
import p137T3.InterfaceC2446a;
import p137T3.InterfaceC2447b;
import p256j$.util.DesugarCollections;

/* renamed from: v3.G */
/* loaded from: classes.dex */
public final class C6752G implements InterfaceC6757e {

    /* renamed from: a */
    public final Set f24306a;

    /* renamed from: b */
    public final Set f24307b;

    /* renamed from: c */
    public final Set f24308c;

    /* renamed from: d */
    public final Set f24309d;

    /* renamed from: e */
    public final Set f24310e;

    /* renamed from: f */
    public final Set f24311f;

    /* renamed from: g */
    public final InterfaceC6757e f24312g;

    /* renamed from: v3.G$a */
    public static class a implements InterfaceC0335c {

        /* renamed from: a */
        public final Set f24313a;

        /* renamed from: b */
        public final InterfaceC0335c f24314b;

        public a(Set set, InterfaceC0335c interfaceC0335c) {
            this.f24313a = set;
            this.f24314b = interfaceC0335c;
        }

        @Override // p039F3.InterfaceC0335c
        /* renamed from: a */
        public void mo1338a(C0333a c0333a) {
            if (!this.f24313a.contains(c0333a.m1336b())) {
                throw new C6772t(String.format("Attempting to publish an undeclared event %s.", c0333a));
            }
            this.f24314b.mo1338a(c0333a);
        }
    }

    public C6752G(C6755c c6755c, InterfaceC6757e interfaceC6757e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C6770r c6770r : c6755c.m27727g()) {
            if (c6770r.m27804e()) {
                if (c6770r.m27806g()) {
                    hashSet4.add(c6770r.m27802c());
                } else {
                    hashSet.add(c6770r.m27802c());
                }
            } else if (c6770r.m27803d()) {
                hashSet3.add(c6770r.m27802c());
            } else if (c6770r.m27806g()) {
                hashSet5.add(c6770r.m27802c());
            } else {
                hashSet2.add(c6770r.m27802c());
            }
        }
        if (!c6755c.m27731k().isEmpty()) {
            hashSet.add(C6751F.m27706b(InterfaceC0335c.class));
        }
        this.f24306a = DesugarCollections.unmodifiableSet(hashSet);
        this.f24307b = DesugarCollections.unmodifiableSet(hashSet2);
        this.f24308c = DesugarCollections.unmodifiableSet(hashSet3);
        this.f24309d = DesugarCollections.unmodifiableSet(hashSet4);
        this.f24310e = DesugarCollections.unmodifiableSet(hashSet5);
        this.f24311f = c6755c.m27731k();
        this.f24312g = interfaceC6757e;
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: a */
    public Object mo27707a(Class cls) {
        if (!this.f24306a.contains(C6751F.m27706b(cls))) {
            throw new C6772t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object mo27707a = this.f24312g.mo27707a(cls);
        return !cls.equals(InterfaceC0335c.class) ? mo27707a : new a(this.f24311f, (InterfaceC0335c) mo27707a);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: b */
    public InterfaceC2447b mo27708b(Class cls) {
        return mo27712f(C6751F.m27706b(cls));
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: c */
    public InterfaceC2446a mo27709c(C6751F c6751f) {
        if (this.f24308c.contains(c6751f)) {
            return this.f24312g.mo27709c(c6751f);
        }
        throw new C6772t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c6751f));
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: d */
    public InterfaceC2447b mo27710d(C6751F c6751f) {
        if (this.f24310e.contains(c6751f)) {
            return this.f24312g.mo27710d(c6751f);
        }
        throw new C6772t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c6751f));
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: e */
    public /* synthetic */ Set mo27711e(Class cls) {
        return AbstractC6756d.m27750e(this, cls);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: f */
    public InterfaceC2447b mo27712f(C6751F c6751f) {
        if (this.f24307b.contains(c6751f)) {
            return this.f24312g.mo27712f(c6751f);
        }
        throw new C6772t(String.format("Attempting to request an undeclared dependency Provider<%s>.", c6751f));
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: g */
    public Set mo27713g(C6751F c6751f) {
        if (this.f24309d.contains(c6751f)) {
            return this.f24312g.mo27713g(c6751f);
        }
        throw new C6772t(String.format("Attempting to request an undeclared dependency Set<%s>.", c6751f));
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: h */
    public InterfaceC2446a mo27714h(Class cls) {
        return mo27709c(C6751F.m27706b(cls));
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: i */
    public Object mo27715i(C6751F c6751f) {
        if (this.f24306a.contains(c6751f)) {
            return this.f24312g.mo27715i(c6751f);
        }
        throw new C6772t(String.format("Attempting to request an undeclared dependency %s.", c6751f));
    }
}
