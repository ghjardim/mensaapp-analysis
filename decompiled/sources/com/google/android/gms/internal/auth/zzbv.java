package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzbv implements InterfaceC3729l {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) AbstractC3802r.m15129k(status);
        this.zzb = StringUtils.EMPTY;
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        this.zzb = (String) AbstractC3802r.m15129k(str);
        this.zza = Status.f12248f;
    }
}
