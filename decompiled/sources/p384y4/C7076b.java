package p384y4;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import io.flutter.embedding.engine.C4659a;
import io.flutter.embedding.engine.C4660b;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p012B4.C0055f;
import p026D4.InterfaceC0191a;
import p026D4.InterfaceC0192b;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0299b;
import p033E4.InterfaceC0300c;
import p061I4.InterfaceC0661m;
import p061I4.InterfaceC0662n;
import p061I4.InterfaceC0663o;
import p207d.AbstractC4094d;
import p221e5.C4203f;
import p370w4.AbstractC6917b;
import p377x4.InterfaceC6978d;

/* renamed from: y4.b */
/* loaded from: classes.dex */
public class C7076b implements InterfaceC0192b, InterfaceC0299b {

    /* renamed from: b */
    public final C4659a f25152b;

    /* renamed from: c */
    public final InterfaceC0191a.b f25153c;

    /* renamed from: e */
    public InterfaceC6978d f25155e;

    /* renamed from: f */
    public c f25156f;

    /* renamed from: i */
    public Service f25159i;

    /* renamed from: k */
    public BroadcastReceiver f25161k;

    /* renamed from: m */
    public ContentProvider f25163m;

    /* renamed from: a */
    public final Map f25151a = new HashMap();

    /* renamed from: d */
    public final Map f25154d = new HashMap();

    /* renamed from: g */
    public boolean f25157g = false;

    /* renamed from: h */
    public final Map f25158h = new HashMap();

    /* renamed from: j */
    public final Map f25160j = new HashMap();

    /* renamed from: l */
    public final Map f25162l = new HashMap();

    /* renamed from: y4.b$b */
    public static class b implements InterfaceC0191a.a {

        /* renamed from: a */
        public final C0055f f25164a;

        @Override // p026D4.InterfaceC0191a.a
        /* renamed from: a */
        public String mo784a(String str) {
            return this.f25164a.m137l(str);
        }

        public b(C0055f c0055f) {
            this.f25164a = c0055f;
        }
    }

    /* renamed from: y4.b$c */
    public static class c implements InterfaceC0300c {

        /* renamed from: a */
        public final Activity f25165a;

        /* renamed from: b */
        public final HiddenLifecycleReference f25166b;

        /* renamed from: c */
        public final Set f25167c = new HashSet();

        /* renamed from: d */
        public final Set f25168d = new HashSet();

        /* renamed from: e */
        public final Set f25169e = new HashSet();

        /* renamed from: f */
        public final Set f25170f = new HashSet();

        /* renamed from: g */
        public final Set f25171g = new HashSet();

        /* renamed from: h */
        public final Set f25172h = new HashSet();

        public c(Activity activity, AbstractC3345j abstractC3345j) {
            this.f25165a = activity;
            this.f25166b = new HiddenLifecycleReference(abstractC3345j);
        }

        @Override // p033E4.InterfaceC0300c
        /* renamed from: a */
        public Object mo1203a() {
            return this.f25166b;
        }

        /* renamed from: b */
        public boolean m29168b(int i7, int i8, Intent intent) {
            Iterator it = new HashSet(this.f25168d).iterator();
            while (true) {
                boolean z6 = false;
                while (it.hasNext()) {
                    if (((InterfaceC0661m) it.next()).mo2655a(i7, i8, intent) || z6) {
                        z6 = true;
                    }
                }
                return z6;
            }
        }

        /* renamed from: c */
        public void m29169c(Intent intent) {
            Iterator it = this.f25169e.iterator();
            while (it.hasNext()) {
                ((InterfaceC0662n) it.next()).mo2656c(intent);
            }
        }

        /* renamed from: d */
        public boolean m29170d(int i7, String[] strArr, int[] iArr) {
            Iterator it = this.f25167c.iterator();
            while (true) {
                boolean z6 = false;
                while (it.hasNext()) {
                    if (((InterfaceC0663o) it.next()).mo2657b(i7, strArr, iArr) || z6) {
                        z6 = true;
                    }
                }
                return z6;
            }
        }

        /* renamed from: e */
        public void m29171e(Bundle bundle) {
            Iterator it = this.f25172h.iterator();
            if (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                throw null;
            }
        }

        /* renamed from: f */
        public void m29172f(Bundle bundle) {
            Iterator it = this.f25172h.iterator();
            if (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                throw null;
            }
        }

        @Override // p033E4.InterfaceC0300c
        /* renamed from: g */
        public Activity mo1204g() {
            return this.f25165a;
        }

        @Override // p033E4.InterfaceC0300c
        /* renamed from: h */
        public void mo1205h(InterfaceC0663o interfaceC0663o) {
            this.f25167c.remove(interfaceC0663o);
        }

        @Override // p033E4.InterfaceC0300c
        /* renamed from: i */
        public void mo1206i(InterfaceC0662n interfaceC0662n) {
            this.f25169e.add(interfaceC0662n);
        }

        @Override // p033E4.InterfaceC0300c
        /* renamed from: j */
        public void mo1207j(InterfaceC0663o interfaceC0663o) {
            this.f25167c.add(interfaceC0663o);
        }

        @Override // p033E4.InterfaceC0300c
        /* renamed from: k */
        public void mo1208k(InterfaceC0661m interfaceC0661m) {
            this.f25168d.remove(interfaceC0661m);
        }

        @Override // p033E4.InterfaceC0300c
        /* renamed from: l */
        public void mo1209l(InterfaceC0661m interfaceC0661m) {
            this.f25168d.add(interfaceC0661m);
        }

        /* renamed from: m */
        public void m29173m() {
            Iterator it = this.f25170f.iterator();
            if (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                throw null;
            }
        }
    }

    public C7076b(Context context, C4659a c4659a, C0055f c0055f, C4660b c4660b) {
        this.f25152b = c4659a;
        this.f25153c = new InterfaceC0191a.b(context, c4659a, c4659a.m20207l(), c4659a.m20217v(), c4659a.m20213r().m20609W(), new b(c0055f), c4660b);
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: a */
    public boolean mo1194a(int i7, int i8, Intent intent) {
        if (!m29161s()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean m29168b = this.f25156f.m29168b(i7, i8, intent);
            if (m17621j != null) {
                m17621j.close();
            }
            return m29168b;
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: b */
    public boolean mo1195b(int i7, String[] strArr, int[] iArr) {
        if (!m29161s()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean m29170d = this.f25156f.m29170d(i7, strArr, iArr);
            if (m17621j != null) {
                m17621j.close();
            }
            return m29170d;
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: c */
    public void mo1196c(Intent intent) {
        if (!m29161s()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f25156f.m29169c(intent);
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: d */
    public void mo1197d(InterfaceC6978d interfaceC6978d, AbstractC3345j abstractC3345j) {
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            InterfaceC6978d interfaceC6978d2 = this.f25155e;
            if (interfaceC6978d2 != null) {
                interfaceC6978d2.mo28595d();
            }
            m29156n();
            this.f25155e = interfaceC6978d;
            m29153k((Activity) interfaceC6978d.mo28596e(), abstractC3345j);
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: e */
    public void mo1198e(Bundle bundle) {
        if (!m29161s()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f25156f.m29171e(bundle);
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: f */
    public void mo1199f() {
        if (!m29161s()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f25154d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0298a) it.next()).mo1193o();
            }
            m29155m();
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: g */
    public void mo1200g(Bundle bundle) {
        if (!m29161s()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f25156f.m29172f(bundle);
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: h */
    public void mo1201h() {
        if (!m29161s()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f25156f.m29173m();
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p026D4.InterfaceC0192b
    /* renamed from: i */
    public void mo790i(InterfaceC0191a interfaceC0191a) {
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#add " + interfaceC0191a.getClass().getSimpleName());
        try {
            if (m29160r(interfaceC0191a.getClass())) {
                AbstractC6917b.m28359g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0191a + ") but it was already registered with this FlutterEngine (" + this.f25152b + ").");
                if (m17621j != null) {
                    m17621j.close();
                    return;
                }
                return;
            }
            AbstractC6917b.m28358f("FlutterEngineCxnRegstry", "Adding plugin: " + interfaceC0191a);
            this.f25151a.put(interfaceC0191a.getClass(), interfaceC0191a);
            interfaceC0191a.mo782C(this.f25153c);
            if (interfaceC0191a instanceof InterfaceC0298a) {
                InterfaceC0298a interfaceC0298a = (InterfaceC0298a) interfaceC0191a;
                this.f25154d.put(interfaceC0191a.getClass(), interfaceC0298a);
                if (m29161s()) {
                    interfaceC0298a.mo1192n(this.f25156f);
                }
            }
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p033E4.InterfaceC0299b
    /* renamed from: j */
    public void mo1202j() {
        if (!m29161s()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f25157g = true;
            Iterator it = this.f25154d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0298a) it.next()).mo1191j();
            }
            m29155m();
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final void m29153k(Activity activity, AbstractC3345j abstractC3345j) {
        this.f25156f = new c(activity, abstractC3345j);
        this.f25152b.m20213r().m20626t0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f25152b.m20213r().m20590C(activity, this.f25152b.m20217v(), this.f25152b.m20207l());
        this.f25152b.m20214s().m20449k(activity, this.f25152b.m20207l());
        for (InterfaceC0298a interfaceC0298a : this.f25154d.values()) {
            if (this.f25157g) {
                interfaceC0298a.mo1190i(this.f25156f);
            } else {
                interfaceC0298a.mo1192n(this.f25156f);
            }
        }
        this.f25157g = false;
    }

    /* renamed from: l */
    public void m29154l() {
        AbstractC6917b.m28358f("FlutterEngineCxnRegstry", "Destroying.");
        m29156n();
        m29167y();
    }

    /* renamed from: m */
    public final void m29155m() {
        this.f25152b.m20213r().m20602O();
        this.f25152b.m20214s().m20457s();
        this.f25155e = null;
        this.f25156f = null;
    }

    /* renamed from: n */
    public final void m29156n() {
        if (m29161s()) {
            mo1199f();
            return;
        }
        if (m29164v()) {
            m29159q();
        } else if (m29162t()) {
            m29157o();
        } else if (m29163u()) {
            m29158p();
        }
    }

    /* renamed from: o */
    public void m29157o() {
        if (!m29162t()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator it = this.f25160j.values().iterator();
            if (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                throw null;
            }
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: p */
    public void m29158p() {
        if (!m29163u()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator it = this.f25162l.values().iterator();
            if (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                throw null;
            }
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: q */
    public void m29159q() {
        if (!m29164v()) {
            AbstractC6917b.m28354b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator it = this.f25158h.values().iterator();
            if (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                throw null;
            }
            this.f25159i = null;
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: r */
    public boolean m29160r(Class cls) {
        return this.f25151a.containsKey(cls);
    }

    /* renamed from: s */
    public final boolean m29161s() {
        return this.f25155e != null;
    }

    /* renamed from: t */
    public final boolean m29162t() {
        return this.f25161k != null;
    }

    /* renamed from: u */
    public final boolean m29163u() {
        return this.f25163m != null;
    }

    /* renamed from: v */
    public final boolean m29164v() {
        return this.f25159i != null;
    }

    /* renamed from: w */
    public void m29165w(Class cls) {
        InterfaceC0191a interfaceC0191a = (InterfaceC0191a) this.f25151a.get(cls);
        if (interfaceC0191a == null) {
            return;
        }
        C4203f m17621j = C4203f.m17621j("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (interfaceC0191a instanceof InterfaceC0298a) {
                if (m29161s()) {
                    ((InterfaceC0298a) interfaceC0191a).mo1193o();
                }
                this.f25154d.remove(cls);
            }
            interfaceC0191a.mo783y(this.f25153c);
            this.f25151a.remove(cls);
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: x */
    public void m29166x(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m29165w((Class) it.next());
        }
    }

    /* renamed from: y */
    public void m29167y() {
        m29166x(new HashSet(this.f25151a.keySet()));
        this.f25151a.clear();
    }
}
