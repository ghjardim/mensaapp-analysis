package p031E2;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: E2.f */
/* loaded from: classes.dex */
public abstract class AbstractC0270f {

    /* renamed from: a */
    public static final String[] f1090a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m1115a(Context context, Throwable th) {
        try {
            AbstractC3802r.m15129k(context);
            AbstractC3802r.m15129k(th);
            return false;
        } catch (Exception e7) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e7);
            return false;
        }
    }
}
