package p256j$.util.stream;

import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.U */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5132U implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5264r2 f18499a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f18499a.accept(i7);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }
}
