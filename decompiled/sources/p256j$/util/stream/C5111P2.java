package p256j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.P2 */
/* loaded from: classes3.dex */
final class C5111P2 extends AbstractC5051D2 {

    /* renamed from: c */
    private int[] f18448c;

    /* renamed from: d */
    private int f18449d;

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18448c = new int[(int) j7];
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int i7 = 0;
        Arrays.sort(this.f18448c, 0, this.f18449d);
        long j7 = this.f18449d;
        InterfaceC5264r2 interfaceC5264r2 = this.f18649a;
        interfaceC5264r2.mo21460l(j7);
        if (!this.f18360b) {
            while (i7 < this.f18449d) {
                interfaceC5264r2.accept(this.f18448c[i7]);
                i7++;
            }
        } else {
            while (i7 < this.f18449d && !interfaceC5264r2.mo21455n()) {
                interfaceC5264r2.accept(this.f18448c[i7]);
                i7++;
            }
        }
        interfaceC5264r2.mo21459k();
        this.f18448c = null;
    }

    @Override // p256j$.util.stream.InterfaceC5254p2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        int[] iArr = this.f18448c;
        int i8 = this.f18449d;
        this.f18449d = i8 + 1;
        iArr[i8] = i7;
    }
}
