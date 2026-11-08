package p256j$.util;

import java.util.function.LongConsumer;

/* renamed from: j$.util.c0 */
/* loaded from: classes3.dex */
public interface InterfaceC4966c0 extends InterfaceC4999f0 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    InterfaceC4966c0 trySplit();
}
