package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzar(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        zzat zzatVar = this.zza;
        int i7 = this.zzb;
        str = zzatVar.zza;
        return i7 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        zzat zzatVar = this.zza;
        int i7 = this.zzb;
        str = zzatVar.zza;
        if (i7 >= str.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return new zzat(String.valueOf(i7));
    }
}
