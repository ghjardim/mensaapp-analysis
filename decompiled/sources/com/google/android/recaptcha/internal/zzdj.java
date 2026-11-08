package com.google.android.recaptcha.internal;

import p013B5.AbstractC0060d;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzdj extends AbstractC0060d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdt zzdtVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzc = zzdtVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object zzv;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzv = this.zzc.zzv(null, 0L, this);
        return zzv;
    }
}
