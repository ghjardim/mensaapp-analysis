package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.s1 */
/* loaded from: classes3.dex */
final class C5268s1 extends C5263r1 implements InterfaceC5049D0 {
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

    @Override // p256j$.util.stream.InterfaceC5049D0, p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final InterfaceC5084K0 mo21444a() {
        int i7 = this.f18690b;
        long[] jArr = this.f18689a;
        if (i7 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18690b), Integer.valueOf(jArr.length)));
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        long[] jArr = this.f18689a;
        if (j7 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j7), Integer.valueOf(jArr.length)));
        }
        this.f18690b = 0;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        int i7 = this.f18690b;
        long[] jArr = this.f18689a;
        if (i7 < jArr.length) {
            this.f18690b = 1 + i7;
            jArr[i7] = j7;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int i7 = this.f18690b;
        long[] jArr = this.f18689a;
        if (i7 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18690b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // p256j$.util.stream.C5263r1
    public final String toString() {
        long[] jArr = this.f18689a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f18690b), Arrays.toString(jArr));
    }
}
