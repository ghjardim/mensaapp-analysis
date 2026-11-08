package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.r3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5265r3 implements InterfaceC5254p2 {

    /* renamed from: a */
    public final /* synthetic */ int f18691a;

    /* renamed from: b */
    public final /* synthetic */ IntConsumer f18692b;

    public /* synthetic */ C5265r3(IntConsumer intConsumer, int i7) {
        this.f18691a = i7;
        this.f18692b = intConsumer;
    }

    /* renamed from: b */
    private final /* synthetic */ void m21594b(long j7) {
    }

    /* renamed from: c */
    private final /* synthetic */ void m21595c(long j7) {
    }

    /* renamed from: d */
    private final /* synthetic */ void m21596d() {
    }

    /* renamed from: e */
    private final /* synthetic */ void m21597e() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        switch (this.f18691a) {
            case 0:
                AbstractC5034A0.m21394a();
                throw null;
            default:
                AbstractC5034A0.m21394a();
                throw null;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5254p2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        switch (this.f18691a) {
            case 0:
                ((C5145W2) this.f18692b).accept(i7);
                break;
            default:
                this.f18692b.accept(i7);
                break;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j7) {
        switch (this.f18691a) {
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
        switch (this.f18691a) {
            case 0:
                mo21487m((Integer) obj);
                break;
            default:
                mo21487m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18691a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f18691a) {
        }
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
        int i7 = this.f18691a;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final /* synthetic */ void mo21460l(long j7) {
        int i7 = this.f18691a;
    }

    @Override // p256j$.util.stream.InterfaceC5254p2
    /* renamed from: m */
    public final /* synthetic */ void mo21487m(Integer num) {
        switch (this.f18691a) {
            case 0:
                AbstractC5034A0.m21402g(this, num);
                break;
            default:
                AbstractC5034A0.m21402g(this, num);
                break;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        switch (this.f18691a) {
        }
        return false;
    }
}
