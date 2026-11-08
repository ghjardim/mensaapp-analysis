package p256j$.util.stream;

import java.util.function.LongConsumer;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Objects;

/* renamed from: j$.util.stream.i0 */
/* loaded from: classes3.dex */
final class C5211i0 extends AbstractC5237m2 {

    /* renamed from: b */
    boolean f18625b;

    /* renamed from: c */
    C5193f0 f18626c;

    /* renamed from: d */
    final /* synthetic */ C5217j0 f18627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5211i0(C5217j0 c5217j0, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18627d = c5217j0;
        InterfaceC5264r2 interfaceC5264r22 = this.f18656a;
        Objects.requireNonNull(interfaceC5264r22);
        this.f18626c = new C5193f0(interfaceC5264r22);
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18656a.mo21460l(-1L);
    }

    @Override // p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        InterfaceC5252p0 interfaceC5252p0 = (InterfaceC5252p0) ((C5162a) this.f18627d.f18636n).apply(j7);
        if (interfaceC5252p0 != null) {
            try {
                boolean z6 = this.f18625b;
                C5193f0 c5193f0 = this.f18626c;
                if (!z6) {
                    interfaceC5252p0.sequential().forEach(c5193f0);
                } else {
                    InterfaceC4966c0 spliterator = interfaceC5252p0.sequential().spliterator();
                    while (!this.f18656a.mo21455n() && spliterator.tryAdvance((LongConsumer) c5193f0)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC5252p0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC5252p0 != null) {
            interfaceC5252p0.close();
        }
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        this.f18625b = true;
        return this.f18656a.mo21455n();
    }
}
