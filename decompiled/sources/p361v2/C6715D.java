package p361v2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p038F2.ThreadFactoryC0331b;

/* renamed from: v2.D */
/* loaded from: classes.dex */
public final class C6715D {

    /* renamed from: e */
    public static C6715D f24238e;

    /* renamed from: a */
    public final Context f24239a;

    /* renamed from: b */
    public final ScheduledExecutorService f24240b;

    /* renamed from: c */
    public ServiceConnectionC6743x f24241c = new ServiceConnectionC6743x(this, null);

    /* renamed from: d */
    public int f24242d = 1;

    public C6715D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f24240b = scheduledExecutorService;
        this.f24239a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C6715D m27655b(Context context) {
        C6715D c6715d;
        synchronized (C6715D.class) {
            try {
                if (f24238e == null) {
                    zze.zza();
                    f24238e = new C6715D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC0331b("MessengerIpcClient"))));
                }
                c6715d = f24238e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6715d;
    }

    /* renamed from: c */
    public final Task m27657c(int i7, Bundle bundle) {
        return m27660g(new C6745z(m27659f(), i7, bundle));
    }

    /* renamed from: d */
    public final Task m27658d(int i7, Bundle bundle) {
        return m27660g(new C6714C(m27659f(), i7, bundle));
    }

    /* renamed from: f */
    public final synchronized int m27659f() {
        int i7;
        i7 = this.f24242d;
        this.f24242d = i7 + 1;
        return i7;
    }

    /* renamed from: g */
    public final synchronized Task m27660g(AbstractC6712A abstractC6712A) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(abstractC6712A.toString()));
            }
            if (!this.f24241c.m27690g(abstractC6712A)) {
                ServiceConnectionC6743x serviceConnectionC6743x = new ServiceConnectionC6743x(this, null);
                this.f24241c = serviceConnectionC6743x;
                serviceConnectionC6743x.m27690g(abstractC6712A);
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC6712A.f24235b.getTask();
    }
}
