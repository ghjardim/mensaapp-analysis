package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzop {
    public static final zzop zza;
    public static final zzop zzb;
    public static final zzop zzc;
    public static final zzop zzd;
    public static final zzop zze;
    public static final zzop zzf;
    public static final zzop zzg;
    public static final zzop zzh;
    public static final zzop zzi;
    public static final zzop zzj;
    public static final zzop zzk;
    public static final zzop zzl;
    public static final zzop zzm;
    public static final zzop zzn;
    public static final zzop zzo;
    public static final zzop zzp;
    public static final zzop zzq;
    public static final zzop zzr;
    private static final /* synthetic */ zzop[] zzs;
    private final zzoq zzt;

    static {
        zzop zzopVar = new zzop("DOUBLE", 0, zzoq.DOUBLE, 1);
        zza = zzopVar;
        zzop zzopVar2 = new zzop("FLOAT", 1, zzoq.FLOAT, 5);
        zzb = zzopVar2;
        zzoq zzoqVar = zzoq.LONG;
        zzop zzopVar3 = new zzop("INT64", 2, zzoqVar, 0);
        zzc = zzopVar3;
        zzop zzopVar4 = new zzop("UINT64", 3, zzoqVar, 0);
        zzd = zzopVar4;
        zzoq zzoqVar2 = zzoq.INT;
        zzop zzopVar5 = new zzop("INT32", 4, zzoqVar2, 0);
        zze = zzopVar5;
        zzop zzopVar6 = new zzop("FIXED64", 5, zzoqVar, 1);
        zzf = zzopVar6;
        zzop zzopVar7 = new zzop("FIXED32", 6, zzoqVar2, 5);
        zzg = zzopVar7;
        zzop zzopVar8 = new zzop("BOOL", 7, zzoq.BOOLEAN, 0);
        zzh = zzopVar8;
        zzop zzopVar9 = new zzop("STRING", 8, zzoq.STRING, 2);
        zzi = zzopVar9;
        zzoq zzoqVar3 = zzoq.MESSAGE;
        zzop zzopVar10 = new zzop("GROUP", 9, zzoqVar3, 3);
        zzj = zzopVar10;
        zzop zzopVar11 = new zzop("MESSAGE", 10, zzoqVar3, 2);
        zzk = zzopVar11;
        zzop zzopVar12 = new zzop("BYTES", 11, zzoq.BYTE_STRING, 2);
        zzl = zzopVar12;
        zzop zzopVar13 = new zzop("UINT32", 12, zzoqVar2, 0);
        zzm = zzopVar13;
        zzop zzopVar14 = new zzop("ENUM", 13, zzoq.ENUM, 0);
        zzn = zzopVar14;
        zzop zzopVar15 = new zzop("SFIXED32", 14, zzoqVar2, 5);
        zzo = zzopVar15;
        zzop zzopVar16 = new zzop("SFIXED64", 15, zzoqVar, 1);
        zzp = zzopVar16;
        zzop zzopVar17 = new zzop("SINT32", 16, zzoqVar2, 0);
        zzq = zzopVar17;
        zzop zzopVar18 = new zzop("SINT64", 17, zzoqVar, 0);
        zzr = zzopVar18;
        zzs = new zzop[]{zzopVar, zzopVar2, zzopVar3, zzopVar4, zzopVar5, zzopVar6, zzopVar7, zzopVar8, zzopVar9, zzopVar10, zzopVar11, zzopVar12, zzopVar13, zzopVar14, zzopVar15, zzopVar16, zzopVar17, zzopVar18};
    }

    private zzop(String str, int i7, zzoq zzoqVar, int i8) {
        this.zzt = zzoqVar;
    }

    public static zzop[] values() {
        return (zzop[]) zzs.clone();
    }

    public final zzoq zza() {
        return this.zzt;
    }
}
