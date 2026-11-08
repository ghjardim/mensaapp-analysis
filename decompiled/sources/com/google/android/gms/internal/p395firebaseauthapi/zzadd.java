package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC3933b;
import p346t3.C6486S;

/* loaded from: classes.dex */
final class zzadd extends zzaeg<Void, AbstractC3933b.b> {
    private final zzzq zzu;

    public zzadd(C6486S c6486s, String str, String str2, long j7, boolean z6, boolean z7, String str3, String str4, String str5, boolean z8) {
        super(8);
        AbstractC3802r.m15129k(c6486s);
        AbstractC3802r.m15123e(str);
        this.zzu = new zzzq(c6486s, str, str2, j7, z6, z7, str3, str4, str5, z8);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
