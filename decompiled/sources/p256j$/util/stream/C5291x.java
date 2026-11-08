package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import p256j$.util.InterfaceC4957W;
import p256j$.util.Objects;

/* renamed from: j$.util.stream.x */
/* loaded from: classes3.dex */
final class C5291x extends AbstractC5225k2 {

    /* renamed from: b */
    boolean f18722b;

    /* renamed from: c */
    C5246o f18723c;

    /* renamed from: d */
    final /* synthetic */ C5296y f18724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5291x(C5296y c5296y, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18724d = c5296y;
        InterfaceC5264r2 interfaceC5264r22 = this.f18641a;
        Objects.requireNonNull(interfaceC5264r22);
        this.f18723c = new C5246o(interfaceC5264r22);
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18641a.mo21460l(-1L);
    }

    @Override // p256j$.util.stream.InterfaceC5249o2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        InterfaceC5053E interfaceC5053E = (InterfaceC5053E) ((C5162a) this.f18724d.f18732n).apply(d7);
        if (interfaceC5053E != null) {
            try {
                boolean z6 = this.f18722b;
                C5246o c5246o = this.f18723c;
                if (!z6) {
                    interfaceC5053E.sequential().forEach(c5246o);
                } else {
                    InterfaceC4957W spliterator = interfaceC5053E.sequential().spliterator();
                    while (!this.f18641a.mo21455n() && spliterator.tryAdvance((DoubleConsumer) c5246o)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC5053E.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC5053E != null) {
            interfaceC5053E.close();
        }
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        this.f18722b = true;
        return this.f18641a.mo21455n();
    }
}
