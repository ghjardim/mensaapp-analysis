package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.AbstractC3975E;
import com.google.firebase.storage.C3982L;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;
import p256j$.util.Objects;

/* renamed from: com.google.firebase.storage.E */
/* loaded from: classes.dex */
public abstract class AbstractC3975E extends AbstractC3987c {

    /* renamed from: j */
    public static final HashMap f13056j;

    /* renamed from: k */
    public static final HashMap f13057k;

    /* renamed from: a */
    public final Object f13058a = new Object();

    /* renamed from: b */
    public final C3982L f13059b = new C3982L(this, 128, new C3982L.a() { // from class: com.google.firebase.storage.r
        @Override // com.google.firebase.storage.C3982L.a
        /* renamed from: a */
        public final void mo15970a(Object obj, Object obj2) {
            AbstractC3975E.this.m15894P((OnSuccessListener) obj, (AbstractC3975E.a) obj2);
        }
    });

    /* renamed from: c */
    public final C3982L f13060c = new C3982L(this, 64, new C3982L.a() { // from class: com.google.firebase.storage.v
        @Override // com.google.firebase.storage.C3982L.a
        /* renamed from: a */
        public final void mo15970a(Object obj, Object obj2) {
            AbstractC3975E.this.m15895Q((OnFailureListener) obj, (AbstractC3975E.a) obj2);
        }
    });

    /* renamed from: d */
    public final C3982L f13061d = new C3982L(this, 448, new C3982L.a() { // from class: com.google.firebase.storage.w
        @Override // com.google.firebase.storage.C3982L.a
        /* renamed from: a */
        public final void mo15970a(Object obj, Object obj2) {
            AbstractC3975E.this.m15896R((OnCompleteListener) obj, (AbstractC3975E.a) obj2);
        }
    });

    /* renamed from: e */
    public final C3982L f13062e = new C3982L(this, 256, new C3982L.a() { // from class: com.google.firebase.storage.x
        @Override // com.google.firebase.storage.C3982L.a
        /* renamed from: a */
        public final void mo15970a(Object obj, Object obj2) {
            AbstractC3975E.this.m15897S((OnCanceledListener) obj, (AbstractC3975E.a) obj2);
        }
    });

    /* renamed from: f */
    public final C3982L f13063f = new C3982L(this, -465, new C3982L.a() { // from class: com.google.firebase.storage.y
        @Override // com.google.firebase.storage.C3982L.a
        /* renamed from: a */
        public final void mo15970a(Object obj, Object obj2) {
            ((InterfaceC3997m) obj).mo8646a((AbstractC3975E.a) obj2);
        }
    });

    /* renamed from: g */
    public final C3982L f13064g = new C3982L(this, 16, new C3982L.a() { // from class: com.google.firebase.storage.z
        @Override // com.google.firebase.storage.C3982L.a
        /* renamed from: a */
        public final void mo15970a(Object obj, Object obj2) {
            ((InterfaceC3996l) obj).mo8647a((AbstractC3975E.a) obj2);
        }
    });

    /* renamed from: h */
    public volatile int f13065h = 1;

    /* renamed from: i */
    public a f13066i;

    /* renamed from: com.google.firebase.storage.E$a */
    public interface a {
        /* renamed from: a */
        Exception mo15933a();
    }

    /* renamed from: com.google.firebase.storage.E$b */
    public class b implements a {

        /* renamed from: a */
        public final Exception f13067a;

        public b(Exception exc) {
            if (exc != null) {
                this.f13067a = exc;
                return;
            }
            if (AbstractC3975E.this.isCanceled()) {
                this.f13067a = C3998n.m16023c(Status.f12252q);
            } else if (AbstractC3975E.this.m15880B() == 64) {
                this.f13067a = C3998n.m16023c(Status.f12250o);
            } else {
                this.f13067a = null;
            }
        }

        @Override // com.google.firebase.storage.AbstractC3975E.a
        /* renamed from: a */
        public Exception mo15933a() {
            return this.f13067a;
        }

        /* renamed from: b */
        public C4000p m15934b() {
            return m15935c().mo15887I();
        }

        /* renamed from: c */
        public AbstractC3975E m15935c() {
            return AbstractC3975E.this;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f13056j = hashMap;
        HashMap hashMap2 = new HashMap();
        f13057k = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(16, 256)));
        hashMap.put(2, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet(Arrays.asList(2, 256)));
        hashMap.put(64, new HashSet(Arrays.asList(2, 256)));
        hashMap2.put(1, new HashSet(Arrays.asList(2, 64)));
        hashMap2.put(2, new HashSet(Arrays.asList(4, 64, 128)));
        hashMap2.put(4, new HashSet(Arrays.asList(4, 64, 128)));
        hashMap2.put(8, new HashSet(Arrays.asList(16, 64, 128)));
        hashMap2.put(32, new HashSet(Arrays.asList(256, 64, 128)));
    }

    /* renamed from: T */
    public static /* synthetic */ void m15870T(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, a aVar) {
        try {
            Task then = successContinuation.then(aVar);
            Objects.requireNonNull(taskCompletionSource);
            then.addOnSuccessListener(new C4003s(taskCompletionSource));
            then.addOnFailureListener(new C4004t(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            then.addOnCanceledListener(new C4005u(cancellationTokenSource));
        } catch (RuntimeExecutionException e7) {
            if (e7.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e7.getCause());
            } else {
                taskCompletionSource.setException(e7);
            }
        } catch (Exception e8) {
            taskCompletionSource.setException(e8);
        }
    }

    /* renamed from: A */
    public final a m15879A() {
        a aVar = this.f13066i;
        if (aVar != null) {
            return aVar;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f13066i == null) {
            this.f13066i = m15910g0();
        }
        return this.f13066i;
    }

    /* renamed from: B */
    public int m15880B() {
        return this.f13065h;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public a getResult() {
        if (m15879A() == null) {
            throw new IllegalStateException();
        }
        Exception mo15933a = m15879A().mo15933a();
        if (mo15933a == null) {
            return m15879A();
        }
        throw new RuntimeExecutionException(mo15933a);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public a getResult(Class cls) {
        if (m15879A() == null) {
            throw new IllegalStateException();
        }
        if (cls.isInstance(m15879A().mo15933a())) {
            throw ((Throwable) cls.cast(m15879A().mo15933a()));
        }
        Exception mo15933a = m15879A().mo15933a();
        if (mo15933a == null) {
            return m15879A();
        }
        throw new RuntimeExecutionException(mo15933a);
    }

    /* renamed from: E */
    public Runnable m15883E() {
        return new Runnable() { // from class: com.google.firebase.storage.B
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3975E.this.m15893O();
            }
        };
    }

    /* renamed from: F */
    public a m15884F() {
        return m15910g0();
    }

    /* renamed from: G */
    public final String m15885G(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? i7 != 16 ? i7 != 32 ? i7 != 64 ? i7 != 128 ? i7 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    /* renamed from: H */
    public final String m15886H(int[] iArr) {
        if (iArr.length == 0) {
            return StringUtils.EMPTY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 : iArr) {
            sb.append(m15885G(i7));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: I */
    public abstract C4000p mo15887I();

    /* renamed from: J */
    public Object m15888J() {
        return this.f13058a;
    }

    /* renamed from: K */
    public boolean m15889K() {
        return (m15880B() & (-465)) != 0;
    }

    /* renamed from: L */
    public boolean m15890L() {
        return (m15880B() & 16) != 0;
    }

    /* renamed from: M */
    public final /* synthetic */ void m15891M(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        try {
            Object then = continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setResult(then);
        } catch (RuntimeExecutionException e7) {
            if (e7.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e7.getCause());
            } else {
                taskCompletionSource.setException(e7);
            }
        } catch (Exception e8) {
            taskCompletionSource.setException(e8);
        }
    }

    /* renamed from: N */
    public final /* synthetic */ void m15892N(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new C4003s(taskCompletionSource));
            task2.addOnFailureListener(new C4004t(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new C4005u(cancellationTokenSource));
        } catch (RuntimeExecutionException e7) {
            if (e7.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e7.getCause());
            } else {
                taskCompletionSource.setException(e7);
            }
        } catch (Exception e8) {
            taskCompletionSource.setException(e8);
        }
    }

    /* renamed from: O */
    public final /* synthetic */ void m15893O() {
        try {
            mo15908e0();
        } finally {
            m15932z();
        }
    }

    /* renamed from: P */
    public final /* synthetic */ void m15894P(OnSuccessListener onSuccessListener, a aVar) {
        C3976F.m15936b().m15938c(this);
        onSuccessListener.onSuccess(aVar);
    }

    /* renamed from: Q */
    public final /* synthetic */ void m15895Q(OnFailureListener onFailureListener, a aVar) {
        C3976F.m15936b().m15938c(this);
        onFailureListener.onFailure(aVar.mo15933a());
    }

    /* renamed from: R */
    public final /* synthetic */ void m15896R(OnCompleteListener onCompleteListener, a aVar) {
        C3976F.m15936b().m15938c(this);
        onCompleteListener.onComplete(this);
    }

    /* renamed from: S */
    public final /* synthetic */ void m15897S(OnCanceledListener onCanceledListener, a aVar) {
        C3976F.m15936b().m15938c(this);
        onCanceledListener.onCanceled();
    }

    /* renamed from: U */
    public void mo15898U() {
    }

    /* renamed from: V */
    public void m15899V() {
    }

    /* renamed from: W */
    public void m15900W() {
    }

    /* renamed from: X */
    public void mo15901X() {
    }

    /* renamed from: Y */
    public void m15902Y() {
    }

    /* renamed from: Z */
    public void m15903Z() {
    }

    /* renamed from: a0 */
    public boolean mo15904a0() {
        return m15917k0(new int[]{16, 8}, true);
    }

    /* renamed from: b0 */
    public boolean m15905b0() {
        if (!m15915j0(2, false)) {
            return false;
        }
        mo15909f0();
        return true;
    }

    /* renamed from: c0 */
    public void mo15906c0() {
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Continuation continuation) {
        return m15930x(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Continuation continuation) {
        return m15931y(null, continuation);
    }

    /* renamed from: d0 */
    public boolean mo15907d0() {
        if (!m15915j0(2, true)) {
            return false;
        }
        mo15906c0();
        mo15909f0();
        return true;
    }

    /* renamed from: e0 */
    public abstract void mo15908e0();

    /* renamed from: f0 */
    public abstract void mo15909f0();

    /* renamed from: g0 */
    public a m15910g0() {
        a mo15911h0;
        synchronized (this.f13058a) {
            mo15911h0 = mo15911h0();
        }
        return mo15911h0;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        if (m15879A() == null) {
            return null;
        }
        return m15879A().mo15933a();
    }

    /* renamed from: h0 */
    public abstract a mo15911h0();

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        AbstractC3802r.m15129k(onCanceledListener);
        AbstractC3802r.m15129k(activity);
        this.f13062e.m15964d(activity, null, onCanceledListener);
        return this;
    }

    /* renamed from: i0 */
    public final Task m15913i0(Executor executor, final SuccessContinuation successContinuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f13059b.m15964d(null, executor, new OnSuccessListener() { // from class: com.google.firebase.storage.D
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                AbstractC3975E.m15870T(SuccessContinuation.this, taskCompletionSource, cancellationTokenSource, (AbstractC3975E.a) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return m15880B() == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return (m15880B() & 448) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return (m15880B() & 128) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnCanceledListener(OnCanceledListener onCanceledListener) {
        AbstractC3802r.m15129k(onCanceledListener);
        this.f13062e.m15964d(null, null, onCanceledListener);
        return this;
    }

    /* renamed from: j0 */
    public boolean m15915j0(int i7, boolean z6) {
        return m15917k0(new int[]{i7}, z6);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        AbstractC3802r.m15129k(onCanceledListener);
        AbstractC3802r.m15129k(executor);
        this.f13062e.m15964d(null, executor, onCanceledListener);
        return this;
    }

    /* renamed from: k0 */
    public boolean m15917k0(int[] iArr, boolean z6) {
        HashMap hashMap = z6 ? f13056j : f13057k;
        synchronized (this.f13058a) {
            try {
                for (int i7 : iArr) {
                    HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(m15880B()));
                    if (hashSet != null && hashSet.contains(Integer.valueOf(i7))) {
                        this.f13065h = i7;
                        int i8 = this.f13065h;
                        if (i8 == 2) {
                            C3976F.m15936b().m15937a(this);
                            m15902Y();
                        } else if (i8 == 4) {
                            mo15901X();
                        } else if (i8 == 16) {
                            m15900W();
                        } else if (i8 == 64) {
                            m15899V();
                        } else if (i8 == 128) {
                            m15903Z();
                        } else if (i8 == 256) {
                            mo15898U();
                        }
                        this.f13059b.m15968h();
                        this.f13060c.m15968h();
                        this.f13062e.m15968h();
                        this.f13061d.m15968h();
                        this.f13064g.m15968h();
                        this.f13063f.m15968h();
                        if (Log.isLoggable("StorageTask", 3)) {
                            Log.d("StorageTask", "changed internal state to: " + m15885G(i7) + " isUser: " + z6 + " from state:" + m15885G(this.f13065h));
                        }
                        return true;
                    }
                }
                Log.w("StorageTask", "unable to change internal state to: " + m15886H(iArr) + " isUser: " + z6 + " from state:" + m15885G(this.f13065h));
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        AbstractC3802r.m15129k(onCompleteListener);
        AbstractC3802r.m15129k(activity);
        this.f13061d.m15964d(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnCompleteListener(OnCompleteListener onCompleteListener) {
        AbstractC3802r.m15129k(onCompleteListener);
        this.f13061d.m15964d(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        AbstractC3802r.m15129k(onCompleteListener);
        AbstractC3802r.m15129k(executor);
        this.f13061d.m15964d(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        AbstractC3802r.m15129k(onFailureListener);
        AbstractC3802r.m15129k(activity);
        this.f13060c.m15964d(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(SuccessContinuation successContinuation) {
        return m15913i0(null, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnFailureListener(OnFailureListener onFailureListener) {
        AbstractC3802r.m15129k(onFailureListener);
        this.f13060c.m15964d(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        AbstractC3802r.m15129k(onFailureListener);
        AbstractC3802r.m15129k(executor);
        this.f13060c.m15964d(null, executor, onFailureListener);
        return this;
    }

    /* renamed from: r */
    public AbstractC3975E m15924r(InterfaceC3996l interfaceC3996l) {
        AbstractC3802r.m15129k(interfaceC3996l);
        this.f13064g.m15964d(null, null, interfaceC3996l);
        return this;
    }

    /* renamed from: s */
    public AbstractC3975E m15925s(InterfaceC3997m interfaceC3997m) {
        AbstractC3802r.m15129k(interfaceC3997m);
        this.f13063f.m15964d(null, null, interfaceC3997m);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        AbstractC3802r.m15129k(activity);
        AbstractC3802r.m15129k(onSuccessListener);
        this.f13059b.m15964d(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnSuccessListener(OnSuccessListener onSuccessListener) {
        AbstractC3802r.m15129k(onSuccessListener);
        this.f13059b.m15964d(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC3975E addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        AbstractC3802r.m15129k(executor);
        AbstractC3802r.m15129k(onSuccessListener);
        this.f13059b.m15964d(null, executor, onSuccessListener);
        return this;
    }

    /* renamed from: w */
    public boolean m15929w() {
        return m15917k0(new int[]{256, 32}, true);
    }

    /* renamed from: x */
    public final Task m15930x(Executor executor, final Continuation continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13061d.m15964d(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.A
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractC3975E.this.m15891M(continuation, taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: y */
    public final Task m15931y(Executor executor, final Continuation continuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f13061d.m15964d(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.C
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractC3975E.this.m15892N(continuation, taskCompletionSource, cancellationTokenSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: z */
    public final void m15932z() {
        if (isComplete() || m15890L() || m15880B() == 2 || m15915j0(256, false)) {
            return;
        }
        m15915j0(64, false);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Executor executor, Continuation continuation) {
        return m15930x(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Executor executor, Continuation continuation) {
        return m15931y(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return m15913i0(executor, successContinuation);
    }
}
