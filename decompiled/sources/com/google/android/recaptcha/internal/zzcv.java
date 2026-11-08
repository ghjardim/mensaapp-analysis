package com.google.android.recaptcha.internal;

import android.app.Application;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5469l;
import p198b6.AbstractC3558c;
import p198b6.InterfaceC3556a;
import p371w5.AbstractC6924g;
import p372x.AbstractC6935a;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final InterfaceC3556a zzb = AbstractC3558c.m14354b(false, 1, null);
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        Map map;
        Map map2;
        this.zza = application;
        int i7 = 1;
        this.zze = new zzl(null, i7, 0 == true ? 1 : 0);
        int i8 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(zzaz.class.getName().hashCode(), new zzaz(null, 1, null)), new zzaw(zzfu.class.getName().hashCode(), new zzfu()), new zzaw(zzbe.class.getName().hashCode(), new zzbe()), new zzaw(zzjd.class.getName().hashCode(), new zzjd()), new zzaw(zzbr.class.getName().hashCode(), new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(zzex.class.getName().hashCode(), new zzex(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0)), new zzaw(zzfk.class.getName().hashCode(), new zzfk(true)), new zzaw(Application.class.getName().hashCode(), application), new zzaw(zzbf.class.getName().hashCode(), new zzbf(application)), new zzaw(zzfj.class.getName().hashCode(), new zzfj()), new zzaw(zzaq.class.getName().hashCode(), new zzbm(application)), new zzaw(zzey.class.getName().hashCode(), new zzfa()), new zzaw(zzff.class.getName().hashCode(), new zzff())};
        for (int i9 = 0; i9 < 13; i9++) {
            zzaw zzawVar = zzawVarArr[i9];
            map = zzav.zzc;
            if (!map.containsKey(Integer.valueOf(zzawVar.zza()))) {
                map2 = zzav.zzc;
                map2.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (AbstractC5469l.m23024a(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j7) {
        if (j7 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (AbstractC6935a.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return AbstractC5469l.m23024a(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j7, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, InterfaceC7157e interfaceC7157e, int i7, Object obj) {
        return zzcvVar.zzg(str, (i7 & 2) != 0 ? 10000L : j7, null, (i7 & 8) != 0 ? zzcvVar.zzf : zzbiVar, (i7 & 16) != 0 ? zzch.zza : zzchVar, interfaceC7157e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r6, int r7, p069J5.InterfaceC0804p r8, p392z5.InterfaceC7157e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            p371w5.AbstractC6928k.m28382b(r9)     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L50
        L2b:
            r7 = move-exception
            goto L5c
        L2d:
            r7 = move-exception
            goto L74
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            p371w5.AbstractC6928k.m28382b(r9)
            com.google.android.recaptcha.internal.zzbi r9 = r5.zzf
            com.google.android.recaptcha.internal.zzek r6 = r5.zzk(r6, r9, r7)
            r7 = 6
            com.google.android.recaptcha.internal.zzen r7 = r6.zzf(r7)
            r0.zzd = r7     // Catch: java.lang.Exception -> L55 com.google.android.recaptcha.internal.zzbd -> L57
            r0.zzc = r3     // Catch: java.lang.Exception -> L55 com.google.android.recaptcha.internal.zzbd -> L57
            java.lang.Object r9 = r8.invoke(r6, r0)     // Catch: java.lang.Exception -> L55 com.google.android.recaptcha.internal.zzbd -> L57
            if (r9 == r1) goto L54
            r6 = r7
        L50:
            r6.zza()     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            return r9
        L54:
            return r1
        L55:
            r6 = move-exception
            goto L59
        L57:
            r6 = move-exception
            goto L71
        L59:
            r4 = r7
            r7 = r6
            r6 = r4
        L5c:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            com.google.android.recaptcha.RecaptchaException r6 = r8.zzc()
            throw r6
        L71:
            r4 = r7
            r7 = r6
            r6 = r4
        L74:
            r6.zzb(r7)
            com.google.android.recaptcha.RecaptchaException r6 = r7.zzc()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzj(java.lang.String, int, J5.p, z5.e):java.lang.Object");
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i7) {
        String uuid = UUID.randomUUID().toString();
        int i8 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) AbstractC6924g.m28367a(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, uuid, i7, this.zza, zzesVar, null);
        zzekVar.zzc(uuid);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: all -> 0x00cd, TryCatch #1 {all -> 0x00cd, blocks: (B:25:0x0086, B:29:0x009c, B:34:0x0091), top: B:24:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzcn r26, com.google.android.recaptcha.internal.zzbi r27, com.google.android.recaptcha.internal.zzch r28, p392z5.InterfaceC7157e r29) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzg(java.lang.String, long, com.google.android.recaptcha.internal.zzcn, com.google.android.recaptcha.internal.zzbi, com.google.android.recaptcha.internal.zzch, z5.e):java.lang.Object");
    }
}
