package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.t3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5275t3 implements InterfaceC5259q2 {

    /* renamed from: a */
    public final /* synthetic */ int f18704a;

    /* renamed from: b */
    public final /* synthetic */ LongConsumer f18705b;

    public /* synthetic */ C5275t3(LongConsumer longConsumer, int i7) {
        this.f18704a = i7;
        this.f18705b = longConsumer;
    }

    /* renamed from: b */
    private final /* synthetic */ void m21598b(long j7) {
    }

    /* renamed from: c */
    private final /* synthetic */ void m21599c(long j7) {
    }

    /* renamed from: d */
    private final /* synthetic */ void m21600d() {
    }

    /* renamed from: e */
    private final /* synthetic */ void m21601e() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        switch (this.f18704a) {
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
        switch (this.f18704a) {
            case 0:
                AbstractC5034A0.m21406k();
                throw null;
            default:
                AbstractC5034A0.m21406k();
                throw null;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        switch (this.f18704a) {
            case 0:
                ((C5155Y2) this.f18705b).accept(j7);
                break;
            default:
                this.f18705b.accept(j7);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        switch (this.f18704a) {
            case 0:
                mo21458j((Long) obj);
                break;
            default:
                mo21458j((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18704a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f18704a) {
        }
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5259q2
    /* renamed from: j */
    public final /* synthetic */ void mo21458j(Long l7) {
        switch (this.f18704a) {
            case 0:
                AbstractC5034A0.m21404i(this, l7);
                break;
            default:
                AbstractC5034A0.m21404i(this, l7);
                break;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
        int i7 = this.f18704a;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final /* synthetic */ void mo21460l(long j7) {
        int i7 = this.f18704a;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        switch (this.f18704a) {
        }
        return false;
    }
}
