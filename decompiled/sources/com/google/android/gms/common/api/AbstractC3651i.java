package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C3706o;
import com.google.android.gms.common.api.internal.C3718u;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: com.google.android.gms.common.api.i */
/* loaded from: classes.dex */
public abstract class AbstractC3651i {
    /* renamed from: a */
    public static AbstractC3650h m14821a(InterfaceC3729l interfaceC3729l, AbstractC3648f abstractC3648f) {
        AbstractC3802r.m15130l(interfaceC3729l, "Result must not be null");
        AbstractC3802r.m15120b(!interfaceC3729l.getStatus().m14799D0(), "Status code must not be SUCCESS");
        C3737t c3737t = new C3737t(abstractC3648f, interfaceC3729l);
        c3737t.setResult(interfaceC3729l);
        return c3737t;
    }

    /* renamed from: b */
    public static AbstractC3649g m14822b(InterfaceC3729l interfaceC3729l, AbstractC3648f abstractC3648f) {
        AbstractC3802r.m15130l(interfaceC3729l, "Result must not be null");
        C3738u c3738u = new C3738u(abstractC3648f);
        c3738u.setResult(interfaceC3729l);
        return new C3706o(c3738u);
    }

    /* renamed from: c */
    public static AbstractC3650h m14823c(Status status, AbstractC3648f abstractC3648f) {
        AbstractC3802r.m15130l(status, "Result must not be null");
        C3718u c3718u = new C3718u(abstractC3648f);
        c3718u.setResult(status);
        return c3718u;
    }
}
