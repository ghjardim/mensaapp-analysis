package p046G3;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C3949c;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Map;
import p067J3.C0723Q;
import p067J3.C0773u0;
import p095N3.C1263c;
import p095N3.C1273m;
import p116Q3.AbstractC2157z;
import p116Q3.InterfaceC2153v;

/* renamed from: G3.B0 */
/* loaded from: classes.dex */
public class C0389B0 {

    /* renamed from: a */
    public final FirebaseFirestore f1495a;

    /* renamed from: b */
    public final ArrayList f1496b = new ArrayList();

    /* renamed from: c */
    public boolean f1497c = false;

    public C0389B0(FirebaseFirestore firebaseFirestore) {
        this.f1495a = (FirebaseFirestore) AbstractC2157z.m7329b(firebaseFirestore);
    }

    /* renamed from: b */
    public Task m1581b() {
        m1588i();
        this.f1497c = true;
        return !this.f1496b.isEmpty() ? (Task) this.f1495a.m15500s(new InterfaceC2153v() { // from class: G3.A0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Task m1583d;
                m1583d = C0389B0.this.m1583d((C0723Q) obj);
                return m1583d;
            }
        }) : Tasks.forResult(null);
    }

    /* renamed from: c */
    public C0389B0 m1582c(C3949c c3949c) {
        this.f1495a.m15494d0(c3949c);
        m1588i();
        this.f1496b.add(new C1263c(c3949c.m15551q(), C1273m.f4009c));
        return this;
    }

    /* renamed from: d */
    public final /* synthetic */ Task m1583d(C0723Q c0723q) {
        return c0723q.m3061s0(this.f1496b);
    }

    /* renamed from: e */
    public C0389B0 m1584e(C3949c c3949c, Object obj) {
        return m1585f(c3949c, obj, C0448r0.f1596c);
    }

    /* renamed from: f */
    public C0389B0 m1585f(C3949c c3949c, Object obj, C0448r0 c0448r0) {
        this.f1495a.m15494d0(c3949c);
        AbstractC2157z.m7330c(obj, "Provided data must not be null.");
        AbstractC2157z.m7330c(c0448r0, "Provided options must not be null.");
        m1588i();
        this.f1496b.add((c0448r0.m1660b() ? this.f1495a.m15480F().m1699g(obj, c0448r0.m1659a()) : this.f1495a.m15480F().m1704l(obj)).m3308a(c3949c.m15551q(), C1273m.f4009c));
        return this;
    }

    /* renamed from: g */
    public final C0389B0 m1586g(C3949c c3949c, C0773u0 c0773u0) {
        this.f1495a.m15494d0(c3949c);
        m1588i();
        this.f1496b.add(c0773u0.m3309a(c3949c.m15551q(), C1273m.m4868a(true)));
        return this;
    }

    /* renamed from: h */
    public C0389B0 m1587h(C3949c c3949c, Map map) {
        return m1586g(c3949c, this.f1495a.m15480F().m1707o(map));
    }

    /* renamed from: i */
    public final void m1588i() {
        if (this.f1497c) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }
}
