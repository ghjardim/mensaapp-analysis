package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.Spliterator;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.Q */
/* loaded from: classes3.dex */
abstract class AbstractC5113Q implements InterfaceC5092L3, InterfaceC5097M3 {

    /* renamed from: a */
    private final boolean f18451a;

    public /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
        throw null;
    }

    public /* synthetic */ void accept(int i7) {
        AbstractC5034A0.m21406k();
        throw null;
    }

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

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    protected AbstractC5113Q(boolean z6) {
        this.f18451a = z6;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: d */
    public final int mo21424d() {
        if (this.f18451a) {
            return 0;
        }
        return EnumC5196f3.f18590r;
    }

    /* renamed from: e */
    public final void m21490e(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        if (this.f18451a) {
            new C5122S(abstractC5168b, spliterator, this).invoke();
        } else {
            new C5127T(abstractC5168b, spliterator, abstractC5168b.m21525W(this)).invoke();
        }
    }
}
