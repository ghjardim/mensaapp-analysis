package p161X;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC3323F;
import androidx.lifecycle.AbstractC3334Q;
import androidx.lifecycle.AbstractC3335S;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.AbstractC3353r;
import androidx.lifecycle.C3330M;
import androidx.lifecycle.C3332O;
import androidx.lifecycle.C3350o;
import androidx.lifecycle.C3355t;
import androidx.lifecycle.InterfaceC3333P;
import androidx.lifecycle.InterfaceC3343h;
import androidx.lifecycle.InterfaceC3347l;
import androidx.lifecycle.InterfaceC3349n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.TikaCoreProperties;
import p009B1.AbstractC0035g;
import p009B1.C0032d;
import p009B1.C0033e;
import p009B1.InterfaceC0034f;
import p049H.AbstractC0516k;
import p168Y.C2884c;
import p192b0.AbstractC3503a;
import p192b0.C3504b;
import p208d0.AbstractC4099a;
import p365w.AbstractC6802r;

/* renamed from: X.p */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2786p implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC3349n, InterfaceC3333P, InterfaceC3343h, InterfaceC0034f {

    /* renamed from: k0 */
    public static final Object f8418k0 = new Object();

    /* renamed from: A */
    public int f8419A;

    /* renamed from: B */
    public AbstractC2752I f8420B;

    /* renamed from: C */
    public AbstractC2744A f8421C;

    /* renamed from: E */
    public AbstractComponentCallbacksC2786p f8423E;

    /* renamed from: F */
    public int f8424F;

    /* renamed from: G */
    public int f8425G;

    /* renamed from: H */
    public String f8426H;

    /* renamed from: I */
    public boolean f8427I;

    /* renamed from: J */
    public boolean f8428J;

    /* renamed from: K */
    public boolean f8429K;

    /* renamed from: L */
    public boolean f8430L;

    /* renamed from: M */
    public boolean f8431M;

    /* renamed from: O */
    public boolean f8433O;

    /* renamed from: P */
    public ViewGroup f8434P;

    /* renamed from: Q */
    public View f8435Q;

    /* renamed from: R */
    public boolean f8436R;

    /* renamed from: T */
    public g f8438T;

    /* renamed from: U */
    public Handler f8439U;

    /* renamed from: W */
    public boolean f8441W;

    /* renamed from: X */
    public LayoutInflater f8442X;

    /* renamed from: Y */
    public boolean f8443Y;

    /* renamed from: Z */
    public String f8444Z;

    /* renamed from: b */
    public Bundle f8447b;

    /* renamed from: b0 */
    public C3350o f8448b0;

    /* renamed from: c */
    public SparseArray f8449c;

    /* renamed from: c0 */
    public C2764V f8450c0;

    /* renamed from: d */
    public Bundle f8451d;

    /* renamed from: e */
    public Boolean f8453e;

    /* renamed from: e0 */
    public C3330M.c f8454e0;

    /* renamed from: f0 */
    public C0033e f8456f0;

    /* renamed from: g0 */
    public int f8457g0;

    /* renamed from: n */
    public Bundle f8461n;

    /* renamed from: o */
    public AbstractComponentCallbacksC2786p f8462o;

    /* renamed from: q */
    public int f8464q;

    /* renamed from: s */
    public boolean f8466s;

    /* renamed from: t */
    public boolean f8467t;

    /* renamed from: u */
    public boolean f8468u;

    /* renamed from: v */
    public boolean f8469v;

    /* renamed from: w */
    public boolean f8470w;

    /* renamed from: x */
    public boolean f8471x;

    /* renamed from: y */
    public boolean f8472y;

    /* renamed from: z */
    public boolean f8473z;

    /* renamed from: a */
    public int f8445a = -1;

    /* renamed from: f */
    public String f8455f = UUID.randomUUID().toString();

    /* renamed from: p */
    public String f8463p = null;

    /* renamed from: r */
    public Boolean f8465r = null;

    /* renamed from: D */
    public AbstractC2752I f8422D = new C2753J();

    /* renamed from: N */
    public boolean f8432N = true;

    /* renamed from: S */
    public boolean f8437S = true;

    /* renamed from: V */
    public Runnable f8440V = new a();

    /* renamed from: a0 */
    public AbstractC3345j.b f8446a0 = AbstractC3345j.b.RESUMED;

    /* renamed from: d0 */
    public C3355t f8452d0 = new C3355t();

    /* renamed from: h0 */
    public final AtomicInteger f8458h0 = new AtomicInteger();

    /* renamed from: i0 */
    public final ArrayList f8459i0 = new ArrayList();

    /* renamed from: j0 */
    public final i f8460j0 = new b();

    /* renamed from: X.p$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC2786p.this.m9816C1();
        }
    }

    /* renamed from: X.p$b */
    public class b extends i {
        public b() {
            super(null);
        }

        @Override // p161X.AbstractComponentCallbacksC2786p.i
        /* renamed from: a */
        public void mo9919a() {
            AbstractComponentCallbacksC2786p.this.f8456f0.m93c();
            AbstractC3323F.m12874c(AbstractComponentCallbacksC2786p.this);
            Bundle bundle = AbstractComponentCallbacksC2786p.this.f8447b;
            AbstractComponentCallbacksC2786p.this.f8456f0.m94d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* renamed from: X.p$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC2786p.this.m9869g(false);
        }
    }

    /* renamed from: X.p$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2768Z f8477a;

        public d(AbstractC2768Z abstractC2768Z) {
            this.f8477a = abstractC2768Z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8477a.m9676w()) {
                this.f8477a.m9669n();
            }
        }
    }

    /* renamed from: X.p$e */
    public class e extends AbstractC2793w {
        public e() {
        }

        @Override // p161X.AbstractC2793w
        /* renamed from: m */
        public View mo9804m(int i7) {
            View view = AbstractComponentCallbacksC2786p.this.f8435Q;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + AbstractComponentCallbacksC2786p.this + " does not have a view");
        }

        @Override // p161X.AbstractC2793w
        /* renamed from: r */
        public boolean mo9805r() {
            return AbstractComponentCallbacksC2786p.this.f8435Q != null;
        }
    }

    /* renamed from: X.p$f */
    public class f implements InterfaceC3347l {
        public f() {
        }

        @Override // androidx.lifecycle.InterfaceC3347l
        /* renamed from: d */
        public void mo78d(InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar) {
            View view;
            if (aVar != AbstractC3345j.a.ON_STOP || (view = AbstractComponentCallbacksC2786p.this.f8435Q) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: X.p$g */
    public static class g {

        /* renamed from: a */
        public View f8481a;

        /* renamed from: b */
        public boolean f8482b;

        /* renamed from: c */
        public int f8483c;

        /* renamed from: d */
        public int f8484d;

        /* renamed from: e */
        public int f8485e;

        /* renamed from: f */
        public int f8486f;

        /* renamed from: g */
        public int f8487g;

        /* renamed from: h */
        public ArrayList f8488h;

        /* renamed from: i */
        public ArrayList f8489i;

        /* renamed from: j */
        public Object f8490j = null;

        /* renamed from: k */
        public Object f8491k;

        /* renamed from: l */
        public Object f8492l;

        /* renamed from: m */
        public Object f8493m;

        /* renamed from: n */
        public Object f8494n;

        /* renamed from: o */
        public Object f8495o;

        /* renamed from: p */
        public Boolean f8496p;

        /* renamed from: q */
        public Boolean f8497q;

        /* renamed from: r */
        public float f8498r;

        /* renamed from: s */
        public View f8499s;

        /* renamed from: t */
        public boolean f8500t;

        public g() {
            Object obj = AbstractComponentCallbacksC2786p.f8418k0;
            this.f8491k = obj;
            this.f8492l = null;
            this.f8493m = obj;
            this.f8494n = null;
            this.f8495o = obj;
            this.f8498r = 1.0f;
            this.f8499s = null;
        }
    }

    /* renamed from: X.p$h */
    public static class h extends RuntimeException {
        public h(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: X.p$i */
    public static abstract class i {
        public i() {
        }

        /* renamed from: a */
        public abstract void mo9919a();

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public AbstractComponentCallbacksC2786p() {
        m9850W();
    }

    /* renamed from: Y */
    public static AbstractComponentCallbacksC2786p m9806Y(Context context, String str, Bundle bundle) {
        try {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = (AbstractComponentCallbacksC2786p) AbstractC2796z.m9973d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(abstractComponentCallbacksC2786p.getClass().getClassLoader());
                abstractComponentCallbacksC2786p.m9909v1(bundle);
            }
            return abstractComponentCallbacksC2786p;
        } catch (IllegalAccessException e7) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (InstantiationException e8) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (NoSuchMethodException e9) {
            throw new h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e9);
        } catch (InvocationTargetException e10) {
            throw new h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e10);
        }
    }

    /* renamed from: A */
    public AbstractC6802r m9808A() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    /* renamed from: A0 */
    public void m9809A0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f8433O = true;
        AbstractC2744A abstractC2744A = this.f8421C;
        Activity m9375s = abstractC2744A == null ? null : abstractC2744A.m9375s();
        if (m9375s != null) {
            this.f8433O = false;
            m9917z0(m9375s, attributeSet, bundle);
        }
    }

    /* renamed from: A1 */
    public void m9810A1(ArrayList arrayList, ArrayList arrayList2) {
        m9880l();
        g gVar = this.f8438T;
        gVar.f8488h = arrayList;
        gVar.f8489i = arrayList2;
    }

    /* renamed from: B */
    public View m9811B() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        return gVar.f8499s;
    }

    /* renamed from: B1 */
    public void m9813B1(Intent intent, int i7, Bundle bundle) {
        if (this.f8421C != null) {
            m9825H().m9450V0(this, intent, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: C */
    public final Object m9814C() {
        AbstractC2744A abstractC2744A = this.f8421C;
        if (abstractC2744A == null) {
            return null;
        }
        return abstractC2744A.mo9380y();
    }

    /* renamed from: C0 */
    public boolean m9815C0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: C1 */
    public void m9816C1() {
        if (this.f8438T == null || !m9880l().f8500t) {
            return;
        }
        if (this.f8421C == null) {
            m9880l().f8500t = false;
        } else if (Looper.myLooper() != this.f8421C.m9378v().getLooper()) {
            this.f8421C.m9378v().postAtFrontOfQueue(new c());
        } else {
            m9869g(true);
        }
    }

    /* renamed from: D */
    public LayoutInflater m9817D(Bundle bundle) {
        AbstractC2744A abstractC2744A = this.f8421C;
        if (abstractC2744A == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater mo9381z = abstractC2744A.mo9381z();
        AbstractC0516k.m1968a(mo9381z, this.f8422D.m9515w0());
        return mo9381z;
    }

    /* renamed from: E */
    public final int m9819E() {
        AbstractC3345j.b bVar = this.f8446a0;
        return (bVar == AbstractC3345j.b.INITIALIZED || this.f8423E == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f8423E.m9819E());
    }

    /* renamed from: E0 */
    public void m9820E0() {
        this.f8433O = true;
    }

    /* renamed from: F */
    public int m9821F() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return 0;
        }
        return gVar.f8487g;
    }

    /* renamed from: G */
    public final AbstractComponentCallbacksC2786p m9823G() {
        return this.f8423E;
    }

    /* renamed from: H */
    public final AbstractC2752I m9825H() {
        AbstractC2752I abstractC2752I = this.f8420B;
        if (abstractC2752I != null) {
            return abstractC2752I;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: I */
    public boolean m9827I() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return false;
        }
        return gVar.f8482b;
    }

    /* renamed from: J */
    public int m9829J() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return 0;
        }
        return gVar.f8485e;
    }

    /* renamed from: J0 */
    public void mo9830J0() {
        this.f8433O = true;
    }

    /* renamed from: K */
    public int m9831K() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return 0;
        }
        return gVar.f8486f;
    }

    /* renamed from: L */
    public float m9832L() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f8498r;
    }

    /* renamed from: L0 */
    public void mo9789L0() {
        this.f8433O = true;
    }

    /* renamed from: M */
    public Object m9833M() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f8493m;
        return obj == f8418k0 ? m9916z() : obj;
    }

    /* renamed from: M0 */
    public void mo3133M0() {
        this.f8433O = true;
    }

    /* renamed from: N */
    public final Resources m9834N() {
        return m9892p1().getResources();
    }

    /* renamed from: O */
    public Object m9836O() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f8491k;
        return obj == f8418k0 ? m9908v() : obj;
    }

    /* renamed from: O0 */
    public void mo9793O0(Bundle bundle) {
        this.f8433O = true;
    }

    /* renamed from: P */
    public Object m9837P() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        return gVar.f8494n;
    }

    /* renamed from: P0 */
    public void m9838P0(Bundle bundle) {
        this.f8422D.m9454X0();
        this.f8445a = 3;
        this.f8433O = false;
        mo9797i0(bundle);
        if (this.f8433O) {
            m9901s1();
            this.f8422D.m9516x();
        } else {
            throw new C2772b0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    /* renamed from: Q */
    public Object m9839Q() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f8495o;
        return obj == f8418k0 ? m9837P() : obj;
    }

    /* renamed from: Q0 */
    public void m9840Q0() {
        Iterator it = this.f8459i0.iterator();
        while (it.hasNext()) {
            ((i) it.next()).mo9919a();
        }
        this.f8459i0.clear();
        this.f8422D.m9483l(this.f8421C, mo9796i(), this);
        this.f8445a = 0;
        this.f8433O = false;
        mo9798l0(this.f8421C.m9376t());
        if (this.f8433O) {
            this.f8420B.m9422H(this);
            this.f8422D.m9518y();
        } else {
            throw new C2772b0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* renamed from: R */
    public ArrayList m9841R() {
        ArrayList arrayList;
        g gVar = this.f8438T;
        return (gVar == null || (arrayList = gVar.f8488h) == null) ? new ArrayList() : arrayList;
    }

    /* renamed from: R0 */
    public void m9842R0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* renamed from: S */
    public ArrayList m9843S() {
        ArrayList arrayList;
        g gVar = this.f8438T;
        return (gVar == null || (arrayList = gVar.f8489i) == null) ? new ArrayList() : arrayList;
    }

    /* renamed from: S0 */
    public boolean m9844S0(MenuItem menuItem) {
        if (this.f8427I) {
            return false;
        }
        if (m9886n0(menuItem)) {
            return true;
        }
        return this.f8422D.m9409A(menuItem);
    }

    /* renamed from: T */
    public final AbstractComponentCallbacksC2786p m9845T(boolean z6) {
        String str;
        if (z6) {
            C2884c.m10404h(this);
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8462o;
        if (abstractComponentCallbacksC2786p != null) {
            return abstractComponentCallbacksC2786p;
        }
        AbstractC2752I abstractC2752I = this.f8420B;
        if (abstractC2752I == null || (str = this.f8463p) == null) {
            return null;
        }
        return abstractC2752I.m9468f0(str);
    }

    /* renamed from: T0 */
    public void m9846T0(Bundle bundle) {
        this.f8422D.m9454X0();
        this.f8445a = 1;
        this.f8433O = false;
        this.f8448b0.mo12927a(new f());
        mo9799o0(bundle);
        this.f8443Y = true;
        if (this.f8433O) {
            this.f8448b0.m12941h(AbstractC3345j.a.ON_CREATE);
            return;
        }
        throw new C2772b0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: U */
    public View m9847U() {
        return this.f8435Q;
    }

    /* renamed from: U0 */
    public boolean m9848U0(Menu menu, MenuInflater menuInflater) {
        boolean z6 = false;
        if (this.f8427I) {
            return false;
        }
        if (this.f8431M && this.f8432N) {
            m9897r0(menu, menuInflater);
            z6 = true;
        }
        return z6 | this.f8422D.m9413C(menu, menuInflater);
    }

    /* renamed from: V */
    public AbstractC3353r m9849V() {
        return this.f8452d0;
    }

    /* renamed from: V0 */
    public void mo9795V0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8422D.m9454X0();
        this.f8473z = true;
        this.f8450c0 = new C2764V(this, mo9650j(), new Runnable() { // from class: X.o
            @Override // java.lang.Runnable
            public final void run() {
                AbstractComponentCallbacksC2786p.this.m9870g0();
            }
        });
        View m9900s0 = m9900s0(layoutInflater, viewGroup, bundle);
        this.f8435Q = m9900s0;
        if (m9900s0 == null) {
            if (this.f8450c0.m9646e()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f8450c0 = null;
            return;
        }
        this.f8450c0.m9644c();
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f8435Q + " for Fragment " + this);
        }
        AbstractC3334Q.m12909a(this.f8435Q, this.f8450c0);
        AbstractC3335S.m12910a(this.f8435Q, this.f8450c0);
        AbstractC0035g.m98a(this.f8435Q, this.f8450c0);
        this.f8452d0.mo12971n(this.f8450c0);
    }

    /* renamed from: W */
    public final void m9850W() {
        this.f8448b0 = new C3350o(this);
        this.f8456f0 = C0033e.m91a(this);
        this.f8454e0 = null;
        if (this.f8459i0.contains(this.f8460j0)) {
            return;
        }
        m9887n1(this.f8460j0);
    }

    /* renamed from: W0 */
    public void m9851W0() {
        this.f8422D.m9414D();
        this.f8448b0.m12941h(AbstractC3345j.a.ON_DESTROY);
        this.f8445a = 0;
        this.f8433O = false;
        this.f8443Y = false;
        mo9903t0();
        if (this.f8433O) {
            return;
        }
        throw new C2772b0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: X */
    public void m9852X() {
        m9850W();
        this.f8444Z = this.f8455f;
        this.f8455f = UUID.randomUUID().toString();
        this.f8466s = false;
        this.f8467t = false;
        this.f8470w = false;
        this.f8471x = false;
        this.f8472y = false;
        this.f8419A = 0;
        this.f8420B = null;
        this.f8422D = new C2753J();
        this.f8421C = null;
        this.f8424F = 0;
        this.f8425G = 0;
        this.f8426H = null;
        this.f8427I = false;
        this.f8428J = false;
    }

    /* renamed from: X0 */
    public void m9853X0() {
        this.f8422D.m9416E();
        if (this.f8435Q != null && this.f8450c0.mo9642a().mo12928b().m12935f(AbstractC3345j.b.CREATED)) {
            this.f8450c0.m9643b(AbstractC3345j.a.ON_DESTROY);
        }
        this.f8445a = 1;
        this.f8433O = false;
        mo9800v0();
        if (this.f8433O) {
            AbstractC4099a.m17191b(this).mo17194d();
            this.f8473z = false;
        } else {
            throw new C2772b0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* renamed from: Y0 */
    public void m9854Y0() {
        this.f8445a = -1;
        this.f8433O = false;
        mo9801w0();
        this.f8442X = null;
        if (this.f8433O) {
            if (this.f8422D.m9423H0()) {
                return;
            }
            this.f8422D.m9414D();
            this.f8422D = new C2753J();
            return;
        }
        throw new C2772b0("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* renamed from: Z */
    public final boolean m9855Z() {
        return this.f8421C != null && this.f8466s;
    }

    /* renamed from: Z0 */
    public LayoutInflater m9856Z0(Bundle bundle) {
        LayoutInflater mo9802x0 = mo9802x0(bundle);
        this.f8442X = mo9802x0;
        return mo9802x0;
    }

    @Override // androidx.lifecycle.InterfaceC3349n
    /* renamed from: a */
    public AbstractC3345j mo9642a() {
        return this.f8448b0;
    }

    /* renamed from: a0 */
    public final boolean m9857a0() {
        AbstractC2752I abstractC2752I;
        return this.f8427I || ((abstractC2752I = this.f8420B) != null && abstractC2752I.m9430L0(this.f8423E));
    }

    /* renamed from: a1 */
    public void m9858a1() {
        onLowMemory();
    }

    /* renamed from: b0 */
    public final boolean m9859b0() {
        return this.f8419A > 0;
    }

    /* renamed from: b1 */
    public void m9860b1(boolean z6) {
        m9812B0(z6);
    }

    /* renamed from: c0 */
    public final boolean m9861c0() {
        AbstractC2752I abstractC2752I;
        return this.f8432N && ((abstractC2752I = this.f8420B) == null || abstractC2752I.m9432M0(this.f8423E));
    }

    /* renamed from: c1 */
    public boolean m9862c1(MenuItem menuItem) {
        if (this.f8427I) {
            return false;
        }
        if (this.f8431M && this.f8432N && m9815C0(menuItem)) {
            return true;
        }
        return this.f8422D.m9425J(menuItem);
    }

    @Override // androidx.lifecycle.InterfaceC3343h
    /* renamed from: d */
    public AbstractC3503a mo9645d() {
        Application application;
        Context applicationContext = m9892p1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m9892p1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C3504b c3504b = new C3504b();
        if (application != null) {
            c3504b.m14082c(C3330M.a.f10719g, application);
        }
        c3504b.m14082c(AbstractC3323F.f10697a, this);
        c3504b.m14082c(AbstractC3323F.f10698b, this);
        if (m9896r() != null) {
            c3504b.m14082c(AbstractC3323F.f10699c, m9896r());
        }
        return c3504b;
    }

    /* renamed from: d0 */
    public boolean m9863d0() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return false;
        }
        return gVar.f8500t;
    }

    /* renamed from: d1 */
    public void m9864d1(Menu menu) {
        if (this.f8427I) {
            return;
        }
        if (this.f8431M && this.f8432N) {
            m9818D0(menu);
        }
        this.f8422D.m9427K(menu);
    }

    /* renamed from: e0 */
    public final boolean m9865e0() {
        return this.f8467t;
    }

    /* renamed from: e1 */
    public void m9866e1() {
        this.f8422D.m9431M();
        if (this.f8435Q != null) {
            this.f8450c0.m9643b(AbstractC3345j.a.ON_PAUSE);
        }
        this.f8448b0.m12941h(AbstractC3345j.a.ON_PAUSE);
        this.f8445a = 6;
        this.f8433O = false;
        m9820E0();
        if (this.f8433O) {
            return;
        }
        throw new C2772b0("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public final boolean m9867f0() {
        AbstractC2752I abstractC2752I = this.f8420B;
        if (abstractC2752I == null) {
            return false;
        }
        return abstractC2752I.m9438P0();
    }

    /* renamed from: f1 */
    public void m9868f1(boolean z6) {
        m9822F0(z6);
    }

    /* renamed from: g */
    public void m9869g(boolean z6) {
        ViewGroup viewGroup;
        AbstractC2752I abstractC2752I;
        g gVar = this.f8438T;
        if (gVar != null) {
            gVar.f8500t = false;
        }
        if (this.f8435Q == null || (viewGroup = this.f8434P) == null || (abstractC2752I = this.f8420B) == null) {
            return;
        }
        AbstractC2768Z m9656u = AbstractC2768Z.m9656u(viewGroup, abstractC2752I);
        m9656u.m9677x();
        if (z6) {
            this.f8421C.m9378v().post(new d(m9656u));
        } else {
            m9656u.m9669n();
        }
        Handler handler = this.f8439U;
        if (handler != null) {
            handler.removeCallbacks(this.f8440V);
            this.f8439U = null;
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ void m9870g0() {
        this.f8450c0.m9647f(this.f8451d);
        this.f8451d = null;
    }

    /* renamed from: g1 */
    public boolean m9871g1(Menu menu) {
        boolean z6 = false;
        if (this.f8427I) {
            return false;
        }
        if (this.f8431M && this.f8432N) {
            m9824G0(menu);
            z6 = true;
        }
        return z6 | this.f8422D.m9435O(menu);
    }

    /* renamed from: h0 */
    public void m9872h0() {
        this.f8422D.m9454X0();
    }

    /* renamed from: h1 */
    public void m9873h1() {
        boolean m9434N0 = this.f8420B.m9434N0(this);
        Boolean bool = this.f8465r;
        if (bool == null || bool.booleanValue() != m9434N0) {
            this.f8465r = Boolean.valueOf(m9434N0);
            m9826H0(m9434N0);
            this.f8422D.m9437P();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public AbstractC2793w mo9796i() {
        return new e();
    }

    /* renamed from: i0 */
    public void mo9797i0(Bundle bundle) {
        this.f8433O = true;
    }

    /* renamed from: i1 */
    public void m9874i1() {
        this.f8422D.m9454X0();
        this.f8422D.m9459a0(true);
        this.f8445a = 7;
        this.f8433O = false;
        mo9830J0();
        if (!this.f8433O) {
            throw new C2772b0("Fragment " + this + " did not call through to super.onResume()");
        }
        C3350o c3350o = this.f8448b0;
        AbstractC3345j.a aVar = AbstractC3345j.a.ON_RESUME;
        c3350o.m12941h(aVar);
        if (this.f8435Q != null) {
            this.f8450c0.m9643b(aVar);
        }
        this.f8422D.m9439Q();
    }

    @Override // androidx.lifecycle.InterfaceC3333P
    /* renamed from: j */
    public C3332O mo9650j() {
        if (this.f8420B == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m9819E() != AbstractC3345j.b.INITIALIZED.ordinal()) {
            return this.f8420B.m9415D0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    /* renamed from: j0 */
    public void mo9875j0(int i7, int i8, Intent intent) {
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    /* renamed from: j1 */
    public void m9876j1(Bundle bundle) {
        mo9787K0(bundle);
    }

    /* renamed from: k */
    public void mo9877k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f8424F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f8425G));
        printWriter.print(" mTag=");
        printWriter.println(this.f8426H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f8445a);
        printWriter.print(" mWho=");
        printWriter.print(this.f8455f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f8419A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f8466s);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f8467t);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f8470w);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f8471x);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f8427I);
        printWriter.print(" mDetached=");
        printWriter.print(this.f8428J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f8432N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f8431M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f8429K);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f8437S);
        if (this.f8420B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f8420B);
        }
        if (this.f8421C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f8421C);
        }
        if (this.f8423E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f8423E);
        }
        if (this.f8461n != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f8461n);
        }
        if (this.f8447b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f8447b);
        }
        if (this.f8449c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f8449c);
        }
        if (this.f8451d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f8451d);
        }
        AbstractComponentCallbacksC2786p m9845T = m9845T(false);
        if (m9845T != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m9845T);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f8464q);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m9827I());
        if (m9905u() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m9905u());
        }
        if (m9913y() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m9913y());
        }
        if (m9829J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m9829J());
        }
        if (m9831K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m9831K());
        }
        if (this.f8434P != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f8434P);
        }
        if (this.f8435Q != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f8435Q);
        }
        if (m9893q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m9893q());
        }
        if (m9902t() != null) {
            AbstractC4099a.m17191b(this).mo17192a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f8422D + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        this.f8422D.m9451W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: k0 */
    public void m9878k0(Activity activity) {
        this.f8433O = true;
    }

    /* renamed from: k1 */
    public void m9879k1() {
        this.f8422D.m9454X0();
        this.f8422D.m9459a0(true);
        this.f8445a = 5;
        this.f8433O = false;
        mo9789L0();
        if (!this.f8433O) {
            throw new C2772b0("Fragment " + this + " did not call through to super.onStart()");
        }
        C3350o c3350o = this.f8448b0;
        AbstractC3345j.a aVar = AbstractC3345j.a.ON_START;
        c3350o.m12941h(aVar);
        if (this.f8435Q != null) {
            this.f8450c0.m9643b(aVar);
        }
        this.f8422D.m9441R();
    }

    /* renamed from: l */
    public final g m9880l() {
        if (this.f8438T == null) {
            this.f8438T = new g();
        }
        return this.f8438T;
    }

    /* renamed from: l0 */
    public void mo9798l0(Context context) {
        this.f8433O = true;
        AbstractC2744A abstractC2744A = this.f8421C;
        Activity m9375s = abstractC2744A == null ? null : abstractC2744A.m9375s();
        if (m9375s != null) {
            this.f8433O = false;
            m9878k0(m9375s);
        }
    }

    /* renamed from: l1 */
    public void m9881l1() {
        this.f8422D.m9445T();
        if (this.f8435Q != null) {
            this.f8450c0.m9643b(AbstractC3345j.a.ON_STOP);
        }
        this.f8448b0.m12941h(AbstractC3345j.a.ON_STOP);
        this.f8445a = 4;
        this.f8433O = false;
        mo3133M0();
        if (this.f8433O) {
            return;
        }
        throw new C2772b0("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: m */
    public AbstractComponentCallbacksC2786p m9882m(String str) {
        return str.equals(this.f8455f) ? this : this.f8422D.m9479j0(str);
    }

    /* renamed from: m1 */
    public void m9884m1() {
        Bundle bundle = this.f8447b;
        m9835N0(this.f8435Q, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f8422D.m9447U();
    }

    /* renamed from: n */
    public final AbstractActivityC2791u m9885n() {
        AbstractC2744A abstractC2744A = this.f8421C;
        if (abstractC2744A == null) {
            return null;
        }
        return (AbstractActivityC2791u) abstractC2744A.m9375s();
    }

    /* renamed from: n0 */
    public boolean m9886n0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: n1 */
    public final void m9887n1(i iVar) {
        if (this.f8445a >= 0) {
            iVar.mo9919a();
        } else {
            this.f8459i0.add(iVar);
        }
    }

    /* renamed from: o */
    public boolean m9888o() {
        Boolean bool;
        g gVar = this.f8438T;
        if (gVar == null || (bool = gVar.f8497q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: o0 */
    public void mo9799o0(Bundle bundle) {
        this.f8433O = true;
        m9898r1();
        if (this.f8422D.m9436O0(1)) {
            return;
        }
        this.f8422D.m9411B();
    }

    /* renamed from: o1 */
    public final AbstractActivityC2791u m9889o1() {
        AbstractActivityC2791u m9885n = m9885n();
        if (m9885n != null) {
            return m9885n;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f8433O = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m9889o1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f8433O = true;
    }

    /* renamed from: p */
    public boolean m9890p() {
        Boolean bool;
        g gVar = this.f8438T;
        if (gVar == null || (bool = gVar.f8496p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: p0 */
    public Animation m9891p0(int i7, boolean z6, int i8) {
        return null;
    }

    /* renamed from: p1 */
    public final Context m9892p1() {
        Context m9902t = m9902t();
        if (m9902t != null) {
            return m9902t;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: q */
    public View m9893q() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        return gVar.f8481a;
    }

    /* renamed from: q0 */
    public Animator m9894q0(int i7, boolean z6, int i8) {
        return null;
    }

    /* renamed from: q1 */
    public final View m9895q1() {
        View m9847U = m9847U();
        if (m9847U != null) {
            return m9847U;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: r */
    public final Bundle m9896r() {
        return this.f8461n;
    }

    /* renamed from: r1 */
    public void m9898r1() {
        Bundle bundle;
        Bundle bundle2 = this.f8447b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f8422D.m9482k1(bundle);
        this.f8422D.m9411B();
    }

    /* renamed from: s */
    public final AbstractC2752I m9899s() {
        if (this.f8421C != null) {
            return this.f8422D;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: s0 */
    public View m9900s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7 = this.f8457g0;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    /* renamed from: s1 */
    public final void m9901s1() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f8435Q != null) {
            Bundle bundle = this.f8447b;
            m9904t1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f8447b = null;
    }

    public void startActivityForResult(Intent intent, int i7) {
        m9813B1(intent, i7, null);
    }

    /* renamed from: t */
    public Context m9902t() {
        AbstractC2744A abstractC2744A = this.f8421C;
        if (abstractC2744A == null) {
            return null;
        }
        return abstractC2744A.m9376t();
    }

    /* renamed from: t0 */
    public void mo9903t0() {
        this.f8433O = true;
    }

    /* renamed from: t1 */
    public final void m9904t1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f8449c;
        if (sparseArray != null) {
            this.f8435Q.restoreHierarchyState(sparseArray);
            this.f8449c = null;
        }
        this.f8433O = false;
        mo9793O0(bundle);
        if (this.f8433O) {
            if (this.f8435Q != null) {
                this.f8450c0.m9643b(AbstractC3345j.a.ON_CREATE);
            }
        } else {
            throw new C2772b0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f8455f);
        if (this.f8424F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f8424F));
        }
        if (this.f8426H != null) {
            sb.append(" tag=");
            sb.append(this.f8426H);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int m9905u() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return 0;
        }
        return gVar.f8483c;
    }

    /* renamed from: u1 */
    public void m9907u1(int i7, int i8, int i9, int i10) {
        if (this.f8438T == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        m9880l().f8483c = i7;
        m9880l().f8484d = i8;
        m9880l().f8485e = i9;
        m9880l().f8486f = i10;
    }

    /* renamed from: v */
    public Object m9908v() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        return gVar.f8490j;
    }

    /* renamed from: v0 */
    public void mo9800v0() {
        this.f8433O = true;
    }

    /* renamed from: v1 */
    public void m9909v1(Bundle bundle) {
        if (this.f8420B != null && m9867f0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f8461n = bundle;
    }

    @Override // p009B1.InterfaceC0034f
    /* renamed from: w */
    public final C0032d mo97w() {
        return this.f8456f0.m92b();
    }

    /* renamed from: w0 */
    public void mo9801w0() {
        this.f8433O = true;
    }

    /* renamed from: w1 */
    public void m9910w1(View view) {
        m9880l().f8499s = view;
    }

    /* renamed from: x */
    public AbstractC6802r m9911x() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    /* renamed from: x0 */
    public LayoutInflater mo9802x0(Bundle bundle) {
        return m9817D(bundle);
    }

    /* renamed from: x1 */
    public void m9912x1(int i7) {
        if (this.f8438T == null && i7 == 0) {
            return;
        }
        m9880l();
        this.f8438T.f8487g = i7;
    }

    /* renamed from: y */
    public int m9913y() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return 0;
        }
        return gVar.f8484d;
    }

    /* renamed from: y1 */
    public void m9915y1(boolean z6) {
        if (this.f8438T == null) {
            return;
        }
        m9880l().f8482b = z6;
    }

    /* renamed from: z */
    public Object m9916z() {
        g gVar = this.f8438T;
        if (gVar == null) {
            return null;
        }
        return gVar.f8492l;
    }

    /* renamed from: z0 */
    public void m9917z0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f8433O = true;
    }

    /* renamed from: z1 */
    public void m9918z1(float f7) {
        m9880l().f8498r = f7;
    }

    /* renamed from: u0 */
    public void m9906u0() {
    }

    /* renamed from: B0 */
    public void m9812B0(boolean z6) {
    }

    /* renamed from: D0 */
    public void m9818D0(Menu menu) {
    }

    /* renamed from: F0 */
    public void m9822F0(boolean z6) {
    }

    /* renamed from: G0 */
    public void m9824G0(Menu menu) {
    }

    /* renamed from: H0 */
    public void m9826H0(boolean z6) {
    }

    /* renamed from: K0 */
    public void mo9787K0(Bundle bundle) {
    }

    /* renamed from: m0 */
    public void m9883m0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
    }

    /* renamed from: y0 */
    public void m9914y0(boolean z6) {
    }

    /* renamed from: N0 */
    public void m9835N0(View view, Bundle bundle) {
    }

    /* renamed from: r0 */
    public void m9897r0(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: I0 */
    public void m9828I0(int i7, String[] strArr, int[] iArr) {
    }
}
