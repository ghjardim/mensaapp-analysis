package p256j$.util.stream;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import p256j$.util.AbstractC4994d;
import p256j$.util.C4937B;
import p256j$.util.C4938C;
import p256j$.util.C4940E;
import p256j$.util.C4950O;
import p256j$.util.C4962a0;
import p256j$.util.C5008g0;
import p256j$.util.InterfaceC4952Q;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.n0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5241n0 implements InterfaceC5252p0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f18662a;

    private /* synthetic */ C5241n0(LongStream longStream) {
        this.f18662a = longStream;
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC5252p0 m21583k(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C5247o0 ? ((C5247o0) longStream).f18668a : new C5241n0(longStream);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: a */
    public final /* synthetic */ InterfaceC5252p0 mo21571a() {
        return m21583k(this.f18662a.takeWhile(null));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ InterfaceC5053E asDoubleStream() {
        return C5043C.m21454k(this.f18662a.asDoubleStream());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ C4938C average() {
        return AbstractC4994d.m21352j(this.f18662a.average());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: b */
    public final /* synthetic */ InterfaceC5252p0 mo21572b() {
        return m21583k(this.f18662a.filter(null));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ Stream boxed() {
        return C5178c3.m21543k(this.f18662a.boxed());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: c */
    public final /* synthetic */ InterfaceC5252p0 mo21573c() {
        return m21583k(this.f18662a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18662a.close();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f18662a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ long count() {
        return this.f18662a.count();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ InterfaceC5252p0 distinct() {
        return m21583k(this.f18662a.distinct());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: e */
    public final /* synthetic */ InterfaceC5252p0 mo21575e() {
        return m21583k(this.f18662a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f18662a;
        if (obj instanceof C5241n0) {
            obj = ((C5241n0) obj).f18662a;
        }
        return longStream.equals(obj);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ C4940E findAny() {
        return AbstractC4994d.m21354l(this.f18662a.findAny());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ C4940E findFirst() {
        return AbstractC4994d.m21354l(this.f18662a.findFirst());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f18662a.forEach(longConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f18662a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18662a.hashCode();
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ boolean isParallel() {
        return this.f18662a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // p256j$.util.stream.InterfaceC5252p0, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC4952Q iterator() {
        return C4950O.m21277a(this.f18662a.iterator());
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ Iterator iterator() {
        return this.f18662a.iterator();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: l */
    public final /* synthetic */ InterfaceC5053E mo21576l() {
        return C5043C.m21454k(this.f18662a.mapToDouble(null));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ InterfaceC5252p0 limit(long j7) {
        return m21583k(this.f18662a.limit(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C5178c3.m21543k(this.f18662a.mapToObj(longFunction));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ C4940E max() {
        return AbstractC4994d.m21354l(this.f18662a.max());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ C4940E min() {
        return AbstractC4994d.m21354l(this.f18662a.min());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: n */
    public final /* synthetic */ boolean mo21577n() {
        return this.f18662a.noneMatch(null);
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h onClose(Runnable runnable) {
        return C5192f.m21551k(this.f18662a.onClose(runnable));
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h parallel() {
        return C5192f.m21551k(this.f18662a.parallel());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5252p0 parallel() {
        return m21583k(this.f18662a.parallel());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ InterfaceC5252p0 peek(LongConsumer longConsumer) {
        return m21583k(this.f18662a.peek(longConsumer));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: r */
    public final /* synthetic */ boolean mo21578r() {
        return this.f18662a.allMatch(null);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ long reduce(long j7, LongBinaryOperator longBinaryOperator) {
        return this.f18662a.reduce(j7, longBinaryOperator);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ C4940E reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC4994d.m21354l(this.f18662a.reduce(longBinaryOperator));
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h sequential() {
        return C5192f.m21551k(this.f18662a.sequential());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5252p0 sequential() {
        return m21583k(this.f18662a.sequential());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ InterfaceC5252p0 skip(long j7) {
        return m21583k(this.f18662a.skip(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ InterfaceC5252p0 sorted() {
        return m21583k(this.f18662a.sorted());
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ Spliterator spliterator() {
        return C5008g0.m21366a(this.f18662a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // p256j$.util.stream.InterfaceC5252p0, p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC4966c0 spliterator() {
        return C4962a0.m21300a(this.f18662a.spliterator());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ long sum() {
        return this.f18662a.sum();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final /* synthetic */ long[] toArray() {
        return this.f18662a.toArray();
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h unordered() {
        return C5192f.m21551k(this.f18662a.unordered());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: w */
    public final /* synthetic */ boolean mo21579w() {
        return this.f18662a.anyMatch(null);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: x */
    public final /* synthetic */ InterfaceC5187e0 mo21580x() {
        return C5175c0.m21542k(this.f18662a.mapToInt(null));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final C4937B summaryStatistics() {
        this.f18662a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: d */
    public final InterfaceC5252p0 mo21574d(C5162a c5162a) {
        LongStream longStream = this.f18662a;
        C5162a c5162a2 = new C5162a(9);
        c5162a2.f18530b = c5162a;
        return m21583k(longStream.flatMap(c5162a2));
    }
}
