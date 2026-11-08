package p256j$.util.function;

import java.util.function.IntUnaryOperator;
import p256j$.util.Objects;

/* renamed from: j$.util.function.IntUnaryOperator$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class IntUnaryOperator$CC {
    public static IntUnaryOperator $default$compose(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        Objects.requireNonNull(intUnaryOperator2);
        return new C5004e(intUnaryOperator, intUnaryOperator2, 1);
    }

    public static IntUnaryOperator $default$andThen(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        Objects.requireNonNull(intUnaryOperator2);
        return new C5004e(intUnaryOperator, intUnaryOperator2, 0);
    }
}
