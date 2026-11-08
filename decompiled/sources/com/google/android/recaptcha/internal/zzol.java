package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.C3643a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import p272k4.C5410A;
import p272k4.C5413D;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i7, int i8, zzoi zzoiVar, boolean z6, int[] iArr2, int i9, int i10, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzoiVar instanceof zznd;
        boolean z7 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z7 = true;
        }
        this.zzh = z7;
        this.zzj = iArr2;
        this.zzk = i9;
        this.zzl = i10;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i7) {
        zzow zzx = zzx(i7);
        int zzu = zzu(i7) & 1048575;
        if (!zzN(obj, i7)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i7, int i8) {
        zzow zzx = zzx(i8);
        if (!zzR(obj, i7, i8)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i8) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i7) {
        if (zzN(obj2, i7)) {
            int zzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = zzu;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i7);
            if (!zzN(obj, i7)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j7, zze);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzH(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j7, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i7) {
        int i8 = this.zzc[i7];
        if (zzR(obj2, i8, i7)) {
            int zzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = zzu;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i7);
            if (!zzR(obj, i8, i7)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j7, zze);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzI(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j7, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i7, zzov zzovVar) {
        long j7 = i7 & 1048575;
        if (zzM(i7)) {
            zzps.zzs(obj, j7, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j7, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j7, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i7) {
        int zzr = zzr(i7);
        long j7 = 1048575 & zzr;
        if (j7 == 1048575) {
            return;
        }
        zzps.zzq(obj, j7, (1 << (zzr >>> 20)) | zzps.zzc(obj, j7));
    }

    private final void zzI(Object obj, int i7, int i8) {
        zzps.zzq(obj, zzr(i8) & 1048575, i7);
    }

    private final void zzJ(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzu(i7) & 1048575, obj2);
        zzH(obj, i7);
    }

    private final void zzK(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzu(i8) & 1048575, obj2);
        zzI(obj, i7, i8);
    }

    private final boolean zzL(Object obj, Object obj2, int i7) {
        return zzN(obj, i7) == zzN(obj2, i7);
    }

    private static boolean zzM(int i7) {
        return (i7 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i7) {
        int zzr = zzr(i7);
        long j7 = zzr & 1048575;
        if (j7 != 1048575) {
            return (zzps.zzc(obj, j7) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i7);
        long j8 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j8)) != 0;
            case 2:
                return zzps.zzd(obj, j8) != 0;
            case 3:
                return zzps.zzd(obj, j8) != 0;
            case 4:
                return zzps.zzc(obj, j8) != 0;
            case 5:
                return zzps.zzd(obj, j8) != 0;
            case 6:
                return zzps.zzc(obj, j8) != 0;
            case 7:
                return zzps.zzw(obj, j8);
            case 8:
                Object zzf = zzps.zzf(obj, j8);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j8) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j8));
            case 11:
                return zzps.zzc(obj, j8) != 0;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzps.zzc(obj, j8) != 0;
            case 13:
                return zzps.zzc(obj, j8) != 0;
            case 14:
                return zzps.zzd(obj, j8) != 0;
            case 15:
                return zzps.zzc(obj, j8) != 0;
            case 16:
                return zzps.zzd(obj, j8) != 0;
            case 17:
                return zzps.zzf(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? zzN(obj, i7) : (i9 & i10) != 0;
    }

    private static boolean zzP(Object obj, int i7, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i7 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i7, int i8) {
        return zzps.zzc(obj, (long) (zzr(i8) & 1048575)) == i7;
    }

    private static boolean zzS(Object obj, long j7) {
        return ((Boolean) zzps.zzf(obj, j7)).booleanValue();
    }

    private static final void zzT(int i7, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i7, (String) obj);
        } else {
            zzpyVar.zzd(i7, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r34, com.google.android.recaptcha.internal.zzof r35, com.google.android.recaptcha.internal.zzoo r36, com.google.android.recaptcha.internal.zznv r37, com.google.android.recaptcha.internal.zzpl r38, com.google.android.recaptcha.internal.zzmp r39, com.google.android.recaptcha.internal.zzod r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j7) {
        return ((Double) zzps.zzf(obj, j7)).doubleValue();
    }

    private static float zzo(Object obj, long j7) {
        return ((Float) zzps.zzf(obj, j7)).floatValue();
    }

    private static int zzp(Object obj, long j7) {
        return ((Integer) zzps.zzf(obj, j7)).intValue();
    }

    private final int zzq(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzs(i7, 0);
    }

    private final int zzr(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzs(int i7, int i8) {
        int length = (this.zzc.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.zzc[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzu(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzv(Object obj, long j7) {
        return ((Long) zzps.zzf(obj, j7)).longValue();
    }

    private final zznh zzw(int i7) {
        int i8 = i7 / 3;
        return (zznh) this.zzd[i8 + i8 + 1];
    }

    private final zzow zzx(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzow zzowVar = (zzow) objArr[i9];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i9 + 1]);
        this.zzd[i9] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zzpl zzplVar, Object obj3) {
        int i8 = this.zzc[i7];
        Object zzf = zzps.zzf(obj, zzu(i7) & 1048575);
        if (zzf == null || zzw(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v256, types: [int] */
    /* JADX WARN: Type inference failed for: r0v263, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [int] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i7;
        boolean z6;
        ?? r52;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzA5;
        int zzd;
        int zzA6;
        ?? zzg;
        int size;
        int zzA7;
        int zzz;
        int zzz2;
        ?? r32;
        int zzy;
        ?? r12;
        ?? r02;
        int zze;
        int zzA8;
        int zzA9;
        ?? r42;
        Unsafe unsafe = zzb;
        boolean z7 = false;
        int i8 = 1048575;
        boolean z8 = false;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < this.zzc.length) {
            int zzu = zzu(i9);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i12 = iArr[i9];
            int i13 = iArr[i9 + 2];
            int i14 = i13 & i8;
            if (zzt <= 17) {
                if (i14 != i11) {
                    z8 = i14 == i8 ? z7 : unsafe.getInt(obj, i14);
                    i11 = i14;
                }
                i7 = i11;
                z6 = z8;
                r52 = 1 << (i13 >>> 20);
            } else {
                i7 = i11;
                z6 = z8;
                r52 = z7;
            }
            int i15 = zzu & i8;
            if (zzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            long j7 = i15;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzA = zzln.zzA(i12 << 3);
                        r02 = zzA + 8;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 1:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzA2 = zzln.zzA(i12 << 3);
                        r02 = zzA2 + 4;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 2:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j8 = unsafe.getLong(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB(j8);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 3:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j9 = unsafe.getLong(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB(j9);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 4:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j10 = unsafe.getInt(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB(j10);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 5:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzA = zzln.zzA(i12 << 3);
                        r02 = zzA + 8;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 6:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzA2 = zzln.zzA(i12 << 3);
                        r02 = zzA2 + 4;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 7:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzA4 = zzln.zzA(i12 << 3);
                        r02 = zzA4 + 1;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 8:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        int i16 = i12 << 3;
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof zzle) {
                            zzA5 = zzln.zzA(i16);
                            zzd = ((zzle) object).zzd();
                            zzA6 = zzln.zzA(zzd);
                            r02 = zzA5 + zzA6 + zzd;
                            i10 += r02;
                            i9 += 3;
                            i11 = i7;
                            z8 = z6;
                            z7 = false;
                            i8 = 1048575;
                        } else {
                            zzA3 = zzln.zzA(i16);
                            zzB = zzln.zzz((String) object);
                            r02 = zzA3 + zzB;
                            i10 += r02;
                            i9 += 3;
                            i11 = i7;
                            z8 = z6;
                            z7 = false;
                            i8 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 9:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        r02 = zzoy.zzh(i12, unsafe.getObject(obj, j7), zzx(i9));
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 10:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj, j7);
                        zzA5 = zzln.zzA(i12 << 3);
                        zzd = zzleVar.zzd();
                        zzA6 = zzln.zzA(zzd);
                        r02 = zzA5 + zzA6 + zzd;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 11:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        int i17 = unsafe.getInt(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzA(i17);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j11 = unsafe.getInt(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB(j11);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 13:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzA2 = zzln.zzA(i12 << 3);
                        r02 = zzA2 + 4;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 14:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzA = zzln.zzA(i12 << 3);
                        r02 = zzA + 8;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 15:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        int i18 = unsafe.getInt(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzA((i18 >> 31) ^ (i18 + i18));
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 16:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j12 = unsafe.getLong(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB((j12 >> 63) ^ (j12 + j12));
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 17:
                    if (zzO(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        r02 = zzln.zzw(i12, (zzoi) unsafe.getObject(obj, j7), zzx(i9));
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    r02 = zzoy.zzd(i12, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 19:
                    r02 = zzoy.zzb(i12, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    List list = (List) unsafe.getObject(obj, j7);
                    int i19 = zzoy.zza;
                    if (list.size() != 0) {
                        zzg = zzoy.zzg(list) + (list.size() * zzln.zzA(i12 << 3));
                        i10 += zzg;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    zzg = z7;
                    i10 += zzg;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j7);
                    int i20 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzA3 = zzoy.zzl(list2);
                        zzA7 = zzln.zzA(i12 << 3);
                        zzB = size * zzA7;
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    r02 = z7;
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i21 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzA3 = zzoy.zzf(list3);
                        zzA7 = zzln.zzA(i12 << 3);
                        zzB = size * zzA7;
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    r02 = z7;
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 23:
                    r02 = zzoy.zzd(i12, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 24:
                    r02 = zzoy.zzb(i12, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j7);
                    int i22 = zzoy.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r02 = size2 * (zzln.zzA(i12 << 3) + 1);
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    r02 = z7;
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 26:
                    ?? r03 = (List) unsafe.getObject(obj, j7);
                    int i23 = zzoy.zza;
                    int size3 = r03.size();
                    if (size3 != 0) {
                        int zzA10 = zzln.zzA(i12 << 3) * size3;
                        if (r03 instanceof zznu) {
                            zznu zznuVar = (zznu) r03;
                            zzg = zzA10;
                            for (?? r33 = z7; r33 < size3; r33++) {
                                Object zzc = zznuVar.zzc();
                                if (zzc instanceof zzle) {
                                    int zzd2 = ((zzle) zzc).zzd();
                                    zzz2 = zzg + zzln.zzA(zzd2) + zzd2;
                                } else {
                                    zzz2 = zzg + zzln.zzz((String) zzc);
                                }
                                zzg = zzz2;
                            }
                        } else {
                            zzg = zzA10;
                            for (?? r34 = z7; r34 < size3; r34++) {
                                Object obj2 = r03.get(r34);
                                if (obj2 instanceof zzle) {
                                    int zzd3 = ((zzle) obj2).zzd();
                                    zzz = zzg + zzln.zzA(zzd3) + zzd3;
                                } else {
                                    zzz = zzg + zzln.zzz((String) obj2);
                                }
                                zzg = zzz;
                            }
                        }
                        i10 += zzg;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    zzg = z7;
                    i10 += zzg;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 27:
                    ?? r04 = (List) unsafe.getObject(obj, j7);
                    zzow zzx = zzx(i9);
                    int i24 = zzoy.zza;
                    int size4 = r04.size();
                    if (size4 == 0) {
                        r32 = z7;
                    } else {
                        r32 = zzln.zzA(i12 << 3) * size4;
                        for (?? r43 = z7; r43 < size4; r43++) {
                            Object obj3 = r04.get(r43);
                            if (obj3 instanceof zznt) {
                                int zza2 = ((zznt) obj3).zza();
                                zzy = (r32 == true ? 1 : 0) + zzln.zzA(zza2) + zza2;
                            } else {
                                zzy = (r32 == true ? 1 : 0) + zzln.zzy((zzoi) obj3, zzx);
                            }
                            r32 = zzy;
                        }
                    }
                    i10 += r32;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 28:
                    ?? r05 = (List) unsafe.getObject(obj, j7);
                    int i25 = zzoy.zza;
                    int size5 = r05.size();
                    if (size5 == 0) {
                        r12 = z7;
                    } else {
                        r12 = size5 * zzln.zzA(i12 << 3);
                        for (?? r22 = z7; r22 < r05.size(); r22++) {
                            int zzd4 = ((zzle) r05.get(r22)).zzd();
                            r12 += zzln.zzA(zzd4) + zzd4;
                        }
                    }
                    i10 += r12;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j7);
                    int i26 = zzoy.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzA3 = zzoy.zzk(list5);
                        zzA7 = zzln.zzA(i12 << 3);
                        zzB = size * zzA7;
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    r02 = z7;
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j7);
                    int i27 = zzoy.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzA3 = zzoy.zza(list6);
                        zzA7 = zzln.zzA(i12 << 3);
                        zzB = size * zzA7;
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    r02 = z7;
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 31:
                    r02 = zzoy.zzb(i12, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 32:
                    r02 = zzoy.zzd(i12, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j7);
                    int i28 = zzoy.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzA3 = zzoy.zzi(list7);
                        zzA7 = zzln.zzA(i12 << 3);
                        zzB = size * zzA7;
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    r02 = z7;
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j7);
                    int i29 = zzoy.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzA3 = zzoy.zzj(list8);
                        zzA7 = zzln.zzA(i12 << 3);
                        zzB = size * zzA7;
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                    r02 = z7;
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 35:
                    zze = zzoy.zze((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 36:
                    zze = zzoy.zzc((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 37:
                    zze = zzoy.zzg((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 38:
                    zze = zzoy.zzl((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 39:
                    zze = zzoy.zzf((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 40:
                    zze = zzoy.zze((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 41:
                    zze = zzoy.zzc((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j7);
                    int i30 = zzoy.zza;
                    zze = list9.size();
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 43:
                    zze = zzoy.zzk((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 44:
                    zze = zzoy.zza((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 45:
                    zze = zzoy.zzc((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 46:
                    zze = zzoy.zze((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 47:
                    zze = zzoy.zzi((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 48:
                    zze = zzoy.zzj((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzA8 = zzln.zzA(i12 << 3);
                        zzA9 = zzln.zzA(zze);
                        r12 = zzA8 + zzA9 + zze;
                        i10 += r12;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 49:
                    ?? r06 = (List) unsafe.getObject(obj, j7);
                    zzow zzx2 = zzx(i9);
                    int i31 = zzoy.zza;
                    int size6 = r06.size();
                    if (size6 == 0) {
                        r42 = z7;
                    } else {
                        boolean z9 = z7;
                        r42 = z9;
                        ?? r35 = z9;
                        while (r35 < size6) {
                            int zzw = zzln.zzw(i12, (zzoi) r06.get(r35), zzx2);
                            r35++;
                            r42 = (r42 == true ? 1 : 0) + zzw;
                        }
                    }
                    i10 += r42;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj, j7);
                    if (zzocVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 51:
                    if (zzR(obj, i12, i9)) {
                        zzA = zzln.zzA(i12 << 3);
                        r02 = zzA + 8;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 52:
                    if (zzR(obj, i12, i9)) {
                        zzA2 = zzln.zzA(i12 << 3);
                        r02 = zzA2 + 4;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 53:
                    if (zzR(obj, i12, i9)) {
                        long zzv = zzv(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB(zzv);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 54:
                    if (zzR(obj, i12, i9)) {
                        long zzv2 = zzv(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB(zzv2);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 55:
                    if (zzR(obj, i12, i9)) {
                        long zzp = zzp(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB(zzp);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 56:
                    if (zzR(obj, i12, i9)) {
                        zzA = zzln.zzA(i12 << 3);
                        r02 = zzA + 8;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 57:
                    if (zzR(obj, i12, i9)) {
                        zzA2 = zzln.zzA(i12 << 3);
                        r02 = zzA2 + 4;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 58:
                    if (zzR(obj, i12, i9)) {
                        zzA4 = zzln.zzA(i12 << 3);
                        r02 = zzA4 + 1;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 59:
                    if (zzR(obj, i12, i9)) {
                        int i32 = i12 << 3;
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof zzle) {
                            zzA5 = zzln.zzA(i32);
                            zzd = ((zzle) object2).zzd();
                            zzA6 = zzln.zzA(zzd);
                            r02 = zzA5 + zzA6 + zzd;
                            i10 += r02;
                            i9 += 3;
                            i11 = i7;
                            z8 = z6;
                            z7 = false;
                            i8 = 1048575;
                        } else {
                            zzA3 = zzln.zzA(i32);
                            zzB = zzln.zzz((String) object2);
                            r02 = zzA3 + zzB;
                            i10 += r02;
                            i9 += 3;
                            i11 = i7;
                            z8 = z6;
                            z7 = false;
                            i8 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzR(obj, i12, i9)) {
                        r02 = zzoy.zzh(i12, unsafe.getObject(obj, j7), zzx(i9));
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 61:
                    if (zzR(obj, i12, i9)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj, j7);
                        zzA5 = zzln.zzA(i12 << 3);
                        zzd = zzleVar2.zzd();
                        zzA6 = zzln.zzA(zzd);
                        r02 = zzA5 + zzA6 + zzd;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 62:
                    if (zzR(obj, i12, i9)) {
                        int zzp2 = zzp(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzA(zzp2);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 63:
                    if (zzR(obj, i12, i9)) {
                        long zzp3 = zzp(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB(zzp3);
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 64:
                    if (zzR(obj, i12, i9)) {
                        zzA2 = zzln.zzA(i12 << 3);
                        r02 = zzA2 + 4;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 65:
                    if (zzR(obj, i12, i9)) {
                        zzA = zzln.zzA(i12 << 3);
                        r02 = zzA + 8;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 66:
                    if (zzR(obj, i12, i9)) {
                        int zzp4 = zzp(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzA((zzp4 >> 31) ^ (zzp4 + zzp4));
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 67:
                    if (zzR(obj, i12, i9)) {
                        long zzv3 = zzv(obj, j7);
                        zzA3 = zzln.zzA(i12 << 3);
                        zzB = zzln.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        r02 = zzA3 + zzB;
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                case 68:
                    if (zzR(obj, i12, i9)) {
                        r02 = zzln.zzw(i12, (zzoi) unsafe.getObject(obj, j7), zzx(i9));
                        i10 += r02;
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        i11 = i7;
                        z8 = z6;
                        z7 = false;
                        i8 = 1048575;
                    }
                default:
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
            }
        }
        int zza3 = i10 + ((zznd) obj).zzc.zza();
        if (!this.zzh) {
            return zza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int zzc2 = zzmtVar.zza.zzc();
        int i33 = 0;
        for (int i34 = 0; i34 < zzc2; i34++) {
            Map.Entry zzg2 = zzmtVar.zza.zzg(i34);
            i33 += zzmt.zza((zzms) ((zzpa) zzg2).zza(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            i33 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i33;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int floatToIntBits;
        int i8;
        int i9 = 0;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int[] iArr = this.zzc;
            int i11 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j7 = i11;
            int i13 = 37;
            switch (zzt) {
                case 0:
                    i7 = i9 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j7));
                    byte[] bArr = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + floatToIntBits;
                    break;
                case 1:
                    i7 = i9 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j7));
                    i9 = i7 + floatToIntBits;
                    break;
                case 2:
                    i7 = i9 * 53;
                    doubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr2 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + floatToIntBits;
                    break;
                case 3:
                    i7 = i9 * 53;
                    doubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr3 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + floatToIntBits;
                    break;
                case 4:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + floatToIntBits;
                    break;
                case 5:
                    i7 = i9 * 53;
                    doubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr4 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + floatToIntBits;
                    break;
                case 6:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + floatToIntBits;
                    break;
                case 7:
                    i7 = i9 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j7));
                    i9 = i7 + floatToIntBits;
                    break;
                case 8:
                    i7 = i9 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j7)).hashCode();
                    i9 = i7 + floatToIntBits;
                    break;
                case 9:
                    i8 = i9 * 53;
                    Object zzf = zzps.zzf(obj, j7);
                    if (zzf != null) {
                        i13 = zzf.hashCode();
                    }
                    i9 = i8 + i13;
                    break;
                case 10:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzf(obj, j7).hashCode();
                    i9 = i7 + floatToIntBits;
                    break;
                case 11:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + floatToIntBits;
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + floatToIntBits;
                    break;
                case 13:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + floatToIntBits;
                    break;
                case 14:
                    i7 = i9 * 53;
                    doubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr5 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + floatToIntBits;
                    break;
                case 15:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + floatToIntBits;
                    break;
                case 16:
                    i7 = i9 * 53;
                    doubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr6 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i7 + floatToIntBits;
                    break;
                case 17:
                    i8 = i9 * 53;
                    Object zzf2 = zzps.zzf(obj, j7);
                    if (zzf2 != null) {
                        i13 = zzf2.hashCode();
                    }
                    i9 = i8 + i13;
                    break;
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzf(obj, j7).hashCode();
                    i9 = i7 + floatToIntBits;
                    break;
                case 50:
                    i7 = i9 * 53;
                    floatToIntBits = zzps.zzf(obj, j7).hashCode();
                    i9 = i7 + floatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j7));
                        byte[] bArr7 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j7));
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr8 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr9 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzp(obj, j7);
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr10 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzp(obj, j7);
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j7));
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j7)).hashCode();
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzps.zzf(obj, j7).hashCode();
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzps.zzf(obj, j7).hashCode();
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzp(obj, j7);
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzp(obj, j7);
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzp(obj, j7);
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr11 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzp(obj, j7);
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr12 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        floatToIntBits = zzps.zzf(obj, j7).hashCode();
                        i9 = i7 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i9 * 53) + ((zznd) obj).zzc.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0e29, code lost:
    
        if (r11 == 1048575) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e2b, code lost:
    
        r36.putInt(r7, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e31, code lost:
    
        r11 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0e36, code lost:
    
        if (r11 >= r6.zzl) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e38, code lost:
    
        zzy(r34, r6.zzj[r11], null, r6.zzm, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e4d, code lost:
    
        if (r9 != 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e4f, code lost:
    
        if (r8 != r14) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e57, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e5c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0e58, code lost:
    
        if (r8 > r14) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e5a, code lost:
    
        if (r10 != r9) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0e62, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x09a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x09c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzkt r39) {
        /*
            Method dump skipped, instructions count: 3868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(C3643a.e.API_PRIORITY_OTHER);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int zzu = zzu(i7);
                int i8 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j7 = i8;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
                            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            case 19:
                            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zznk) zzps.zzf(obj, j7)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i7], i7)) {
                        zzx(i7).zzf(zzb.getObject(obj, j7));
                    }
                }
                if (zzN(obj, i7)) {
                    zzx(i7).zzf(zzb.getObject(obj, j7));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            int i8 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i7)) {
                        zzps.zzo(obj, j7, zzps.zza(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i7)) {
                        zzps.zzp(obj, j7, zzps.zzb(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i7)) {
                        zzps.zzm(obj, j7, zzps.zzw(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i7)) {
                        zzps.zzs(obj, j7, zzps.zzf(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i7);
                    break;
                case 10:
                    if (zzN(obj2, i7)) {
                        zzps.zzs(obj, j7, zzps.zzf(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i7);
                    break;
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zznk zznkVar = (zznk) zzps.zzf(obj, j7);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j7);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j7, zznkVar2);
                    break;
                case 50:
                    int i10 = zzoy.zza;
                    zzps.zzs(obj, j7, zzod.zzb(zzps.zzf(obj, j7), zzps.zzf(obj2, j7)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i9, i7)) {
                        zzps.zzs(obj, j7, zzps.zzf(obj2, j7));
                        zzI(obj, i9, i7);
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    zzF(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i9, i7)) {
                        zzps.zzs(obj, j7, zzps.zzf(obj2, j7));
                        zzI(obj, i9, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i7);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        Object valueOf;
        Object zze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar = this.zzm;
        Object obj2 = null;
        zzmt zzmtVar = null;
        while (true) {
            try {
                int zzc = zzovVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    int zzu = zzu(zzq);
                    try {
                    } catch (zznm unused) {
                        if (obj2 == null) {
                            obj2 = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                            for (int i7 = this.zzk; i7 < this.zzl; i7++) {
                                zzy(obj, this.zzj[i7], obj2, zzplVar, obj);
                            }
                        }
                    }
                    switch (zzt(zzu)) {
                        case 0:
                            zzps.zzo(obj, zzu & 1048575, zzovVar.zza());
                            zzH(obj, zzq);
                        case 1:
                            zzps.zzp(obj, zzu & 1048575, zzovVar.zzb());
                            zzH(obj, zzq);
                        case 2:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzl());
                            zzH(obj, zzq);
                        case 3:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzo());
                            zzH(obj, zzq);
                        case 4:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzg());
                            zzH(obj, zzq);
                        case 5:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzk());
                            zzH(obj, zzq);
                        case 6:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzf());
                            zzH(obj, zzq);
                        case 7:
                            zzps.zzm(obj, zzu & 1048575, zzovVar.zzN());
                            zzH(obj, zzq);
                        case 8:
                            zzG(obj, zzu, zzovVar);
                            zzH(obj, zzq);
                        case 9:
                            zzoi zzoiVar = (zzoi) zzA(obj, zzq);
                            zzovVar.zzu(zzoiVar, zzx(zzq), zzmoVar);
                            zzJ(obj, zzq, zzoiVar);
                        case 10:
                            zzps.zzs(obj, zzu & 1048575, zzovVar.zzp());
                            zzH(obj, zzq);
                        case 11:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzj());
                            zzH(obj, zzq);
                        case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            int zze2 = zzovVar.zze();
                            zznh zzw = zzw(zzq);
                            if (zzw != null && !zzw.zza(zze2)) {
                                obj2 = zzoy.zzo(obj, zzc, zze2, obj2, zzplVar);
                            }
                            zzps.zzq(obj, zzu & 1048575, zze2);
                            zzH(obj, zzq);
                            break;
                        case 13:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzh());
                            zzH(obj, zzq);
                        case 14:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzm());
                            zzH(obj, zzq);
                        case 15:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzi());
                            zzH(obj, zzq);
                        case 16:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzn());
                            zzH(obj, zzq);
                        case 17:
                            zzoi zzoiVar2 = (zzoi) zzA(obj, zzq);
                            zzovVar.zzt(zzoiVar2, zzx(zzq), zzmoVar);
                            zzJ(obj, zzq, zzoiVar2);
                        case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            zzovVar.zzx(zznv.zza(obj, zzu & 1048575));
                        case 19:
                            zzovVar.zzB(zznv.zza(obj, zzu & 1048575));
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            zzovVar.zzE(zznv.zza(obj, zzu & 1048575));
                        case 21:
                            zzovVar.zzM(zznv.zza(obj, zzu & 1048575));
                        case 22:
                            zzovVar.zzD(zznv.zza(obj, zzu & 1048575));
                        case 23:
                            zzovVar.zzA(zznv.zza(obj, zzu & 1048575));
                        case 24:
                            zzovVar.zzz(zznv.zza(obj, zzu & 1048575));
                        case 25:
                            zzovVar.zzv(zznv.zza(obj, zzu & 1048575));
                        case 26:
                            if (zzM(zzu)) {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, zzu & 1048575), true);
                            } else {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, zzu & 1048575), false);
                            }
                        case 27:
                            zzovVar.zzF(zznv.zza(obj, zzu & 1048575), zzx(zzq), zzmoVar);
                        case 28:
                            zzovVar.zzw(zznv.zza(obj, zzu & 1048575));
                        case 29:
                            zzovVar.zzL(zznv.zza(obj, zzu & 1048575));
                        case 30:
                            List zza2 = zznv.zza(obj, zzu & 1048575);
                            zzovVar.zzy(zza2);
                            obj2 = zzoy.zzn(obj, zzc, zza2, zzw(zzq), obj2, zzplVar);
                        case 31:
                            zzovVar.zzG(zznv.zza(obj, zzu & 1048575));
                        case 32:
                            zzovVar.zzH(zznv.zza(obj, zzu & 1048575));
                        case 33:
                            zzovVar.zzI(zznv.zza(obj, zzu & 1048575));
                        case 34:
                            zzovVar.zzJ(zznv.zza(obj, zzu & 1048575));
                        case 35:
                            zzovVar.zzx(zznv.zza(obj, zzu & 1048575));
                        case 36:
                            zzovVar.zzB(zznv.zza(obj, zzu & 1048575));
                        case 37:
                            zzovVar.zzE(zznv.zza(obj, zzu & 1048575));
                        case 38:
                            zzovVar.zzM(zznv.zza(obj, zzu & 1048575));
                        case 39:
                            zzovVar.zzD(zznv.zza(obj, zzu & 1048575));
                        case 40:
                            zzovVar.zzA(zznv.zza(obj, zzu & 1048575));
                        case 41:
                            zzovVar.zzz(zznv.zza(obj, zzu & 1048575));
                        case 42:
                            zzovVar.zzv(zznv.zza(obj, zzu & 1048575));
                        case 43:
                            zzovVar.zzL(zznv.zza(obj, zzu & 1048575));
                        case 44:
                            List zza3 = zznv.zza(obj, zzu & 1048575);
                            zzovVar.zzy(zza3);
                            obj2 = zzoy.zzn(obj, zzc, zza3, zzw(zzq), obj2, zzplVar);
                        case 45:
                            zzovVar.zzG(zznv.zza(obj, zzu & 1048575));
                        case 46:
                            zzovVar.zzH(zznv.zza(obj, zzu & 1048575));
                        case 47:
                            zzovVar.zzI(zznv.zza(obj, zzu & 1048575));
                        case 48:
                            zzovVar.zzJ(zznv.zza(obj, zzu & 1048575));
                        case 49:
                            zzovVar.zzC(zznv.zza(obj, zzu & 1048575), zzx(zzq), zzmoVar);
                        case 50:
                            Object zzz = zzz(zzq);
                            long zzu2 = zzu(zzq) & 1048575;
                            Object zzf = zzps.zzf(obj, zzu2);
                            if (zzf == null) {
                                zzf = zzoc.zza().zzb();
                                zzps.zzs(obj, zzu2, zzf);
                            } else if (zzod.zza(zzf)) {
                                Object zzb2 = zzoc.zza().zzb();
                                zzod.zzb(zzb2, zzf);
                                zzps.zzs(obj, zzu2, zzb2);
                                zzf = zzb2;
                            }
                            throw null;
                            break;
                        case 51:
                            zzps.zzs(obj, zzu & 1048575, Double.valueOf(zzovVar.zza()));
                            zzI(obj, zzc, zzq);
                        case 52:
                            zzps.zzs(obj, zzu & 1048575, Float.valueOf(zzovVar.zzb()));
                            zzI(obj, zzc, zzq);
                        case 53:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzl()));
                            zzI(obj, zzc, zzq);
                        case 54:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzo()));
                            zzI(obj, zzc, zzq);
                        case 55:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                            zzI(obj, zzc, zzq);
                        case 56:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzk()));
                            zzI(obj, zzc, zzq);
                        case 57:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                            zzI(obj, zzc, zzq);
                        case 58:
                            zzps.zzs(obj, zzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                            zzI(obj, zzc, zzq);
                        case 59:
                            zzG(obj, zzu, zzovVar);
                            zzI(obj, zzc, zzq);
                        case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                            zzoi zzoiVar3 = (zzoi) zzB(obj, zzc, zzq);
                            zzovVar.zzu(zzoiVar3, zzx(zzq), zzmoVar);
                            zzK(obj, zzc, zzq, zzoiVar3);
                        case 61:
                            zzps.zzs(obj, zzu & 1048575, zzovVar.zzp());
                            zzI(obj, zzc, zzq);
                        case 62:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                            zzI(obj, zzc, zzq);
                        case 63:
                            int zze3 = zzovVar.zze();
                            zznh zzw2 = zzw(zzq);
                            if (zzw2 != null && !zzw2.zza(zze3)) {
                                obj2 = zzoy.zzo(obj, zzc, zze3, obj2, zzplVar);
                            }
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zze3));
                            zzI(obj, zzc, zzq);
                            break;
                        case 64:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                            zzI(obj, zzc, zzq);
                        case 65:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzm()));
                            zzI(obj, zzc, zzq);
                        case 66:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                            zzI(obj, zzc, zzq);
                        case 67:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzn()));
                            zzI(obj, zzc, zzq);
                        case 68:
                            zzoi zzoiVar4 = (zzoi) zzB(obj, zzc, zzq);
                            zzovVar.zzt(zzoiVar4, zzx(zzq), zzmoVar);
                            zzK(obj, zzc, zzq, zzoiVar4);
                        default:
                            if (obj2 == null) {
                                obj2 = zzplVar.zza(obj);
                            }
                            if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                                for (int i8 = this.zzk; i8 < this.zzl; i8++) {
                                    zzy(obj, this.zzj[i8], obj2, zzplVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i9 = this.zzk; i9 < this.zzl; i9++) {
                        zzy(obj, this.zzj[i9], obj2, zzplVar, obj);
                    }
                } else {
                    zznc zza4 = !this.zzh ? null : zzmoVar.zza(this.zzg, zzc);
                    if (zza4 != null) {
                        if (zzmtVar == null) {
                            zzmtVar = ((zzna) obj).zzi();
                        }
                        zznb zznbVar = zza4.zza;
                        zzpw zzpwVar = zzpw.zzn;
                        zzpw zzpwVar2 = zznbVar.zzb;
                        if (zzpwVar2 == zzpwVar) {
                            zzovVar.zzg();
                            throw null;
                        }
                        switch (zzpwVar2.ordinal()) {
                            case 0:
                                valueOf = Double.valueOf(zzovVar.zza());
                                break;
                            case 1:
                                valueOf = Float.valueOf(zzovVar.zzb());
                                break;
                            case 2:
                                valueOf = Long.valueOf(zzovVar.zzl());
                                break;
                            case 3:
                                valueOf = Long.valueOf(zzovVar.zzo());
                                break;
                            case 4:
                                valueOf = Integer.valueOf(zzovVar.zzg());
                                break;
                            case 5:
                                valueOf = Long.valueOf(zzovVar.zzk());
                                break;
                            case 6:
                                valueOf = Integer.valueOf(zzovVar.zzf());
                                break;
                            case 7:
                                valueOf = Boolean.valueOf(zzovVar.zzN());
                                break;
                            case 8:
                                valueOf = zzovVar.zzr();
                                break;
                            case 9:
                                Object zze4 = zzmtVar.zze(zza4.zza);
                                if (!(zze4 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzb3 = zzos.zza().zzb(zze4.getClass());
                                if (!((zznd) zze4).zzL()) {
                                    Object zze5 = zzb3.zze();
                                    zzb3.zzg(zze5, zze4);
                                    zzmtVar.zzi(zza4.zza, zze5);
                                    zze4 = zze5;
                                }
                                zzovVar.zzt(zze4, zzb3, zzmoVar);
                                continue;
                            case 10:
                                Object zze6 = zzmtVar.zze(zza4.zza);
                                if (!(zze6 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzb4 = zzos.zza().zzb(zze6.getClass());
                                if (!((zznd) zze6).zzL()) {
                                    Object zze7 = zzb4.zze();
                                    zzb4.zzg(zze7, zze6);
                                    zzmtVar.zzi(zza4.zza, zze7);
                                    zze6 = zze7;
                                }
                                zzovVar.zzu(zze6, zzb4, zzmoVar);
                                continue;
                            case 11:
                                valueOf = zzovVar.zzp();
                                break;
                            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                valueOf = Integer.valueOf(zzovVar.zzj());
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case 14:
                                valueOf = Integer.valueOf(zzovVar.zzh());
                                break;
                            case 15:
                                valueOf = Long.valueOf(zzovVar.zzm());
                                break;
                            case 16:
                                valueOf = Integer.valueOf(zzovVar.zzi());
                                break;
                            case 17:
                                valueOf = Long.valueOf(zzovVar.zzn());
                                break;
                            default:
                                valueOf = null;
                                break;
                        }
                        int ordinal = zza4.zza.zzb.ordinal();
                        if ((ordinal == 9 || ordinal == 10) && (zze = zzmtVar.zze(zza4.zza)) != null) {
                            byte[] bArr = zznl.zzb;
                            valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                        }
                        zzmtVar.zzi(zza4.zza, valueOf);
                    } else {
                        if (obj2 == null) {
                            obj2 = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                            for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                                zzy(obj, this.zzj[i10], obj2, zzplVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                    zzy(obj, this.zzj[i11], obj2, zzplVar, obj);
                }
                if (obj2 != null) {
                    zzplVar.zzj(obj, obj2);
                }
                throw th;
            }
        }
        if (obj2 != null) {
            zzplVar.zzj(obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzkt zzktVar) {
        zzc(obj, bArr, i7, i8, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r25, com.google.android.recaptcha.internal.zzpy r26) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            long j7 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i7) && Double.doubleToLongBits(zzps.zza(obj, j7)) == Double.doubleToLongBits(zzps.zza(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i7) && Float.floatToIntBits(zzps.zzb(obj, j7)) == Float.floatToIntBits(zzps.zzb(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j7) == zzps.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j7) == zzps.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j7) == zzps.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j7) == zzps.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j7) == zzps.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i7) && zzps.zzw(obj, j7) == zzps.zzw(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j7) == zzps.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j7) == zzps.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j7) == zzps.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j7) == zzps.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j7) == zzps.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j7) == zzps.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzF = zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7));
                    break;
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzr = zzr(i7) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i12 = iArr[i10];
            int i13 = iArr2[i12];
            int zzu = zzu(i12);
            int i14 = this.zzc[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i11) {
                if (i15 != 1048575) {
                    i9 = zzb.getInt(obj, i15);
                }
                i8 = i9;
                i7 = i15;
            } else {
                i7 = i11;
                i8 = i9;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i12, i7, i8, i16)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i13, i12) && !zzP(obj, zzu, zzx(i12))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzoc) zzps.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzps.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzx.zzl(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i12, i7, i8, i16) && !zzP(obj, zzu, zzx(i12))) {
                return false;
            }
            i10++;
            i11 = i7;
            i9 = i8;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
