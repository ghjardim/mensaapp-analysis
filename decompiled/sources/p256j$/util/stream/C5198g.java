package p256j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.stream.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5198g implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5204h f18600a;

    private /* synthetic */ C5198g(InterfaceC5204h interfaceC5204h) {
        this.f18600a = interfaceC5204h;
    }

    /* renamed from: k */
    public static /* synthetic */ BaseStream m21559k(InterfaceC5204h interfaceC5204h) {
        if (interfaceC5204h == null) {
            return null;
        }
        return interfaceC5204h instanceof C5192f ? ((C5192f) interfaceC5204h).f18572a : interfaceC5204h instanceof InterfaceC5053E ? C5048D.m21456k((InterfaceC5053E) interfaceC5204h) : interfaceC5204h instanceof InterfaceC5187e0 ? C5181d0.m21544k((InterfaceC5187e0) interfaceC5204h) : interfaceC5204h instanceof InterfaceC5252p0 ? C5247o0.m21584k((InterfaceC5252p0) interfaceC5204h) : interfaceC5204h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC5204h) : new C5198g(interfaceC5204h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18600a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5204h interfaceC5204h = this.f18600a;
        if (obj instanceof C5198g) {
            obj = ((C5198g) obj).f18600a;
        }
        return interfaceC5204h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18600a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f18600a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f18600a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m21559k(this.f18600a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return m21559k(this.f18600a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return m21559k(this.f18600a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f18600a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return m21559k(this.f18600a.unordered());
    }
}
