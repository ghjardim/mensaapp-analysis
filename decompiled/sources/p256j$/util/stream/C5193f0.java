package p256j$.util.stream;

import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.f0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5193f0 implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5264r2 f18573a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18573a.accept(j7);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }
}
