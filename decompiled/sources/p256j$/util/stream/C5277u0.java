package p256j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.u0 */
/* loaded from: classes3.dex */
final class C5277u0 extends AbstractC5287w0 implements InterfaceC5259q2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
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

    @Override // p256j$.util.stream.AbstractC5287w0, p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        if (this.f18716a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j7);
        throw null;
    }
}
