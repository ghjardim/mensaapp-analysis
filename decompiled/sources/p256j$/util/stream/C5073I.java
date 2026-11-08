package p256j$.util.stream;

import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.C4940E;

/* renamed from: j$.util.stream.I */
/* loaded from: classes3.dex */
final class C5073I extends AbstractC5083K implements InterfaceC5259q2 {

    /* renamed from: c */
    static final C5058F f18396c;

    /* renamed from: d */
    static final C5058F f18397d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5083K, p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        m21477p(Long.valueOf(j7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18408a) {
            return C4940E.m21268d(((Long) this.f18409b).longValue());
        }
        return null;
    }

    static {
        EnumC5202g3 enumC5202g3 = EnumC5202g3.LONG_VALUE;
        f18396c = new C5058F(true, enumC5202g3, C4940E.m21267a(), new C5261r(3), new C5251p(6));
        f18397d = new C5058F(false, enumC5202g3, C4940E.m21267a(), new C5261r(3), new C5251p(6));
    }
}
