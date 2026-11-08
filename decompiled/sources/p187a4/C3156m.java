package p187a4;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p031E2.AbstractC0277m;
import p381y1.ExecutorC7060k;

/* renamed from: a4.m */
/* loaded from: classes.dex */
public class C3156m {

    /* renamed from: c */
    public static final Object f9753c = new Object();

    /* renamed from: d */
    public static ServiceConnectionC3154k0 f9754d;

    /* renamed from: a */
    public final Context f9755a;

    /* renamed from: b */
    public final Executor f9756b = new ExecutorC7060k();

    public C3156m(Context context) {
        this.f9755a = context;
    }

    /* renamed from: e */
    public static Task m11543e(Context context, Intent intent, boolean z6) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        ServiceConnectionC3154k0 m11544f = m11544f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z6) {
            return m11544f.m11530d(intent).continueWith(new ExecutorC7060k(), new Continuation() { // from class: a4.l
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Integer m11545g;
                    m11545g = C3156m.m11545g(task);
                    return m11545g;
                }
            });
        }
        if (C3128V.m11406b().m11410e(context)) {
            AbstractC3144f0.m11509f(context, m11544f, intent);
        } else {
            m11544f.m11530d(intent);
        }
        return Tasks.forResult(-1);
    }

    /* renamed from: f */
    public static ServiceConnectionC3154k0 m11544f(Context context, String str) {
        ServiceConnectionC3154k0 serviceConnectionC3154k0;
        synchronized (f9753c) {
            try {
                if (f9754d == null) {
                    f9754d = new ServiceConnectionC3154k0(context, str);
                }
                serviceConnectionC3154k0 = f9754d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceConnectionC3154k0;
    }

    /* renamed from: g */
    public static /* synthetic */ Integer m11545g(Task task) {
        return -1;
    }

    /* renamed from: h */
    public static /* synthetic */ Integer m11546h(Context context, Intent intent) {
        return Integer.valueOf(C3128V.m11406b().m11412g(context, intent));
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m11547i(Task task) {
        return 403;
    }

    /* renamed from: j */
    public static /* synthetic */ Task m11548j(Context context, Intent intent, boolean z6, Task task) {
        return (AbstractC0277m.m1134e() && ((Integer) task.getResult()).intValue() == 402) ? m11543e(context, intent, z6).continueWith(new ExecutorC7060k(), new Continuation() { // from class: a4.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Integer m11547i;
                m11547i = C3156m.m11547i(task2);
                return m11547i;
            }
        }) : task;
    }

    /* renamed from: k */
    public Task m11549k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m11550l(this.f9755a, intent);
    }

    /* renamed from: l */
    public Task m11550l(final Context context, final Intent intent) {
        boolean z6 = AbstractC0277m.m1134e() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z7 = (intent.getFlags() & 268435456) != 0;
        return (!z6 || z7) ? Tasks.call(this.f9756b, new Callable() { // from class: a4.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m11546h;
                m11546h = C3156m.m11546h(context, intent);
                return m11546h;
            }
        }).continueWithTask(this.f9756b, new Continuation() { // from class: a4.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m11548j;
                m11548j = C3156m.m11548j(context, intent, z7, task);
                return m11548j;
            }
        }) : m11543e(context, intent, z7);
    }
}
