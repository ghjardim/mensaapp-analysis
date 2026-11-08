package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C3949c;
import com.google.firebase.firestore.C3950d;
import com.google.firebase.firestore.C3952f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p046G3.C0448r0;
import p046G3.C0450s0;
import p046G3.C0451t;
import p046G3.EnumC0406T;
import p046G3.EnumC0418c0;
import p046G3.EnumC0454u0;
import p046G3.InterfaceC0407U;
import p046G3.InterfaceC0447r;
import p067J3.AbstractC0738d;
import p067J3.C0723Q;
import p067J3.C0737c0;
import p067J3.C0739d0;
import p067J3.C0746h;
import p067J3.C0760o;
import p067J3.C0773u0;
import p067J3.C0783z0;
import p088M3.C1170l;
import p088M3.C1179u;
import p088M3.InterfaceC1167i;
import p095N3.C1263c;
import p095N3.C1273m;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2157z;
import p116Q3.InterfaceC2153v;

/* renamed from: com.google.firebase.firestore.c */
/* loaded from: classes.dex */
public class C3949c {

    /* renamed from: a */
    public final C1170l f12902a;

    /* renamed from: b */
    public final FirebaseFirestore f12903b;

    public C3949c(C1170l c1170l, FirebaseFirestore firebaseFirestore) {
        this.f12902a = (C1170l) AbstractC2157z.m7329b(c1170l);
        this.f12903b = firebaseFirestore;
    }

    /* renamed from: A */
    public static /* synthetic */ void m15524A(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, EnumC0454u0 enumC0454u0, C3950d c3950d, C3952f c3952f) {
        if (c3952f != null) {
            taskCompletionSource.setException(c3952f);
            return;
        }
        try {
            ((InterfaceC0407U) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (!c3950d.m15559a() && c3950d.m15562f().m1677b()) {
                taskCompletionSource.setException(new C3952f("Failed to get document because the client is offline.", C3952f.a.UNAVAILABLE));
            } else if (c3950d.m15559a() && c3950d.m15562f().m1677b() && enumC0454u0 == EnumC0454u0.SERVER) {
                taskCompletionSource.setException(new C3952f("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", C3952f.a.UNAVAILABLE));
            } else {
                taskCompletionSource.setResult(c3950d);
            }
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            throw AbstractC2133b.m7215b(e7, "Failed to register a listener for a single document", new Object[0]);
        } catch (ExecutionException e8) {
            throw AbstractC2133b.m7215b(e8, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    /* renamed from: B */
    public static /* synthetic */ Task m15525B(List list, C0723Q c0723q) {
        return c0723q.m3061s0(list);
    }

    /* renamed from: C */
    public static /* synthetic */ Task m15526C(List list, C0723Q c0723q) {
        return c0723q.m3061s0(list);
    }

    /* renamed from: n */
    public static C3949c m15536n(C1179u c1179u, FirebaseFirestore firebaseFirestore) {
        if (c1179u.m4471q() % 2 == 0) {
            return new C3949c(C1170l.m4498j(c1179u), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + c1179u.mo4464g() + " has " + c1179u.m4471q());
    }

    /* renamed from: t */
    public static C0760o.b m15537t(EnumC0418c0 enumC0418c0, EnumC0406T enumC0406T) {
        C0760o.b bVar = new C0760o.b();
        EnumC0418c0 enumC0418c02 = EnumC0418c0.INCLUDE;
        bVar.f2697a = enumC0418c0 == enumC0418c02;
        bVar.f2698b = enumC0418c0 == enumC0418c02;
        bVar.f2699c = false;
        bVar.f2700d = enumC0406T;
        return bVar;
    }

    /* renamed from: v */
    public static /* synthetic */ void m15538v(C0746h c0746h, C0723Q c0723q, C0739d0 c0739d0) {
        c0746h.m3178d();
        c0723q.m3056n0(c0739d0);
    }

    /* renamed from: w */
    public static /* synthetic */ InterfaceC0407U m15539w(C0737c0 c0737c0, C0760o.b bVar, final C0746h c0746h, Activity activity, final C0723Q c0723q) {
        final C0739d0 m3051i0 = c0723q.m3051i0(c0737c0, bVar, c0746h);
        return AbstractC0738d.m3125c(activity, new InterfaceC0407U() { // from class: G3.q
            @Override // p046G3.InterfaceC0407U
            public final void remove() {
                C3949c.m15538v(C0746h.this, c0723q, m3051i0);
            }
        });
    }

    /* renamed from: x */
    public static /* synthetic */ Task m15540x(List list, C0723Q c0723q) {
        return c0723q.m3061s0(list);
    }

    /* renamed from: D */
    public Task m15541D(Object obj) {
        return m15542E(obj, C0448r0.f1596c);
    }

    /* renamed from: E */
    public Task m15542E(Object obj, C0448r0 c0448r0) {
        AbstractC2157z.m7330c(obj, "Provided data must not be null.");
        AbstractC2157z.m7330c(c0448r0, "Provided options must not be null.");
        final List singletonList = Collections.singletonList((c0448r0.m1660b() ? this.f12903b.m15480F().m1699g(obj, c0448r0.m1659a()) : this.f12903b.m15480F().m1704l(obj)).m3308a(this.f12902a, C1273m.f4009c));
        return ((Task) this.f12903b.m15500s(new InterfaceC2153v() { // from class: G3.j
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj2) {
                Task m15525B;
                m15525B = C3949c.m15525B(singletonList, (C0723Q) obj2);
                return m15525B;
            }
        })).continueWith(AbstractC2147p.f6508b, AbstractC2131I.m7185E());
    }

    /* renamed from: F */
    public Task m15543F(C0451t c0451t, Object obj, Object... objArr) {
        return m15544G(this.f12903b.m15480F().m1706n(AbstractC2131I.m7191f(1, c0451t, obj, objArr)));
    }

    /* renamed from: G */
    public final Task m15544G(C0773u0 c0773u0) {
        final List singletonList = Collections.singletonList(c0773u0.m3309a(this.f12902a, C1273m.m4868a(true)));
        return ((Task) this.f12903b.m15500s(new InterfaceC2153v() { // from class: G3.k
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15526C;
                m15526C = C3949c.m15526C(singletonList, (C0723Q) obj);
                return m15526C;
            }
        })).continueWith(AbstractC2147p.f6508b, AbstractC2131I.m7185E());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3949c)) {
            return false;
        }
        C3949c c3949c = (C3949c) obj;
        return this.f12902a.equals(c3949c.f12902a) && this.f12903b.equals(c3949c.f12903b);
    }

    public int hashCode() {
        return (this.f12902a.hashCode() * 31) + this.f12903b.hashCode();
    }

    /* renamed from: j */
    public InterfaceC0407U m15545j(C0450s0 c0450s0, InterfaceC0447r interfaceC0447r) {
        AbstractC2157z.m7330c(c0450s0, "Provided options value must not be null.");
        AbstractC2157z.m7330c(interfaceC0447r, "Provided EventListener must not be null.");
        return m15546k(c0450s0.m1662b(), m15537t(c0450s0.m1663c(), c0450s0.m1664d()), c0450s0.m1661a(), interfaceC0447r);
    }

    /* renamed from: k */
    public final InterfaceC0407U m15546k(Executor executor, final C0760o.b bVar, final Activity activity, final InterfaceC0447r interfaceC0447r) {
        final C0746h c0746h = new C0746h(executor, new InterfaceC0447r() { // from class: G3.n
            @Override // p046G3.InterfaceC0447r
            /* renamed from: a */
            public final void mo1589a(Object obj, C3952f c3952f) {
                C3949c.this.m15554u(interfaceC0447r, (C0783z0) obj, c3952f);
            }
        });
        final C0737c0 m15547l = m15547l();
        return (InterfaceC0407U) this.f12903b.m15500s(new InterfaceC2153v() { // from class: G3.o
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                InterfaceC0407U m15539w;
                m15539w = C3949c.m15539w(C0737c0.this, bVar, c0746h, activity, (C0723Q) obj);
                return m15539w;
            }
        });
    }

    /* renamed from: l */
    public final C0737c0 m15547l() {
        return C0737c0.m3090b(this.f12902a.m4505o());
    }

    /* renamed from: m */
    public Task m15548m() {
        final List singletonList = Collections.singletonList(new C1263c(this.f12902a, C1273m.f4009c));
        return ((Task) this.f12903b.m15500s(new InterfaceC2153v() { // from class: G3.i
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15540x;
                m15540x = C3949c.m15540x(singletonList, (C0723Q) obj);
                return m15540x;
            }
        })).continueWith(AbstractC2147p.f6508b, AbstractC2131I.m7185E());
    }

    /* renamed from: o */
    public Task m15549o(EnumC0454u0 enumC0454u0) {
        return enumC0454u0 == EnumC0454u0.CACHE ? ((Task) this.f12903b.m15500s(new InterfaceC2153v() { // from class: G3.l
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15555y;
                m15555y = C3949c.this.m15555y((C0723Q) obj);
                return m15555y;
            }
        })).continueWith(AbstractC2147p.f6508b, new Continuation() { // from class: G3.m
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                C3950d m15556z;
                m15556z = C3949c.this.m15556z(task);
                return m15556z;
            }
        }) : m15553s(enumC0454u0);
    }

    /* renamed from: p */
    public FirebaseFirestore m15550p() {
        return this.f12903b;
    }

    /* renamed from: q */
    public C1170l m15551q() {
        return this.f12902a;
    }

    /* renamed from: r */
    public String m15552r() {
        return this.f12902a.m4505o().mo4464g();
    }

    /* renamed from: s */
    public final Task m15553s(final EnumC0454u0 enumC0454u0) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C0760o.b bVar = new C0760o.b();
        bVar.f2697a = true;
        bVar.f2698b = true;
        bVar.f2699c = true;
        taskCompletionSource2.setResult(m15546k(AbstractC2147p.f6508b, bVar, null, new InterfaceC0447r() { // from class: G3.p
            @Override // p046G3.InterfaceC0447r
            /* renamed from: a */
            public final void mo1589a(Object obj, C3952f c3952f) {
                C3949c.m15524A(TaskCompletionSource.this, taskCompletionSource2, enumC0454u0, (C3950d) obj, c3952f);
            }
        }));
        return taskCompletionSource.getTask();
    }

    /* renamed from: u */
    public final /* synthetic */ void m15554u(InterfaceC0447r interfaceC0447r, C0783z0 c0783z0, C3952f c3952f) {
        if (c3952f != null) {
            interfaceC0447r.mo1589a(null, c3952f);
            return;
        }
        AbstractC2133b.m7217d(c0783z0 != null, "Got event without value or error set", new Object[0]);
        AbstractC2133b.m7217d(c0783z0.m3334e().size() <= 1, "Too many documents returned on a document query", new Object[0]);
        InterfaceC1167i m4511f = c0783z0.m3334e().m4511f(this.f12902a);
        interfaceC0447r.mo1589a(m4511f != null ? C3950d.m15557b(this.f12903b, m4511f, c0783z0.m3340k(), c0783z0.m3335f().contains(m4511f.getKey())) : C3950d.m15558c(this.f12903b, this.f12902a, c0783z0.m3340k()), null);
    }

    /* renamed from: y */
    public final /* synthetic */ Task m15555y(C0723Q c0723q) {
        return c0723q.m3025E(this.f12902a);
    }

    /* renamed from: z */
    public final /* synthetic */ C3950d m15556z(Task task) {
        InterfaceC1167i interfaceC1167i = (InterfaceC1167i) task.getResult();
        return new C3950d(this.f12903b, this.f12902a, interfaceC1167i, true, interfaceC1167i != null && interfaceC1167i.mo4484e());
    }
}
