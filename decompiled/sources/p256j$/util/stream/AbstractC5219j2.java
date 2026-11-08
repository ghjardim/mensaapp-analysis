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
import p256j$.util.Objects;
import p256j$.util.Optional;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;
import p256j$.util.function.C5000a;

/* renamed from: j$.util.stream.j2 */
/* loaded from: classes3.dex */
abstract class AbstractC5219j2 extends AbstractC5168b implements Stream {
    @Override // p256j$.util.stream.Stream
    public final Stream sorted() {
        return new C5096M2(this);
    }

    @Override // p256j$.util.stream.Stream
    public final Stream distinct() {
        return new C5240n(this, EnumC5196f3.f18585m | EnumC5196f3.f18592t, 0);
    }

    @Override // p256j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new C5000a(1, comparator));
    }

    @Override // p256j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) m21516D(C5078J.f18403d);
    }

    @Override // p256j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) m21516D(C5078J.f18402c);
    }

    @Override // p256j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new C5096M2(this, comparator);
    }

    @Override // p256j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return m21516D(new C5065G1(EnumC5202g3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // p256j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return m21516D(new C5065G1(EnumC5202g3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m21516D(new C5108P(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m21516D(new C5108P(consumer, true));
    }

    @Override // p256j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new C5000a(0, comparator));
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: I */
    final EnumC5202g3 mo21431I() {
        return EnumC5202g3.REFERENCE;
    }

    @Override // p256j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) m21516D(new C5055E1(EnumC5202g3.REFERENCE, binaryOperator, 2));
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: F */
    final InterfaceC5094M0 mo21429F(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC5034A0.m21372E(abstractC5168b, spliterator, z6, intFunction);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: U */
    final Spliterator mo21433U(AbstractC5168b abstractC5168b, Supplier supplier, boolean z6) {
        return new C5082J3(abstractC5168b, supplier, z6);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: H */
    final boolean mo21430H(Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2) {
        boolean mo21455n;
        do {
            mo21455n = interfaceC5264r2.mo21455n();
            if (mo21455n) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC5264r2));
        return mo21455n;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: N */
    final InterfaceC5054E0 mo21432N(long j7, IntFunction intFunction) {
        return AbstractC5034A0.m21371D(j7, intFunction);
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final Iterator iterator() {
        return Spliterators.m21289i(spliterator());
    }

    @Override // p256j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C5271t(this, EnumC5196f3.f18592t, predicate, 4);
    }

    @Override // p256j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C5271t(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, function, 5);
    }

    @Override // p256j$.util.stream.Stream
    public final InterfaceC5187e0 mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new C5142W(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, toIntFunction, 3);
    }

    @Override // p256j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return m21516D(new C5065G1(EnumC5202g3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // p256j$.util.stream.Stream
    public final InterfaceC5252p0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C5217j0(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, toLongFunction, 3);
    }

    @Override // p256j$.util.stream.Stream
    public final InterfaceC5053E mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C5296y(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, toDoubleFunction, 2);
    }

    @Override // p256j$.util.stream.Stream
    public final long count() {
        return ((Long) m21516D(new C5075I1(2))).longValue();
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: d */
    public final Stream mo21493d(C5162a c5162a) {
        Objects.requireNonNull(c5162a);
        return new C5271t(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n | EnumC5196f3.f18592t, c5162a, 6);
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: t */
    public final InterfaceC5187e0 mo21496t(C5162a c5162a) {
        Objects.requireNonNull(c5162a);
        return new C5142W(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n | EnumC5196f3.f18592t, c5162a, 4);
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: z */
    public final InterfaceC5053E mo21497z(C5162a c5162a) {
        Objects.requireNonNull(c5162a);
        return new C5296y(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n | EnumC5196f3.f18592t, c5162a, 3);
    }

    @Override // p256j$.util.stream.Stream
    /* renamed from: o */
    public final InterfaceC5252p0 mo21495o(C5162a c5162a) {
        Objects.requireNonNull(c5162a);
        return new C5217j0(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n | EnumC5196f3.f18592t, c5162a, 2);
    }

    @Override // p256j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C5271t(this, consumer);
    }

    @Override // p256j$.util.stream.Stream
    public final Stream limit(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(Long.toString(j7));
        }
        return AbstractC5034A0.m21398d0(this, 0L, j7);
    }

    @Override // p256j$.util.stream.Stream
    public final Stream skip(long j7) {
        if (j7 >= 0) {
            return j7 == 0 ? this : AbstractC5034A0.m21398d0(this, j7, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j7));
    }

    @Override // p256j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i7 = AbstractC5245n4.f18665a;
        Objects.requireNonNull(predicate);
        return new C5112P3(this, AbstractC5245n4.f18665a, predicate);
    }

    @Override // p256j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i7 = AbstractC5245n4.f18665a;
        Objects.requireNonNull(predicate);
        return new C5121R3(this, AbstractC5245n4.f18666b, predicate);
    }

    @Override // p256j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC5034A0.m21381N(m21517E(intFunction), intFunction).mo21485o(intFunction);
    }

    @Override // p256j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C5189e2(0));
    }

    @Override // p256j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) m21516D(AbstractC5034A0.m21397c0(EnumC5292x0.ANY, predicate))).booleanValue();
    }

    @Override // p256j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) m21516D(AbstractC5034A0.m21397c0(EnumC5292x0.ALL, predicate))).booleanValue();
    }

    @Override // p256j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) m21516D(AbstractC5034A0.m21397c0(EnumC5292x0.NONE, predicate))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x012f, code lost:
    
        if (r0.contains(p256j$.util.stream.EnumC5210i.UNORDERED) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    @Override // p256j$.util.stream.Stream
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo21494h(p256j$.util.stream.C5216j r10) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.stream.AbstractC5219j2.mo21494h(j$.util.stream.j):java.lang.Object");
    }
}
