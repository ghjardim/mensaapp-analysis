package com.google.android.recaptcha.internal;

import p013B5.AbstractC0060d;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzdd extends AbstractC0060d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdt zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdd(zzdt zzdtVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzb = zzdtVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzl(null, 0L, this);
    }
}
