package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;
import p256j$.util.Spliterator;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.y1 */
/* loaded from: classes3.dex */
abstract class AbstractC5298y1 extends CountedCompleter implements InterfaceC5264r2 {

    /* renamed from: a */
    protected final Spliterator f18735a;

    /* renamed from: b */
    protected final AbstractC5168b f18736b;

    /* renamed from: c */
    protected final long f18737c;

    /* renamed from: d */
    protected long f18738d;

    /* renamed from: e */
    protected long f18739e;

    /* renamed from: f */
    protected int f18740f;

    /* renamed from: g */
    protected int f18741g;

    public /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
        throw null;
    }

    public /* synthetic */ void accept(int i7) {
        AbstractC5034A0.m21406k();
        throw null;
    }

    public /* synthetic */ void accept(long j7) {
        AbstractC5034A0.m21407l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    abstract AbstractC5298y1 mo21602b(Spliterator spliterator, long j7, long j8);

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    AbstractC5298y1(Spliterator spliterator, AbstractC5168b abstractC5168b, int i7) {
        this.f18735a = spliterator;
        this.f18736b = abstractC5168b;
        this.f18737c = AbstractC5186e.m21547g(spliterator.estimateSize());
        this.f18738d = 0L;
        this.f18739e = i7;
    }

    AbstractC5298y1(AbstractC5298y1 abstractC5298y1, Spliterator spliterator, long j7, long j8, int i7) {
        super(abstractC5298y1);
        this.f18735a = spliterator;
        this.f18736b = abstractC5298y1.f18736b;
        this.f18737c = abstractC5298y1.f18737c;
        this.f18738d = j7;
        this.f18739e = j8;
        if (j7 < 0 || j8 < 0 || (j7 + j8) - 1 >= i7) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j7), Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i7)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18735a;
        AbstractC5298y1 abstractC5298y1 = this;
        while (spliterator.estimateSize() > abstractC5298y1.f18737c && (trySplit = spliterator.trySplit()) != null) {
            abstractC5298y1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC5298y1.mo21602b(trySplit, abstractC5298y1.f18738d, estimateSize).fork();
            abstractC5298y1 = abstractC5298y1.mo21602b(spliterator, abstractC5298y1.f18738d + estimateSize, abstractC5298y1.f18739e - estimateSize);
        }
        abstractC5298y1.f18736b.m21524V(spliterator, abstractC5298y1);
        abstractC5298y1.propagateCompletion();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        long j8 = this.f18739e;
        if (j7 > j8) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i7 = (int) this.f18738d;
        this.f18740f = i7;
        this.f18741g = i7 + ((int) j8);
    }
}
