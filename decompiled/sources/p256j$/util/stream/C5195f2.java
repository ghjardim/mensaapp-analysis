package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Objects;

/* renamed from: j$.util.stream.f2 */
/* loaded from: classes3.dex */
final class C5195f2 extends AbstractC5243n2 {

    /* renamed from: b */
    public final /* synthetic */ int f18574b = 1;

    /* renamed from: c */
    boolean f18575c;

    /* renamed from: d */
    Object f18576d;

    /* renamed from: e */
    final /* synthetic */ AbstractC5168b f18577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5195f2(C5142W c5142w, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18577e = c5142w;
        InterfaceC5264r2 interfaceC5264r22 = this.f18663a;
        Objects.requireNonNull(interfaceC5264r22);
        this.f18576d = new C5132U(interfaceC5264r22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5195f2(C5296y c5296y, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18577e = c5296y;
        InterfaceC5264r2 interfaceC5264r22 = this.f18663a;
        Objects.requireNonNull(interfaceC5264r22);
        this.f18576d = new C5246o(interfaceC5264r22);
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        switch (this.f18574b) {
            case 0:
                this.f18663a.mo21460l(-1L);
                break;
            case 1:
                this.f18663a.mo21460l(-1L);
                break;
            default:
                this.f18663a.mo21460l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m21477p(Object obj) {
        switch (this.f18574b) {
            case 0:
                InterfaceC5252p0 interfaceC5252p0 = (InterfaceC5252p0) ((C5162a) ((C5217j0) this.f18577e).f18636n).apply((C5162a) obj);
                if (interfaceC5252p0 != null) {
                    try {
                        boolean z6 = this.f18575c;
                        C5193f0 c5193f0 = (C5193f0) this.f18576d;
                        if (!z6) {
                            interfaceC5252p0.sequential().forEach(c5193f0);
                        } else {
                            InterfaceC4966c0 spliterator = interfaceC5252p0.sequential().spliterator();
                            while (!this.f18663a.mo21455n() && spliterator.tryAdvance((LongConsumer) c5193f0)) {
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
                    return;
                }
                return;
            case 1:
                InterfaceC5187e0 interfaceC5187e0 = (InterfaceC5187e0) ((C5162a) ((C5142W) this.f18577e).f18511n).apply((C5162a) obj);
                if (interfaceC5187e0 != null) {
                    try {
                        boolean z7 = this.f18575c;
                        C5132U c5132u = (C5132U) this.f18576d;
                        if (!z7) {
                            interfaceC5187e0.sequential().forEach(c5132u);
                        } else {
                            InterfaceC4960Z spliterator2 = interfaceC5187e0.sequential().spliterator();
                            while (!this.f18663a.mo21455n() && spliterator2.tryAdvance((IntConsumer) c5132u)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            interfaceC5187e0.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (interfaceC5187e0 != null) {
                    interfaceC5187e0.close();
                    return;
                }
                return;
            default:
                InterfaceC5053E interfaceC5053E = (InterfaceC5053E) ((C5162a) ((C5296y) this.f18577e).f18732n).apply((C5162a) obj);
                if (interfaceC5053E != null) {
                    try {
                        boolean z8 = this.f18575c;
                        C5246o c5246o = (C5246o) this.f18576d;
                        if (!z8) {
                            interfaceC5053E.sequential().forEach(c5246o);
                        } else {
                            InterfaceC4957W spliterator3 = interfaceC5053E.sequential().spliterator();
                            while (!this.f18663a.mo21455n() && spliterator3.tryAdvance((DoubleConsumer) c5246o)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            interfaceC5053E.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (interfaceC5053E != null) {
                    interfaceC5053E.close();
                    return;
                }
                return;
        }
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        switch (this.f18574b) {
            case 0:
                this.f18575c = true;
                break;
            case 1:
                this.f18575c = true;
                break;
            default:
                this.f18575c = true;
                break;
        }
        return this.f18663a.mo21455n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5195f2(C5217j0 c5217j0, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18577e = c5217j0;
        InterfaceC5264r2 interfaceC5264r22 = this.f18663a;
        Objects.requireNonNull(interfaceC5264r22);
        this.f18576d = new C5193f0(interfaceC5264r22);
    }
}
