package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class zzkq extends AbstractList implements zzmj {
    private boolean zza;

    public zzkq(boolean z6) {
        this.zza = z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        zzcE();
        super.add(i7, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        zzcE();
        return super.addAll(i7, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzcE();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!get(i7).equals(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = (i7 * 31) + get(i8).hashCode();
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        zzcE();
        return super.remove(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        zzcE();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        zzcE();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        zzcE();
        return super.set(i7, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final boolean zzc() {
        return this.zza;
    }

    public final void zzcE() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        zzcE();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        zzcE();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzcE();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
