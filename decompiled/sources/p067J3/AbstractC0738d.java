package p067J3;

import android.app.Activity;
import android.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p046G3.InterfaceC0407U;
import p116Q3.AbstractC2133b;
import p161X.AbstractActivityC2791u;
import p161X.AbstractComponentCallbacksC2786p;
import p256j$.util.Objects;

/* renamed from: J3.d */
/* loaded from: classes.dex */
public abstract class AbstractC0738d {

    /* renamed from: J3.d$b */
    public static class b {

        /* renamed from: a */
        public final List f2595a;

        public b() {
            this.f2595a = new ArrayList();
        }

        /* renamed from: a */
        public synchronized void m3131a(Runnable runnable) {
            this.f2595a.add(runnable);
        }

        /* renamed from: b */
        public void m3132b() {
            for (Runnable runnable : this.f2595a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* renamed from: J3.d$c */
    public static class c extends Fragment {

        /* renamed from: a */
        public b f2596a = new b();

        @Override // android.app.Fragment
        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.f2596a) {
                bVar = this.f2596a;
                this.f2596a = new b();
            }
            bVar.m3132b();
        }
    }

    /* renamed from: J3.d$d */
    public static class d extends AbstractComponentCallbacksC2786p {

        /* renamed from: l0 */
        public b f2597l0 = new b();

        @Override // p161X.AbstractComponentCallbacksC2786p
        /* renamed from: M0 */
        public void mo3133M0() {
            b bVar;
            super.mo3133M0();
            synchronized (this.f2597l0) {
                bVar = this.f2597l0;
                this.f2597l0 = new b();
            }
            bVar.m3132b();
        }
    }

    /* renamed from: c */
    public static InterfaceC0407U m3125c(Activity activity, final InterfaceC0407U interfaceC0407U) {
        if (activity != null) {
            if (activity instanceof AbstractActivityC2791u) {
                Objects.requireNonNull(interfaceC0407U);
                m3130h((AbstractActivityC2791u) activity, new Runnable() { // from class: J3.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0407U.this.remove();
                    }
                });
            } else {
                Objects.requireNonNull(interfaceC0407U);
                m3129g(activity, new Runnable() { // from class: J3.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0407U.this.remove();
                    }
                });
            }
        }
        return interfaceC0407U;
    }

    /* renamed from: d */
    public static Object m3126d(Class cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m3127e(Activity activity, Runnable runnable) {
        c cVar = (c) m3126d(c.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (cVar == null || cVar.isRemoving()) {
            cVar = new c();
            activity.getFragmentManager().beginTransaction().add(cVar, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        cVar.f2596a.m3131a(runnable);
    }

    /* renamed from: f */
    public static /* synthetic */ void m3128f(AbstractActivityC2791u abstractActivityC2791u, Runnable runnable) {
        d dVar = (d) m3126d(d.class, abstractActivityC2791u.m9927Y().m9476i0("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (dVar == null || dVar.m9865e0()) {
            dVar = new d();
            abstractActivityC2791u.m9927Y().m9487n().m9612c(dVar, "FirestoreOnStopObserverSupportFragment").mo9616g();
            abstractActivityC2791u.m9927Y().m9466e0();
        }
        dVar.f2597l0.m3131a(runnable);
    }

    /* renamed from: g */
    public static void m3129g(final Activity activity, final Runnable runnable) {
        AbstractC2133b.m7217d(!(activity instanceof AbstractActivityC2791u), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new Runnable() { // from class: J3.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0738d.m3127e(activity, runnable);
            }
        });
    }

    /* renamed from: h */
    public static void m3130h(final AbstractActivityC2791u abstractActivityC2791u, final Runnable runnable) {
        abstractActivityC2791u.runOnUiThread(new Runnable() { // from class: J3.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0738d.m3128f(AbstractActivityC2791u.this, runnable);
            }
        });
    }
}
