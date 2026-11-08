package p256j$.util.stream;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import p256j$.util.AbstractC4994d;
import p256j$.util.C4938C;
import p256j$.util.C4942G;
import p256j$.util.C4955U;
import p256j$.util.C5008g0;
import p256j$.util.C5314y;
import p256j$.util.InterfaceC4944I;
import p256j$.util.InterfaceC4957W;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.C */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5043C implements InterfaceC5053E {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f18351a;

    private /* synthetic */ C5043C(DoubleStream doubleStream) {
        this.f18351a = doubleStream;
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC5053E m21454k(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C5048D ? ((C5048D) doubleStream).f18356a : new C5043C(doubleStream);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: a */
    public final /* synthetic */ InterfaceC5053E mo21434a() {
        return m21454k(this.f18351a.takeWhile(null));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ C4938C average() {
        return AbstractC4994d.m21352j(this.f18351a.average());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: b */
    public final /* synthetic */ InterfaceC5053E mo21435b() {
        return m21454k(this.f18351a.filter(null));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ Stream boxed() {
        return C5178c3.m21543k(this.f18351a.boxed());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: c */
    public final /* synthetic */ InterfaceC5053E mo21436c() {
        return m21454k(this.f18351a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18351a.close();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f18351a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ long count() {
        return this.f18351a.count();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5053E distinct() {
        return m21454k(this.f18351a.distinct());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: e */
    public final /* synthetic */ InterfaceC5053E mo21438e() {
        return m21454k(this.f18351a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f18351a;
        if (obj instanceof C5043C) {
            obj = ((C5043C) obj).f18351a;
        }
        return doubleStream.equals(obj);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ C4938C findAny() {
        return AbstractC4994d.m21352j(this.f18351a.findAny());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ C4938C findFirst() {
        return AbstractC4994d.m21352j(this.f18351a.findFirst());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f18351a.forEach(doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f18351a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18351a.hashCode();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: i */
    public final /* synthetic */ boolean mo21439i() {
        return this.f18351a.allMatch(null);
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ boolean isParallel() {
        return this.f18351a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC4944I iterator() {
        return C4942G.m21271a(this.f18351a.iterator());
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ Iterator iterator() {
        return this.f18351a.iterator();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: j */
    public final /* synthetic */ InterfaceC5252p0 mo21440j() {
        return C5241n0.m21583k(this.f18351a.mapToLong(null));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5053E limit(long j7) {
        return m21454k(this.f18351a.limit(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C5178c3.m21543k(this.f18351a.mapToObj(doubleFunction));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ C4938C max() {
        return AbstractC4994d.m21352j(this.f18351a.max());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ C4938C min() {
        return AbstractC4994d.m21352j(this.f18351a.min());
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h onClose(Runnable runnable) {
        return C5192f.m21551k(this.f18351a.onClose(runnable));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: p */
    public final /* synthetic */ boolean mo21441p() {
        return this.f18351a.anyMatch(null);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5053E parallel() {
        return m21454k(this.f18351a.parallel());
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h parallel() {
        return C5192f.m21551k(this.f18351a.parallel());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5053E peek(DoubleConsumer doubleConsumer) {
        return m21454k(this.f18351a.peek(doubleConsumer));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ double reduce(double d7, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f18351a.reduce(d7, doubleBinaryOperator);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ C4938C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC4994d.m21352j(this.f18351a.reduce(doubleBinaryOperator));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5053E sequential() {
        return m21454k(this.f18351a.sequential());
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h sequential() {
        return C5192f.m21551k(this.f18351a.sequential());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5053E skip(long j7) {
        return m21454k(this.f18351a.skip(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5053E sorted() {
        return m21454k(this.f18351a.sorted());
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ Spliterator spliterator() {
        return C5008g0.m21366a(this.f18351a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // p256j$.util.stream.InterfaceC5053E, p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC4957W spliterator() {
        return C4955U.m21295a(this.f18351a.spliterator());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ double sum() {
        return this.f18351a.sum();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ double[] toArray() {
        return this.f18351a.toArray();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: u */
    public final /* synthetic */ InterfaceC5187e0 mo21442u() {
        return C5175c0.m21542k(this.f18351a.mapToInt(null));
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h unordered() {
        return C5192f.m21551k(this.f18351a.unordered());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: y */
    public final /* synthetic */ boolean mo21443y() {
        return this.f18351a.noneMatch(null);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final C5314y summaryStatistics() {
        this.f18351a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: d */
    public final InterfaceC5053E mo21437d(C5162a c5162a) {
        DoubleStream doubleStream = this.f18351a;
        C5162a c5162a2 = new C5162a(7);
        c5162a2.f18530b = c5162a;
        return m21454k(doubleStream.flatMap(c5162a2));
    }
}
