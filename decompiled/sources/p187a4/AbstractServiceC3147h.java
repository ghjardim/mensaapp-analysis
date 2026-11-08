package p187a4;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import p187a4.BinderC3148h0;
import p381y1.ExecutorC7060k;

/* renamed from: a4.h */
/* loaded from: classes.dex */
public abstract class AbstractServiceC3147h extends Service {

    /* renamed from: b */
    public Binder f9732b;

    /* renamed from: d */
    public int f9734d;

    /* renamed from: a */
    public final ExecutorService f9731a = AbstractC3157n.m11554d();

    /* renamed from: c */
    public final Object f9733c = new Object();

    /* renamed from: e */
    public int f9735e = 0;

    /* renamed from: a4.h$a */
    public class a implements BinderC3148h0.a {
        public a() {
        }

        @Override // p187a4.BinderC3148h0.a
        /* renamed from: a */
        public Task mo11523a(Intent intent) {
            return AbstractServiceC3147h.this.m11521j(intent);
        }
    }

    /* renamed from: d */
    public final void m11515d(Intent intent) {
        if (intent != null) {
            AbstractC3144f0.m11506c(intent);
        }
        synchronized (this.f9733c) {
            try {
                int i7 = this.f9735e - 1;
                this.f9735e = i7;
                if (i7 == 0) {
                    m11522k(this.f9734d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public abstract Intent mo11516e(Intent intent);

    /* renamed from: f */
    public abstract void mo11517f(Intent intent);

    /* renamed from: g */
    public boolean m11518g(Intent intent) {
        return false;
    }

    /* renamed from: h */
    public final /* synthetic */ void m11519h(Intent intent, Task task) {
        m11515d(intent);
    }

    /* renamed from: i */
    public final /* synthetic */ void m11520i(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            mo11517f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* renamed from: j */
    public final Task m11521j(final Intent intent) {
        if (m11518g(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9731a.execute(new Runnable() { // from class: a4.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC3147h.this.m11520i(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: k */
    public boolean m11522k(int i7) {
        return stopSelfResult(i7);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f9732b == null) {
                this.f9732b = new BinderC3148h0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9732b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f9731a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i7, int i8) {
        synchronized (this.f9733c) {
            this.f9734d = i8;
            this.f9735e++;
        }
        Intent mo11516e = mo11516e(intent);
        if (mo11516e == null) {
            m11515d(intent);
            return 2;
        }
        Task m11521j = m11521j(mo11516e);
        if (m11521j.isComplete()) {
            m11515d(intent);
            return 2;
        }
        m11521j.addOnCompleteListener(new ExecutorC7060k(), new OnCompleteListener() { // from class: a4.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractServiceC3147h.this.m11519h(intent, task);
            }
        });
        return 3;
    }
}
