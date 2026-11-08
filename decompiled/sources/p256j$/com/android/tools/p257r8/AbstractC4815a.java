package p256j$.com.android.tools.p257r8;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Objects;
import p256j$.util.concurrent.C4987t;
import p256j$.util.function.C5001b;
import p256j$.util.function.C5003d;
import p256j$.util.function.C5005f;
import sun.misc.Unsafe;

/* renamed from: j$.com.android.tools.r8.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4815a {
    /* renamed from: f */
    public static /* synthetic */ long m20868f(long j7, long j8) {
        long j9 = j7 + j8;
        if (((j8 ^ j7) < 0) || ((j7 ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    public static /* synthetic */ AbstractMap.SimpleImmutableEntry m20869g(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    /* renamed from: h */
    public static /* synthetic */ List m20870h(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m20871i(Unsafe unsafe, Object obj, long j7, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j7, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j7) != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static /* synthetic */ long m20872j(long j7, long j8) {
        long j9 = j7 % j8;
        if (j9 == 0) {
            return 0L;
        }
        return (((j7 ^ j8) >> 63) | 1) > 0 ? j9 : j9 + j8;
    }

    /* renamed from: k */
    public static /* synthetic */ long m20873k(long j7, long j8) {
        long j9 = j7 / j8;
        return (j7 - (j8 * j9) != 0 && (((j7 ^ j8) >> 63) | 1) < 0) ? j9 - 1 : j9;
    }

    /* renamed from: l */
    public static /* synthetic */ long m20874l(long j7, long j8) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j7) + Long.numberOfLeadingZeros(j7);
        if (numberOfLeadingZeros > 65) {
            return j7 * j8;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j8 != Long.MIN_VALUE) | (j7 >= 0)) {
                long j9 = j7 * j8;
                if (j7 == 0 || j9 / j7 == j8) {
                    return j9;
                }
            }
        }
        throw new ArithmeticException();
    }

    /* renamed from: m */
    public static /* synthetic */ long m20875m(long j7, long j8) {
        long j9 = j7 - j8;
        if (((j8 ^ j7) >= 0) || ((j7 ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    /* renamed from: c */
    public static C5001b m20865c(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return AbstractC4815a.m20865c(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d7) {
                DoubleConsumer.this.accept(d7);
                doubleConsumer2.accept(d7);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.d] */
    /* renamed from: d */
    public static C5003d m20866d(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.d
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return AbstractC4815a.m20866d(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i7) {
                IntConsumer.this.accept(i7);
                intConsumer2.accept(i7);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    /* renamed from: e */
    public static C5005f m20867e(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return AbstractC4815a.m20867e(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j7) {
                LongConsumer.this.accept(j7);
                longConsumer2.accept(j7);
            }
        };
    }

    /* renamed from: a */
    public static C4987t m20863a(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new C4987t(1, biConsumer, biConsumer2);
    }

    /* renamed from: b */
    public static C4987t m20864b(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new C4987t(biFunction, function);
    }
}
