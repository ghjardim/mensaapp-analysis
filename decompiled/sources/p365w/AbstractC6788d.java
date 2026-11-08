package p365w;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: w.d */
/* loaded from: classes.dex */
public abstract class AbstractC6788d {

    /* renamed from: w.d$a */
    public static class a {
        /* renamed from: a */
        public static Object m27832a(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: b */
        public static int m27833b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: c */
        public static String m27834c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: w.d$b */
    public static class b {
        /* renamed from: a */
        public static int m27835a(AppOpsManager appOpsManager, String str, int i7, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i7, str2);
        }

        /* renamed from: b */
        public static String m27836b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        public static AppOpsManager m27837c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m27829a(Context context, int i7, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m27830b(context, str, str2);
        }
        AppOpsManager m27837c = b.m27837c(context);
        int m27835a = b.m27835a(m27837c, str, Binder.getCallingUid(), str2);
        return m27835a != 0 ? m27835a : b.m27835a(m27837c, str, i7, b.m27836b(context));
    }

    /* renamed from: b */
    public static int m27830b(Context context, String str, String str2) {
        return a.m27833b((AppOpsManager) a.m27832a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m27831c(String str) {
        return a.m27834c(str);
    }
}
