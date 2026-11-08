package p237g5;

import java.util.concurrent.Executor;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4427b;

/* renamed from: g5.m */
/* loaded from: classes2.dex */
public final class C4449m extends AbstractC4427b {

    /* renamed from: a */
    public final AbstractC4427b f15839a;

    /* renamed from: b */
    public final AbstractC4427b f15840b;

    /* renamed from: g5.m$a */
    public static final class a extends AbstractC4427b.a {

        /* renamed from: a */
        public final AbstractC4427b.a f15841a;

        /* renamed from: b */
        public final C4424Z f15842b;

        public a(AbstractC4427b.a aVar, C4424Z c4424z) {
            this.f15841a = aVar;
            this.f15842b = c4424z;
        }

        @Override // p237g5.AbstractC4427b.a
        /* renamed from: a */
        public void mo18845a(C4424Z c4424z) {
            AbstractC2932o.m10573p(c4424z, "headers");
            C4424Z c4424z2 = new C4424Z();
            c4424z2.m18785m(this.f15842b);
            c4424z2.m18785m(c4424z);
            this.f15841a.mo18845a(c4424z2);
        }

        @Override // p237g5.AbstractC4427b.a
        /* renamed from: b */
        public void mo18846b(C4448l0 c4448l0) {
            this.f15841a.mo18846b(c4448l0);
        }
    }

    /* renamed from: g5.m$b */
    public final class b extends AbstractC4427b.a {

        /* renamed from: a */
        public final AbstractC4427b.b f15843a;

        /* renamed from: b */
        public final Executor f15844b;

        /* renamed from: c */
        public final AbstractC4427b.a f15845c;

        /* renamed from: d */
        public final C4459r f15846d;

        public b(AbstractC4427b.b bVar, Executor executor, AbstractC4427b.a aVar, C4459r c4459r) {
            this.f15843a = bVar;
            this.f15844b = executor;
            this.f15845c = (AbstractC4427b.a) AbstractC2932o.m10573p(aVar, "delegate");
            this.f15846d = (C4459r) AbstractC2932o.m10573p(c4459r, "context");
        }

        @Override // p237g5.AbstractC4427b.a
        /* renamed from: a */
        public void mo18845a(C4424Z c4424z) {
            AbstractC2932o.m10573p(c4424z, "headers");
            C4459r m19008b = this.f15846d.m19008b();
            try {
                C4449m.this.f15840b.mo6910a(this.f15843a, this.f15844b, new a(this.f15845c, c4424z));
            } finally {
                this.f15846d.m19010f(m19008b);
            }
        }

        @Override // p237g5.AbstractC4427b.a
        /* renamed from: b */
        public void mo18846b(C4448l0 c4448l0) {
            this.f15845c.mo18846b(c4448l0);
        }
    }

    public C4449m(AbstractC4427b abstractC4427b, AbstractC4427b abstractC4427b2) {
        this.f15839a = (AbstractC4427b) AbstractC2932o.m10573p(abstractC4427b, "creds1");
        this.f15840b = (AbstractC4427b) AbstractC2932o.m10573p(abstractC4427b2, "creds2");
    }

    @Override // p237g5.AbstractC4427b
    /* renamed from: a */
    public void mo6910a(AbstractC4427b.b bVar, Executor executor, AbstractC4427b.a aVar) {
        this.f15839a.mo6910a(bVar, executor, new b(bVar, executor, aVar, C4459r.m19004e()));
    }
}
