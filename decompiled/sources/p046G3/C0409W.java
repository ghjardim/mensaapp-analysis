package p046G3;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import p046G3.C0409W;
import p046G3.C0410X;
import p116Q3.AbstractC2133b;

/* renamed from: G3.W */
/* loaded from: classes.dex */
public class C0409W extends Task {

    /* renamed from: a */
    public final Object f1522a = new Object();

    /* renamed from: b */
    public C0410X f1523b = C0410X.f1529g;

    /* renamed from: c */
    public final TaskCompletionSource f1524c;

    /* renamed from: d */
    public final Task f1525d;

    /* renamed from: e */
    public final Queue f1526e;

    /* renamed from: G3.W$a */
    public static class a {

        /* renamed from: a */
        public Executor f1527a;

        /* renamed from: b */
        public InterfaceC0420d0 f1528b;

        public a(Executor executor, InterfaceC0420d0 interfaceC0420d0) {
            this.f1527a = executor == null ? TaskExecutors.MAIN_THREAD : executor;
            this.f1528b = interfaceC0420d0;
        }

        /* renamed from: b */
        public void m1610b(final C0410X c0410x) {
            this.f1527a.execute(new Runnable() { // from class: G3.V
                @Override // java.lang.Runnable
                public final void run() {
                    C0409W.a.this.m1611c(c0410x);
                }
            });
        }

        /* renamed from: c */
        public final /* synthetic */ void m1611c(C0410X c0410x) {
            this.f1528b.mo1633a(c0410x);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f1528b.equals(((a) obj).f1528b);
        }

        public int hashCode() {
            return this.f1528b.hashCode();
        }
    }

    public C0409W() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f1524c = taskCompletionSource;
        this.f1525d = taskCompletionSource.getTask();
        this.f1526e = new ArrayDeque();
    }

    /* renamed from: a */
    public C0409W m1603a(InterfaceC0420d0 interfaceC0420d0) {
        a aVar = new a(null, interfaceC0420d0);
        synchronized (this.f1522a) {
            this.f1526e.add(aVar);
        }
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return this.f1525d.addOnCanceledListener(onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        return this.f1525d.addOnCompleteListener(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnFailureListener(OnFailureListener onFailureListener) {
        return this.f1525d.addOnFailureListener(onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        return this.f1525d.addOnSuccessListener(onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0410X getResult() {
        return (C0410X) this.f1525d.getResult();
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0410X getResult(Class cls) {
        return (C0410X) this.f1525d.getResult(cls);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Continuation continuation) {
        return this.f1525d.continueWith(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Continuation continuation) {
        return this.f1525d.continueWithTask(continuation);
    }

    /* renamed from: d */
    public void m1606d(Exception exc) {
        synchronized (this.f1522a) {
            try {
                C0410X c0410x = new C0410X(this.f1523b.m1615d(), this.f1523b.m1618g(), this.f1523b.m1614c(), this.f1523b.m1617f(), exc, C0410X.a.ERROR);
                this.f1523b = c0410x;
                Iterator it = this.f1526e.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m1610b(c0410x);
                }
                this.f1526e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1524c.setException(exc);
    }

    /* renamed from: e */
    public void m1607e(C0410X c0410x) {
        AbstractC2133b.m7217d(c0410x.m1616e().equals(C0410X.a.SUCCESS), "Expected success, but was " + c0410x.m1616e(), new Object[0]);
        synchronized (this.f1522a) {
            try {
                this.f1523b = c0410x;
                Iterator it = this.f1526e.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m1610b(this.f1523b);
                }
                this.f1526e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1524c.setResult(c0410x);
    }

    /* renamed from: f */
    public void m1608f(C0410X c0410x) {
        synchronized (this.f1522a) {
            try {
                this.f1523b = c0410x;
                Iterator it = this.f1526e.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m1610b(c0410x);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        return this.f1525d.getException();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return this.f1525d.isCanceled();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return this.f1525d.isComplete();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return this.f1525d.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(SuccessContinuation successContinuation) {
        return this.f1525d.onSuccessTask(successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return this.f1525d.addOnCanceledListener(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        return this.f1525d.addOnCompleteListener(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return this.f1525d.addOnFailureListener(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        return this.f1525d.addOnSuccessListener(executor, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Executor executor, Continuation continuation) {
        return this.f1525d.continueWith(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Executor executor, Continuation continuation) {
        return this.f1525d.continueWithTask(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return this.f1525d.onSuccessTask(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        return this.f1525d.addOnCanceledListener(activity, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        return this.f1525d.addOnCompleteListener(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        return this.f1525d.addOnFailureListener(activity, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        return this.f1525d.addOnSuccessListener(activity, onSuccessListener);
    }
}
