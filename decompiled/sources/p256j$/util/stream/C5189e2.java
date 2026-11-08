package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.e2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5189e2 implements IntFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f18569a;

    /* renamed from: accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0 */
    private final void m21549x10ce6cf0(Object obj) {
    }

    /* renamed from: accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1 */
    private final void m21550x10ce6cf1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i7 = this.f18569a;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18569a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i7) {
        switch (this.f18569a) {
            case 0:
                return new Object[i7];
            case 1:
                return new Integer[i7];
            case 2:
                return new Long[i7];
            case 3:
                return new Double[i7];
            case 4:
            case 5:
            default:
                return new Double[i7];
            case 6:
                return new Integer[i7];
            case 7:
                return new Integer[i7];
            case 8:
                return new Long[i7];
            case 9:
                return new Long[i7];
            case 10:
                return new Double[i7];
        }
    }
}
