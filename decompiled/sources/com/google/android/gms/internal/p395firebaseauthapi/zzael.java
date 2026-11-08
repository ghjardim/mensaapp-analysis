package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AbstractC3933b;

/* loaded from: classes.dex */
final class zzael implements zzaen {
    private final /* synthetic */ Status zza;

    public zzael(zzaei zzaeiVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaen
    public final void zza(AbstractC3933b.b bVar, Object... objArr) {
        bVar.onVerificationFailed(zzadr.zza(this.zza));
    }
}
