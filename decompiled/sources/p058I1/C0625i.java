package p058I1;

import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: I1.i */
/* loaded from: classes.dex */
public final class C0625i extends AbstractC0624h {

    /* renamed from: b */
    public final Object f2177b;

    /* renamed from: c */
    public final String f2178c;

    /* renamed from: d */
    public final EnumC0626j f2179d;

    /* renamed from: e */
    public final InterfaceC0623g f2180e;

    public C0625i(Object value, String tag, EnumC0626j verificationMode, InterfaceC0623g logger) {
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(tag, "tag");
        AbstractC5469l.m23028e(verificationMode, "verificationMode");
        AbstractC5469l.m23028e(logger, "logger");
        this.f2177b = value;
        this.f2178c = tag;
        this.f2179d = verificationMode;
        this.f2180e = logger;
    }

    @Override // p058I1.AbstractC0624h
    /* renamed from: a */
    public Object mo2518a() {
        return this.f2177b;
    }

    @Override // p058I1.AbstractC0624h
    /* renamed from: c */
    public AbstractC0624h mo2519c(String message, InterfaceC0800l condition) {
        AbstractC5469l.m23028e(message, "message");
        AbstractC5469l.m23028e(condition, "condition");
        return ((Boolean) condition.invoke(this.f2177b)).booleanValue() ? this : new C0622f(this.f2177b, this.f2178c, message, this.f2180e, this.f2179d);
    }
}
