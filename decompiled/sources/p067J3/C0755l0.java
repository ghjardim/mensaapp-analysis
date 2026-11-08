package p067J3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C3952f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1181w;
import p095N3.AbstractC1266f;
import p095N3.C1263c;
import p095N3.C1273m;
import p095N3.C1277q;
import p109P3.C1938r;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2147p;

/* renamed from: J3.l0 */
/* loaded from: classes.dex */
public class C0755l0 {

    /* renamed from: g */
    public static final Executor f2673g = m3236d();

    /* renamed from: a */
    public final C1938r f2674a;

    /* renamed from: d */
    public boolean f2677d;

    /* renamed from: e */
    public C3952f f2678e;

    /* renamed from: b */
    public final HashMap f2675b = new HashMap();

    /* renamed from: c */
    public final ArrayList f2676c = new ArrayList();

    /* renamed from: f */
    public Set f2679f = new HashSet();

    public C0755l0(C1938r c1938r) {
        this.f2674a = c1938r;
    }

    /* renamed from: d */
    public static Executor m3236d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: g */
    public static Executor m3237g() {
        return f2673g;
    }

    /* renamed from: h */
    public static /* synthetic */ Task m3238h(Task task) {
        return task.isSuccessful() ? Tasks.forResult(null) : Tasks.forException(task.getException());
    }

    /* renamed from: c */
    public Task m3239c() {
        m3241f();
        C3952f c3952f = this.f2678e;
        if (c3952f != null) {
            return Tasks.forException(c3952f);
        }
        HashSet hashSet = new HashSet(this.f2675b.keySet());
        Iterator it = this.f2676c.iterator();
        while (it.hasNext()) {
            hashSet.remove(((AbstractC1266f) it.next()).m4835g());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C1170l c1170l = (C1170l) it2.next();
            this.f2676c.add(new C1277q(c1170l, m3244k(c1170l)));
        }
        this.f2677d = true;
        return this.f2674a.m6894d(this.f2676c).continueWithTask(AbstractC2147p.f6508b, new Continuation() { // from class: J3.k0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m3238h;
                m3238h = C0755l0.m3238h(task);
                return m3238h;
            }
        });
    }

    /* renamed from: e */
    public void m3240e(C1170l c1170l) {
        m3249p(Collections.singletonList(new C1263c(c1170l, m3244k(c1170l))));
        this.f2679f.add(c1170l);
    }

    /* renamed from: f */
    public final void m3241f() {
        AbstractC2133b.m7217d(!this.f2677d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    /* renamed from: i */
    public final /* synthetic */ Task m3242i(Task task) {
        if (task.isSuccessful()) {
            Iterator it = ((List) task.getResult()).iterator();
            while (it.hasNext()) {
                m3246m((C1177s) it.next());
            }
        }
        return task;
    }

    /* renamed from: j */
    public Task m3243j(List list) {
        m3241f();
        return this.f2676c.size() != 0 ? Tasks.forException(new C3952f("Firestore transactions require all reads to be executed before all writes.", C3952f.a.INVALID_ARGUMENT)) : this.f2674a.m6899m(list).continueWithTask(AbstractC2147p.f6508b, new Continuation() { // from class: J3.j0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m3242i;
                m3242i = C0755l0.this.m3242i(task);
                return m3242i;
            }
        });
    }

    /* renamed from: k */
    public final C1273m m3244k(C1170l c1170l) {
        C1181w c1181w = (C1181w) this.f2675b.get(c1170l);
        return (this.f2679f.contains(c1170l) || c1181w == null) ? C1273m.f4009c : c1181w.equals(C1181w.f3793b) ? C1273m.m4868a(false) : C1273m.m4869f(c1181w);
    }

    /* renamed from: l */
    public final C1273m m3245l(C1170l c1170l) {
        C1181w c1181w = (C1181w) this.f2675b.get(c1170l);
        if (this.f2679f.contains(c1170l) || c1181w == null) {
            return C1273m.m4868a(true);
        }
        if (c1181w.equals(C1181w.f3793b)) {
            throw new C3952f("Can't update a document that doesn't exist.", C3952f.a.INVALID_ARGUMENT);
        }
        return C1273m.m4869f(c1181w);
    }

    /* renamed from: m */
    public final void m3246m(C1177s c1177s) {
        C1181w c1181w;
        if (c1177s.mo4482c()) {
            c1181w = c1177s.mo4490k();
        } else {
            if (!c1177s.mo4488i()) {
                throw AbstractC2133b.m7214a("Unexpected document type in transaction: " + c1177s, new Object[0]);
            }
            c1181w = C1181w.f3793b;
        }
        if (!this.f2675b.containsKey(c1177s.getKey())) {
            this.f2675b.put(c1177s.getKey(), c1181w);
        } else if (!((C1181w) this.f2675b.get(c1177s.getKey())).equals(c1177s.mo4490k())) {
            throw new C3952f("Document version changed between two reads.", C3952f.a.ABORTED);
        }
    }

    /* renamed from: n */
    public void m3247n(C1170l c1170l, C0771t0 c0771t0) {
        m3249p(Collections.singletonList(c0771t0.m3308a(c1170l, m3244k(c1170l))));
        this.f2679f.add(c1170l);
    }

    /* renamed from: o */
    public void m3248o(C1170l c1170l, C0773u0 c0773u0) {
        try {
            m3249p(Collections.singletonList(c0773u0.m3309a(c1170l, m3245l(c1170l))));
        } catch (C3952f e7) {
            this.f2678e = e7;
        }
        this.f2679f.add(c1170l);
    }

    /* renamed from: p */
    public final void m3249p(List list) {
        m3241f();
        this.f2676c.addAll(list);
    }
}
