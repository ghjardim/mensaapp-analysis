package p187a4;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import p031E2.AbstractC0277m;
import p381y1.ExecutorC7060k;

/* renamed from: a4.Q */
/* loaded from: classes.dex */
public abstract class AbstractC3124Q {
    /* renamed from: b */
    public static SharedPreferences m11395b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* renamed from: c */
    public static boolean m11396c(Context context) {
        return m11395b(context).getBoolean("proxy_notification_initialized", false);
    }

    /* renamed from: d */
    public static boolean m11397d(SharedPreferences sharedPreferences, boolean z6) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z6;
    }

    /* renamed from: f */
    public static void m11399f(Context context, boolean z6) {
        SharedPreferences.Editor edit = m11395b(context).edit();
        edit.putBoolean("proxy_notification_initialized", z6);
        edit.apply();
    }

    /* renamed from: g */
    public static void m11400g(final Context context, C3113F c3113f, final boolean z6) {
        if (AbstractC0277m.m1136g() && !m11397d(m11395b(context), z6)) {
            c3113f.m11365l(z6).addOnSuccessListener(new ExecutorC7060k(), new OnSuccessListener() { // from class: a4.P
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AbstractC3124Q.m11401h(context, z6);
                }
            });
        }
    }

    /* renamed from: h */
    public static void m11401h(Context context, boolean z6) {
        SharedPreferences.Editor edit = m11395b(context).edit();
        edit.putBoolean("proxy_retention", z6);
        edit.apply();
    }
}
