package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.M0 */
/* loaded from: classes3.dex */
interface InterfaceC5094M0 {
    /* renamed from: b */
    InterfaceC5094M0 mo21478b(int i7);

    long count();

    void forEach(Consumer consumer);

    /* renamed from: h */
    InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction);

    /* renamed from: i */
    void mo21484i(Object[] objArr, int i7);

    /* renamed from: o */
    Object[] mo21485o(IntFunction intFunction);

    /* renamed from: q */
    int mo21486q();

    Spliterator spliterator();
}
