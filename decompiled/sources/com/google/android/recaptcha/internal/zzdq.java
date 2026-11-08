package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0789a;

/* loaded from: classes.dex */
public final class zzdq extends AbstractC5470m implements InterfaceC0789a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // p069J5.InterfaceC0789a
    public final Object invoke() {
        int i7 = zzav.zza;
        Object zzb = zzau.zza().zzb(Application.class.getName().hashCode());
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
