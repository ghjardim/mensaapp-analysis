package p315p4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC3349n;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p040F4.AbstractC0337a;
import p061I4.C0652d;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.InterfaceC0651c;
import p125R5.AbstractC2294t;

/* renamed from: p4.d */
/* loaded from: classes.dex */
public final class C6137d implements C0659k.c, InterfaceC0191a, InterfaceC0298a {

    /* renamed from: k */
    public static final a f21909k = new a(null);

    /* renamed from: c */
    public InterfaceC0300c f21910c;

    /* renamed from: d */
    public C6136c f21911d;

    /* renamed from: e */
    public Application f21912e;

    /* renamed from: f */
    public InterfaceC0191a.b f21913f;

    /* renamed from: g */
    public AbstractC3345j f21914g;

    /* renamed from: h */
    public b f21915h;

    /* renamed from: i */
    public Activity f21916i;

    /* renamed from: j */
    public C0659k f21917j;

    /* renamed from: p4.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String m25566b(java.lang.String r2) {
            /*
                r1 = this;
                int r0 = r2.hashCode()
                switch(r0) {
                    case -1349088399: goto L4c;
                    case 96748: goto L43;
                    case 99469: goto L38;
                    case 93166550: goto L2c;
                    case 100313435: goto L20;
                    case 103772132: goto L14;
                    case 112202875: goto L8;
                    default: goto L7;
                }
            L7:
                goto L54
            L8:
                java.lang.String r0 = "video"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L11
                goto L54
            L11:
                java.lang.String r2 = "video/*"
                goto L58
            L14:
                java.lang.String r0 = "media"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L1d
                goto L54
            L1d:
                java.lang.String r2 = "image/*,video/*"
                goto L58
            L20:
                java.lang.String r0 = "image"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L29
                goto L54
            L29:
                java.lang.String r2 = "image/*"
                goto L58
            L2c:
                java.lang.String r0 = "audio"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L35
                goto L54
            L35:
                java.lang.String r2 = "audio/*"
                goto L58
            L38:
                java.lang.String r0 = "dir"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L41
                goto L54
            L41:
                r2 = r0
                goto L58
            L43:
                java.lang.String r0 = "any"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L56
                goto L54
            L4c:
                java.lang.String r0 = "custom"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L56
            L54:
                r2 = 0
                goto L58
            L56:
            */
            //  java.lang.String r2 = "*/*"
            /*
            L58:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p315p4.C6137d.a.m25566b(java.lang.String):java.lang.String");
        }

        public a() {
        }
    }

    /* renamed from: p4.d$b */
    public final class b implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: a */
        public final Activity f21918a;

        /* renamed from: b */
        public final /* synthetic */ C6137d f21919b;

        public b(C6137d c6137d, Activity thisActivity) {
            AbstractC5469l.m23028e(thisActivity, "thisActivity");
            this.f21919b = c6137d;
            this.f21918a = thisActivity;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: a */
        public void mo10166a(InterfaceC3349n owner) {
            AbstractC5469l.m23028e(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: c */
        public void mo10167c(InterfaceC3349n owner) {
            AbstractC5469l.m23028e(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: g */
        public void mo10168g(InterfaceC3349n owner) {
            AbstractC5469l.m23028e(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: h */
        public void mo10169h(InterfaceC3349n owner) {
            AbstractC5469l.m23028e(owner, "owner");
            onActivityStopped(this.f21918a);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: j */
        public void mo10170j(InterfaceC3349n owner) {
            AbstractC5469l.m23028e(owner, "owner");
            onActivityDestroyed(this.f21918a);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /* renamed from: m */
        public void mo10171m(InterfaceC3349n owner) {
            AbstractC5469l.m23028e(owner, "owner");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
            if (this.f21918a != activity || activity.getApplicationContext() == null) {
                return;
            }
            Context applicationContext = activity.getApplicationContext();
            AbstractC5469l.m23026c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            AbstractC5469l.m23028e(activity, "activity");
            AbstractC5469l.m23028e(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC5469l.m23028e(activity, "activity");
        }
    }

    /* renamed from: p4.d$c */
    public static final class c implements C0652d.d {

        /* renamed from: a */
        public final /* synthetic */ C6136c f21920a;

        public c(C6136c c6136c) {
            this.f21920a = c6136c;
        }

        @Override // p061I4.C0652d.d
        /* renamed from: a */
        public void mo2635a(Object obj) {
            this.f21920a.m25555t(null);
        }

        @Override // p061I4.C0652d.d
        /* renamed from: c */
        public void mo2636c(Object obj, C0652d.b bVar) {
            this.f21920a.m25555t(bVar);
        }
    }

    /* renamed from: c */
    private final void m25563c() {
        InterfaceC0300c interfaceC0300c;
        C6136c c6136c = this.f21911d;
        if (c6136c != null && (interfaceC0300c = this.f21910c) != null) {
            interfaceC0300c.mo1208k(c6136c);
        }
        this.f21910c = null;
        b bVar = this.f21915h;
        if (bVar != null) {
            AbstractC3345j abstractC3345j = this.f21914g;
            if (abstractC3345j != null) {
                abstractC3345j.mo12929c(bVar);
            }
            Application application = this.f21912e;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(bVar);
            }
        }
        this.f21914g = null;
        C6136c c6136c2 = this.f21911d;
        if (c6136c2 != null) {
            c6136c2.m25555t(null);
        }
        this.f21911d = null;
        C0659k c0659k = this.f21917j;
        if (c0659k != null) {
            c0659k.m2654e(null);
        }
        this.f21917j = null;
        this.f21912e = null;
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        this.f21913f = binding;
    }

    /* renamed from: a */
    public final void m25564a(InterfaceC0651c interfaceC0651c, Application application, Activity activity, InterfaceC0300c interfaceC0300c) {
        this.f21916i = activity;
        this.f21912e = application;
        this.f21911d = new C6136c(activity, null, 2, null);
        C0659k c0659k = new C0659k(interfaceC0651c, "miguelruivo.flutter.plugins.filepicker");
        this.f21917j = c0659k;
        c0659k.m2654e(this);
        C6136c c6136c = this.f21911d;
        if (c6136c != null) {
            new C0652d(interfaceC0651c, "miguelruivo.flutter.plugins.filepickerevent").m2628d(new c(c6136c));
            this.f21915h = new b(this, activity);
            interfaceC0300c.mo1209l(c6136c);
            AbstractC3345j m1342a = AbstractC0337a.m1342a(interfaceC0300c);
            this.f21914g = m1342a;
            b bVar = this.f21915h;
            if (bVar == null || m1342a == null) {
                return;
            }
            m1342a.mo12927a(bVar);
        }
    }

    @Override // p061I4.C0659k.c
    /* renamed from: b */
    public void mo2185b(C0658j call, C0659k.d rawResult) {
        Context applicationContext;
        AbstractC5469l.m23028e(call, "call");
        AbstractC5469l.m23028e(rawResult, "rawResult");
        if (this.f21916i == null) {
            rawResult.mo2315b("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        C6143j c6143j = new C6143j(rawResult);
        Object obj = call.f2255b;
        HashMap hashMap = obj instanceof HashMap ? (HashMap) obj : null;
        String str = call.f2254a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1349088399) {
                if (hashCode != 3522941) {
                    if (hashCode == 94746189 && str.equals("clear")) {
                        Activity activity = this.f21916i;
                        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
                            r1 = Boolean.valueOf(C6139f.m25572f(applicationContext));
                        }
                        c6143j.mo2314a(r1);
                        return;
                    }
                } else if (str.equals("save")) {
                    a aVar = f21909k;
                    Object obj2 = hashMap != null ? hashMap.get("fileType") : null;
                    AbstractC5469l.m23026c(obj2, "null cannot be cast to non-null type kotlin.String");
                    String m25566b = aVar.m25566b((String) obj2);
                    String str2 = (String) (hashMap != null ? hashMap.get("initialDirectory") : null);
                    byte[] bArr = (byte[]) (hashMap != null ? hashMap.get("bytes") : null);
                    String valueOf = String.valueOf(hashMap != null ? hashMap.get("fileName") : null);
                    if (valueOf.length() > 0 && !AbstractC2294t.m7746A(valueOf, ".", false, 2, null)) {
                        valueOf = valueOf + '.' + C6139f.f21921a.m25587l(bArr);
                    }
                    String str3 = valueOf;
                    C6136c c6136c = this.f21911d;
                    if (c6136c != null) {
                        C6139f.f21921a.m25578A(c6136c, str3, m25566b, str2, bArr, c6143j);
                        return;
                    }
                    return;
                }
            } else if (str.equals("custom")) {
                C6139f c6139f = C6139f.f21921a;
                ArrayList m25589p = c6139f.m25589p((ArrayList) (hashMap != null ? hashMap.get("allowedExtensions") : null));
                if (m25589p == null || m25589p.isEmpty()) {
                    c6143j.mo2315b("FilePicker", "Unsupported filter. Ensure using extension without dot (e.g., jpg, not .jpg).", null);
                    return;
                }
                C6136c c6136c2 = this.f21911d;
                if (c6136c2 != null) {
                    c6139f.m25580C(c6136c2, f21909k.m25566b(str), (Boolean) (hashMap != null ? hashMap.get("allowMultipleSelection") : null), (Boolean) (hashMap != null ? hashMap.get("withData") : null), m25589p, (Integer) (hashMap != null ? hashMap.get("compressionQuality") : null), c6143j);
                    return;
                }
                return;
            }
        }
        a aVar2 = f21909k;
        AbstractC5469l.m23025b(str);
        String m25566b2 = aVar2.m25566b(str);
        if (m25566b2 == null) {
            c6143j.mo2316c();
            return;
        }
        C6136c c6136c3 = this.f21911d;
        if (c6136c3 != null) {
            C6139f c6139f2 = C6139f.f21921a;
            c6139f2.m25580C(c6136c3, m25566b2, (Boolean) (hashMap != null ? hashMap.get("allowMultipleSelection") : null), (Boolean) (hashMap != null ? hashMap.get("withData") : null), c6139f2.m25589p((ArrayList) (hashMap != null ? hashMap.get("allowedExtensions") : null)), (Integer) (hashMap != null ? hashMap.get("compressionQuality") : null), c6143j);
        }
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c binding) {
        AbstractC5469l.m23028e(binding, "binding");
        mo1192n(binding);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        mo1193o();
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c binding) {
        AbstractC5469l.m23028e(binding, "binding");
        this.f21910c = binding;
        InterfaceC0191a.b bVar = this.f21913f;
        if (bVar != null) {
            InterfaceC0651c m786b = bVar.m786b();
            AbstractC5469l.m23027d(m786b, "getBinaryMessenger(...)");
            Context m785a = bVar.m785a();
            AbstractC5469l.m23026c(m785a, "null cannot be cast to non-null type android.app.Application");
            InterfaceC0300c interfaceC0300c = this.f21910c;
            AbstractC5469l.m23025b(interfaceC0300c);
            Activity mo1204g = interfaceC0300c.mo1204g();
            AbstractC5469l.m23027d(mo1204g, "getActivity(...)");
            InterfaceC0300c interfaceC0300c2 = this.f21910c;
            AbstractC5469l.m23025b(interfaceC0300c2);
            m25564a(m786b, (Application) m785a, mo1204g, interfaceC0300c2);
        }
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        m25563c();
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        this.f21913f = null;
    }
}
