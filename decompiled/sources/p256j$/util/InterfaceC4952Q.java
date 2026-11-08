package p256j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.Q */
/* loaded from: classes3.dex */
public interface InterfaceC4952Q extends InterfaceC4953S {
    @Override // java.util.Iterator, p256j$.util.InterfaceC4936A
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // java.util.Iterator
    Long next();

    long nextLong();
}
