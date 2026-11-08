package androidx.lifecycle;

import androidx.lifecycle.AbstractC3345j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p153V5.AbstractC2647t;
import p153V5.InterfaceC2641n;
import p310p.C6039a;
import p310p.C6040b;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class C3350o extends AbstractC3345j {

    /* renamed from: k */
    public static final a f10750k = new a(null);

    /* renamed from: b */
    public final boolean f10751b;

    /* renamed from: c */
    public C6039a f10752c;

    /* renamed from: d */
    public AbstractC3345j.b f10753d;

    /* renamed from: e */
    public final WeakReference f10754e;

    /* renamed from: f */
    public int f10755f;

    /* renamed from: g */
    public boolean f10756g;

    /* renamed from: h */
    public boolean f10757h;

    /* renamed from: i */
    public ArrayList f10758i;

    /* renamed from: j */
    public final InterfaceC2641n f10759j;

    /* renamed from: androidx.lifecycle.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC3345j.b m12948a(AbstractC3345j.b state1, AbstractC3345j.b bVar) {
            AbstractC5469l.m23028e(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        public a() {
        }
    }

    /* renamed from: androidx.lifecycle.o$b */
    public static final class b {

        /* renamed from: a */
        public AbstractC3345j.b f10760a;

        /* renamed from: b */
        public InterfaceC3347l f10761b;

        public b(InterfaceC3348m interfaceC3348m, AbstractC3345j.b initialState) {
            AbstractC5469l.m23028e(initialState, "initialState");
            AbstractC5469l.m23025b(interfaceC3348m);
            this.f10761b = C3352q.m12953f(interfaceC3348m);
            this.f10760a = initialState;
        }

        /* renamed from: a */
        public final void m12949a(InterfaceC3349n interfaceC3349n, AbstractC3345j.a event) {
            AbstractC5469l.m23028e(event, "event");
            AbstractC3345j.b m12931f = event.m12931f();
            this.f10760a = C3350o.f10750k.m12948a(this.f10760a, m12931f);
            InterfaceC3347l interfaceC3347l = this.f10761b;
            AbstractC5469l.m23025b(interfaceC3349n);
            interfaceC3347l.mo78d(interfaceC3349n, event);
            this.f10760a = m12931f;
        }

        /* renamed from: b */
        public final AbstractC3345j.b m12950b() {
            return this.f10760a;
        }
    }

    public C3350o(InterfaceC3349n interfaceC3349n, boolean z6) {
        this.f10751b = z6;
        this.f10752c = new C6039a();
        AbstractC3345j.b bVar = AbstractC3345j.b.INITIALIZED;
        this.f10753d = bVar;
        this.f10758i = new ArrayList();
        this.f10754e = new WeakReference(interfaceC3349n);
        this.f10759j = AbstractC2647t.m9094a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC3345j
    /* renamed from: a */
    public void mo12927a(InterfaceC3348m observer) {
        InterfaceC3349n interfaceC3349n;
        AbstractC5469l.m23028e(observer, "observer");
        m12939f("addObserver");
        AbstractC3345j.b bVar = this.f10753d;
        AbstractC3345j.b bVar2 = AbstractC3345j.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC3345j.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f10752c.mo25092h(observer, bVar3)) == null && (interfaceC3349n = (InterfaceC3349n) this.f10754e.get()) != null) {
            boolean z6 = this.f10755f != 0 || this.f10756g;
            AbstractC3345j.b m12938e = m12938e(observer);
            this.f10755f++;
            while (bVar3.m12950b().compareTo(m12938e) < 0 && this.f10752c.contains(observer)) {
                m12945l(bVar3.m12950b());
                AbstractC3345j.a m12933b = AbstractC3345j.a.Companion.m12933b(bVar3.m12950b());
                if (m12933b == null) {
                    throw new IllegalStateException("no event up from " + bVar3.m12950b());
                }
                bVar3.m12949a(interfaceC3349n, m12933b);
                m12944k();
                m12938e = m12938e(observer);
            }
            if (!z6) {
                m12947n();
            }
            this.f10755f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC3345j
    /* renamed from: b */
    public AbstractC3345j.b mo12928b() {
        return this.f10753d;
    }

    @Override // androidx.lifecycle.AbstractC3345j
    /* renamed from: c */
    public void mo12929c(InterfaceC3348m observer) {
        AbstractC5469l.m23028e(observer, "observer");
        m12939f("removeObserver");
        this.f10752c.mo25093i(observer);
    }

    /* renamed from: d */
    public final void m12937d(InterfaceC3349n interfaceC3349n) {
        Iterator descendingIterator = this.f10752c.descendingIterator();
        AbstractC5469l.m23027d(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f10757h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            AbstractC5469l.m23027d(entry, "next()");
            InterfaceC3348m interfaceC3348m = (InterfaceC3348m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m12950b().compareTo(this.f10753d) > 0 && !this.f10757h && this.f10752c.contains(interfaceC3348m)) {
                AbstractC3345j.a m12932a = AbstractC3345j.a.Companion.m12932a(bVar.m12950b());
                if (m12932a == null) {
                    throw new IllegalStateException("no event down from " + bVar.m12950b());
                }
                m12945l(m12932a.m12931f());
                bVar.m12949a(interfaceC3349n, m12932a);
                m12944k();
            }
        }
    }

    /* renamed from: e */
    public final AbstractC3345j.b m12938e(InterfaceC3348m interfaceC3348m) {
        b bVar;
        Map.Entry m25094k = this.f10752c.m25094k(interfaceC3348m);
        AbstractC3345j.b bVar2 = null;
        AbstractC3345j.b m12950b = (m25094k == null || (bVar = (b) m25094k.getValue()) == null) ? null : bVar.m12950b();
        if (!this.f10758i.isEmpty()) {
            bVar2 = (AbstractC3345j.b) this.f10758i.get(r0.size() - 1);
        }
        a aVar = f10750k;
        return aVar.m12948a(aVar.m12948a(this.f10753d, m12950b), bVar2);
    }

    /* renamed from: f */
    public final void m12939f(String str) {
        if (!this.f10751b || AbstractC3351p.m12951a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    /* renamed from: g */
    public final void m12940g(InterfaceC3349n interfaceC3349n) {
        C6040b.d m25096e = this.f10752c.m25096e();
        AbstractC5469l.m23027d(m25096e, "observerMap.iteratorWithAdditions()");
        while (m25096e.hasNext() && !this.f10757h) {
            Map.Entry entry = (Map.Entry) m25096e.next();
            InterfaceC3348m interfaceC3348m = (InterfaceC3348m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m12950b().compareTo(this.f10753d) < 0 && !this.f10757h && this.f10752c.contains(interfaceC3348m)) {
                m12945l(bVar.m12950b());
                AbstractC3345j.a m12933b = AbstractC3345j.a.Companion.m12933b(bVar.m12950b());
                if (m12933b == null) {
                    throw new IllegalStateException("no event up from " + bVar.m12950b());
                }
                bVar.m12949a(interfaceC3349n, m12933b);
                m12944k();
            }
        }
    }

    /* renamed from: h */
    public void m12941h(AbstractC3345j.a event) {
        AbstractC5469l.m23028e(event, "event");
        m12939f("handleLifecycleEvent");
        m12943j(event.m12931f());
    }

    /* renamed from: i */
    public final boolean m12942i() {
        if (this.f10752c.size() == 0) {
            return true;
        }
        Map.Entry m25095a = this.f10752c.m25095a();
        AbstractC5469l.m23025b(m25095a);
        AbstractC3345j.b m12950b = ((b) m25095a.getValue()).m12950b();
        Map.Entry m25097f = this.f10752c.m25097f();
        AbstractC5469l.m23025b(m25097f);
        AbstractC3345j.b m12950b2 = ((b) m25097f.getValue()).m12950b();
        return m12950b == m12950b2 && this.f10753d == m12950b2;
    }

    /* renamed from: j */
    public final void m12943j(AbstractC3345j.b bVar) {
        AbstractC3345j.b bVar2 = this.f10753d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC3345j.b.INITIALIZED && bVar == AbstractC3345j.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f10753d + " in component " + this.f10754e.get()).toString());
        }
        this.f10753d = bVar;
        if (this.f10756g || this.f10755f != 0) {
            this.f10757h = true;
            return;
        }
        this.f10756g = true;
        m12947n();
        this.f10756g = false;
        if (this.f10753d == AbstractC3345j.b.DESTROYED) {
            this.f10752c = new C6039a();
        }
    }

    /* renamed from: k */
    public final void m12944k() {
        this.f10758i.remove(r0.size() - 1);
    }

    /* renamed from: l */
    public final void m12945l(AbstractC3345j.b bVar) {
        this.f10758i.add(bVar);
    }

    /* renamed from: m */
    public void m12946m(AbstractC3345j.b state) {
        AbstractC5469l.m23028e(state, "state");
        m12939f("setCurrentState");
        m12943j(state);
    }

    /* renamed from: n */
    public final void m12947n() {
        InterfaceC3349n interfaceC3349n = (InterfaceC3349n) this.f10754e.get();
        if (interfaceC3349n == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m12942i()) {
            this.f10757h = false;
            AbstractC3345j.b bVar = this.f10753d;
            Map.Entry m25095a = this.f10752c.m25095a();
            AbstractC5469l.m23025b(m25095a);
            if (bVar.compareTo(((b) m25095a.getValue()).m12950b()) < 0) {
                m12937d(interfaceC3349n);
            }
            Map.Entry m25097f = this.f10752c.m25097f();
            if (!this.f10757h && m25097f != null && this.f10753d.compareTo(((b) m25097f.getValue()).m12950b()) > 0) {
                m12940g(interfaceC3349n);
            }
        }
        this.f10757h = false;
        this.f10759j.setValue(mo12928b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3350o(InterfaceC3349n provider) {
        this(provider, true);
        AbstractC5469l.m23028e(provider, "provider");
    }
}
