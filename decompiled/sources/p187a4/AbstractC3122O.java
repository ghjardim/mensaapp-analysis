package p187a4;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p031E2.AbstractC0277m;
import p381y1.ExecutorC7060k;

/* renamed from: a4.O */
/* loaded from: classes.dex */
public abstract class AbstractC3122O {
    /* renamed from: b */
    public static boolean m11388b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* renamed from: c */
    public static void m11389c(Context context) {
        if (AbstractC3124Q.m11396c(context)) {
            return;
        }
        m11392f(new ExecutorC7060k(), context, m11393g(context));
    }

    /* renamed from: d */
    public static boolean m11390d(Context context) {
        String notificationDelegate;
        if (!AbstractC0277m.m1136g()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        }
        if (!m11388b(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
        if (!"com.google.android.gms".equals(notificationDelegate)) {
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "GMS core is set for proxying");
        return true;
    }

    /* renamed from: e */
    public static /* synthetic */ void m11391e(Context context, boolean z6, TaskCompletionSource taskCompletionSource) {
        String notificationDelegate;
        try {
            if (!m11388b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            AbstractC3124Q.m11399f(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z6) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    /* renamed from: f */
    public static Task m11392f(Executor executor, final Context context, final boolean z6) {
        if (!AbstractC0277m.m1136g()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: a4.N
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3122O.m11391e(context, z6, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    public static boolean m11393g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
