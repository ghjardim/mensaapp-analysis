package com.google.android.gms.internal.measurement;

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
final class zznk<T> implements zzns<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzol.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznh zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoe zzl;
    private final zzlq zzm;

    private zznk(int[] iArr, Object[] objArr, int i7, int i8, zznh zznhVar, boolean z6, int[] iArr2, int i9, int i10, zznm zznmVar, zzmu zzmuVar, zzoe zzoeVar, zzlq zzlqVar, zznc zzncVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        boolean z7 = false;
        if (zzlqVar != null && (zznhVar instanceof zzma)) {
            z7 = true;
        }
        this.zzh = z7;
        this.zzi = iArr2;
        this.zzj = i9;
        this.zzk = i10;
        this.zzl = zzoeVar;
        this.zzm = zzlqVar;
        this.zzg = zznhVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i7) {
        if (zzI(obj2, i7)) {
            int zzs = zzs(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = zzs;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzns zzv = zzv(i7);
            if (!zzI(obj, i7)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j7, zze);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzD(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j7, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i7) {
        int[] iArr = this.zzc;
        int i8 = iArr[i7];
        if (zzM(obj2, i8, i7)) {
            int zzs = zzs(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = zzs;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2.toString());
            }
            zzns zzv = zzv(i7);
            if (!zzM(obj, i8, i7)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j7, zze);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzE(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j7, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i7) {
        int zzp = zzp(i7);
        long j7 = 1048575 & zzp;
        if (j7 == 1048575) {
            return;
        }
        zzol.zzq(obj, j7, (1 << (zzp >>> 20)) | zzol.zzc(obj, j7));
    }

    private final void zzE(Object obj, int i7, int i8) {
        zzol.zzq(obj, zzp(i8) & 1048575, i7);
    }

    private final void zzF(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzs(i7) & 1048575, obj2);
        zzD(obj, i7);
    }

    private final void zzG(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzs(i8) & 1048575, obj2);
        zzE(obj, i7, i8);
    }

    private final boolean zzH(Object obj, Object obj2, int i7) {
        return zzI(obj, i7) == zzI(obj2, i7);
    }

    private final boolean zzI(Object obj, int i7) {
        int zzp = zzp(i7);
        long j7 = zzp & 1048575;
        if (j7 != 1048575) {
            return (zzol.zzc(obj, j7) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i7);
        long j8 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzol.zza(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzol.zzb(obj, j8)) != 0;
            case 2:
                return zzol.zzd(obj, j8) != 0;
            case 3:
                return zzol.zzd(obj, j8) != 0;
            case 4:
                return zzol.zzc(obj, j8) != 0;
            case 5:
                return zzol.zzd(obj, j8) != 0;
            case 6:
                return zzol.zzc(obj, j8) != 0;
            case 7:
                return zzol.zzw(obj, j8);
            case 8:
                Object zzf = zzol.zzf(obj, j8);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzld) {
                    return !zzld.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzol.zzf(obj, j8) != null;
            case 10:
                return !zzld.zzb.equals(zzol.zzf(obj, j8));
            case 11:
                return zzol.zzc(obj, j8) != 0;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzol.zzc(obj, j8) != 0;
            case 13:
                return zzol.zzc(obj, j8) != 0;
            case 14:
                return zzol.zzd(obj, j8) != 0;
            case 15:
                return zzol.zzc(obj, j8) != 0;
            case 16:
                return zzol.zzd(obj, j8) != 0;
            case 17:
                return zzol.zzf(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? zzI(obj, i7) : (i9 & i10) != 0;
    }

    private static boolean zzK(Object obj, int i7, zzns zznsVar) {
        return zznsVar.zzk(zzol.zzf(obj, i7 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmd) {
            return ((zzmd) obj).zzcw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i7, int i8) {
        return zzol.zzc(obj, (long) (zzp(i8) & 1048575)) == i7;
    }

    private static boolean zzN(Object obj, long j7) {
        return ((Boolean) zzol.zzf(obj, j7)).booleanValue();
    }

    private static final void zzO(int i7, Object obj, zzor zzorVar) {
        if (obj instanceof String) {
            zzorVar.zzG(i7, (String) obj);
        } else {
            zzorVar.zzd(i7, (zzld) obj);
        }
    }

    public static zzof zzd(Object obj) {
        zzmd zzmdVar = (zzmd) obj;
        zzof zzofVar = zzmdVar.zzc;
        if (zzofVar != zzof.zzc()) {
            return zzofVar;
        }
        zzof zzf = zzof.zzf();
        zzmdVar.zzc = zzf;
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
    public static com.google.android.gms.internal.measurement.zznk zzl(java.lang.Class r34, com.google.android.gms.internal.measurement.zzne r35, com.google.android.gms.internal.measurement.zznm r36, com.google.android.gms.internal.measurement.zzmu r37, com.google.android.gms.internal.measurement.zzoe r38, com.google.android.gms.internal.measurement.zzlq r39, com.google.android.gms.internal.measurement.zznc r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznk.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzne, com.google.android.gms.internal.measurement.zznm, com.google.android.gms.internal.measurement.zzmu, com.google.android.gms.internal.measurement.zzoe, com.google.android.gms.internal.measurement.zzlq, com.google.android.gms.internal.measurement.zznc):com.google.android.gms.internal.measurement.zznk");
    }

    private static double zzm(Object obj, long j7) {
        return ((Double) zzol.zzf(obj, j7)).doubleValue();
    }

    private static float zzn(Object obj, long j7) {
        return ((Float) zzol.zzf(obj, j7)).floatValue();
    }

    private static int zzo(Object obj, long j7) {
        return ((Integer) zzol.zzf(obj, j7)).intValue();
    }

    private final int zzp(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzq(int i7, int i8) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = iArr[i10];
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

    private static int zzr(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzs(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzt(Object obj, long j7) {
        return ((Long) zzol.zzf(obj, j7)).longValue();
    }

    private final zzmg zzu(int i7) {
        int i8 = i7 / 3;
        return (zzmg) this.zzd[i8 + i8 + 1];
    }

    private final zzns zzv(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzns zznsVar = (zzns) objArr[i9];
        if (zznsVar != null) {
            return zznsVar;
        }
        zzns zzb2 = zznp.zza().zzb((Class) objArr[i9 + 1]);
        objArr[i9] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    private final Object zzx(Object obj, int i7) {
        zzns zzv = zzv(i7);
        int zzs = zzs(i7) & 1048575;
        if (!zzI(obj, i7)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i7, int i8) {
        zzns zzv = zzv(i8);
        if (!zzM(obj, i7, i8)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i8) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
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
    /* JADX WARN: Type inference failed for: r1v116, types: [int] */
    /* JADX WARN: Type inference failed for: r1v119, types: [int] */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v41, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [int] */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v40, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zza(Object obj) {
        int i7;
        boolean z6;
        ?? r52;
        int zzz;
        int zzz2;
        int zzz3;
        int zzA;
        int zzz4;
        int zzz5;
        int zzd;
        int zzz6;
        ?? zzg;
        int size;
        int zzz7;
        int zzy;
        int zzy2;
        ?? r32;
        int zzx;
        ?? r12;
        ?? r02;
        int zze;
        int zzz8;
        int zzz9;
        ?? r42;
        Unsafe unsafe = zzb;
        boolean z7 = false;
        int i8 = 1048575;
        boolean z8 = false;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i9 >= iArr.length) {
                int zza2 = i10 + ((zzmd) obj).zzc.zza();
                if (!this.zzh) {
                    return zza2;
                }
                zzoa zzoaVar = ((zzma) obj).zzb.zza;
                int zzc = zzoaVar.zzc();
                int i12 = 0;
                for (int i13 = 0; i13 < zzc; i13++) {
                    Map.Entry zzg2 = zzoaVar.zzg(i13);
                    i12 += zzlu.zzb((zzlt) ((zznw) zzg2).zza(), zzg2.getValue());
                }
                for (Map.Entry entry : zzoaVar.zzd()) {
                    i12 += zzlu.zzb((zzlt) entry.getKey(), entry.getValue());
                }
                return zza2 + i12;
            }
            int zzs = zzs(i9);
            int zzr = zzr(zzs);
            int i14 = iArr[i9];
            int i15 = iArr[i9 + 2];
            int i16 = i15 & i8;
            if (zzr <= 17) {
                if (i16 != i11) {
                    z8 = i16 == i8 ? z7 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i7 = i11;
                z6 = z8;
                r52 = 1 << (i15 >>> 20);
            } else {
                i7 = i11;
                z6 = z8;
                r52 = z7;
            }
            int i17 = zzs & i8;
            if (zzr >= zzlv.zzJ.zza()) {
                zzlv.zzW.zza();
            }
            long j7 = i17;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzz = zzlk.zzz(i14 << 3);
                        r02 = zzz + 8;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzz2 = zzlk.zzz(i14 << 3);
                        r02 = zzz2 + 4;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j8 = unsafe.getLong(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(j8);
                        r02 = zzz3 + zzA;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j9 = unsafe.getLong(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(j9);
                        r02 = zzz3 + zzA;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j10 = unsafe.getInt(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(j10);
                        r02 = zzz3 + zzA;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzz = zzlk.zzz(i14 << 3);
                        r02 = zzz + 8;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzz2 = zzlk.zzz(i14 << 3);
                        r02 = zzz2 + 4;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzz4 = zzlk.zzz(i14 << 3);
                        r02 = zzz4 + 1;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof zzld) {
                            zzz5 = zzlk.zzz(i18);
                            zzd = ((zzld) object).zzd();
                            zzz6 = zzlk.zzz(zzd);
                            r02 = zzz5 + zzz6 + zzd;
                            i10 += r02;
                            i9 += 3;
                            i11 = i7;
                            z8 = z6;
                            z7 = false;
                            i8 = 1048575;
                        } else {
                            zzz3 = zzlk.zzz(i18);
                            zzA = zzlk.zzy((String) object);
                            r02 = zzz3 + zzA;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        r02 = zznu.zzh(i14, unsafe.getObject(obj, j7), zzv(i9));
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzld zzldVar = (zzld) unsafe.getObject(obj, j7);
                        zzz5 = zzlk.zzz(i14 << 3);
                        zzd = zzldVar.zzd();
                        zzz6 = zzlk.zzz(zzd);
                        r02 = zzz5 + zzz6 + zzd;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        int i19 = unsafe.getInt(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzz(i19);
                        r02 = zzz3 + zzA;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j11 = unsafe.getInt(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(j11);
                        r02 = zzz3 + zzA;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzz2 = zzlk.zzz(i14 << 3);
                        r02 = zzz2 + 4;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        zzz = zzlk.zzz(i14 << 3);
                        r02 = zzz + 8;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        int i20 = unsafe.getInt(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzz((i20 >> 31) ^ (i20 + i20));
                        r02 = zzz3 + zzA;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        long j12 = unsafe.getLong(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA((j12 >> 63) ^ (j12 + j12));
                        r02 = zzz3 + zzA;
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
                    if (zzJ(obj, i9, i7, z6 ? 1 : 0, r52)) {
                        r02 = zzlk.zzw(i14, (zznh) unsafe.getObject(obj, j7), zzv(i9));
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
                    r02 = zznu.zzd(i14, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 19:
                    r02 = zznu.zzb(i14, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    List list = (List) unsafe.getObject(obj, j7);
                    int i21 = zznu.zza;
                    if (list.size() != 0) {
                        zzg = zznu.zzg(list) + (list.size() * zzlk.zzz(i14 << 3));
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
                    int i22 = zznu.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzz3 = zznu.zzl(list2);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzA = size * zzz7;
                        r02 = zzz3 + zzA;
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
                    int i23 = zznu.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzz3 = zznu.zzf(list3);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzA = size * zzz7;
                        r02 = zzz3 + zzA;
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
                    r02 = zznu.zzd(i14, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 24:
                    r02 = zznu.zzb(i14, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j7);
                    int i24 = zznu.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r02 = size2 * (zzlk.zzz(i14 << 3) + 1);
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
                    int i25 = zznu.zza;
                    int size3 = r03.size();
                    if (size3 != 0) {
                        int zzz10 = zzlk.zzz(i14 << 3) * size3;
                        if (r03 instanceof zzmt) {
                            zzmt zzmtVar = (zzmt) r03;
                            zzg = zzz10;
                            for (?? r33 = z7; r33 < size3; r33++) {
                                Object zzc2 = zzmtVar.zzc();
                                if (zzc2 instanceof zzld) {
                                    int zzd2 = ((zzld) zzc2).zzd();
                                    zzy2 = zzg + zzlk.zzz(zzd2) + zzd2;
                                } else {
                                    zzy2 = zzg + zzlk.zzy((String) zzc2);
                                }
                                zzg = zzy2;
                            }
                        } else {
                            zzg = zzz10;
                            for (?? r34 = z7; r34 < size3; r34++) {
                                Object obj2 = r03.get(r34);
                                if (obj2 instanceof zzld) {
                                    int zzd3 = ((zzld) obj2).zzd();
                                    zzy = zzg + zzlk.zzz(zzd3) + zzd3;
                                } else {
                                    zzy = zzg + zzlk.zzy((String) obj2);
                                }
                                zzg = zzy;
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
                    zzns zzv = zzv(i9);
                    int i26 = zznu.zza;
                    int size4 = r04.size();
                    if (size4 == 0) {
                        r32 = z7;
                    } else {
                        r32 = zzlk.zzz(i14 << 3) * size4;
                        for (?? r43 = z7; r43 < size4; r43++) {
                            Object obj3 = r04.get(r43);
                            if (obj3 instanceof zzms) {
                                int zza3 = ((zzms) obj3).zza();
                                zzx = (r32 == true ? 1 : 0) + zzlk.zzz(zza3) + zza3;
                            } else {
                                zzx = (r32 == true ? 1 : 0) + zzlk.zzx((zznh) obj3, zzv);
                            }
                            r32 = zzx;
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
                    int i27 = zznu.zza;
                    int size5 = r05.size();
                    if (size5 == 0) {
                        r12 = z7;
                    } else {
                        r12 = size5 * zzlk.zzz(i14 << 3);
                        for (?? r22 = z7; r22 < r05.size(); r22++) {
                            int zzd4 = ((zzld) r05.get(r22)).zzd();
                            r12 += zzlk.zzz(zzd4) + zzd4;
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
                    int i28 = zznu.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzz3 = zznu.zzk(list5);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzA = size * zzz7;
                        r02 = zzz3 + zzA;
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
                    int i29 = zznu.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzz3 = zznu.zza(list6);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzA = size * zzz7;
                        r02 = zzz3 + zzA;
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
                    r02 = zznu.zzb(i14, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 32:
                    r02 = zznu.zzd(i14, (List) unsafe.getObject(obj, j7), z7);
                    i10 += r02;
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j7);
                    int i30 = zznu.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzz3 = zznu.zzi(list7);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzA = size * zzz7;
                        r02 = zzz3 + zzA;
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
                    int i31 = zznu.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzz3 = zznu.zzj(list8);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzA = size * zzz7;
                        r02 = zzz3 + zzA;
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
                    zze = zznu.zze((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzc((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzg((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzl((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzf((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zze((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzc((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    int i32 = zznu.zza;
                    zze = list9.size();
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzk((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zza((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzc((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zze((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzi((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zze = zznu.zzj((List) unsafe.getObject(obj, j7));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i14 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r12 = zzz8 + zzz9 + zze;
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
                    zzns zzv2 = zzv(i9);
                    int i33 = zznu.zza;
                    int size6 = r06.size();
                    if (size6 == 0) {
                        r42 = z7;
                    } else {
                        boolean z9 = z7;
                        r42 = z9;
                        ?? r35 = z9;
                        while (r35 < size6) {
                            int zzw = zzlk.zzw(i14, (zznh) r06.get(r35), zzv2);
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
                    zznb zznbVar = (zznb) unsafe.getObject(obj, j7);
                    if (zznbVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zznbVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i9 += 3;
                    i11 = i7;
                    z8 = z6;
                    z7 = false;
                    i8 = 1048575;
                case 51:
                    if (zzM(obj, i14, i9)) {
                        zzz = zzlk.zzz(i14 << 3);
                        r02 = zzz + 8;
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
                    if (zzM(obj, i14, i9)) {
                        zzz2 = zzlk.zzz(i14 << 3);
                        r02 = zzz2 + 4;
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
                    if (zzM(obj, i14, i9)) {
                        long zzt = zzt(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(zzt);
                        r02 = zzz3 + zzA;
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
                    if (zzM(obj, i14, i9)) {
                        long zzt2 = zzt(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(zzt2);
                        r02 = zzz3 + zzA;
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
                    if (zzM(obj, i14, i9)) {
                        long zzo = zzo(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(zzo);
                        r02 = zzz3 + zzA;
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
                    if (zzM(obj, i14, i9)) {
                        zzz = zzlk.zzz(i14 << 3);
                        r02 = zzz + 8;
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
                    if (zzM(obj, i14, i9)) {
                        zzz2 = zzlk.zzz(i14 << 3);
                        r02 = zzz2 + 4;
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
                    if (zzM(obj, i14, i9)) {
                        zzz4 = zzlk.zzz(i14 << 3);
                        r02 = zzz4 + 1;
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
                    if (zzM(obj, i14, i9)) {
                        int i34 = i14 << 3;
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof zzld) {
                            zzz5 = zzlk.zzz(i34);
                            zzd = ((zzld) object2).zzd();
                            zzz6 = zzlk.zzz(zzd);
                            r02 = zzz5 + zzz6 + zzd;
                            i10 += r02;
                            i9 += 3;
                            i11 = i7;
                            z8 = z6;
                            z7 = false;
                            i8 = 1048575;
                        } else {
                            zzz3 = zzlk.zzz(i34);
                            zzA = zzlk.zzy((String) object2);
                            r02 = zzz3 + zzA;
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
                    if (zzM(obj, i14, i9)) {
                        r02 = zznu.zzh(i14, unsafe.getObject(obj, j7), zzv(i9));
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
                    if (zzM(obj, i14, i9)) {
                        zzld zzldVar2 = (zzld) unsafe.getObject(obj, j7);
                        zzz5 = zzlk.zzz(i14 << 3);
                        zzd = zzldVar2.zzd();
                        zzz6 = zzlk.zzz(zzd);
                        r02 = zzz5 + zzz6 + zzd;
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
                    if (zzM(obj, i14, i9)) {
                        int zzo2 = zzo(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzz(zzo2);
                        r02 = zzz3 + zzA;
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
                    if (zzM(obj, i14, i9)) {
                        long zzo3 = zzo(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(zzo3);
                        r02 = zzz3 + zzA;
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
                    if (zzM(obj, i14, i9)) {
                        zzz2 = zzlk.zzz(i14 << 3);
                        r02 = zzz2 + 4;
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
                    if (zzM(obj, i14, i9)) {
                        zzz = zzlk.zzz(i14 << 3);
                        r02 = zzz + 8;
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
                    if (zzM(obj, i14, i9)) {
                        int zzo4 = zzo(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzz((zzo4 >> 31) ^ (zzo4 + zzo4));
                        r02 = zzz3 + zzA;
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
                    if (zzM(obj, i14, i9)) {
                        long zzt3 = zzt(obj, j7);
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
                        r02 = zzz3 + zzA;
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
                    if (zzM(obj, i14, i9)) {
                        r02 = zzlk.zzw(i14, (zznh) unsafe.getObject(obj, j7), zzv(i9));
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
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int floatToIntBits;
        int i8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i9 >= iArr.length) {
                int hashCode = (i10 * 53) + ((zzmd) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzma) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzs = zzs(i9);
            int i11 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i12 = iArr[i9];
            long j7 = i11;
            int i13 = 37;
            switch (zzr) {
                case 0:
                    i7 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzol.zza(obj, j7));
                    byte[] bArr = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 1:
                    i7 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(zzol.zzb(obj, j7));
                    i10 = i7 + floatToIntBits;
                    break;
                case 2:
                    i7 = i10 * 53;
                    doubleToLongBits = zzol.zzd(obj, j7);
                    byte[] bArr2 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 3:
                    i7 = i10 * 53;
                    doubleToLongBits = zzol.zzd(obj, j7);
                    byte[] bArr3 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 4:
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzc(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 5:
                    i7 = i10 * 53;
                    doubleToLongBits = zzol.zzd(obj, j7);
                    byte[] bArr4 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 6:
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzc(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 7:
                    i7 = i10 * 53;
                    floatToIntBits = zzmk.zza(zzol.zzw(obj, j7));
                    i10 = i7 + floatToIntBits;
                    break;
                case 8:
                    i7 = i10 * 53;
                    floatToIntBits = ((String) zzol.zzf(obj, j7)).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 9:
                    i8 = i10 * 53;
                    Object zzf = zzol.zzf(obj, j7);
                    if (zzf != null) {
                        i13 = zzf.hashCode();
                    }
                    i10 = i8 + i13;
                    break;
                case 10:
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzf(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 11:
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzc(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzc(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 13:
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzc(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 14:
                    i7 = i10 * 53;
                    doubleToLongBits = zzol.zzd(obj, j7);
                    byte[] bArr5 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 15:
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzc(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 16:
                    i7 = i10 * 53;
                    doubleToLongBits = zzol.zzd(obj, j7);
                    byte[] bArr6 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 17:
                    i8 = i10 * 53;
                    Object zzf2 = zzol.zzf(obj, j7);
                    if (zzf2 != null) {
                        i13 = zzf2.hashCode();
                    }
                    i10 = i8 + i13;
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
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzf(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 50:
                    i7 = i10 * 53;
                    floatToIntBits = zzol.zzf(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 51:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j7));
                        byte[] bArr7 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j7));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr8 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr9 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzo(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr10 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzo(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzmk.zza(zzN(obj, j7));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = ((String) zzol.zzf(obj, j7)).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzol.zzf(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzol.zzf(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzo(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzo(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzo(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr11 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzo(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr12 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = zzol.zzf(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
            }
            i9 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0f55, code lost:
    
        if (r2 == 1048575) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0f57, code lost:
    
        r12.putInt(r44, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0f5b, code lost:
    
        r2 = r43.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0f5f, code lost:
    
        if (r2 >= r43.zzk) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0f61, code lost:
    
        r3 = r43.zzi;
        r6 = r43.zzc;
        r3 = r3[r2];
        r6 = r6[r3];
        r6 = com.google.android.gms.internal.measurement.zzol.zzf(r44, zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0f73, code lost:
    
        if (r6 != null) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0f7e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0f7b, code lost:
    
        if (zzu(r3) != null) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0f80, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.zznb) r6;
        r1 = (com.google.android.gms.internal.measurement.zzna) zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0f88, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0f8b, code lost:
    
        if (r8 != 0) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0f8d, code lost:
    
        if (r1 != r14) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f95, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f9a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0f96, code lost:
    
        if (r1 > r14) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0f98, code lost:
    
        if (r4 != r8) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0fa0, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0ba4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0bb7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0ec2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0ed6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:653:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r44, byte[] r45, int r46, int r47, int r48, com.google.android.gms.internal.measurement.zzks r49) {
        /*
            Method dump skipped, instructions count: 4146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznk.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzks):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final Object zze() {
        return ((zzmd) this.zzg).zzcj();
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzmd) {
                zzmd zzmdVar = (zzmd) obj;
                zzmdVar.zzcu(C3643a.e.API_PRIORITY_OTHER);
                zzmdVar.zza = 0;
                zzmdVar.zzcs();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int zzs = zzs(i7);
                int i8 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j7 = i8;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                ((zzmj) zzol.zzf(obj, j7)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zznb) object).zzc();
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i7], i7)) {
                        zzv(i7).zzf(zzb.getObject(obj, j7));
                    }
                }
                if (zzI(obj, i7)) {
                    zzv(i7).zzf(zzb.getObject(obj, j7));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i7 >= iArr.length) {
                zznu.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznu.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzs = zzs(i7);
            int i8 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (zzr) {
                case 0:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzo(obj, j7, zzol.zza(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzp(obj, j7, zzol.zzb(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzr(obj, j7, zzol.zzd(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzr(obj, j7, zzol.zzd(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzq(obj, j7, zzol.zzc(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzr(obj, j7, zzol.zzd(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzq(obj, j7, zzol.zzc(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzm(obj, j7, zzol.zzw(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzs(obj, j7, zzol.zzf(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i7);
                    break;
                case 10:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzs(obj, j7, zzol.zzf(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzq(obj, j7, zzol.zzc(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzq(obj, j7, zzol.zzc(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzq(obj, j7, zzol.zzc(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzr(obj, j7, zzol.zzd(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzq(obj, j7, zzol.zzc(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i7)) {
                        break;
                    } else {
                        zzol.zzr(obj, j7, zzol.zzd(obj2, j7));
                        zzD(obj, i7);
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i7);
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
                    zzmj zzmjVar = (zzmj) zzol.zzf(obj, j7);
                    zzmj zzmjVar2 = (zzmj) zzol.zzf(obj2, j7);
                    int size = zzmjVar.size();
                    int size2 = zzmjVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmjVar.zzc()) {
                            zzmjVar = zzmjVar.zzd(size2 + size);
                        }
                        zzmjVar.addAll(zzmjVar2);
                    }
                    if (size > 0) {
                        zzmjVar2 = zzmjVar;
                    }
                    zzol.zzs(obj, j7, zzmjVar2);
                    break;
                case 50:
                    int i10 = zznu.zza;
                    zzol.zzs(obj, j7, zznc.zza(zzol.zzf(obj, j7), zzol.zzf(obj2, j7)));
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
                    if (!zzM(obj2, i9, i7)) {
                        break;
                    } else {
                        zzol.zzs(obj, j7, zzol.zzf(obj2, j7));
                        zzE(obj, i9, i7);
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    zzC(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i9, i7)) {
                        break;
                    } else {
                        zzol.zzs(obj, j7, zzol.zzf(obj2, j7));
                        zzE(obj, i9, i7);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzh(Object obj, byte[] bArr, int i7, int i8, zzks zzksVar) {
        zzc(obj, bArr, i7, i8, 0, zzksVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.measurement.zzns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r20, com.google.android.gms.internal.measurement.zzor r21) {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznk.zzi(java.lang.Object, com.google.android.gms.internal.measurement.zzor):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzs = zzs(i7);
            long j7 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i7) && Double.doubleToLongBits(zzol.zza(obj, j7)) == Double.doubleToLongBits(zzol.zza(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i7) && Float.floatToIntBits(zzol.zzb(obj, j7)) == Float.floatToIntBits(zzol.zzb(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i7) && zzol.zzd(obj, j7) == zzol.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i7) && zzol.zzd(obj, j7) == zzol.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i7) && zzol.zzc(obj, j7) == zzol.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i7) && zzol.zzd(obj, j7) == zzol.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i7) && zzol.zzc(obj, j7) == zzol.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i7) && zzol.zzw(obj, j7) == zzol.zzw(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i7) && zznu.zzE(zzol.zzf(obj, j7), zzol.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i7) && zznu.zzE(zzol.zzf(obj, j7), zzol.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i7) && zznu.zzE(zzol.zzf(obj, j7), zzol.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i7) && zzol.zzc(obj, j7) == zzol.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzH(obj, obj2, i7) && zzol.zzc(obj, j7) == zzol.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i7) && zzol.zzc(obj, j7) == zzol.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i7) && zzol.zzd(obj, j7) == zzol.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i7) && zzol.zzc(obj, j7) == zzol.zzc(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i7) && zzol.zzd(obj, j7) == zzol.zzd(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i7) && zznu.zzE(zzol.zzf(obj, j7), zzol.zzf(obj2, j7))) {
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
                    zzE = zznu.zzE(zzol.zzf(obj, j7), zzol.zzf(obj2, j7));
                    break;
                case 50:
                    zzE = zznu.zzE(zzol.zzf(obj, j7), zzol.zzf(obj2, j7));
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
                    long zzp = zzp(i7) & 1048575;
                    if (zzol.zzc(obj, zzp) == zzol.zzc(obj2, zzp) && zznu.zzE(zzol.zzf(obj, j7), zzol.zzf(obj2, j7))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzmd) obj).zzc.equals(((zzmd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzma) obj).zzb.equals(((zzma) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzk(Object obj) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i12 = iArr[i10];
            int i13 = iArr2[i12];
            int zzs = zzs(i12);
            int i14 = iArr2[i12 + 2];
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
            if ((268435456 & zzs) != 0 && !zzJ(obj, i12, i7, i8, i16)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i13, i12) && !zzK(obj, zzs, zzv(i12))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zznb) zzol.zzf(obj, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzol.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzns zzv = zzv(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzv.zzk(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i12, i7, i8, i16) && !zzK(obj, zzs, zzv(i12))) {
                return false;
            }
            i10++;
            i11 = i7;
            i9 = i8;
        }
        return !this.zzh || ((zzma) obj).zzb.zzh();
    }
}
