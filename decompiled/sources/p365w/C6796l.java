package p365w;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* renamed from: w.l */
/* loaded from: classes.dex */
public final class C6796l {

    /* renamed from: c */
    public static final Object f24463c = new Object();

    /* renamed from: d */
    public static Set f24464d = new HashSet();

    /* renamed from: e */
    public static final Object f24465e = new Object();

    /* renamed from: a */
    public final Context f24466a;

    /* renamed from: b */
    public final NotificationManager f24467b;

    /* renamed from: w.l$a */
    public static class a {
        /* renamed from: a */
        public static boolean m27950a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    public C6796l(Context context) {
        this.f24466a = context;
        this.f24467b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public static C6796l m27948b(Context context) {
        return new C6796l(context);
    }

    /* renamed from: a */
    public boolean m27949a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m27950a(this.f24467b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f24466a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f24466a.getApplicationInfo();
        String packageName = this.f24466a.getApplicationContext().getPackageName();
        int i7 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i7), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
