package p256j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.R2 */
/* loaded from: classes3.dex */
final class C5120R2 extends AbstractC5061F2 {

    /* renamed from: d */
    private Object[] f18465d;

    /* renamed from: e */
    private int f18466e;

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18465d = new Object[(int) j7];
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int i7 = 0;
        Arrays.sort(this.f18465d, 0, this.f18466e, this.f18373b);
        long j7 = this.f18466e;
        InterfaceC5264r2 interfaceC5264r2 = this.f18663a;
        interfaceC5264r2.mo21460l(j7);
        if (!this.f18374c) {
            while (i7 < this.f18466e) {
                interfaceC5264r2.accept((InterfaceC5264r2) this.f18465d[i7]);
                i7++;
            }
        } else {
            while (i7 < this.f18466e && !interfaceC5264r2.mo21455n()) {
                interfaceC5264r2.accept((InterfaceC5264r2) this.f18465d[i7]);
                i7++;
            }
        }
        interfaceC5264r2.mo21459k();
        this.f18465d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f18465d;
        int i7 = this.f18466e;
        this.f18466e = i7 + 1;
        objArr[i7] = obj;
    }
}
