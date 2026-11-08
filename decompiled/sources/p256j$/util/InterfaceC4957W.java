package p256j$.util;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.W */
/* loaded from: classes3.dex */
public interface InterfaceC4957W extends InterfaceC4999f0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    InterfaceC4957W trySplit();
}
