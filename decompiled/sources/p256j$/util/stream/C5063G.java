package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.C4938C;

/* renamed from: j$.util.stream.G */
/* loaded from: classes3.dex */
final class C5063G extends AbstractC5083K implements InterfaceC5249o2 {

    /* renamed from: c */
    static final C5058F f18376c;

    /* renamed from: d */
    static final C5058F f18377d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5083K, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        m21477p(Double.valueOf(d7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18408a) {
            return C4938C.m21256d(((Double) this.f18409b).doubleValue());
        }
        return null;
    }

    static {
        EnumC5202g3 enumC5202g3 = EnumC5202g3.DOUBLE_VALUE;
        f18376c = new C5058F(true, enumC5202g3, C4938C.m21255a(), new C5261r(1), new C5251p(4));
        f18377d = new C5058F(false, enumC5202g3, C4938C.m21255a(), new C5261r(1), new C5251p(4));
    }
}
