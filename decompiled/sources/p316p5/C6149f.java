package p316p5;

import p171Y2.AbstractC2932o;
import p237g5.AbstractC4417S;
import p237g5.C4425a;
import p237g5.C4457q;

/* renamed from: p5.f */
/* loaded from: classes2.dex */
public final class C6149f extends AbstractC6146c {

    /* renamed from: a */
    public final AbstractC4417S.e f21951a;

    /* renamed from: p5.f$a */
    public static final class a extends AbstractC6147d {

        /* renamed from: a */
        public final AbstractC4417S.i f21952a;

        /* renamed from: b */
        public final AbstractC4417S.k f21953b;

        /* renamed from: p5.f$a$a, reason: collision with other inner class name */
        public class C7237a implements AbstractC4417S.k {

            /* renamed from: a */
            public final /* synthetic */ AbstractC4417S.k f21954a;

            public C7237a(AbstractC4417S.k kVar) {
                this.f21954a = kVar;
            }

            @Override // p237g5.AbstractC4417S.k
            /* renamed from: a */
            public void mo18735a(C4457q c4457q) {
                this.f21954a.mo18735a(c4457q);
                a.this.f21953b.mo18735a(c4457q);
            }
        }

        public a(AbstractC4417S.i iVar, AbstractC4417S.k kVar) {
            this.f21952a = (AbstractC4417S.i) AbstractC2932o.m10573p(iVar, "delegate");
            this.f21953b = (AbstractC4417S.k) AbstractC2932o.m10573p(kVar, "healthListener");
        }

        @Override // p316p5.AbstractC6147d, p237g5.AbstractC4417S.i
        /* renamed from: c */
        public C4425a mo18727c() {
            return super.mo18727c().m18820d().m18824d(AbstractC4417S.f15640d, Boolean.TRUE).m18821a();
        }

        @Override // p316p5.AbstractC6147d, p237g5.AbstractC4417S.i
        /* renamed from: h */
        public void mo18732h(AbstractC4417S.k kVar) {
            this.f21952a.mo18732h(new C7237a(kVar));
        }

        @Override // p316p5.AbstractC6147d
        /* renamed from: j */
        public AbstractC4417S.i mo25608j() {
            return this.f21952a;
        }
    }

    public C6149f(AbstractC4417S.e eVar) {
        this.f21951a = (AbstractC4417S.e) AbstractC2932o.m10573p(eVar, "helper");
    }

    @Override // p316p5.AbstractC6146c, p237g5.AbstractC4417S.e
    /* renamed from: a */
    public AbstractC4417S.i mo18698a(AbstractC4417S.b bVar) {
        AbstractC4417S.k kVar = (AbstractC4417S.k) bVar.m18687c(AbstractC4417S.f15639c);
        AbstractC4417S.i mo18698a = super.mo18698a(bVar);
        return (kVar == null || mo18698a.mo18727c().m18819b(AbstractC4417S.f15640d) != null) ? mo18698a : new a(mo18698a, kVar);
    }

    @Override // p316p5.AbstractC6146c
    /* renamed from: g */
    public AbstractC4417S.e mo25607g() {
        return this.f21951a;
    }
}
