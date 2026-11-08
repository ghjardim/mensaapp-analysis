package p256j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.O2 */
/* loaded from: classes3.dex */
final class C5106O2 extends AbstractC5046C2 {

    /* renamed from: c */
    private double[] f18439c;

    /* renamed from: d */
    private int f18440d;

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18439c = new double[(int) j7];
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int i7 = 0;
        Arrays.sort(this.f18439c, 0, this.f18440d);
        long j7 = this.f18440d;
        InterfaceC5264r2 interfaceC5264r2 = this.f18641a;
        interfaceC5264r2.mo21460l(j7);
        if (!this.f18354b) {
            while (i7 < this.f18440d) {
                interfaceC5264r2.accept(this.f18439c[i7]);
                i7++;
            }
        } else {
            while (i7 < this.f18440d && !interfaceC5264r2.mo21455n()) {
                interfaceC5264r2.accept(this.f18439c[i7]);
                i7++;
            }
        }
        interfaceC5264r2.mo21459k();
        this.f18439c = null;
    }

    @Override // p256j$.util.stream.InterfaceC5249o2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        double[] dArr = this.f18439c;
        int i7 = this.f18440d;
        this.f18440d = i7 + 1;
        dArr[i7] = d7;
    }
}
