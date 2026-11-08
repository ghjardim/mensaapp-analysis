package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.a1 */
/* loaded from: classes3.dex */
final class C5164a1 extends C5158Z0 implements InterfaceC5039B0 {
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
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21462p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    @Override // p256j$.util.stream.InterfaceC5249o2
    /* renamed from: p */
    public final /* synthetic */ void mo21462p(Double d7) {
        AbstractC5034A0.m21399e(this, d7);
    }

    @Override // p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC5094M0 mo21444a() {
        mo21444a();
        return this;
    }

    @Override // p256j$.util.stream.InterfaceC5039B0, p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final InterfaceC5064G0 mo21444a() {
        int i7 = this.f18522b;
        double[] dArr = this.f18521a;
        if (i7 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18522b), Integer.valueOf(dArr.length)));
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        double[] dArr = this.f18521a;
        if (j7 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j7), Integer.valueOf(dArr.length)));
        }
        this.f18522b = 0;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        int i7 = this.f18522b;
        double[] dArr = this.f18521a;
        if (i7 < dArr.length) {
            this.f18522b = 1 + i7;
            dArr[i7] = d7;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int i7 = this.f18522b;
        double[] dArr = this.f18521a;
        if (i7 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18522b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // p256j$.util.stream.C5158Z0
    public final String toString() {
        double[] dArr = this.f18521a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f18522b), Arrays.toString(dArr));
    }
}
