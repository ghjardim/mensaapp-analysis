package p256j$.util.stream;

import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.Z1 */
/* loaded from: classes3.dex */
final class C5159Z1 extends AbstractC5177c2 implements InterfaceC5254p2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21487m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5254p2
    /* renamed from: m */
    public final /* synthetic */ void mo21487m(Integer num) {
        AbstractC5034A0.m21402g(this, num);
    }

    @Override // p256j$.util.stream.AbstractC5149X1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18552b);
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        this.f18552b += ((AbstractC5177c2) interfaceC5144W1).f18552b;
    }

    @Override // p256j$.util.stream.AbstractC5177c2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        this.f18552b++;
    }
}
