package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import p256j$.util.C4937B;
import p256j$.util.C4938C;
import p256j$.util.C4940E;
import p256j$.util.InterfaceC4952Q;
import p256j$.util.InterfaceC4966c0;

/* renamed from: j$.util.stream.p0 */
/* loaded from: classes3.dex */
public interface InterfaceC5252p0 extends InterfaceC5204h {
    /* renamed from: a */
    InterfaceC5252p0 mo21571a();

    InterfaceC5053E asDoubleStream();

    C4938C average();

    /* renamed from: b */
    InterfaceC5252p0 mo21572b();

    Stream boxed();

    /* renamed from: c */
    InterfaceC5252p0 mo21573c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    /* renamed from: d */
    InterfaceC5252p0 mo21574d(C5162a c5162a);

    InterfaceC5252p0 distinct();

    /* renamed from: e */
    InterfaceC5252p0 mo21575e();

    C4940E findAny();

    C4940E findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    InterfaceC4952Q iterator();

    /* renamed from: l */
    InterfaceC5053E mo21576l();

    InterfaceC5252p0 limit(long j7);

    Stream mapToObj(LongFunction longFunction);

    C4940E max();

    C4940E min();

    /* renamed from: n */
    boolean mo21577n();

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    InterfaceC5252p0 parallel();

    InterfaceC5252p0 peek(LongConsumer longConsumer);

    /* renamed from: r */
    boolean mo21578r();

    long reduce(long j7, LongBinaryOperator longBinaryOperator);

    C4940E reduce(LongBinaryOperator longBinaryOperator);

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    InterfaceC5252p0 sequential();

    InterfaceC5252p0 skip(long j7);

    InterfaceC5252p0 sorted();

    @Override // p256j$.util.stream.InterfaceC5204h
    InterfaceC4966c0 spliterator();

    long sum();

    C4937B summaryStatistics();

    long[] toArray();

    /* renamed from: w */
    boolean mo21579w();

    /* renamed from: x */
    InterfaceC5187e0 mo21580x();
}
