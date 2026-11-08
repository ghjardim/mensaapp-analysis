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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p038F2.ThreadFactoryC0331b;

/* renamed from: a4.Y */
/* loaded from: classes.dex */
public class RunnableC3131Y implements Runnable {

    /* renamed from: a */
    public final long f9653a;

    /* renamed from: b */
    public final PowerManager.WakeLock f9654b;

    /* renamed from: c */
    public final FirebaseMessaging f9655c;

    /* renamed from: d */
    public ExecutorService f9656d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0331b("firebase-iid-executor"));

    /* renamed from: a4.Y$a */
    public static class a extends BroadcastReceiver {

        /* renamed from: a */
        public RunnableC3131Y f9657a;

        /* renamed from: b */
        public Context f9658b;

        public a(RunnableC3131Y runnableC3131Y) {
            this.f9657a = runnableC3131Y;
        }

        /* renamed from: a */
        public void m11428a() {
            if (RunnableC3131Y.m11424c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            RunnableC3131Y runnableC3131Y = this.f9657a;
            if (runnableC3131Y != null) {
                Context m11425b = runnableC3131Y.m11425b();
                this.f9658b = m11425b;
                m11425b.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC3131Y runnableC3131Y = this.f9657a;
            if (runnableC3131Y != null && runnableC3131Y.m11426d()) {
                if (RunnableC3131Y.m11424c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f9657a.f9655c.m15732p(this.f9657a, 0L);
                Context context2 = this.f9658b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f9657a = null;
            }
        }
    }

    public RunnableC3131Y(FirebaseMessaging firebaseMessaging, long j7) {
        this.f9655c = firebaseMessaging;
        this.f9653a = j7;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m11425b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f9654b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    public static boolean m11424c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    public Context m11425b() {
        return this.f9655c.m15733q();
    }

    /* renamed from: d */
    public boolean m11426d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m11425b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: e */
    public boolean m11427e() {
        try {
            if (this.f9655c.m15730n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            if (!C3113F.m11356i(e7.getMessage())) {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3128V.m11406b().m11410e(m11425b())) {
            this.f9654b.acquire();
        }
        try {
            try {
                this.f9655c.m15722Q(true);
            } catch (IOException e7) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                this.f9655c.m15722Q(false);
                if (!C3128V.m11406b().m11410e(m11425b())) {
                    return;
                }
            }
            if (!this.f9655c.m15710B()) {
                this.f9655c.m15722Q(false);
                if (C3128V.m11406b().m11410e(m11425b())) {
                    this.f9654b.release();
                    return;
                }
                return;
            }
            if (C3128V.m11406b().m11409d(m11425b()) && !m11426d()) {
                new a(this).m11428a();
                if (C3128V.m11406b().m11410e(m11425b())) {
                    this.f9654b.release();
                    return;
                }
                return;
            }
            if (m11427e()) {
                this.f9655c.m15722Q(false);
            } else {
                this.f9655c.m15727V(this.f9653a);
            }
            if (!C3128V.m11406b().m11410e(m11425b())) {
                return;
            }
            this.f9654b.release();
        } catch (Throwable th) {
            if (C3128V.m11406b().m11410e(m11425b())) {
                this.f9654b.release();
            }
            throw th;
        }
    }
}
