package p161X;

import android.util.Log;
import androidx.lifecycle.AbstractC3329L;
import androidx.lifecycle.AbstractC3331N;
import androidx.lifecycle.C3330M;
import androidx.lifecycle.C3332O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p111P5.InterfaceC1969c;
import p192b0.AbstractC3503a;

/* renamed from: X.L */
/* loaded from: classes.dex */
public final class C2755L extends AbstractC3329L {

    /* renamed from: i */
    public static final C3330M.c f8178i = new a();

    /* renamed from: e */
    public final boolean f8182e;

    /* renamed from: b */
    public final HashMap f8179b = new HashMap();

    /* renamed from: c */
    public final HashMap f8180c = new HashMap();

    /* renamed from: d */
    public final HashMap f8181d = new HashMap();

    /* renamed from: f */
    public boolean f8183f = false;

    /* renamed from: g */
    public boolean f8184g = false;

    /* renamed from: h */
    public boolean f8185h = false;

    /* renamed from: X.L$a */
    public class a implements C3330M.c {
        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: a */
        public AbstractC3329L mo9556a(Class cls) {
            return new C2755L(true);
        }

        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: b */
        public /* synthetic */ AbstractC3329L mo9557b(InterfaceC1969c interfaceC1969c, AbstractC3503a abstractC3503a) {
            return AbstractC3331N.m12901a(this, interfaceC1969c, abstractC3503a);
        }

        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: c */
        public /* synthetic */ AbstractC3329L mo9558c(Class cls, AbstractC3503a abstractC3503a) {
            return AbstractC3331N.m12903c(this, cls, abstractC3503a);
        }
    }

    public C2755L(boolean z6) {
        this.f8182e = z6;
    }

    /* renamed from: k */
    public static C2755L m9542k(C3332O c3332o) {
        return (C2755L) new C3330M(c3332o, f8178i).m12892b(C2755L.class);
    }

    @Override // androidx.lifecycle.AbstractC3329L
    /* renamed from: d */
    public void mo9543d() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f8183f = true;
    }

    /* renamed from: e */
    public void m9544e(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (this.f8185h) {
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8179b.containsKey(abstractComponentCallbacksC2786p.f8455f)) {
                return;
            }
            this.f8179b.put(abstractComponentCallbacksC2786p.f8455f, abstractComponentCallbacksC2786p);
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC2786p);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2755L.class != obj.getClass()) {
            return false;
        }
        C2755L c2755l = (C2755L) obj;
        return this.f8179b.equals(c2755l.f8179b) && this.f8180c.equals(c2755l.f8180c) && this.f8181d.equals(c2755l.f8181d);
    }

    /* renamed from: f */
    public void m9545f(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, boolean z6) {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC2786p);
        }
        m9547h(abstractComponentCallbacksC2786p.f8455f, z6);
    }

    /* renamed from: g */
    public void m9546g(String str, boolean z6) {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m9547h(str, z6);
    }

    /* renamed from: h */
    public final void m9547h(String str, boolean z6) {
        C2755L c2755l = (C2755L) this.f8180c.get(str);
        if (c2755l != null) {
            if (z6) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c2755l.f8180c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c2755l.m9546g((String) it.next(), true);
                }
            }
            c2755l.mo9543d();
            this.f8180c.remove(str);
        }
        C3332O c3332o = (C3332O) this.f8181d.get(str);
        if (c3332o != null) {
            c3332o.m12904a();
            this.f8181d.remove(str);
        }
    }

    public int hashCode() {
        return (((this.f8179b.hashCode() * 31) + this.f8180c.hashCode()) * 31) + this.f8181d.hashCode();
    }

    /* renamed from: i */
    public AbstractComponentCallbacksC2786p m9548i(String str) {
        return (AbstractComponentCallbacksC2786p) this.f8179b.get(str);
    }

    /* renamed from: j */
    public C2755L m9549j(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        C2755L c2755l = (C2755L) this.f8180c.get(abstractComponentCallbacksC2786p.f8455f);
        if (c2755l != null) {
            return c2755l;
        }
        C2755L c2755l2 = new C2755L(this.f8182e);
        this.f8180c.put(abstractComponentCallbacksC2786p.f8455f, c2755l2);
        return c2755l2;
    }

    /* renamed from: l */
    public Collection m9550l() {
        return new ArrayList(this.f8179b.values());
    }

    /* renamed from: m */
    public C3332O m9551m(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        C3332O c3332o = (C3332O) this.f8181d.get(abstractComponentCallbacksC2786p.f8455f);
        if (c3332o != null) {
            return c3332o;
        }
        C3332O c3332o2 = new C3332O();
        this.f8181d.put(abstractComponentCallbacksC2786p.f8455f, c3332o2);
        return c3332o2;
    }

    /* renamed from: n */
    public boolean m9552n() {
        return this.f8183f;
    }

    /* renamed from: o */
    public void m9553o(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (this.f8185h) {
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8179b.remove(abstractComponentCallbacksC2786p.f8455f) == null || !AbstractC2752I.m9397I0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC2786p);
        }
    }

    /* renamed from: p */
    public void m9554p(boolean z6) {
        this.f8185h = z6;
    }

    /* renamed from: q */
    public boolean m9555q(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (this.f8179b.containsKey(abstractComponentCallbacksC2786p.f8455f)) {
            return this.f8182e ? this.f8183f : !this.f8184g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f8179b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f8180c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f8181d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
