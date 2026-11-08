package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class zznu {
    public static final /* synthetic */ int zza = 0;
    private static final zzoe zzb;

    static {
        int i7 = zznp.zza;
        zzb = new zzog();
    }

    public static void zzA(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzC(i7, list, z6);
    }

    public static void zzB(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzE(i7, list, z6);
    }

    public static void zzC(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzJ(i7, list, z6);
    }

    public static void zzD(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzL(i7, list, z6);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzme) {
            zzme zzmeVar = (zzme) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzA(zzmeVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzA(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzb(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlk.zzz(i7 << 3) + 4);
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlk.zzz(i7 << 3) + 8);
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzme) {
            zzme zzmeVar = (zzme) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzA(zzmeVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzA(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzg(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmw) {
            zzmw zzmwVar = (zzmw) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzA(zzmwVar.zza(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzA(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzh(int i7, Object obj, zzns zznsVar) {
        int i8 = i7 << 3;
        if (!(obj instanceof zzms)) {
            return zzlk.zzz(i8) + zzlk.zzx((zznh) obj, zznsVar);
        }
        int zzz = zzlk.zzz(i8);
        int zza2 = ((zzms) obj).zza();
        return zzz + zzlk.zzz(zza2) + zza2;
    }

    public static int zzi(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzme) {
            zzme zzmeVar = (zzme) list;
            i7 = 0;
            while (i8 < size) {
                int zze = zzmeVar.zze(i8);
                i7 += zzlk.zzz((zze >> 31) ^ (zze + zze));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                int intValue = ((Integer) list.get(i8)).intValue();
                i7 += zzlk.zzz((intValue >> 31) ^ (intValue + intValue));
                i8++;
            }
        }
        return i7;
    }

    public static int zzj(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmw) {
            zzmw zzmwVar = (zzmw) list;
            i7 = 0;
            while (i8 < size) {
                long zza2 = zzmwVar.zza(i8);
                i7 += zzlk.zzA((zza2 >> 63) ^ (zza2 + zza2));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                long longValue = ((Long) list.get(i8)).longValue();
                i7 += zzlk.zzA((longValue >> 63) ^ (longValue + longValue));
                i8++;
            }
        }
        return i7;
    }

    public static int zzk(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzme) {
            zzme zzmeVar = (zzme) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzz(zzmeVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzz(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzl(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmw) {
            zzmw zzmwVar = (zzmw) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzA(zzmwVar.zza(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzlk.zzA(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static zzoe zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i7, int i8, Object obj2, zzoe zzoeVar) {
        Object obj3 = obj2;
        if (obj2 == null) {
            zzmd zzmdVar = (zzmd) obj;
            zzof zzofVar = zzmdVar.zzc;
            obj3 = zzofVar;
            if (zzofVar == zzof.zzc()) {
                zzof zzf = zzof.zzf();
                zzmdVar.zzc = zzf;
                obj3 = zzf;
            }
        }
        ((zzof) obj3).zzj(i7 << 3, Long.valueOf(i8));
        return obj3;
    }

    public static void zzo(zzlq zzlqVar, Object obj, Object obj2) {
        if (((zzma) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzoe zzoeVar, Object obj, Object obj2) {
        zzmd zzmdVar = (zzmd) obj;
        zzof zzofVar = zzmdVar.zzc;
        zzof zzofVar2 = ((zzmd) obj2).zzc;
        if (!zzof.zzc().equals(zzofVar2)) {
            if (zzof.zzc().equals(zzofVar)) {
                zzofVar = zzof.zze(zzofVar, zzofVar2);
            } else {
                zzofVar.zzd(zzofVar2);
            }
        }
        zzmdVar.zzc = zzofVar;
    }

    public static void zzq(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzc(i7, list, z6);
    }

    public static void zzr(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzg(i7, list, z6);
    }

    public static void zzs(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzj(i7, list, z6);
    }

    public static void zzt(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzl(i7, list, z6);
    }

    public static void zzu(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzn(i7, list, z6);
    }

    public static void zzv(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzp(i7, list, z6);
    }

    public static void zzw(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzs(i7, list, z6);
    }

    public static void zzx(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzu(i7, list, z6);
    }

    public static void zzy(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzy(i7, list, z6);
    }

    public static void zzz(int i7, List list, zzor zzorVar, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzA(i7, list, z6);
    }
}
