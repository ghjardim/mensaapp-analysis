package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C3969e;
import com.google.firebase.messaging.C3970f;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;
import p038F2.ThreadFactoryC0331b;
import p039F3.C0333a;
import p039F3.InterfaceC0334b;
import p039F3.InterfaceC0336d;
import p130S3.InterfaceC2313a;
import p137T3.InterfaceC2447b;
import p144U3.InterfaceC2535h;
import p149V1.InterfaceC2616i;
import p187a4.AbstractC3122O;
import p187a4.AbstractC3124Q;
import p187a4.AbstractC3157n;
import p187a4.C3113F;
import p187a4.C3117J;
import p187a4.C3138c0;
import p187a4.C3156m;
import p187a4.C3159p;
import p187a4.RunnableC3131Y;
import p219e3.C4172b;
import p219e3.C4176f;
import p235g3.InterfaceC4394a;
import p361v2.C6720a;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: m */
    public static C3970f f12982m;

    /* renamed from: o */
    public static ScheduledExecutorService f12984o;

    /* renamed from: a */
    public final C4176f f12985a;

    /* renamed from: b */
    public final Context f12986b;

    /* renamed from: c */
    public final C3113F f12987c;

    /* renamed from: d */
    public final C3969e f12988d;

    /* renamed from: e */
    public final C3964a f12989e;

    /* renamed from: f */
    public final Executor f12990f;

    /* renamed from: g */
    public final Executor f12991g;

    /* renamed from: h */
    public final Task f12992h;

    /* renamed from: i */
    public final C3117J f12993i;

    /* renamed from: j */
    public boolean f12994j;

    /* renamed from: k */
    public final Application.ActivityLifecycleCallbacks f12995k;

    /* renamed from: l */
    public static final long f12981l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n */
    public static InterfaceC2447b f12983n = new InterfaceC2447b() { // from class: a4.q
        @Override // p137T3.InterfaceC2447b
        public final Object get() {
            InterfaceC2616i m15690K;
            m15690K = FirebaseMessaging.m15690K();
            return m15690K;
        }
    };

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C3964a {

        /* renamed from: a */
        public final InterfaceC0336d f12996a;

        /* renamed from: b */
        public boolean f12997b;

        /* renamed from: c */
        public InterfaceC0334b f12998c;

        /* renamed from: d */
        public Boolean f12999d;

        public C3964a(InterfaceC0336d interfaceC0336d) {
            this.f12996a = interfaceC0336d;
        }

        /* renamed from: b */
        public synchronized void m15741b() {
            try {
                if (this.f12997b) {
                    return;
                }
                Boolean m15744e = m15744e();
                this.f12999d = m15744e;
                if (m15744e == null) {
                    InterfaceC0334b interfaceC0334b = new InterfaceC0334b() { // from class: a4.C
                        @Override // p039F3.InterfaceC0334b
                        /* renamed from: a */
                        public final void mo1337a(C0333a c0333a) {
                            FirebaseMessaging.C3964a.this.m15743d(c0333a);
                        }
                    };
                    this.f12998c = interfaceC0334b;
                    this.f12996a.mo1340c(C4172b.class, interfaceC0334b);
                }
                this.f12997b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* renamed from: c */
        public synchronized boolean m15742c() {
            Boolean bool;
            try {
                m15741b();
                bool = this.f12999d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f12985a.m17537x();
        }

        /* renamed from: d */
        public final /* synthetic */ void m15743d(C0333a c0333a) {
            if (m15742c()) {
                FirebaseMessaging.this.m15725T();
            }
        }

        /* renamed from: e */
        public final Boolean m15744e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m17532m = FirebaseMessaging.this.f12985a.m17532m();
            SharedPreferences sharedPreferences = m17532m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m17532m.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m17532m.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public synchronized void m15745f(boolean z6) {
            try {
                m15741b();
                InterfaceC0334b interfaceC0334b = this.f12998c;
                if (interfaceC0334b != null) {
                    this.f12996a.mo1339b(C4172b.class, interfaceC0334b);
                    this.f12998c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.f12985a.m17532m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z6);
                edit.apply();
                if (z6) {
                    FirebaseMessaging.this.m15725T();
                }
                this.f12999d = Boolean.valueOf(z6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(C4176f c4176f, InterfaceC2313a interfaceC2313a, InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2, InterfaceC2535h interfaceC2535h, InterfaceC2447b interfaceC2447b3, InterfaceC0336d interfaceC0336d) {
        this(c4176f, interfaceC2313a, interfaceC2447b, interfaceC2447b2, interfaceC2535h, interfaceC2447b3, interfaceC0336d, new C3117J(c4176f.m17532m()));
    }

    /* renamed from: K */
    public static /* synthetic */ InterfaceC2616i m15690K() {
        return null;
    }

    /* renamed from: L */
    public static /* synthetic */ Task m15691L(String str, C3138c0 c3138c0) {
        return c3138c0.m11467r(str);
    }

    /* renamed from: M */
    public static /* synthetic */ Task m15692M(String str, C3138c0 c3138c0) {
        return c3138c0.m11470u(str);
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C4176f c4176f) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c4176f.m17531k(FirebaseMessaging.class);
            AbstractC3802r.m15130l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: r */
    public static synchronized FirebaseMessaging m15706r() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C4176f.m17517o());
        }
        return firebaseMessaging;
    }

    /* renamed from: s */
    public static synchronized C3970f m15707s(Context context) {
        C3970f c3970f;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f12982m == null) {
                    f12982m = new C3970f(context);
                }
                c3970f = f12982m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3970f;
    }

    /* renamed from: w */
    public static InterfaceC2616i m15708w() {
        return (InterfaceC2616i) f12983n.get();
    }

    /* renamed from: A */
    public boolean m15709A() {
        return this.f12989e.m15742c();
    }

    /* renamed from: B */
    public boolean m15710B() {
        return this.f12993i.m11382g();
    }

    /* renamed from: C */
    public final /* synthetic */ Task m15711C(String str, C3970f.a aVar, String str2) {
        m15707s(this.f12986b).m15863g(m15734t(), str, str2, this.f12993i.m11377a());
        if (aVar == null || !str2.equals(aVar.f13040a)) {
            m15739z(str2);
        }
        return Tasks.forResult(str2);
    }

    /* renamed from: D */
    public final /* synthetic */ Task m15712D(final String str, final C3970f.a aVar) {
        return this.f12987c.m11361g().onSuccessTask(this.f12991g, new SuccessContinuation() { // from class: a4.A
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m15711C;
                m15711C = FirebaseMessaging.this.m15711C(str, aVar, (String) obj);
                return m15711C;
            }
        });
    }

    /* renamed from: E */
    public final /* synthetic */ void m15713E(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f12987c.m11357c());
            m15707s(this.f12986b).m15860d(m15734t(), C3117J.m11376c(this.f12985a));
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: F */
    public final /* synthetic */ void m15714F(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(m15730n());
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: G */
    public final /* synthetic */ void m15715G(C6720a c6720a) {
        if (c6720a != null) {
            AbstractC3966b.m15789y(c6720a.m27663x0());
            m15737x();
        }
    }

    /* renamed from: H */
    public final /* synthetic */ void m15716H() {
        if (m15709A()) {
            m15725T();
        }
    }

    /* renamed from: I */
    public final /* synthetic */ void m15717I(C3138c0 c3138c0) {
        if (m15709A()) {
            c3138c0.m11466q();
        }
    }

    /* renamed from: N */
    public void m15719N(C3968d c3968d) {
        if (TextUtils.isEmpty(c3968d.m15823G0())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f12986b, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        c3968d.m15825I0(intent);
        this.f12986b.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    /* renamed from: O */
    public void m15720O(boolean z6) {
        this.f12989e.m15745f(z6);
    }

    /* renamed from: P */
    public void m15721P(boolean z6) {
        AbstractC3966b.m15760B(z6);
        AbstractC3124Q.m11400g(this.f12986b, this.f12987c, m15723R());
    }

    /* renamed from: Q */
    public synchronized void m15722Q(boolean z6) {
        this.f12994j = z6;
    }

    /* renamed from: R */
    public final boolean m15723R() {
        AbstractC3122O.m11389c(this.f12986b);
        if (!AbstractC3122O.m11390d(this.f12986b)) {
            return false;
        }
        if (this.f12985a.m17531k(InterfaceC4394a.class) != null) {
            return true;
        }
        return AbstractC3966b.m15765a() && f12983n != null;
    }

    /* renamed from: S */
    public final synchronized void m15724S() {
        if (!this.f12994j) {
            m15727V(0L);
        }
    }

    /* renamed from: T */
    public final void m15725T() {
        if (m15728W(m15736v())) {
            m15724S();
        }
    }

    /* renamed from: U */
    public Task m15726U(final String str) {
        return this.f12992h.onSuccessTask(new SuccessContinuation() { // from class: a4.z
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m15691L;
                m15691L = FirebaseMessaging.m15691L(str, (C3138c0) obj);
                return m15691L;
            }
        });
    }

    /* renamed from: V */
    public synchronized void m15727V(long j7) {
        m15732p(new RunnableC3131Y(this, Math.min(Math.max(30L, 2 * j7), f12981l)), j7);
        this.f12994j = true;
    }

    /* renamed from: W */
    public boolean m15728W(C3970f.a aVar) {
        return aVar == null || aVar.m15866b(this.f12993i.m11377a());
    }

    /* renamed from: X */
    public Task m15729X(final String str) {
        return this.f12992h.onSuccessTask(new SuccessContinuation() { // from class: a4.r
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m15692M;
                m15692M = FirebaseMessaging.m15692M(str, (C3138c0) obj);
                return m15692M;
            }
        });
    }

    /* renamed from: n */
    public String m15730n() {
        final C3970f.a m15736v = m15736v();
        if (!m15728W(m15736v)) {
            return m15736v.f13040a;
        }
        final String m11376c = C3117J.m11376c(this.f12985a);
        try {
            return (String) Tasks.await(this.f12988d.m15855b(m11376c, new C3969e.a() { // from class: a4.y
                @Override // com.google.firebase.messaging.C3969e.a
                public final Task start() {
                    Task m15712D;
                    m15712D = FirebaseMessaging.this.m15712D(m11376c, m15736v);
                    return m15712D;
                }
            }));
        } catch (InterruptedException | ExecutionException e7) {
            throw new IOException(e7);
        }
    }

    /* renamed from: o */
    public Task m15731o() {
        if (m15736v() == null) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AbstractC3157n.m11555e().execute(new Runnable() { // from class: a4.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m15713E(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: p */
    public void m15732p(Runnable runnable, long j7) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f12984o == null) {
                    f12984o = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0331b("TAG"));
                }
                f12984o.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: q */
    public Context m15733q() {
        return this.f12986b;
    }

    /* renamed from: t */
    public final String m15734t() {
        return "[DEFAULT]".equals(this.f12985a.m17533q()) ? StringUtils.EMPTY : this.f12985a.m17535s();
    }

    /* renamed from: u */
    public Task m15735u() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12990f.execute(new Runnable() { // from class: a4.B
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m15714F(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: v */
    public C3970f.a m15736v() {
        return m15707s(this.f12986b).m15861e(m15734t(), C3117J.m11376c(this.f12985a));
    }

    /* renamed from: x */
    public final void m15737x() {
        this.f12987c.m11360f().addOnSuccessListener(this.f12990f, new OnSuccessListener() { // from class: a4.x
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.m15715G((C6720a) obj);
            }
        });
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m15718J() {
        AbstractC3122O.m11389c(this.f12986b);
        AbstractC3124Q.m11400g(this.f12986b, this.f12987c, m15723R());
        if (m15723R()) {
            m15737x();
        }
    }

    /* renamed from: z */
    public final void m15739z(String str) {
        if ("[DEFAULT]".equals(this.f12985a.m17533q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f12985a.m17533q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C3156m(this.f12986b).m11549k(intent);
        }
    }

    public FirebaseMessaging(C4176f c4176f, InterfaceC2313a interfaceC2313a, InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2, InterfaceC2535h interfaceC2535h, InterfaceC2447b interfaceC2447b3, InterfaceC0336d interfaceC0336d, C3117J c3117j) {
        this(c4176f, interfaceC2313a, interfaceC2447b3, interfaceC0336d, c3117j, new C3113F(c4176f, c3117j, interfaceC2447b, interfaceC2447b2, interfaceC2535h), AbstractC3157n.m11556f(), AbstractC3157n.m11553c(), AbstractC3157n.m11552b());
    }

    public FirebaseMessaging(C4176f c4176f, InterfaceC2313a interfaceC2313a, InterfaceC2447b interfaceC2447b, InterfaceC0336d interfaceC0336d, C3117J c3117j, C3113F c3113f, Executor executor, Executor executor2, Executor executor3) {
        this.f12994j = false;
        f12983n = interfaceC2447b;
        this.f12985a = c4176f;
        this.f12989e = new C3964a(interfaceC0336d);
        Context m17532m = c4176f.m17532m();
        this.f12986b = m17532m;
        C3159p c3159p = new C3159p();
        this.f12995k = c3159p;
        this.f12993i = c3117j;
        this.f12987c = c3113f;
        this.f12988d = new C3969e(executor);
        this.f12990f = executor2;
        this.f12991g = executor3;
        Context m17532m2 = c4176f.m17532m();
        if (m17532m2 instanceof Application) {
            ((Application) m17532m2).registerActivityLifecycleCallbacks(c3159p);
        } else {
            Log.w("FirebaseMessaging", "Context " + m17532m2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC2313a != null) {
            interfaceC2313a.m7828a(new InterfaceC2313a.a() { // from class: a4.t
            });
        }
        executor2.execute(new Runnable() { // from class: a4.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m15716H();
            }
        });
        Task m11452f = C3138c0.m11452f(this, c3117j, c3113f, m17532m, AbstractC3157n.m11557g());
        this.f12992h = m11452f;
        m11452f.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: a4.v
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.m15717I((C3138c0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: a4.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m15718J();
            }
        });
    }
}
