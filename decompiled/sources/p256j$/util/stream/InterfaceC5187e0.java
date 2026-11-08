package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import p256j$.util.C4938C;
import p256j$.util.C4939D;
import p256j$.util.C5315z;
import p256j$.util.InterfaceC4948M;
import p256j$.util.InterfaceC4960Z;

/* renamed from: j$.util.stream.e0 */
/* loaded from: classes3.dex */
public interface InterfaceC5187e0 extends InterfaceC5204h {
    /* renamed from: a */
    InterfaceC5187e0 mo21529a();

    InterfaceC5053E asDoubleStream();

    InterfaceC5252p0 asLongStream();

    C4938C average();

    /* renamed from: b */
    InterfaceC5187e0 mo21530b();

    Stream boxed();

    /* renamed from: c */
    InterfaceC5187e0 mo21531c();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC5187e0 distinct();

    /* renamed from: f */
    InterfaceC5053E mo21532f();

    C4939D findAny();

    C4939D findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    /* renamed from: g */
    boolean mo21533g();

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    InterfaceC4948M iterator();

    InterfaceC5187e0 limit(long j7);

    /* renamed from: m */
    InterfaceC5252p0 mo21534m();

    InterfaceC5187e0 map(IntUnaryOperator intUnaryOperator);

    Stream mapToObj(IntFunction intFunction);

    C4939D max();

    C4939D min();

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    InterfaceC5187e0 parallel();

    InterfaceC5187e0 peek(IntConsumer intConsumer);

    /* renamed from: q */
    InterfaceC5187e0 mo21535q(C5123S0 c5123s0);

    int reduce(int i7, IntBinaryOperator intBinaryOperator);

    C4939D reduce(IntBinaryOperator intBinaryOperator);

    /* renamed from: s */
    boolean mo21536s();

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    InterfaceC5187e0 sequential();

    InterfaceC5187e0 skip(long j7);

    InterfaceC5187e0 sorted();

    @Override // p256j$.util.stream.InterfaceC5204h
    InterfaceC4960Z spliterator();

    int sum();

    C5315z summaryStatistics();

    int[] toArray();

    /* renamed from: v */
    boolean mo21537v();
}
