package p061I4;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p061I4.InterfaceC0651c;
import p370w4.AbstractC6917b;

/* renamed from: I4.d */
/* loaded from: classes.dex */
public final class C0652d {

    /* renamed from: a */
    public final InterfaceC0651c f2241a;

    /* renamed from: b */
    public final String f2242b;

    /* renamed from: c */
    public final InterfaceC0660l f2243c;

    /* renamed from: d */
    public final InterfaceC0651c.c f2244d;

    /* renamed from: I4.d$b */
    public interface b {
        /* renamed from: a */
        void mo2629a(Object obj);

        /* renamed from: b */
        void mo2630b(String str, String str2, Object obj);

        /* renamed from: c */
        void mo2631c();
    }

    /* renamed from: I4.d$c */
    public final class c implements InterfaceC0651c.a {

        /* renamed from: a */
        public final d f2245a;

        /* renamed from: b */
        public final AtomicReference f2246b = new AtomicReference(null);

        /* renamed from: I4.d$c$a */
        public final class a implements b {

            /* renamed from: a */
            public final AtomicBoolean f2248a;

            public a() {
                this.f2248a = new AtomicBoolean(false);
            }

            @Override // p061I4.C0652d.b
            /* renamed from: a */
            public void mo2629a(Object obj) {
                if (this.f2248a.get() || c.this.f2246b.get() != this) {
                    return;
                }
                C0652d.this.f2241a.mo2621d(C0652d.this.f2242b, C0652d.this.f2243c.mo2640b(obj));
            }

            @Override // p061I4.C0652d.b
            /* renamed from: b */
            public void mo2630b(String str, String str2, Object obj) {
                if (this.f2248a.get() || c.this.f2246b.get() != this) {
                    return;
                }
                C0652d.this.f2241a.mo2621d(C0652d.this.f2242b, C0652d.this.f2243c.mo2642d(str, str2, obj));
            }

            @Override // p061I4.C0652d.b
            /* renamed from: c */
            public void mo2631c() {
                if (this.f2248a.getAndSet(true) || c.this.f2246b.get() != this) {
                    return;
                }
                C0652d.this.f2241a.mo2621d(C0652d.this.f2242b, null);
            }
        }

        public c(d dVar) {
            this.f2245a = dVar;
        }

        @Override // p061I4.InterfaceC0651c.a
        /* renamed from: a */
        public void mo2615a(ByteBuffer byteBuffer, InterfaceC0651c.b bVar) {
            C0658j mo2639a = C0652d.this.f2243c.mo2639a(byteBuffer);
            if (mo2639a.f2254a.equals("listen")) {
                m2634d(mo2639a.f2255b, bVar);
            } else if (mo2639a.f2254a.equals("cancel")) {
                m2633c(mo2639a.f2255b, bVar);
            } else {
                bVar.mo2616a(null);
            }
        }

        /* renamed from: c */
        public final void m2633c(Object obj, InterfaceC0651c.b bVar) {
            if (((b) this.f2246b.getAndSet(null)) == null) {
                bVar.mo2616a(C0652d.this.f2243c.mo2642d("error", "No active stream to cancel", null));
                return;
            }
            try {
                this.f2245a.mo2635a(obj);
                bVar.mo2616a(C0652d.this.f2243c.mo2640b(null));
            } catch (RuntimeException e7) {
                AbstractC6917b.m28355c("EventChannel#" + C0652d.this.f2242b, "Failed to close event stream", e7);
                bVar.mo2616a(C0652d.this.f2243c.mo2642d("error", e7.getMessage(), null));
            }
        }

        /* renamed from: d */
        public final void m2634d(Object obj, InterfaceC0651c.b bVar) {
            a aVar = new a();
            if (((b) this.f2246b.getAndSet(aVar)) != null) {
                try {
                    this.f2245a.mo2635a(null);
                } catch (RuntimeException e7) {
                    AbstractC6917b.m28355c("EventChannel#" + C0652d.this.f2242b, "Failed to close existing event stream", e7);
                }
            }
            try {
                this.f2245a.mo2636c(obj, aVar);
                bVar.mo2616a(C0652d.this.f2243c.mo2640b(null));
            } catch (RuntimeException e8) {
                this.f2246b.set(null);
                AbstractC6917b.m28355c("EventChannel#" + C0652d.this.f2242b, "Failed to open event stream", e8);
                bVar.mo2616a(C0652d.this.f2243c.mo2642d("error", e8.getMessage(), null));
            }
        }
    }

    /* renamed from: I4.d$d */
    public interface d {
        /* renamed from: a */
        void mo2635a(Object obj);

        /* renamed from: c */
        void mo2636c(Object obj, b bVar);
    }

    public C0652d(InterfaceC0651c interfaceC0651c, String str) {
        this(interfaceC0651c, str, C0665q.f2269b);
    }

    /* renamed from: d */
    public void m2628d(d dVar) {
        if (this.f2244d != null) {
            this.f2241a.mo2623f(this.f2242b, dVar != null ? new c(dVar) : null, this.f2244d);
        } else {
            this.f2241a.mo2620c(this.f2242b, dVar != null ? new c(dVar) : null);
        }
    }

    public C0652d(InterfaceC0651c interfaceC0651c, String str, InterfaceC0660l interfaceC0660l) {
        this(interfaceC0651c, str, interfaceC0660l, null);
    }

    public C0652d(InterfaceC0651c interfaceC0651c, String str, InterfaceC0660l interfaceC0660l, InterfaceC0651c.c cVar) {
        this.f2241a = interfaceC0651c;
        this.f2242b = str;
        this.f2243c = interfaceC0660l;
        this.f2244d = cVar;
    }
}
