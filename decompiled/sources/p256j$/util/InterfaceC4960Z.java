package p256j$.util;

import java.util.function.IntConsumer;

/* renamed from: j$.util.Z */
/* loaded from: classes3.dex */
public interface InterfaceC4960Z extends InterfaceC4999f0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    InterfaceC4960Z trySplit();
}
