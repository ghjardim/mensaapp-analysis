package p256j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p256j$.util.AbstractC4994d;
import p256j$.util.Spliterator;

/* loaded from: classes3.dex */
public interface Stream<T> extends InterfaceC5204h {

    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof C5178c3 ? ((C5178c3) stream).f18553a : new Wrapper();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return Stream.this.allMatch(predicate);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(Predicate predicate) {
            return Stream.this.anyMatch(predicate);
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return Stream.this.collect(supplier, biConsumer, biConsumer2);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Collector collector) {
            return Stream.this.mo21494h(C5216j.m21567a(collector));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream dropWhile(Predicate predicate) {
            return convert(Stream.this.dropWhile(predicate));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Stream stream = Stream.this;
            if (obj instanceof Wrapper) {
                obj = Stream.this;
            }
            return stream.equals(obj);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream filter(Predicate predicate) {
            return convert(Stream.this.filter(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findAny() {
            return AbstractC4994d.m21355m(Stream.this.findAny());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findFirst() {
            return AbstractC4994d.m21355m(Stream.this.findFirst());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
            return convert(Stream.this.mo21493d(AbstractC5034A0.m21385R(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream flatMapToDouble(Function function) {
            return C5048D.m21456k(Stream.this.mo21497z(AbstractC5034A0.m21385R(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ IntStream flatMapToInt(Function function) {
            return C5181d0.m21544k(Stream.this.mo21496t(AbstractC5034A0.m21385R(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream flatMapToLong(Function function) {
            return C5247o0.m21584k(Stream.this.mo21495o(AbstractC5034A0.m21385R(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEach(Consumer consumer) {
            Stream.this.forEach(consumer);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(Consumer consumer) {
            Stream.this.forEachOrdered(consumer);
        }

        public final /* synthetic */ int hashCode() {
            return Stream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return Stream.this.isParallel();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Iterator iterator() {
            return Stream.this.iterator();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream limit(long j7) {
            return convert(Stream.this.limit(j7));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream map(Function function) {
            return convert(Stream.this.map(function));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
            return C5048D.m21456k(Stream.this.mapToDouble(toDoubleFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
            return C5181d0.m21544k(Stream.this.mapToInt(toIntFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return C5247o0.m21584k(Stream.this.mapToLong(toLongFunction));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional max(Comparator comparator) {
            return AbstractC4994d.m21355m(Stream.this.max(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional min(Comparator comparator) {
            return AbstractC4994d.m21355m(Stream.this.min(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(Predicate predicate) {
            return Stream.this.noneMatch(predicate);
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C5198g.m21559k(Stream.this.onClose(runnable));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C5198g.m21559k(Stream.this.parallel());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream peek(Consumer consumer) {
            return convert(Stream.this.peek(consumer));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.reduce(obj, biFunction, binaryOperator);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.reduce(obj, binaryOperator);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
            return AbstractC4994d.m21355m(Stream.this.reduce(binaryOperator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C5198g.m21559k(Stream.this.sequential());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream skip(long j7) {
            return convert(Stream.this.skip(j7));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream takeWhile(Predicate predicate) {
            return convert(Stream.this.takeWhile(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Stream.this.toArray(intFunction);
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C5198g.m21559k(Stream.this.unordered());
        }
    }

    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate predicate);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    long count();

    /* renamed from: d */
    Stream mo21493d(C5162a c5162a);

    Stream distinct();

    Stream dropWhile(Predicate predicate);

    Stream filter(Predicate predicate);

    p256j$.util.Optional findAny();

    p256j$.util.Optional findFirst();

    void forEach(Consumer<? super T> consumer);

    void forEachOrdered(Consumer consumer);

    /* renamed from: h */
    Object mo21494h(C5216j c5216j);

    Stream limit(long j7);

    Stream map(Function function);

    InterfaceC5053E mapToDouble(ToDoubleFunction toDoubleFunction);

    InterfaceC5187e0 mapToInt(ToIntFunction toIntFunction);

    InterfaceC5252p0 mapToLong(ToLongFunction toLongFunction);

    p256j$.util.Optional max(Comparator comparator);

    p256j$.util.Optional min(Comparator comparator);

    boolean noneMatch(Predicate<? super T> predicate);

    /* renamed from: o */
    InterfaceC5252p0 mo21495o(C5162a c5162a);

    Stream peek(Consumer consumer);

    p256j$.util.Optional reduce(BinaryOperator binaryOperator);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    Object reduce(Object obj, BinaryOperator binaryOperator);

    Stream skip(long j7);

    Stream sorted();

    Stream sorted(Comparator comparator);

    /* renamed from: t */
    InterfaceC5187e0 mo21496t(C5162a c5162a);

    Stream takeWhile(Predicate predicate);

    Object[] toArray();

    Object[] toArray(IntFunction intFunction);

    /* renamed from: z */
    InterfaceC5053E mo21497z(C5162a c5162a);
}
