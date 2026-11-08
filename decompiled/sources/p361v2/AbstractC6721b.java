package p361v2;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p038F2.ThreadFactoryC0331b;
import p256j$.util.Objects;

/* renamed from: v2.b */
/* loaded from: classes.dex */
public abstract class AbstractC6721b extends BroadcastReceiver {

    /* renamed from: a */
    public static SoftReference f24251a;

    /* renamed from: b */
    public static SoftReference f24252b;

    /* renamed from: a */
    public Executor m27666a() {
        ExecutorService executorService;
        synchronized (AbstractC6721b.class) {
            try {
                SoftReference softReference = f24251a;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    zze.zza();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC0331b("firebase-iid-executor")));
                    f24251a = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    /* renamed from: b */
    public abstract int mo15683b(Context context, C6720a c6720a);

    /* renamed from: c */
    public abstract void mo15684c(Context context, Bundle bundle);

    /* renamed from: d */
    public final /* synthetic */ void m27667d(Intent intent, final Context context, boolean z6, BroadcastReceiver.PendingResult pendingResult) {
        Executor executor;
        int i7;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i7 = m27668e(context, intent2);
            } else if (intent.getExtras() == null) {
                i7 = 500;
            } else {
                final C6720a c6720a = new C6720a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC6721b.class) {
                    try {
                        SoftReference softReference = f24252b;
                        executor = softReference != null ? (Executor) softReference.get() : null;
                        if (executor == null) {
                            zze.zza();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0331b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f24252b = new SoftReference(executor);
                        }
                    } finally {
                    }
                }
                executor.execute(new Runnable() { // from class: v2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task m27657c;
                        C6720a c6720a2 = c6720a;
                        if (TextUtils.isEmpty(c6720a2.m27664y0())) {
                            m27657c = Tasks.forResult(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", c6720a2.m27664y0());
                            Integer m27665z0 = c6720a2.m27665z0();
                            if (m27665z0 != null) {
                                bundle.putInt("google.product_id", m27665z0.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            m27657c = C6715D.m27655b(context2).m27657c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        m27657c.addOnCompleteListener(new Executor() { // from class: v2.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new OnCompleteListener() { // from class: v2.n
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int mo15683b = mo15683b(context, c6720a);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e7) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e7.toString()));
                }
                i7 = mo15683b;
            }
            if (z6 && pendingResult != null) {
                pendingResult.setResultCode(i7);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final int m27668e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            mo15684c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        m27666a().execute(new Runnable() { // from class: v2.p
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6721b.this.m27667d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
