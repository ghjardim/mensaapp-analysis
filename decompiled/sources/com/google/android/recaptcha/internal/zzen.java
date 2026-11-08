package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzen {
    private static zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeo zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzen(int i7, String str, int i8, String str2, String str3, String str4, String str5, zzeo zzeoVar, zzcc zzccVar, Context context, Integer num) {
        this.zzk = i7;
        this.zzb = str;
        this.zzl = i8;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:35:0x00e1
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private final void zzc(int r13, com.google.android.recaptcha.internal.zzqq r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzen.zzc(int, com.google.android.recaptcha.internal.zzqq):void");
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(zzbd zzbdVar) {
        zzqo zzg = zzqq.zzg();
        zzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzg.zze(zzbdVar.zza().zza());
        zzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String zzd = zzbdVar.zzd();
        if (zzd != null) {
            zzg.zzf(zzd);
        }
        zzc(4, (zzqq) zzg.zzk());
    }
}
