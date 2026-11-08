package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import p256j$.util.C4938C;
import p256j$.util.C5314y;
import p256j$.util.InterfaceC4944I;
import p256j$.util.InterfaceC4957W;
import p256j$.util.Objects;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.B */
/* loaded from: classes3.dex */
abstract class AbstractC5038B extends AbstractC5168b implements InterfaceC5053E {
    @Override // p256j$.util.stream.InterfaceC5053E
    public final C4938C findAny() {
        return (C4938C) m21516D(C5063G.f18377d);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final C4938C findFirst() {
        return (C4938C) m21516D(C5063G.f18376c);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final InterfaceC5053E sorted() {
        return new C5081J2(this, EnumC5196f3.f18589q | EnumC5196f3.f18587o, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static InterfaceC4957W m21428Z(Spliterator spliterator) {
        if (spliterator instanceof InterfaceC4957W) {
            return (InterfaceC4957W) spliterator;
        }
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(AbstractC5168b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        m21516D(new C5093M(doubleConsumer, false));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        m21516D(new C5093M(doubleConsumer, true));
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: I */
    final EnumC5202g3 mo21431I() {
        return EnumC5202g3.DOUBLE_VALUE;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: F */
    final InterfaceC5094M0 mo21429F(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC5034A0.m21373F(abstractC5168b, spliterator, z6);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: U */
    final Spliterator mo21433U(AbstractC5168b abstractC5168b, Supplier supplier, boolean z6) {
        return new C5260q3(abstractC5168b, supplier, z6);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: H */
    final boolean mo21430H(Spliterator spliterator, InterfaceC5264r2 interfaceC5264r2) {
        DoubleConsumer c5246o;
        boolean mo21455n;
        InterfaceC4957W m21428Z = m21428Z(spliterator);
        if (interfaceC5264r2 instanceof DoubleConsumer) {
            c5246o = (DoubleConsumer) interfaceC5264r2;
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(AbstractC5168b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5264r2);
            c5246o = new C5246o(interfaceC5264r2);
        }
        do {
            mo21455n = interfaceC5264r2.mo21455n();
            if (mo21455n) {
                break;
            }
        } while (m21428Z.tryAdvance(c5246o));
        return mo21455n;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: N */
    final InterfaceC5054E0 mo21432N(long j7, IntFunction intFunction) {
        return AbstractC5034A0.m21377J(j7);
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final InterfaceC4944I iterator() {
        return Spliterators.m21286f(spliterator());
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h
    public final InterfaceC4957W spliterator() {
        return m21428Z(super.spliterator());
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final Stream boxed() {
        return new C5271t(this, 0, new C5251p(26), 0);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: e */
    public final InterfaceC5053E mo21438e() {
        Objects.requireNonNull(null);
        return new C5276u(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C5271t(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, doubleFunction, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: u */
    public final InterfaceC5187e0 mo21442u() {
        Objects.requireNonNull(null);
        return new C5281v(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: j */
    public final InterfaceC5252p0 mo21440j() {
        Objects.requireNonNull(null);
        return new C5286w(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: d */
    public final InterfaceC5053E mo21437d(C5162a c5162a) {
        Objects.requireNonNull(c5162a);
        return new C5296y(this, EnumC5196f3.f18588p | EnumC5196f3.f18586n | EnumC5196f3.f18592t, c5162a, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: b */
    public final InterfaceC5053E mo21435b() {
        Objects.requireNonNull(null);
        return new C5276u(this, EnumC5196f3.f18592t, 2);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final InterfaceC5053E peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C5296y(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final InterfaceC5053E limit(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(Long.toString(j7));
        }
        return AbstractC5034A0.m21390W(this, 0L, j7);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final InterfaceC5053E skip(long j7) {
        if (j7 >= 0) {
            return j7 == 0 ? this : AbstractC5034A0.m21390W(this, j7, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j7));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: a */
    public final InterfaceC5053E mo21434a() {
        int i7 = AbstractC5245n4.f18665a;
        Objects.requireNonNull(null);
        return new C5173b4(this, AbstractC5245n4.f18665a, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: c */
    public final InterfaceC5053E mo21436c() {
        int i7 = AbstractC5245n4.f18665a;
        Objects.requireNonNull(null);
        return new C5185d4(this, AbstractC5245n4.f18666b, 0);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final InterfaceC5053E distinct() {
        return ((AbstractC5219j2) boxed()).distinct().mapToDouble(new C5251p(27));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final double sum() {
        double[] dArr = (double[]) collect(new C5261r(0), new C5251p(3), new C5251p(0));
        int i7 = AbstractC5222k.f18640a;
        double d7 = dArr[0] + dArr[1];
        double d8 = dArr[dArr.length - 1];
        return (Double.isNaN(d7) && Double.isInfinite(d8)) ? d8 : d7;
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final C4938C min() {
        return reduce(new C5251p(22));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final C4938C max() {
        return reduce(new C5251p(29));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final C4938C average() {
        double[] dArr = (double[]) collect(new C5251p(23), new C5251p(1), new C5251p(2));
        if (dArr[2] <= 0.0d) {
            return C4938C.m21255a();
        }
        int i7 = AbstractC5222k.f18640a;
        double d7 = dArr[0] + dArr[1];
        double d8 = dArr[dArr.length - 1];
        if (Double.isNaN(d7) && Double.isInfinite(d8)) {
            d7 = d8;
        }
        return C4938C.m21256d(d7 / dArr[2]);
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final C5314y summaryStatistics() {
        return (C5314y) collect(new C5251p(16), new C5251p(24), new C5251p(25));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C5256q c5256q = new C5256q(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c5256q);
        return m21516D(new C5065G1(EnumC5202g3.DOUBLE_VALUE, c5256q, objDoubleConsumer, supplier, 1));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: p */
    public final boolean mo21441p() {
        return ((Boolean) m21516D(AbstractC5034A0.m21391X(EnumC5292x0.ANY))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: i */
    public final boolean mo21439i() {
        return ((Boolean) m21516D(AbstractC5034A0.m21391X(EnumC5292x0.ALL))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    /* renamed from: y */
    public final boolean mo21443y() {
        return ((Boolean) m21516D(AbstractC5034A0.m21391X(EnumC5292x0.NONE))).booleanValue();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final double[] toArray() {
        return (double[]) AbstractC5034A0.m21382O((InterfaceC5064G0) m21517E(new C5251p(28))).mo21480d();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final double reduce(double d7, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) m21516D(new C5085K1(EnumC5202g3.DOUBLE_VALUE, doubleBinaryOperator, d7))).doubleValue();
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final C4938C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C4938C) m21516D(new C5055E1(EnumC5202g3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // p256j$.util.stream.InterfaceC5053E
    public final long count() {
        return ((Long) m21516D(new C5075I1(1))).longValue();
    }
}
