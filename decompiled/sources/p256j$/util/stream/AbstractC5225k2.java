package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Objects;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.k2 */
/* loaded from: classes3.dex */
public abstract class AbstractC5225k2 implements InterfaceC5249o2 {

    /* renamed from: a */
    protected final InterfaceC5264r2 f18641a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo21462p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5249o2
    /* renamed from: p */
    public final /* synthetic */ void mo21462p(Double d7) {
        AbstractC5034A0.m21399e(this, d7);
    }

    public AbstractC5225k2(InterfaceC5264r2 interfaceC5264r2) {
        this.f18641a = (InterfaceC5264r2) Objects.requireNonNull(interfaceC5264r2);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public void mo21460l(long j7) {
        this.f18641a.mo21460l(j7);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public void mo21459k() {
        this.f18641a.mo21459k();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public boolean mo21455n() {
        return this.f18641a.mo21455n();
    }
}
