package p256j$.util.stream;

import java.util.function.IntFunction;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.v2 */
/* loaded from: classes3.dex */
final class C5284v2 extends AbstractC5163a0 {

    /* renamed from: m */
    final /* synthetic */ long f18713m;

    /* renamed from: n */
    final /* synthetic */ long f18714n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5284v2(AbstractC5169b0 abstractC5169b0, int i7, long j7, long j8) {
        super(abstractC5169b0, i7, 0);
        this.f18713m = j7;
        this.f18714n = j8;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: P */
    final Spliterator mo21489P(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        long j7;
        long j8;
        long m21518G = abstractC5168b.m21518G(spliterator);
        long j9 = this.f18714n;
        if (m21518G > 0 && spliterator.hasCharacteristics(16384)) {
            InterfaceC4960Z interfaceC4960Z = (InterfaceC4960Z) abstractC5168b.m21526X(spliterator);
            long j10 = this.f18713m;
            return new C5290w3(interfaceC4960Z, j10, AbstractC5034A0.m21369B(j10, j9));
        }
        if (EnumC5196f3.ORDERED.m21557o(abstractC5168b.m21520K())) {
            return ((InterfaceC5094M0) new C5041B2(this, abstractC5168b, spliterator, new C5189e2(1), this.f18713m, this.f18714n).invoke()).spliterator();
        }
        InterfaceC4960Z interfaceC4960Z2 = (InterfaceC4960Z) abstractC5168b.m21526X(spliterator);
        long j11 = this.f18713m;
        if (j11 <= m21518G) {
            long j12 = m21518G - j11;
            if (j9 >= 0) {
                j12 = Math.min(j9, j12);
            }
            j8 = 0;
            j7 = j12;
        } else {
            j7 = j9;
            j8 = j11;
        }
        return new C5047C3(interfaceC4960Z2, j8, j7);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: O */
    final InterfaceC5094M0 mo21471O(AbstractC5168b abstractC5168b, Spliterator spliterator, IntFunction intFunction) {
        long j7;
        long j8;
        long m21518G = abstractC5168b.m21518G(spliterator);
        if (m21518G > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC5034A0.m21374G(abstractC5168b, AbstractC5034A0.m21370C(abstractC5168b.m21519J(), spliterator, this.f18713m, this.f18714n), true);
        }
        if (!EnumC5196f3.ORDERED.m21557o(abstractC5168b.m21520K())) {
            InterfaceC4960Z interfaceC4960Z = (InterfaceC4960Z) abstractC5168b.m21526X(spliterator);
            long j9 = this.f18713m;
            long j10 = this.f18714n;
            if (j9 <= m21518G) {
                j7 = j10 >= 0 ? Math.min(j10, m21518G - j9) : m21518G - j9;
                j8 = 0;
            } else {
                j7 = j10;
                j8 = j9;
            }
            return AbstractC5034A0.m21374G(this, new C5047C3(interfaceC4960Z, j8, j7), true);
        }
        return (InterfaceC5094M0) new C5041B2(this, abstractC5168b, spliterator, intFunction, this.f18713m, this.f18714n).invoke();
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        return new C5279u2(this, interfaceC5264r2);
    }
}
