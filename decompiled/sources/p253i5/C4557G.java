package p253i5;

import p171Y2.AbstractC2932o;
import p237g5.AbstractC4445k;
import p237g5.C4424Z;
import p237g5.C4448l0;
import p253i5.InterfaceC4630s;

/* renamed from: i5.G */
/* loaded from: classes2.dex */
public final class C4557G extends C4625p0 {

    /* renamed from: b */
    public boolean f16515b;

    /* renamed from: c */
    public final C4448l0 f16516c;

    /* renamed from: d */
    public final InterfaceC4630s.a f16517d;

    /* renamed from: e */
    public final AbstractC4445k[] f16518e;

    public C4557G(C4448l0 c4448l0, AbstractC4445k[] abstractC4445kArr) {
        this(c4448l0, InterfaceC4630s.a.PROCESSED, abstractC4445kArr);
    }

    @Override // p253i5.C4625p0, p253i5.InterfaceC4628r
    /* renamed from: i */
    public void mo19372i(InterfaceC4630s interfaceC4630s) {
        AbstractC2932o.m10579v(!this.f16515b, "already started");
        this.f16515b = true;
        for (AbstractC4445k abstractC4445k : this.f16518e) {
            abstractC4445k.mo18988i(this.f16516c);
        }
        interfaceC4630s.mo19387b(this.f16516c, this.f16517d, new C4424Z());
    }

    @Override // p253i5.C4625p0, p253i5.InterfaceC4628r
    /* renamed from: j */
    public void mo19361j(C4592Y c4592y) {
        c4592y.m19704b("error", this.f16516c).m19704b("progress", this.f16517d);
    }

    public C4557G(C4448l0 c4448l0, InterfaceC4630s.a aVar, AbstractC4445k[] abstractC4445kArr) {
        AbstractC2932o.m10562e(!c4448l0.m18961o(), "error must not be OK");
        this.f16516c = c4448l0;
        this.f16517d = aVar;
        this.f16518e = abstractC4445kArr;
    }
}
