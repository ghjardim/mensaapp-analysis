package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.q */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5256q implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ int f18676a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f18677b;

    public /* synthetic */ C5256q(BiConsumer biConsumer, int i7) {
        this.f18676a = i7;
        this.f18677b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f18676a) {
        }
        return AbstractC4815a.m20864b(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f18676a) {
            case 0:
                this.f18677b.accept(obj, obj2);
                break;
            case 1:
                this.f18677b.accept(obj, obj2);
                break;
            default:
                this.f18677b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
