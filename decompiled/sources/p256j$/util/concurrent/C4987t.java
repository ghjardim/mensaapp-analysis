package p256j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.concurrent.t */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4987t implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f18249a;

    /* renamed from: b */
    public final /* synthetic */ Object f18250b;

    /* renamed from: c */
    public final /* synthetic */ Object f18251c;

    public /* synthetic */ C4987t(int i7, Object obj, Object obj2) {
        this.f18249a = i7;
        this.f18250b = obj;
        this.f18251c = obj2;
    }

    public /* synthetic */ C4987t(BiFunction biFunction, Function function) {
        this.f18249a = 2;
        this.f18251c = biFunction;
        this.f18250b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f18249a) {
        }
        return AbstractC4815a.m20863a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return AbstractC4815a.m20864b(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f18250b).accept(obj);
        ((Consumer) this.f18251c).accept(obj);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f18250b).apply(((BiFunction) this.f18251c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f18249a) {
            case 0:
                break;
            default:
                ((BiConsumer) this.f18250b).accept(obj, obj2);
                ((BiConsumer) this.f18251c).accept(obj, obj2);
                return;
        }
        do {
            Object apply = ((BiFunction) this.f18251c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f18250b;
            if (concurrentMap.replace(obj, obj2, apply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }
}
