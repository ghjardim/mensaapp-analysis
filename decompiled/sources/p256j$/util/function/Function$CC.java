package p256j$.util.function;

import java.util.function.Function;
import p256j$.util.Objects;

/* renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$compose(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new C5002c(function, function2, 1);
    }

    public static Function $default$andThen(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new C5002c(function, function2, 0);
    }
}
