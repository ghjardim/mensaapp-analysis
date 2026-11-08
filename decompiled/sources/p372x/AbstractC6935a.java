package p372x;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Executor;
import p021D.AbstractC0098f;
import p021D.AbstractC0100h;
import p021D.C0101i;
import p042G.AbstractC0340b;
import p365w.AbstractC6790f;
import p365w.C6796l;
import p379y.AbstractC7043h;

/* renamed from: x.a */
/* loaded from: classes.dex */
public abstract class AbstractC6935a {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* renamed from: x.a$a */
    public static class a {
        /* renamed from: a */
        public static File m28385a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m28386b(Context context, int i7) {
            return context.getDrawable(i7);
        }

        /* renamed from: c */
        public static File m28387c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: x.a$b */
    public static class b {
        /* renamed from: a */
        public static int m28388a(Context context, int i7) {
            return context.getColor(i7);
        }

        /* renamed from: b */
        public static Object m28389b(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        public static String m28390c(Context context, Class cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: x.a$c */
    public static class c {
        /* renamed from: a */
        public static Context m28391a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        public static File m28392b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        public static boolean m28393c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: x.a$d */
    public static class d {
        /* renamed from: a */
        public static Intent m28394a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
            return ((i7 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC6935a.obtainAndCheckReceiverPermission(context), handler);
        }

        /* renamed from: b */
        public static ComponentName m28395b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: x.a$e */
    public static class e {
        /* renamed from: a */
        public static Executor m28396a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: x.a$f */
    public static class f {
        /* renamed from: a */
        public static Context m28397a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* renamed from: b */
        public static String m28398b(Context context) {
            return context.getAttributionTag();
        }

        /* renamed from: c */
        public static Display m28399c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(AbstractC6935a.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* renamed from: x.a$g */
    public static class g {
        /* renamed from: a */
        public static Intent m28400a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        AbstractC0340b.m1347d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : C6796l.m27948b(context).m27949a() ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.m28397a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.m28391a(context);
        }
        return null;
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.m28398b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return a.m28385a(context);
    }

    public static int getColor(Context context, int i7) {
        return b.m28388a(context, i7);
    }

    public static ColorStateList getColorStateList(Context context, int i7) {
        return AbstractC7043h.m28990c(context.getResources(), i7, context.getTheme());
    }

    public static Context getContextForLanguage(Context context) {
        C0101i m27840a = AbstractC6790f.m27840a(context);
        if (Build.VERSION.SDK_INT > 32 || m27840a.m268f()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        AbstractC0098f.m258b(configuration, m27840a);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.m28392b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.m28399c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i7) {
        return a.m28386b(context, i7);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.m28396a(context) : AbstractC0100h.m261a(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return a.m28387c(context);
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i7) {
        return getContextForLanguage(context).getString(i7);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) b.m28389b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return b.m28390c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.m28393c(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (AbstractC6939e.m28418b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i7) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i7);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.m28395b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
        int i8 = i7 & 1;
        if (i8 != 0 && (i7 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i8 != 0) {
            i7 |= 2;
        }
        int i9 = i7;
        int i10 = i9 & 2;
        if (i10 == 0 && (i9 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i10 != 0 && (i9 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 33 ? g.m28400a(context, broadcastReceiver, intentFilter, str, handler, i9) : i11 >= 26 ? d.m28394a(context, broadcastReceiver, intentFilter, str, handler, i9) : ((i9 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
