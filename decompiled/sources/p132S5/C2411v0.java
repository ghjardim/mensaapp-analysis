package p132S5;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: S5.v0 */
/* loaded from: classes2.dex */
public final class C2411v0 extends CancellationException {

    /* renamed from: a */
    public final transient InterfaceC2409u0 f7159a;

    public C2411v0(String str, Throwable th, InterfaceC2409u0 interfaceC2409u0) {
        super(str);
        this.f7159a = interfaceC2409u0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2411v0) {
                C2411v0 c2411v0 = (C2411v0) obj;
                if (!AbstractC5469l.m23024a(c2411v0.getMessage(), getMessage()) || !AbstractC5469l.m23024a(c2411v0.f7159a, this.f7159a) || !AbstractC5469l.m23024a(c2411v0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        AbstractC5469l.m23025b(message);
        int hashCode = ((message.hashCode() * 31) + this.f7159a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f7159a;
    }
}
