package p256j$.util.stream;

import java.util.ArrayList;
import java.util.Iterator;
import p256j$.util.Collection;
import p256j$.util.List;
import p256j$.util.Objects;

/* renamed from: j$.util.stream.N2 */
/* loaded from: classes3.dex */
final class C5101N2 extends AbstractC5061F2 {

    /* renamed from: d */
    private ArrayList f18431d;

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18431d = j7 >= 0 ? new ArrayList((int) j7) : new ArrayList();
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        List.EL.sort(this.f18431d, this.f18373b);
        long size = this.f18431d.size();
        InterfaceC5264r2 interfaceC5264r2 = this.f18663a;
        interfaceC5264r2.mo21460l(size);
        if (!this.f18374c) {
            ArrayList arrayList = this.f18431d;
            Objects.requireNonNull(interfaceC5264r2);
            Collection.EL.m21259a(arrayList, new C5162a(1, interfaceC5264r2));
        } else {
            Iterator it = this.f18431d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC5264r2.mo21455n()) {
                    break;
                } else {
                    interfaceC5264r2.accept((InterfaceC5264r2) next);
                }
            }
        }
        interfaceC5264r2.mo21459k();
        this.f18431d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18431d.add(obj);
    }
}
