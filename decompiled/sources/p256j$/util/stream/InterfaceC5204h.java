package p256j$.util.stream;

import java.util.Iterator;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.h */
/* loaded from: classes3.dex */
public interface InterfaceC5204h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC5204h onClose(Runnable runnable);

    InterfaceC5204h parallel();

    InterfaceC5204h sequential();

    Spliterator spliterator();

    InterfaceC5204h unordered();
}
