package p253i5;

import java.util.concurrent.Executor;
import p171Y2.AbstractC2926i;
import p237g5.AbstractC4445k;
import p237g5.C4410K;
import p237g5.C4424Z;
import p237g5.C4425a;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p253i5.InterfaceC4617l0;
import p253i5.InterfaceC4632t;

/* renamed from: i5.K */
/* loaded from: classes2.dex */
public abstract class AbstractC4565K implements InterfaceC4638w {
    /* renamed from: a */
    public abstract InterfaceC4638w mo19520a();

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: b */
    public void mo19348b(C4448l0 c4448l0) {
        mo19520a().mo19348b(c4448l0);
    }

    @Override // p253i5.InterfaceC4638w
    /* renamed from: c */
    public C4425a mo19521c() {
        return mo19520a().mo19521c();
    }

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: d */
    public Runnable mo19349d(InterfaceC4617l0.a aVar) {
        return mo19520a().mo19349d(aVar);
    }

    @Override // p253i5.InterfaceC4632t
    /* renamed from: e */
    public void mo19522e(InterfaceC4632t.a aVar, Executor executor) {
        mo19520a().mo19522e(aVar, executor);
    }

    @Override // p253i5.InterfaceC4617l0
    /* renamed from: f */
    public void mo19350f(C4448l0 c4448l0) {
        mo19520a().mo19350f(c4448l0);
    }

    @Override // p253i5.InterfaceC4632t
    /* renamed from: g */
    public InterfaceC4628r mo19351g(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, AbstractC4445k[] abstractC4445kArr) {
        return mo19520a().mo19351g(c4426a0, c4424z, c4429c, abstractC4445kArr);
    }

    @Override // p237g5.InterfaceC4415P
    /* renamed from: i */
    public C4410K mo18676i() {
        return mo19520a().mo18676i();
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("delegate", mo19520a()).toString();
    }
}
