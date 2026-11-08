package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.h1 */
/* loaded from: classes3.dex */
final class C5206h1 extends C5109P0 implements InterfaceC5054E0 {
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

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j7) {
        AbstractC5034A0.m21407l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    @Override // p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final InterfaceC5094M0 mo21444a() {
        int i7 = this.f18444b;
        Object[] objArr = this.f18443a;
        if (i7 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18444b), Integer.valueOf(objArr.length)));
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        Object[] objArr = this.f18443a;
        if (j7 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j7), Integer.valueOf(objArr.length)));
        }
        this.f18444b = 0;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m21477p(Object obj) {
        int i7 = this.f18444b;
        Object[] objArr = this.f18443a;
        if (i7 < objArr.length) {
            this.f18444b = 1 + i7;
            objArr[i7] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
        int i7 = this.f18444b;
        Object[] objArr = this.f18443a;
        if (i7 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18444b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // p256j$.util.stream.C5109P0
    public final String toString() {
        Object[] objArr = this.f18443a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f18444b), Arrays.toString(objArr));
    }
}
