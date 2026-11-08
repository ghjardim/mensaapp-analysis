package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;

/* loaded from: classes.dex */
final class zzo extends zzx {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzae zzaeVar, AbstractC3648f abstractC3648f, String str) {
        super(abstractC3648f);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        ((zzh) ((zzaf) bVar).getService()).zzj(this.zzb, this.zza);
    }
}
