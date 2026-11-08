package p256j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.I */
/* loaded from: classes3.dex */
public interface InterfaceC4944I extends InterfaceC4953S {
    @Override // java.util.Iterator, p256j$.util.InterfaceC4936A
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(DoubleConsumer doubleConsumer);

    @Override // java.util.Iterator
    Double next();

    double nextDouble();
}
