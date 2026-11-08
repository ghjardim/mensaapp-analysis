package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.firebase.auth.AbstractC3933b;

/* loaded from: classes.dex */
final class zzaem implements zzaen {
    private final /* synthetic */ String zza;

    public zzaem(zzaei zzaeiVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaen
    public final void zza(AbstractC3933b.b bVar, Object... objArr) {
        bVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
