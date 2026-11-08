package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.internal.AbstractC3802r;
import p329r2.C6289b;
import p329r2.InterfaceC6288a;

/* loaded from: classes.dex */
public final class zzbt implements InterfaceC6288a {
    public final AbstractC3650h getSpatulaHeader(AbstractC3648f abstractC3648f) {
        AbstractC3802r.m15129k(abstractC3648f);
        return abstractC3648f.mo14816b(new zzbs(this, abstractC3648f));
    }

    public final AbstractC3650h performProxyRequest(AbstractC3648f abstractC3648f, C6289b c6289b) {
        AbstractC3802r.m15129k(abstractC3648f);
        AbstractC3802r.m15129k(c6289b);
        return abstractC3648f.mo14816b(new zzbq(this, abstractC3648f, c6289b));
    }
}
