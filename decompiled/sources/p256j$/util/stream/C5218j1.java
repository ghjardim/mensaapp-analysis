package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.j1 */
/* loaded from: classes3.dex */
final class C5218j1 extends C5212i1 implements InterfaceC5044C0 {
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
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
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

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    @Override // p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC5094M0 mo21444a() {
        mo21444a();
        return this;
    }

    @Override // p256j$.util.stream.InterfaceC5044C0, p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final InterfaceC5074I0 mo21444a() {
        int i7 = this.f18629b;
        int[] iArr = this.f18628a;
        if (i7 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18629b), Integer.valueOf(iArr.length)));
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        int[] iArr = this.f18628a;
        if (j7 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j7), Integer.valueOf(iArr.length)));
        }
        this.f18629b = 0;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        int i8 = this.f18629b;
        int[] iArr = this.f18628a;
        if (i8 < iArr.length) {
            this.f18629b = 1 + i8;
            iArr[i8] = i7;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int i7 = this.f18629b;
        int[] iArr = this.f18628a;
        if (i7 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18629b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // p256j$.util.stream.C5212i1
    public final String toString() {
        int[] iArr = this.f18628a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f18629b), Arrays.toString(iArr));
    }
}
