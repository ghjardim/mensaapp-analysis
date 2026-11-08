package p187a4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p024D2.C0185b;
import p187a4.ServiceConnectionC3154k0;

/* renamed from: a4.k0 */
/* loaded from: classes.dex */
public class ServiceConnectionC3154k0 implements ServiceConnection {

    /* renamed from: a */
    public final Context f9745a;

    /* renamed from: b */
    public final Intent f9746b;

    /* renamed from: c */
    public final ScheduledExecutorService f9747c;

    /* renamed from: d */
    public final Queue f9748d;

    /* renamed from: e */
    public BinderC3148h0 f9749e;

    /* renamed from: f */
    public boolean f9750f;

    /* renamed from: a4.k0$a */
    public static class a {

        /* renamed from: a */
        public final Intent f9751a;

        /* renamed from: b */
        public final TaskCompletionSource f9752b = new TaskCompletionSource();

        public a(Intent intent) {
            this.f9751a = intent;
        }

        /* renamed from: c */
        public void m11535c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: a4.i0
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC3154k0.a.this.m11538f();
                }
            }, 20L, TimeUnit.SECONDS);
            m11537e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: a4.j0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* renamed from: d */
        public void m11536d() {
            this.f9752b.trySetResult(null);
        }

        /* renamed from: e */
        public Task m11537e() {
            return this.f9752b.getTask();
        }

        /* renamed from: f */
        public final /* synthetic */ void m11538f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f9751a.getAction() + " finishing.");
            m11536d();
        }
    }

    public ServiceConnectionC3154k0(Context context, String str) {
        this(context, str, m11527a());
    }

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m11527a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public final void m11528b() {
        while (!this.f9748d.isEmpty()) {
            ((a) this.f9748d.poll()).m11536d();
        }
    }

    /* renamed from: c */
    public final synchronized void m11529c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f9748d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC3148h0 binderC3148h0 = this.f9749e;
                if (binderC3148h0 == null || !binderC3148h0.isBinderAlive()) {
                    m11531e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f9749e.m11526c((a) this.f9748d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public synchronized Task m11530d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.m11535c(this.f9747c);
            this.f9748d.add(aVar);
            m11529c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.m11537e();
    }

    /* renamed from: e */
    public final void m11531e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f9750f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f9750f) {
            return;
        }
        this.f9750f = true;
        try {
        } catch (SecurityException e7) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e7);
        }
        if (C0185b.m743b().m747a(this.f9745a, this.f9746b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f9750f = false;
        m11528b();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f9750f = false;
            if (iBinder instanceof BinderC3148h0) {
                this.f9749e = (BinderC3148h0) iBinder;
                m11529c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m11528b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m11529c();
    }

    public ServiceConnectionC3154k0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f9748d = new ArrayDeque();
        this.f9750f = false;
        Context applicationContext = context.getApplicationContext();
        this.f9745a = applicationContext;
        this.f9746b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f9747c = scheduledExecutorService;
    }
}
