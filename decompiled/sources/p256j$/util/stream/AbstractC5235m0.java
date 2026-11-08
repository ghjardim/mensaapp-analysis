package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.IntFunction;
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
import p256j$.util.Objects;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.m0 */
/* loaded from: classes3.dex */
abstract class AbstractC5235m0 extends AbstractC5168b implements InterfaceC5252p0 {
    @Override // p256j$.util.stream.InterfaceC5252p0
    public final C4940E findAny() {
        return (C4940E) m21516D(C5073I.f18397d);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final C4940E findFirst() {
        return (C4940E) m21516D(C5073I.f18396c);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final InterfaceC5252p0 sorted() {
        return new C5091L2(this, EnumC5196f3.f18589q | EnumC5196f3.f18587o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        m21516D(new C5103O(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        m21516D(new C5103O(longConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static InterfaceC4966c0 m21570Z(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC4966c0) {
            return (InterfaceC4966c0) spliterator;
        }
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(AbstractC5168b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: I */
    final EnumC5202g3 mo21431I() {
        return EnumC5202g3.LONG_VALUE;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: F */
    final InterfaceC5094M0 mo21429F(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC5034A0.m21375H(abstractC5168b, spliterator, z6);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: U */
    final Spliterator mo21433U(AbstractC5168b abstractC5168b, Supplier supplier, boolean z6) {
        return new C5280u3(abstractC5168b, supplier, z6);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: H */
    final boolean mo21430H(Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2) {
        LongConsumer c5193f0;
        boolean mo21455n;
        InterfaceC4966c0 m21570Z = m21570Z(spliterator);
        if (interfaceC5264r2 instanceof LongConsumer) {
            c5193f0 = (LongConsumer) interfaceC5264r2;
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(AbstractC5168b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5264r2);
            c5193f0 = new C5193f0(interfaceC5264r2);
        }
        do {
            mo21455n = interfaceC5264r2.mo21455n();
            if (mo21455n) {
                break;
            }
        } while (m21570Z.tryAdvance(c5193f0));
        return mo21455n;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: N */
    final InterfaceC5054E0 mo21432N(long j7, IntFunction intFunction) {
        return AbstractC5034A0.m21388U(j7);
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final InterfaceC4952Q iterator() {
        return Spliterators.m21288h(spliterator());
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h
    public final InterfaceC4966c0 spliterator() {
        return m21570Z(super.spliterator());
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final InterfaceC5053E asDoubleStream() {
        return new C5276u(this, EnumC5196f3.f18586n, 5);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final Stream boxed() {
        return new C5271t(this, 0, new C5261r(22), 2);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: e */
    public final InterfaceC5252p0 mo21575e() {
        Objects.requireNonNull(null);
        return new C5286w(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, 3);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C5271t(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, longFunction, 2);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: x */
    public final InterfaceC5187e0 mo21580x() {
        Objects.requireNonNull(null);
        return new C5281v(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, 3);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: l */
    public final InterfaceC5053E mo21576l() {
        Objects.requireNonNull(null);
        return new C5276u(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, 6);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: d */
    public final InterfaceC5252p0 mo21574d(C5162a c5162a) {
        Objects.requireNonNull(c5162a);
        return new C5217j0(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n | EnumC5196f3.f18592t, c5162a, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: b */
    public final InterfaceC5252p0 mo21572b() {
        Objects.requireNonNull(null);
        return new C5286w(this, EnumC5196f3.f18592t, 5);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final InterfaceC5252p0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C5217j0(this, longConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final InterfaceC5252p0 limit(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(Long.toString(j7));
        }
        return AbstractC5034A0.m21395a0(this, 0L, j7);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final InterfaceC5252p0 skip(long j7) {
        if (j7 >= 0) {
            return j7 == 0 ? this : AbstractC5034A0.m21395a0(this, j7, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: a */
    public final InterfaceC5252p0 mo21571a() {
        int i7 = AbstractC5245n4.f18665a;
        Objects.requireNonNull(null);
        return new C5151X3(this, AbstractC5245n4.f18665a, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: c */
    public final InterfaceC5252p0 mo21573c() {
        int i7 = AbstractC5245n4.f18665a;
        Objects.requireNonNull(null);
        return new C5161Z3(this, AbstractC5245n4.f18666b, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final InterfaceC5252p0 distinct() {
        return ((AbstractC5219j2) boxed()).distinct().mapToLong(new C5261r(19));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final long sum() {
        return reduce(0L, new C5261r(27));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final C4940E min() {
        return reduce(new C5261r(18));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final C4940E max() {
        return reduce(new C5261r(26));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final C4938C average() {
        long j7 = ((long[]) collect(new C5261r(23), new C5261r(24), new C5261r(25)))[0];
        return j7 > 0 ? C4938C.m21256d(r0[1] / j7) : C4938C.m21255a();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final long reduce(long j7, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) m21516D(new C5045C1(EnumC5202g3.LONG_VALUE, longBinaryOperator, j7))).longValue();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final C4937B summaryStatistics() {
        return (C4937B) collect(new C5251p(18), new C5261r(17), new C5261r(20));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C5256q c5256q = new C5256q(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c5256q);
        return m21516D(new C5065G1(EnumC5202g3.LONG_VALUE, c5256q, objLongConsumer, supplier, 0));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: w */
    public final boolean mo21579w() {
        return ((Boolean) m21516D(AbstractC5034A0.m21396b0(EnumC5292x0.ANY))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: r */
    public final boolean mo21578r() {
        return ((Boolean) m21516D(AbstractC5034A0.m21396b0(EnumC5292x0.ALL))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final C4940E reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (C4940E) m21516D(new C5055E1(EnumC5202g3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    /* renamed from: n */
    public final boolean mo21577n() {
        return ((Boolean) m21516D(AbstractC5034A0.m21396b0(EnumC5292x0.NONE))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final long[] toArray() {
        return (long[]) AbstractC5034A0.m21384Q((InterfaceC5084K0) m21517E(new C5261r(21))).mo21480d();
    }

    @Override // p256j$.util.stream.InterfaceC5252p0
    public final long count() {
        return ((Long) m21516D(new C5075I1(0))).longValue();
    }
}
