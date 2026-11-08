package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import p346t3.AbstractC6508h;

/* loaded from: classes.dex */
public final class zzaeq<ResultT, CallbackT> implements zzaeh<ResultT> {
    private final zzaeg<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzaeq(zzaeg<ResultT, CallbackT> zzaegVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzaegVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeh
    public final void zza(ResultT resultt, Status status) {
        AbstractC3802r.m15130l(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzaeg<ResultT, CallbackT> zzaegVar = this.zza;
        if (zzaegVar.zzq != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaegVar.zzc);
            zzaeg<ResultT, CallbackT> zzaegVar2 = this.zza;
            taskCompletionSource.setException(zzadr.zza(firebaseAuth, zzaegVar2.zzq, ("reauthenticateWithCredential".equals(zzaegVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        AbstractC6508h abstractC6508h = zzaegVar.zzn;
        if (abstractC6508h != null) {
            this.zzb.setException(zzadr.zza(status, abstractC6508h, zzaegVar.zzo, zzaegVar.zzp));
        } else {
            this.zzb.setException(zzadr.zza(status));
        }
    }
}
