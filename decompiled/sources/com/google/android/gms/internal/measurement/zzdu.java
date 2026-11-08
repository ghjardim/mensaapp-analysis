package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p052H2.BinderC0553b;
import p108P2.AbstractC1815r3;

/* loaded from: classes.dex */
final class zzdu extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzff zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzff zzffVar, String str, String str2, Context context, Bundle bundle) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
        this.zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        boolean zzX;
        String str;
        String str2;
        String str3;
        zzcv zzcvVar;
        zzcv zzcvVar2;
        String str4;
        String str5;
        try {
            zzff zzffVar = this.zze;
            String str6 = this.zza;
            String str7 = this.zzb;
            zzX = zzffVar.zzX(str6, str7);
            if (zzX) {
                str5 = zzffVar.zzd;
                str2 = str6;
                str3 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Context context = this.zzc;
            AbstractC3802r.m15129k(context);
            zzffVar.zzj = zzffVar.zzf(context, true);
            zzcvVar = zzffVar.zzj;
            if (zzcvVar == null) {
                str4 = zzffVar.zzd;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int m15163a = DynamiteModule.m15163a(context, ModuleDescriptor.MODULE_ID);
            zzdh zzdhVar = new zzdh(119002L, Math.max(m15163a, r0), DynamiteModule.m15164c(context, ModuleDescriptor.MODULE_ID) < m15163a, str, str2, str3, this.zzd, AbstractC1815r3.m6270a(context));
            zzcvVar2 = zzffVar.zzj;
            ((zzcv) AbstractC3802r.m15129k(zzcvVar2)).initialize(BinderC0553b.m2138f(context), zzdhVar, this.zzh);
        } catch (Exception e7) {
            this.zze.zzU(e7, true, false);
        }
    }
}
