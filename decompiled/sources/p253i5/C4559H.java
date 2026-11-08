package p253i5;

import p171Y2.AbstractC2932o;
import p237g5.AbstractC4445k;
import p237g5.C4410K;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p253i5.InterfaceC4630s;

/* renamed from: i5.H */
/* loaded from: classes2.dex */
public class C4559H implements InterfaceC4632t {

    /* renamed from: a */
    public final C4448l0 f16527a;

    /* renamed from: b */
    public final InterfaceC4630s.a f16528b;

    public C4559H(C4448l0 c4448l0, InterfaceC4630s.a aVar) {
        AbstractC2932o.m10562e(!c4448l0.m18961o(), "error must not be OK");
        this.f16527a = c4448l0;
        this.f16528b = aVar;
    }

    @Override // p253i5.InterfaceC4632t
    /* renamed from: g */
    public InterfaceC4628r mo19351g(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, AbstractC4445k[] abstractC4445kArr) {
        return new C4557G(this.f16527a, this.f16528b, abstractC4445kArr);
    }

    @Override // p237g5.InterfaceC4415P
    /* renamed from: i */
    public C4410K mo18676i() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
