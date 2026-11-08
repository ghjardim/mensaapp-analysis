package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzc extends AbstractC0060d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzc = zzeVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze = this.zzc.zze(0L, null, this);
        return zze == AbstractC0024c.m76e() ? zze : C6927j.m28372a(zze);
    }
}
