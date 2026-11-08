package com.google.android.recaptcha.internal;

import p013B5.AbstractC0060d;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzdv extends AbstractC0060d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzec zzecVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzb = zzecVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        Object zzl;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzl = this.zzb.zzl(null, this);
        return zzl;
    }
}
