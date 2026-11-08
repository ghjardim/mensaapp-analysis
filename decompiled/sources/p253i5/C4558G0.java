package p253i5;

import p237g5.AbstractC4430c0;
import p237g5.C4425a;
import p237g5.C4448l0;
import p237g5.ExecutorC4456p0;
import p253i5.C4558G0;

/* renamed from: i5.G0 */
/* loaded from: classes2.dex */
public final class C4558G0 extends AbstractC4571N {

    /* renamed from: e */
    public static final C4425a.c f16519e = C4425a.c.m18825a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* renamed from: b */
    public final AbstractC4430c0 f16520b;

    /* renamed from: c */
    public final InterfaceC4556F0 f16521c;

    /* renamed from: d */
    public final ExecutorC4456p0 f16522d;

    /* renamed from: i5.G0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4558G0.this.mo18872b();
        }
    }

    /* renamed from: i5.G0$b */
    public class b {
        public b() {
        }

        /* renamed from: a */
        public void m19513a(C4448l0 c4448l0) {
            if (c4448l0.m18961o()) {
                C4558G0.this.f16521c.reset();
            } else {
                C4558G0.this.f16521c.mo19510a(C4558G0.this.new a());
            }
        }
    }

    /* renamed from: i5.G0$c */
    public class c extends AbstractC4430c0.d {

        /* renamed from: a */
        public AbstractC4430c0.d f16525a;

        public c(AbstractC4430c0.d dVar) {
            this.f16525a = dVar;
        }

        @Override // p237g5.AbstractC4430c0.d
        /* renamed from: a */
        public void mo18897a(C4448l0 c4448l0) {
            this.f16525a.mo18897a(c4448l0);
            C4558G0.this.f16522d.execute(new Runnable() { // from class: i5.H0
                @Override // java.lang.Runnable
                public final void run() {
                    C4558G0.c.this.m19515d();
                }
            });
        }

        @Override // p237g5.AbstractC4430c0.d
        /* renamed from: b */
        public void mo18898b(AbstractC4430c0.e eVar) {
            C4425a m18901b = eVar.m18901b();
            C4425a.c cVar = C4558G0.f16519e;
            if (m18901b.m18819b(cVar) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            this.f16525a.mo18898b(eVar.m18903e().m18906c(eVar.m18901b().m18820d().m18824d(cVar, C4558G0.this.new b()).m18821a()).m18904a());
        }

        /* renamed from: d */
        public final /* synthetic */ void m19515d() {
            C4558G0.this.f16521c.mo19510a(C4558G0.this.new a());
        }
    }

    public C4558G0(AbstractC4430c0 abstractC4430c0, InterfaceC4556F0 interfaceC4556F0, ExecutorC4456p0 executorC4456p0) {
        super(abstractC4430c0);
        this.f16520b = abstractC4430c0;
        this.f16521c = interfaceC4556F0;
        this.f16522d = executorC4456p0;
    }

    @Override // p253i5.AbstractC4571N, p237g5.AbstractC4430c0
    /* renamed from: c */
    public void mo18873c() {
        super.mo18873c();
        this.f16521c.reset();
    }

    @Override // p253i5.AbstractC4571N, p237g5.AbstractC4430c0
    /* renamed from: d */
    public void mo18874d(AbstractC4430c0.d dVar) {
        super.mo18874d(new c(dVar));
    }
}
