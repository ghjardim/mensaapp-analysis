package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import p013B5.AbstractC0060d;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzdu extends AbstractC0060d {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzec zzecVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzc = zzecVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
