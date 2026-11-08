package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import p122R2.C2240l;

/* loaded from: classes.dex */
final class zzab implements InterfaceC3729l {
    private final Status zza;
    private final C2240l zzb;

    public zzab(Status status, C2240l c2240l) {
        this.zza = status;
        this.zzb = c2240l;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.zza;
    }

    public final String getTokenResult() {
        C2240l c2240l = this.zzb;
        if (c2240l == null) {
            return null;
        }
        return c2240l.zza();
    }
}
