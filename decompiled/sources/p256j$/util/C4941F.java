package p256j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.F */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4941F implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f18143a;

    public /* synthetic */ C4941F(Consumer consumer) {
        this.f18143a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f18143a.accept(Double.valueOf(d7));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }
}
