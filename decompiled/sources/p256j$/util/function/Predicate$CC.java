package p256j$.util.function;

import java.util.function.Predicate;
import p256j$.util.Objects;

/* renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new C5006g(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new C5000a(2, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new C5006g(predicate, predicate2, 1);
    }
}
