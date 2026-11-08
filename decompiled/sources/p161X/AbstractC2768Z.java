package p161X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p154W.AbstractC2651b;
import p191b.C3478b;
import p371w5.C6934q;
import p378x5.AbstractC7029t;
import p378x5.AbstractC7032w;

/* renamed from: X.Z */
/* loaded from: classes.dex */
public abstract class AbstractC2768Z {

    /* renamed from: f */
    public static final a f8276f = new a(null);

    /* renamed from: a */
    public final ViewGroup f8277a;

    /* renamed from: b */
    public final List f8278b;

    /* renamed from: c */
    public final List f8279c;

    /* renamed from: d */
    public boolean f8280d;

    /* renamed from: e */
    public boolean f8281e;

    /* renamed from: X.Z$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC2768Z m9680a(ViewGroup container, AbstractC2752I fragmentManager) {
            AbstractC5469l.m23028e(container, "container");
            AbstractC5469l.m23028e(fragmentManager, "fragmentManager");
            InterfaceC2770a0 m9410A0 = fragmentManager.m9410A0();
            AbstractC5469l.m23027d(m9410A0, "fragmentManager.specialEffectsControllerFactory");
            return m9681b(container, m9410A0);
        }

        /* renamed from: b */
        public final AbstractC2768Z m9681b(ViewGroup container, InterfaceC2770a0 factory) {
            AbstractC5469l.m23028e(container, "container");
            AbstractC5469l.m23028e(factory, "factory");
            Object tag = container.getTag(AbstractC2651b.f7862b);
            if (tag instanceof AbstractC2768Z) {
                return (AbstractC2768Z) tag;
            }
            AbstractC2768Z mo9529a = factory.mo9529a(container);
            AbstractC5469l.m23027d(mo9529a, "factory.createController(container)");
            container.setTag(AbstractC2651b.f7862b, mo9529a);
            return mo9529a;
        }

        public a() {
        }
    }

    /* renamed from: X.Z$b */
    public static class b {

        /* renamed from: a */
        public final boolean f8282a;

        /* renamed from: b */
        public boolean f8283b;

        /* renamed from: c */
        public boolean f8284c;

        /* renamed from: a */
        public final void m9682a(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            if (!this.f8284c) {
                mo9684c(container);
            }
            this.f8284c = true;
        }

        /* renamed from: b */
        public boolean mo9683b() {
            return this.f8282a;
        }

        /* renamed from: c */
        public abstract void mo9684c(ViewGroup viewGroup);

        /* renamed from: d */
        public abstract void mo9685d(ViewGroup viewGroup);

        /* renamed from: e */
        public void mo9686e(C3478b backEvent, ViewGroup container) {
            AbstractC5469l.m23028e(backEvent, "backEvent");
            AbstractC5469l.m23028e(container, "container");
        }

        /* renamed from: f */
        public void mo9687f(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
        }

        /* renamed from: g */
        public final void m9688g(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            if (!this.f8283b) {
                mo9687f(container);
            }
            this.f8283b = true;
        }
    }

    /* renamed from: X.Z$c */
    public static final class c extends d {

        /* renamed from: l */
        public final C2758O f8285l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(p161X.AbstractC2768Z.d.b r3, p161X.AbstractC2768Z.d.a r4, p161X.C2758O r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.AbstractC5469l.m23028e(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.AbstractC5469l.m23028e(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.AbstractC5469l.m23028e(r5, r0)
                X.p r0 = r5.m9572k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.f8285l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p161X.AbstractC2768Z.c.<init>(X.Z$d$b, X.Z$d$a, X.O):void");
        }

        @Override // p161X.AbstractC2768Z.d
        /* renamed from: e */
        public void mo9689e() {
            super.mo9689e();
            m9698i().f8468u = false;
            this.f8285l.m9574m();
        }

        @Override // p161X.AbstractC2768Z.d
        /* renamed from: q */
        public void mo9690q() {
            if (m9704o()) {
                return;
            }
            super.mo9690q();
            if (m9699j() != d.a.ADDING) {
                if (m9699j() == d.a.REMOVING) {
                    AbstractComponentCallbacksC2786p m9572k = this.f8285l.m9572k();
                    AbstractC5469l.m23027d(m9572k, "fragmentStateManager.fragment");
                    View m9895q1 = m9572k.m9895q1();
                    AbstractC5469l.m23027d(m9895q1, "fragment.requireView()");
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + m9895q1.findFocus() + " on view " + m9895q1 + " for Fragment " + m9572k);
                    }
                    m9895q1.clearFocus();
                    return;
                }
                return;
            }
            AbstractComponentCallbacksC2786p m9572k2 = this.f8285l.m9572k();
            AbstractC5469l.m23027d(m9572k2, "fragmentStateManager.fragment");
            View findFocus = m9572k2.f8435Q.findFocus();
            if (findFocus != null) {
                m9572k2.m9910w1(findFocus);
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m9572k2);
                }
            }
            View m9895q12 = m9698i().m9895q1();
            AbstractC5469l.m23027d(m9895q12, "this.fragment.requireView()");
            if (m9895q12.getParent() == null) {
                this.f8285l.m9563b();
                m9895q12.setAlpha(0.0f);
            }
            if (m9895q12.getAlpha() == 0.0f && m9895q12.getVisibility() == 0) {
                m9895q12.setVisibility(4);
            }
            m9895q12.setAlpha(m9572k2.m9832L());
        }
    }

    /* renamed from: X.Z$d */
    public static class d {

        /* renamed from: a */
        public b f8286a;

        /* renamed from: b */
        public a f8287b;

        /* renamed from: c */
        public final AbstractComponentCallbacksC2786p f8288c;

        /* renamed from: d */
        public final List f8289d;

        /* renamed from: e */
        public boolean f8290e;

        /* renamed from: f */
        public boolean f8291f;

        /* renamed from: g */
        public boolean f8292g;

        /* renamed from: h */
        public boolean f8293h;

        /* renamed from: i */
        public boolean f8294i;

        /* renamed from: j */
        public final List f8295j;

        /* renamed from: k */
        public final List f8296k;

        /* renamed from: X.Z$d$a */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: X.Z$d$b */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: a */
            public static final a f8301a = new a(null);

            /* renamed from: X.Z$d$b$a */
            public static final class a {
                public /* synthetic */ a(AbstractC5464g abstractC5464g) {
                    this();
                }

                /* renamed from: a */
                public final b m9711a(View view) {
                    AbstractC5469l.m23028e(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : m9712b(view.getVisibility());
                }

                /* renamed from: b */
                public final b m9712b(int i7) {
                    if (i7 == 0) {
                        return b.VISIBLE;
                    }
                    if (i7 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i7 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i7);
                }

                public a() {
                }
            }

            /* renamed from: X.Z$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C7187b {

                /* renamed from: a */
                public static final /* synthetic */ int[] f8307a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f8307a = iArr;
                }
            }

            /* renamed from: g */
            public static final b m9709g(int i7) {
                return f8301a.m9712b(i7);
            }

            /* renamed from: f */
            public final void m9710f(View view, ViewGroup container) {
                AbstractC5469l.m23028e(view, "view");
                AbstractC5469l.m23028e(container, "container");
                int i7 = C7187b.f8307a[ordinal()];
                if (i7 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (AbstractC2752I.m9397I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i7 == 2) {
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (AbstractC2752I.m9397I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i7 == 3) {
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i7 != 4) {
                    return;
                }
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* renamed from: X.Z$d$c */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f8308a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f8308a = iArr;
            }
        }

        public d(b finalState, a lifecycleImpact, AbstractComponentCallbacksC2786p fragment) {
            AbstractC5469l.m23028e(finalState, "finalState");
            AbstractC5469l.m23028e(lifecycleImpact, "lifecycleImpact");
            AbstractC5469l.m23028e(fragment, "fragment");
            this.f8286a = finalState;
            this.f8287b = lifecycleImpact;
            this.f8288c = fragment;
            this.f8289d = new ArrayList();
            this.f8294i = true;
            ArrayList arrayList = new ArrayList();
            this.f8295j = arrayList;
            this.f8296k = arrayList;
        }

        /* renamed from: a */
        public final void m9691a(Runnable listener) {
            AbstractC5469l.m23028e(listener, "listener");
            this.f8289d.add(listener);
        }

        /* renamed from: b */
        public final void m9692b(b effect) {
            AbstractC5469l.m23028e(effect, "effect");
            this.f8295j.add(effect);
        }

        /* renamed from: c */
        public final void m9693c(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            this.f8293h = false;
            if (this.f8290e) {
                return;
            }
            this.f8290e = true;
            if (this.f8295j.isEmpty()) {
                mo9689e();
                return;
            }
            Iterator it = AbstractC7032w.m28889O(this.f8296k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).m9682a(container);
            }
        }

        /* renamed from: d */
        public final void m9694d(ViewGroup container, boolean z6) {
            AbstractC5469l.m23028e(container, "container");
            if (this.f8290e) {
                return;
            }
            if (z6) {
                this.f8292g = true;
            }
            m9693c(container);
        }

        /* renamed from: e */
        public void mo9689e() {
            this.f8293h = false;
            if (this.f8291f) {
                return;
            }
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f8291f = true;
            Iterator it = this.f8289d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* renamed from: f */
        public final void m9695f(b effect) {
            AbstractC5469l.m23028e(effect, "effect");
            if (this.f8295j.remove(effect) && this.f8295j.isEmpty()) {
                mo9689e();
            }
        }

        /* renamed from: g */
        public final List m9696g() {
            return this.f8296k;
        }

        /* renamed from: h */
        public final b m9697h() {
            return this.f8286a;
        }

        /* renamed from: i */
        public final AbstractComponentCallbacksC2786p m9698i() {
            return this.f8288c;
        }

        /* renamed from: j */
        public final a m9699j() {
            return this.f8287b;
        }

        /* renamed from: k */
        public final boolean m9700k() {
            return this.f8294i;
        }

        /* renamed from: l */
        public final boolean m9701l() {
            return this.f8290e;
        }

        /* renamed from: m */
        public final boolean m9702m() {
            return this.f8291f;
        }

        /* renamed from: n */
        public final boolean m9703n() {
            return this.f8292g;
        }

        /* renamed from: o */
        public final boolean m9704o() {
            return this.f8293h;
        }

        /* renamed from: p */
        public final void m9705p(b finalState, a lifecycleImpact) {
            AbstractC5469l.m23028e(finalState, "finalState");
            AbstractC5469l.m23028e(lifecycleImpact, "lifecycleImpact");
            int i7 = c.f8308a[lifecycleImpact.ordinal()];
            if (i7 == 1) {
                if (this.f8286a == b.REMOVED) {
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f8288c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f8287b + " to ADDING.");
                    }
                    this.f8286a = b.VISIBLE;
                    this.f8287b = a.ADDING;
                    this.f8294i = true;
                    return;
                }
                return;
            }
            if (i7 == 2) {
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f8288c + " mFinalState = " + this.f8286a + " -> REMOVED. mLifecycleImpact  = " + this.f8287b + " to REMOVING.");
                }
                this.f8286a = b.REMOVED;
                this.f8287b = a.REMOVING;
                this.f8294i = true;
                return;
            }
            if (i7 == 3 && this.f8286a != b.REMOVED) {
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f8288c + " mFinalState = " + this.f8286a + " -> " + finalState + '.');
                }
                this.f8286a = finalState;
            }
        }

        /* renamed from: q */
        public void mo9690q() {
            this.f8293h = true;
        }

        /* renamed from: r */
        public final void m9706r(boolean z6) {
            this.f8294i = z6;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f8286a + " lifecycleImpact = " + this.f8287b + " fragment = " + this.f8288c + '}';
        }
    }

    /* renamed from: X.Z$e */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8309a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8309a = iArr;
        }
    }

    public AbstractC2768Z(ViewGroup container) {
        AbstractC5469l.m23028e(container, "container");
        this.f8277a = container;
        this.f8278b = new ArrayList();
        this.f8279c = new ArrayList();
    }

    /* renamed from: h */
    public static final void m9654h(AbstractC2768Z this$0, c operation) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(operation, "$operation");
        if (this$0.f8278b.contains(operation)) {
            d.b m9697h = operation.m9697h();
            View view = operation.m9698i().f8435Q;
            AbstractC5469l.m23027d(view, "operation.fragment.mView");
            m9697h.m9710f(view, this$0.f8277a);
        }
    }

    /* renamed from: i */
    public static final void m9655i(AbstractC2768Z this$0, c operation) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(operation, "$operation");
        this$0.f8278b.remove(operation);
        this$0.f8279c.remove(operation);
    }

    /* renamed from: u */
    public static final AbstractC2768Z m9656u(ViewGroup viewGroup, AbstractC2752I abstractC2752I) {
        return f8276f.m9680a(viewGroup, abstractC2752I);
    }

    /* renamed from: v */
    public static final AbstractC2768Z m9657v(ViewGroup viewGroup, InterfaceC2770a0 interfaceC2770a0) {
        return f8276f.m9681b(viewGroup, interfaceC2770a0);
    }

    /* renamed from: A */
    public final void m9658A() {
        for (d dVar : this.f8278b) {
            if (dVar.m9699j() == d.a.ADDING) {
                View m9895q1 = dVar.m9698i().m9895q1();
                AbstractC5469l.m23027d(m9895q1, "fragment.requireView()");
                dVar.m9705p(d.b.f8301a.m9712b(m9895q1.getVisibility()), d.a.NONE);
            }
        }
    }

    /* renamed from: B */
    public final void m9659B(boolean z6) {
        this.f8280d = z6;
    }

    /* renamed from: c */
    public final void m9660c(d operation) {
        AbstractC5469l.m23028e(operation, "operation");
        if (operation.m9700k()) {
            d.b m9697h = operation.m9697h();
            View m9895q1 = operation.m9698i().m9895q1();
            AbstractC5469l.m23027d(m9895q1, "operation.fragment.requireView()");
            m9697h.m9710f(m9895q1, this.f8277a);
            operation.m9706r(false);
        }
    }

    /* renamed from: d */
    public abstract void mo9661d(List list, boolean z6);

    /* renamed from: e */
    public void m9662e(List operations) {
        AbstractC5469l.m23028e(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            AbstractC7029t.m28870p(arrayList, ((d) it.next()).m9696g());
        }
        List m28889O = AbstractC7032w.m28889O(AbstractC7032w.m28893S(arrayList));
        int size = m28889O.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((b) m28889O.get(i7)).mo9685d(this.f8277a);
        }
        int size2 = operations.size();
        for (int i8 = 0; i8 < size2; i8++) {
            m9660c((d) operations.get(i8));
        }
        List m28889O2 = AbstractC7032w.m28889O(operations);
        int size3 = m28889O2.size();
        for (int i9 = 0; i9 < size3; i9++) {
            d dVar = (d) m28889O2.get(i9);
            if (dVar.m9696g().isEmpty()) {
                dVar.mo9689e();
            }
        }
    }

    /* renamed from: f */
    public final void m9663f() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        m9679z(this.f8279c);
        m9662e(this.f8279c);
    }

    /* renamed from: g */
    public final void m9664g(d.b bVar, d.a aVar, C2758O c2758o) {
        synchronized (this.f8278b) {
            try {
                AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
                AbstractC5469l.m23027d(m9572k, "fragmentStateManager.fragment");
                d m9670o = m9670o(m9572k);
                if (m9670o == null) {
                    if (c2758o.m9572k().f8468u) {
                        AbstractComponentCallbacksC2786p m9572k2 = c2758o.m9572k();
                        AbstractC5469l.m23027d(m9572k2, "fragmentStateManager.fragment");
                        m9670o = m9671p(m9572k2);
                    } else {
                        m9670o = null;
                    }
                }
                if (m9670o != null) {
                    m9670o.m9705p(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, c2758o);
                this.f8278b.add(cVar);
                cVar.m9691a(new Runnable() { // from class: X.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2768Z.m9654h(AbstractC2768Z.this, cVar);
                    }
                });
                cVar.m9691a(new Runnable() { // from class: X.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2768Z.m9655i(AbstractC2768Z.this, cVar);
                    }
                });
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final void m9665j(d.b finalState, C2758O fragmentStateManager) {
        AbstractC5469l.m23028e(finalState, "finalState");
        AbstractC5469l.m23028e(fragmentStateManager, "fragmentStateManager");
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.m9572k());
        }
        m9664g(finalState, d.a.ADDING, fragmentStateManager);
    }

    /* renamed from: k */
    public final void m9666k(C2758O fragmentStateManager) {
        AbstractC5469l.m23028e(fragmentStateManager, "fragmentStateManager");
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.m9572k());
        }
        m9664g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    /* renamed from: l */
    public final void m9667l(C2758O fragmentStateManager) {
        AbstractC5469l.m23028e(fragmentStateManager, "fragmentStateManager");
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.m9572k());
        }
        m9664g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    /* renamed from: m */
    public final void m9668m(C2758O fragmentStateManager) {
        AbstractC5469l.m23028e(fragmentStateManager, "fragmentStateManager");
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.m9572k());
        }
        m9664g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0172 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x0061, B:23:0x006c, B:28:0x019f, B:32:0x0072, B:33:0x0081, B:35:0x0087, B:37:0x0093, B:38:0x00a9, B:41:0x00ba, B:46:0x00c0, B:50:0x00d1, B:52:0x00e1, B:53:0x00e8, B:54:0x00f9, B:56:0x00ff, B:58:0x010f, B:60:0x0117, B:64:0x0138, B:71:0x011e, B:72:0x0122, B:74:0x0128, B:82:0x0144, B:84:0x0148, B:85:0x0151, B:87:0x0157, B:89:0x0165, B:92:0x016e, B:94:0x0172, B:95:0x0190, B:97:0x0198, B:99:0x017b, B:101:0x0185), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0198 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x0061, B:23:0x006c, B:28:0x019f, B:32:0x0072, B:33:0x0081, B:35:0x0087, B:37:0x0093, B:38:0x00a9, B:41:0x00ba, B:46:0x00c0, B:50:0x00d1, B:52:0x00e1, B:53:0x00e8, B:54:0x00f9, B:56:0x00ff, B:58:0x010f, B:60:0x0117, B:64:0x0138, B:71:0x011e, B:72:0x0122, B:74:0x0128, B:82:0x0144, B:84:0x0148, B:85:0x0151, B:87:0x0157, B:89:0x0165, B:92:0x016e, B:94:0x0172, B:95:0x0190, B:97:0x0198, B:99:0x017b, B:101:0x0185), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0179  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9669n() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p161X.AbstractC2768Z.m9669n():void");
    }

    /* renamed from: o */
    public final d m9670o(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        Object obj;
        Iterator it = this.f8278b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (AbstractC5469l.m23024a(dVar.m9698i(), abstractComponentCallbacksC2786p) && !dVar.m9701l()) {
                break;
            }
        }
        return (d) obj;
    }

    /* renamed from: p */
    public final d m9671p(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        Object obj;
        Iterator it = this.f8279c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (AbstractC5469l.m23024a(dVar.m9698i(), abstractComponentCallbacksC2786p) && !dVar.m9701l()) {
                break;
            }
        }
        return (d) obj;
    }

    /* renamed from: q */
    public final void m9672q() {
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f8277a.isAttachedToWindow();
        synchronized (this.f8278b) {
            try {
                m9658A();
                m9679z(this.f8278b);
                for (d dVar : AbstractC7032w.m28892R(this.f8279c)) {
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? StringUtils.EMPTY : "Container " + this.f8277a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.m9693c(this.f8277a);
                }
                for (d dVar2 : AbstractC7032w.m28892R(this.f8278b)) {
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? StringUtils.EMPTY : "Container " + this.f8277a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.m9693c(this.f8277a);
                }
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: r */
    public final void m9673r() {
        if (this.f8281e) {
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f8281e = false;
            m9669n();
        }
    }

    /* renamed from: s */
    public final d.a m9674s(C2758O fragmentStateManager) {
        AbstractC5469l.m23028e(fragmentStateManager, "fragmentStateManager");
        AbstractComponentCallbacksC2786p m9572k = fragmentStateManager.m9572k();
        AbstractC5469l.m23027d(m9572k, "fragmentStateManager.fragment");
        d m9670o = m9670o(m9572k);
        d.a m9699j = m9670o != null ? m9670o.m9699j() : null;
        d m9671p = m9671p(m9572k);
        d.a m9699j2 = m9671p != null ? m9671p.m9699j() : null;
        int i7 = m9699j == null ? -1 : e.f8309a[m9699j.ordinal()];
        return (i7 == -1 || i7 == 1) ? m9699j2 : m9699j;
    }

    /* renamed from: t */
    public final ViewGroup m9675t() {
        return this.f8277a;
    }

    /* renamed from: w */
    public final boolean m9676w() {
        return !this.f8278b.isEmpty();
    }

    /* renamed from: x */
    public final void m9677x() {
        Object obj;
        synchronized (this.f8278b) {
            try {
                m9658A();
                List list = this.f8278b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    d dVar = (d) obj;
                    d.b.a aVar = d.b.f8301a;
                    View view = dVar.m9698i().f8435Q;
                    AbstractC5469l.m23027d(view, "operation.fragment.mView");
                    d.b m9711a = aVar.m9711a(view);
                    d.b m9697h = dVar.m9697h();
                    d.b bVar = d.b.VISIBLE;
                    if (m9697h == bVar && m9711a != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) obj;
                AbstractComponentCallbacksC2786p m9698i = dVar2 != null ? dVar2.m9698i() : null;
                this.f8281e = m9698i != null ? m9698i.m9863d0() : false;
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final void m9678y(C3478b backEvent) {
        AbstractC5469l.m23028e(backEvent, "backEvent");
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.m13982a());
        }
        List list = this.f8279c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7029t.m28870p(arrayList, ((d) it.next()).m9696g());
        }
        List m28889O = AbstractC7032w.m28889O(AbstractC7032w.m28893S(arrayList));
        int size = m28889O.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((b) m28889O.get(i7)).mo9686e(backEvent, this.f8277a);
        }
    }

    /* renamed from: z */
    public final void m9679z(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((d) list.get(i7)).mo9690q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7029t.m28870p(arrayList, ((d) it.next()).m9696g());
        }
        List m28889O = AbstractC7032w.m28889O(AbstractC7032w.m28893S(arrayList));
        int size2 = m28889O.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((b) m28889O.get(i8)).m9688g(this.f8277a);
        }
    }
}
