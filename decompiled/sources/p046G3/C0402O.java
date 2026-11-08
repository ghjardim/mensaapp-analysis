package p046G3;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p042G.InterfaceC0339a;
import p067J3.C0723Q;
import p116Q3.C2138g;
import p116Q3.InterfaceC2153v;

/* renamed from: G3.O */
/* loaded from: classes.dex */
public final class C0402O {

    /* renamed from: a */
    public final InterfaceC2153v f1512a;

    /* renamed from: b */
    public C0723Q f1513b;

    /* renamed from: c */
    public C2138g f1514c = new C2138g();

    public C0402O(InterfaceC2153v interfaceC2153v) {
        this.f1512a = interfaceC2153v;
    }

    /* renamed from: b */
    public synchronized Object m1591b(InterfaceC2153v interfaceC2153v) {
        m1592c();
        return interfaceC2153v.apply(this.f1513b);
    }

    /* renamed from: c */
    public synchronized void m1592c() {
        if (!m1594e()) {
            this.f1513b = (C0723Q) this.f1512a.apply(this.f1514c);
        }
    }

    /* renamed from: d */
    public synchronized Object m1593d(InterfaceC2153v interfaceC2153v, InterfaceC2153v interfaceC2153v2) {
        Executor executor = new Executor() { // from class: G3.N
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C0402O.this.m1595f(runnable);
            }
        };
        C0723Q c0723q = this.f1513b;
        if (c0723q != null && !c0723q.m3029I()) {
            return interfaceC2153v2.apply(executor);
        }
        return interfaceC2153v.apply(executor);
    }

    /* renamed from: e */
    public boolean m1594e() {
        return this.f1513b != null;
    }

    /* renamed from: f */
    public final /* synthetic */ void m1595f(Runnable runnable) {
        this.f1514c.m7235m(runnable);
    }

    /* renamed from: g */
    public synchronized void m1596g(InterfaceC0339a interfaceC0339a) {
        m1592c();
        interfaceC0339a.accept(this.f1513b);
    }

    /* renamed from: h */
    public synchronized Task m1597h() {
        Task m3057o0;
        m1592c();
        m3057o0 = this.f1513b.m3057o0();
        this.f1514c.m7241w();
        return m3057o0;
    }
}
