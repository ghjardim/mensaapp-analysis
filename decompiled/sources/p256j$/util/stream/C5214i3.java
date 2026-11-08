package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.i3 */
/* loaded from: classes3.dex */
final class C5214i3 extends AbstractC5232l3 implements DoubleConsumer {

    /* renamed from: c */
    final double[] f18631c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    C5214i3(int i7) {
        this.f18631c = new double[i7];
    }

    @Override // p256j$.util.stream.AbstractC5232l3
    /* renamed from: b */
    final void mo21565b(Object obj, long j7) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i7 = 0; i7 < j7; i7++) {
            doubleConsumer.accept(this.f18631c[i7]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        int i7 = this.f18650b;
        this.f18650b = i7 + 1;
        this.f18631c[i7] = d7;
    }
}
