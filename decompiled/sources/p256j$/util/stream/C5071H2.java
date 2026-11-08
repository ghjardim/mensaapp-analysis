package p256j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.H2 */
/* loaded from: classes3.dex */
final class C5071H2 extends AbstractC5051D2 {

    /* renamed from: c */
    private C5145W2 f18390c;

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        C5145W2 c5145w2;
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j7 <= 0) {
            c5145w2 = new C5145W2();
        } else {
            c5145w2 = new C5145W2((int) j7);
        }
        this.f18390c = c5145w2;
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int[] iArr = (int[]) this.f18390c.mo21480d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC5264r2 interfaceC5264r2 = this.f18649a;
        interfaceC5264r2.mo21460l(length);
        int i7 = 0;
        if (!this.f18360b) {
            int length2 = iArr.length;
            while (i7 < length2) {
                interfaceC5264r2.accept(iArr[i7]);
                i7++;
            }
        } else {
            int length3 = iArr.length;
            while (i7 < length3) {
                int i8 = iArr[i7];
                if (interfaceC5264r2.mo21455n()) {
                    break;
                }
                interfaceC5264r2.accept(i8);
                i7++;
            }
        }
        interfaceC5264r2.mo21459k();
    }

    @Override // p256j$.util.stream.InterfaceC5254p2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        this.f18390c.accept(i7);
    }
}
