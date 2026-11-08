package p256j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5004e implements IntUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ int f18272a;

    /* renamed from: b */
    public final /* synthetic */ IntUnaryOperator f18273b;

    /* renamed from: c */
    public final /* synthetic */ IntUnaryOperator f18274c;

    public /* synthetic */ C5004e(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i7) {
        this.f18272a = i7;
        this.f18273b = intUnaryOperator;
        this.f18274c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.f18272a) {
        }
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.f18272a) {
        }
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i7) {
        switch (this.f18272a) {
            case 0:
                return this.f18274c.applyAsInt(this.f18273b.applyAsInt(i7));
            default:
                return this.f18273b.applyAsInt(this.f18274c.applyAsInt(i7));
        }
    }
}
