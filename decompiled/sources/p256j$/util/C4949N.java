package p256j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.N */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4949N implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f18149a;

    public /* synthetic */ C4949N(Consumer consumer) {
        this.f18149a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18149a.accept(Long.valueOf(j7));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }
}
