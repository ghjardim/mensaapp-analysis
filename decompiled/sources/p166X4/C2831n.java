package p166X4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC3349n;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p040F4.AbstractC0337a;
import p061I4.InterfaceC0651c;
import p166X4.AbstractC2834q;
import p166X4.C2829l;

/* renamed from: X4.n */
/* loaded from: classes2.dex */
public class C2831n implements InterfaceC0191a, InterfaceC0298a, AbstractC2834q.f {

    /* renamed from: c */
    public InterfaceC0191a.b f8742c;

    /* renamed from: d */
    public b f8743d;

    /* renamed from: X4.n$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8744a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f8745b;

        static {
            int[] iArr = new int[AbstractC2834q.m.values().length];
            f8745b = iArr;
            try {
                iArr[AbstractC2834q.m.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8745b[AbstractC2834q.m.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AbstractC2834q.k.values().length];
            f8744a = iArr2;
            try {
                iArr2[AbstractC2834q.k.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8744a[AbstractC2834q.k.REAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: X4.n$b */
    public class b {

        /* renamed from: a */
        public Application f8746a;

        /* renamed from: b */
        public Activity f8747b;

        /* renamed from: c */
        public C2829l f8748c;

        /* renamed from: d */
        public c f8749d;

        /* renamed from: e */
        public InterfaceC0300c f8750e;

        /* renamed from: f */
        public InterfaceC0651c f8751f;

        /* renamed from: g */
        public AbstractC3345j f8752g;

        public b(Application application, Activity activity, InterfaceC0651c interfaceC0651c, AbstractC2834q.f fVar, InterfaceC0300c interfaceC0300c) {
            this.f8746a = application;
            this.f8747b = activity;
            this.f8750e = interfaceC0300c;
            this.f8751f = interfaceC0651c;
            this.f8748c = C2831n.this.m10160e(activity);
            AbstractC2839v.m10245f(interfaceC0651c, fVar);
            this.f8749d = C2831n.this.new c(activity);
            interfaceC0300c.mo1209l(this.f8748c);
            interfaceC0300c.mo1207j(this.f8748c);
            AbstractC3345j m1342a = AbstractC0337a.m1342a(interfaceC0300c);
            this.f8752g = m1342a;
            m1342a.mo12927a(this.f8749d);
        }

        /* renamed from: a */
        public Activity m10163a() {
            return this.f8747b;
        }

        /* renamed from: b */
        public C2829l m10164b() {
            return this.f8748c;
        }

        /* renamed from: c */
        public void m10165c() {
            InterfaceC0300c interfaceC0300c = this.f8750e;
            if (interfaceC0300c != null) {
                interfaceC0300c.mo1208k(this.f8748c);
                this.f8750e.mo1205h(this.f8748c);
                this.f8750e = null;
            }
            AbstractC3345j abstractC3345j = this.f8752g;
            if (abstractC3345j != null) {
                abstractC3345j.mo12929c(this.f8749d);
                this.f8752g = null;
            }
            AbstractC2839v.m10245f(this.f8751f, null);
            Application application = this.f8746a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.f8749d);
                this.f8746a = null;
            }
            this.f8747b = null;
            this.f8749d = null;
            this.f8748c = null;
        }
    }

    /* renamed from: h */
    private void m10154h(InterfaceC0651c interfaceC0651c, Application application, Activity activity, InterfaceC0300c interfaceC0300c) {
        this.f8743d = new b(application, activity, interfaceC0651c, this, interfaceC0300c);
    }

    /* renamed from: k */
    private void m10155k() {
        b bVar = this.f8743d;
        if (bVar != null) {
            bVar.m10165c();
            this.f8743d = null;
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        this.f8742c = bVar;
    }

    @Override // p166X4.AbstractC2834q.f
    /* renamed from: a */
    public void mo10156a(AbstractC2834q.h hVar, AbstractC2834q.e eVar, AbstractC2834q.j jVar) {
        C2829l m10161f = m10161f();
        if (m10161f == null) {
            jVar.mo10227b(new AbstractC2834q.d("no_activity", "image_picker plugin requires a foreground activity.", null));
        } else {
            m10161f.m10132l(hVar, eVar, jVar);
        }
    }

    @Override // p166X4.AbstractC2834q.f
    /* renamed from: b */
    public AbstractC2834q.b mo10157b() {
        C2829l m10161f = m10161f();
        if (m10161f != null) {
            return m10161f.m10124V();
        }
        throw new AbstractC2834q.d("no_activity", "image_picker plugin requires a foreground activity.", null);
    }

    @Override // p166X4.AbstractC2834q.f
    /* renamed from: c */
    public void mo10158c(AbstractC2834q.l lVar, AbstractC2834q.g gVar, AbstractC2834q.e eVar, AbstractC2834q.j jVar) {
        C2829l m10161f = m10161f();
        if (m10161f == null) {
            jVar.mo10227b(new AbstractC2834q.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        m10162g(m10161f, lVar);
        if (eVar.m10207b().booleanValue()) {
            m10161f.m10133m(gVar, eVar.m10209d().booleanValue(), AbstractC2832o.m10172a(eVar), jVar);
            return;
        }
        int i7 = a.f8745b[lVar.m10231c().ordinal()];
        if (i7 == 1) {
            m10161f.m10131k(gVar, eVar.m10209d().booleanValue(), jVar);
        } else {
            if (i7 != 2) {
                return;
            }
            m10161f.m10128Z(gVar, jVar);
        }
    }

    @Override // p166X4.AbstractC2834q.f
    /* renamed from: d */
    public void mo10159d(AbstractC2834q.l lVar, AbstractC2834q.n nVar, AbstractC2834q.e eVar, AbstractC2834q.j jVar) {
        C2829l m10161f = m10161f();
        if (m10161f == null) {
            jVar.mo10227b(new AbstractC2834q.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        m10162g(m10161f, lVar);
        if (eVar.m10207b().booleanValue()) {
            jVar.mo10227b(new RuntimeException("Multi-video selection is not implemented"));
            return;
        }
        int i7 = a.f8745b[lVar.m10231c().ordinal()];
        if (i7 == 1) {
            m10161f.m10134n(nVar, eVar.m10209d().booleanValue(), jVar);
        } else {
            if (i7 != 2) {
                return;
            }
            m10161f.m10129a0(nVar, jVar);
        }
    }

    /* renamed from: e */
    public final C2829l m10160e(Activity activity) {
        return new C2829l(activity, new C2833p(activity, new C2818a()), new C2820c(activity));
    }

    /* renamed from: f */
    public final C2829l m10161f() {
        b bVar = this.f8743d;
        if (bVar == null || bVar.m10163a() == null) {
            return null;
        }
        return this.f8743d.m10164b();
    }

    /* renamed from: g */
    public final void m10162g(C2829l c2829l, AbstractC2834q.l lVar) {
        AbstractC2834q.k m10230b = lVar.m10230b();
        if (m10230b != null) {
            c2829l.m10126X(a.f8744a[m10230b.ordinal()] != 1 ? C2829l.c.REAR : C2829l.c.FRONT);
        }
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c interfaceC0300c) {
        mo1192n(interfaceC0300c);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        mo1193o();
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c interfaceC0300c) {
        m10154h(this.f8742c.m786b(), (Application) this.f8742c.m785a(), interfaceC0300c.mo1204g(), interfaceC0300c);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        m10155k();
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        this.f8742c = null;
    }

    /* renamed from: X4.n$c */
    public class c implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: a */
        public final Activity f8754a;

        public c(Activity activity) {
            this.f8754a = activity;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: h */
        public void mo10169h(InterfaceC3349n interfaceC3349n) {
            onActivityStopped(this.f8754a);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: j */
        public void mo10170j(InterfaceC3349n interfaceC3349n) {
            onActivityDestroyed(this.f8754a);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f8754a != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (this.f8754a == activity) {
                C2831n.this.f8743d.m10164b().m10125W();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: a */
        public void mo10166a(InterfaceC3349n interfaceC3349n) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: c */
        public void mo10167c(InterfaceC3349n interfaceC3349n) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: g */
        public void mo10168g(InterfaceC3349n interfaceC3349n) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: m */
        public void mo10171m(InterfaceC3349n interfaceC3349n) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
