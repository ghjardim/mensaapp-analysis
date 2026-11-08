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
import p256j$.util.Objects;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.b0 */
/* loaded from: classes3.dex */
abstract class AbstractC5169b0 extends AbstractC5168b implements InterfaceC5187e0 {
    @Override // p256j$.util.stream.InterfaceC5187e0
    public final C4939D findAny() {
        return (C4939D) m21516D(C5068H.f18385d);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final C4939D findFirst() {
        return (C4939D) m21516D(C5068H.f18384c);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final InterfaceC5187e0 sorted() {
        return new C5086K2(this, EnumC5196f3.f18589q | EnumC5196f3.f18587o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        m21516D(new C5098N(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        m21516D(new C5098N(intConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static InterfaceC4960Z m21528Z(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC4960Z) {
            return (InterfaceC4960Z) spliterator;
        }
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(AbstractC5168b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: I */
    final EnumC5202g3 mo21431I() {
        return EnumC5202g3.INT_VALUE;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: F */
    final InterfaceC5094M0 mo21429F(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC5034A0.m21374G(abstractC5168b, spliterator, z6);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: U */
    final Spliterator mo21433U(AbstractC5168b abstractC5168b, Supplier supplier, boolean z6) {
        return new C5270s3(abstractC5168b, supplier, z6);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: H */
    final boolean mo21430H(Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2) {
        IntConsumer c5132u;
        boolean mo21455n;
        InterfaceC4960Z m21528Z = m21528Z(spliterator);
        if (interfaceC5264r2 instanceof IntConsumer) {
            c5132u = (IntConsumer) interfaceC5264r2;
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(AbstractC5168b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5264r2);
            c5132u = new C5132U(interfaceC5264r2);
        }
        do {
            mo21455n = interfaceC5264r2.mo21455n();
            if (mo21455n) {
                break;
            }
        } while (m21528Z.tryAdvance(c5132u));
        return mo21455n;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: N */
    final InterfaceC5054E0 mo21432N(long j7, IntFunction intFunction) {
        return AbstractC5034A0.m21386S(j7);
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final InterfaceC4948M iterator() {
        return Spliterators.m21287g(spliterator());
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h
    public final InterfaceC4960Z spliterator() {
        return m21528Z(super.spliterator());
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final InterfaceC5252p0 asLongStream() {
        return new C5286w(this, 0, 1);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final InterfaceC5053E asDoubleStream() {
        return new C5276u(this, 0, 3);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final Stream boxed() {
        return new C5271t(this, 0, new C5261r(8), 1);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final InterfaceC5187e0 map(IntUnaryOperator intUnaryOperator) {
        Objects.requireNonNull(intUnaryOperator);
        return new C5142W(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, intUnaryOperator, 1);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C5271t(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, intFunction, 1);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: m */
    public final InterfaceC5252p0 mo21534m() {
        Objects.requireNonNull(null);
        return new C5286w(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, 2);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: f */
    public final InterfaceC5053E mo21532f() {
        Objects.requireNonNull(null);
        return new C5276u(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, 4);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final int reduce(int i7, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) m21516D(new C5119R1(EnumC5202g3.INT_VALUE, intBinaryOperator, i7))).intValue();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: q */
    public final InterfaceC5187e0 mo21535q(C5123S0 c5123s0) {
        Objects.requireNonNull(c5123s0);
        return new C5142W(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n | EnumC5196f3.f18592t, c5123s0, 2);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final C4939D reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (C4939D) m21516D(new C5055E1(EnumC5202g3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: b */
    public final InterfaceC5187e0 mo21530b() {
        Objects.requireNonNull(null);
        return new C5281v(this, EnumC5196f3.f18592t, 2);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final InterfaceC5187e0 peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new C5142W(this, intConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final InterfaceC5187e0 limit(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(Long.toString(j7));
        }
        return AbstractC5034A0.m21392Y(this, 0L, j7);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final InterfaceC5187e0 skip(long j7) {
        if (j7 >= 0) {
            return j7 == 0 ? this : AbstractC5034A0.m21392Y(this, j7, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: a */
    public final InterfaceC5187e0 mo21529a() {
        int i7 = AbstractC5245n4.f18665a;
        Objects.requireNonNull(null);
        return new C5131T3(this, AbstractC5245n4.f18665a, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: c */
    public final InterfaceC5187e0 mo21531c() {
        int i7 = AbstractC5245n4.f18665a;
        Objects.requireNonNull(null);
        return new C5141V3(this, AbstractC5245n4.f18666b, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final long count() {
        return ((Long) m21516D(new C5075I1(3))).longValue();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final InterfaceC5187e0 distinct() {
        return ((AbstractC5219j2) boxed()).distinct().mapToInt(new C5261r(7));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final int sum() {
        return reduce(0, new C5261r(12));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final C4939D min() {
        return reduce(new C5261r(9));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final C4939D max() {
        return reduce(new C5261r(13));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final C4938C average() {
        long j7 = ((long[]) collect(new C5261r(14), new C5261r(15), new C5261r(16)))[0];
        return j7 > 0 ? C4938C.m21256d(r0[1] / j7) : C4938C.m21255a();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final C5315z summaryStatistics() {
        return (C5315z) collect(new C5251p(17), new C5261r(10), new C5261r(11));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C5256q c5256q = new C5256q(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c5256q);
        return m21516D(new C5065G1(EnumC5202g3.INT_VALUE, c5256q, objIntConsumer, supplier, 4));
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: s */
    public final boolean mo21536s() {
        return ((Boolean) m21516D(AbstractC5034A0.m21393Z(EnumC5292x0.ANY))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: v */
    public final boolean mo21537v() {
        return ((Boolean) m21516D(AbstractC5034A0.m21393Z(EnumC5292x0.ALL))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    /* renamed from: g */
    public final boolean mo21533g() {
        return ((Boolean) m21516D(AbstractC5034A0.m21393Z(EnumC5292x0.NONE))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5187e0
    public final int[] toArray() {
        return (int[]) AbstractC5034A0.m21383P((InterfaceC5074I0) m21517E(new C5261r(6))).mo21480d();
    }
}
