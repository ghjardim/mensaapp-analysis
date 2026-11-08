package com.google.android.recaptcha;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends AbstractC0060d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzb = recaptcha;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m29481getClientBWLJW6A = this.zzb.m29481getClientBWLJW6A(null, null, 0L, this);
        return m29481getClientBWLJW6A == AbstractC0024c.m76e() ? m29481getClientBWLJW6A : C6927j.m28372a(m29481getClientBWLJW6A);
    }
}
