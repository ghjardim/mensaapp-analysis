package p256j$.util.stream;

import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p256j$.util.AbstractC4994d;
import p256j$.util.C4951P;
import p256j$.util.C4964b0;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.stream.o0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5247o0 implements LongStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5252p0 f18668a;

    private /* synthetic */ C5247o0(InterfaceC5252p0 interfaceC5252p0) {
        this.f18668a = interfaceC5252p0;
    }

    /* renamed from: k */
    public static /* synthetic */ LongStream m21584k(InterfaceC5252p0 interfaceC5252p0) {
        if (interfaceC5252p0 == null) {
            return null;
        }
        return interfaceC5252p0 instanceof C5241n0 ? ((C5241n0) interfaceC5252p0).f18662a : new C5247o0(interfaceC5252p0);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.f18668a.mo21578r();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.f18668a.mo21579w();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C5048D.m21456k(this.f18668a.asDoubleStream());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC4994d.m21356n(this.f18668a.average());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f18668a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18668a.close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f18668a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.f18668a.count();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return m21584k(this.f18668a.distinct());
    }

    public final /* synthetic */ LongStream dropWhile(LongPredicate longPredicate) {
        return m21584k(this.f18668a.mo21573c());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5252p0 interfaceC5252p0 = this.f18668a;
        if (obj instanceof C5247o0) {
            obj = ((C5247o0) obj).f18668a;
        }
        return interfaceC5252p0.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream filter(LongPredicate longPredicate) {
        return m21584k(this.f18668a.mo21572b());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findAny() {
        return AbstractC4994d.m21358p(this.f18668a.findAny());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findFirst() {
        return AbstractC4994d.m21358p(this.f18668a.findFirst());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f18668a.forEach(longConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f18668a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18668a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f18668a.isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Long> iterator() {
        return this.f18668a.iterator();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Long> iterator2() {
        return C4951P.m21280a(this.f18668a.iterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j7) {
        return m21584k(this.f18668a.limit(j7));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return m21584k(this.f18668a.mo21575e());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return C5048D.m21456k(this.f18668a.mo21576l());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return C5181d0.m21544k(this.f18668a.mo21580x());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(LongFunction longFunction) {
        return Stream.Wrapper.convert(this.f18668a.mapToObj(longFunction));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong max() {
        return AbstractC4994d.m21358p(this.f18668a.max());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong min() {
        return AbstractC4994d.m21358p(this.f18668a.min());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.f18668a.mo21577n();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.BaseStream, java.util.stream.LongStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream onClose(Runnable runnable) {
        return C5198g.m21559k(this.f18668a.onClose(runnable));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.LongStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return C5198g.m21559k(this.f18668a.parallel());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: parallel, reason: avoid collision after fix types in other method */
    public final /* synthetic */ LongStream parallel2() {
        return m21584k(this.f18668a.parallel());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return m21584k(this.f18668a.peek(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j7, LongBinaryOperator longBinaryOperator) {
        return this.f18668a.reduce(j7, longBinaryOperator);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC4994d.m21358p(this.f18668a.reduce(longBinaryOperator));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.LongStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return C5198g.m21559k(this.f18668a.sequential());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: sequential, reason: avoid collision after fix types in other method */
    public final /* synthetic */ LongStream sequential2() {
        return m21584k(this.f18668a.sequential());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j7) {
        return m21584k(this.f18668a.skip(j7));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return m21584k(this.f18668a.sorted());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Long> spliterator() {
        return C4964b0.m21301a(this.f18668a.spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return Spliterator.Wrapper.convert(this.f18668a.spliterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.f18668a.sum();
    }

    public final /* synthetic */ LongStream takeWhile(LongPredicate longPredicate) {
        return m21584k(this.f18668a.mo21571a());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.f18668a.toArray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.LongStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream unordered() {
        return C5198g.m21559k(this.f18668a.unordered());
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        this.f18668a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final LongStream flatMap(LongFunction longFunction) {
        InterfaceC5252p0 interfaceC5252p0 = this.f18668a;
        C5162a c5162a = new C5162a(9);
        c5162a.f18530b = longFunction;
        return m21584k(interfaceC5252p0.mo21574d(c5162a));
    }
}
