package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p138T4.C2461e;
import p256j$.util.DesugarCollections;
import p384y4.C7084j;

/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingBackgroundService extends AbstractServiceC4785a {

    /* renamed from: p */
    public static final List f17631p = DesugarCollections.synchronizedList(new LinkedList());

    /* renamed from: q */
    public static C2461e f17632q;

    /* renamed from: k */
    public static void m20638k(Context context, Intent intent, boolean z6) {
        AbstractServiceC4785a.m20647d(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, z6);
    }

    /* renamed from: l */
    public static /* synthetic */ void m20639l(Intent intent, CountDownLatch countDownLatch) {
        f17632q.m8333e(intent, countDownLatch);
    }

    /* renamed from: m */
    public static void m20640m() {
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        List list = f17631p;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f17632q.m8333e((Intent) it.next(), null);
                }
                f17631p.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public static void m20641n(long j7) {
        C2461e.m8331n(j7);
    }

    /* renamed from: o */
    public static void m20642o(long j7) {
        C2461e.m8332o(j7);
    }

    /* renamed from: p */
    public static void m20643p(long j7, C7084j c7084j) {
        if (f17632q != null) {
            Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        C2461e c2461e = new C2461e();
        f17632q = c2461e;
        c2461e.m8343q(j7, c7084j);
    }

    @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a
    /* renamed from: g */
    public void mo20644g(final Intent intent) {
        if (!f17632q.m8337i()) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List list = f17631p;
        synchronized (list) {
            try {
                if (f17632q.m8338j()) {
                    Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                    list.add(intent);
                    return;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(getMainLooper()).post(new Runnable() { // from class: T4.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterFirebaseMessagingBackgroundService.m20639l(intent, countDownLatch);
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException e7) {
                    Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a
    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo20645h() {
        return super.mo20645h();
    }

    @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (f17632q == null) {
            f17632q = new C2461e();
        }
        f17632q.m8342p();
    }

    @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // io.flutter.plugins.firebase.messaging.AbstractServiceC4785a, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i7, int i8) {
        return super.onStartCommand(intent, i7, i8);
    }
}
