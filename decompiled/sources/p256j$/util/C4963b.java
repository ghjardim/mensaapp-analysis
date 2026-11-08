package p256j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4963b implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f18168a;

    /* renamed from: b */
    public final /* synthetic */ Object f18169b;

    public /* synthetic */ C4963b(int i7, Object obj) {
        this.f18168a = i7;
        this.f18169b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f18168a) {
            case 0:
                ToIntFunction toIntFunction = (ToIntFunction) this.f18169b;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f18169b;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 2:
                Function function = (Function) this.f18169b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) this.f18169b;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
        }
    }
}
