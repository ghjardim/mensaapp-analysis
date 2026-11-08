package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.w0 */
/* loaded from: classes3.dex */
abstract class AbstractC5287w0 implements InterfaceC5264r2 {

    /* renamed from: a */
    boolean f18716a;

    /* renamed from: b */
    boolean f18717b;

    @Override // p256j$.util.stream.InterfaceC5264r2
    public /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public /* synthetic */ void accept(int i7) {
        AbstractC5034A0.m21406k();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j7) {
        AbstractC5034A0.m21407l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final /* synthetic */ void mo21460l(long j7) {
    }

    AbstractC5287w0(EnumC5292x0 enumC5292x0) {
        boolean z6;
        z6 = enumC5292x0.f18727b;
        this.f18717b = !z6;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        return this.f18716a;
    }
}
