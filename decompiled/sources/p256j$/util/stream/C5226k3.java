package p256j$.util.stream;

import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.k3 */
/* loaded from: classes3.dex */
final class C5226k3 extends AbstractC5232l3 implements LongConsumer {

    /* renamed from: c */
    final long[] f18642c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    C5226k3(int i7) {
        this.f18642c = new long[i7];
    }

    @Override // p256j$.util.stream.AbstractC5232l3
    /* renamed from: b */
    public final void mo21565b(Object obj, long j7) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i7 = 0; i7 < j7; i7++) {
            longConsumer.accept(this.f18642c[i7]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j7) {
        int i7 = this.f18650b;
        this.f18650b = i7 + 1;
        this.f18642c[i7] = j7;
    }
}
