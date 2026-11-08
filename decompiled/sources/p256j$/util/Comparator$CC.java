package p256j$.util;

import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Comparator$CC {
    /* renamed from: a */
    public static Comparator m21262a() {
        return EnumC4998f.INSTANCE;
    }

    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return new C4965c(comparator, function, 1);
    }
}
