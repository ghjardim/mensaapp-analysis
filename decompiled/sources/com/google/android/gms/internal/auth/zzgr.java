package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgr implements Iterator {
    final /* synthetic */ zzgv zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i7 = this.zzb + 1;
        list = this.zza.zzb;
        if (i7 < list.size()) {
            return true;
        }
        map = this.zza.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i7 = this.zzb + 1;
        this.zzb = i7;
        list = this.zza.zzb;
        if (i7 >= list.size()) {
            return (Map.Entry) zza().next();
        }
        list2 = this.zza.zzb;
        return (Map.Entry) list2.get(this.zzb);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzn();
        int i7 = this.zzb;
        list = this.zza.zzb;
        if (i7 >= list.size()) {
            zza().remove();
            return;
        }
        zzgv zzgvVar = this.zza;
        int i8 = this.zzb;
        this.zzb = i8 - 1;
        zzgvVar.zzl(i8);
    }
}
