package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.FragmentC3361z;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public final class C3359x implements InterfaceC3349n {

    /* renamed from: p */
    public static final b f10786p = new b(null);

    /* renamed from: q */
    public static final C3359x f10787q = new C3359x();

    /* renamed from: a */
    public int f10788a;

    /* renamed from: b */
    public int f10789b;

    /* renamed from: e */
    public Handler f10792e;

    /* renamed from: c */
    public boolean f10790c = true;

    /* renamed from: d */
    public boolean f10791d = true;

    /* renamed from: f */
    public final C3350o f10793f = new C3350o(this);

    /* renamed from: n */
    public final Runnable f10794n = new Runnable() { // from class: androidx.lifecycle.w
        @Override // java.lang.Runnable
        public final void run() {
            C3359x.m12979k(C3359x.this);
        }
    };

    /* renamed from: o */
    public final FragmentC3361z.a f10795o = new d();

    /* renamed from: androidx.lifecycle.x$a */
    public static final class a {

        /* renamed from: a */
        public static final a f10796a = new a();

        /* renamed from: a */
        public static final void m12988a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            AbstractC5469l.m23028e(activity, "activity");
            AbstractC5469l.m23028e(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* renamed from: androidx.lifecycle.x$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC3349n m12989a() {
            return C3359x.f10787q;
        }

        /* renamed from: b */
        public final void m12990b(Context context) {
            AbstractC5469l.m23028e(context, "context");
            C3359x.f10787q.m12985j(context);
        }

        public b() {
        }
    }

    /* renamed from: androidx.lifecycle.x$c */
    public static final class c extends AbstractC3341f {

        /* renamed from: androidx.lifecycle.x$c$a */
        public static final class a extends AbstractC3341f {
            final /* synthetic */ C3359x this$0;

            public a(C3359x c3359x) {
                this.this$0 = c3359x;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                AbstractC5469l.m23028e(activity, "activity");
                this.this$0.m12982f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                AbstractC5469l.m23028e(activity, "activity");
                this.this$0.m12983g();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.AbstractC3341f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC5469l.m23028e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC3361z.f10800b.m13000b(activity).m12998e(C3359x.this.f10795o);
            }
        }

        @Override // androidx.lifecycle.AbstractC3341f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            C3359x.this.m12981e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            AbstractC5469l.m23028e(activity, "activity");
            a.m12988a(activity, new a(C3359x.this));
        }

        @Override // androidx.lifecycle.AbstractC3341f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            C3359x.this.m12984i();
        }
    }

    /* renamed from: androidx.lifecycle.x$d */
    public static final class d implements FragmentC3361z.a {
        public d() {
        }

        @Override // androidx.lifecycle.FragmentC3361z.a
        /* renamed from: a */
        public void mo12991a() {
        }

        @Override // androidx.lifecycle.FragmentC3361z.a
        /* renamed from: b */
        public void mo12992b() {
            C3359x.this.m12982f();
        }

        @Override // androidx.lifecycle.FragmentC3361z.a
        /* renamed from: c */
        public void mo12993c() {
            C3359x.this.m12983g();
        }
    }

    /* renamed from: k */
    public static final void m12979k(C3359x this$0) {
        AbstractC5469l.m23028e(this$0, "this$0");
        this$0.m12986l();
        this$0.m12987m();
    }

    /* renamed from: n */
    public static final InterfaceC3349n m12980n() {
        return f10786p.m12989a();
    }

    @Override // androidx.lifecycle.InterfaceC3349n
    /* renamed from: a */
    public AbstractC3345j mo9642a() {
        return this.f10793f;
    }

    /* renamed from: e */
    public final void m12981e() {
        int i7 = this.f10789b - 1;
        this.f10789b = i7;
        if (i7 == 0) {
            Handler handler = this.f10792e;
            AbstractC5469l.m23025b(handler);
            handler.postDelayed(this.f10794n, 700L);
        }
    }

    /* renamed from: f */
    public final void m12982f() {
        int i7 = this.f10789b + 1;
        this.f10789b = i7;
        if (i7 == 1) {
            if (this.f10790c) {
                this.f10793f.m12941h(AbstractC3345j.a.ON_RESUME);
                this.f10790c = false;
            } else {
                Handler handler = this.f10792e;
                AbstractC5469l.m23025b(handler);
                handler.removeCallbacks(this.f10794n);
            }
        }
    }

    /* renamed from: g */
    public final void m12983g() {
        int i7 = this.f10788a + 1;
        this.f10788a = i7;
        if (i7 == 1 && this.f10791d) {
            this.f10793f.m12941h(AbstractC3345j.a.ON_START);
            this.f10791d = false;
        }
    }

    /* renamed from: i */
    public final void m12984i() {
        this.f10788a--;
        m12987m();
    }

    /* renamed from: j */
    public final void m12985j(Context context) {
        AbstractC5469l.m23028e(context, "context");
        this.f10792e = new Handler();
        this.f10793f.m12941h(AbstractC3345j.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        AbstractC5469l.m23026c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* renamed from: l */
    public final void m12986l() {
        if (this.f10789b == 0) {
            this.f10790c = true;
            this.f10793f.m12941h(AbstractC3345j.a.ON_PAUSE);
        }
    }

    /* renamed from: m */
    public final void m12987m() {
        if (this.f10788a == 0 && this.f10790c) {
            this.f10793f.m12941h(AbstractC3345j.a.ON_STOP);
            this.f10791d = true;
        }
    }
}
