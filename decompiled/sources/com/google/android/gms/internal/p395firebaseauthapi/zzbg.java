package com.google.android.gms.internal.p395firebaseauthapi;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class zzbg implements zzbz {
    private final OutputStream zza;

    private zzbg(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzbz zza(OutputStream outputStream) {
        return new zzbg(outputStream);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbz
    public final void zza(zzuz zzuzVar) {
        try {
            ((zzuz) ((zzakg) zzuzVar.zzn().zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbz
    public final void zza(zzwl zzwlVar) {
        try {
            zzwlVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
