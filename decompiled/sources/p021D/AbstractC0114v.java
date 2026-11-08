package p021D;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: D.v */
/* loaded from: classes.dex */
public abstract class AbstractC0114v {

    /* renamed from: D.v$a */
    public static class a {
        /* renamed from: a */
        public static boolean m285a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m284a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m285a(context);
        }
        return true;
    }
}
