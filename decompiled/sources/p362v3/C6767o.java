package p362v3;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p039F3.InterfaceC0335c;
import p039F3.InterfaceC0336d;
import p137T3.InterfaceC2446a;
import p137T3.InterfaceC2447b;
import p362v3.C6767o;
import p366w0.AbstractC6820f;
import p390z3.InterfaceC7145a;

/* renamed from: v3.o */
/* loaded from: classes.dex */
public class C6767o implements InterfaceC6757e, InterfaceC7145a {

    /* renamed from: i */
    public static final InterfaceC2447b f24342i = new InterfaceC2447b() { // from class: v3.k
        @Override // p137T3.InterfaceC2447b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    public final Map f24343a;

    /* renamed from: b */
    public final Map f24344b;

    /* renamed from: c */
    public final Map f24345c;

    /* renamed from: d */
    public final List f24346d;

    /* renamed from: e */
    public Set f24347e;

    /* renamed from: f */
    public final C6774v f24348f;

    /* renamed from: g */
    public final AtomicReference f24349g;

    /* renamed from: h */
    public final InterfaceC6762j f24350h;

    /* renamed from: m */
    public static b m27763m(Executor executor) {
        return new b(executor);
    }

    /* renamed from: q */
    public static List m27764q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: a */
    public /* synthetic */ Object mo27707a(Class cls) {
        return AbstractC6756d.m27746a(this, cls);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: b */
    public /* synthetic */ InterfaceC2447b mo27708b(Class cls) {
        return AbstractC6756d.m27749d(this, cls);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: c */
    public InterfaceC2446a mo27709c(C6751F c6751f) {
        InterfaceC2447b mo27712f = mo27712f(c6751f);
        return mo27712f == null ? C6749D.m27695e() : mo27712f instanceof C6749D ? (C6749D) mo27712f : C6749D.m27699i(mo27712f);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: d */
    public synchronized InterfaceC2447b mo27710d(C6751F c6751f) {
        C6777y c6777y = (C6777y) this.f24345c.get(c6751f);
        if (c6777y != null) {
            return c6777y;
        }
        return f24342i;
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: e */
    public /* synthetic */ Set mo27711e(Class cls) {
        return AbstractC6756d.m27750e(this, cls);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: f */
    public synchronized InterfaceC2447b mo27712f(C6751F c6751f) {
        AbstractC6750E.m27703c(c6751f, "Null interface requested.");
        return (InterfaceC2447b) this.f24344b.get(c6751f);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: g */
    public /* synthetic */ Set mo27713g(C6751F c6751f) {
        return AbstractC6756d.m27751f(this, c6751f);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: h */
    public /* synthetic */ InterfaceC2446a mo27714h(Class cls) {
        return AbstractC6756d.m27748c(this, cls);
    }

    @Override // p362v3.InterfaceC6757e
    /* renamed from: i */
    public /* synthetic */ Object mo27715i(C6751F c6751f) {
        return AbstractC6756d.m27747b(this, c6751f);
    }

    /* renamed from: n */
    public final void m27767n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f24346d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC2447b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f24350h.mo19103a(componentRegistrar));
                        it.remove();
                    }
                } catch (C6775w e7) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C6755c) it2.next()).m27730j().toArray();
                int length = array.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        Object obj = array[i7];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f24347e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f24347e.add(obj.toString());
                        }
                        i7++;
                    }
                }
            }
            if (this.f24343a.isEmpty()) {
                AbstractC6769q.m27782a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f24343a.keySet());
                arrayList2.addAll(list);
                AbstractC6769q.m27782a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C6755c c6755c = (C6755c) it3.next();
                this.f24343a.put(c6755c, new C6776x(new InterfaceC2447b() { // from class: v3.l
                    @Override // p137T3.InterfaceC2447b
                    public final Object get() {
                        Object m27770r;
                        m27770r = C6767o.this.m27770r(c6755c);
                        return m27770r;
                    }
                }));
            }
            arrayList.addAll(m27773w(list));
            arrayList.addAll(m27774x());
            m27772v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        m27771u();
    }

    /* renamed from: o */
    public final void m27768o(Map map, boolean z6) {
        for (Map.Entry entry : map.entrySet()) {
            C6755c c6755c = (C6755c) entry.getKey();
            InterfaceC2447b interfaceC2447b = (InterfaceC2447b) entry.getValue();
            if (c6755c.m27732n() || (c6755c.m27733o() && z6)) {
                interfaceC2447b.get();
            }
        }
        this.f24348f.m27809f();
    }

    /* renamed from: p */
    public void m27769p(boolean z6) {
        HashMap hashMap;
        if (AbstractC6820f.m28054a(this.f24349g, null, Boolean.valueOf(z6))) {
            synchronized (this) {
                hashMap = new HashMap(this.f24343a);
            }
            m27768o(hashMap, z6);
        }
    }

    /* renamed from: r */
    public final /* synthetic */ Object m27770r(C6755c c6755c) {
        return c6755c.m27728h().mo1598a(new C6752G(c6755c, this));
    }

    /* renamed from: u */
    public final void m27771u() {
        Boolean bool = (Boolean) this.f24349g.get();
        if (bool != null) {
            m27768o(this.f24343a, bool.booleanValue());
        }
    }

    /* renamed from: v */
    public final void m27772v() {
        for (C6755c c6755c : this.f24343a.keySet()) {
            for (C6770r c6770r : c6755c.m27727g()) {
                if (c6770r.m27806g() && !this.f24345c.containsKey(c6770r.m27802c())) {
                    this.f24345c.put(c6770r.m27802c(), C6777y.m27811b(Collections.emptySet()));
                } else if (this.f24344b.containsKey(c6770r.m27802c())) {
                    continue;
                } else {
                    if (c6770r.m27805f()) {
                        throw new C6778z(String.format("Unsatisfied dependency for component %s: %s", c6755c, c6770r.m27802c()));
                    }
                    if (!c6770r.m27806g()) {
                        this.f24344b.put(c6770r.m27802c(), C6749D.m27695e());
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public final List m27773w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6755c c6755c = (C6755c) it.next();
            if (c6755c.m27734p()) {
                final InterfaceC2447b interfaceC2447b = (InterfaceC2447b) this.f24343a.get(c6755c);
                for (C6751F c6751f : c6755c.m27730j()) {
                    if (this.f24344b.containsKey(c6751f)) {
                        final C6749D c6749d = (C6749D) ((InterfaceC2447b) this.f24344b.get(c6751f));
                        arrayList.add(new Runnable() { // from class: v3.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                C6749D.this.m27700j(interfaceC2447b);
                            }
                        });
                    } else {
                        this.f24344b.put(c6751f, interfaceC2447b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    public final List m27774x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f24343a.entrySet()) {
            C6755c c6755c = (C6755c) entry.getKey();
            if (!c6755c.m27734p()) {
                InterfaceC2447b interfaceC2447b = (InterfaceC2447b) entry.getValue();
                for (C6751F c6751f : c6755c.m27730j()) {
                    if (!hashMap.containsKey(c6751f)) {
                        hashMap.put(c6751f, new HashSet());
                    }
                    ((Set) hashMap.get(c6751f)).add(interfaceC2447b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f24345c.containsKey(entry2.getKey())) {
                final C6777y c6777y = (C6777y) this.f24345c.get(entry2.getKey());
                for (final InterfaceC2447b interfaceC2447b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: v3.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6777y.this.m27812a(interfaceC2447b2);
                        }
                    });
                }
            } else {
                this.f24345c.put((C6751F) entry2.getKey(), C6777y.m27811b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public C6767o(Executor executor, Iterable iterable, Collection collection, InterfaceC6762j interfaceC6762j) {
        this.f24343a = new HashMap();
        this.f24344b = new HashMap();
        this.f24345c = new HashMap();
        this.f24347e = new HashSet();
        this.f24349g = new AtomicReference();
        C6774v c6774v = new C6774v(executor);
        this.f24348f = c6774v;
        this.f24350h = interfaceC6762j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6755c.m27726s(c6774v, C6774v.class, InterfaceC0336d.class, InterfaceC0335c.class));
        arrayList.add(C6755c.m27726s(this, InterfaceC7145a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6755c c6755c = (C6755c) it.next();
            if (c6755c != null) {
                arrayList.add(c6755c);
            }
        }
        this.f24346d = m27764q(iterable);
        m27767n(arrayList);
    }

    /* renamed from: v3.o$b */
    public static final class b {

        /* renamed from: a */
        public final Executor f24351a;

        /* renamed from: b */
        public final List f24352b = new ArrayList();

        /* renamed from: c */
        public final List f24353c = new ArrayList();

        /* renamed from: d */
        public InterfaceC6762j f24354d = InterfaceC6762j.f24335a;

        public b(Executor executor) {
            this.f24351a = executor;
        }

        /* renamed from: b */
        public b m27777b(C6755c c6755c) {
            this.f24353c.add(c6755c);
            return this;
        }

        /* renamed from: c */
        public b m27778c(final ComponentRegistrar componentRegistrar) {
            this.f24352b.add(new InterfaceC2447b() { // from class: v3.p
                @Override // p137T3.InterfaceC2447b
                public final Object get() {
                    ComponentRegistrar m27776f;
                    m27776f = C6767o.b.m27776f(ComponentRegistrar.this);
                    return m27776f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public b m27779d(Collection collection) {
            this.f24352b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C6767o m27780e() {
            return new C6767o(this.f24351a, this.f24352b, this.f24353c, this.f24354d);
        }

        /* renamed from: g */
        public b m27781g(InterfaceC6762j interfaceC6762j) {
            this.f24354d = interfaceC6762j;
            return this;
        }

        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m27776f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
