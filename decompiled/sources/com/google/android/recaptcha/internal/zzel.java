package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0789a;

/* loaded from: classes.dex */
public final class zzel extends AbstractC5470m implements InterfaceC0789a {
    public static final zzel zza = new zzel();

    public zzel() {
        super(0);
    }

    @Override // p069J5.InterfaceC0789a
    public final Object invoke() {
        int i7 = zzav.zza;
        Object zzb = zzau.zza().zzb(zzaz.class.getName().hashCode());
        if (zzb != null) {
            return (zzaz) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
