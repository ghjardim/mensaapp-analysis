package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.I3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5077I3 implements InterfaceC5264r2 {

    /* renamed from: a */
    public final /* synthetic */ int f18400a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f18401b;

    public /* synthetic */ C5077I3(Consumer consumer, int i7) {
        this.f18400a = i7;
        this.f18401b = consumer;
    }

    /* renamed from: b */
    private final /* synthetic */ void m21466b(long j7) {
    }

    /* renamed from: c */
    private final /* synthetic */ void m21467c(long j7) {
    }

    /* renamed from: d */
    private final /* synthetic */ void m21468d() {
    }

    /* renamed from: e */
    private final /* synthetic */ void m21469e() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        switch (this.f18400a) {
            case 0:
                AbstractC5034A0.m21394a();
                throw null;
            default:
                AbstractC5034A0.m21394a();
                throw null;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(int i7) {
        switch (this.f18400a) {
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
        switch (this.f18400a) {
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
    public final void m21477p(Object obj) {
        switch (this.f18400a) {
            case 0:
                ((C5172b3) this.f18401b).m21477p(obj);
                break;
            default:
                this.f18401b.m21477p(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18400a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
        int i7 = this.f18400a;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final /* synthetic */ void mo21460l(long j7) {
        int i7 = this.f18400a;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        switch (this.f18400a) {
        }
        return false;
    }
}
