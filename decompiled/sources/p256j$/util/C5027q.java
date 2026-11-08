package p256j$.util;

import java.util.Map;
import java.util.function.Consumer;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.q */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5027q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f18314a;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18314a.accept(new C5029r((Map.Entry) obj));
    }
}
