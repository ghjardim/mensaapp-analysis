package p256j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import p256j$.util.concurrent.ConcurrentHashMap;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.r0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5262r0 implements Supplier, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f18686a;

    /* renamed from: b */
    public final /* synthetic */ Object f18687b;

    /* renamed from: c */
    public final /* synthetic */ Object f18688c;

    public /* synthetic */ C5262r0(int i7, Object obj, Object obj2) {
        this.f18686a = i7;
        this.f18687b = obj;
        this.f18688c = obj2;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18686a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C5267s0((EnumC5292x0) this.f18687b, (Predicate) this.f18688c);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f18686a) {
            case 1:
                ((C5250o3) this.f18687b).m21585b((Consumer) this.f18688c, obj);
                break;
            case 2:
                if (obj != null) {
                    ((ConcurrentHashMap) this.f18688c).putIfAbsent(obj, Boolean.TRUE);
                    break;
                } else {
                    ((AtomicBoolean) this.f18687b).set(true);
                    break;
                }
            default:
                ((BiConsumer) this.f18687b).accept(this.f18688c, obj);
                break;
        }
    }
}
