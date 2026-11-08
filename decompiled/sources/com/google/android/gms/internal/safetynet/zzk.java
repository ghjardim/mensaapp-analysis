package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class zzk extends zzz {
    final /* synthetic */ int[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(AbstractC3648f abstractC3648f, int[] iArr, int i7, String str, String str2) {
        super(abstractC3648f);
        this.zza = iArr;
        this.zzb = i7;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        zzaf zzafVar = (zzaf) bVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.zza) {
            arrayList.add(Integer.valueOf(i7));
        }
        zzafVar.zzq(this.zze, arrayList, this.zzb, this.zzc, this.zzd);
    }
}
