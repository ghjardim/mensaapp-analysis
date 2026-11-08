package p256j$.util.stream;

import p256j$.util.Optional;

/* renamed from: j$.util.stream.J */
/* loaded from: classes3.dex */
final class C5078J extends AbstractC5083K {

    /* renamed from: c */
    static final C5058F f18402c;

    /* renamed from: d */
    static final C5058F f18403d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18408a) {
            return Optional.m21279b(this.f18409b);
        }
        return null;
    }

    static {
        EnumC5202g3 enumC5202g3 = EnumC5202g3.REFERENCE;
        f18402c = new C5058F(true, enumC5202g3, Optional.m21278a(), new C5261r(4), new C5251p(7));
        f18403d = new C5058F(false, enumC5202g3, Optional.m21278a(), new C5261r(4), new C5251p(7));
    }
}
