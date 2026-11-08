package p067J3;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C3952f;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p046G3.C0409W;
import p046G3.C0460x0;
import p046G3.InterfaceC0447r;
import p053H3.AbstractC0555a;
import p053H3.C0564j;
import p060I3.C0644f;
import p060I3.C0645g;
import p060I3.C0648j;
import p067J3.AbstractC0750j;
import p067J3.C0760o;
import p081L3.AbstractC1085i0;
import p081L3.C1024K;
import p081L3.C1093l;
import p081L3.C1097m0;
import p081L3.InterfaceC1032M1;
import p088M3.C1170l;
import p088M3.InterfaceC1167i;
import p109P3.C1907P;
import p109P3.C1911U;
import p109P3.InterfaceC1901J;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.C2138g;
import p116Q3.InterfaceC2153v;
import p116Q3.InterfaceC2154w;

/* renamed from: J3.Q */
/* loaded from: classes.dex */
public final class C0723Q {

    /* renamed from: a */
    public final C0754l f2541a;

    /* renamed from: b */
    public final AbstractC0555a f2542b;

    /* renamed from: c */
    public final AbstractC0555a f2543c;

    /* renamed from: d */
    public final C2138g f2544d;

    /* renamed from: e */
    public final C0645g f2545e;

    /* renamed from: f */
    public AbstractC1085i0 f2546f;

    /* renamed from: g */
    public C1024K f2547g;

    /* renamed from: h */
    public C1911U f2548h;

    /* renamed from: i */
    public C0745g0 f2549i;

    /* renamed from: j */
    public C0760o f2550j;

    /* renamed from: k */
    public InterfaceC1032M1 f2551k;

    /* renamed from: l */
    public InterfaceC1032M1 f2552l;

    public C0723Q(final Context context, C0754l c0754l, AbstractC0555a abstractC0555a, AbstractC0555a abstractC0555a2, final C2138g c2138g, final InterfaceC1901J interfaceC1901J, final AbstractC0750j abstractC0750j) {
        this.f2541a = c0754l;
        this.f2542b = abstractC0555a;
        this.f2543c = abstractC0555a2;
        this.f2544d = c2138g;
        this.f2545e = new C0645g(new C1907P(c0754l.m3230a()));
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c2138g.m7234l(new Runnable() { // from class: J3.C
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3040U(taskCompletionSource, context, abstractC0750j, interfaceC1901J);
            }
        });
        abstractC0555a.mo2142d(new InterfaceC2154w() { // from class: J3.I
            @Override // p116Q3.InterfaceC2154w
            /* renamed from: a */
            public final void mo2991a(Object obj) {
                C0723Q.this.m3042W(atomicBoolean, taskCompletionSource, c2138g, (C0564j) obj);
            }
        });
        abstractC0555a2.mo2142d(new InterfaceC2154w() { // from class: J3.J
            @Override // p116Q3.InterfaceC2154w
            /* renamed from: a */
            public final void mo2991a(Object obj) {
                C0723Q.m2993X((String) obj);
            }
        });
    }

    /* renamed from: O */
    public static /* synthetic */ InterfaceC1167i m2992O(Task task) {
        InterfaceC1167i interfaceC1167i = (InterfaceC1167i) task.getResult();
        if (interfaceC1167i.mo4482c()) {
            return interfaceC1167i;
        }
        if (interfaceC1167i.mo4488i()) {
            return null;
        }
        throw new C3952f("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", C3952f.a.UNAVAILABLE);
    }

    /* renamed from: A */
    public Task m3021A(final List list) {
        m3059q0();
        return this.f2544d.m7231i(new Runnable() { // from class: J3.w
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3031K(list);
            }
        });
    }

    /* renamed from: B */
    public void m3022B() {
        m3059q0();
        this.f2544d.m7234l(new Runnable() { // from class: J3.P
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3032L();
            }
        });
    }

    /* renamed from: C */
    public Task m3023C() {
        m3059q0();
        return this.f2544d.m7231i(new Runnable() { // from class: J3.y
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3033M();
            }
        });
    }

    /* renamed from: D */
    public Task m3024D() {
        m3059q0();
        return this.f2544d.m7231i(new Runnable() { // from class: J3.x
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3034N();
            }
        });
    }

    /* renamed from: E */
    public Task m3025E(final C1170l c1170l) {
        m3059q0();
        return this.f2544d.m7232j(new Callable() { // from class: J3.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC1167i m3035P;
                m3035P = C0723Q.this.m3035P(c1170l);
                return m3035P;
            }
        }).continueWith(new Continuation() { // from class: J3.u
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                InterfaceC1167i m2992O;
                m2992O = C0723Q.m2992O(task);
                return m2992O;
            }
        });
    }

    /* renamed from: F */
    public Task m3026F(final C0737c0 c0737c0) {
        m3059q0();
        return this.f2544d.m7232j(new Callable() { // from class: J3.L
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C0783z0 m3036Q;
                m3036Q = C0723Q.this.m3036Q(c0737c0);
                return m3036Q;
            }
        });
    }

    /* renamed from: G */
    public Task m3027G(final String str) {
        m3059q0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2544d.m7234l(new Runnable() { // from class: J3.N
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3037R(str, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: H */
    public final void m3028H(Context context, C0564j c0564j, AbstractC0750j abstractC0750j, InterfaceC1901J interfaceC1901J) {
        AbstractC2155x.m7309a("FirestoreClient", "Initializing. user=%s", c0564j.m2161a());
        abstractC0750j.m3219s(new AbstractC0750j.a(context, this.f2544d, this.f2541a, c0564j, 100, this.f2542b, this.f2543c, interfaceC1901J));
        this.f2546f = abstractC0750j.m3215o();
        this.f2552l = abstractC0750j.m3212l();
        this.f2547g = abstractC0750j.m3214n();
        this.f2548h = abstractC0750j.m3217q();
        this.f2549i = abstractC0750j.m3218r();
        this.f2550j = abstractC0750j.m3211k();
        C1093l m3213m = abstractC0750j.m3213m();
        InterfaceC1032M1 interfaceC1032M1 = this.f2552l;
        if (interfaceC1032M1 != null) {
            interfaceC1032M1.start();
        }
        if (m3213m != null) {
            C1093l.a m4322f = m3213m.m4322f();
            this.f2551k = m4322f;
            m4322f.start();
        }
    }

    /* renamed from: I */
    public boolean m3029I() {
        return this.f2544d.m7238p();
    }

    /* renamed from: J */
    public final /* synthetic */ void m3030J(InterfaceC0447r interfaceC0447r) {
        this.f2550j.m3257e(interfaceC0447r);
    }

    /* renamed from: K */
    public final /* synthetic */ void m3031K(List list) {
        this.f2547g.m3999A(list);
    }

    /* renamed from: L */
    public final /* synthetic */ void m3032L() {
        this.f2547g.m4000B();
    }

    /* renamed from: M */
    public final /* synthetic */ void m3033M() {
        this.f2548h.m6739q();
    }

    /* renamed from: N */
    public final /* synthetic */ void m3034N() {
        this.f2548h.m6741s();
    }

    /* renamed from: P */
    public final /* synthetic */ InterfaceC1167i m3035P(C1170l c1170l) {
        return this.f2547g.m4034k0(c1170l);
    }

    /* renamed from: Q */
    public final /* synthetic */ C0783z0 m3036Q(C0737c0 c0737c0) {
        C1097m0 m4001C = this.f2547g.m4001C(c0737c0, true);
        C0779x0 c0779x0 = new C0779x0(c0737c0, m4001C.m4344b());
        return c0779x0.m3313b(c0779x0.m3318h(m4001C.m4343a())).m3329b();
    }

    /* renamed from: R */
    public final /* synthetic */ void m3037R(String str, TaskCompletionSource taskCompletionSource) {
        C0648j m4008J = this.f2547g.m4008J(str);
        if (m4008J == null) {
            taskCompletionSource.setResult(null);
        } else {
            C0747h0 m2606b = m4008J.m2607a().m2606b();
            taskCompletionSource.setResult(new C0737c0(m2606b.m3192n(), m2606b.m3182d(), m2606b.m3186h(), m2606b.m3191m(), m2606b.m3188j(), m4008J.m2607a().m2605a(), m2606b.m3194p(), m2606b.m3184f()));
        }
    }

    /* renamed from: S */
    public final /* synthetic */ void m3038S(C0739d0 c0739d0) {
        this.f2550j.m3256d(c0739d0);
    }

    /* renamed from: T */
    public final /* synthetic */ void m3039T(C0644f c0644f, C0409W c0409w) {
        this.f2549i.m3159p(c0644f, c0409w);
    }

    /* renamed from: U */
    public final /* synthetic */ void m3040U(TaskCompletionSource taskCompletionSource, Context context, AbstractC0750j abstractC0750j, InterfaceC1901J interfaceC1901J) {
        try {
            m3028H(context, (C0564j) Tasks.await(taskCompletionSource.getTask()), abstractC0750j, interfaceC1901J);
        } catch (InterruptedException | ExecutionException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: V */
    public final /* synthetic */ void m3041V(C0564j c0564j) {
        AbstractC2133b.m7217d(this.f2549i != null, "SyncEngine not yet initialized", new Object[0]);
        AbstractC2155x.m7309a("FirestoreClient", "Credential changed. Current user: %s", c0564j.m2161a());
        this.f2549i.m3155l(c0564j);
    }

    /* renamed from: W */
    public final /* synthetic */ void m3042W(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, C2138g c2138g, final C0564j c0564j) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            c2138g.m7234l(new Runnable() { // from class: J3.K
                @Override // java.lang.Runnable
                public final void run() {
                    C0723Q.this.m3041V(c0564j);
                }
            });
        } else {
            AbstractC2133b.m7217d(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(c0564j);
        }
    }

    /* renamed from: Y */
    public final /* synthetic */ void m3043Y(InterfaceC0447r interfaceC0447r) {
        this.f2550j.m3260h(interfaceC0447r);
    }

    /* renamed from: b0 */
    public final /* synthetic */ void m3044b0(C0737c0 c0737c0, List list, final TaskCompletionSource taskCompletionSource) {
        this.f2549i.m3167x(c0737c0, list).addOnSuccessListener(new OnSuccessListener() { // from class: J3.D
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                TaskCompletionSource.this.setResult((Map) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: J3.E
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                TaskCompletionSource.this.setException(exc);
            }
        });
    }

    /* renamed from: c0 */
    public final /* synthetic */ void m3045c0(boolean z6) {
        this.f2547g.m4037n0(z6);
    }

    /* renamed from: d0 */
    public final /* synthetic */ void m3046d0(C0739d0 c0739d0) {
        this.f2550j.m3259g(c0739d0);
    }

    /* renamed from: e0 */
    public final /* synthetic */ void m3047e0() {
        this.f2548h.m6727O();
        this.f2546f.mo4225m();
        InterfaceC1032M1 interfaceC1032M1 = this.f2552l;
        if (interfaceC1032M1 != null) {
            interfaceC1032M1.stop();
        }
        InterfaceC1032M1 interfaceC1032M12 = this.f2551k;
        if (interfaceC1032M12 != null) {
            interfaceC1032M12.stop();
        }
    }

    /* renamed from: f0 */
    public final /* synthetic */ Task m3048f0(C0460x0 c0460x0, InterfaceC2153v interfaceC2153v) {
        return this.f2549i.m3147C(this.f2544d, c0460x0, interfaceC2153v);
    }

    /* renamed from: g0 */
    public final /* synthetic */ void m3049g0(TaskCompletionSource taskCompletionSource) {
        this.f2549i.m3163t(taskCompletionSource);
    }

    /* renamed from: h0 */
    public final /* synthetic */ void m3050h0(List list, TaskCompletionSource taskCompletionSource) {
        this.f2549i.m3149E(list, taskCompletionSource);
    }

    /* renamed from: i0 */
    public C0739d0 m3051i0(C0737c0 c0737c0, C0760o.b bVar, InterfaceC0447r interfaceC0447r) {
        m3059q0();
        final C0739d0 c0739d0 = new C0739d0(c0737c0, bVar, interfaceC0447r);
        this.f2544d.m7234l(new Runnable() { // from class: J3.H
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3038S(c0739d0);
            }
        });
        return c0739d0;
    }

    /* renamed from: j0 */
    public void m3052j0(InputStream inputStream, final C0409W c0409w) {
        m3059q0();
        final C0644f c0644f = new C0644f(this.f2545e, inputStream);
        this.f2544d.m7234l(new Runnable() { // from class: J3.s
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3039T(c0644f, c0409w);
            }
        });
    }

    /* renamed from: k0 */
    public void m3053k0(final InterfaceC0447r interfaceC0447r) {
        this.f2544d.m7234l(new Runnable() { // from class: J3.A
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3043Y(interfaceC0447r);
            }
        });
    }

    /* renamed from: l0 */
    public Task m3054l0(final C0737c0 c0737c0, final List list) {
        m3059q0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2544d.m7234l(new Runnable() { // from class: J3.z
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3044b0(c0737c0, list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: m0 */
    public void m3055m0(final boolean z6) {
        m3059q0();
        this.f2544d.m7234l(new Runnable() { // from class: J3.O
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3045c0(z6);
            }
        });
    }

    /* renamed from: n0 */
    public void m3056n0(final C0739d0 c0739d0) {
        this.f2544d.m7234l(new Runnable() { // from class: J3.B
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3046d0(c0739d0);
            }
        });
    }

    /* renamed from: o0 */
    public Task m3057o0() {
        this.f2542b.mo2141c();
        this.f2543c.mo2141c();
        return this.f2544d.m7236n(new Runnable() { // from class: J3.r
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3047e0();
            }
        });
    }

    /* renamed from: p0 */
    public Task m3058p0(final C0460x0 c0460x0, final InterfaceC2153v interfaceC2153v) {
        m3059q0();
        return C2138g.m7225g(this.f2544d.m7237o(), new Callable() { // from class: J3.F
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Task m3048f0;
                m3048f0 = C0723Q.this.m3048f0(c0460x0, interfaceC2153v);
                return m3048f0;
            }
        });
    }

    /* renamed from: q0 */
    public final void m3059q0() {
        if (m3029I()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    /* renamed from: r0 */
    public Task m3060r0() {
        m3059q0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2544d.m7234l(new Runnable() { // from class: J3.v
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3049g0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: s0 */
    public Task m3061s0(final List list) {
        m3059q0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2544d.m7234l(new Runnable() { // from class: J3.M
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3050h0(list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: z */
    public void m3062z(final InterfaceC0447r interfaceC0447r) {
        m3059q0();
        this.f2544d.m7234l(new Runnable() { // from class: J3.G
            @Override // java.lang.Runnable
            public final void run() {
                C0723Q.this.m3030J(interfaceC0447r);
            }
        });
    }

    /* renamed from: X */
    public static /* synthetic */ void m2993X(String str) {
    }
}
