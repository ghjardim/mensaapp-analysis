package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.AbstractC3951e;
import com.google.firebase.firestore.C3952f;
import com.google.firebase.firestore.C3955i;
import com.google.firebase.firestore.C3957k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p046G3.C0417c;
import p046G3.C0450s0;
import p046G3.C0451t;
import p046G3.EnumC0406T;
import p046G3.EnumC0418c0;
import p046G3.EnumC0454u0;
import p046G3.InterfaceC0407U;
import p046G3.InterfaceC0447r;
import p067J3.AbstractC0738d;
import p067J3.AbstractC0764q;
import p067J3.C0723Q;
import p067J3.C0735b0;
import p067J3.C0737c0;
import p067J3.C0739d0;
import p067J3.C0746h;
import p067J3.C0748i;
import p067J3.C0752k;
import p067J3.C0760o;
import p067J3.C0762p;
import p067J3.C0783z0;
import p088M3.AbstractC1184z;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.C1179u;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2157z;
import p116Q3.InterfaceC2153v;
import p272k4.C5413D;
import p272k4.C5419b;

/* renamed from: com.google.firebase.firestore.i */
/* loaded from: classes.dex */
public class C3955i {

    /* renamed from: a */
    public final C0737c0 f12956a;

    /* renamed from: b */
    public final FirebaseFirestore f12957b;

    /* renamed from: com.google.firebase.firestore.i$a */
    public class a extends ArrayList {

        /* renamed from: a */
        public final /* synthetic */ AbstractC3947a f12958a;

        public a(AbstractC3947a abstractC3947a) {
            this.f12958a = abstractC3947a;
            add(abstractC3947a);
        }
    }

    /* renamed from: com.google.firebase.firestore.i$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12960a;

        static {
            int[] iArr = new int[C0762p.b.values().length];
            f12960a = iArr;
            try {
                iArr[C0762p.b.NOT_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12960a[C0762p.b.ARRAY_CONTAINS_ANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12960a[C0762p.b.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12960a[C0762p.b.NOT_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.google.firebase.firestore.i$c */
    public enum c {
        ASCENDING,
        DESCENDING
    }

    public C3955i(C0737c0 c0737c0, FirebaseFirestore firebaseFirestore) {
        this.f12956a = (C0737c0) AbstractC2157z.m7329b(c0737c0);
        this.f12957b = (FirebaseFirestore) AbstractC2157z.m7329b(firebaseFirestore);
    }

    /* renamed from: r */
    public static C0760o.b m15614r(EnumC0418c0 enumC0418c0, EnumC0406T enumC0406T) {
        C0760o.b bVar = new C0760o.b();
        EnumC0418c0 enumC0418c02 = EnumC0418c0.INCLUDE;
        bVar.f2697a = enumC0418c0 == enumC0418c02;
        bVar.f2698b = enumC0418c0 == enumC0418c02;
        bVar.f2699c = false;
        bVar.f2700d = enumC0406T;
        return bVar;
    }

    /* renamed from: t */
    public static /* synthetic */ void m15615t(C0746h c0746h, C0723Q c0723q, C0739d0 c0739d0) {
        c0746h.m3178d();
        c0723q.m3056n0(c0739d0);
    }

    /* renamed from: x */
    public static /* synthetic */ void m15616x(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, EnumC0454u0 enumC0454u0, C3957k c3957k, C3952f c3952f) {
        if (c3952f != null) {
            taskCompletionSource.setException(c3952f);
            return;
        }
        try {
            ((InterfaceC0407U) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (c3957k.m15664h().m1677b() && enumC0454u0 == EnumC0454u0.SERVER) {
                taskCompletionSource.setException(new C3952f("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", C3952f.a.UNAVAILABLE));
            } else {
                taskCompletionSource.setResult(c3957k);
            }
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            throw AbstractC2133b.m7215b(e7, "Failed to register a listener for a query result", new Object[0]);
        } catch (ExecutionException e8) {
            throw AbstractC2133b.m7215b(e8, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    /* renamed from: A */
    public C3955i m15617A(C0451t c0451t, c cVar) {
        AbstractC2157z.m7330c(c0451t, "Provided field path must not be null.");
        return m15618B(c0451t.m1675c(), cVar);
    }

    /* renamed from: B */
    public final C3955i m15618B(C1176r c1176r, c cVar) {
        AbstractC2157z.m7330c(cVar, "Provided direction must not be null.");
        if (this.f12956a.m3109o() != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        }
        if (this.f12956a.m3101g() == null) {
            return new C3955i(this.f12956a.m3091A(C0735b0.m3084d(cVar == c.ASCENDING ? C0735b0.a.ASCENDING : C0735b0.a.DESCENDING, c1176r)), this.f12957b);
        }
        throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
    }

    /* renamed from: C */
    public final AbstractC0764q m15619C(AbstractC3951e.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.m15577m().iterator();
        while (it.hasNext()) {
            AbstractC0764q m15622F = m15622F((AbstractC3951e) it.next());
            if (!m15622F.mo3221b().isEmpty()) {
                arrayList.add(m15622F);
            }
        }
        return arrayList.size() == 1 ? (AbstractC0764q) arrayList.get(0) : new C0752k(arrayList, aVar.m15578n());
    }

    /* renamed from: D */
    public final C5413D m15620D(Object obj) {
        if (!(obj instanceof String)) {
            if (obj instanceof C3949c) {
                return AbstractC1184z.m4588H(m15649p().m15477B(), ((C3949c) obj).m15551q());
            }
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + AbstractC2131I.m7184D(obj));
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
        }
        if (!this.f12956a.m3111q() && str.contains("/")) {
            throw new IllegalArgumentException("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '" + str + "' contains a '/' character.");
        }
        C1179u c1179u = (C1179u) this.f12956a.m3108n().m4462b(C1179u.m4565v(str));
        if (C1170l.m4500q(c1179u)) {
            return AbstractC1184z.m4588H(m15649p().m15477B(), C1170l.m4498j(c1179u));
        }
        throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + c1179u + "' is not because it has an odd number of segments (" + c1179u.m4471q() + ").");
    }

    /* renamed from: E */
    public final C0762p m15621E(AbstractC3951e.b bVar) {
        C5413D m1701i;
        C0451t m15579m = bVar.m15579m();
        C0762p.b m15580n = bVar.m15580n();
        Object m15581o = bVar.m15581o();
        AbstractC2157z.m7330c(m15579m, "Provided field path must not be null.");
        AbstractC2157z.m7330c(m15580n, "Provided op must not be null.");
        if (!m15579m.m1675c().m4537x()) {
            C0762p.b bVar2 = C0762p.b.IN;
            if (m15580n == bVar2 || m15580n == C0762p.b.NOT_IN || m15580n == C0762p.b.ARRAY_CONTAINS_ANY) {
                m15625I(m15581o, m15580n);
            }
            m1701i = this.f12957b.m15480F().m1701i(m15581o, m15580n == bVar2 || m15580n == C0762p.b.NOT_IN);
        } else {
            if (m15580n == C0762p.b.ARRAY_CONTAINS || m15580n == C0762p.b.ARRAY_CONTAINS_ANY) {
                throw new IllegalArgumentException("Invalid query. You can't perform '" + m15580n.toString() + "' queries on FieldPath.documentId().");
            }
            if (m15580n == C0762p.b.IN || m15580n == C0762p.b.NOT_IN) {
                m15625I(m15581o, m15580n);
                C5419b.b m22551j0 = C5419b.m22551j0();
                Iterator it = ((List) m15581o).iterator();
                while (it.hasNext()) {
                    m22551j0.m22561x(m15620D(it.next()));
                }
                m1701i = (C5413D) C5413D.m22443x0().m22477x(m22551j0).m17059n();
            } else {
                m1701i = m15620D(m15581o);
            }
        }
        return C0762p.m3269e(m15579m.m1675c(), m15580n, m1701i);
    }

    /* renamed from: F */
    public final AbstractC0764q m15622F(AbstractC3951e abstractC3951e) {
        boolean z6 = abstractC3951e instanceof AbstractC3951e.b;
        AbstractC2133b.m7217d(z6 || (abstractC3951e instanceof AbstractC3951e.a), "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        return z6 ? m15621E((AbstractC3951e.b) abstractC3951e) : m15619C((AbstractC3951e.a) abstractC3951e);
    }

    /* renamed from: G */
    public C3955i m15623G(Object... objArr) {
        return new C3955i(this.f12956a.m3092B(m15643j("startAfter", objArr, false)), this.f12957b);
    }

    /* renamed from: H */
    public C3955i m15624H(Object... objArr) {
        return new C3955i(this.f12956a.m3092B(m15643j("startAt", objArr, true)), this.f12957b);
    }

    /* renamed from: I */
    public final void m15625I(Object obj, C0762p.b bVar) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + bVar.toString() + "' filters.");
        }
    }

    /* renamed from: J */
    public final void m15626J() {
        if (this.f12956a.m3106l().equals(C0737c0.a.LIMIT_TO_LAST) && this.f12956a.m3102h().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    /* renamed from: K */
    public final void m15627K(C0737c0 c0737c0, C0762p c0762p) {
        C0762p.b m3271g = c0762p.m3271g();
        C0762p.b m15647n = m15647n(c0737c0.m3103i(), m15644k(m3271g));
        if (m15647n != null) {
            if (m15647n == m3271g) {
                throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + m3271g.toString() + "' filter.");
            }
            throw new IllegalArgumentException("Invalid Query. You cannot use '" + m3271g.toString() + "' filters with '" + m15647n.toString() + "' filters.");
        }
    }

    /* renamed from: L */
    public final void m15628L(AbstractC0764q abstractC0764q) {
        C0737c0 c0737c0 = this.f12956a;
        for (C0762p c0762p : abstractC0764q.mo3222c()) {
            m15627K(c0737c0, c0762p);
            c0737c0 = c0737c0.m3099e(c0762p);
        }
    }

    /* renamed from: M */
    public C3955i m15629M(AbstractC3951e abstractC3951e) {
        AbstractC0764q m15622F = m15622F(abstractC3951e);
        if (m15622F.mo3221b().isEmpty()) {
            return this;
        }
        m15628L(m15622F);
        return new C3955i(this.f12956a.m3099e(m15622F), this.f12957b);
    }

    /* renamed from: N */
    public C3955i m15630N(C0451t c0451t, Object obj) {
        return m15629M(AbstractC3951e.m15566b(c0451t, obj));
    }

    /* renamed from: O */
    public C3955i m15631O(C0451t c0451t, List list) {
        return m15629M(AbstractC3951e.m15567c(c0451t, list));
    }

    /* renamed from: P */
    public C3955i m15632P(C0451t c0451t, Object obj) {
        return m15629M(AbstractC3951e.m15568d(c0451t, obj));
    }

    /* renamed from: Q */
    public C3955i m15633Q(C0451t c0451t, Object obj) {
        return m15629M(AbstractC3951e.m15569e(c0451t, obj));
    }

    /* renamed from: R */
    public C3955i m15634R(C0451t c0451t, Object obj) {
        return m15629M(AbstractC3951e.m15570f(c0451t, obj));
    }

    /* renamed from: S */
    public C3955i m15635S(C0451t c0451t, List list) {
        return m15629M(AbstractC3951e.m15571g(c0451t, list));
    }

    /* renamed from: T */
    public C3955i m15636T(C0451t c0451t, Object obj) {
        return m15629M(AbstractC3951e.m15572h(c0451t, obj));
    }

    /* renamed from: U */
    public C3955i m15637U(C0451t c0451t, Object obj) {
        return m15629M(AbstractC3951e.m15573i(c0451t, obj));
    }

    /* renamed from: V */
    public C3955i m15638V(C0451t c0451t, Object obj) {
        return m15629M(AbstractC3951e.m15574j(c0451t, obj));
    }

    /* renamed from: W */
    public C3955i m15639W(C0451t c0451t, List list) {
        return m15629M(AbstractC3951e.m15575k(c0451t, list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3955i)) {
            return false;
        }
        C3955i c3955i = (C3955i) obj;
        return this.f12956a.equals(c3955i.f12956a) && this.f12957b.equals(c3955i.f12957b);
    }

    /* renamed from: g */
    public InterfaceC0407U m15640g(C0450s0 c0450s0, InterfaceC0447r interfaceC0447r) {
        AbstractC2157z.m7330c(c0450s0, "Provided options value must not be null.");
        AbstractC2157z.m7330c(interfaceC0447r, "Provided EventListener must not be null.");
        return m15641h(c0450s0.m1662b(), m15614r(c0450s0.m1663c(), c0450s0.m1664d()), c0450s0.m1661a(), interfaceC0447r);
    }

    /* renamed from: h */
    public final InterfaceC0407U m15641h(Executor executor, final C0760o.b bVar, final Activity activity, final InterfaceC0447r interfaceC0447r) {
        m15626J();
        final C0746h c0746h = new C0746h(executor, new InterfaceC0447r() { // from class: G3.k0
            @Override // p046G3.InterfaceC0447r
            /* renamed from: a */
            public final void mo1589a(Object obj, C3952f c3952f) {
                C3955i.this.m15651s(interfaceC0447r, (C0783z0) obj, c3952f);
            }
        });
        return (InterfaceC0407U) this.f12957b.m15500s(new InterfaceC2153v() { // from class: G3.l0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                InterfaceC0407U m15652u;
                m15652u = C3955i.this.m15652u(bVar, c0746h, activity, (C0723Q) obj);
                return m15652u;
            }
        });
    }

    public int hashCode() {
        return (this.f12956a.hashCode() * 31) + this.f12957b.hashCode();
    }

    /* renamed from: i */
    public C0417c m15642i(AbstractC3947a abstractC3947a, AbstractC3947a... abstractC3947aArr) {
        a aVar = new a(abstractC3947a);
        aVar.addAll(Arrays.asList(abstractC3947aArr));
        return new C0417c(this, aVar);
    }

    /* renamed from: j */
    public final C0748i m15643j(String str, Object[] objArr, boolean z6) {
        List m3102h = this.f12956a.m3102h();
        if (objArr.length > m3102h.size()) {
            throw new IllegalArgumentException("Too many arguments provided to " + str + "(). The number of arguments must be less than or equal to the number of orderBy() clauses.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            if (!((C0735b0) m3102h.get(i7)).m3087c().equals(C1176r.f3773b)) {
                arrayList.add(this.f12957b.m15480F().m1700h(obj));
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
                }
                String str2 = (String) obj;
                if (!this.f12956a.m3111q() && str2.contains("/")) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str2 + "' contains a slash.");
                }
                C1179u c1179u = (C1179u) this.f12956a.m3108n().m4462b(C1179u.m4565v(str2));
                if (!C1170l.m4500q(c1179u)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + c1179u + "' is not because it contains an odd number of segments.");
                }
                arrayList.add(AbstractC1184z.m4588H(this.f12957b.m15477B(), C1170l.m4498j(c1179u)));
            }
        }
        return new C0748i(arrayList, z6);
    }

    /* renamed from: k */
    public final List m15644k(C0762p.b bVar) {
        int i7 = b.f12960a[bVar.ordinal()];
        return i7 != 1 ? (i7 == 2 || i7 == 3) ? Arrays.asList(C0762p.b.NOT_IN) : i7 != 4 ? new ArrayList() : Arrays.asList(C0762p.b.ARRAY_CONTAINS_ANY, C0762p.b.IN, C0762p.b.NOT_IN, C0762p.b.NOT_EQUAL) : Arrays.asList(C0762p.b.NOT_EQUAL, C0762p.b.NOT_IN);
    }

    /* renamed from: l */
    public C3955i m15645l(Object... objArr) {
        return new C3955i(this.f12956a.m3098d(m15643j("endAt", objArr, true)), this.f12957b);
    }

    /* renamed from: m */
    public C3955i m15646m(Object... objArr) {
        return new C3955i(this.f12956a.m3098d(m15643j("endBefore", objArr, false)), this.f12957b);
    }

    /* renamed from: n */
    public final C0762p.b m15647n(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (C0762p c0762p : ((AbstractC0764q) it.next()).mo3222c()) {
                if (list2.contains(c0762p.m3271g())) {
                    return c0762p.m3271g();
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    public Task m15648o(EnumC0454u0 enumC0454u0) {
        m15626J();
        return enumC0454u0 == EnumC0454u0.CACHE ? ((Task) this.f12957b.m15500s(new InterfaceC2153v() { // from class: G3.m0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15653v;
                m15653v = C3955i.this.m15653v((C0723Q) obj);
                return m15653v;
            }
        })).continueWith(AbstractC2147p.f6508b, new Continuation() { // from class: G3.n0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                C3957k m15654w;
                m15654w = C3955i.this.m15654w(task);
                return m15654w;
            }
        }) : m15650q(enumC0454u0);
    }

    /* renamed from: p */
    public FirebaseFirestore m15649p() {
        return this.f12957b;
    }

    /* renamed from: q */
    public final Task m15650q(final EnumC0454u0 enumC0454u0) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C0760o.b bVar = new C0760o.b();
        bVar.f2697a = true;
        bVar.f2698b = true;
        bVar.f2699c = true;
        taskCompletionSource2.setResult(m15641h(AbstractC2147p.f6508b, bVar, null, new InterfaceC0447r() { // from class: G3.o0
            @Override // p046G3.InterfaceC0447r
            /* renamed from: a */
            public final void mo1589a(Object obj, C3952f c3952f) {
                C3955i.m15616x(TaskCompletionSource.this, taskCompletionSource2, enumC0454u0, (C3957k) obj, c3952f);
            }
        }));
        return taskCompletionSource.getTask();
    }

    /* renamed from: s */
    public final /* synthetic */ void m15651s(InterfaceC0447r interfaceC0447r, C0783z0 c0783z0, C3952f c3952f) {
        if (c3952f != null) {
            interfaceC0447r.mo1589a(null, c3952f);
        } else {
            AbstractC2133b.m7217d(c0783z0 != null, "Got event without value or error set", new Object[0]);
            interfaceC0447r.mo1589a(new C3957k(this, c0783z0, this.f12957b), null);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ InterfaceC0407U m15652u(C0760o.b bVar, final C0746h c0746h, Activity activity, final C0723Q c0723q) {
        final C0739d0 m3051i0 = c0723q.m3051i0(this.f12956a, bVar, c0746h);
        return AbstractC0738d.m3125c(activity, new InterfaceC0407U() { // from class: G3.p0
            @Override // p046G3.InterfaceC0407U
            public final void remove() {
                C3955i.m15615t(C0746h.this, c0723q, m3051i0);
            }
        });
    }

    /* renamed from: v */
    public final /* synthetic */ Task m15653v(C0723Q c0723q) {
        return c0723q.m3026F(this.f12956a);
    }

    /* renamed from: w */
    public final /* synthetic */ C3957k m15654w(Task task) {
        return new C3957k(new C3955i(this.f12956a, this.f12957b), (C0783z0) task.getResult(), this.f12957b);
    }

    /* renamed from: y */
    public C3955i m15655y(long j7) {
        if (j7 > 0) {
            return new C3955i(this.f12956a.m3113s(j7), this.f12957b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j7 + ") is invalid. Limit must be positive.");
    }

    /* renamed from: z */
    public C3955i m15656z(long j7) {
        if (j7 > 0) {
            return new C3955i(this.f12956a.m3114t(j7), this.f12957b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j7 + ") is invalid. Limit must be positive.");
    }
}
