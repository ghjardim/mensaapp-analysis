package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import p122R2.C2235g;
import p122R2.InterfaceC2233e;

/* loaded from: classes.dex */
final class zzp implements InterfaceC2233e.b {
    private final Status zza;
    private final C2235g zzb;

    public zzp(Status status, C2235g c2235g) {
        this.zza = status;
        this.zzb = c2235g;
    }

    @Override // p122R2.InterfaceC2233e.b
    public final String getJwsResult() {
        C2235g c2235g = this.zzb;
        if (c2235g == null) {
            return null;
        }
        return c2235g.zza();
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.zza;
    }
}
