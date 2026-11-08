package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzak implements InterfaceC3729l {
    private final Status zza;

    public zzak(Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.zza;
    }
}
