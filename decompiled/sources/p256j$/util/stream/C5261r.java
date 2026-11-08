package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import org.apache.tika.utils.XMLReaderUtils;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.C4937B;
import p256j$.util.C4938C;
import p256j$.util.C4939D;
import p256j$.util.C4940E;
import p256j$.util.C5315z;
import p256j$.util.Optional;
import p256j$.util.function.Consumer$CC;
import p256j$.util.function.Predicate$CC;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: j$.util.stream.r */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5261r implements Supplier, Predicate, IntFunction, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f18685a;

    public /* synthetic */ C5261r(int i7) {
        this.f18685a = i7;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f18685a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f18685a) {
            case 11:
                break;
            case 16:
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                break;
        }
        return AbstractC4815a.m20863a(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j7) {
        return Long.valueOf(j7);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i7, int i8) {
        switch (this.f18685a) {
            case 9:
                return Math.min(i7, i8);
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return i7 + i8;
            default:
                return Math.max(i7, i8);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j7, long j8) {
        switch (this.f18685a) {
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return Math.min(j7, j8);
            case 26:
                return Math.max(j7, j8);
            default:
                return j7 + j8;
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f18685a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    /* renamed from: or */
    public /* synthetic */ Predicate m21593or(Predicate predicate) {
        switch (this.f18685a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f18685a) {
            case 1:
                return ((C4938C) obj).m21258c();
            case 2:
                return ((C4939D) obj).m21266c();
            case 3:
                return ((C4940E) obj).m21270c();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i7) {
        switch (this.f18685a) {
            case 5:
                return new Object[i7];
            case 6:
                return new Integer[i7];
            case 8:
                return Integer.valueOf(i7);
            case 21:
                return new Long[i7];
            default:
                return new Object[i7];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f18685a) {
            case 0:
                return new double[3];
            case 14:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j7) {
        switch (this.f18685a) {
            case 17:
                ((C4937B) obj).accept(j7);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j7;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f18685a) {
            case 11:
                ((C5315z) obj).m21609b((C5315z) obj2);
                break;
            case 16:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                ((C4937B) obj).m21254b((C4937B) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i7) {
        switch (this.f18685a) {
            case 10:
                ((C5315z) obj).accept(i7);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i7;
                break;
        }
    }
}
