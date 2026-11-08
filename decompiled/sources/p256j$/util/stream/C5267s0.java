package p256j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.s0 */
/* loaded from: classes3.dex */
final class C5267s0 extends AbstractC5287w0 {

    /* renamed from: c */
    final /* synthetic */ EnumC5292x0 f18695c;

    /* renamed from: d */
    final /* synthetic */ Predicate f18696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5267s0(EnumC5292x0 enumC5292x0, Predicate predicate) {
        super(enumC5292x0);
        this.f18695c = enumC5292x0;
        this.f18696d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z6;
        boolean z7;
        if (this.f18716a) {
            return;
        }
        boolean test = this.f18696d.test(obj);
        EnumC5292x0 enumC5292x0 = this.f18695c;
        z6 = enumC5292x0.f18726a;
        if (test == z6) {
            this.f18716a = true;
            z7 = enumC5292x0.f18727b;
            this.f18717b = z7;
        }
    }
}
