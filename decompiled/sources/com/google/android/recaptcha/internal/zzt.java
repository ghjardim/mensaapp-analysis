package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzt extends AbstractC0060d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzv zzvVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzb = zzvVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh(null, this);
        return zzh == AbstractC0024c.m76e() ? zzh : C6927j.m28372a(zzh);
    }
}
