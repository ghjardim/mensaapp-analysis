package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Objects;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.m2 */
/* loaded from: classes3.dex */
public abstract class AbstractC5237m2 implements InterfaceC5259q2 {

    /* renamed from: a */
    protected final InterfaceC5264r2 f18656a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo21458j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5259q2
    /* renamed from: j */
    public final /* synthetic */ void mo21458j(Long l7) {
        AbstractC5034A0.m21404i(this, l7);
    }

    public AbstractC5237m2(InterfaceC5264r2 interfaceC5264r2) {
        this.f18656a = (InterfaceC5264r2) Objects.requireNonNull(interfaceC5264r2);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public void mo21460l(long j7) {
        this.f18656a.mo21460l(j7);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public void mo21459k() {
        this.f18656a.mo21459k();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public boolean mo21455n() {
        return this.f18656a.mo21455n();
    }
}
