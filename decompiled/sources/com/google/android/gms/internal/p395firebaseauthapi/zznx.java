package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zznx {
    private ArrayList<zznw> zza = new ArrayList<>();
    private zznr zzb = zznr.zza;
    private Integer zzc = null;

    public final zznx zza(zzbq zzbqVar, int i7, String str, String str2) {
        ArrayList<zznw> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zznw(zzbqVar, i7, str, str2));
        return this;
    }

    public final zznx zza(zznr zznrVar) {
        if (this.zza != null) {
            this.zzb = zznrVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zznx zza(int i7) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i7);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zznu zza() {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList<zznw> arrayList = this.zza;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    zznw zznwVar = arrayList.get(i7);
                    i7++;
                    if (zznwVar.zza() == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zznu zznuVar = new zznu(this.zzb, DesugarCollections.unmodifiableList(this.zza), this.zzc);
            this.zza = null;
            return zznuVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
