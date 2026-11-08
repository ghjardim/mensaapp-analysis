package p256j$.util.stream;

import java.util.function.IntConsumer;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.Objects;

/* renamed from: j$.util.stream.Y */
/* loaded from: classes3.dex */
final class C5152Y extends AbstractC5231l2 {

    /* renamed from: b */
    boolean f18517b;

    /* renamed from: c */
    C5132U f18518c;

    /* renamed from: d */
    final /* synthetic */ C5142W f18519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5152Y(C5142W c5142w, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18519d = c5142w;
        InterfaceC5264r2 interfaceC5264r22 = this.f18649a;
        Objects.requireNonNull(interfaceC5264r22);
        this.f18518c = new C5132U(interfaceC5264r22);
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18649a.mo21460l(-1L);
    }

    @Override // p256j$.util.stream.InterfaceC5254p2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        InterfaceC5187e0 interfaceC5187e0 = (InterfaceC5187e0) ((C5123S0) this.f18519d.f18511n).apply(i7);
        if (interfaceC5187e0 != null) {
            try {
                boolean z6 = this.f18517b;
                C5132U c5132u = this.f18518c;
                if (!z6) {
                    interfaceC5187e0.sequential().forEach(c5132u);
                } else {
                    InterfaceC4960Z spliterator = interfaceC5187e0.sequential().spliterator();
                    while (!this.f18649a.mo21455n() && spliterator.tryAdvance((IntConsumer) c5132u)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC5187e0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC5187e0 != null) {
            interfaceC5187e0.close();
        }
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        this.f18517b = true;
        return this.f18649a.mo21455n();
    }
}
