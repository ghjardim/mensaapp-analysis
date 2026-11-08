package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzamk implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzamh zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        Map map;
        int i8 = this.zza + 1;
        i7 = this.zzd.zzb;
        if (i8 >= i7) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i7;
        Object[] objArr;
        this.zzb = true;
        int i8 = this.zza + 1;
        this.zza = i8;
        i7 = this.zzd.zzb;
        if (i8 >= i7) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzd.zza;
        return (zzaml) objArr[this.zza];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        int i8 = this.zza;
        i7 = this.zzd.zzb;
        if (i8 >= i7) {
            zza().remove();
            return;
        }
        zzamh zzamhVar = this.zzd;
        int i9 = this.zza;
        this.zza = i9 - 1;
        zzamhVar.zzb(i9);
    }

    private zzamk(zzamh zzamhVar) {
        this.zzd = zzamhVar;
        this.zza = -1;
    }
}
