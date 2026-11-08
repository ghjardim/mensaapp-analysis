package p187a4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.AbstractC3965a;
import java.io.IOException;

/* renamed from: a4.d0 */
/* loaded from: classes.dex */
public class RunnableC3140d0 implements Runnable {

    /* renamed from: f */
    public static final Object f9708f = new Object();

    /* renamed from: n */
    public static Boolean f9709n;

    /* renamed from: o */
    public static Boolean f9710o;

    /* renamed from: a */
    public final Context f9711a;

    /* renamed from: b */
    public final C3117J f9712b;

    /* renamed from: c */
    public final PowerManager.WakeLock f9713c;

    /* renamed from: d */
    public final C3138c0 f9714d;

    /* renamed from: e */
    public final long f9715e;

    /* renamed from: a4.d0$a */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public RunnableC3140d0 f9716a;

        public a(RunnableC3140d0 runnableC3140d0) {
            this.f9716a = runnableC3140d0;
        }

        /* renamed from: a */
        public void m11498a() {
            if (RunnableC3140d0.m11496j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC3140d0.this.f9711a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                RunnableC3140d0 runnableC3140d0 = this.f9716a;
                if (runnableC3140d0 == null) {
                    return;
                }
                if (runnableC3140d0.m11497i()) {
                    if (RunnableC3140d0.m11496j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f9716a.f9714d.m11462m(this.f9716a, 0L);
                    context.unregisterReceiver(this);
                    this.f9716a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RunnableC3140d0(C3138c0 c3138c0, Context context, C3117J c3117j, long j7) {
        this.f9714d = c3138c0;
        this.f9711a = context;
        this.f9715e = j7;
        this.f9712b = c3117j;
        this.f9713c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    public static String m11492e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    public static boolean m11493f(Context context) {
        boolean booleanValue;
        synchronized (f9708f) {
            try {
                Boolean bool = f9710o;
                Boolean valueOf = Boolean.valueOf(bool == null ? m11494g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f9710o = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    /* renamed from: g */
    public static boolean m11494g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z6 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z6 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m11492e(str));
        }
        return z6;
    }

    /* renamed from: h */
    public static boolean m11495h(Context context) {
        boolean booleanValue;
        synchronized (f9708f) {
            try {
                Boolean bool = f9709n;
                Boolean valueOf = Boolean.valueOf(bool == null ? m11494g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f9709n = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    /* renamed from: j */
    public static boolean m11496j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: i */
    public final synchronized boolean m11497i() {
        boolean z6;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f9711a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z6 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m11495h(this.f9711a)) {
            this.f9713c.acquire(AbstractC3965a.f13003a);
        }
        try {
            try {
                try {
                    this.f9714d.m11464o(true);
                } catch (Throwable th) {
                    if (m11495h(this.f9711a)) {
                        try {
                            this.f9713c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e7.getMessage());
                this.f9714d.m11464o(false);
                if (!m11495h(this.f9711a)) {
                    return;
                } else {
                    wakeLock = this.f9713c;
                }
            }
            if (!this.f9712b.m11382g()) {
                this.f9714d.m11464o(false);
                if (m11495h(this.f9711a)) {
                    try {
                        this.f9713c.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (m11493f(this.f9711a) && !m11497i()) {
                new a(this).m11498a();
                if (m11495h(this.f9711a)) {
                    try {
                        this.f9713c.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f9714d.m11468s()) {
                this.f9714d.m11464o(false);
            } else {
                this.f9714d.m11469t(this.f9715e);
            }
            if (m11495h(this.f9711a)) {
                wakeLock = this.f9713c;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
