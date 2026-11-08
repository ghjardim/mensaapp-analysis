package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2348Q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j7, InterfaceC7157e interfaceC7157e) {
        return zzcv.zzh(zza(application), str, j7, null, null, null, interfaceC7157e, 28, null);
    }

    public static final Task zzc(Application application, String str, long j7) {
        InterfaceC2348Q m8126b;
        m8126b = AbstractC2388k.m8126b(zza(application).zzd().zza(), null, null, new zzco(application, str, j7, null), 3, null);
        return zzas.zza(m8126b);
    }

    public static final Object zzd(Application application, String str, InterfaceC7157e interfaceC7157e) {
        Object zzh;
        zzh = zzcv.zzh(r0, str, 0L, null, zza(application).zzf, zzch.zzb, interfaceC7157e, 2, null);
        return zzh;
    }

    public static final Task zze(Application application, String str) {
        InterfaceC2348Q m8126b;
        m8126b = AbstractC2388k.m8126b(zza(application).zzd().zza(), null, null, new zzcp(application, str, null), 3, null);
        return zzas.zza(m8126b);
    }
}
