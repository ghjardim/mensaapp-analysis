package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class zzll implements zzor {
    private final zzlk zza;

    private zzll(zzlk zzlkVar) {
        byte[] bArr = zzmk.zzb;
        this.zza = zzlkVar;
        zzlkVar.zza = this;
    }

    public static zzll zza(zzlk zzlkVar) {
        zzll zzllVar = zzlkVar.zza;
        return zzllVar != null ? zzllVar : new zzll(zzlkVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzA(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzmw)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).longValue();
                i9 += 8;
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z6) {
            while (i8 < zzmwVar.size()) {
                this.zza.zzh(i7, zzmwVar.zza(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmwVar.size(); i12++) {
            zzmwVar.zza(i12);
            i11 += 8;
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmwVar.size()) {
            zzlkVar2.zzi(zzmwVar.zza(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzB(int i7, int i8) {
        this.zza.zzs(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzC(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzme)) {
            if (!z6) {
                while (i8 < list.size()) {
                    zzlk zzlkVar = this.zza;
                    int intValue = ((Integer) list.get(i8)).intValue();
                    zzlkVar.zzs(i7, (intValue >> 31) ^ (intValue + intValue));
                    i8++;
                }
                return;
            }
            zzlk zzlkVar2 = this.zza;
            zzlkVar2.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += zzlk.zzz((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzlkVar2.zzt(i9);
            while (i8 < list.size()) {
                int intValue3 = ((Integer) list.get(i8)).intValue();
                zzlkVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i8++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z6) {
            while (i8 < zzmeVar.size()) {
                zzlk zzlkVar3 = this.zza;
                int zze = zzmeVar.zze(i8);
                zzlkVar3.zzs(i7, (zze >> 31) ^ (zze + zze));
                i8++;
            }
            return;
        }
        zzlk zzlkVar4 = this.zza;
        zzlkVar4.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmeVar.size(); i12++) {
            int zze2 = zzmeVar.zze(i12);
            i11 += zzlk.zzz((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzlkVar4.zzt(i11);
        while (i8 < zzmeVar.size()) {
            int zze3 = zzmeVar.zze(i8);
            zzlkVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzD(int i7, long j7) {
        this.zza.zzu(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzE(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzmw)) {
            if (!z6) {
                while (i8 < list.size()) {
                    zzlk zzlkVar = this.zza;
                    long longValue = ((Long) list.get(i8)).longValue();
                    zzlkVar.zzu(i7, (longValue >> 63) ^ (longValue + longValue));
                    i8++;
                }
                return;
            }
            zzlk zzlkVar2 = this.zza;
            zzlkVar2.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue2 = ((Long) list.get(i10)).longValue();
                i9 += zzlk.zzA((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzlkVar2.zzt(i9);
            while (i8 < list.size()) {
                long longValue3 = ((Long) list.get(i8)).longValue();
                zzlkVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i8++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z6) {
            while (i8 < zzmwVar.size()) {
                zzlk zzlkVar3 = this.zza;
                long zza = zzmwVar.zza(i8);
                zzlkVar3.zzu(i7, (zza >> 63) ^ (zza + zza));
                i8++;
            }
            return;
        }
        zzlk zzlkVar4 = this.zza;
        zzlkVar4.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmwVar.size(); i12++) {
            long zza2 = zzmwVar.zza(i12);
            i11 += zzlk.zzA((zza2 >> 63) ^ (zza2 + zza2));
        }
        zzlkVar4.zzt(i11);
        while (i8 < zzmwVar.size()) {
            long zza3 = zzmwVar.zza(i8);
            zzlkVar4.zzv((zza3 >> 63) ^ (zza3 + zza3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    @Deprecated
    public final void zzF(int i7) {
        this.zza.zzr(i7, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzG(int i7, String str) {
        this.zza.zzp(i7, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzH(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zzmt)) {
            while (i8 < list.size()) {
                this.zza.zzp(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zzmt zzmtVar = (zzmt) list;
        while (i8 < list.size()) {
            Object zzc = zzmtVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i7, (String) zzc);
            } else {
                this.zza.zze(i7, (zzld) zzc);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzI(int i7, int i8) {
        this.zza.zzs(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzJ(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzme)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzs(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzlk.zzz(((Integer) list.get(i10)).intValue());
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzt(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z6) {
            while (i8 < zzmeVar.size()) {
                this.zza.zzs(i7, zzmeVar.zze(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmeVar.size(); i12++) {
            i11 += zzlk.zzz(zzmeVar.zze(i12));
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmeVar.size()) {
            zzlkVar2.zzt(zzmeVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzK(int i7, long j7) {
        this.zza.zzu(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzL(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzmw)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzlk.zzA(((Long) list.get(i10)).longValue());
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z6) {
            while (i8 < zzmwVar.size()) {
                this.zza.zzu(i7, zzmwVar.zza(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmwVar.size(); i12++) {
            i11 += zzlk.zzA(zzmwVar.zza(i12));
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmwVar.size()) {
            zzlkVar2.zzv(zzmwVar.zza(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzb(int i7, boolean z6) {
        this.zza.zzd(i7, z6);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzc(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzku)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzd(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).booleanValue();
                i9++;
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzb(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        zzku zzkuVar = (zzku) list;
        if (!z6) {
            while (i8 < zzkuVar.size()) {
                this.zza.zzd(i7, zzkuVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzkuVar.size(); i12++) {
            zzkuVar.zzf(i12);
            i11++;
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzkuVar.size()) {
            zzlkVar2.zzb(zzkuVar.zzf(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzd(int i7, zzld zzldVar) {
        this.zza.zze(i7, zzldVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zze(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zze(i7, (zzld) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzf(int i7, double d7) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzg(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzlm)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).doubleValue();
                i9 += 8;
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z6) {
            while (i8 < zzlmVar.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(zzlmVar.zze(i8)));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzlmVar.size(); i12++) {
            zzlmVar.zze(i12);
            i11 += 8;
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzlmVar.size()) {
            zzlkVar2.zzi(Double.doubleToRawLongBits(zzlmVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzr(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzi(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzj(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzme)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzlk.zzA(((Integer) list.get(i10)).intValue());
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z6) {
            while (i8 < zzmeVar.size()) {
                this.zza.zzj(i7, zzmeVar.zze(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmeVar.size(); i12++) {
            i11 += zzlk.zzA(zzmeVar.zze(i12));
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmeVar.size()) {
            zzlkVar2.zzk(zzmeVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzk(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzl(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzme)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).intValue();
                i9 += 4;
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z6) {
            while (i8 < zzmeVar.size()) {
                this.zza.zzf(i7, zzmeVar.zze(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmeVar.size(); i12++) {
            zzmeVar.zze(i12);
            i11 += 4;
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmeVar.size()) {
            zzlkVar2.zzg(zzmeVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzm(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzn(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzmw)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).longValue();
                i9 += 8;
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z6) {
            while (i8 < zzmwVar.size()) {
                this.zza.zzh(i7, zzmwVar.zza(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmwVar.size(); i12++) {
            zzmwVar.zza(i12);
            i11 += 8;
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmwVar.size()) {
            zzlkVar2.zzi(zzmwVar.zza(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzo(int i7, float f7) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzp(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzlw)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).floatValue();
                i9 += 4;
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzg(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        zzlw zzlwVar = (zzlw) list;
        if (!z6) {
            while (i8 < zzlwVar.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(zzlwVar.zze(i8)));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzlwVar.size(); i12++) {
            zzlwVar.zze(i12);
            i11 += 4;
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzlwVar.size()) {
            zzlkVar2.zzg(Float.floatToRawIntBits(zzlwVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzq(int i7, Object obj, zzns zznsVar) {
        zzlk zzlkVar = this.zza;
        zzlkVar.zzr(i7, 3);
        zznsVar.zzi((zznh) obj, zzlkVar.zza);
        zzlkVar.zzr(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzr(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzs(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzme)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzlk.zzA(((Integer) list.get(i10)).intValue());
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z6) {
            while (i8 < zzmeVar.size()) {
                this.zza.zzj(i7, zzmeVar.zze(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmeVar.size(); i12++) {
            i11 += zzlk.zzA(zzmeVar.zze(i12));
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmeVar.size()) {
            zzlkVar2.zzk(zzmeVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzt(int i7, long j7) {
        this.zza.zzu(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzu(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzmw)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzlk.zzA(((Long) list.get(i10)).longValue());
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z6) {
            while (i8 < zzmwVar.size()) {
                this.zza.zzu(i7, zzmwVar.zza(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmwVar.size(); i12++) {
            i11 += zzlk.zzA(zzmwVar.zza(i12));
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmwVar.size()) {
            zzlkVar2.zzv(zzmwVar.zza(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzv(int i7, Object obj, zzns zznsVar) {
        this.zza.zzm(i7, (zznh) obj, zznsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zzld) {
            this.zza.zzo(i7, (zzld) obj);
        } else {
            this.zza.zzn(i7, (zznh) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzx(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzy(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof zzme)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).intValue();
                i9 += 4;
            }
            zzlkVar.zzt(i9);
            while (i8 < list.size()) {
                zzlkVar.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z6) {
            while (i8 < zzmeVar.size()) {
                this.zza.zzf(i7, zzmeVar.zze(i8));
                i8++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmeVar.size(); i12++) {
            zzmeVar.zze(i12);
            i11 += 4;
        }
        zzlkVar2.zzt(i11);
        while (i8 < zzmeVar.size()) {
            zzlkVar2.zzg(zzmeVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzz(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }
}
