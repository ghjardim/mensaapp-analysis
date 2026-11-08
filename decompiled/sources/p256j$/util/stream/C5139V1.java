package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.C4940E;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.V1 */
/* loaded from: classes3.dex */
final class C5139V1 implements InterfaceC5144W1, InterfaceC5259q2 {

    /* renamed from: a */
    private boolean f18506a;

    /* renamed from: b */
    private long f18507b;

    /* renamed from: c */
    final /* synthetic */ LongBinaryOperator f18508c;

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
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
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

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    C5139V1(LongBinaryOperator longBinaryOperator) {
        this.f18508c = longBinaryOperator;
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        C5139V1 c5139v1 = (C5139V1) interfaceC5144W1;
        if (c5139v1.f18506a) {
            return;
        }
        accept(c5139v1.f18507b);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18506a = true;
        this.f18507b = 0L;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        if (this.f18506a) {
            this.f18506a = false;
            this.f18507b = j7;
        } else {
            this.f18507b = this.f18508c.applyAsLong(this.f18507b, j7);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18506a ? C4940E.m21267a() : C4940E.m21268d(this.f18507b);
    }
}
