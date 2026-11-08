package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p272k4.C5410A;
import p272k4.C5413D;

/* loaded from: classes.dex */
public final class zzbb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.google.android.gms.internal.measurement.zzap] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.measurement.zzae] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.measurement.zzae] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String] */
    public static zzap zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        String str2;
        char c7;
        zzap zzapVar;
        double d7;
        String str3;
        double d8;
        double d9;
        zzae zzaeVar2;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c7 = 18;
                    break;
                }
                c7 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c7 = 0;
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c7 = 2;
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c7 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c7 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    str2 = "toString";
                    c7 = 3;
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c7 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c7 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c7 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c7 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c7 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c7 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c7 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c7 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c7 = 1;
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c7 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c7 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c7 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c7 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c7 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            default:
                str2 = "toString";
                c7 = 65535;
                break;
        }
        zzai zzaiVar = null;
        switch (c7) {
            case 0:
                zzapVar = (zzae) zzaeVar.zzd();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzap zzb = zzgVar.zzb((zzap) it.next());
                        if (zzb instanceof zzag) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int zzc = zzapVar.zzc();
                        if (zzb instanceof zzae) {
                            zzae zzaeVar3 = (zzae) zzb;
                            Iterator zzk = zzaeVar3.zzk();
                            while (zzk.hasNext()) {
                                Integer num = (Integer) zzk.next();
                                zzapVar.zzq(num.intValue() + zzc, zzaeVar3.zze(num.intValue()));
                            }
                        } else {
                            zzapVar.zzq(zzc, zzb);
                        }
                    }
                }
                return zzapVar;
            case 1:
                zzh.zzh("every", 1, list);
                zzap zzb2 = zzgVar.zzb((zzap) list.get(0));
                if (zzb2 instanceof zzao) {
                    return zzaeVar.zzc() == 0 ? zzap.zzk : zzb(zzaeVar, zzgVar, (zzao) zzb2, Boolean.FALSE, Boolean.TRUE).zzc() != zzaeVar.zzc() ? zzap.zzl : zzap.zzk;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                zzh.zzh("filter", 1, list);
                zzap zzb3 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb3 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzb() == 0) {
                    return new zzae();
                }
                zzae zzaeVar4 = (zzae) zzaeVar.zzd();
                zzae zzb4 = zzb(zzaeVar, zzgVar, (zzao) zzb3, null, Boolean.TRUE);
                zzapVar = new zzae();
                Iterator zzk2 = zzb4.zzk();
                while (zzk2.hasNext()) {
                    zzapVar.zzq(zzapVar.zzc(), zzaeVar4.zze(((Integer) zzk2.next()).intValue()));
                }
                return zzapVar;
            case 3:
                zzh.zzh("forEach", 1, list);
                zzap zzb5 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb5 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzb() == 0) {
                    return zzap.zzf;
                }
                zzb(zzaeVar, zzgVar, (zzao) zzb5, null, null);
                return zzap.zzf;
            case 4:
                zzh.zzj("indexOf", 2, list);
                zzap zzapVar2 = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVar2 = zzgVar.zzb((zzap) list.get(0));
                }
                if (list.size() > 1) {
                    d7 = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    if (d7 >= zzaeVar.zzc()) {
                        return new zzah(Double.valueOf(-1.0d));
                    }
                    if (d7 < 0.0d) {
                        d7 += zzaeVar.zzc();
                    }
                } else {
                    d7 = 0.0d;
                }
                Iterator zzk3 = zzaeVar.zzk();
                while (zzk3.hasNext()) {
                    int intValue = ((Integer) zzk3.next()).intValue();
                    double d10 = intValue;
                    if (d10 >= d7 && zzh.zzl(zzaeVar.zze(intValue), zzapVar2)) {
                        return new zzah(Double.valueOf(d10));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 5:
                zzh.zzj("join", 1, list);
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzm;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    zzap zzb6 = zzgVar.zzb((zzap) list.get(0));
                    str3 = ((zzb6 instanceof zzan) || (zzb6 instanceof zzau)) ? StringUtils.EMPTY : zzb6.zzi();
                }
                return new zzat(zzaeVar.zzj(str3));
            case 6:
                zzh.zzj("lastIndexOf", 2, list);
                zzap zzapVar3 = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVar3 = zzgVar.zzb((zzap) list.get(0));
                }
                int zzc2 = zzaeVar.zzc() - 1;
                if (list.size() > 1) {
                    zzap zzb7 = zzgVar.zzb((zzap) list.get(1));
                    d9 = Double.isNaN(zzb7.zzh().doubleValue()) ? zzaeVar.zzc() - 1 : zzh.zza(zzb7.zzh().doubleValue());
                    d8 = 0.0d;
                    if (d9 < 0.0d) {
                        d9 += zzaeVar.zzc();
                    }
                } else {
                    d8 = 0.0d;
                    d9 = zzc2;
                }
                if (d9 < d8) {
                    return new zzah(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min(zzaeVar.zzc(), d9); min >= 0; min--) {
                    if (zzaeVar.zzs(min) && zzh.zzl(zzaeVar.zze(min), zzapVar3)) {
                        return new zzah(Double.valueOf(min));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 7:
                zzh.zzh("map", 1, list);
                zzap zzb8 = zzgVar.zzb((zzap) list.get(0));
                if (zzb8 instanceof zzao) {
                    return zzaeVar.zzc() == 0 ? new zzae() : zzb(zzaeVar, zzgVar, (zzao) zzb8, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                zzh.zzh("pop", 0, list);
                int zzc3 = zzaeVar.zzc();
                if (zzc3 == 0) {
                    return zzap.zzf;
                }
                int i7 = zzc3 - 1;
                zzapVar = zzaeVar.zze(i7);
                zzaeVar.zzp(i7);
                return zzapVar;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaeVar.zzq(zzaeVar.zzc(), zzgVar.zzb((zzap) it2.next()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzc()));
            case '\n':
                return zzc(zzaeVar, zzgVar, list, true);
            case 11:
                return zzc(zzaeVar, zzgVar, list, false);
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                zzaeVar2 = zzaeVar;
                zzh.zzh("reverse", 0, list);
                int zzc4 = zzaeVar.zzc();
                if (zzc4 != 0) {
                    for (int i8 = 0; i8 < zzc4 / 2; i8++) {
                        if (zzaeVar2.zzs(i8)) {
                            zzap zze = zzaeVar2.zze(i8);
                            zzaeVar2.zzq(i8, null);
                            int i9 = (zzc4 - 1) - i8;
                            if (zzaeVar2.zzs(i9)) {
                                zzaeVar2.zzq(i8, zzaeVar2.zze(i9));
                            }
                            zzaeVar2.zzq(i9, zze);
                        }
                    }
                }
                return zzaeVar2;
            case '\r':
                zzh.zzh("shift", 0, list);
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzf;
                }
                zzap zze2 = zzaeVar.zze(0);
                zzaeVar.zzp(0);
                return zze2;
            case 14:
                zzh.zzj("slice", 2, list);
                if (list.isEmpty()) {
                    return zzaeVar.zzd();
                }
                double zzc5 = zzaeVar.zzc();
                double zza = zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                double max = zza < 0.0d ? Math.max(zza + zzc5, 0.0d) : Math.min(zza, zzc5);
                if (list.size() == 2) {
                    double zza2 = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    zzc5 = zza2 < 0.0d ? Math.max(zzc5 + zza2, 0.0d) : Math.min(zzc5, zza2);
                }
                zzae zzaeVar5 = new zzae();
                for (int i10 = (int) max; i10 < zzc5; i10++) {
                    zzaeVar5.zzq(zzaeVar5.zzc(), zzaeVar.zze(i10));
                }
                return zzaeVar5;
            case 15:
                zzh.zzh("some", 1, list);
                zzap zzb9 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb9 instanceof zzai)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzl;
                }
                zzai zzaiVar2 = (zzai) zzb9;
                Iterator zzk4 = zzaeVar.zzk();
                while (zzk4.hasNext()) {
                    int intValue2 = ((Integer) zzk4.next()).intValue();
                    if (zzaeVar.zzs(intValue2) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zze(intValue2), new zzah(Double.valueOf(intValue2)), zzaeVar)).zzg().booleanValue()) {
                        return zzap.zzk;
                    }
                }
                return zzap.zzl;
            case 16:
                zzaeVar2 = zzaeVar;
                zzh.zzj("sort", 1, list);
                if (zzaeVar.zzc() >= 2) {
                    List zzm = zzaeVar.zzm();
                    if (!list.isEmpty()) {
                        zzap zzb10 = zzgVar.zzb((zzap) list.get(0));
                        if (!(zzb10 instanceof zzai)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzaiVar = (zzai) zzb10;
                    }
                    Collections.sort(zzm, new zzba(zzaiVar, zzgVar));
                    zzaeVar.zzn();
                    Iterator it3 = zzm.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        zzaeVar2.zzq(i11, (zzap) it3.next());
                        i11++;
                    }
                }
                return zzaeVar2;
            case 17:
                if (list.isEmpty()) {
                    return new zzae();
                }
                int zza3 = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                if (zza3 < 0) {
                    zza3 = Math.max(0, zza3 + zzaeVar.zzc());
                } else if (zza3 > zzaeVar.zzc()) {
                    zza3 = zzaeVar.zzc();
                }
                int zzc6 = zzaeVar.zzc();
                zzae zzaeVar6 = new zzae();
                if (list.size() > 1) {
                    int max2 = Math.max(0, (int) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
                    if (max2 > 0) {
                        for (int i12 = zza3; i12 < Math.min(zzc6, zza3 + max2); i12++) {
                            zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(zza3));
                            zzaeVar.zzp(zza3);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i13 = 2; i13 < list.size(); i13++) {
                            zzap zzb11 = zzgVar.zzb((zzap) list.get(i13));
                            if (zzb11 instanceof zzag) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            zzaeVar.zzo((zza3 + i13) - 2, zzb11);
                        }
                    }
                } else {
                    while (zza3 < zzc6) {
                        zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(zza3));
                        zzaeVar.zzq(zza3, null);
                        zza3++;
                    }
                }
                return zzaeVar6;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                zzh.zzh(str2, 0, list);
                return new zzat(zzaeVar.zzj(","));
            case 19:
                if (!list.isEmpty()) {
                    zzae zzaeVar7 = new zzae();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        zzap zzb12 = zzgVar.zzb((zzap) it4.next());
                        if (zzb12 instanceof zzag) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzaeVar7.zzq(zzaeVar7.zzc(), zzb12);
                    }
                    int zzc7 = zzaeVar7.zzc();
                    Iterator zzk5 = zzaeVar.zzk();
                    while (zzk5.hasNext()) {
                        Integer num2 = (Integer) zzk5.next();
                        zzaeVar7.zzq(num2.intValue() + zzc7, zzaeVar.zze(num2.intValue()));
                    }
                    zzaeVar.zzn();
                    Iterator zzk6 = zzaeVar7.zzk();
                    while (zzk6.hasNext()) {
                        Integer num3 = (Integer) zzk6.next();
                        zzaeVar.zzq(num3.intValue(), zzaeVar7.zze(num3.intValue()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzc()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzae zzb(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator zzk = zzaeVar.zzk();
        while (zzk.hasNext()) {
            int intValue = ((Integer) zzk.next()).intValue();
            if (zzaeVar.zzs(intValue)) {
                zzap zza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zze(intValue), new zzah(Double.valueOf(intValue)), zzaeVar));
                if (zza.zzg().equals(bool)) {
                    break;
                }
                if (bool2 == null || zza.zzg().equals(bool2)) {
                    zzaeVar2.zzq(intValue, zza);
                }
            }
        }
        return zzaeVar2;
    }

    private static zzap zzc(zzae zzaeVar, zzg zzgVar, List list, boolean z6) {
        zzap zzapVar;
        zzh.zzi("reduce", 1, list);
        zzh.zzj("reduce", 2, list);
        zzap zzb = zzgVar.zzb((zzap) list.get(0));
        if (!(zzb instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzapVar = zzgVar.zzb((zzap) list.get(1));
            if (zzapVar instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.zzc() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzapVar = null;
        }
        zzai zzaiVar = (zzai) zzb;
        int zzc = zzaeVar.zzc();
        int i7 = z6 ? 0 : zzc - 1;
        int i8 = z6 ? zzc - 1 : 0;
        int i9 = true == z6 ? 1 : -1;
        if (zzapVar == null) {
            zzapVar = zzaeVar.zze(i7);
            i7 += i9;
        }
        while ((i8 - i7) * i9 >= 0) {
            if (zzaeVar.zzs(i7)) {
                zzapVar = zzaiVar.zza(zzgVar, Arrays.asList(zzapVar, zzaeVar.zze(i7), new zzah(Double.valueOf(i7)), zzaeVar));
                if (zzapVar instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i7 += i9;
            } else {
                i7 += i9;
            }
        }
        return zzapVar;
    }
}
