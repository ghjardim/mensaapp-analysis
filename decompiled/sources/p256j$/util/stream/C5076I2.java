package p256j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.I2 */
/* loaded from: classes3.dex */
final class C5076I2 extends AbstractC5056E2 {

    /* renamed from: c */
    private C5155Y2 f18399c;

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        C5155Y2 c5155y2;
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j7 <= 0) {
            c5155y2 = new C5155Y2();
        } else {
            c5155y2 = new C5155Y2((int) j7);
        }
        this.f18399c = c5155y2;
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        long[] jArr = (long[]) this.f18399c.mo21480d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC5264r2 interfaceC5264r2 = this.f18656a;
        interfaceC5264r2.mo21460l(length);
        int i7 = 0;
        if (!this.f18364b) {
            int length2 = jArr.length;
            while (i7 < length2) {
                interfaceC5264r2.accept(jArr[i7]);
                i7++;
            }
        } else {
            int length3 = jArr.length;
            while (i7 < length3) {
                long j7 = jArr[i7];
                if (interfaceC5264r2.mo21455n()) {
                    break;
                }
                interfaceC5264r2.accept(j7);
                i7++;
            }
        }
        interfaceC5264r2.mo21459k();
    }

    @Override // p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18399c.accept(j7);
    }
}
