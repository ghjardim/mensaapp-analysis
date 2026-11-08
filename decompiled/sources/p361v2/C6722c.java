package p361v2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import p256j$.util.Objects;
import p334s.C6318k;

/* renamed from: v2.c */
/* loaded from: classes.dex */
public class C6722c {

    /* renamed from: h */
    public static int f24253h;

    /* renamed from: i */
    public static PendingIntent f24254i;

    /* renamed from: j */
    public static final Executor f24255j = new Executor() { // from class: v2.G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k */
    public static final Pattern f24256k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    public final Context f24258b;

    /* renamed from: c */
    public final C6716E f24259c;

    /* renamed from: d */
    public final ScheduledExecutorService f24260d;

    /* renamed from: f */
    public Messenger f24262f;

    /* renamed from: g */
    public C6731l f24263g;

    /* renamed from: a */
    public final C6318k f24257a = new C6318k();

    /* renamed from: e */
    public final Messenger f24261e = new Messenger(new HandlerC6728i(this, Looper.getMainLooper()));

    public C6722c(Context context) {
        this.f24258b = context;
        this.f24259c = new C6716E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f24260d = scheduledThreadPoolExecutor;
    }

    /* renamed from: e */
    public static /* synthetic */ Task m27669e(Bundle bundle) {
        return m27673m(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m27670g(C6722c c6722c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C6730k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C6731l) {
                        c6722c.f24263g = (C6731l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c6722c.f24262f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f24256k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        c6722c.m27681l(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c6722c.f24257a) {
                        for (int i7 = 0; i7 < c6722c.f24257a.size(); i7++) {
                            try {
                                c6722c.m27681l((String) c6722c.f24257a.m26455f(i7), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
                    str2 = str2.substring(1);
                }
                c6722c.m27681l(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: j */
    public static synchronized String m27671j() {
        String num;
        synchronized (C6722c.class) {
            int i7 = f24253h;
            f24253h = i7 + 1;
            num = Integer.toString(i7);
        }
        return num;
    }

    /* renamed from: k */
    public static synchronized void m27672k(Context context, Intent intent) {
        synchronized (C6722c.class) {
            try {
                if (f24254i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f24254i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", f24254i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public static boolean m27673m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: a */
    public Task m27674a() {
        return this.f24259c.m27661a() >= 241100000 ? C6715D.m27655b(this.f24258b).m27658d(5, Bundle.EMPTY).continueWith(f24255j, new Continuation() { // from class: v2.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new C6720a(intent);
                }
                return null;
            }
        }) : Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    /* renamed from: b */
    public Task m27675b(C6720a c6720a) {
        if (this.f24259c.m27661a() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c6720a.m27664y0());
        Integer m27665z0 = c6720a.m27665z0();
        if (m27665z0 != null) {
            bundle.putInt("google.product_id", m27665z0.intValue());
        }
        return C6715D.m27655b(this.f24258b).m27657c(3, bundle);
    }

    /* renamed from: c */
    public Task m27676c(final Bundle bundle) {
        return this.f24259c.m27661a() < 12000000 ? this.f24259c.m27662b() != 0 ? m27680i(bundle).continueWithTask(f24255j, new Continuation() { // from class: v2.H
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C6722c.this.m27678f(bundle, task);
            }
        }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE")) : C6715D.m27655b(this.f24258b).m27658d(1, bundle).continueWith(f24255j, new Continuation() { // from class: v2.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    /* renamed from: d */
    public Task m27677d(boolean z6) {
        if (this.f24259c.m27661a() < 241100000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z6);
        return C6715D.m27655b(this.f24258b).m27657c(4, bundle);
    }

    /* renamed from: f */
    public final /* synthetic */ Task m27678f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m27673m((Bundle) task.getResult())) ? m27680i(bundle).onSuccessTask(f24255j, new SuccessContinuation() { // from class: v2.F
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C6722c.m27669e((Bundle) obj);
            }
        }) : task;
    }

    /* renamed from: h */
    public final /* synthetic */ void m27679h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f24257a) {
            this.f24257a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* renamed from: i */
    public final Task m27680i(Bundle bundle) {
        final String m27671j = m27671j();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f24257a) {
            this.f24257a.put(m27671j, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f24259c.m27662b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m27672k(this.f24258b, intent);
        intent.putExtra("kid", "|ID|" + m27671j + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f24261e);
        if (this.f24262f != null || this.f24263g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f24262f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f24263g.m27683b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f24260d.schedule(new Runnable() { // from class: v2.g
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(f24255j, new OnCompleteListener() { // from class: v2.h
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C6722c.this.m27679h(m27671j, schedule, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f24259c.m27662b() == 2) {
            this.f24258b.sendBroadcast(intent);
        } else {
            this.f24258b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f24260d.schedule(new Runnable() { // from class: v2.g
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f24255j, new OnCompleteListener() { // from class: v2.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C6722c.this.m27679h(m27671j, schedule2, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: l */
    public final void m27681l(String str, Bundle bundle) {
        synchronized (this.f24257a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f24257a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
