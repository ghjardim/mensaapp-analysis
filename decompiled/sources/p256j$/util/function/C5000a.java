package p256j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.function.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5000a implements BinaryOperator, Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f18263a;

    /* renamed from: b */
    public final /* synthetic */ Object f18264b;

    public /* synthetic */ C5000a(int i7, Object obj) {
        this.f18263a = i7;
        this.f18264b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f18263a) {
        }
        return AbstractC4815a.m20864b(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    /* renamed from: or */
    public /* synthetic */ Predicate m21363or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f18263a) {
            case 0:
                if (((Comparator) this.f18264b).compare(obj, obj2) < 0) {
                    break;
                }
                break;
            default:
                if (((Comparator) this.f18264b).compare(obj, obj2) > 0) {
                    break;
                }
                break;
        }
        return obj2;
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f18264b).test(obj);
    }
}
