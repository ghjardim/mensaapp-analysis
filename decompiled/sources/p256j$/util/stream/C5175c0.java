package p256j$.util.stream;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import p256j$.util.AbstractC4994d;
import p256j$.util.C4938C;
import p256j$.util.C4939D;
import p256j$.util.C4946K;
import p256j$.util.C4958X;
import p256j$.util.C5008g0;
import p256j$.util.C5315z;
import p256j$.util.InterfaceC4948M;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.c0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5175c0 implements InterfaceC5187e0 {

    /* renamed from: a */
    public final /* synthetic */ IntStream f18551a;

    private /* synthetic */ C5175c0(IntStream intStream) {
        this.f18551a = intStream;
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC5187e0 m21542k(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof C5181d0 ? ((C5181d0) intStream).f18559a : new C5175c0(intStream);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: a */
    public final /* synthetic */ InterfaceC5187e0 mo21529a() {
        return m21542k(this.f18551a.takeWhile(null));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ InterfaceC5053E asDoubleStream() {
        return C5043C.m21454k(this.f18551a.asDoubleStream());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ InterfaceC5252p0 asLongStream() {
        return C5241n0.m21583k(this.f18551a.asLongStream());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ C4938C average() {
        return AbstractC4994d.m21352j(this.f18551a.average());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: b */
    public final /* synthetic */ InterfaceC5187e0 mo21530b() {
        return m21542k(this.f18551a.filter(null));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ Stream boxed() {
        return C5178c3.m21543k(this.f18551a.boxed());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: c */
    public final /* synthetic */ InterfaceC5187e0 mo21531c() {
        return m21542k(this.f18551a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18551a.close();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.f18551a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ long count() {
        return this.f18551a.count();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ InterfaceC5187e0 distinct() {
        return m21542k(this.f18551a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntStream intStream = this.f18551a;
        if (obj instanceof C5175c0) {
            obj = ((C5175c0) obj).f18551a;
        }
        return intStream.equals(obj);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: f */
    public final /* synthetic */ InterfaceC5053E mo21532f() {
        return C5043C.m21454k(this.f18551a.mapToDouble(null));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ C4939D findAny() {
        return AbstractC4994d.m21353k(this.f18551a.findAny());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ C4939D findFirst() {
        return AbstractC4994d.m21353k(this.f18551a.findFirst());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.f18551a.forEach(intConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.f18551a.forEachOrdered(intConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: g */
    public final /* synthetic */ boolean mo21533g() {
        return this.f18551a.noneMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18551a.hashCode();
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ boolean isParallel() {
        return this.f18551a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
    @Override // p256j$.util.stream.InterfaceC5187e0, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC4948M iterator() {
        return C4946K.m21273a(this.f18551a.iterator());
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ Iterator iterator() {
        return this.f18551a.iterator();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ InterfaceC5187e0 limit(long j7) {
        return m21542k(this.f18551a.limit(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: m */
    public final /* synthetic */ InterfaceC5252p0 mo21534m() {
        return C5241n0.m21583k(this.f18551a.mapToLong(null));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ InterfaceC5187e0 map(IntUnaryOperator intUnaryOperator) {
        return m21542k(this.f18551a.map(intUnaryOperator));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
        return C5178c3.m21543k(this.f18551a.mapToObj(intFunction));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ C4939D max() {
        return AbstractC4994d.m21353k(this.f18551a.max());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ C4939D min() {
        return AbstractC4994d.m21353k(this.f18551a.min());
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h onClose(Runnable runnable) {
        return C5192f.m21551k(this.f18551a.onClose(runnable));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5187e0 parallel() {
        return m21542k(this.f18551a.parallel());
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h parallel() {
        return C5192f.m21551k(this.f18551a.parallel());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ InterfaceC5187e0 peek(IntConsumer intConsumer) {
        return m21542k(this.f18551a.peek(intConsumer));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ int reduce(int i7, IntBinaryOperator intBinaryOperator) {
        return this.f18551a.reduce(i7, intBinaryOperator);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ C4939D reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC4994d.m21353k(this.f18551a.reduce(intBinaryOperator));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: s */
    public final /* synthetic */ boolean mo21536s() {
        return this.f18551a.anyMatch(null);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5187e0 sequential() {
        return m21542k(this.f18551a.sequential());
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h sequential() {
        return C5192f.m21551k(this.f18551a.sequential());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ InterfaceC5187e0 skip(long j7) {
        return m21542k(this.f18551a.skip(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ InterfaceC5187e0 sorted() {
        return m21542k(this.f18551a.sorted());
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ Spliterator spliterator() {
        return C5008g0.m21366a(this.f18551a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
    @Override // p256j$.util.stream.InterfaceC5187e0, p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC4960Z spliterator() {
        return C4958X.m21297a(this.f18551a.spliterator());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ int sum() {
        return this.f18551a.sum();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final /* synthetic */ int[] toArray() {
        return this.f18551a.toArray();
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h unordered() {
        return C5192f.m21551k(this.f18551a.unordered());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: v */
    public final /* synthetic */ boolean mo21537v() {
        return this.f18551a.allMatch(null);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final C5315z summaryStatistics() {
        this.f18551a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: q */
    public final InterfaceC5187e0 mo21535q(C5123S0 c5123s0) {
        IntStream intStream = this.f18551a;
        C5123S0 c5123s02 = new C5123S0();
        c5123s02.f18475a = c5123s0;
        return m21542k(intStream.flatMap(c5123s02));
    }
}
