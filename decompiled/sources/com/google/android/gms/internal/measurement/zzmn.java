package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzmn {
    public static final zzmn zza;
    public static final zzmn zzb;
    public static final zzmn zzc;
    public static final zzmn zzd;
    public static final zzmn zze;
    public static final zzmn zzf;
    public static final zzmn zzg;
    public static final zzmn zzh;
    public static final zzmn zzi;
    public static final zzmn zzj;
    private static final /* synthetic */ zzmn[] zzk;
    private final Class zzl;

    static {
        zzmn zzmnVar = new zzmn("VOID", 0, Void.class, Void.class, null);
        zza = zzmnVar;
        Class cls = Integer.TYPE;
        zzmn zzmnVar2 = new zzmn("INT", 1, cls, Integer.class, 0);
        zzb = zzmnVar2;
        zzmn zzmnVar3 = new zzmn("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzmnVar3;
        zzmn zzmnVar4 = new zzmn("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzmnVar4;
        zzmn zzmnVar5 = new zzmn("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzmnVar5;
        zzmn zzmnVar6 = new zzmn("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzmnVar6;
        zzmn zzmnVar7 = new zzmn("STRING", 6, String.class, String.class, StringUtils.EMPTY);
        zzg = zzmnVar7;
        zzmn zzmnVar8 = new zzmn("BYTE_STRING", 7, zzld.class, zzld.class, zzld.zzb);
        zzh = zzmnVar8;
        zzmn zzmnVar9 = new zzmn("ENUM", 8, cls, Integer.class, null);
        zzi = zzmnVar9;
        zzmn zzmnVar10 = new zzmn("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzmnVar10;
        zzk = new zzmn[]{zzmnVar, zzmnVar2, zzmnVar3, zzmnVar4, zzmnVar5, zzmnVar6, zzmnVar7, zzmnVar8, zzmnVar9, zzmnVar10};
    }

    private zzmn(String str, int i7, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzmn[] values() {
        return (zzmn[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
