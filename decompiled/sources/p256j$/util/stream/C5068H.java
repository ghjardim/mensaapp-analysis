package p256j$.util.stream;

import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.C4939D;

/* renamed from: j$.util.stream.H */
/* loaded from: classes3.dex */
final class C5068H extends AbstractC5083K implements InterfaceC5254p2 {

    /* renamed from: c */
    static final C5058F f18384c;

    /* renamed from: d */
    static final C5058F f18385d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5083K, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        m21477p(Integer.valueOf(i7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18408a) {
            return C4939D.m21264d(((Integer) this.f18409b).intValue());
        }
        return null;
    }

    static {
        EnumC5202g3 enumC5202g3 = EnumC5202g3.INT_VALUE;
        f18384c = new C5058F(true, enumC5202g3, C4939D.m21263a(), new C5261r(2), new C5251p(5));
        f18385d = new C5058F(false, enumC5202g3, C4939D.m21263a(), new C5261r(2), new C5251p(5));
    }
}
