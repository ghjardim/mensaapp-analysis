package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.v0 */
/* loaded from: classes3.dex */
final class C5282v0 extends AbstractC5287w0 implements InterfaceC5249o2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo21462p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5249o2
    /* renamed from: p */
    public final /* synthetic */ void mo21462p(Double d7) {
        AbstractC5034A0.m21399e(this, d7);
    }

    @Override // p256j$.util.stream.AbstractC5287w0, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        if (this.f18716a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d7);
        throw null;
    }
}
