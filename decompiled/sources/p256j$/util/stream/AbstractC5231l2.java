package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Objects;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.l2 */
/* loaded from: classes3.dex */
public abstract class AbstractC5231l2 implements InterfaceC5254p2 {

    /* renamed from: a */
    protected final InterfaceC5264r2 f18649a;

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j7) {
        AbstractC5034A0.m21407l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo21487m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5254p2
    /* renamed from: m */
    public final /* synthetic */ void mo21487m(Integer num) {
        AbstractC5034A0.m21402g(this, num);
    }

    public AbstractC5231l2(InterfaceC5264r2 interfaceC5264r2) {
        this.f18649a = (InterfaceC5264r2) Objects.requireNonNull(interfaceC5264r2);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public void mo21460l(long j7) {
        this.f18649a.mo21460l(j7);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public void mo21459k() {
        this.f18649a.mo21459k();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public boolean mo21455n() {
        return this.f18649a.mo21455n();
    }
}
