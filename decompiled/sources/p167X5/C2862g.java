package p167X5;

import p132S5.InterfaceC2334J;
import p392z5.InterfaceC7161i;

/* renamed from: X5.g */
/* loaded from: classes2.dex */
public final class C2862g implements InterfaceC2334J {

    /* renamed from: a */
    public final InterfaceC7161i f8831a;

    public C2862g(InterfaceC7161i interfaceC7161i) {
        this.f8831a = interfaceC7161i;
    }

    @Override // p132S5.InterfaceC2334J
    /* renamed from: l */
    public InterfaceC7161i mo7995l() {
        return this.f8831a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo7995l() + ')';
    }
}
