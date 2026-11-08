package p256j$.util.stream;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p256j$.util.C5008g0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5192f implements InterfaceC5204h {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f18572a;

    private /* synthetic */ C5192f(BaseStream baseStream) {
        this.f18572a = baseStream;
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC5204h m21551k(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C5198g ? ((C5198g) baseStream).f18600a : baseStream instanceof DoubleStream ? C5043C.m21454k((DoubleStream) baseStream) : baseStream instanceof IntStream ? C5175c0.m21542k((IntStream) baseStream) : baseStream instanceof LongStream ? C5241n0.m21583k((LongStream) baseStream) : baseStream instanceof Stream ? C5178c3.m21543k((Stream) baseStream) : new C5192f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18572a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f18572a;
        if (obj instanceof C5192f) {
            obj = ((C5192f) obj).f18572a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18572a.hashCode();
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ boolean isParallel() {
        return this.f18572a.isParallel();
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ Iterator iterator() {
        return this.f18572a.iterator();
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h onClose(Runnable runnable) {
        return m21551k(this.f18572a.onClose(runnable));
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h parallel() {
        return m21551k(this.f18572a.parallel());
    }

    @Override // p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* synthetic */ InterfaceC5204h sequential() {
        return m21551k(this.f18572a.sequential());
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ Spliterator spliterator() {
        return C5008g0.m21366a(this.f18572a.spliterator());
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final /* synthetic */ InterfaceC5204h unordered() {
        return m21551k(this.f18572a.unordered());
    }
}
