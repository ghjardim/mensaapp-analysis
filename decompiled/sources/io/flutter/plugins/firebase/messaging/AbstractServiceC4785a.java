package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p138T4.AbstractC2456I;

/* renamed from: io.flutter.plugins.firebase.messaging.a */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC4785a extends Service {

    /* renamed from: n */
    public static final Object f17634n = new Object();

    /* renamed from: o */
    public static final HashMap f17635o = new HashMap();

    /* renamed from: a */
    public b f17636a;

    /* renamed from: b */
    public i f17637b;

    /* renamed from: c */
    public a f17638c;

    /* renamed from: d */
    public boolean f17639d = false;

    /* renamed from: e */
    public boolean f17640e = false;

    /* renamed from: f */
    public final ArrayList f17641f = new ArrayList();

    /* renamed from: io.flutter.plugins.firebase.messaging.a$a */
    public final class a {

        /* renamed from: a */
        public final Executor f17642a = Executors.newSingleThreadExecutor();

        /* renamed from: b */
        public final Handler f17643b = new Handler(Looper.getMainLooper());

        /* renamed from: io.flutter.plugins.firebase.messaging.a$a$a, reason: collision with other inner class name */
        public class RunnableC7229a implements Runnable {

            /* renamed from: io.flutter.plugins.firebase.messaging.a$a$a$a, reason: collision with other inner class name */
            public class RunnableC7230a implements Runnable {
                public RunnableC7230a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    AbstractServiceC4785a.this.m20652i();
                }
            }

            public RunnableC7229a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    f m20649a = AbstractServiceC4785a.this.m20649a();
                    if (m20649a == null) {
                        a.this.f17643b.post(new RunnableC7230a());
                        return;
                    } else {
                        AbstractServiceC4785a.this.mo20644g(m20649a.getIntent());
                        m20649a.mo20662a();
                    }
                }
            }
        }

        public a() {
        }

        /* renamed from: b */
        public void m20654b() {
            AbstractServiceC4785a.this.m20652i();
        }

        /* renamed from: c */
        public void m20655c() {
            this.f17642a.execute(new RunnableC7229a());
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.a$b */
    public interface b {
        /* renamed from: a */
        IBinder mo20656a();

        /* renamed from: b */
        f mo20657b();
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.a$c */
    public static final class c extends i {

        /* renamed from: d */
        public final Context f17647d;

        /* renamed from: e */
        public final PowerManager.WakeLock f17648e;

        /* renamed from: f */
        public final PowerManager.WakeLock f17649f;

        /* renamed from: g */
        public boolean f17650g;

        /* renamed from: h */
        public boolean f17651h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f17647d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f17648e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f17649f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.i
        /* renamed from: a */
        public void mo20658a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f17664a);
            if (this.f17647d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f17650g) {
                            this.f17650g = true;
                            if (!this.f17651h) {
                                this.f17648e.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.i
        /* renamed from: c */
        public void mo20659c() {
            synchronized (this) {
                try {
                    if (this.f17651h) {
                        if (this.f17650g) {
                            this.f17648e.acquire(60000L);
                        }
                        this.f17651h = false;
                        this.f17649f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.i
        /* renamed from: d */
        public void mo20660d() {
            synchronized (this) {
                try {
                    if (!this.f17651h) {
                        this.f17651h = true;
                        this.f17649f.acquire(600000L);
                        this.f17648e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.i
        /* renamed from: e */
        public void mo20661e() {
            synchronized (this) {
                this.f17650g = false;
            }
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.a$d */
    public final class d implements f {

        /* renamed from: a */
        public final Intent f17652a;

        /* renamed from: b */
        public final int f17653b;

        public d(Intent intent, int i7) {
            this.f17652a = intent;
            this.f17653b = i7;
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.f
        /* renamed from: a */
        public void mo20662a() {
            AbstractServiceC4785a.this.stopSelf(this.f17653b);
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.f
        public Intent getIntent() {
            return this.f17652a;
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.a$e */
    public static class e {

        /* renamed from: a */
        public ComponentName f17655a;

        /* renamed from: b */
        public boolean f17656b;

        public e(ComponentName componentName, boolean z6) {
            this.f17655a = componentName;
            this.f17656b = z6;
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.a$f */
    public interface f {
        /* renamed from: a */
        void mo20662a();

        Intent getIntent();
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.a$g */
    public static final class g extends JobServiceEngine implements b {

        /* renamed from: a */
        public final AbstractServiceC4785a f17657a;

        /* renamed from: b */
        public final Object f17658b;

        /* renamed from: c */
        public JobParameters f17659c;

        /* renamed from: io.flutter.plugins.firebase.messaging.a$g$a */
        public final class a implements f {

            /* renamed from: a */
            public final JobWorkItem f17660a;

            public a(JobWorkItem jobWorkItem) {
                this.f17660a = jobWorkItem;
            }

            @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.f
            /* renamed from: a */
            public void mo20662a() {
                synchronized (g.this.f17658b) {
                    JobParameters jobParameters = g.this.f17659c;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.f17660a);
                        } catch (IllegalArgumentException e7) {
                            Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e7);
                        } catch (SecurityException e8) {
                            Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e8);
                        }
                    }
                }
            }

            @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.f
            public Intent getIntent() {
                Intent intent;
                intent = this.f17660a.getIntent();
                return intent;
            }
        }

        public g(AbstractServiceC4785a abstractServiceC4785a) {
            super(abstractServiceC4785a);
            this.f17658b = new Object();
            this.f17657a = abstractServiceC4785a;
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.b
        /* renamed from: a */
        public IBinder mo20656a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.b
        /* renamed from: b */
        public f mo20657b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f17658b) {
                JobParameters jobParameters = this.f17659c;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    intent = dequeueWork.getIntent();
                    intent.setExtrasClassLoader(this.f17657a.getClassLoader());
                    return new a(dequeueWork);
                } catch (SecurityException e7) {
                    Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", e7);
                    return null;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f17659c = jobParameters;
            this.f17657a.m20651e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean m20650b = this.f17657a.m20650b();
            synchronized (this.f17658b) {
                this.f17659c = null;
            }
            return m20650b;
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.a$h */
    public static final class h extends i {

        /* renamed from: d */
        public final JobInfo f17662d;

        /* renamed from: e */
        public final JobScheduler f17663e;

        public h(Context context, ComponentName componentName, int i7) {
            super(componentName);
            m20663b(i7);
            this.f17662d = new JobInfo.Builder(i7, this.f17664a).setOverrideDeadline(0L).build();
            this.f17663e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a.i
        /* renamed from: a */
        public void mo20658a(Intent intent) {
            this.f17663e.enqueue(this.f17662d, AbstractC2456I.m8324a(intent));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.a$i */
    public static abstract class i {

        /* renamed from: a */
        public final ComponentName f17664a;

        /* renamed from: b */
        public boolean f17665b;

        /* renamed from: c */
        public int f17666c;

        public i(ComponentName componentName) {
            this.f17664a = componentName;
        }

        /* renamed from: a */
        public abstract void mo20658a(Intent intent);

        /* renamed from: b */
        public void m20663b(int i7) {
            if (!this.f17665b) {
                this.f17665b = true;
                this.f17666c = i7;
            } else {
                if (this.f17666c == i7) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i7 + " is different than previous " + this.f17666c);
            }
        }

        /* renamed from: c */
        public void mo20659c() {
        }

        /* renamed from: d */
        public void mo20660d() {
        }

        /* renamed from: e */
        public void mo20661e() {
        }
    }

    /* renamed from: c */
    public static void m20646c(Context context, ComponentName componentName, int i7, Intent intent, boolean z6) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f17634n) {
            i m20648f = m20648f(context, componentName, true, i7, z6);
            m20648f.m20663b(i7);
            try {
                m20648f.mo20658a(intent);
            } catch (IllegalStateException e7) {
                if (!z6) {
                    throw e7;
                }
                m20648f(context, componentName, true, i7, false).mo20658a(intent);
            }
        }
    }

    /* renamed from: d */
    public static void m20647d(Context context, Class cls, int i7, Intent intent, boolean z6) {
        m20646c(context, new ComponentName(context, (Class<?>) cls), i7, intent, z6);
    }

    /* renamed from: f */
    public static i m20648f(Context context, ComponentName componentName, boolean z6, int i7, boolean z7) {
        i cVar;
        e eVar = new e(componentName, z7);
        HashMap hashMap = f17635o;
        i iVar = (i) hashMap.get(eVar);
        if (iVar == null) {
            if (Build.VERSION.SDK_INT < 26 || z7) {
                cVar = new c(context, componentName);
            } else {
                if (!z6) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                cVar = new h(context, componentName, i7);
            }
            iVar = cVar;
            hashMap.put(eVar, iVar);
        }
        return iVar;
    }

    /* renamed from: a */
    public f m20649a() {
        f mo20657b;
        b bVar = this.f17636a;
        if (bVar != null && (mo20657b = bVar.mo20657b()) != null) {
            return mo20657b;
        }
        synchronized (this.f17641f) {
            try {
                if (this.f17641f.size() > 0) {
                    return (f) this.f17641f.remove(0);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public boolean m20650b() {
        a aVar = this.f17638c;
        if (aVar != null) {
            aVar.m20654b();
        }
        this.f17639d = true;
        return mo20645h();
    }

    /* renamed from: e */
    public void m20651e(boolean z6) {
        if (this.f17638c == null) {
            this.f17638c = new a();
            i iVar = this.f17637b;
            if (iVar != null && z6) {
                iVar.mo20660d();
            }
            this.f17638c.m20655c();
        }
    }

    /* renamed from: g */
    public abstract void mo20644g(Intent intent);

    /* renamed from: h */
    public boolean mo20645h() {
        return true;
    }

    /* renamed from: i */
    public void m20652i() {
        ArrayList arrayList = this.f17641f;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f17638c = null;
                    ArrayList arrayList2 = this.f17641f;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        m20651e(false);
                    } else if (!this.f17640e) {
                        this.f17637b.mo20659c();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f17636a;
        if (bVar != null) {
            return bVar.mo20656a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17636a = new g(this);
            this.f17637b = null;
        }
        this.f17637b = m20648f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m20650b();
        synchronized (this.f17641f) {
            this.f17640e = true;
            this.f17637b.mo20659c();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        this.f17637b.mo20661e();
        synchronized (this.f17641f) {
            ArrayList arrayList = this.f17641f;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i8));
            m20651e(true);
        }
        return 3;
    }
}
