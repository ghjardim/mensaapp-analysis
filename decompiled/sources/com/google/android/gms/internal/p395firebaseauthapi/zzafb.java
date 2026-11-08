package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.firebase.auth.AbstractC3933b;
import p219e3.C4183m;
import p346t3.C6483O;

/* loaded from: classes.dex */
final class zzafb extends AbstractC3933b.b {
    private final /* synthetic */ AbstractC3933b.b zza;
    private final /* synthetic */ String zzb;

    public zzafb(AbstractC3933b.b bVar, String str) {
        this.zza = bVar;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzafc.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onCodeSent(String str, AbstractC3933b.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onVerificationCompleted(C6483O c6483o) {
        zzafc.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(c6483o);
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onVerificationFailed(C4183m c4183m) {
        zzafc.zza.remove(this.zzb);
        this.zza.onVerificationFailed(c4183m);
    }
}
