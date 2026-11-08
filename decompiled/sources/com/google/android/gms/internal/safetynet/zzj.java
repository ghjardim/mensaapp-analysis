package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import java.util.List;

/* loaded from: classes.dex */
final class zzj extends zzz {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zzae zzaeVar, AbstractC3648f abstractC3648f, List list, String str, String str2) {
        super(abstractC3648f);
        this.zza = list;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        ((zzaf) bVar).zzq(this.zze, this.zza, 1, this.zzb, null);
    }
}
