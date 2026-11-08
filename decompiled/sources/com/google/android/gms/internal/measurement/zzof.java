package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzof {
    private static final zzof zza = new zzof(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzof(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z6;
    }

    public static zzof zzc() {
        return zza;
    }

    public static zzof zze(zzof zzofVar, zzof zzofVar2) {
        int i7 = zzofVar.zzb + zzofVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzofVar.zzc, i7);
        System.arraycopy(zzofVar2.zzc, 0, copyOf, zzofVar.zzb, zzofVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzofVar.zzd, i7);
        System.arraycopy(zzofVar2.zzd, 0, copyOf2, zzofVar.zzb, zzofVar2.zzb);
        return new zzof(i7, copyOf, copyOf2, true);
    }

    public static zzof zzf() {
        return new zzof(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i7) {
        int[] iArr = this.zzc;
        if (i7 > iArr.length) {
            int i8 = this.zzb;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i7);
            this.zzd = Arrays.copyOf(this.zzd, i7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzof)) {
            return false;
        }
        zzof zzofVar = (zzof) obj;
        int i7 = this.zzb;
        if (i7 == zzofVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzofVar.zzc;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzofVar.zzd;
                    int i9 = this.zzb;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        int i8 = i7 + 527;
        int[] iArr = this.zzc;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i8 * 31) + i10) * 31;
        Object[] objArr = this.zzd;
        int i13 = this.zzb;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    public final int zza() {
        int zzz;
        int zzA;
        int i7;
        int i8 = this.zze;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).longValue();
                    i7 = zzlk.zzz(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    zzld zzldVar = (zzld) this.zzd[i10];
                    int zzz2 = zzlk.zzz(i14);
                    int zzd = zzldVar.zzd();
                    i7 = zzz2 + zzlk.zzz(zzd) + zzd;
                } else if (i13 == 3) {
                    int zzz3 = zzlk.zzz(i12 << 3);
                    zzz = zzz3 + zzz3;
                    zzA = ((zzof) this.zzd[i10]).zza();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new zzml("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i10]).intValue();
                    i7 = zzlk.zzz(i12 << 3) + 4;
                }
                i9 += i7;
            } else {
                int i15 = i12 << 3;
                long longValue = ((Long) this.zzd[i10]).longValue();
                zzz = zzlk.zzz(i15);
                zzA = zzlk.zzA(longValue);
            }
            i7 = zzz + zzA;
            i9 += i7;
        }
        this.zze = i9;
        return i9;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            int i10 = this.zzc[i9] >>> 3;
            zzld zzldVar = (zzld) this.zzd[i9];
            int zzz = zzlk.zzz(8);
            int zzz2 = zzlk.zzz(16) + zzlk.zzz(i10);
            int zzz3 = zzlk.zzz(24);
            int zzd = zzldVar.zzd();
            i8 += zzz + zzz + zzz2 + zzz3 + zzlk.zzz(zzd) + zzd;
        }
        this.zze = i8;
        return i8;
    }

    public final zzof zzd(zzof zzofVar) {
        if (zzofVar.equals(zza)) {
            return this;
        }
        zzg();
        int i7 = this.zzb + zzofVar.zzb;
        zzm(i7);
        System.arraycopy(zzofVar.zzc, 0, this.zzc, this.zzb, zzofVar.zzb);
        System.arraycopy(zzofVar.zzd, 0, this.zzd, this.zzb, zzofVar.zzb);
        this.zzb = i7;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zznj.zzb(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    public final void zzj(int i7, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i8 = this.zzb;
        iArr[i8] = i7;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    public final void zzk(zzor zzorVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zzorVar.zzw(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzl(zzor zzorVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i8 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    zzorVar.zzt(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    zzorVar.zzm(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    zzorVar.zzd(i10, (zzld) obj);
                } else if (i9 == 3) {
                    zzorVar.zzF(i10);
                    ((zzof) obj).zzl(zzorVar);
                    zzorVar.zzh(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new zzml("Protocol message tag had invalid wire type."));
                    }
                    zzorVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzof() {
        this(0, new int[8], new Object[8], true);
    }
}
