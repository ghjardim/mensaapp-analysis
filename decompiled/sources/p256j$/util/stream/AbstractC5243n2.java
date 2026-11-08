package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.Objects;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.n2 */
/* loaded from: classes3.dex */
public abstract class AbstractC5243n2 implements InterfaceC5264r2 {

    /* renamed from: a */
    protected final InterfaceC5264r2 f18663a;

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(int i7) {
        AbstractC5034A0.m21406k();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j7) {
        AbstractC5034A0.m21407l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public AbstractC5243n2(InterfaceC5264r2 interfaceC5264r2) {
        this.f18663a = (InterfaceC5264r2) Objects.requireNonNull(interfaceC5264r2);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public void mo21460l(long j7) {
        this.f18663a.mo21460l(j7);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public void mo21459k() {
        this.f18663a.mo21459k();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public boolean mo21455n() {
        return this.f18663a.mo21455n();
    }
}
