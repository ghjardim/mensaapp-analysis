package p109P3;

import p067J3.AbstractC0750j;
import p116Q3.AbstractC2133b;

/* renamed from: P3.N */
/* loaded from: classes.dex */
public class C1905N {

    /* renamed from: a */
    public C1900I f5673a;

    /* renamed from: b */
    public C1907P f5674b;

    /* renamed from: c */
    public C1946z f5675c;

    /* renamed from: d */
    public C1938r f5676d;

    /* renamed from: e */
    public InterfaceC1935o f5677e;

    /* renamed from: a */
    public InterfaceC1935o m6632a(AbstractC0750j.a aVar) {
        return new C1931k(aVar.f2653a);
    }

    /* renamed from: b */
    public C1938r m6633b(AbstractC0750j.a aVar) {
        return new C1938r(aVar.f2654b, m6641j(), m6639h());
    }

    /* renamed from: c */
    public C1946z m6634c(AbstractC0750j.a aVar) {
        return new C1946z(aVar.f2654b, aVar.f2658f, aVar.f2659g, aVar.f2655c.m3230a(), aVar.f2660h, m6640i());
    }

    /* renamed from: d */
    public C1900I m6635d(AbstractC0750j.a aVar) {
        return new C1900I(aVar.f2654b, aVar.f2653a, aVar.f2655c, new C1942v(aVar.f2658f, aVar.f2659g));
    }

    /* renamed from: e */
    public C1907P m6636e(AbstractC0750j.a aVar) {
        return new C1907P(aVar.f2655c.m3230a());
    }

    /* renamed from: f */
    public InterfaceC1935o m6637f() {
        return (InterfaceC1935o) AbstractC2133b.m7218e(this.f5677e, "connectivityMonitor not initialized yet", new Object[0]);
    }

    /* renamed from: g */
    public C1938r m6638g() {
        return (C1938r) AbstractC2133b.m7218e(this.f5676d, "datastore not initialized yet", new Object[0]);
    }

    /* renamed from: h */
    public C1946z m6639h() {
        return (C1946z) AbstractC2133b.m7218e(this.f5675c, "firestoreChannel not initialized yet", new Object[0]);
    }

    /* renamed from: i */
    public C1900I m6640i() {
        return (C1900I) AbstractC2133b.m7218e(this.f5673a, "grpcCallProvider not initialized yet", new Object[0]);
    }

    /* renamed from: j */
    public C1907P m6641j() {
        return (C1907P) AbstractC2133b.m7218e(this.f5674b, "remoteSerializer not initialized yet", new Object[0]);
    }

    /* renamed from: k */
    public void m6642k(AbstractC0750j.a aVar) {
        this.f5674b = m6636e(aVar);
        this.f5673a = m6635d(aVar);
        this.f5675c = m6634c(aVar);
        this.f5676d = m6633b(aVar);
        this.f5677e = m6632a(aVar);
    }
}
