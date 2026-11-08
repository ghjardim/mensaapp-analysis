package com.google.android.recaptcha.internal;

import p013B5.AbstractC0060d;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzdw extends AbstractC0060d {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzec zzecVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzc = zzecVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object zzm;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzm = this.zzc.zzm(0L, this);
        return zzm;
    }
}
