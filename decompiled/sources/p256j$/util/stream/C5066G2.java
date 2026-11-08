package p256j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.G2 */
/* loaded from: classes3.dex */
final class C5066G2 extends AbstractC5046C2 {

    /* renamed from: c */
    private C5135U2 f18382c;

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        C5135U2 c5135u2;
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j7 <= 0) {
            c5135u2 = new C5135U2();
        } else {
            c5135u2 = new C5135U2((int) j7);
        }
        this.f18382c = c5135u2;
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        double[] dArr = (double[]) this.f18382c.mo21480d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC5264r2 interfaceC5264r2 = this.f18641a;
        interfaceC5264r2.mo21460l(length);
        int i7 = 0;
        if (!this.f18354b) {
            int length2 = dArr.length;
            while (i7 < length2) {
                interfaceC5264r2.accept(dArr[i7]);
                i7++;
            }
        } else {
            int length3 = dArr.length;
            while (i7 < length3) {
                double d7 = dArr[i7];
                if (interfaceC5264r2.mo21455n()) {
                    break;
                }
                interfaceC5264r2.accept(d7);
                i7++;
            }
        }
        interfaceC5264r2.mo21459k();
    }

    @Override // p256j$.util.stream.InterfaceC5249o2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        this.f18382c.accept(d7);
    }
}
