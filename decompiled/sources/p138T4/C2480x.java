package p138T4;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.AbstractC3353r;
import androidx.lifecycle.InterfaceC3356u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C3968d;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.HashMap;
import java.util.Map;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0662n;
import p138T4.C2448A;
import p219e3.C4176f;
import p256j$.util.Objects;
import p365w.C6796l;
import p384y4.C7084j;

/* renamed from: T4.x */
/* loaded from: classes2.dex */
public class C2480x implements FlutterFirebasePlugin, C0659k.c, InterfaceC0662n, InterfaceC0191a, InterfaceC0298a {

    /* renamed from: d */
    public C0659k f7294d;

    /* renamed from: e */
    public Activity f7295e;

    /* renamed from: g */
    public InterfaceC3356u f7297g;

    /* renamed from: i */
    public InterfaceC3356u f7299i;

    /* renamed from: j */
    public C3968d f7300j;

    /* renamed from: k */
    public Map f7301k;

    /* renamed from: l */
    public C2448A f7302l;

    /* renamed from: c */
    public final HashMap f7293c = new HashMap();

    /* renamed from: f */
    public final AbstractC3353r f7296f = C2449B.m8315o();

    /* renamed from: h */
    public final AbstractC3353r f7298h = C2450C.m8317o();

    /* renamed from: T4.x$a */
    public class a extends HashMap {

        /* renamed from: a */
        public final /* synthetic */ String f7303a;

        public a(String str) {
            this.f7303a = str;
            put("token", str);
        }
    }

    /* renamed from: T4.x$b */
    public class b extends HashMap {

        /* renamed from: a */
        public final /* synthetic */ FirebaseMessaging f7305a;

        public b(FirebaseMessaging firebaseMessaging) {
            this.f7305a = firebaseMessaging;
            put("isAutoInitEnabled", Boolean.valueOf(firebaseMessaging.m15709A()));
        }
    }

    /* renamed from: A */
    private Map m8345A(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        if (exc != null) {
            hashMap.put("message", exc.getMessage());
        } else {
            hashMap.put("message", "An unknown error has occurred.");
        }
        return hashMap;
    }

    /* renamed from: F */
    private void m8346F(InterfaceC0651c interfaceC0651c) {
        C0659k c0659k = new C0659k(interfaceC0651c, "plugins.flutter.io/firebase_messaging");
        this.f7294d = c0659k;
        c0659k.m2654e(this);
        this.f7302l = new C2448A();
        this.f7297g = new InterfaceC3356u() { // from class: T4.o
            @Override // androidx.lifecycle.InterfaceC3356u
            /* renamed from: a */
            public final void mo8344a(Object obj) {
                C2480x.this.m8379M((C3968d) obj);
            }
        };
        this.f7299i = new InterfaceC3356u() { // from class: T4.p
            @Override // androidx.lifecycle.InterfaceC3356u
            /* renamed from: a */
            public final void mo8344a(Object obj) {
                C2480x.this.m8380N((String) obj);
            }
        };
        this.f7296f.m12966i(this.f7297g);
        this.f7298h.m12966i(this.f7299i);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    /* renamed from: G */
    public static /* synthetic */ void m8347G(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(FirebaseMessaging.m15706r().m15731o());
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: K */
    public static /* synthetic */ void m8349K(C4176f c4176f, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            if (c4176f.m17533q().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.m15706r().m15709A()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: P */
    public static /* synthetic */ void m8350P(Map map, TaskCompletionSource taskCompletionSource, int i7) {
        map.put("authorizationStatus", Integer.valueOf(i7));
        taskCompletionSource.setResult(map);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m8351Q(TaskCompletionSource taskCompletionSource, String str) {
        taskCompletionSource.setException(new Exception(str));
    }

    /* renamed from: S */
    public static /* synthetic */ void m8352S(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            AbstractC2482z.m8402a(map).m15719N(AbstractC2482z.m8403b(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m8353U(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging m8402a = AbstractC2482z.m8402a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            m8402a.m15721P(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: V */
    public static /* synthetic */ void m8354V(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging m8402a = AbstractC2482z.m8402a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(m8402a.m15726U((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m8355W(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging m8402a = AbstractC2482z.m8402a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(m8402a.m15729X((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: B */
    public final Task m8373B() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.h
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.this.m8376I(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        AbstractC2457a.m8326b(bVar.m785a());
        m8346F(bVar.m786b());
    }

    /* renamed from: D */
    public final Task m8374D() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.w
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.this.m8377J(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: E */
    public final Task m8375E() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.u
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.this.m8378L(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: I */
    public final /* synthetic */ void m8376I(TaskCompletionSource taskCompletionSource) {
        Map map;
        try {
            C3968d c3968d = this.f7300j;
            if (c3968d != null) {
                Map m8407f = AbstractC2482z.m8407f(c3968d);
                Map map2 = this.f7301k;
                if (map2 != null) {
                    m8407f.put("notification", map2);
                }
                taskCompletionSource.setResult(m8407f);
                this.f7300j = null;
                this.f7301k = null;
                return;
            }
            Activity activity = this.f7295e;
            if (activity == null) {
                taskCompletionSource.setResult(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.f7293c.get(string) == null) {
                    C3968d c3968d2 = (C3968d) FlutterFirebaseMessagingReceiver.f17633a.get(string);
                    if (c3968d2 == null) {
                        Map m8394a = C2481y.m8393b().m8394a(string);
                        if (m8394a != null) {
                            c3968d2 = AbstractC2482z.m8403b(m8394a);
                            if (m8394a.get("notification") != null) {
                                map = m8389c0(m8394a.get("notification"));
                                C2481y.m8393b().m8399g(string);
                            }
                        }
                        map = null;
                        C2481y.m8393b().m8399g(string);
                    } else {
                        map = null;
                    }
                    if (c3968d2 == null) {
                        taskCompletionSource.setResult(null);
                        return;
                    }
                    this.f7293c.put(string, Boolean.TRUE);
                    Map m8407f2 = AbstractC2482z.m8407f(c3968d2);
                    if (c3968d2.m15820D0() == null && map != null) {
                        m8407f2.put("notification", map);
                    }
                    taskCompletionSource.setResult(m8407f2);
                    return;
                }
                taskCompletionSource.setResult(null);
                return;
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public final /* synthetic */ void m8377J(TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("authorizationStatus", Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? m8391x().booleanValue() : C6796l.m27948b(this.f7295e).m27949a()));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: L */
    public final /* synthetic */ void m8378L(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new a((String) Tasks.await(FirebaseMessaging.m15706r().m15735u())));
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: M */
    public final /* synthetic */ void m8379M(C3968d c3968d) {
        this.f7294d.m2652c("Messaging#onMessage", AbstractC2482z.m8407f(c3968d));
    }

    /* renamed from: N */
    public final /* synthetic */ void m8380N(String str) {
        this.f7294d.m2652c("Messaging#onTokenRefresh", str);
    }

    /* renamed from: O */
    public final /* synthetic */ void m8381O(C0659k.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.mo2314a(task.getResult());
        } else {
            Exception exception = task.getException();
            dVar.mo2315b("firebase_messaging", exception != null ? exception.getMessage() : null, m8345A(exception));
        }
    }

    /* renamed from: R */
    public final /* synthetic */ void m8382R(final TaskCompletionSource taskCompletionSource) {
        final HashMap hashMap = new HashMap();
        try {
            if (m8391x().booleanValue()) {
                hashMap.put("authorizationStatus", 1);
                taskCompletionSource.setResult(hashMap);
            } else {
                this.f7302l.m8313a(this.f7295e, new C2448A.a() { // from class: T4.m
                    @Override // p138T4.C2448A.a
                    /* renamed from: a */
                    public final void mo8314a(int i7) {
                        C2480x.m8350P(hashMap, taskCompletionSource, i7);
                    }
                }, new InterfaceC2458b() { // from class: T4.n
                    @Override // p138T4.InterfaceC2458b
                    /* renamed from: a */
                    public final void mo8327a(String str) {
                        C2480x.m8351Q(TaskCompletionSource.this, str);
                    }
                });
            }
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: T */
    public final /* synthetic */ void m8383T(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging m8402a = AbstractC2482z.m8402a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            m8402a.m15720O(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(new b(m8402a));
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: X */
    public final Task m8384X() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.s
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.this.m8382R(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: Y */
    public final Task m8385Y(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.t
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.m8352S(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: Z */
    public final Task m8386Z(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.k
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.this.m8383T(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: a0 */
    public final Task m8387a0(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.j
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.m8353U(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p061I4.C0659k.c
    /* renamed from: b */
    public void mo2185b(C0658j c0658j, final C0659k.d dVar) {
        Task m8373B;
        long intValue;
        long intValue2;
        String str = c0658j.f2254a;
        str.hashCode();
        switch (str) {
            case "Messaging#getInitialMessage":
                m8373B = m8373B();
                break;
            case "Messaging#setAutoInitEnabled":
                m8373B = m8386Z((Map) c0658j.m2648b());
                break;
            case "Messaging#deleteToken":
                m8373B = m8392z();
                break;
            case "Messaging#unsubscribeFromTopic":
                m8373B = m8390d0((Map) c0658j.m2648b());
                break;
            case "Messaging#subscribeToTopic":
                m8373B = m8388b0((Map) c0658j.m2648b());
                break;
            case "Messaging#setDeliveryMetricsExportToBigQuery":
                m8373B = m8387a0((Map) c0658j.m2648b());
                break;
            case "Messaging#startBackgroundIsolate":
                Map map = (Map) c0658j.f2255b;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    intValue = ((Long) obj).longValue();
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    intValue = ((Integer) obj).intValue();
                }
                if (obj2 instanceof Long) {
                    intValue2 = ((Long) obj2).longValue();
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    intValue2 = ((Integer) obj2).intValue();
                }
                Activity activity = this.f7295e;
                C7084j m29181a = activity != null ? C7084j.m29181a(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.m20641n(intValue);
                FlutterFirebaseMessagingBackgroundService.m20642o(intValue2);
                FlutterFirebaseMessagingBackgroundService.m20643p(intValue, m29181a);
                m8373B = Tasks.forResult(null);
                break;
            case "Messaging#sendMessage":
                m8373B = m8385Y((Map) c0658j.m2648b());
                break;
            case "Messaging#requestPermission":
                if (Build.VERSION.SDK_INT < 33) {
                    m8373B = m8374D();
                    break;
                } else {
                    m8373B = m8384X();
                    break;
                }
            case "Messaging#getNotificationSettings":
                m8373B = m8374D();
                break;
            case "Messaging#getToken":
                m8373B = m8375E();
                break;
            default:
                dVar.mo2316c();
                return;
        }
        m8373B.addOnCompleteListener(new OnCompleteListener() { // from class: T4.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2480x.this.m8381O(dVar, task);
            }
        });
    }

    /* renamed from: b0 */
    public final Task m8388b0(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.l
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.m8354V(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p061I4.InterfaceC0662n
    /* renamed from: c */
    public boolean mo2656c(Intent intent) {
        Map map;
        Map map2;
        Map m8394a;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        C3968d c3968d = (C3968d) FlutterFirebaseMessagingReceiver.f17633a.get(string);
        if (c3968d != null || (m8394a = C2481y.m8393b().m8394a(string)) == null) {
            map = null;
        } else {
            c3968d = AbstractC2482z.m8403b(m8394a);
            map = AbstractC2482z.m8404c(m8394a);
        }
        if (c3968d == null) {
            return false;
        }
        this.f7300j = c3968d;
        this.f7301k = map;
        FlutterFirebaseMessagingReceiver.f17633a.remove(string);
        Map m8407f = AbstractC2482z.m8407f(c3968d);
        if (c3968d.m15820D0() == null && (map2 = this.f7301k) != null) {
            m8407f.put("notification", map2);
        }
        this.f7294d.m2652c("Messaging#onMessageOpenedApp", m8407f);
        this.f7295e.setIntent(intent);
        return true;
    }

    /* renamed from: c0 */
    public final Map m8389c0(Object obj) {
        return (Map) obj;
    }

    /* renamed from: d0 */
    public final Task m8390d0(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.i
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.m8355W(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.q
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.setResult(null);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(final C4176f c4176f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.g
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.m8349K(C4176f.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c interfaceC0300c) {
        interfaceC0300c.mo1206i(this);
        this.f7295e = interfaceC0300c.mo1204g();
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        this.f7295e = null;
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c interfaceC0300c) {
        interfaceC0300c.mo1206i(this);
        interfaceC0300c.mo1207j(this.f7302l);
        Activity mo1204g = interfaceC0300c.mo1204g();
        this.f7295e = mo1204g;
        if (mo1204g.getIntent() == null || this.f7295e.getIntent().getExtras() == null || (this.f7295e.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        mo2656c(this.f7295e.getIntent());
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        this.f7295e = null;
    }

    /* renamed from: x */
    public final Boolean m8391x() {
        return Boolean.valueOf(AbstractC2457a.m8325a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        this.f7298h.mo12970m(this.f7299i);
        this.f7296f.mo12970m(this.f7297g);
    }

    /* renamed from: z */
    public final Task m8392z() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: T4.v
            @Override // java.lang.Runnable
            public final void run() {
                C2480x.m8347G(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }
}
