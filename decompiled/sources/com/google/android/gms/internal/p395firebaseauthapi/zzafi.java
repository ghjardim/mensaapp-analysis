package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.AbstractC3645c;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.tika.utils.StringUtils;
import p003A2.C0019a;

/* loaded from: classes.dex */
final class zzafi extends zzadp {
    private final String zza;
    private final /* synthetic */ zzafd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafi(zzafd zzafdVar, zzadp zzadpVar, String str) {
        super(zzadpVar);
        this.zzb = zzafdVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadp
    public final void zza(Status status) {
        C0019a c0019a;
        HashMap hashMap;
        c0019a = zzafd.zza;
        c0019a.m61c("SMS verification code request failed: " + AbstractC3645c.m14807a(status.m14803z0()) + StringUtils.SPACE + status.m14796A0(), new Object[0]);
        hashMap = this.zzb.zzd;
        zzafk zzafkVar = (zzafk) hashMap.get(this.zza);
        if (zzafkVar == null) {
            return;
        }
        Iterator<zzadp> it = zzafkVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzadp
    public final void zzb(String str) {
        C0019a c0019a;
        HashMap hashMap;
        c0019a = zzafd.zza;
        c0019a.m59a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzafk zzafkVar = (zzafk) hashMap.get(this.zza);
        if (zzafkVar == null) {
            return;
        }
        Iterator<zzadp> it = zzafkVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzafkVar.zzg = true;
        zzafkVar.zzd = str;
        if (zzafkVar.zza <= 0) {
            this.zzb.zze(this.zza);
        } else if (!zzafkVar.zzc) {
            this.zzb.zzd(this.zza);
        } else {
            if (zzae.zzc(zzafkVar.zze)) {
                return;
            }
            zzafd.zzb(this.zzb, this.zza);
        }
    }
}
