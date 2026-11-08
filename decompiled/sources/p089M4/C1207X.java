package p089M4;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import p026D4.InterfaceC0191a;
import p061I4.C0659k;
import p061I4.InterfaceC0651c;
import p069J5.InterfaceC0800l;
import p089M4.InterfaceC1234y;
import p219e3.C4176f;
import p256j$.util.Objects;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;

/* renamed from: M4.X */
/* loaded from: classes2.dex */
public final class C1207X implements FlutterFirebasePlugin, InterfaceC0191a, InterfaceC1234y {

    /* renamed from: c */
    public FirebaseAnalytics f3866c;

    /* renamed from: d */
    public C0659k f3867d;

    /* renamed from: e */
    public InterfaceC0651c f3868e;

    /* renamed from: K */
    public static final void m4625K(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: L */
    public static final void m4626L(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4681i0(task, interfaceC0800l);
    }

    /* renamed from: M */
    public static final void m4627M(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap());
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: N */
    public static final void m4628N(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4681i0(task, interfaceC0800l);
    }

    /* renamed from: P */
    public static final void m4629P(TaskCompletionSource taskCompletionSource, C1207X c1207x) {
        try {
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            taskCompletionSource.setResult(Tasks.await(firebaseAnalytics.m15276a()));
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: R */
    public static final void m4630R(TaskCompletionSource taskCompletionSource, C1207X c1207x) {
        try {
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            taskCompletionSource.setResult(Tasks.await(firebaseAnalytics.m15277b()));
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: T */
    public static final void m4631T(Map map, C1207X c1207x, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("eventName");
            Objects.requireNonNull(obj);
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Bundle m4661J = c1207x.m4661J((Map) map.get("parameters"));
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.m15278c(str, m4661J);
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: V */
    public static final void m4632V(C1207X c1207x, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.m15279d();
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: X */
    public static final void m4633X(C1207X c1207x, boolean z6, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.m15280e(z6);
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: Z */
    public static final void m4634Z(Map map, C1207X c1207x, TaskCompletionSource taskCompletionSource) {
        try {
            Boolean bool = (Boolean) map.get("adStorageConsentGranted");
            Boolean bool2 = (Boolean) map.get("analyticsStorageConsentGranted");
            Boolean bool3 = (Boolean) map.get("adPersonalizationSignalsConsentGranted");
            Boolean bool4 = (Boolean) map.get("adUserDataConsentGranted");
            HashMap hashMap = new HashMap();
            if (bool != null) {
                hashMap.put(FirebaseAnalytics.EnumC3927b.AD_STORAGE, bool.booleanValue() ? FirebaseAnalytics.EnumC3926a.GRANTED : FirebaseAnalytics.EnumC3926a.DENIED);
            }
            if (bool2 != null) {
                hashMap.put(FirebaseAnalytics.EnumC3927b.ANALYTICS_STORAGE, bool2.booleanValue() ? FirebaseAnalytics.EnumC3926a.GRANTED : FirebaseAnalytics.EnumC3926a.DENIED);
            }
            if (bool3 != null) {
                hashMap.put(FirebaseAnalytics.EnumC3927b.AD_PERSONALIZATION, bool3.booleanValue() ? FirebaseAnalytics.EnumC3926a.GRANTED : FirebaseAnalytics.EnumC3926a.DENIED);
            }
            if (bool4 != null) {
                hashMap.put(FirebaseAnalytics.EnumC3927b.AD_USER_DATA, bool4.booleanValue() ? FirebaseAnalytics.EnumC3926a.GRANTED : FirebaseAnalytics.EnumC3926a.DENIED);
            }
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.m15281f(hashMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: b0 */
    public static final void m4635b0(C1207X c1207x, Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.m15282g(c1207x.m4661J(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: d0 */
    public static final void m4636d0(C1207X c1207x, long j7, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.m15283h(j7);
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: f0 */
    public static final void m4637f0(C1207X c1207x, String str, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.m15284i(str);
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: h0 */
    public static final void m4638h0(C1207X c1207x, String str, String str2, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = c1207x.f3866c;
            if (firebaseAnalytics == null) {
                AbstractC5469l.m23037n("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.m15285j(str, str2);
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: l0 */
    public static final void m4640l0(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4683j0(task, interfaceC0800l);
    }

    /* renamed from: m0 */
    public static final void m4642m0(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4683j0(task, interfaceC0800l);
    }

    /* renamed from: n0 */
    public static final void m4644n0(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4683j0(task, interfaceC0800l);
    }

    /* renamed from: o0 */
    public static final void m4646o0(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4683j0(task, interfaceC0800l);
    }

    /* renamed from: p0 */
    public static final void m4648p0(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4683j0(task, interfaceC0800l);
    }

    /* renamed from: q0 */
    public static final void m4650q0(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4683j0(task, interfaceC0800l);
    }

    /* renamed from: r0 */
    public static final void m4652r0(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4683j0(task, interfaceC0800l);
    }

    /* renamed from: s0 */
    public static final void m4654s0(C1207X c1207x, InterfaceC0800l interfaceC0800l, Task task) {
        AbstractC5469l.m23028e(task, "task");
        c1207x.m4683j0(task, interfaceC0800l);
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        InterfaceC0651c m786b = binding.m786b();
        AbstractC5469l.m23027d(m786b, "getBinaryMessenger(...)");
        Context m785a = binding.m785a();
        AbstractC5469l.m23027d(m785a, "getApplicationContext(...)");
        m4685k0(m786b, m785a);
    }

    /* renamed from: J */
    public final Bundle m4661J(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, null);
            } else if (value instanceof Iterable) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof Map) {
                        arrayList.add(m4661J((Map) obj));
                    } else if (obj != null) {
                        throw new IllegalArgumentException("Unsupported value type: " + obj.getClass().getCanonicalName() + " in list at key " + str);
                    }
                }
                bundle.putParcelableArrayList(str, arrayList);
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
                }
                bundle.putParcelable(str, m4661J((Map) value));
            }
        }
        return bundle;
    }

    /* renamed from: O */
    public final Task m4662O() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.J
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4629P(TaskCompletionSource.this, this);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    /* renamed from: Q */
    public final Task m4663Q() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.E
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4630R(TaskCompletionSource.this, this);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    /* renamed from: S */
    public final Task m4664S(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.I
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4631T(map, this, taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    /* renamed from: U */
    public final Task m4665U() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.M
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4632V(C1207X.this, taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    /* renamed from: W */
    public final Task m4666W(final boolean z6) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.D
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4633X(C1207X.this, z6, taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    /* renamed from: Y */
    public final Task m4667Y(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.H
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4634Z(map, this, taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: a */
    public void mo4668a(Map map, final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(callback, "callback");
        m4669a0(map).addOnCompleteListener(new OnCompleteListener() { // from class: M4.U
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4648p0(C1207X.this, callback, task);
            }
        });
    }

    /* renamed from: a0 */
    public final Task m4669a0(final Map map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.G
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4635b0(C1207X.this, map, taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: b */
    public void mo4670b(final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(callback, "callback");
        m4662O().addOnCompleteListener(new OnCompleteListener() { // from class: M4.S
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4626L(C1207X.this, callback, task);
            }
        });
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: c */
    public void mo4671c(String str, final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(callback, "callback");
        m4675e0(str).addOnCompleteListener(new OnCompleteListener() { // from class: M4.P
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4652r0(C1207X.this, callback, task);
            }
        });
    }

    /* renamed from: c0 */
    public final Task m4672c0(final long j7) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.K
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4636d0(C1207X.this, j7, taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: d */
    public void mo4673d(final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(callback, "callback");
        m4663Q().addOnCompleteListener(new OnCompleteListener() { // from class: M4.O
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4628N(C1207X.this, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.L
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4625K(TaskCompletionSource.this);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: e */
    public void mo4674e(long j7, final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(callback, "callback");
        m4672c0(j7).addOnCompleteListener(new OnCompleteListener() { // from class: M4.Q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4650q0(C1207X.this, callback, task);
            }
        });
    }

    /* renamed from: e0 */
    public final Task m4675e0(final String str) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.F
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4637f0(C1207X.this, str, taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: f */
    public void mo4676f(boolean z6, final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(callback, "callback");
        m4666W(z6).addOnCompleteListener(new OnCompleteListener() { // from class: M4.C
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4644n0(C1207X.this, callback, task);
            }
        });
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: g */
    public void mo4677g(Map event, final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(event, "event");
        AbstractC5469l.m23028e(callback, "callback");
        m4664S(event).addOnCompleteListener(new OnCompleteListener() { // from class: M4.W
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4640l0(C1207X.this, callback, task);
            }
        });
    }

    /* renamed from: g0 */
    public final Task m4678g0(final String str, final String str2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.N
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4638h0(C1207X.this, str, str2, taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(C4176f c4176f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M4.A
            @Override // java.lang.Runnable
            public final void run() {
                C1207X.m4627M(TaskCompletionSource.this);
            }
        });
        Task task = taskCompletionSource.getTask();
        AbstractC5469l.m23027d(task, "getTask(...)");
        return task;
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: h */
    public void mo4679h(Map arguments, InterfaceC0800l callback) {
        AbstractC5469l.m23028e(arguments, "arguments");
        AbstractC5469l.m23028e(callback, "callback");
        C6927j.a aVar = C6927j.f24803b;
        callback.invoke(C6927j.m28372a(C6927j.m28373b(AbstractC6928k.m28381a(new C1235z("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS.", null)))));
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: i */
    public void mo4680i(String name, String str, final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(name, "name");
        AbstractC5469l.m23028e(callback, "callback");
        m4678g0(name, str).addOnCompleteListener(new OnCompleteListener() { // from class: M4.B
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4654s0(C1207X.this, callback, task);
            }
        });
    }

    /* renamed from: i0 */
    public final void m4681i0(Task task, InterfaceC0800l interfaceC0800l) {
        String str;
        if (task.isSuccessful()) {
            C6927j.a aVar = C6927j.f24803b;
            interfaceC0800l.invoke(C6927j.m28372a(C6927j.m28373b(task.getResult())));
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (str = exception.getMessage()) == null) {
            str = "An unknown error occurred";
        }
        C6927j.a aVar2 = C6927j.f24803b;
        interfaceC0800l.invoke(C6927j.m28372a(C6927j.m28373b(AbstractC6928k.m28381a(new C1235z("firebase_analytics", str, null)))));
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: j */
    public void mo4682j(final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(callback, "callback");
        m4665U().addOnCompleteListener(new OnCompleteListener() { // from class: M4.V
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4642m0(C1207X.this, callback, task);
            }
        });
    }

    /* renamed from: j0 */
    public final void m4683j0(Task task, InterfaceC0800l interfaceC0800l) {
        String str;
        if (task.isSuccessful()) {
            C6927j.a aVar = C6927j.f24803b;
            interfaceC0800l.invoke(C6927j.m28372a(C6927j.m28373b(C6934q.f24811a)));
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (str = exception.getMessage()) == null) {
            str = "An unknown error occurred";
        }
        C6927j.a aVar2 = C6927j.f24803b;
        interfaceC0800l.invoke(C6927j.m28372a(C6927j.m28373b(AbstractC6928k.m28381a(new C1235z("firebase_analytics", str, null)))));
    }

    @Override // p089M4.InterfaceC1234y
    /* renamed from: k */
    public void mo4684k(Map consent, final InterfaceC0800l callback) {
        AbstractC5469l.m23028e(consent, "consent");
        AbstractC5469l.m23028e(callback, "callback");
        m4667Y(consent).addOnCompleteListener(new OnCompleteListener() { // from class: M4.T
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1207X.m4646o0(C1207X.this, callback, task);
            }
        });
    }

    /* renamed from: k0 */
    public final void m4685k0(InterfaceC0651c interfaceC0651c, Context context) {
        this.f3866c = FirebaseAnalytics.getInstance(context);
        this.f3867d = new C0659k(interfaceC0651c, "plugins.flutter.io/firebase_analytics");
        InterfaceC1234y.a.m4691A(InterfaceC1234y.f3895a, interfaceC0651c, this, null, 4, null);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
        this.f3868e = interfaceC0651c;
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        C0659k c0659k = this.f3867d;
        if (c0659k != null) {
            c0659k.m2654e(null);
        }
        InterfaceC0651c interfaceC0651c = this.f3868e;
        if (interfaceC0651c == null) {
            throw new IllegalStateException("Required value was null.");
        }
        InterfaceC1234y.a aVar = InterfaceC1234y.f3895a;
        AbstractC5469l.m23025b(interfaceC0651c);
        InterfaceC1234y.a.m4691A(aVar, interfaceC0651c, null, null, 4, null);
        this.f3867d = null;
        this.f3868e = null;
    }
}
