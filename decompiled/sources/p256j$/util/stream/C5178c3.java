package p256j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
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
import java.util.stream.Stream;
import p256j$.util.AbstractC4994d;
import p256j$.util.C5008g0;
import p256j$.util.Optional;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.stream.c3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5178c3 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ Stream f18553a;

    private /* synthetic */ C5178c3(Stream stream) {
        this.f18553a = stream;
    }

    /* renamed from: k */
    public static /* synthetic */ Stream m21543k(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C5178c3(stream);
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f18553a.allMatch(predicate);
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f18553a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18553a.close();
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f18553a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f18553a.count();
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: d */
    public final /* synthetic */ Stream mo21493d(C5162a c5162a) {
        return m21543k(this.f18553a.flatMap(AbstractC5034A0.m21385R(c5162a)));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return m21543k(this.f18553a.distinct());
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return m21543k(this.f18553a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f18553a;
        if (obj instanceof C5178c3) {
            obj = ((C5178c3) obj).f18553a;
        }
        return stream.equals(obj);
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return m21543k(this.f18553a.filter(predicate));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC4994d.m21351i(this.f18553a.findAny());
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC4994d.m21351i(this.f18553a.findFirst());
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f18553a.forEach(consumer);
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f18553a.forEachOrdered(consumer);
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: h */
    public final /* synthetic */ Object mo21494h(C5216j c5216j) {
        return this.f18553a.collect(c5216j == null ? null : c5216j.f18634a);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18553a.hashCode();
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ boolean isParallel() {
        return this.f18553a.isParallel();
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ Iterator iterator() {
        return this.f18553a.iterator();
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j7) {
        return m21543k(this.f18553a.limit(j7));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return m21543k(this.f18553a.map(function));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ InterfaceC5053E mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C5043C.m21454k(this.f18553a.mapToDouble(toDoubleFunction));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ InterfaceC5187e0 mapToInt(ToIntFunction toIntFunction) {
        return C5175c0.m21542k(this.f18553a.mapToInt(toIntFunction));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ InterfaceC5252p0 mapToLong(ToLongFunction toLongFunction) {
        return C5241n0.m21583k(this.f18553a.mapToLong(toLongFunction));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC4994d.m21351i(this.f18553a.max(comparator));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC4994d.m21351i(this.f18553a.min(comparator));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f18553a.noneMatch(predicate);
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: o */
    public final /* synthetic */ InterfaceC5252p0 mo21495o(C5162a c5162a) {
        return C5241n0.m21583k(this.f18553a.flatMapToLong(AbstractC5034A0.m21385R(c5162a)));
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h onClose(Runnable runnable) {
        return C5192f.m21551k(this.f18553a.onClose(runnable));
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h parallel() {
        return C5192f.m21551k(this.f18553a.parallel());
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return m21543k(this.f18553a.peek(consumer));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC4994d.m21351i(this.f18553a.reduce(binaryOperator));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f18553a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f18553a.reduce(obj, binaryOperator);
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h sequential() {
        return C5192f.m21551k(this.f18553a.sequential());
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j7) {
        return m21543k(this.f18553a.skip(j7));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return m21543k(this.f18553a.sorted());
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return m21543k(this.f18553a.sorted(comparator));
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ Spliterator spliterator() {
        return C5008g0.m21366a(this.f18553a.spliterator());
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: t */
    public final /* synthetic */ InterfaceC5187e0 mo21496t(C5162a c5162a) {
        return C5175c0.m21542k(this.f18553a.flatMapToInt(AbstractC5034A0.m21385R(c5162a)));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return m21543k(this.f18553a.takeWhile(predicate));
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f18553a.toArray();
    }

    @Override // p256j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f18553a.toArray(intFunction);
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h unordered() {
        return C5192f.m21551k(this.f18553a.unordered());
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: z */
    public final /* synthetic */ InterfaceC5053E mo21497z(C5162a c5162a) {
        return C5043C.m21454k(this.f18553a.flatMapToDouble(AbstractC5034A0.m21385R(c5162a)));
    }
}
