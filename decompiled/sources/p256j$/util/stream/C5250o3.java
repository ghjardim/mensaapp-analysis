package p256j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.Spliterator;
import p256j$.util.concurrent.ConcurrentHashMap;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.o3 */
/* loaded from: classes3.dex */
final class C5250o3 implements Spliterator, Consumer {

    /* renamed from: d */
    private static final Object f18669d = new Object();

    /* renamed from: a */
    private final Spliterator f18670a;

    /* renamed from: b */
    private final ConcurrentHashMap f18671b;

    /* renamed from: c */
    private Object f18672c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC4994d.m21346d(this);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    C5250o3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C5250o3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f18670a = spliterator;
        this.f18671b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m21477p(Object obj) {
        this.f18672c = obj;
    }

    /* renamed from: b */
    final void m21585b(Consumer consumer, Object obj) {
        if (this.f18671b.putIfAbsent(obj != null ? obj : f18669d, Boolean.TRUE) == null) {
            consumer.m21477p(obj);
        }
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f18670a.tryAdvance(this)) {
            Object obj = this.f18672c;
            if (obj == null) {
                obj = f18669d;
            }
            if (this.f18671b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.m21477p(this.f18672c);
                this.f18672c = null;
                return true;
            }
        }
        return false;
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f18670a.forEachRemaining(new C5262r0(1, this, consumer));
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f18670a.trySplit();
        if (trySplit != null) {
            return new C5250o3(trySplit, this.f18671b);
        }
        return null;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18670a.estimateSize();
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return (this.f18670a.characteristics() & (-16469)) | 1;
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f18670a.getComparator();
    }
}
