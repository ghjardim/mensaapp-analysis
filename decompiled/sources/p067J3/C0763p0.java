package p067J3;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C3952f;
import p046G3.C0460x0;
import p109P3.C1911U;
import p109P3.C1938r;
import p116Q3.C2138g;
import p116Q3.C2149r;
import p116Q3.InterfaceC2153v;

/* renamed from: J3.p0 */
/* loaded from: classes.dex */
public class C0763p0 {

    /* renamed from: a */
    public C2138g f2732a;

    /* renamed from: b */
    public C1911U f2733b;

    /* renamed from: c */
    public InterfaceC2153v f2734c;

    /* renamed from: d */
    public int f2735d;

    /* renamed from: e */
    public C2149r f2736e;

    /* renamed from: f */
    public TaskCompletionSource f2737f = new TaskCompletionSource();

    public C0763p0(C2138g c2138g, C1911U c1911u, C0460x0 c0460x0, InterfaceC2153v interfaceC2153v) {
        this.f2732a = c2138g;
        this.f2733b = c1911u;
        this.f2734c = interfaceC2153v;
        this.f2735d = c0460x0.m1690a();
        this.f2736e = new C2149r(c2138g, C2138g.d.RETRY_TRANSACTION);
    }

    /* renamed from: e */
    public static boolean m3279e(Exception exc) {
        if (!(exc instanceof C3952f)) {
            return false;
        }
        C3952f c3952f = (C3952f) exc;
        C3952f.a m15582a = c3952f.m15582a();
        return m15582a == C3952f.a.ABORTED || m15582a == C3952f.a.ALREADY_EXISTS || m15582a == C3952f.a.FAILED_PRECONDITION || !C1938r.m6891h(c3952f.m15582a());
    }

    /* renamed from: d */
    public final void m3280d(Task task) {
        if (this.f2735d <= 0 || !m3279e(task.getException())) {
            this.f2737f.setException(task.getException());
        } else {
            m3285j();
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m3281f(Task task, Task task2) {
        if (task2.isSuccessful()) {
            this.f2737f.setResult(task.getResult());
        } else {
            m3280d(task2);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m3282g(C0755l0 c0755l0, final Task task) {
        if (task.isSuccessful()) {
            c0755l0.m3239c().addOnCompleteListener(this.f2732a.m7237o(), new OnCompleteListener() { // from class: J3.m0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    C0763p0.this.m3281f(task, task2);
                }
            });
        } else {
            m3280d(task);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void m3283h() {
        final C0755l0 m6738p = this.f2733b.m6738p();
        ((Task) this.f2734c.apply(m6738p)).addOnCompleteListener(this.f2732a.m7237o(), new OnCompleteListener() { // from class: J3.o0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C0763p0.this.m3282g(m6738p, task);
            }
        });
    }

    /* renamed from: i */
    public Task m3284i() {
        m3285j();
        return this.f2737f.getTask();
    }

    /* renamed from: j */
    public final void m3285j() {
        this.f2735d--;
        this.f2736e.m7297b(new Runnable() { // from class: J3.n0
            @Override // java.lang.Runnable
            public final void run() {
                C0763p0.this.m3283h();
            }
        });
    }
}
