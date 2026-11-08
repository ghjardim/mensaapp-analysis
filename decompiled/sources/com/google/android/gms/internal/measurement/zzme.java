package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.C3643a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzme extends zzkq implements RandomAccess, zzmh, zzno {
    private static final int[] zza;
    private static final zzme zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzme(iArr, 0, false);
    }

    public zzme() {
        this(zza, 0, true);
    }

    public static zzme zzf() {
        return zzb;
    }

    private static int zzj(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i7) {
        return "Index:" + i7 + ", Size:" + this.zzd;
    }

    private final void zzl(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        zzcE();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
        int i9 = i7 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i8 < length) {
            System.arraycopy(iArr, i7, iArr, i9, i8 - i7);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i7);
            System.arraycopy(this.zzc, i7, iArr2, i9, this.zzd - i7);
            this.zzc = iArr2;
        }
        this.zzc[i7] = intValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.zzb;
        collection.getClass();
        if (!(collection instanceof zzme)) {
            return super.addAll(collection);
        }
        zzme zzmeVar = (zzme) collection;
        int i7 = zzmeVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzd;
        if (C3643a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.zzc;
        if (i9 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(zzmeVar.zzc, 0, this.zzc, this.zzd, zzmeVar.zzd);
        this.zzd = i9;
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
        if (!(obj instanceof zzme)) {
            return super.equals(obj);
        }
        zzme zzmeVar = (zzme) obj;
        if (this.zzd != zzmeVar.zzd) {
            return false;
        }
        int[] iArr = zzmeVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzl(i7);
        return Integer.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzd; i8++) {
            i7 = (i7 * 31) + this.zzc[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.zzd;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzc[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzcE();
        zzl(i7);
        int[] iArr = this.zzc;
        int i8 = iArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zzcE();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i8, iArr, i7, this.zzd - i8);
        this.zzd -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzcE();
        zzl(i7);
        int[] iArr = this.zzc;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zze(int i7) {
        zzl(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzmh zzd(int i7) {
        if (i7 >= this.zzd) {
            return new zzme(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i7) {
        zzcE();
        int i8 = this.zzd;
        int length = this.zzc.length;
        if (i8 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i9 = this.zzd;
        this.zzd = i9 + 1;
        iArr2[i9] = i7;
    }

    public final void zzi(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzme(int[] iArr, int i7, boolean z6) {
        super(z6);
        this.zzc = iArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
