package com.google.android.gms.internal.safetynet;

import android.text.TextUtils;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;

/* loaded from: classes.dex */
final class zzi extends zzr {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(AbstractC3648f abstractC3648f, byte[] bArr, String str) {
        super(abstractC3648f);
        this.zza = bArr;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        zzaf zzafVar = (zzaf) bVar;
        zzg zzgVar = this.zzc;
        byte[] bArr = this.zza;
        String str = this.zzb;
        if (TextUtils.isEmpty(str)) {
            str = zzafVar.zzp("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((zzh) zzafVar.getService()).zzc(zzgVar, bArr, str);
    }
}
