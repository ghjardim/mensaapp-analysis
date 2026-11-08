package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0789a;

/* loaded from: classes.dex */
public final class zziv extends AbstractC5470m implements InterfaceC0789a {
    public static final zziv zza = new zziv();

    public zziv() {
        super(0);
    }

    @Override // p069J5.InterfaceC0789a
    public final Object invoke() {
        int i7 = zzav.zza;
        Object zzb = zzau.zza().zzb(zzff.class.getName().hashCode());
        if (zzb != null) {
            return (zzff) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
