package p187a4;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p334s.C6308a;

/* renamed from: a4.c0 */
/* loaded from: classes.dex */
public class C3138c0 {

    /* renamed from: i */
    public static final long f9695i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f9696a;

    /* renamed from: b */
    public final C3117J f9697b;

    /* renamed from: c */
    public final C3113F f9698c;

    /* renamed from: d */
    public final FirebaseMessaging f9699d;

    /* renamed from: f */
    public final ScheduledExecutorService f9701f;

    /* renamed from: h */
    public final C3134a0 f9703h;

    /* renamed from: e */
    public final Map f9700e = new C6308a();

    /* renamed from: g */
    public boolean f9702g = false;

    public C3138c0(FirebaseMessaging firebaseMessaging, C3117J c3117j, C3134a0 c3134a0, C3113F c3113f, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f9699d = firebaseMessaging;
        this.f9697b = c3117j;
        this.f9703h = c3134a0;
        this.f9698c = c3113f;
        this.f9696a = context;
        this.f9701f = scheduledExecutorService;
    }

    /* renamed from: c */
    public static void m11451c(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            e = e7;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e8);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e9) {
            e = e9;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: f */
    public static Task m11452f(final FirebaseMessaging firebaseMessaging, final C3117J c3117j, final C3113F c3113f, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: a4.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3138c0 m11454j;
                m11454j = C3138c0.m11454j(context, scheduledExecutorService, firebaseMessaging, c3117j, c3113f);
                return m11454j;
            }
        });
    }

    /* renamed from: h */
    public static boolean m11453h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: j */
    public static /* synthetic */ C3138c0 m11454j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C3117J c3117j, C3113F c3113f) {
        return new C3138c0(firebaseMessaging, c3117j, C3134a0.m11439b(context, scheduledExecutorService), c3113f, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void m11455b(C3132Z c3132z, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f9700e) {
            try {
                String m11435e = c3132z.m11435e();
                if (this.f9700e.containsKey(m11435e)) {
                    arrayDeque = (ArrayDeque) this.f9700e.get(m11435e);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f9700e.put(m11435e, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m11456d(String str) {
        m11451c(this.f9698c.m11367n(this.f9699d.m15730n(), str));
    }

    /* renamed from: e */
    public final void m11457e(String str) {
        m11451c(this.f9698c.m11368o(this.f9699d.m15730n(), str));
    }

    /* renamed from: g */
    public boolean m11458g() {
        return this.f9703h.m11441c() != null;
    }

    /* renamed from: i */
    public synchronized boolean m11459i() {
        return this.f9702g;
    }

    /* renamed from: k */
    public final void m11460k(C3132Z c3132z) {
        synchronized (this.f9700e) {
            try {
                String m11435e = c3132z.m11435e();
                if (this.f9700e.containsKey(m11435e)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f9700e.get(m11435e);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f9700e.remove(m11435e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: IOException -> 0x001f, TryCatch #0 {IOException -> 0x001f, blocks: (B:3:0x0003, B:12:0x0033, B:14:0x0039, B:17:0x0053, B:19:0x0060, B:20:0x007c, B:22:0x0089, B:23:0x0015, B:26:0x0022), top: B:2:0x0003 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m11461l(p187a4.C3132Z r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.m11433b()     // Catch: java.io.IOException -> L1f
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L1f
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L22
            r4 = 85
            if (r3 == r4) goto L15
            goto L2c
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r5
            goto L2d
        L1f:
            r7 = move-exception
            goto La5
        L22:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r1
            goto L2d
        L2c:
            r2 = -1
        L2d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L7c
            if (r2 == r5) goto L53
            boolean r2 = m11453h()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L53:
            java.lang.String r2 = r7.m11434c()     // Catch: java.io.IOException -> L1f
            r6.m11457e(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = m11453h()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.m11434c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L7c:
            java.lang.String r2 = r7.m11434c()     // Catch: java.io.IOException -> L1f
            r6.m11456d(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = m11453h()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.m11434c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
        La4:
            return r5
        La5:
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld7
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld7
            java.lang.String r2 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lca
            goto Ld7
        Lca:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Ld6
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        Ld6:
            throw r7
        Ld7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p187a4.C3138c0.m11461l(a4.Z):boolean");
    }

    /* renamed from: m */
    public void m11462m(Runnable runnable, long j7) {
        this.f9701f.schedule(runnable, j7, TimeUnit.SECONDS);
    }

    /* renamed from: n */
    public Task m11463n(C3132Z c3132z) {
        this.f9703h.m11440a(c3132z);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m11455b(c3132z, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public synchronized void m11464o(boolean z6) {
        this.f9702g = z6;
    }

    /* renamed from: p */
    public final void m11465p() {
        if (m11459i()) {
            return;
        }
        m11469t(0L);
    }

    /* renamed from: q */
    public void m11466q() {
        if (m11458g()) {
            m11465p();
        }
    }

    /* renamed from: r */
    public Task m11467r(String str) {
        Task m11463n = m11463n(C3132Z.m11431f(str));
        m11466q();
        return m11463n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (m11453h() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        return true;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m11468s() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            a4.a0 r0 = r2.f9703h     // Catch: java.lang.Throwable -> L17
            a4.Z r0 = r0.m11441c()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = m11453h()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r0 = 1
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.m11461l(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            a4.a0 r1 = r2.f9703h
            r1.m11443e(r0)
            r2.m11460k(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p187a4.C3138c0.m11468s():boolean");
    }

    /* renamed from: t */
    public void m11469t(long j7) {
        m11462m(new RunnableC3140d0(this, this.f9696a, this.f9697b, Math.min(Math.max(30L, 2 * j7), f9695i)), j7);
        m11464o(true);
    }

    /* renamed from: u */
    public Task m11470u(String str) {
        Task m11463n = m11463n(C3132Z.m11432g(str));
        m11466q();
        return m11463n;
    }
}
