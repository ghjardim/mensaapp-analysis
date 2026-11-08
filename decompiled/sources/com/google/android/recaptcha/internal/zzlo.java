package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
final class zzlo implements zzpy {
    private final zzln zza;

    private zzlo(zzln zzlnVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzlnVar;
        zzlnVar.zza = this;
    }

    public static zzlo zza(zzln zzlnVar) {
        zzlo zzloVar = zzlnVar.zza;
        return zzloVar != null ? zzloVar : new zzlo(zzlnVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzA(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).longValue();
                i9 += 8;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z6) {
            while (i8 < zznxVar.size()) {
                this.zza.zzh(i7, zznxVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznxVar.size(); i12++) {
            zznxVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i8 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzB(int i7, int i8) {
        this.zza.zzs(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzC(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z6) {
                while (i8 < list.size()) {
                    zzln zzlnVar = this.zza;
                    int intValue = ((Integer) list.get(i8)).intValue();
                    zzlnVar.zzs(i7, (intValue >> 31) ^ (intValue + intValue));
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += zzln.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                zzln zzlnVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i8)).intValue();
                zzlnVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z6) {
            while (i8 < zzneVar.size()) {
                zzln zzlnVar3 = this.zza;
                int zze = zzneVar.zze(i8);
                zzlnVar3.zzs(i7, (zze >> 31) ^ (zze + zze));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzneVar.size(); i12++) {
            int zze2 = zzneVar.zze(i12);
            i11 += zzln.zzA((zze2 >> 31) ^ (zze2 + zze2));
        }
        this.zza.zzt(i11);
        while (i8 < zzneVar.size()) {
            zzln zzlnVar4 = this.zza;
            int zze3 = zzneVar.zze(i8);
            zzlnVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzD(int i7, long j7) {
        this.zza.zzu(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzE(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z6) {
                while (i8 < list.size()) {
                    zzln zzlnVar = this.zza;
                    long longValue = ((Long) list.get(i8)).longValue();
                    zzlnVar.zzu(i7, (longValue >> 63) ^ (longValue + longValue));
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue2 = ((Long) list.get(i10)).longValue();
                i9 += zzln.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                zzln zzlnVar2 = this.zza;
                long longValue3 = ((Long) list.get(i8)).longValue();
                zzlnVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z6) {
            while (i8 < zznxVar.size()) {
                zzln zzlnVar3 = this.zza;
                long zze = zznxVar.zze(i8);
                zzlnVar3.zzu(i7, (zze >> 63) ^ (zze + zze));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznxVar.size(); i12++) {
            long zze2 = zznxVar.zze(i12);
            i11 += zzln.zzB((zze2 >> 63) ^ (zze2 + zze2));
        }
        this.zza.zzt(i11);
        while (i8 < zznxVar.size()) {
            zzln zzlnVar4 = this.zza;
            long zze3 = zznxVar.zze(i8);
            zzlnVar4.zzv((zze3 >> 63) ^ (zze3 + zze3));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzF(int i7) {
        this.zza.zzr(i7, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzG(int i7, String str) {
        this.zza.zzp(i7, str);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzH(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zznu)) {
            while (i8 < list.size()) {
                this.zza.zzp(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zznu zznuVar = (zznu) list;
        while (i8 < list.size()) {
            Object zzc = zznuVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i7, (String) zzc);
            } else {
                this.zza.zze(i7, (zzle) zzc);
            }
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzI(int i7, int i8) {
        this.zza.zzs(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzJ(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzs(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzln.zzA(((Integer) list.get(i10)).intValue());
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzt(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z6) {
            while (i8 < zzneVar.size()) {
                this.zza.zzs(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzneVar.size(); i12++) {
            i11 += zzln.zzA(zzneVar.zze(i12));
        }
        this.zza.zzt(i11);
        while (i8 < zzneVar.size()) {
            this.zza.zzt(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzK(int i7, long j7) {
        this.zza.zzu(i7, j7);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzL(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzln.zzB(((Long) list.get(i10)).longValue());
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z6) {
            while (i8 < zznxVar.size()) {
                this.zza.zzu(i7, zznxVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznxVar.size(); i12++) {
            i11 += zzln.zzB(zznxVar.zze(i12));
        }
        this.zza.zzt(i11);
        while (i8 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzb(int i7, boolean z6) {
        this.zza.zzd(i7, z6);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzc(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzkv)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzd(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).booleanValue();
                i9++;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        zzkv zzkvVar = (zzkv) list;
        if (!z6) {
            while (i8 < zzkvVar.size()) {
                this.zza.zzd(i7, zzkvVar.zzf(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzkvVar.size(); i12++) {
            zzkvVar.zzf(i12);
            i11++;
        }
        this.zza.zzt(i11);
        while (i8 < zzkvVar.size()) {
            this.zza.zzb(zzkvVar.zzf(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzd(int i7, zzle zzleVar) {
        this.zza.zze(i7, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zze(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zze(i7, (zzle) list.get(i8));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzf(int i7, double d7) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzg(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzmi)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).doubleValue();
                i9 += 8;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        zzmi zzmiVar = (zzmi) list;
        if (!z6) {
            while (i8 < zzmiVar.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(zzmiVar.zze(i8)));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmiVar.size(); i12++) {
            zzmiVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i8 < zzmiVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzmiVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzr(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzi(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzj(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzln.zzB(((Integer) list.get(i10)).intValue());
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z6) {
            while (i8 < zzneVar.size()) {
                this.zza.zzj(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzneVar.size(); i12++) {
            i11 += zzln.zzB(zzneVar.zze(i12));
        }
        this.zza.zzt(i11);
        while (i8 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzk(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzl(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).intValue();
                i9 += 4;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z6) {
            while (i8 < zzneVar.size()) {
                this.zza.zzf(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzneVar.size(); i12++) {
            zzneVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i8 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzm(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzn(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).longValue();
                i9 += 8;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z6) {
            while (i8 < zznxVar.size()) {
                this.zza.zzh(i7, zznxVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznxVar.size(); i12++) {
            zznxVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i8 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzo(int i7, float f7) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzp(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzmv)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).floatValue();
                i9 += 4;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        zzmv zzmvVar = (zzmv) list;
        if (!z6) {
            while (i8 < zzmvVar.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(zzmvVar.zze(i8)));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmvVar.size(); i12++) {
            zzmvVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i8 < zzmvVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzmvVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzq(int i7, Object obj, zzow zzowVar) {
        zzln zzlnVar = this.zza;
        zzlnVar.zzr(i7, 3);
        zzowVar.zzj((zzoi) obj, zzlnVar.zza);
        zzlnVar.zzr(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzr(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzs(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzln.zzB(((Integer) list.get(i10)).intValue());
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z6) {
            while (i8 < zzneVar.size()) {
                this.zza.zzj(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzneVar.size(); i12++) {
            i11 += zzln.zzB(zzneVar.zze(i12));
        }
        this.zza.zzt(i11);
        while (i8 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzt(int i7, long j7) {
        this.zza.zzu(i7, j7);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzu(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzln.zzB(((Long) list.get(i10)).longValue());
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z6) {
            while (i8 < zznxVar.size()) {
                this.zza.zzu(i7, zznxVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznxVar.size(); i12++) {
            i11 += zzln.zzB(zznxVar.zze(i12));
        }
        this.zza.zzt(i11);
        while (i8 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzv(int i7, Object obj, zzow zzowVar) {
        this.zza.zzm(i7, (zzoi) obj, zzowVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zzle) {
            this.zza.zzo(i7, (zzle) obj);
        } else {
            this.zza.zzn(i7, (zzoi) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzx(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzy(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).intValue();
                i9 += 4;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z6) {
            while (i8 < zzneVar.size()) {
                this.zza.zzf(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzneVar.size(); i12++) {
            zzneVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i8 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzz(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }
}
