package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzld implements Iterable, Serializable {
    public static final zzld zzb = new zzlb(zzmk.zzb);
    private int zza = 0;

    static {
        int i7 = zzkr.zza;
    }

    public static int zzh(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public static zzld zzj(byte[] bArr, int i7, int i8) {
        zzh(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new zzlb(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zza;
        if (i7 == 0) {
            int zzd = zzd();
            i7 = zze(zzd, 0, zzd);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zza = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkw(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzoc.zza(this) : zzoc.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i7);

    public abstract byte zzb(int i7);

    public abstract int zzd();

    public abstract int zze(int i7, int i8, int i9);

    public abstract zzld zzf(int i7, int i8);

    public abstract void zzg(zzkv zzkvVar);

    public final int zzi() {
        return this.zza;
    }
}
