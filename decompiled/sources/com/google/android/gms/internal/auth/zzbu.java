package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import p329r2.C6290c;

/* loaded from: classes.dex */
final class zzbu implements InterfaceC3729l {
    private final Status zza;
    private C6290c zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final C6290c getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(C6290c c6290c) {
        this.zzb = c6290c;
        this.zza = Status.f12248f;
    }
}
