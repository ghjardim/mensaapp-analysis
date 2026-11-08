package p206c6;

import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.k */
/* loaded from: classes2.dex */
public abstract class AbstractC3623k implements InterfaceC3609V {

    /* renamed from: a */
    public final InterfaceC3609V f12144a;

    public AbstractC3623k(InterfaceC3609V delegate) {
        AbstractC5469l.m23028e(delegate, "delegate");
        this.f12144a = delegate;
    }

    @Override // p206c6.InterfaceC3609V
    /* renamed from: P */
    public long mo14512P(C3616d sink, long j7) {
        AbstractC5469l.m23028e(sink, "sink");
        return this.f12144a.mo14512P(sink, j7);
    }

    @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f12144a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f12144a + ')';
    }
}
