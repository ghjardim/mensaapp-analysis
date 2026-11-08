package p138T4;

import android.content.Context;
import android.util.Log;

/* renamed from: T4.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2457a {

    /* renamed from: a */
    public static Context f7244a;

    /* renamed from: a */
    public static Context m8325a() {
        return f7244a;
    }

    /* renamed from: b */
    public static void m8326b(Context context) {
        Log.d("FLTFireContextHolder", "received application context.");
        f7244a = context;
    }
}
