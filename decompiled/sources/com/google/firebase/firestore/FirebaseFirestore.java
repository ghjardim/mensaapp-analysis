package com.google.firebase.firestore;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C3952f;
import com.google.firebase.firestore.C3953g;
import com.google.firebase.firestore.C3955i;
import com.google.firebase.firestore.C3958l;
import com.google.firebase.firestore.FirebaseFirestore;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p004A3.C0020a;
import p042G.InterfaceC0339a;
import p046G3.C0389B0;
import p046G3.C0402O;
import p046G3.C0409W;
import p046G3.C0423f;
import p046G3.C0428h0;
import p046G3.C0430i0;
import p046G3.C0460x0;
import p046G3.C0462y0;
import p046G3.InterfaceC0407U;
import p046G3.InterfaceC0447r;
import p053H3.AbstractC0555a;
import p053H3.C0559e;
import p053H3.C0563i;
import p067J3.AbstractC0738d;
import p067J3.AbstractC0750j;
import p067J3.C0723Q;
import p067J3.C0737c0;
import p067J3.C0746h;
import p067J3.C0754l;
import p067J3.C0755l0;
import p081L3.C1077f1;
import p088M3.AbstractC1175q;
import p088M3.C1164f;
import p088M3.C1176r;
import p088M3.C1179u;
import p109P3.C1946z;
import p109P3.InterfaceC1901J;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2155x;
import p116Q3.AbstractC2157z;
import p116Q3.C2138g;
import p116Q3.InterfaceC2153v;
import p137T3.InterfaceC2446a;
import p219e3.C4176f;

/* loaded from: classes.dex */
public class FirebaseFirestore {

    /* renamed from: a */
    public final InterfaceC2153v f12883a;

    /* renamed from: b */
    public final Context f12884b;

    /* renamed from: c */
    public final C1164f f12885c;

    /* renamed from: d */
    public final String f12886d;

    /* renamed from: e */
    public final AbstractC0555a f12887e;

    /* renamed from: f */
    public final AbstractC0555a f12888f;

    /* renamed from: g */
    public final C4176f f12889g;

    /* renamed from: h */
    public final C0462y0 f12890h;

    /* renamed from: i */
    public final InterfaceC3946a f12891i;

    /* renamed from: j */
    public C0020a f12892j;

    /* renamed from: m */
    public final InterfaceC1901J f12895m;

    /* renamed from: n */
    public C0428h0 f12896n;

    /* renamed from: l */
    public final C0402O f12894l = new C0402O(new InterfaceC2153v() { // from class: G3.E
        @Override // p116Q3.InterfaceC2153v
        public final Object apply(Object obj) {
            C0723Q m15488V;
            m15488V = FirebaseFirestore.this.m15488V((C2138g) obj);
            return m15488V;
        }
    });

    /* renamed from: k */
    public C3953g f12893k = new C3953g.b().m15602f();

    /* renamed from: com.google.firebase.firestore.FirebaseFirestore$a */
    public interface InterfaceC3946a {
        void remove(String str);
    }

    public FirebaseFirestore(Context context, C1164f c1164f, String str, AbstractC0555a abstractC0555a, AbstractC0555a abstractC0555a2, InterfaceC2153v interfaceC2153v, C4176f c4176f, InterfaceC3946a interfaceC3946a, InterfaceC1901J interfaceC1901J) {
        this.f12884b = (Context) AbstractC2157z.m7329b(context);
        this.f12885c = (C1164f) AbstractC2157z.m7329b((C1164f) AbstractC2157z.m7329b(c1164f));
        this.f12890h = new C0462y0(c1164f);
        this.f12886d = (String) AbstractC2157z.m7329b(str);
        this.f12887e = (AbstractC0555a) AbstractC2157z.m7329b(abstractC0555a);
        this.f12888f = (AbstractC0555a) AbstractC2157z.m7329b(abstractC0555a2);
        this.f12883a = (InterfaceC2153v) AbstractC2157z.m7329b(interfaceC2153v);
        this.f12889g = c4176f;
        this.f12891i = interfaceC3946a;
        this.f12895m = interfaceC1901J;
    }

    /* renamed from: C */
    public static FirebaseFirestore m15451C(C4176f c4176f, String str) {
        AbstractC2157z.m7330c(c4176f, "Provided FirebaseApp must not be null.");
        AbstractC2157z.m7330c(str, "Provided database name must not be null.");
        C3954h c3954h = (C3954h) c4176f.m17531k(C3954h.class);
        AbstractC2157z.m7330c(c3954h, "Firestore component is not present.");
        return c3954h.m15607b(str);
    }

    /* renamed from: G */
    public static /* synthetic */ void m15452G(C0746h c0746h, C0723Q c0723q) {
        c0746h.m3178d();
        c0723q.m3053k0(c0746h);
    }

    /* renamed from: H */
    public static /* synthetic */ InterfaceC0407U m15453H(final C0746h c0746h, Activity activity, final C0723Q c0723q) {
        c0723q.m3062z(c0746h);
        return AbstractC0738d.m3125c(activity, new InterfaceC0407U() { // from class: G3.C
            @Override // p046G3.InterfaceC0407U
            public final void remove() {
                FirebaseFirestore.m15452G(C0746h.this, c0723q);
            }
        });
    }

    /* renamed from: I */
    public static /* synthetic */ void m15454I(Runnable runnable, Void r22, C3952f c3952f) {
        AbstractC2133b.m7217d(c3952f == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* renamed from: J */
    public static /* synthetic */ Task m15455J(Executor executor) {
        return Tasks.forException(new C3952f("Persistence cannot be cleared while the firestore instance is running.", C3952f.a.FAILED_PRECONDITION));
    }

    /* renamed from: L */
    public static /* synthetic */ Task m15456L(String str, C0723Q c0723q) {
        return c0723q.m3027G(str);
    }

    /* renamed from: Q */
    public static /* synthetic */ Task m15458Q(C0460x0 c0460x0, InterfaceC2153v interfaceC2153v, C0723Q c0723q) {
        return c0723q.m3058p0(c0460x0, interfaceC2153v);
    }

    /* renamed from: R */
    public static /* synthetic */ Task m15459R(List list, C0723Q c0723q) {
        return c0723q.m3021A(list);
    }

    /* renamed from: W */
    public static FirebaseFirestore m15460W(Context context, C4176f c4176f, InterfaceC2446a interfaceC2446a, InterfaceC2446a interfaceC2446a2, String str, InterfaceC3946a interfaceC3946a, InterfaceC1901J interfaceC1901J) {
        String m17552g = c4176f.m17534r().m17552g();
        if (m17552g == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        return new FirebaseFirestore(context, C1164f.m4474f(m17552g, str), c4176f.m17533q(), new C0563i(interfaceC2446a), new C0559e(interfaceC2446a2), new InterfaceC2153v() { // from class: G3.v
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                return AbstractC0750j.m3208h((C3953g) obj);
            }
        }, c4176f, interfaceC3946a, interfaceC1901J);
    }

    /* renamed from: b0 */
    public static void m15463b0(boolean z6) {
        if (z6) {
            AbstractC2155x.m7312d(AbstractC2155x.b.DEBUG);
        } else {
            AbstractC2155x.m7312d(AbstractC2155x.b.WARN);
        }
    }

    @Keep
    public static void setClientLanguage(String str) {
        C1946z.m6916p(str);
    }

    /* renamed from: A */
    public C4176f m15476A() {
        return this.f12889g;
    }

    /* renamed from: B */
    public C1164f m15477B() {
        return this.f12885c;
    }

    /* renamed from: D */
    public Task m15478D(final String str) {
        return ((Task) this.f12894l.m1591b(new InterfaceC2153v() { // from class: G3.G
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15456L;
                m15456L = FirebaseFirestore.m15456L(str, (C0723Q) obj);
                return m15456L;
            }
        })).continueWith(new Continuation() { // from class: G3.H
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                C3955i m15482M;
                m15482M = FirebaseFirestore.this.m15482M(task);
                return m15482M;
            }
        });
    }

    /* renamed from: E */
    public C0428h0 m15479E() {
        this.f12894l.m1592c();
        if (this.f12896n == null && (this.f12893k.m15595i() || (this.f12893k.m15592f() instanceof C0430i0))) {
            this.f12896n = new C0428h0(this.f12894l);
        }
        return this.f12896n;
    }

    /* renamed from: F */
    public C0462y0 m15480F() {
        return this.f12890h;
    }

    /* renamed from: K */
    public final /* synthetic */ void m15481K(TaskCompletionSource taskCompletionSource) {
        try {
            C1077f1.m4278t(this.f12884b, this.f12885c, this.f12886d);
            taskCompletionSource.setResult(null);
        } catch (C3952f e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: M */
    public final /* synthetic */ C3955i m15482M(Task task) {
        C0737c0 c0737c0 = (C0737c0) task.getResult();
        if (c0737c0 != null) {
            return new C3955i(c0737c0, this);
        }
        return null;
    }

    /* renamed from: O */
    public final /* synthetic */ Object m15483O(C3958l.a aVar, C0755l0 c0755l0) {
        return aVar.mo7702a(new C3958l(c0755l0, this));
    }

    /* renamed from: P */
    public final /* synthetic */ Task m15484P(Executor executor, final C3958l.a aVar, final C0755l0 c0755l0) {
        return Tasks.call(executor, new Callable() { // from class: G3.D
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m15483O;
                m15483O = FirebaseFirestore.this.m15483O(aVar, c0755l0);
                return m15483O;
            }
        });
    }

    /* renamed from: S */
    public C0409W m15485S(final InputStream inputStream) {
        final C0409W c0409w = new C0409W();
        this.f12894l.m1596g(new InterfaceC0339a() { // from class: G3.w
            @Override // p042G.InterfaceC0339a
            public final void accept(Object obj) {
                ((C0723Q) obj).m3052j0(inputStream, c0409w);
            }
        });
        return c0409w;
    }

    /* renamed from: T */
    public C0409W m15486T(byte[] bArr) {
        return m15485S(new ByteArrayInputStream(bArr));
    }

    /* renamed from: U */
    public final C3953g m15487U(C3953g c3953g, C0020a c0020a) {
        if (c0020a == null) {
            return c3953g;
        }
        if (!"firestore.googleapis.com".equals(c3953g.m15594h())) {
            AbstractC2155x.m7313e("FirebaseFirestore", "Host has been set in FirebaseFirestoreSettings and useEmulator, emulator host will be used.", new Object[0]);
        }
        return new C3953g.b(c3953g).m15603g(c0020a.m68a() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + c0020a.m69b()).m15605i(false).m15602f();
    }

    /* renamed from: V */
    public final C0723Q m15488V(C2138g c2138g) {
        C0723Q c0723q;
        synchronized (this.f12894l) {
            c0723q = new C0723Q(this.f12884b, new C0754l(this.f12885c, this.f12886d, this.f12893k.m15594h(), this.f12893k.m15596j()), this.f12887e, this.f12888f, c2138g, this.f12895m, (AbstractC0750j) this.f12883a.apply(this.f12893k));
        }
        return c0723q;
    }

    /* renamed from: X */
    public Task m15489X(C0460x0 c0460x0, C3958l.a aVar) {
        AbstractC2157z.m7330c(aVar, "Provided transaction update function must not be null.");
        return m15490Y(c0460x0, aVar, C0755l0.m3237g());
    }

    /* renamed from: Y */
    public final Task m15490Y(final C0460x0 c0460x0, final C3958l.a aVar, final Executor executor) {
        this.f12894l.m1592c();
        final InterfaceC2153v interfaceC2153v = new InterfaceC2153v() { // from class: G3.z
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15484P;
                m15484P = FirebaseFirestore.this.m15484P(executor, aVar, (C0755l0) obj);
                return m15484P;
            }
        };
        return (Task) this.f12894l.m1591b(new InterfaceC2153v() { // from class: G3.A
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15458Q;
                m15458Q = FirebaseFirestore.m15458Q(C0460x0.this, interfaceC2153v, (C0723Q) obj);
                return m15458Q;
            }
        });
    }

    /* renamed from: Z */
    public void m15491Z(C3953g c3953g) {
        AbstractC2157z.m7330c(c3953g, "Provided settings must not be null.");
        synchronized (this.f12885c) {
            try {
                C3953g m15487U = m15487U(c3953g, this.f12892j);
                if (this.f12894l.m1594e() && !this.f12893k.equals(m15487U)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
                this.f12893k = m15487U;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a0 */
    public Task m15492a0(String str) {
        this.f12894l.m1592c();
        AbstractC2157z.m7332e(this.f12893k.m15595i(), "Cannot enable indexes when persistence is disabled");
        final ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("fields");
                    for (int i8 = 0; optJSONArray != null && i8 < optJSONArray.length(); i8++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i8);
                        C1176r m4533v = C1176r.m4533v(jSONObject3.getString("fieldPath"));
                        if ("CONTAINS".equals(jSONObject3.optString("arrayConfig"))) {
                            arrayList2.add(AbstractC1175q.c.m4529f(m4533v, AbstractC1175q.c.a.CONTAINS));
                        } else if ("ASCENDING".equals(jSONObject3.optString("order"))) {
                            arrayList2.add(AbstractC1175q.c.m4529f(m4533v, AbstractC1175q.c.a.ASCENDING));
                        } else {
                            arrayList2.add(AbstractC1175q.c.m4529f(m4533v, AbstractC1175q.c.a.DESCENDING));
                        }
                    }
                    arrayList.add(AbstractC1175q.m4517b(-1, string, arrayList2, AbstractC1175q.f3765a));
                }
            }
            return (Task) this.f12894l.m1591b(new InterfaceC2153v() { // from class: G3.M
                @Override // p116Q3.InterfaceC2153v
                public final Object apply(Object obj) {
                    Task m15459R;
                    m15459R = FirebaseFirestore.m15459R(arrayList, (C0723Q) obj);
                    return m15459R;
                }
            });
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Failed to parse index configuration", e7);
        }
    }

    /* renamed from: c0 */
    public Task m15493c0() {
        this.f12891i.remove(m15477B().m4477h());
        return this.f12894l.m1597h();
    }

    /* renamed from: d0 */
    public void m15494d0(C3949c c3949c) {
        AbstractC2157z.m7330c(c3949c, "Provided DocumentReference must not be null.");
        if (c3949c.m15550p() != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    /* renamed from: e0 */
    public Task m15495e0() {
        return (Task) this.f12894l.m1591b(new InterfaceC2153v() { // from class: G3.F
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                return ((C0723Q) obj).m3060r0();
            }
        });
    }

    /* renamed from: o */
    public InterfaceC0407U m15496o(Runnable runnable) {
        return m15498q(AbstractC2147p.f6507a, runnable);
    }

    /* renamed from: p */
    public final InterfaceC0407U m15497p(Executor executor, final Activity activity, final Runnable runnable) {
        final C0746h c0746h = new C0746h(executor, new InterfaceC0447r() { // from class: G3.K
            @Override // p046G3.InterfaceC0447r
            /* renamed from: a */
            public final void mo1589a(Object obj, C3952f c3952f) {
                FirebaseFirestore.m15454I(runnable, (Void) obj, c3952f);
            }
        });
        return (InterfaceC0407U) this.f12894l.m1591b(new InterfaceC2153v() { // from class: G3.L
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                InterfaceC0407U m15453H;
                m15453H = FirebaseFirestore.m15453H(C0746h.this, activity, (C0723Q) obj);
                return m15453H;
            }
        });
    }

    /* renamed from: q */
    public InterfaceC0407U m15498q(Executor executor, Runnable runnable) {
        return m15497p(executor, null, runnable);
    }

    /* renamed from: r */
    public C0389B0 m15499r() {
        this.f12894l.m1592c();
        return new C0389B0(this);
    }

    /* renamed from: s */
    public Object m15500s(InterfaceC2153v interfaceC2153v) {
        return this.f12894l.m1591b(interfaceC2153v);
    }

    /* renamed from: t */
    public Task m15501t() {
        return (Task) this.f12894l.m1593d(new InterfaceC2153v() { // from class: G3.I
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15502u;
                m15502u = FirebaseFirestore.this.m15502u((Executor) obj);
                return m15502u;
            }
        }, new InterfaceC2153v() { // from class: G3.J
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m15455J;
                m15455J = FirebaseFirestore.m15455J((Executor) obj);
                return m15455J;
            }
        });
    }

    /* renamed from: u */
    public final Task m15502u(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: G3.B
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseFirestore.this.m15481K(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: v */
    public C0423f m15503v(String str) {
        AbstractC2157z.m7330c(str, "Provided collection path must not be null.");
        this.f12894l.m1592c();
        return new C0423f(C1179u.m4565v(str), this);
    }

    /* renamed from: w */
    public C3955i m15504w(String str) {
        AbstractC2157z.m7330c(str, "Provided collection ID must not be null.");
        if (str.contains("/")) {
            throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", str));
        }
        this.f12894l.m1592c();
        return new C3955i(new C0737c0(C1179u.f3792b, str), this);
    }

    /* renamed from: x */
    public Task m15505x() {
        return (Task) this.f12894l.m1591b(new InterfaceC2153v() { // from class: G3.y
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                return ((C0723Q) obj).m3023C();
            }
        });
    }

    /* renamed from: y */
    public C3949c m15506y(String str) {
        AbstractC2157z.m7330c(str, "Provided document path must not be null.");
        this.f12894l.m1592c();
        return C3949c.m15536n(C1179u.m4565v(str), this);
    }

    /* renamed from: z */
    public Task m15507z() {
        return (Task) this.f12894l.m1591b(new InterfaceC2153v() { // from class: G3.x
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                return ((C0723Q) obj).m3024D();
            }
        });
    }
}
