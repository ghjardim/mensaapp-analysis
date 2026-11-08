package p187a4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import p150V2.C2618a;

/* renamed from: a4.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC3144f0 {

    /* renamed from: a */
    public static final long f9724a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f9725b = new Object();

    /* renamed from: c */
    public static C2618a f9726c;

    /* renamed from: b */
    public static void m11505b(Context context) {
        if (f9726c == null) {
            C2618a c2618a = new C2618a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f9726c = c2618a;
            c2618a.m9002d(true);
        }
    }

    /* renamed from: c */
    public static void m11506c(Intent intent) {
        synchronized (f9725b) {
            try {
                if (f9726c != null && m11507d(intent)) {
                    m11510g(intent, false);
                    f9726c.m9001c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static boolean m11507d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: f */
    public static void m11509f(Context context, ServiceConnectionC3154k0 serviceConnectionC3154k0, final Intent intent) {
        synchronized (f9725b) {
            try {
                m11505b(context);
                boolean m11507d = m11507d(intent);
                m11510g(intent, true);
                if (!m11507d) {
                    f9726c.m8999a(f9724a);
                }
                serviceConnectionC3154k0.m11530d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: a4.e0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        AbstractC3144f0.m11506c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public static void m11510g(Intent intent, boolean z6) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z6);
    }

    /* renamed from: h */
    public static ComponentName m11511h(Context context, Intent intent) {
        synchronized (f9725b) {
            try {
                m11505b(context);
                boolean m11507d = m11507d(intent);
                m11510g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!m11507d) {
                    f9726c.m8999a(f9724a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
