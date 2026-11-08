package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C3950d;
import com.google.firebase.firestore.C3958l;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p046G3.C0448r0;
import p067J3.C0755l0;
import p067J3.C0773u0;
import p088M3.C1177s;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2157z;

/* renamed from: com.google.firebase.firestore.l */
/* loaded from: classes.dex */
public class C3958l {

    /* renamed from: a */
    public final C0755l0 f12972a;

    /* renamed from: b */
    public final FirebaseFirestore f12973b;

    /* renamed from: com.google.firebase.firestore.l$a */
    public interface a {
        /* renamed from: a */
        Object mo7702a(C3958l c3958l);
    }

    public C3958l(C0755l0 c0755l0, FirebaseFirestore firebaseFirestore) {
        this.f12972a = (C0755l0) AbstractC2157z.m7329b(c0755l0);
        this.f12973b = (FirebaseFirestore) AbstractC2157z.m7329b(firebaseFirestore);
    }

    /* renamed from: b */
    public C3958l m15667b(C3949c c3949c) {
        this.f12973b.m15494d0(c3949c);
        this.f12972a.m3240e(c3949c.m15551q());
        return this;
    }

    /* renamed from: c */
    public C3950d m15668c(C3949c c3949c) {
        this.f12973b.m15494d0(c3949c);
        try {
            return (C3950d) Tasks.await(m15669d(c3949c));
        } catch (InterruptedException e7) {
            throw new RuntimeException(e7);
        } catch (ExecutionException e8) {
            if (e8.getCause() instanceof C3952f) {
                throw ((C3952f) e8.getCause());
            }
            throw new RuntimeException(e8.getCause());
        }
    }

    /* renamed from: d */
    public final Task m15669d(C3949c c3949c) {
        return this.f12972a.m3243j(Collections.singletonList(c3949c.m15551q())).continueWith(AbstractC2147p.f6508b, new Continuation() { // from class: G3.w0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                C3950d m15670e;
                m15670e = C3958l.this.m15670e(task);
                return m15670e;
            }
        });
    }

    /* renamed from: e */
    public final /* synthetic */ C3950d m15670e(Task task) {
        if (!task.isSuccessful()) {
            throw task.getException();
        }
        List list = (List) task.getResult();
        if (list.size() != 1) {
            throw AbstractC2133b.m7214a("Mismatch in docs returned from document lookup.", new Object[0]);
        }
        C1177s c1177s = (C1177s) list.get(0);
        if (c1177s.mo4482c()) {
            return C3950d.m15557b(this.f12973b, c1177s, false, false);
        }
        if (c1177s.mo4488i()) {
            return C3950d.m15558c(this.f12973b, c1177s.getKey(), false);
        }
        throw AbstractC2133b.m7214a("BatchGetDocumentsRequest returned unexpected document type: " + C1177s.class.getCanonicalName(), new Object[0]);
    }

    /* renamed from: f */
    public C3958l m15671f(C3949c c3949c, Object obj) {
        return m15672g(c3949c, obj, C0448r0.f1596c);
    }

    /* renamed from: g */
    public C3958l m15672g(C3949c c3949c, Object obj, C0448r0 c0448r0) {
        this.f12973b.m15494d0(c3949c);
        AbstractC2157z.m7330c(obj, "Provided data must not be null.");
        AbstractC2157z.m7330c(c0448r0, "Provided options must not be null.");
        this.f12972a.m3247n(c3949c.m15551q(), c0448r0.m1660b() ? this.f12973b.m15480F().m1699g(obj, c0448r0.m1659a()) : this.f12973b.m15480F().m1704l(obj));
        return this;
    }

    /* renamed from: h */
    public final C3958l m15673h(C3949c c3949c, C0773u0 c0773u0) {
        this.f12973b.m15494d0(c3949c);
        this.f12972a.m3248o(c3949c.m15551q(), c0773u0);
        return this;
    }

    /* renamed from: i */
    public C3958l m15674i(C3949c c3949c, Map map) {
        return m15673h(c3949c, this.f12973b.m15480F().m1707o(map));
    }
}
