package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import p122R2.InterfaceC2233e;

/* loaded from: classes.dex */
public final class zzad implements InterfaceC2233e.d {
    private Status zza;
    private boolean zzb;

    public zzad(Status status, boolean z6) {
        this.zza = status;
        this.zzb = z6;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.zza;
    }

    @Override // p122R2.InterfaceC2233e.d
    public final boolean isVerifyAppsEnabled() {
        Status status = this.zza;
        if (status == null || !status.m14799D0()) {
            return false;
        }
        return this.zzb;
    }

    public zzad() {
    }
}
