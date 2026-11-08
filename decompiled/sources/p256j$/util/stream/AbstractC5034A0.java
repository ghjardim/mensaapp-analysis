package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.A0 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5034A0 implements InterfaceC5092L3 {

    /* renamed from: a */
    private static final C5194f1 f18327a = new C5194f1();

    /* renamed from: b */
    private static final InterfaceC5074I0 f18328b = new C5182d1();

    /* renamed from: c */
    private static final InterfaceC5084K0 f18329c = new C5188e1();

    /* renamed from: d */
    private static final InterfaceC5064G0 f18330d = new C5176c1();

    /* renamed from: e */
    private static final int[] f18331e = new int[0];

    /* renamed from: f */
    private static final long[] f18332f = new long[0];

    /* renamed from: g */
    private static final double[] f18333g = new double[0];

    /* renamed from: B */
    static long m21369B(long j7, long j8) {
        long j9 = j8 >= 0 ? j7 + j8 : Long.MAX_VALUE;
        if (j9 >= 0) {
            return j9;
        }
        return Long.MAX_VALUE;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: d */
    public /* synthetic */ int mo21424d() {
        return 0;
    }

    /* renamed from: e0 */
    public abstract InterfaceC5144W1 mo21425e0();

    /* renamed from: R */
    public static C5162a m21385R(Function function) {
        C5162a c5162a = new C5162a(8);
        c5162a.f18530b = function;
        return c5162a;
    }

    /* renamed from: A */
    static long m21368A(long j7, long j8, long j9) {
        if (j7 >= 0) {
            return Math.max(-1L, Math.min(j7 - j8, j9));
        }
        return -1L;
    }

    /* renamed from: f0 */
    public static Stream m21401f0(Spliterator spliterator, boolean z6) {
        Objects.requireNonNull(spliterator);
        return new C5207h2(spliterator, EnumC5196f3.m21554n(spliterator), z6);
    }

    /* renamed from: C */
    static Spliterator m21370C(EnumC5202g3 enumC5202g3, Spliterator spliterator, long j7, long j8) {
        long j9 = j8 >= 0 ? j7 + j8 : Long.MAX_VALUE;
        long j10 = j9 >= 0 ? j9 : Long.MAX_VALUE;
        int i7 = AbstractC5036A2.f18334a[enumC5202g3.ordinal()];
        if (i7 == 1) {
            return new C5305z3(spliterator, j7, j10);
        }
        if (i7 == 2) {
            return new C5290w3((InterfaceC4960Z) spliterator, j7, j10);
        }
        if (i7 == 3) {
            return new C5295x3((InterfaceC4966c0) spliterator, j7, j10);
        }
        if (i7 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC5202g3);
        }
        return new C5285v3((InterfaceC4957W) spliterator, j7, j10);
    }

    /* renamed from: c0 */
    public static C5297y0 m21397c0(EnumC5292x0 enumC5292x0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC5292x0);
        return new C5297y0(EnumC5202g3.REFERENCE, enumC5292x0, new C5262r0(0, enumC5292x0, predicate));
    }

    /* renamed from: L */
    static AbstractC5200g1 m21379L(EnumC5202g3 enumC5202g3) {
        int i7 = AbstractC5099N0.f18426a[enumC5202g3.ordinal()];
        if (i7 == 1) {
            return f18327a;
        }
        if (i7 == 2) {
            return (AbstractC5200g1) f18328b;
        }
        if (i7 == 3) {
            return (AbstractC5200g1) f18329c;
        }
        if (i7 == 4) {
            return (AbstractC5200g1) f18330d;
        }
        throw new IllegalStateException("Unknown shape " + enumC5202g3);
    }

    /* renamed from: Z */
    public static C5297y0 m21393Z(EnumC5292x0 enumC5292x0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC5292x0);
        return new C5297y0(EnumC5202g3.INT_VALUE, enumC5292x0, new C5257q0(enumC5292x0, 1));
    }

    /* renamed from: d0 */
    public static Stream m21398d0(AbstractC5219j2 abstractC5219j2, long j7, long j8) {
        if (j7 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j7);
        }
        return new C5274t2(abstractC5219j2, m21380M(j8), j7, j8);
    }

    /* renamed from: w */
    public static InterfaceC5094M0 m21418w(InterfaceC5094M0 interfaceC5094M0, long j7, long j8, IntFunction intFunction) {
        if (j7 == 0 && j8 == interfaceC5094M0.count()) {
            return interfaceC5094M0;
        }
        Spliterator spliterator = interfaceC5094M0.spliterator();
        long j9 = j8 - j7;
        InterfaceC5054E0 m21371D = m21371D(j9, intFunction);
        m21371D.mo21460l(j9);
        for (int i7 = 0; i7 < j7 && spliterator.tryAdvance(new C5261r(28)); i7++) {
        }
        if (j8 == interfaceC5094M0.count()) {
            spliterator.forEachRemaining(m21371D);
        } else {
            for (int i8 = 0; i8 < j9 && spliterator.tryAdvance(m21371D); i8++) {
            }
        }
        m21371D.mo21459k();
        return m21371D.mo21444a();
    }

    /* renamed from: I */
    static AbstractC5104O0 m21376I(EnumC5202g3 enumC5202g3, InterfaceC5094M0 interfaceC5094M0, InterfaceC5094M0 interfaceC5094M02) {
        int i7 = AbstractC5099N0.f18426a[enumC5202g3.ordinal()];
        if (i7 == 1) {
            return new C5153Y0(interfaceC5094M0, interfaceC5094M02);
        }
        if (i7 == 2) {
            return new C5138V0((InterfaceC5074I0) interfaceC5094M0, (InterfaceC5074I0) interfaceC5094M02);
        }
        if (i7 == 3) {
            return new C5143W0((InterfaceC5084K0) interfaceC5094M0, (InterfaceC5084K0) interfaceC5094M02);
        }
        if (i7 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC5202g3);
        }
        return new C5133U0((InterfaceC5064G0) interfaceC5094M0, (InterfaceC5064G0) interfaceC5094M02);
    }

    /* renamed from: T */
    public static InterfaceC5187e0 m21387T(InterfaceC4960Z interfaceC4960Z) {
        return new C5157Z(interfaceC4960Z, EnumC5196f3.m21554n(interfaceC4960Z), false);
    }

    /* renamed from: b0 */
    public static C5297y0 m21396b0(EnumC5292x0 enumC5292x0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC5292x0);
        return new C5297y0(EnumC5202g3.LONG_VALUE, enumC5292x0, new C5257q0(enumC5292x0, 0));
    }

    /* renamed from: k */
    public static void m21406k() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: X */
    public static C5297y0 m21391X(EnumC5292x0 enumC5292x0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC5292x0);
        return new C5297y0(EnumC5202g3.DOUBLE_VALUE, enumC5292x0, new C5257q0(enumC5292x0, 2));
    }

    /* renamed from: l */
    public static void m21407l() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: D */
    static InterfaceC5054E0 m21371D(long j7, IntFunction intFunction) {
        if (j7 >= 0 && j7 < 2147483639) {
            return new C5206h1(j7, intFunction);
        }
        return new C5303z1();
    }

    /* renamed from: a */
    public static void m21394a() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: g */
    public static void m21402g(InterfaceC5254p2 interfaceC5254p2, Integer num) {
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(interfaceC5254p2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC5254p2.accept(num.intValue());
    }

    /* renamed from: V */
    public static InterfaceC5252p0 m21389V(InterfaceC4966c0 interfaceC4966c0) {
        return new C5223k0(interfaceC4966c0, EnumC5196f3.m21554n(interfaceC4966c0), false);
    }

    /* renamed from: i */
    public static void m21404i(InterfaceC5259q2 interfaceC5259q2, Long l7) {
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(interfaceC5259q2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC5259q2.accept(l7.longValue());
    }

    /* renamed from: S */
    static InterfaceC5044C0 m21386S(long j7) {
        if (j7 < 0 || j7 >= 2147483639) {
            return new C5224k1();
        }
        return new C5218j1(j7);
    }

    /* renamed from: e */
    public static void m21399e(InterfaceC5249o2 interfaceC5249o2, Double d7) {
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(interfaceC5249o2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC5249o2.accept(d7.doubleValue());
    }

    /* renamed from: Y */
    public static InterfaceC5187e0 m21392Y(AbstractC5169b0 abstractC5169b0, long j7, long j8) {
        if (j7 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j7);
        }
        return new C5284v2(abstractC5169b0, m21380M(j8), j7, j8);
    }

    /* renamed from: U */
    static InterfaceC5049D0 m21388U(long j7) {
        if (j7 < 0 || j7 >= 2147483639) {
            return new C5273t1();
        }
        return new C5268s1(j7);
    }

    /* renamed from: m */
    public static Object[] m21408m(InterfaceC5089L0 interfaceC5089L0, IntFunction intFunction) {
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(interfaceC5089L0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (interfaceC5089L0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) interfaceC5089L0.count());
        interfaceC5089L0.mo21484i(objArr, 0);
        return objArr;
    }

    /* renamed from: K */
    public static InterfaceC5053E m21378K(InterfaceC4957W interfaceC4957W) {
        return new C5301z(interfaceC4957W, EnumC5196f3.m21554n(interfaceC4957W), false);
    }

    /* renamed from: J */
    static InterfaceC5039B0 m21377J(long j7) {
        if (j7 < 0 || j7 >= 2147483639) {
            return new C5170b1();
        }
        return new C5164a1(j7);
    }

    /* renamed from: E */
    public static InterfaceC5094M0 m21372E(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        long m21518G = abstractC5168b.m21518G(spliterator);
        if (m21518G < 0 || !spliterator.hasCharacteristics(16384)) {
            C5123S0 c5123s0 = new C5123S0();
            c5123s0.f18475a = intFunction;
            InterfaceC5094M0 interfaceC5094M0 = (InterfaceC5094M0) new C5118R0(abstractC5168b, spliterator, c5123s0, new C5251p(14), 3).invoke();
            return z6 ? m21381N(interfaceC5094M0, intFunction) : interfaceC5094M0;
        }
        if (m21518G >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) m21518G);
        new C5293x1(spliterator, abstractC5168b, objArr).invoke();
        return new C5109P0(objArr);
    }

    /* renamed from: r */
    public static void m21413r(InterfaceC5074I0 interfaceC5074I0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC5074I0.mo21481e((IntConsumer) consumer);
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(interfaceC5074I0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC4960Z) interfaceC5074I0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: a0 */
    public static InterfaceC5252p0 m21395a0(AbstractC5235m0 abstractC5235m0, long j7, long j8) {
        if (j7 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j7);
        }
        return new C5294x2(abstractC5235m0, m21380M(j8), j7, j8);
    }

    /* renamed from: o */
    public static void m21410o(InterfaceC5074I0 interfaceC5074I0, Integer[] numArr, int i7) {
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(interfaceC5074I0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC5074I0.mo21480d();
        for (int i8 = 0; i8 < iArr.length; i8++) {
            numArr[i7 + i8] = Integer.valueOf(iArr[i8]);
        }
    }

    /* renamed from: u */
    public static InterfaceC5074I0 m21416u(InterfaceC5074I0 interfaceC5074I0, long j7, long j8) {
        if (j7 == 0 && j8 == interfaceC5074I0.count()) {
            return interfaceC5074I0;
        }
        long j9 = j8 - j7;
        InterfaceC4960Z interfaceC4960Z = (InterfaceC4960Z) interfaceC5074I0.spliterator();
        InterfaceC5044C0 m21386S = m21386S(j9);
        m21386S.mo21460l(j9);
        for (int i7 = 0; i7 < j7 && interfaceC4960Z.tryAdvance((IntConsumer) new C5069H0(0)); i7++) {
        }
        if (j8 == interfaceC5074I0.count()) {
            interfaceC4960Z.forEachRemaining((IntConsumer) m21386S);
        } else {
            for (int i8 = 0; i8 < j9 && interfaceC4960Z.tryAdvance((IntConsumer) m21386S); i8++) {
            }
        }
        m21386S.mo21459k();
        return m21386S.mo21444a();
    }

    /* renamed from: G */
    public static InterfaceC5074I0 m21374G(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6) {
        long m21518G = abstractC5168b.m21518G(spliterator);
        if (m21518G < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC5074I0 interfaceC5074I0 = (InterfaceC5074I0) new C5118R0(abstractC5168b, spliterator, new C5251p(10), new C5251p(11), 1).invoke();
            return z6 ? m21383P(interfaceC5074I0) : interfaceC5074I0;
        }
        if (m21518G >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) m21518G];
        new C5283v1(spliterator, abstractC5168b, iArr).invoke();
        return new C5212i1(iArr);
    }

    /* renamed from: H */
    public static InterfaceC5084K0 m21375H(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6) {
        long m21518G = abstractC5168b.m21518G(spliterator);
        if (m21518G < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC5084K0 interfaceC5084K0 = (InterfaceC5084K0) new C5118R0(abstractC5168b, spliterator, new C5251p(12), new C5251p(13), 2).invoke();
            return z6 ? m21384Q(interfaceC5084K0) : interfaceC5084K0;
        }
        if (m21518G >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) m21518G];
        new C5288w1(spliterator, abstractC5168b, jArr).invoke();
        return new C5263r1(jArr);
    }

    /* renamed from: s */
    public static void m21414s(InterfaceC5084K0 interfaceC5084K0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC5084K0.mo21481e((LongConsumer) consumer);
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(interfaceC5084K0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC4966c0) interfaceC5084K0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: p */
    public static void m21411p(InterfaceC5084K0 interfaceC5084K0, Long[] lArr, int i7) {
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(interfaceC5084K0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC5084K0.mo21480d();
        for (int i8 = 0; i8 < jArr.length; i8++) {
            lArr[i7 + i8] = Long.valueOf(jArr[i8]);
        }
    }

    /* renamed from: v */
    public static InterfaceC5084K0 m21417v(InterfaceC5084K0 interfaceC5084K0, long j7, long j8) {
        if (j7 == 0 && j8 == interfaceC5084K0.count()) {
            return interfaceC5084K0;
        }
        long j9 = j8 - j7;
        InterfaceC4966c0 interfaceC4966c0 = (InterfaceC4966c0) interfaceC5084K0.spliterator();
        InterfaceC5049D0 m21388U = m21388U(j9);
        m21388U.mo21460l(j9);
        for (int i7 = 0; i7 < j7 && interfaceC4966c0.tryAdvance((LongConsumer) new C5079J0(0)); i7++) {
        }
        if (j8 == interfaceC5084K0.count()) {
            interfaceC4966c0.forEachRemaining((LongConsumer) m21388U);
        } else {
            for (int i8 = 0; i8 < j9 && interfaceC4966c0.tryAdvance((LongConsumer) m21388U); i8++) {
            }
        }
        m21388U.mo21459k();
        return m21388U.mo21444a();
    }

    /* renamed from: F */
    public static InterfaceC5064G0 m21373F(AbstractC5168b abstractC5168b, Spliterator spliterator, boolean z6) {
        long m21518G = abstractC5168b.m21518G(spliterator);
        if (m21518G < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC5064G0 interfaceC5064G0 = (InterfaceC5064G0) new C5118R0(abstractC5168b, spliterator, new C5251p(8), new C5251p(9), 0).invoke();
            return z6 ? m21382O(interfaceC5064G0) : interfaceC5064G0;
        }
        if (m21518G >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) m21518G];
        new C5278u1(spliterator, abstractC5168b, dArr).invoke();
        return new C5158Z0(dArr);
    }

    /* renamed from: W */
    public static InterfaceC5053E m21390W(AbstractC5038B abstractC5038B, long j7, long j8) {
        if (j7 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j7);
        }
        return new C5304z2(abstractC5038B, m21380M(j8), j7, j8);
    }

    /* renamed from: N */
    public static InterfaceC5094M0 m21381N(InterfaceC5094M0 interfaceC5094M0, IntFunction intFunction) {
        if (interfaceC5094M0.mo21486q() <= 0) {
            return interfaceC5094M0;
        }
        long count = interfaceC5094M0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new C5040B1(interfaceC5094M0, objArr, 1).invoke();
        return new C5109P0(objArr);
    }

    /* renamed from: q */
    public static void m21412q(InterfaceC5064G0 interfaceC5064G0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC5064G0.mo21481e((DoubleConsumer) consumer);
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(interfaceC5064G0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC4957W) interfaceC5064G0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: P */
    public static InterfaceC5074I0 m21383P(InterfaceC5074I0 interfaceC5074I0) {
        if (interfaceC5074I0.mo21486q() <= 0) {
            return interfaceC5074I0;
        }
        long count = interfaceC5074I0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new C5035A1(interfaceC5074I0, iArr, 0).invoke();
        return new C5212i1(iArr);
    }

    /* renamed from: n */
    public static void m21409n(InterfaceC5064G0 interfaceC5064G0, Double[] dArr, int i7) {
        if (AbstractC5107O3.f18441a) {
            AbstractC5107O3.m21488a(interfaceC5064G0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC5064G0.mo21480d();
        for (int i8 = 0; i8 < dArr2.length; i8++) {
            dArr[i7 + i8] = Double.valueOf(dArr2[i8]);
        }
    }

    /* renamed from: t */
    public static InterfaceC5064G0 m21415t(InterfaceC5064G0 interfaceC5064G0, long j7, long j8) {
        if (j7 == 0 && j8 == interfaceC5064G0.count()) {
            return interfaceC5064G0;
        }
        long j9 = j8 - j7;
        InterfaceC4957W interfaceC4957W = (InterfaceC4957W) interfaceC5064G0.spliterator();
        InterfaceC5039B0 m21377J = m21377J(j9);
        m21377J.mo21460l(j9);
        for (int i7 = 0; i7 < j7 && interfaceC4957W.tryAdvance((DoubleConsumer) new C5059F0(0)); i7++) {
        }
        if (j8 == interfaceC5064G0.count()) {
            interfaceC4957W.forEachRemaining((DoubleConsumer) m21377J);
        } else {
            for (int i8 = 0; i8 < j9 && interfaceC4957W.tryAdvance((DoubleConsumer) m21377J); i8++) {
            }
        }
        m21377J.mo21459k();
        return m21377J.mo21444a();
    }

    /* renamed from: Q */
    public static InterfaceC5084K0 m21384Q(InterfaceC5084K0 interfaceC5084K0) {
        if (interfaceC5084K0.mo21486q() <= 0) {
            return interfaceC5084K0;
        }
        long count = interfaceC5084K0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new C5035A1(interfaceC5084K0, jArr, 0).invoke();
        return new C5263r1(jArr);
    }

    /* renamed from: M */
    private static int m21380M(long j7) {
        return (j7 != -1 ? EnumC5196f3.f18593u : 0) | EnumC5196f3.f18592t;
    }

    /* renamed from: O */
    public static InterfaceC5064G0 m21382O(InterfaceC5064G0 interfaceC5064G0) {
        if (interfaceC5064G0.mo21486q() <= 0) {
            return interfaceC5064G0;
        }
        long count = interfaceC5064G0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new C5035A1(interfaceC5064G0, dArr, 0).invoke();
        return new C5158Z0(dArr);
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: b */
    public Object mo21422b(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        InterfaceC5144W1 mo21425e0 = mo21425e0();
        abstractC5168b.m21524V(spliterator, mo21425e0);
        return mo21425e0.get();
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: c */
    public Object mo21423c(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        return ((InterfaceC5144W1) new C5183d2(this, abstractC5168b, spliterator).invoke()).get();
    }
}
