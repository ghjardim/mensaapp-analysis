package p253i5;

import p171Y2.AbstractC2926i;
import p237g5.C4424Z;
import p237g5.C4448l0;
import p253i5.InterfaceC4579R0;
import p253i5.InterfaceC4630s;

/* renamed from: i5.J */
/* loaded from: classes2.dex */
public abstract class AbstractC4563J implements InterfaceC4630s {
    @Override // p253i5.InterfaceC4579R0
    /* renamed from: a */
    public void mo19386a(InterfaceC4579R0.a aVar) {
        mo19517e().mo19386a(aVar);
    }

    @Override // p253i5.InterfaceC4630s
    /* renamed from: b */
    public void mo19387b(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
        mo19517e().mo19387b(c4448l0, aVar, c4424z);
    }

    @Override // p253i5.InterfaceC4630s
    /* renamed from: c */
    public void mo19388c(C4424Z c4424z) {
        mo19517e().mo19388c(c4424z);
    }

    @Override // p253i5.InterfaceC4579R0
    /* renamed from: d */
    public void mo19389d() {
        mo19517e().mo19389d();
    }

    /* renamed from: e */
    public abstract InterfaceC4630s mo19517e();

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("delegate", mo19517e()).toString();
    }
}
