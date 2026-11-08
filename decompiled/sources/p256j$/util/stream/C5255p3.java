package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.p3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5255p3 implements InterfaceC5249o2 {

    /* renamed from: a */
    public final /* synthetic */ int f18674a;

    /* renamed from: b */
    public final /* synthetic */ DoubleConsumer f18675b;

    public /* synthetic */ C5255p3(DoubleConsumer doubleConsumer, int i7) {
        this.f18674a = i7;
        this.f18675b = doubleConsumer;
    }

    /* renamed from: b */
    private final /* synthetic */ void m21586b(long j7) {
    }

    /* renamed from: c */
    private final /* synthetic */ void m21587c(long j7) {
    }

    /* renamed from: d */
    private final /* synthetic */ void m21588d() {
    }

    /* renamed from: e */
    private final /* synthetic */ void m21589e() {
    }

    @Override // p256j$.util.stream.InterfaceC5249o2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        switch (this.f18674a) {
            case 0:
                ((C5135U2) this.f18675b).accept(d7);
                break;
            default:
                this.f18675b.accept(d7);
                break;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(int i7) {
        switch (this.f18674a) {
            case 0:
                AbstractC5034A0.m21406k();
                throw null;
            default:
                AbstractC5034A0.m21406k();
                throw null;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j7) {
        switch (this.f18674a) {
            case 0:
                AbstractC5034A0.m21407l();
                throw null;
            default:
                AbstractC5034A0.m21407l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        switch (this.f18674a) {
            case 0:
                mo21462p((Double) obj);
                break;
            default:
                mo21462p((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18674a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f18674a) {
        }
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
        int i7 = this.f18674a;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final /* synthetic */ void mo21460l(long j7) {
        int i7 = this.f18674a;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        switch (this.f18674a) {
        }
        return false;
    }

    @Override // p256j$.util.stream.InterfaceC5249o2
    /* renamed from: p */
    public final /* synthetic */ void mo21462p(Double d7) {
        switch (this.f18674a) {
            case 0:
                AbstractC5034A0.m21399e(this, d7);
                break;
            default:
                AbstractC5034A0.m21399e(this, d7);
                break;
        }
    }
}
