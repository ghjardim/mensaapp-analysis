package p175Z;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* renamed from: Z.a */
/* loaded from: classes.dex */
public abstract class AbstractC2958a extends BroadcastReceiver {

    /* renamed from: a */
    public static final SparseArray f9080a = new SparseArray();

    /* renamed from: b */
    public static int f9081b = 1;

    /* renamed from: b */
    public static boolean m10662b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray sparseArray = f9080a;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static ComponentName m10663c(Context context, Intent intent) {
        SparseArray sparseArray = f9080a;
        synchronized (sparseArray) {
            try {
                int i7 = f9081b;
                int i8 = i7 + 1;
                f9081b = i8;
                if (i8 <= 0) {
                    f9081b = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i7);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i7, newWakeLock);
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
