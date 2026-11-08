package p096N4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import p026D4.InterfaceC0191a;
import p061I4.C0652d;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.InterfaceC0651c;
import p219e3.C4176f;
import p256j$.util.Objects;
import p262j3.AbstractC5367c;
import p262j3.AbstractC5369e;

/* renamed from: N4.i */
/* loaded from: classes2.dex */
public class C1286i implements FlutterFirebasePlugin, InterfaceC0191a, C0659k.c {

    /* renamed from: c */
    public final Map f4033c = new HashMap();

    /* renamed from: d */
    public final String f4034d = "debug";

    /* renamed from: e */
    public final String f4035e = "safetyNet";

    /* renamed from: f */
    public final String f4036f = "playIntegrity";

    /* renamed from: g */
    public InterfaceC0651c f4037g;

    /* renamed from: h */
    public C0659k f4038h;

    /* renamed from: l */
    private Map m4884l(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        if (exc != null) {
            hashMap.put("message", exc.getMessage());
        } else {
            hashMap.put("message", "An unknown error has occurred.");
        }
        return hashMap;
    }

    /* renamed from: q */
    public static /* synthetic */ void m4885q(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m4886s(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: A */
    public final Task m4887A(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: N4.h
            @Override // java.lang.Runnable
            public final void run() {
                C1286i.this.m4898w(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        m4892o(bVar.m786b());
    }

    @Override // p061I4.C0659k.c
    /* renamed from: b */
    public void mo2185b(C0658j c0658j, final C0659k.d dVar) {
        Task m4890m;
        String str = c0658j.f2254a;
        str.hashCode();
        switch (str) {
            case "FirebaseAppCheck#getLimitedUseAppCheckToken":
                m4890m = m4890m((Map) c0658j.m2648b());
                break;
            case "FirebaseAppCheck#setTokenAutoRefreshEnabled":
                m4890m = m4887A((Map) c0658j.m2648b());
                break;
            case "FirebaseAppCheck#registerTokenListener":
                m4890m = m4899x((Map) c0658j.m2648b());
                break;
            case "FirebaseAppCheck#getToken":
                m4890m = m4891n((Map) c0658j.m2648b());
                break;
            case "FirebaseAppCheck#activate":
                m4890m = m4888j((Map) c0658j.m2648b());
                break;
            default:
                dVar.mo2316c();
                return;
        }
        m4890m.addOnCompleteListener(new OnCompleteListener() { // from class: N4.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1286i.this.m4896u(dVar, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: N4.a
            @Override // java.lang.Runnable
            public final void run() {
                C1286i.m4885q(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(C4176f c4176f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: N4.b
            @Override // java.lang.Runnable
            public final void run() {
                C1286i.m4886s(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: j */
    public final Task m4888j(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: N4.g
            @Override // java.lang.Runnable
            public final void run() {
                C1286i.this.m4893p(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: k */
    public final AbstractC5369e m4889k(Map map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return AbstractC5369e.m22075f(C4176f.m17518p((String) obj));
    }

    /* renamed from: m */
    public final Task m4890m(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: N4.e
            @Override // java.lang.Runnable
            public final void run() {
                C1286i.this.m4894r(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: n */
    public final Task m4891n(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: N4.f
            @Override // java.lang.Runnable
            public final void run() {
                C1286i.this.m4895t(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public final void m4892o(InterfaceC0651c interfaceC0651c) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_app_check", this);
        C0659k c0659k = new C0659k(interfaceC0651c, "plugins.flutter.io/firebase_app_check");
        this.f4038h = c0659k;
        c0659k.m2654e(this);
        this.f4037g = interfaceC0651c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:2:0x0000, B:14:0x006c, B:18:0x0049, B:19:0x0055, B:20:0x0061, B:21:0x0021, B:24:0x002d, B:27:0x0037), top: B:1:0x0000 }] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void m4893p(java.util.Map r6, com.google.android.gms.tasks.TaskCompletionSource r7) {
        /*
            r5 = this;
            java.lang.String r0 = "androidProvider"
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Exception -> L2b
            p256j$.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L2b
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L2b
            r2 = -1111504533(0xffffffffbdbfc96b, float:-0.09364589)
            r3 = 1
            r4 = 2
            if (r1 == r2) goto L37
            r2 = 95458899(0x5b09653, float:1.6606181E-35)
            if (r1 == r2) goto L2d
            r2 = 242544249(0xe74ee79, float:3.0190142E-30)
            if (r1 == r2) goto L21
            goto L41
        L21:
            java.lang.String r1 = "playIntegrity"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L41
            r0 = r4
            goto L42
        L2b:
            r6 = move-exception
            goto L71
        L2d:
            java.lang.String r1 = "debug"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L41
            r0 = 0
            goto L42
        L37:
            java.lang.String r1 = "safetyNet"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L41
            r0 = r3
            goto L42
        L41:
            r0 = -1
        L42:
            if (r0 == 0) goto L61
            if (r0 == r3) goto L55
            if (r0 == r4) goto L49
            goto L6c
        L49:
            j3.e r6 = r5.m4889k(r6)     // Catch: java.lang.Exception -> L2b
            p3.b r0 = p314p3.C6133b.m25529b()     // Catch: java.lang.Exception -> L2b
            r6.mo22079h(r0)     // Catch: java.lang.Exception -> L2b
            goto L6c
        L55:
            j3.e r6 = r5.m4889k(r6)     // Catch: java.lang.Exception -> L2b
            r3.b r0 = p330r3.C6294b.m26329b()     // Catch: java.lang.Exception -> L2b
            r6.mo22079h(r0)     // Catch: java.lang.Exception -> L2b
            goto L6c
        L61:
            j3.e r6 = r5.m4889k(r6)     // Catch: java.lang.Exception -> L2b
            k3.a r0 = p271k3.C5407a.m22376b()     // Catch: java.lang.Exception -> L2b
            r6.mo22079h(r0)     // Catch: java.lang.Exception -> L2b
        L6c:
            r6 = 0
            r7.setResult(r6)     // Catch: java.lang.Exception -> L2b
            goto L74
        L71:
            r7.setException(r6)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096N4.C1286i.m4893p(java.util.Map, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* renamed from: r */
    public final /* synthetic */ void m4894r(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(((AbstractC5367c) Tasks.await(m4889k(map).mo22078g())).mo22072b());
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: t */
    public final /* synthetic */ void m4895t(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            AbstractC5369e m4889k = m4889k(map);
            Object obj = map.get("forceRefresh");
            Objects.requireNonNull(obj);
            taskCompletionSource.setResult(((AbstractC5367c) Tasks.await(m4889k.mo22077e(((Boolean) obj).booleanValue()))).mo22072b());
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void m4896u(C0659k.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.mo2314a(task.getResult());
        } else {
            Exception exception = task.getException();
            dVar.mo2315b("firebase_app_check", exception != null ? exception.getMessage() : null, m4884l(exception));
        }
    }

    /* renamed from: v */
    public final /* synthetic */ void m4897v(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("appName");
            Objects.requireNonNull(obj);
            C1288k c1288k = new C1288k(m4889k(map));
            String str = "plugins.flutter.io/firebase_app_check/token/" + ((String) obj);
            C0652d c0652d = new C0652d(this.f4037g, str);
            c0652d.m2628d(c1288k);
            this.f4033c.put(c0652d, c1288k);
            taskCompletionSource.setResult(str);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: w */
    public final /* synthetic */ void m4898w(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            AbstractC5369e m4889k = m4889k(map);
            Object obj = map.get("isTokenAutoRefreshEnabled");
            Objects.requireNonNull(obj);
            m4889k.mo22081j(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: x */
    public final Task m4899x(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: N4.d
            @Override // java.lang.Runnable
            public final void run() {
                C1286i.this.m4897v(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        this.f4038h.m2654e(null);
        this.f4038h = null;
        this.f4037g = null;
        m4900z();
    }

    /* renamed from: z */
    public final void m4900z() {
        for (C0652d c0652d : this.f4033c.keySet()) {
            ((C0652d.d) this.f4033c.get(c0652d)).mo2635a(null);
            c0652d.m2628d(null);
        }
        this.f4033c.clear();
    }
}
