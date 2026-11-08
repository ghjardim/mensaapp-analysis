package p187a4;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C3967c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p031E2.AbstractC0277m;
import p187a4.AbstractC3139d;
import p365w.AbstractC6793i;

/* renamed from: a4.e */
/* loaded from: classes.dex */
public class C3141e {

    /* renamed from: a */
    public final ExecutorService f9718a;

    /* renamed from: b */
    public final Context f9719b;

    /* renamed from: c */
    public final C3967c f9720c;

    public C3141e(Context context, C3967c c3967c, ExecutorService executorService) {
        this.f9718a = executorService;
        this.f9719b = context;
        this.f9720c = c3967c;
    }

    /* renamed from: a */
    public boolean m11499a() {
        if (this.f9720c.m15797a("gcm.n.noui")) {
            return true;
        }
        if (m11500b()) {
            return false;
        }
        C3115H m11502d = m11502d();
        AbstractC3139d.a m11475e = AbstractC3139d.m11475e(this.f9719b, this.f9720c);
        m11503e(m11475e.f9705a, m11502d);
        m11501c(m11475e);
        return true;
    }

    /* renamed from: b */
    public final boolean m11500b() {
        if (((KeyguardManager) this.f9719b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!AbstractC0277m.m1132c()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f9719b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m11501c(AbstractC3139d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f9719b.getSystemService("notification")).notify(aVar.f9706b, aVar.f9707c, aVar.f9705a.m27870b());
    }

    /* renamed from: d */
    public final C3115H m11502d() {
        C3115H m11370g = C3115H.m11370g(this.f9720c.m15811p("gcm.n.image"));
        if (m11370g != null) {
            m11370g.m11375m(this.f9718a);
        }
        return m11370g;
    }

    /* renamed from: e */
    public final void m11503e(AbstractC6793i.e eVar, C3115H c3115h) {
        if (c3115h == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(c3115h.m11373h(), 5L, TimeUnit.SECONDS);
            eVar.m27881n(bitmap);
            eVar.m27889v(new AbstractC6793i.b().m27860i(bitmap).m27859h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c3115h.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e7) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e7.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c3115h.close();
        }
    }
}
