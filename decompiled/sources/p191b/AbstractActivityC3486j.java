package p191b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC3323F;
import androidx.lifecycle.AbstractC3334Q;
import androidx.lifecycle.AbstractC3335S;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.C3326I;
import androidx.lifecycle.C3330M;
import androidx.lifecycle.C3332O;
import androidx.lifecycle.C3350o;
import androidx.lifecycle.FragmentC3361z;
import androidx.lifecycle.InterfaceC3333P;
import androidx.lifecycle.InterfaceC3343h;
import androidx.lifecycle.InterfaceC3347l;
import androidx.lifecycle.InterfaceC3349n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import org.apache.tika.pipes.PipesConfigBase;
import p009B1.AbstractC0035g;
import p009B1.C0032d;
import p009B1.C0033e;
import p009B1.InterfaceC0034f;
import p023D1.AbstractC0181a;
import p042G.InterfaceC0339a;
import p049H.C0519n;
import p049H.InterfaceC0518m;
import p049H.InterfaceC0521p;
import p069J5.InterfaceC0789a;
import p191b.AbstractActivityC3486j;
import p192b0.AbstractC3503a;
import p192b0.C3504b;
import p199c.C3562a;
import p199c.InterfaceC3563b;
import p207d.AbstractC4095e;
import p207d.C4097g;
import p207d.InterfaceC4096f;
import p215e.AbstractC4141a;
import p365w.AbstractActivityC6789e;
import p365w.AbstractC6785a;
import p365w.AbstractC6786b;
import p365w.C6791g;
import p365w.C6800p;
import p365w.InterfaceC6797m;
import p365w.InterfaceC6798n;
import p371w5.AbstractC6924g;
import p371w5.C6934q;
import p371w5.InterfaceC6923f;
import p372x.InterfaceC6937c;
import p372x.InterfaceC6938d;

/* renamed from: b.j */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3486j extends AbstractActivityC6789e implements InterfaceC3349n, InterfaceC3333P, InterfaceC3343h, InterfaceC0034f, InterfaceC3502z, InterfaceC4096f, InterfaceC6937c, InterfaceC6938d, InterfaceC6797m, InterfaceC6798n, InterfaceC0518m, InterfaceC3497u {

    /* renamed from: C */
    public static final c f11675C = new c(null);

    /* renamed from: A */
    public final InterfaceC6923f f11676A;

    /* renamed from: B */
    public final InterfaceC6923f f11677B;

    /* renamed from: c */
    public final C3562a f11678c = new C3562a();

    /* renamed from: d */
    public final C0519n f11679d = new C0519n(new Runnable() { // from class: b.d
        @Override // java.lang.Runnable
        public final void run() {
            AbstractActivityC3486j.m13992R(AbstractActivityC3486j.this);
        }
    });

    /* renamed from: e */
    public final C0033e f11680e;

    /* renamed from: f */
    public C3332O f11681f;

    /* renamed from: n */
    public final e f11682n;

    /* renamed from: o */
    public final InterfaceC6923f f11683o;

    /* renamed from: p */
    public int f11684p;

    /* renamed from: q */
    public final AtomicInteger f11685q;

    /* renamed from: r */
    public final AbstractC4095e f11686r;

    /* renamed from: s */
    public final CopyOnWriteArrayList f11687s;

    /* renamed from: t */
    public final CopyOnWriteArrayList f11688t;

    /* renamed from: u */
    public final CopyOnWriteArrayList f11689u;

    /* renamed from: v */
    public final CopyOnWriteArrayList f11690v;

    /* renamed from: w */
    public final CopyOnWriteArrayList f11691w;

    /* renamed from: x */
    public final CopyOnWriteArrayList f11692x;

    /* renamed from: y */
    public boolean f11693y;

    /* renamed from: z */
    public boolean f11694z;

    /* renamed from: b.j$a */
    public static final class a implements InterfaceC3347l {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC3347l
        /* renamed from: d */
        public void mo78d(InterfaceC3349n source, AbstractC3345j.a event) {
            AbstractC5469l.m23028e(source, "source");
            AbstractC5469l.m23028e(event, "event");
            AbstractActivityC3486j.this.m14003N();
            AbstractActivityC3486j.this.mo9642a().mo12929c(this);
        }
    }

    /* renamed from: b.j$b */
    public static final class b {

        /* renamed from: a */
        public static final b f11696a = new b();

        /* renamed from: a */
        public final OnBackInvokedDispatcher m14008a(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            AbstractC5469l.m23027d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* renamed from: b.j$c */
    public static final class c {
        public /* synthetic */ c(AbstractC5464g abstractC5464g) {
            this();
        }

        public c() {
        }
    }

    /* renamed from: b.j$d */
    public static final class d {

        /* renamed from: a */
        public Object f11697a;

        /* renamed from: b */
        public C3332O f11698b;

        /* renamed from: a */
        public final C3332O m14009a() {
            return this.f11698b;
        }

        /* renamed from: b */
        public final void m14010b(Object obj) {
            this.f11697a = obj;
        }

        /* renamed from: c */
        public final void m14011c(C3332O c3332o) {
            this.f11698b = c3332o;
        }
    }

    /* renamed from: b.j$e */
    public interface e extends Executor {
        /* renamed from: g */
        void mo14012g();

        /* renamed from: o */
        void mo14013o(View view);
    }

    /* renamed from: b.j$f */
    public final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a */
        public final long f11699a = SystemClock.uptimeMillis() + PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS;

        /* renamed from: b */
        public Runnable f11700b;

        /* renamed from: c */
        public boolean f11701c;

        public f() {
        }

        /* renamed from: b */
        public static final void m14015b(f this$0) {
            AbstractC5469l.m23028e(this$0, "this$0");
            Runnable runnable = this$0.f11700b;
            if (runnable != null) {
                AbstractC5469l.m23025b(runnable);
                runnable.run();
                this$0.f11700b = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC5469l.m23028e(runnable, "runnable");
            this.f11700b = runnable;
            View decorView = AbstractActivityC3486j.this.getWindow().getDecorView();
            AbstractC5469l.m23027d(decorView, "window.decorView");
            if (!this.f11701c) {
                decorView.postOnAnimation(new Runnable() { // from class: b.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC3486j.f.m14015b(AbstractActivityC3486j.f.this);
                    }
                });
            } else if (AbstractC5469l.m23024a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // p191b.AbstractActivityC3486j.e
        /* renamed from: g */
        public void mo14012g() {
            AbstractActivityC3486j.this.getWindow().getDecorView().removeCallbacks(this);
            AbstractActivityC3486j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // p191b.AbstractActivityC3486j.e
        /* renamed from: o */
        public void mo14013o(View view) {
            AbstractC5469l.m23028e(view, "view");
            if (this.f11701c) {
                return;
            }
            this.f11701c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f11700b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f11699a) {
                    this.f11701c = false;
                    AbstractActivityC3486j.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f11700b = null;
            if (AbstractActivityC3486j.this.m14004O().m14037c()) {
                this.f11701c = false;
                AbstractActivityC3486j.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC3486j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* renamed from: b.j$g */
    public static final class g extends AbstractC4095e {
        public g() {
        }

        /* renamed from: p */
        public static final void m14018p(g this$0, int i7, AbstractC4141a.a aVar) {
            AbstractC5469l.m23028e(this$0, "this$0");
            this$0.m17167e(i7, aVar.m17391a());
        }

        /* renamed from: q */
        public static final void m14019q(g this$0, int i7, IntentSender.SendIntentException e7) {
            AbstractC5469l.m23028e(this$0, "this$0");
            AbstractC5469l.m23028e(e7, "$e");
            this$0.m17166d(i7, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e7));
        }

        @Override // p207d.AbstractC4095e
        /* renamed from: h */
        public void mo14020h(final int i7, AbstractC4141a contract, Object obj, AbstractC6786b abstractC6786b) {
            Bundle bundle;
            AbstractC5469l.m23028e(contract, "contract");
            AbstractActivityC3486j abstractActivityC3486j = AbstractActivityC3486j.this;
            final AbstractC4141a.a mo17390b = contract.mo17390b(abstractActivityC3486j, obj);
            if (mo17390b != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC3486j.g.m14018p(AbstractActivityC3486j.g.this, i7, mo17390b);
                    }
                });
                return;
            }
            Intent mo9533a = contract.mo9533a(abstractActivityC3486j, obj);
            if (mo9533a.getExtras() != null) {
                Bundle extras = mo9533a.getExtras();
                AbstractC5469l.m23025b(extras);
                if (extras.getClassLoader() == null) {
                    mo9533a.setExtrasClassLoader(abstractActivityC3486j.getClassLoader());
                }
            }
            if (mo9533a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = mo9533a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo9533a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (AbstractC5469l.m23024a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", mo9533a.getAction())) {
                String[] stringArrayExtra = mo9533a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC6785a.m27824a(abstractActivityC3486j, stringArrayExtra, i7);
                return;
            }
            if (!AbstractC5469l.m23024a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", mo9533a.getAction())) {
                AbstractC6785a.m27825b(abstractActivityC3486j, mo9533a, i7, bundle);
                return;
            }
            C4097g c4097g = (C4097g) mo9533a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC5469l.m23025b(c4097g);
                AbstractC6785a.m27826c(abstractActivityC3486j, c4097g.m17181d(), i7, c4097g.m17178a(), c4097g.m17179b(), c4097g.m17180c(), 0, bundle);
            } catch (IntentSender.SendIntentException e7) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC3486j.g.m14019q(AbstractActivityC3486j.g.this, i7, e7);
                    }
                });
            }
        }
    }

    /* renamed from: b.j$h */
    public static final class h extends AbstractC5470m implements InterfaceC0789a {
        public h() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3326I invoke() {
            Application application = AbstractActivityC3486j.this.getApplication();
            AbstractActivityC3486j abstractActivityC3486j = AbstractActivityC3486j.this;
            return new C3326I(application, abstractActivityC3486j, abstractActivityC3486j.getIntent() != null ? AbstractActivityC3486j.this.getIntent().getExtras() : null);
        }
    }

    /* renamed from: b.j$i */
    public static final class i extends AbstractC5470m implements InterfaceC0789a {

        /* renamed from: b.j$i$a */
        public static final class a extends AbstractC5470m implements InterfaceC0789a {

            /* renamed from: a */
            public final /* synthetic */ AbstractActivityC3486j f11706a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractActivityC3486j abstractActivityC3486j) {
                super(0);
                this.f11706a = abstractActivityC3486j;
            }

            /* renamed from: a */
            public final void m14023a() {
                this.f11706a.reportFullyDrawn();
            }

            @Override // p069J5.InterfaceC0789a
            public /* bridge */ /* synthetic */ Object invoke() {
                m14023a();
                return C6934q.f24811a;
            }
        }

        public i() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3496t invoke() {
            return new C3496t(AbstractActivityC3486j.this.f11682n, new a(AbstractActivityC3486j.this));
        }
    }

    /* renamed from: b.j$j */
    public static final class j extends AbstractC5470m implements InterfaceC0789a {
        public j() {
            super(0);
        }

        /* renamed from: f */
        public static final void m14026f(AbstractActivityC3486j this$0) {
            AbstractC5469l.m23028e(this$0, "this$0");
            try {
                AbstractActivityC3486j.super.onBackPressed();
            } catch (IllegalStateException e7) {
                if (!AbstractC5469l.m23024a(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e7;
                }
            } catch (NullPointerException e8) {
                if (!AbstractC5469l.m23024a(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e8;
                }
            }
        }

        /* renamed from: g */
        public static final void m14027g(AbstractActivityC3486j this$0, C3500x dispatcher) {
            AbstractC5469l.m23028e(this$0, "this$0");
            AbstractC5469l.m23028e(dispatcher, "$dispatcher");
            this$0.m13999I(dispatcher);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final C3500x invoke() {
            final AbstractActivityC3486j abstractActivityC3486j = AbstractActivityC3486j.this;
            final C3500x c3500x = new C3500x(new Runnable() { // from class: b.n
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC3486j.j.m14026f(AbstractActivityC3486j.this);
                }
            });
            final AbstractActivityC3486j abstractActivityC3486j2 = AbstractActivityC3486j.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (AbstractC5469l.m23024a(Looper.myLooper(), Looper.getMainLooper())) {
                    abstractActivityC3486j2.m13999I(c3500x);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractActivityC3486j.j.m14027g(AbstractActivityC3486j.this, c3500x);
                        }
                    });
                }
            }
            return c3500x;
        }
    }

    public AbstractActivityC3486j() {
        C0033e m96a = C0033e.f156d.m96a(this);
        this.f11680e = m96a;
        this.f11682n = m14002M();
        this.f11683o = AbstractC6924g.m28367a(new i());
        this.f11685q = new AtomicInteger();
        this.f11686r = new g();
        this.f11687s = new CopyOnWriteArrayList();
        this.f11688t = new CopyOnWriteArrayList();
        this.f11689u = new CopyOnWriteArrayList();
        this.f11690v = new CopyOnWriteArrayList();
        this.f11691w = new CopyOnWriteArrayList();
        this.f11692x = new CopyOnWriteArrayList();
        if (mo9642a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        mo9642a().mo12927a(new InterfaceC3347l() { // from class: b.e
            @Override // androidx.lifecycle.InterfaceC3347l
            /* renamed from: d */
            public final void mo78d(InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar) {
                AbstractActivityC3486j.m13983A(AbstractActivityC3486j.this, interfaceC3349n, aVar);
            }
        });
        mo9642a().mo12927a(new InterfaceC3347l() { // from class: b.f
            @Override // androidx.lifecycle.InterfaceC3347l
            /* renamed from: d */
            public final void mo78d(InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar) {
                AbstractActivityC3486j.m13984B(AbstractActivityC3486j.this, interfaceC3349n, aVar);
            }
        });
        mo9642a().mo12927a(new a());
        m96a.m93c();
        AbstractC3323F.m12874c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            mo9642a().mo12927a(new C3498v(this));
        }
        mo97w().m88h("android:support:activity-result", new C0032d.c() { // from class: b.g
            @Override // p009B1.C0032d.c
            /* renamed from: a */
            public final Bundle mo79a() {
                Bundle m13985C;
                m13985C = AbstractActivityC3486j.m13985C(AbstractActivityC3486j.this);
                return m13985C;
            }
        });
        m14000K(new InterfaceC3563b() { // from class: b.h
            @Override // p199c.InterfaceC3563b
            /* renamed from: a */
            public final void mo9920a(Context context) {
                AbstractActivityC3486j.m13986D(AbstractActivityC3486j.this, context);
            }
        });
        this.f11676A = AbstractC6924g.m28367a(new h());
        this.f11677B = AbstractC6924g.m28367a(new j());
    }

    /* renamed from: A */
    public static final void m13983A(AbstractActivityC3486j this$0, InterfaceC3349n interfaceC3349n, AbstractC3345j.a event) {
        Window window;
        View peekDecorView;
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(interfaceC3349n, "<anonymous parameter 0>");
        AbstractC5469l.m23028e(event, "event");
        if (event != AbstractC3345j.a.ON_STOP || (window = this$0.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* renamed from: B */
    public static final void m13984B(AbstractActivityC3486j this$0, InterfaceC3349n interfaceC3349n, AbstractC3345j.a event) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(interfaceC3349n, "<anonymous parameter 0>");
        AbstractC5469l.m23028e(event, "event");
        if (event == AbstractC3345j.a.ON_DESTROY) {
            this$0.f11678c.m14383b();
            if (!this$0.isChangingConfigurations()) {
                this$0.mo9650j().m12904a();
            }
            this$0.f11682n.mo14012g();
        }
    }

    /* renamed from: C */
    public static final Bundle m13985C(AbstractActivityC3486j this$0) {
        AbstractC5469l.m23028e(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.f11686r.m17171j(bundle);
        return bundle;
    }

    /* renamed from: D */
    public static final void m13986D(AbstractActivityC3486j this$0, Context it) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(it, "it");
        Bundle m83b = this$0.mo97w().m83b("android:support:activity-result");
        if (m83b != null) {
            this$0.f11686r.m17170i(m83b);
        }
    }

    /* renamed from: J */
    public static final void m13991J(C3500x dispatcher, AbstractActivityC3486j this$0, InterfaceC3349n interfaceC3349n, AbstractC3345j.a event) {
        AbstractC5469l.m23028e(dispatcher, "$dispatcher");
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(interfaceC3349n, "<anonymous parameter 0>");
        AbstractC5469l.m23028e(event, "event");
        if (event == AbstractC3345j.a.ON_CREATE) {
            dispatcher.m14064n(b.f11696a.m14008a(this$0));
        }
    }

    /* renamed from: R */
    public static final void m13992R(AbstractActivityC3486j this$0) {
        AbstractC5469l.m23028e(this$0, "this$0");
        this$0.m14006Q();
    }

    /* renamed from: I */
    public final void m13999I(final C3500x c3500x) {
        mo9642a().mo12927a(new InterfaceC3347l() { // from class: b.i
            @Override // androidx.lifecycle.InterfaceC3347l
            /* renamed from: d */
            public final void mo78d(InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar) {
                AbstractActivityC3486j.m13991J(C3500x.this, this, interfaceC3349n, aVar);
            }
        });
    }

    /* renamed from: K */
    public final void m14000K(InterfaceC3563b listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11678c.m14382a(listener);
    }

    /* renamed from: L */
    public final void m14001L(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11689u.add(listener);
    }

    /* renamed from: M */
    public final e m14002M() {
        return new f();
    }

    /* renamed from: N */
    public final void m14003N() {
        if (this.f11681f == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f11681f = dVar.m14009a();
            }
            if (this.f11681f == null) {
                this.f11681f = new C3332O();
            }
        }
    }

    /* renamed from: O */
    public C3496t m14004O() {
        return (C3496t) this.f11683o.getValue();
    }

    /* renamed from: P */
    public void m14005P() {
        View decorView = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView, "window.decorView");
        AbstractC3334Q.m12909a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView2, "window.decorView");
        AbstractC3335S.m12910a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView3, "window.decorView");
        AbstractC0035g.m98a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView4, "window.decorView");
        AbstractC3476C.m13976a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView5, "window.decorView");
        AbstractC3475B.m13975a(decorView5, this);
    }

    /* renamed from: Q */
    public void m14006Q() {
        invalidateOptionsMenu();
    }

    /* renamed from: S */
    public Object m14007S() {
        return null;
    }

    @Override // p365w.AbstractActivityC6789e, androidx.lifecycle.InterfaceC3349n
    /* renamed from: a */
    public AbstractC3345j mo9642a() {
        return super.mo9642a();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m14005P();
        e eVar = this.f11682n;
        View decorView = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView, "window.decorView");
        eVar.mo14013o(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p049H.InterfaceC0518m
    /* renamed from: c */
    public void mo1971c(InterfaceC0521p provider) {
        AbstractC5469l.m23028e(provider, "provider");
        this.f11679d.m1978f(provider);
    }

    @Override // androidx.lifecycle.InterfaceC3343h
    /* renamed from: d */
    public AbstractC3503a mo9645d() {
        C3504b c3504b = new C3504b(null, 1, null);
        if (getApplication() != null) {
            AbstractC3503a.b bVar = C3330M.a.f10719g;
            Application application = getApplication();
            AbstractC5469l.m23027d(application, "application");
            c3504b.m14082c(bVar, application);
        }
        c3504b.m14082c(AbstractC3323F.f10697a, this);
        c3504b.m14082c(AbstractC3323F.f10698b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c3504b.m14082c(AbstractC3323F.f10699c, extras);
        }
        return c3504b;
    }

    @Override // p372x.InterfaceC6938d
    /* renamed from: e */
    public final void mo9940e(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11688t.remove(listener);
    }

    @Override // p372x.InterfaceC6938d
    /* renamed from: f */
    public final void mo9941f(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11688t.add(listener);
    }

    @Override // p365w.InterfaceC6798n
    /* renamed from: g */
    public final void mo9942g(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11691w.add(listener);
    }

    @Override // p191b.InterfaceC3502z
    /* renamed from: h */
    public final C3500x mo9943h() {
        return (C3500x) this.f11677B.getValue();
    }

    @Override // p207d.InterfaceC4096f
    /* renamed from: i */
    public final AbstractC4095e mo9944i() {
        return this.f11686r;
    }

    @Override // androidx.lifecycle.InterfaceC3333P
    /* renamed from: j */
    public C3332O mo9650j() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m14003N();
        C3332O c3332o = this.f11681f;
        AbstractC5469l.m23025b(c3332o);
        return c3332o;
    }

    @Override // p365w.InterfaceC6797m
    /* renamed from: k */
    public final void mo9945k(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11690v.add(listener);
    }

    @Override // p372x.InterfaceC6937c
    /* renamed from: l */
    public final void mo9946l(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11687s.remove(listener);
    }

    @Override // p049H.InterfaceC0518m
    /* renamed from: n */
    public void mo1972n(InterfaceC0521p provider) {
        AbstractC5469l.m23028e(provider, "provider");
        this.f11679d.m1973a(provider);
    }

    @Override // p365w.InterfaceC6798n
    /* renamed from: o */
    public final void mo9947o(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11691w.remove(listener);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f11686r.m17166d(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        mo9943h().m14061k();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5469l.m23028e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f11687s.iterator();
        while (it.hasNext()) {
            ((InterfaceC0339a) it.next()).accept(newConfig);
        }
    }

    @Override // p365w.AbstractActivityC6789e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f11680e.m94d(bundle);
        this.f11678c.m14384c(this);
        super.onCreate(bundle);
        FragmentC3361z.f10800b.m13001c(this);
        int i7 = this.f11684p;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        AbstractC5469l.m23028e(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        this.f11679d.m1974b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem item) {
        AbstractC5469l.m23028e(item, "item");
        if (super.onMenuItemSelected(i7, item)) {
            return true;
        }
        if (i7 == 0) {
            return this.f11679d.m1976d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.f11693y) {
            return;
        }
        Iterator it = this.f11690v.iterator();
        while (it.hasNext()) {
            ((InterfaceC0339a) it.next()).accept(new C6791g(z6));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC5469l.m23028e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f11689u.iterator();
        while (it.hasNext()) {
            ((InterfaceC0339a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        AbstractC5469l.m23028e(menu, "menu");
        this.f11679d.m1975c(menu);
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.f11694z) {
            return;
        }
        Iterator it = this.f11691w.iterator();
        while (it.hasNext()) {
            ((InterfaceC0339a) it.next()).accept(new C6800p(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        AbstractC5469l.m23028e(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        this.f11679d.m1977e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        AbstractC5469l.m23028e(permissions, "permissions");
        AbstractC5469l.m23028e(grantResults, "grantResults");
        if (this.f11686r.m17166d(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i7, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object m14007S = m14007S();
        C3332O c3332o = this.f11681f;
        if (c3332o == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            c3332o = dVar.m14009a();
        }
        if (c3332o == null && m14007S == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.m14010b(m14007S);
        dVar2.m14011c(c3332o);
        return dVar2;
    }

    @Override // p365w.AbstractActivityC6789e, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC5469l.m23028e(outState, "outState");
        if (mo9642a() instanceof C3350o) {
            AbstractC3345j mo9642a = mo9642a();
            AbstractC5469l.m23026c(mo9642a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C3350o) mo9642a).m12946m(AbstractC3345j.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f11680e.m95e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f11688t.iterator();
        while (it.hasNext()) {
            ((InterfaceC0339a) it.next()).accept(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f11692x.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // p372x.InterfaceC6937c
    /* renamed from: p */
    public final void mo9948p(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11687s.add(listener);
    }

    @Override // p365w.InterfaceC6797m
    /* renamed from: q */
    public final void mo9949q(InterfaceC0339a listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f11690v.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0181a.m734h()) {
                AbstractC0181a.m729c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m14004O().m14036b();
            AbstractC0181a.m732f();
        } catch (Throwable th) {
            AbstractC0181a.m732f();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        m14005P();
        e eVar = this.f11682n;
        View decorView = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView, "window.decorView");
        eVar.mo14013o(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7) {
        AbstractC5469l.m23028e(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i7, Intent intent2, int i8, int i9, int i10) {
        AbstractC5469l.m23028e(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i8, i9, i10);
    }

    @Override // p009B1.InterfaceC0034f
    /* renamed from: w */
    public final C0032d mo97w() {
        return this.f11680e.m92b();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        AbstractC5469l.m23028e(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i7, Intent intent2, int i8, int i9, int i10, Bundle bundle) {
        AbstractC5469l.m23028e(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6, Configuration newConfig) {
        AbstractC5469l.m23028e(newConfig, "newConfig");
        this.f11693y = true;
        try {
            super.onMultiWindowModeChanged(z6, newConfig);
            this.f11693y = false;
            Iterator it = this.f11690v.iterator();
            while (it.hasNext()) {
                ((InterfaceC0339a) it.next()).accept(new C6791g(z6, newConfig));
            }
        } catch (Throwable th) {
            this.f11693y = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6, Configuration newConfig) {
        AbstractC5469l.m23028e(newConfig, "newConfig");
        this.f11694z = true;
        try {
            super.onPictureInPictureModeChanged(z6, newConfig);
            this.f11694z = false;
            Iterator it = this.f11691w.iterator();
            while (it.hasNext()) {
                ((InterfaceC0339a) it.next()).accept(new C6800p(z6, newConfig));
            }
        } catch (Throwable th) {
            this.f11694z = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m14005P();
        e eVar = this.f11682n;
        View decorView = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView, "window.decorView");
        eVar.mo14013o(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m14005P();
        e eVar = this.f11682n;
        View decorView = getWindow().getDecorView();
        AbstractC5469l.m23027d(decorView, "window.decorView");
        eVar.mo14013o(decorView);
        super.setContentView(view, layoutParams);
    }
}
