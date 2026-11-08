package p256j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.J */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4945J implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f18146a;

    public /* synthetic */ C4945J(Consumer consumer) {
        this.f18146a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f18146a.accept(Integer.valueOf(i7));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }
}
