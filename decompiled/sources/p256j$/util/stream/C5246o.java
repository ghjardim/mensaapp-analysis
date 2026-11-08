package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.o */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5246o implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5264r2 f18667a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f18667a.accept(d7);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }
}
