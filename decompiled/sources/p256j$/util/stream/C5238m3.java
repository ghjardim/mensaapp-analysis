package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.m3 */
/* loaded from: classes3.dex */
final class C5238m3 extends AbstractC5244n3 implements Consumer {

    /* renamed from: b */
    final Object[] f18657b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    C5238m3(int i7) {
        this.f18657b = new Object[i7];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i7 = this.f18664a;
        this.f18664a = i7 + 1;
        this.f18657b[i7] = obj;
    }
}
