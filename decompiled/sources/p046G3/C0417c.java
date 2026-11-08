package p046G3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C3948b;
import com.google.firebase.firestore.C3955i;
import java.util.List;
import java.util.Map;
import p067J3.C0723Q;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2157z;
import p116Q3.InterfaceC2153v;
import p256j$.util.Objects;

/* renamed from: G3.c */
/* loaded from: classes.dex */
public class C0417c {

    /* renamed from: a */
    public final C3955i f1545a;

    /* renamed from: b */
    public final List f1546b;

    public C0417c(C3955i c3955i, List list) {
        this.f1545a = c3955i;
        this.f1546b = list;
    }

    /* renamed from: c */
    public Task m1627c(EnumC0419d enumC0419d) {
        AbstractC2157z.m7330c(enumC0419d, "AggregateSource must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Task) this.f1545a.f12957b.m15500s(new InterfaceC2153v() { // from class: G3.a
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m1629e;
                m1629e = C0417c.this.m1629e((C0723Q) obj);
                return m1629e;
            }
        })).continueWith(AbstractC2147p.f6508b, new Continuation() { // from class: G3.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Object m1630f;
                m1630f = C0417c.this.m1630f(taskCompletionSource, task);
                return m1630f;
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: d */
    public C3955i m1628d() {
        return this.f1545a;
    }

    /* renamed from: e */
    public final /* synthetic */ Task m1629e(C0723Q c0723q) {
        return c0723q.m3054l0(this.f1545a.f12956a, this.f1546b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0417c)) {
            return false;
        }
        C0417c c0417c = (C0417c) obj;
        return this.f1545a.equals(c0417c.f1545a) && this.f1546b.equals(c0417c.f1546b);
    }

    /* renamed from: f */
    public final /* synthetic */ Object m1630f(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(new C3948b(this, (Map) task.getResult()));
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.f1545a, this.f1546b);
    }
}
