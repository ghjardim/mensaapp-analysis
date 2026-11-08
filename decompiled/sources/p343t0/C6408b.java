package p343t0;

import p078L0.C0854L;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p217e1.C4157f;
import p225f1.C4233h;
import p232g0.C4327q;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.C5322E;
import p328r1.C6258J;
import p328r1.C6263b;
import p328r1.C6266e;
import p328r1.C6269h;

/* renamed from: t0.b */
/* loaded from: classes.dex */
public final class C6408b implements InterfaceC6417k {

    /* renamed from: f */
    public static final C0854L f23134f = new C0854L();

    /* renamed from: a */
    public final InterfaceC0883r f23135a;

    /* renamed from: b */
    public final C4327q f23136b;

    /* renamed from: c */
    public final C5322E f23137c;

    /* renamed from: d */
    public final InterfaceC4529t.a f23138d;

    /* renamed from: e */
    public final boolean f23139e;

    public C6408b(InterfaceC0883r interfaceC0883r, C4327q c4327q, C5322E c5322e, InterfaceC4529t.a aVar, boolean z6) {
        this.f23135a = interfaceC0883r;
        this.f23136b = c4327q;
        this.f23137c = c5322e;
        this.f23138d = aVar;
        this.f23139e = z6;
    }

    @Override // p343t0.InterfaceC6417k
    /* renamed from: a */
    public boolean mo26758a(InterfaceC0884s interfaceC0884s) {
        return this.f23135a.mo699h(interfaceC0884s, f23134f) == 0;
    }

    @Override // p343t0.InterfaceC6417k
    /* renamed from: b */
    public void mo26759b(InterfaceC0885t interfaceC0885t) {
        this.f23135a.mo696b(interfaceC0885t);
    }

    @Override // p343t0.InterfaceC6417k
    /* renamed from: c */
    public void mo26760c() {
        this.f23135a.mo695a(0L, 0L);
    }

    @Override // p343t0.InterfaceC6417k
    /* renamed from: d */
    public boolean mo26761d() {
        InterfaceC0883r mo697d = this.f23135a.mo697d();
        return (mo697d instanceof C6269h) || (mo697d instanceof C6263b) || (mo697d instanceof C6266e) || (mo697d instanceof C4157f);
    }

    @Override // p343t0.InterfaceC6417k
    /* renamed from: e */
    public boolean mo26762e() {
        InterfaceC0883r mo697d = this.f23135a.mo697d();
        return (mo697d instanceof C6258J) || (mo697d instanceof C4233h);
    }

    @Override // p343t0.InterfaceC6417k
    /* renamed from: f */
    public InterfaceC6417k mo26763f() {
        InterfaceC0883r c4157f;
        AbstractC5332a.m21802g(!mo26762e());
        AbstractC5332a.m21803h(this.f23135a.mo697d() == this.f23135a, "Can't recreate wrapped extractors. Outer type: " + this.f23135a.getClass());
        InterfaceC0883r interfaceC0883r = this.f23135a;
        if (interfaceC0883r instanceof C6429w) {
            c4157f = new C6429w(this.f23136b.f15128d, this.f23137c, this.f23138d, this.f23139e);
        } else if (interfaceC0883r instanceof C6269h) {
            c4157f = new C6269h();
        } else if (interfaceC0883r instanceof C6263b) {
            c4157f = new C6263b();
        } else if (interfaceC0883r instanceof C6266e) {
            c4157f = new C6266e();
        } else {
            if (!(interfaceC0883r instanceof C4157f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f23135a.getClass().getSimpleName());
            }
            c4157f = new C4157f();
        }
        return new C6408b(c4157f, this.f23136b, this.f23137c, this.f23138d, this.f23139e);
    }
}
