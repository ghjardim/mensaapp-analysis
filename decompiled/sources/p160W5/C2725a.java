package p160W5;

import java.util.concurrent.CancellationException;

/* renamed from: W5.a */
/* loaded from: classes2.dex */
public final class C2725a extends CancellationException {

    /* renamed from: a */
    public final transient Object f8046a;

    public C2725a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f8046a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
