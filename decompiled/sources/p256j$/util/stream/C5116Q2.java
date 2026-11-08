package p256j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.Q2 */
/* loaded from: classes3.dex */
final class C5116Q2 extends AbstractC5056E2 {

    /* renamed from: c */
    private long[] f18456c;

    /* renamed from: d */
    private int f18457d;

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18456c = new long[(int) j7];
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int i7 = 0;
        Arrays.sort(this.f18456c, 0, this.f18457d);
        long j7 = this.f18457d;
        InterfaceC5264r2 interfaceC5264r2 = this.f18656a;
        interfaceC5264r2.mo21460l(j7);
        if (!this.f18364b) {
            while (i7 < this.f18457d) {
                interfaceC5264r2.accept(this.f18456c[i7]);
                i7++;
            }
        } else {
            while (i7 < this.f18457d && !interfaceC5264r2.mo21455n()) {
                interfaceC5264r2.accept(this.f18456c[i7]);
                i7++;
            }
        }
        interfaceC5264r2.mo21459k();
        this.f18456c = null;
    }

    @Override // p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        long[] jArr = this.f18456c;
        int i7 = this.f18457d;
        this.f18457d = i7 + 1;
        jArr[i7] = j7;
    }
}
