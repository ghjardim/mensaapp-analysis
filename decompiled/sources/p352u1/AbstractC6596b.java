package p352u1;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: u1.b */
/* loaded from: classes.dex */
public abstract class AbstractC6596b {
    /* renamed from: a */
    public static SharedPreferences m27469a(Context context) {
        return context.getSharedPreferences(m27471c(context), m27470b());
    }

    /* renamed from: b */
    public static int m27470b() {
        return 0;
    }

    /* renamed from: c */
    public static String m27471c(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
