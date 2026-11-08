package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.C3643a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzku extends zzkq implements RandomAccess, zzmj, zzno {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzku(zArr, 0, false);
    }

    public zzku() {
        this(zza, 0, true);
    }

    private static int zzg(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i7) {
        return "Index:" + i7 + ", Size:" + this.zzc;
    }

    private final void zzi(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzcE();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
        int i9 = i7 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i8 < length) {
            System.arraycopy(zArr, i7, zArr, i9, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i7);
            System.arraycopy(this.zzb, i7, zArr2, i9, this.zzc - i7);
            this.zzb = zArr2;
        }
        this.zzb[i7] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.zzb;
        collection.getClass();
        if (!(collection instanceof zzku)) {
            return super.addAll(collection);
        }
        zzku zzkuVar = (zzku) collection;
        int i7 = zzkuVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (C3643a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.zzb;
        if (i9 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(zzkuVar.zzb, 0, this.zzb, this.zzc, zzkuVar.zzc);
        this.zzc = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzku)) {
            return super.equals(obj);
        }
        zzku zzkuVar = (zzku) obj;
        if (this.zzc != zzkuVar.zzc) {
            return false;
        }
        boolean[] zArr = zzkuVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzi(i7);
        return Boolean.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + zzmk.zza(this.zzb[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzc;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzb[i8] == booleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzcE();
        zzi(i7);
        boolean[] zArr = this.zzb;
        boolean z6 = zArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zzcE();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i8, zArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzcE();
        zzi(i7);
        boolean[] zArr = this.zzb;
        boolean z6 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmj zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzku(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z6) {
        zzcE();
        int i7 = this.zzc;
        int length = this.zzb.length;
        if (i7 == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        zArr2[i8] = z6;
    }

    public final boolean zzf(int i7) {
        zzi(i7);
        return this.zzb[i7];
    }

    private zzku(boolean[] zArr, int i7, boolean z6) {
        super(z6);
        this.zzb = zArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
