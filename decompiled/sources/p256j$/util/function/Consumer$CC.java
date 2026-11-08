package p256j$.util.function;

import java.util.function.Consumer;
import p256j$.util.Objects;
import p256j$.util.concurrent.C4987t;

/* renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Consumer$CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new C4987t(3, consumer, consumer2);
    }
}
