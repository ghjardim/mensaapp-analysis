package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, p286m2.InterfaceC5570d
    public final void zzc(boolean z6) {
        this.zza.setResult((zzag) new zzak(z6 ? Status.f12248f : zzal.zza));
    }
}
