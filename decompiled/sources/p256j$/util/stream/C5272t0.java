package p256j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.t0 */
/* loaded from: classes3.dex */
final class C5272t0 extends AbstractC5287w0 implements InterfaceC5254p2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
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

    @Override // p256j$.util.stream.AbstractC5287w0, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        if (this.f18716a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i7);
        throw null;
    }
}
