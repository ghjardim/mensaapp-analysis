package p256j$.util.stream;

import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import org.apache.tika.utils.XMLReaderUtils;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.C4937B;
import p256j$.util.C5314y;
import p256j$.util.C5315z;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: j$.util.stream.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5251p implements BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, BinaryOperator, IntFunction, DoubleBinaryOperator, DoubleFunction, ToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ int f18673a;

    public /* synthetic */ C5251p(int i7) {
        this.f18673a = i7;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f18673a) {
            case 0:
                break;
            case 2:
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                break;
            case 21:
                break;
        }
        return AbstractC4815a.m20863a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f18673a) {
        }
        return AbstractC4815a.m20864b(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d7) {
        return Double.valueOf(d7);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j7) {
        switch (this.f18673a) {
            case 8:
                return AbstractC5034A0.m21377J(j7);
            case 9:
            default:
                return AbstractC5034A0.m21388U(j7);
            case 10:
                return AbstractC5034A0.m21386S(j7);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d7, double d8) {
        switch (this.f18673a) {
            case 22:
                return Math.min(d7, d8);
            default:
                return Math.max(d7, d8);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d7) {
        switch (this.f18673a) {
            case 1:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                AbstractC5222k.m21568a(dArr, d7);
                dArr[3] = dArr[3] + d7;
                break;
            case 2:
            default:
                ((C5314y) obj).accept(d7);
                break;
            case 3:
                double[] dArr2 = (double[]) obj;
                AbstractC5222k.m21568a(dArr2, d7);
                dArr2[2] = dArr2[2] + d7;
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f18673a) {
            case 4:
                return new C5063G();
            case 5:
                return new C5068H();
            case 6:
                return new C5073I();
            case 7:
                return new C5078J();
            case 16:
                return new C5314y();
            case 17:
                return new C5315z();
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new C4937B();
            case 19:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f18673a) {
            case 0:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC5222k.m21568a(dArr, dArr2[0]);
                AbstractC5222k.m21568a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 2:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC5222k.m21568a(dArr3, dArr4[0]);
                AbstractC5222k.m21568a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((C5314y) obj).m21608b((C5314y) obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i7) {
        switch (this.f18673a) {
            case 15:
                return new Object[i7];
            default:
                return new Double[i7];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f18673a) {
            case 9:
                return new C5133U0((InterfaceC5064G0) obj, (InterfaceC5064G0) obj2);
            case 10:
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            default:
                return new C5153Y0((InterfaceC5094M0) obj, (InterfaceC5094M0) obj2);
            case 11:
                return new C5138V0((InterfaceC5074I0) obj, (InterfaceC5074I0) obj2);
            case 13:
                return new C5143W0((InterfaceC5084K0) obj, (InterfaceC5084K0) obj2);
        }
    }
}
