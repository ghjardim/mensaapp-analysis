package p045G2;

import android.content.Context;
import p031E2.AbstractC0277m;

/* renamed from: G2.c */
/* loaded from: classes.dex */
public abstract class AbstractC0382c {

    /* renamed from: a */
    public static Context f1485a;

    /* renamed from: b */
    public static Boolean f1486b;

    /* renamed from: a */
    public static synchronized boolean m1569a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (AbstractC0382c.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f1485a;
            if (context2 != null && (bool = f1486b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f1486b = null;
            if (AbstractC0277m.m1134e()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f1486b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f1486b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f1486b = Boolean.FALSE;
                }
            }
            f1485a = applicationContext;
            return f1486b.booleanValue();
        }
    }
}
