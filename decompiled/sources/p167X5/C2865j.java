package p167X5;

import p392z5.InterfaceC7161i;

/* renamed from: X5.j */
/* loaded from: classes2.dex */
public final class C2865j extends RuntimeException {

    /* renamed from: a */
    public final transient InterfaceC7161i f8833a;

    public C2865j(InterfaceC7161i interfaceC7161i) {
        this.f8833a = interfaceC7161i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f8833a.toString();
    }
}
