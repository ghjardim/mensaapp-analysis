package p256j$.util.stream;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p256j$.util.AbstractC4994d;
import p256j$.util.C4947L;
import p256j$.util.C4959Y;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.stream.d0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5181d0 implements IntStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5187e0 f18559a;

    private /* synthetic */ C5181d0(InterfaceC5187e0 interfaceC5187e0) {
        this.f18559a = interfaceC5187e0;
    }

    /* renamed from: k */
    public static /* synthetic */ IntStream m21544k(InterfaceC5187e0 interfaceC5187e0) {
        if (interfaceC5187e0 == null) {
            return null;
        }
        return interfaceC5187e0 instanceof C5175c0 ? ((C5175c0) interfaceC5187e0).f18551a : new C5181d0(interfaceC5187e0);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.f18559a.mo21537v();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.f18559a.mo21536s();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C5048D.m21456k(this.f18559a.asDoubleStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream asLongStream() {
        return C5247o0.m21584k(this.f18559a.asLongStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC4994d.m21356n(this.f18559a.average());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f18559a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18559a.close();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.f18559a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ long count() {
        return this.f18559a.count();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream distinct() {
        return m21544k(this.f18559a.distinct());
    }

    public final /* synthetic */ IntStream dropWhile(IntPredicate intPredicate) {
        return m21544k(this.f18559a.mo21531c());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5187e0 interfaceC5187e0 = this.f18559a;
        if (obj instanceof C5181d0) {
            obj = ((C5181d0) obj).f18559a;
        }
        return interfaceC5187e0.equals(obj);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream filter(IntPredicate intPredicate) {
        return m21544k(this.f18559a.mo21530b());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findAny() {
        return AbstractC4994d.m21357o(this.f18559a.findAny());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findFirst() {
        return AbstractC4994d.m21357o(this.f18559a.findFirst());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.f18559a.forEach(intConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.f18559a.forEachOrdered(intConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18559a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f18559a.isParallel();
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Integer> iterator() {
        return this.f18559a.iterator();
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Integer> iterator2() {
        return C4947L.m21274a(this.f18559a.iterator());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream limit(long j7) {
        return m21544k(this.f18559a.limit(j7));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream map(IntUnaryOperator intUnaryOperator) {
        return m21544k(this.f18559a.map(intUnaryOperator));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C5048D.m21456k(this.f18559a.mo21532f());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C5247o0.m21584k(this.f18559a.mo21534m());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
        return Stream.Wrapper.convert(this.f18559a.mapToObj(intFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt max() {
        return AbstractC4994d.m21357o(this.f18559a.max());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt min() {
        return AbstractC4994d.m21357o(this.f18559a.min());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.f18559a.mo21533g();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ IntStream onClose(Runnable runnable) {
        return C5198g.m21559k(this.f18559a.onClose(runnable));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ IntStream parallel() {
        return C5198g.m21559k(this.f18559a.parallel());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: parallel, reason: avoid collision after fix types in other method */
    public final /* synthetic */ IntStream parallel2() {
        return m21544k(this.f18559a.parallel());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
        return m21544k(this.f18559a.peek(intConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int reduce(int i7, IntBinaryOperator intBinaryOperator) {
        return this.f18559a.reduce(i7, intBinaryOperator);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC4994d.m21357o(this.f18559a.reduce(intBinaryOperator));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ IntStream sequential() {
        return C5198g.m21559k(this.f18559a.sequential());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: sequential, reason: avoid collision after fix types in other method */
    public final /* synthetic */ IntStream sequential2() {
        return m21544k(this.f18559a.sequential());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream skip(long j7) {
        return m21544k(this.f18559a.skip(j7));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream sorted() {
        return m21544k(this.f18559a.sorted());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Integer> spliterator() {
        return C4959Y.m21298a(this.f18559a.spliterator());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Integer> spliterator2() {
        return Spliterator.Wrapper.convert(this.f18559a.spliterator());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int sum() {
        return this.f18559a.sum();
    }

    public final /* synthetic */ IntStream takeWhile(IntPredicate intPredicate) {
        return m21544k(this.f18559a.mo21529a());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int[] toArray() {
        return this.f18559a.toArray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ IntStream unordered() {
        return C5198g.m21559k(this.f18559a.unordered());
    }

    @Override // java.util.stream.IntStream
    public final IntSummaryStatistics summaryStatistics() {
        this.f18559a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override // java.util.stream.IntStream
    public final IntStream flatMap(IntFunction intFunction) {
        InterfaceC5187e0 interfaceC5187e0 = this.f18559a;
        C5123S0 c5123s0 = new C5123S0();
        c5123s0.f18475a = intFunction;
        return m21544k(interfaceC5187e0.mo21535q(c5123s0));
    }
}
