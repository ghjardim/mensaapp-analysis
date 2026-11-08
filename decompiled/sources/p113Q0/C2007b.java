package p113Q0;

import p078L0.AbstractC0870e;
import p078L0.AbstractC0871f;
import p078L0.AbstractC0890y;
import p078L0.C0844B;
import p078L0.InterfaceC0884s;
import p256j$.util.Objects;

/* renamed from: Q0.b */
/* loaded from: classes.dex */
public final class C2007b extends AbstractC0870e {

    /* renamed from: Q0.b$b */
    public static final class b implements AbstractC0870e.f {

        /* renamed from: a */
        public final C0844B f6200a;

        /* renamed from: b */
        public final int f6201b;

        /* renamed from: c */
        public final AbstractC0890y.a f6202c;

        @Override // p078L0.AbstractC0870e.f
        /* renamed from: a */
        public AbstractC0870e.e mo3645a(InterfaceC0884s interfaceC0884s, long j7) {
            long mo3522u = interfaceC0884s.mo3522u();
            long m7133c = m7133c(interfaceC0884s);
            long mo3514i = interfaceC0884s.mo3514i();
            interfaceC0884s.mo3515k(Math.max(6, this.f6200a.f2887c));
            long m7133c2 = m7133c(interfaceC0884s);
            return (m7133c > j7 || m7133c2 <= j7) ? m7133c2 <= j7 ? AbstractC0870e.e.m3644f(m7133c2, interfaceC0884s.mo3514i()) : AbstractC0870e.e.m3642d(m7133c, mo3522u) : AbstractC0870e.e.m3643e(mo3514i);
        }

        @Override // p078L0.AbstractC0870e.f
        /* renamed from: b */
        public /* synthetic */ void mo3646b() {
            AbstractC0871f.m3647a(this);
        }

        /* renamed from: c */
        public final long m7133c(InterfaceC0884s interfaceC0884s) {
            while (interfaceC0884s.mo3514i() < interfaceC0884s.mo3511a() - 6 && !AbstractC0890y.m3705h(interfaceC0884s, this.f6200a, this.f6201b, this.f6202c)) {
                interfaceC0884s.mo3515k(1);
            }
            if (interfaceC0884s.mo3514i() < interfaceC0884s.mo3511a() - 6) {
                return this.f6202c.f3106a;
            }
            interfaceC0884s.mo3515k((int) (interfaceC0884s.mo3511a() - interfaceC0884s.mo3514i()));
            return this.f6200a.f2894j;
        }

        public b(C0844B c0844b, int i7) {
            this.f6200a = c0844b;
            this.f6201b = i7;
            this.f6202c = new AbstractC0890y.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2007b(final C0844B c0844b, int i7, long j7, long j8) {
        super(new AbstractC0870e.d() { // from class: Q0.a
            @Override // p078L0.AbstractC0870e.d
            /* renamed from: a */
            public final long mo3622a(long j9) {
                return C0844B.this.m3510i(j9);
            }
        }, new b(c0844b, i7), c0844b.m3507f(), 0L, c0844b.f2894j, j7, j8, c0844b.m3506d(), Math.max(6, c0844b.f2887c));
        Objects.requireNonNull(c0844b);
    }
}
