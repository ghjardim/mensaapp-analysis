package p256j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.M */
/* loaded from: classes3.dex */
public interface InterfaceC4948M extends InterfaceC4953S {
    @Override // java.util.Iterator, p256j$.util.InterfaceC4936A
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // java.util.Iterator
    Integer next();

    int nextInt();
}
