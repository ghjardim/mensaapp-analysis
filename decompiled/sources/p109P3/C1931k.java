package p109P3;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p109P3.InterfaceC1935o;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.InterfaceC2145n;

/* renamed from: P3.k */
/* loaded from: classes.dex */
public final class C1931k implements InterfaceC1935o {

    /* renamed from: a */
    public final Context f5808a;

    /* renamed from: b */
    public final ConnectivityManager f5809b;

    /* renamed from: c */
    public Runnable f5810c;

    /* renamed from: d */
    public final List f5811d = new ArrayList();

    /* renamed from: P3.k$c */
    public class c extends ConnectivityManager.NetworkCallback {
        public c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C1931k.this.m6875k(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C1931k.this.m6875k(false);
        }

        public /* synthetic */ c(C1931k c1931k, a aVar) {
            this();
        }
    }

    public C1931k(Context context) {
        AbstractC2133b.m7217d(context != null, "Context must be non-null", new Object[0]);
        this.f5808a = context;
        this.f5809b = (ConnectivityManager) context.getSystemService("connectivity");
        m6870f();
        m6871g();
    }

    @Override // p109P3.InterfaceC1935o
    /* renamed from: a */
    public void mo6869a(InterfaceC2145n interfaceC2145n) {
        synchronized (this.f5811d) {
            this.f5811d.add(interfaceC2145n);
        }
    }

    /* renamed from: f */
    public final void m6870f() {
        Application application = (Application) this.f5808a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    /* renamed from: g */
    public final void m6871g() {
        a aVar = null;
        if (Build.VERSION.SDK_INT >= 24 && this.f5809b != null) {
            final c cVar = new c(this, aVar);
            this.f5809b.registerDefaultNetworkCallback(cVar);
            this.f5810c = new Runnable() { // from class: P3.i
                @Override // java.lang.Runnable
                public final void run() {
                    C1931k.this.m6873i(cVar);
                }
            };
        } else {
            final d dVar = new d(this, aVar);
            this.f5808a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f5810c = new Runnable() { // from class: P3.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1931k.this.m6874j(dVar);
                }
            };
        }
    }

    /* renamed from: h */
    public final boolean m6872h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5808a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: i */
    public final /* synthetic */ void m6873i(c cVar) {
        this.f5809b.unregisterNetworkCallback(cVar);
    }

    /* renamed from: j */
    public final /* synthetic */ void m6874j(d dVar) {
        this.f5808a.unregisterReceiver(dVar);
    }

    /* renamed from: k */
    public final void m6875k(boolean z6) {
        synchronized (this.f5811d) {
            try {
                Iterator it = this.f5811d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2145n) it.next()).accept(z6 ? InterfaceC1935o.a.REACHABLE : InterfaceC1935o.a.UNREACHABLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public void m6876l() {
        AbstractC2155x.m7309a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (m6872h()) {
            m6875k(true);
        }
    }

    @Override // p109P3.InterfaceC1935o
    public void shutdown() {
        Runnable runnable = this.f5810c;
        if (runnable != null) {
            runnable.run();
            this.f5810c = null;
        }
    }

    /* renamed from: P3.k$d */
    public class d extends BroadcastReceiver {

        /* renamed from: a */
        public boolean f5817a;

        public d() {
            this.f5817a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean m6872h = C1931k.this.m6872h();
            if (C1931k.this.m6872h() && !this.f5817a) {
                C1931k.this.m6875k(true);
            } else if (!m6872h && this.f5817a) {
                C1931k.this.m6875k(false);
            }
            this.f5817a = m6872h;
        }

        public /* synthetic */ d(C1931k c1931k, a aVar) {
            this();
        }
    }

    /* renamed from: P3.k$b */
    public class b implements ComponentCallbacks2 {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f5814a;

        public b(AtomicBoolean atomicBoolean) {
            this.f5814a = atomicBoolean;
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i7) {
            if (i7 == 20) {
                this.f5814a.set(true);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }

    /* renamed from: P3.k$a */
    public class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f5812a;

        public a(AtomicBoolean atomicBoolean) {
            this.f5812a = atomicBoolean;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f5812a.compareAndSet(true, false)) {
                C1931k.this.m6876l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (this.f5812a.compareAndSet(true, false)) {
                C1931k.this.m6876l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f5812a.compareAndSet(true, false)) {
                C1931k.this.m6876l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
