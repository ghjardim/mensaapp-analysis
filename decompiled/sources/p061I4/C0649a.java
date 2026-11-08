package p061I4;

import java.nio.ByteBuffer;
import p061I4.InterfaceC0651c;
import p370w4.AbstractC6917b;

/* renamed from: I4.a */
/* loaded from: classes.dex */
public final class C0649a {

    /* renamed from: a */
    public final InterfaceC0651c f2230a;

    /* renamed from: b */
    public final String f2231b;

    /* renamed from: c */
    public final InterfaceC0657i f2232c;

    /* renamed from: d */
    public final InterfaceC0651c.c f2233d;

    /* renamed from: I4.a$b */
    public final class b implements InterfaceC0651c.a {

        /* renamed from: a */
        public final d f2234a;

        /* renamed from: I4.a$b$a */
        public class a implements e {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC0651c.b f2236a;

            public a(InterfaceC0651c.b bVar) {
                this.f2236a = bVar;
            }

            @Override // p061I4.C0649a.e
            /* renamed from: a */
            public void mo2187a(Object obj) {
                this.f2236a.mo2616a(C0649a.this.f2232c.mo2637a(obj));
            }
        }

        @Override // p061I4.InterfaceC0651c.a
        /* renamed from: a */
        public void mo2615a(ByteBuffer byteBuffer, InterfaceC0651c.b bVar) {
            try {
                this.f2234a.mo2170a(C0649a.this.f2232c.mo2638b(byteBuffer), new a(bVar));
            } catch (RuntimeException e7) {
                AbstractC6917b.m28355c("BasicMessageChannel#" + C0649a.this.f2231b, "Failed to handle message", e7);
                bVar.mo2616a(null);
            }
        }

        public b(d dVar) {
            this.f2234a = dVar;
        }
    }

    /* renamed from: I4.a$c */
    public final class c implements InterfaceC0651c.b {

        /* renamed from: a */
        public final e f2238a;

        @Override // p061I4.InterfaceC0651c.b
        /* renamed from: a */
        public void mo2616a(ByteBuffer byteBuffer) {
            try {
                this.f2238a.mo2187a(C0649a.this.f2232c.mo2638b(byteBuffer));
            } catch (RuntimeException e7) {
                AbstractC6917b.m28355c("BasicMessageChannel#" + C0649a.this.f2231b, "Failed to handle message reply", e7);
            }
        }

        public c(e eVar) {
            this.f2238a = eVar;
        }
    }

    /* renamed from: I4.a$d */
    public interface d {
        /* renamed from: a */
        void mo2170a(Object obj, e eVar);
    }

    /* renamed from: I4.a$e */
    public interface e {
        /* renamed from: a */
        void mo2187a(Object obj);
    }

    public C0649a(InterfaceC0651c interfaceC0651c, String str, InterfaceC0657i interfaceC0657i) {
        this(interfaceC0651c, str, interfaceC0657i, null);
    }

    /* renamed from: c */
    public void m2612c(Object obj) {
        m2613d(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public void m2613d(Object obj, e eVar) {
        this.f2230a.mo2622e(this.f2231b, this.f2232c.mo2637a(obj), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [I4.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [I4.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [I4.c$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* renamed from: e */
    public void m2614e(d dVar) {
        if (this.f2233d != null) {
            this.f2230a.mo2623f(this.f2231b, dVar != null ? new b(dVar) : null, this.f2233d);
        } else {
            this.f2230a.mo2620c(this.f2231b, dVar != null ? new b(dVar) : 0);
        }
    }

    public C0649a(InterfaceC0651c interfaceC0651c, String str, InterfaceC0657i interfaceC0657i, InterfaceC0651c.c cVar) {
        this.f2230a = interfaceC0651c;
        this.f2231b = str;
        this.f2232c = interfaceC0657i;
        this.f2233d = cVar;
    }
}
