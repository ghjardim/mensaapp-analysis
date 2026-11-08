package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzcx extends AbstractC0060d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzb = zzdcVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo29483executegIAlus = this.zzb.mo29483executegIAlus(null, this);
        return mo29483executegIAlus == AbstractC0024c.m76e() ? mo29483executegIAlus : C6927j.m28372a(mo29483executegIAlus);
    }
}
