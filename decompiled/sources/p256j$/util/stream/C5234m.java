package p256j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.m */
/* loaded from: classes3.dex */
final class C5234m extends AbstractC5243n2 {

    /* renamed from: b */
    public final /* synthetic */ int f18654b;

    /* renamed from: c */
    Object f18655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5234m(AbstractC5168b abstractC5168b, InterfaceC5264r2 interfaceC5264r2, int i7) {
        super(interfaceC5264r2);
        this.f18654b = i7;
        this.f18655c = abstractC5168b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5234m(InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18654b = 0;
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public void mo21459k() {
        switch (this.f18654b) {
            case 0:
                this.f18655c = null;
                this.f18663a.mo21459k();
                break;
            default:
                super.mo21459k();
                break;
        }
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public void mo21460l(long j7) {
        switch (this.f18654b) {
            case 0:
                this.f18655c = new HashSet();
                this.f18663a.mo21460l(-1L);
                break;
            case 1:
            default:
                super.mo21460l(j7);
                break;
            case 2:
                this.f18663a.mo21460l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f18654b) {
            case 0:
                if (!((HashSet) this.f18655c).contains(obj)) {
                    ((HashSet) this.f18655c).add(obj);
                    this.f18663a.accept((InterfaceC5264r2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((C5271t) this.f18655c).f18701n).accept(obj);
                this.f18663a.accept((InterfaceC5264r2) obj);
                break;
            case 2:
                if (((Predicate) ((C5271t) this.f18655c).f18701n).test(obj)) {
                    this.f18663a.accept((InterfaceC5264r2) obj);
                    break;
                }
                break;
            case 3:
                this.f18663a.accept((InterfaceC5264r2) ((Function) ((C5271t) this.f18655c).f18701n).apply(obj));
                break;
            case 4:
                this.f18663a.accept(((ToIntFunction) ((C5142W) this.f18655c).f18511n).applyAsInt(obj));
                break;
            case 5:
                this.f18663a.accept(((ToLongFunction) ((C5217j0) this.f18655c).f18636n).applyAsLong(obj));
                break;
            default:
                this.f18663a.accept(((ToDoubleFunction) ((C5296y) this.f18655c).f18732n).applyAsDouble(obj));
                break;
        }
    }
}
