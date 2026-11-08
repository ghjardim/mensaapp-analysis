package p256j$.util.stream;

import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.a2 */
/* loaded from: classes3.dex */
final class C5165a2 extends AbstractC5177c2 implements InterfaceC5259q2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21458j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5259q2
    /* renamed from: j */
    public final /* synthetic */ void mo21458j(Long l7) {
        AbstractC5034A0.m21404i(this, l7);
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

    @Override // p256j$.util.stream.AbstractC5177c2, p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18552b++;
    }
}
