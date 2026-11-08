package p061I4;

import java.nio.ByteBuffer;
import p061I4.InterfaceC0651c;
import p370w4.AbstractC6917b;

/* renamed from: I4.k */
/* loaded from: classes.dex */
public class C0659k {

    /* renamed from: a */
    public final InterfaceC0651c f2256a;

    /* renamed from: b */
    public final String f2257b;

    /* renamed from: c */
    public final InterfaceC0660l f2258c;

    /* renamed from: d */
    public final InterfaceC0651c.c f2259d;

    /* renamed from: I4.k$a */
    public final class a implements InterfaceC0651c.a {

        /* renamed from: a */
        public final c f2260a;

        /* renamed from: I4.k$a$a, reason: collision with other inner class name */
        public class C7170a implements d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC0651c.b f2262a;

            public C7170a(InterfaceC0651c.b bVar) {
                this.f2262a = bVar;
            }

            @Override // p061I4.C0659k.d
            /* renamed from: a */
            public void mo2314a(Object obj) {
                this.f2262a.mo2616a(C0659k.this.f2258c.mo2640b(obj));
            }

            @Override // p061I4.C0659k.d
            /* renamed from: b */
            public void mo2315b(String str, String str2, Object obj) {
                this.f2262a.mo2616a(C0659k.this.f2258c.mo2642d(str, str2, obj));
            }

            @Override // p061I4.C0659k.d
            /* renamed from: c */
            public void mo2316c() {
                this.f2262a.mo2616a(null);
            }
        }

        public a(c cVar) {
            this.f2260a = cVar;
        }

        @Override // p061I4.InterfaceC0651c.a
        /* renamed from: a */
        public void mo2615a(ByteBuffer byteBuffer, InterfaceC0651c.b bVar) {
            try {
                this.f2260a.mo2185b(C0659k.this.f2258c.mo2639a(byteBuffer), new C7170a(bVar));
            } catch (RuntimeException e7) {
                AbstractC6917b.m28355c("MethodChannel#" + C0659k.this.f2257b, "Failed to handle method call", e7);
                bVar.mo2616a(C0659k.this.f2258c.mo2641c("error", e7.getMessage(), null, AbstractC6917b.m28356d(e7)));
            }
        }
    }

    /* renamed from: I4.k$b */
    public final class b implements InterfaceC0651c.b {

        /* renamed from: a */
        public final d f2264a;

        public b(d dVar) {
            this.f2264a = dVar;
        }

        @Override // p061I4.InterfaceC0651c.b
        /* renamed from: a */
        public void mo2616a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f2264a.mo2316c();
                } else {
                    try {
                        this.f2264a.mo2314a(C0659k.this.f2258c.mo2643e(byteBuffer));
                    } catch (C0653e e7) {
                        this.f2264a.mo2315b(e7.f2250a, e7.getMessage(), e7.f2251b);
                    }
                }
            } catch (RuntimeException e8) {
                AbstractC6917b.m28355c("MethodChannel#" + C0659k.this.f2257b, "Failed to handle method call result", e8);
            }
        }
    }

    /* renamed from: I4.k$c */
    public interface c {
        /* renamed from: b */
        void mo2185b(C0658j c0658j, d dVar);
    }

    /* renamed from: I4.k$d */
    public interface d {
        /* renamed from: a */
        void mo2314a(Object obj);

        /* renamed from: b */
        void mo2315b(String str, String str2, Object obj);

        /* renamed from: c */
        void mo2316c();
    }

    public C0659k(InterfaceC0651c interfaceC0651c, String str) {
        this(interfaceC0651c, str, C0665q.f2269b);
    }

    /* renamed from: c */
    public void m2652c(String str, Object obj) {
        m2653d(str, obj, null);
    }

    /* renamed from: d */
    public void m2653d(String str, Object obj, d dVar) {
        this.f2256a.mo2622e(this.f2257b, this.f2258c.mo2644f(new C0658j(str, obj)), dVar == null ? null : new b(dVar));
    }

    /* renamed from: e */
    public void m2654e(c cVar) {
        if (this.f2259d != null) {
            this.f2256a.mo2623f(this.f2257b, cVar != null ? new a(cVar) : null, this.f2259d);
        } else {
            this.f2256a.mo2620c(this.f2257b, cVar != null ? new a(cVar) : null);
        }
    }

    public C0659k(InterfaceC0651c interfaceC0651c, String str, InterfaceC0660l interfaceC0660l) {
        this(interfaceC0651c, str, interfaceC0660l, null);
    }

    public C0659k(InterfaceC0651c interfaceC0651c, String str, InterfaceC0660l interfaceC0660l, InterfaceC0651c.c cVar) {
        this.f2256a = interfaceC0651c;
        this.f2257b = str;
        this.f2258c = interfaceC0660l;
        this.f2259d = cVar;
    }
}
