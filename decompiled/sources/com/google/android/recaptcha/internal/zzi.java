package com.google.android.recaptcha.internal;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzi extends AbstractC0060d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzlVar, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        this.zzb = zzlVar;
    }

    @Override // p013B5.AbstractC0057a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzc = this.zzb.zzc(0L, null, null, this);
        return zzc == AbstractC0024c.m76e() ? zzc : C6927j.m28372a(zzc);
    }
}
