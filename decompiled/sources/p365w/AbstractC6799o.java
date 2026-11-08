package p365w;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: w.o */
/* loaded from: classes.dex */
public abstract class AbstractC6799o {
    /* renamed from: a */
    public static int m27951a(boolean z6, int i7) {
        int i8;
        if (!z6) {
            i8 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i7;
            }
            i8 = 33554432;
        }
        return i7 | i8;
    }

    /* renamed from: b */
    public static PendingIntent m27952b(Context context, int i7, Intent intent, int i8, boolean z6) {
        return PendingIntent.getActivity(context, i7, intent, m27951a(z6, i8));
    }
}
