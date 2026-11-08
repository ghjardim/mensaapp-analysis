package p256j$.util.stream;

import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.j3 */
/* loaded from: classes3.dex */
final class C5220j3 extends AbstractC5232l3 implements IntConsumer {

    /* renamed from: c */
    final int[] f18637c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    C5220j3(int i7) {
        this.f18637c = new int[i7];
    }

    @Override // p256j$.util.stream.AbstractC5232l3
    /* renamed from: b */
    public final void mo21565b(Object obj, long j7) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i7 = 0; i7 < j7; i7++) {
            intConsumer.accept(this.f18637c[i7]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        int i8 = this.f18650b;
        this.f18650b = i8 + 1;
        this.f18637c[i8] = i7;
    }
}
