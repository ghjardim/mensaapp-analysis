package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.AbstractMap;
import p256j$.util.Objects;

/* loaded from: classes.dex */
final class zzaw extends zzaj {
    private final /* synthetic */ zzat zza;

    public zzaw(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i7) {
        int i8;
        Object[] objArr;
        Object[] objArr2;
        i8 = this.zza.zzc;
        zzw.zza(i7, i8);
        objArr = this.zza.zzb;
        int i9 = i7 * 2;
        Object obj = objArr[i9];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.zzb;
        Object obj2 = objArr2[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i7;
        i7 = this.zza.zzc;
        return i7;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzai
    public final boolean zze() {
        return true;
    }
}
