package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;
import p132S5.AbstractC2384i;
import p371w5.AbstractC6924g;
import p371w5.AbstractC6930m;
import p371w5.C6926i;
import p371w5.InterfaceC6923f;
import p378x5.AbstractC7004D;
import p378x5.AbstractC7025p;
import p378x5.AbstractC7032w;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final InterfaceC6923f zzd;
    private final InterfaceC6923f zze;
    private final InterfaceC6923f zzf;
    private final InterfaceC6923f zzg;
    private final InterfaceC6923f zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i7 = zzav.zza;
        this.zzd = AbstractC6924g.m28367a(zzdm.zza);
        this.zze = AbstractC6924g.m28367a(zzdn.zza);
        this.zzf = AbstractC6924g.m28367a(zzdo.zza);
        this.zzg = AbstractC6924g.m28367a(zzdp.zza);
        this.zzh = AbstractC6924g.m28367a(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r11, long r12, p392z5.InterfaceC7157e r14) {
        /*
            r10 = this;
            r0 = 1
            boolean r1 = r14 instanceof com.google.android.recaptcha.internal.zzdj
            if (r1 == 0) goto L14
            r1 = r14
            com.google.android.recaptcha.internal.zzdj r1 = (com.google.android.recaptcha.internal.zzdj) r1
            int r2 = r1.zzd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.zzd = r2
            goto L19
        L14:
            com.google.android.recaptcha.internal.zzdj r1 = new com.google.android.recaptcha.internal.zzdj
            r1.<init>(r10, r14)
        L19:
            java.lang.Object r14 = r1.zzb
            java.lang.Object r8 = p006A5.AbstractC0024c.m76e()
            int r2 = r1.zzd
            r9 = 2
            if (r2 == 0) goto L47
            if (r2 == r0) goto L39
            if (r2 == r9) goto L30
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            java.lang.Object r11 = r1.zza
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            p371w5.AbstractC6928k.m28382b(r14)
            goto Lbc
        L39:
            java.lang.Object r11 = r1.zza
            com.google.android.recaptcha.internal.zzdt r11 = (com.google.android.recaptcha.internal.zzdt) r11
            p371w5.AbstractC6928k.m28382b(r14)
            w5.j r14 = (p371w5.C6927j) r14
            java.lang.Object r12 = r14.m28380i()
            goto L83
        L47:
            p371w5.AbstractC6928k.m28382b(r14)
            java.lang.String r14 = r11.zzO()
            zzy(r14)
            java.util.List r14 = r10.zzw()
            java.util.Iterator r14 = r14.iterator()
        L59:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r14.next()
            com.google.android.recaptcha.internal.zze r2 = (com.google.android.recaptcha.internal.zze) r2
            com.google.android.recaptcha.internal.zzl r3 = r10.zzc
            com.google.android.recaptcha.internal.zze[] r4 = new com.google.android.recaptcha.internal.zze[r0]
            r5 = 0
            r4[r5] = r2
            r3.zzf(r4)
            goto L59
        L70:
            com.google.android.recaptcha.internal.zzl r2 = r10.zzc
            com.google.android.recaptcha.internal.zzek r6 = r10.zzb
            r1.zza = r10
            r1.zzd = r0
            r3 = r12
            r5 = r11
            r7 = r1
            java.lang.Object r12 = r2.zzc(r3, r5, r6, r7)
            if (r12 != r8) goto L82
            goto Lba
        L82:
            r11 = r10
        L83:
            java.lang.Throwable r12 = p371w5.C6927j.m28375d(r12)
            if (r12 != 0) goto L8c
            w5.q r11 = p371w5.C6934q.f24811a
            return r11
        L8c:
            com.google.android.recaptcha.internal.zzbi r13 = r11.zzi
            S5.J r13 = r13.zzd()
            z5.i r13 = r13.mo7995l()
            r14 = 0
            p132S5.AbstractC2417y0.m8196e(r13, r14, r0, r14)
            com.google.android.recaptcha.internal.zzbi r11 = r11.zzi
            S5.J r11 = r11.zzd()
            z5.i r11 = r11.mo7995l()
            S5.u0 r11 = p132S5.AbstractC2417y0.m8201j(r11)
            Q5.c r11 = r11.getChildren()
            java.util.List r11 = p118Q5.AbstractC2218k.m7623i(r11)
            r1.zza = r12
            r1.zzd = r9
            java.lang.Object r11 = p132S5.AbstractC2378f.m8085b(r11, r1)
            if (r11 != r8) goto Lbb
        Lba:
            return r8
        Lbb:
            r11 = r12
        Lbc:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, z5.e):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return AbstractC7032w.m28889O(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i7 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            AbstractC5469l.m23026c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i7 = zzav.zza;
            ((zzfu) AbstractC6924g.m28367a(zzde.zza).getValue()).zza(zzj);
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e7.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(java.lang.String r6, long r7, p392z5.InterfaceC7157e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            p371w5.AbstractC6928k.m28382b(r9)     // Catch: java.lang.Exception -> L2b p132S5.C2354T0 -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            goto L55
        L2b:
            r7 = move-exception
            goto L66
        L2d:
            r7 = move-exception
            goto L78
        L2f:
            r7 = move-exception
            goto L8a
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            p371w5.AbstractC6928k.m28382b(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r2 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzl r2 = r5.zzc     // Catch: java.lang.Exception -> L5c p132S5.C2354T0 -> L5f com.google.android.recaptcha.internal.zzbd -> L62
            r0.zzd = r9     // Catch: java.lang.Exception -> L5c p132S5.C2354T0 -> L5f com.google.android.recaptcha.internal.zzbd -> L62
            r0.zzc = r3     // Catch: java.lang.Exception -> L5c p132S5.C2354T0 -> L5f com.google.android.recaptcha.internal.zzbd -> L62
            java.lang.Object r6 = r2.zzb(r6, r7, r0)     // Catch: java.lang.Exception -> L5c p132S5.C2354T0 -> L5f com.google.android.recaptcha.internal.zzbd -> L62
            if (r6 == r1) goto L5b
            r4 = r9
            r9 = r6
            r6 = r4
        L55:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch: java.lang.Exception -> L2b p132S5.C2354T0 -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            r6.zza()     // Catch: java.lang.Exception -> L2b p132S5.C2354T0 -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            return r9
        L5b:
            return r1
        L5c:
            r6 = move-exception
            r7 = r6
            goto L65
        L5f:
            r6 = move-exception
            r7 = r6
            goto L77
        L62:
            r6 = move-exception
            r7 = r6
            goto L89
        L65:
            r6 = r9
        L66:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L77:
            r6 = r9
        L78:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L89:
            r6 = r9
        L8a:
            r6.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, z5.e):java.lang.Object");
    }

    public final Object zzm(zzsp zzspVar, String str, long j7, InterfaceC7157e interfaceC7157e) {
        return AbstractC2384i.m8118g(this.zzi.zza().mo7995l(), new zzdg(this, str, j7, zzspVar, null), interfaceC7157e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzn(com.google.android.recaptcha.internal.zzsc r11, long r12, p392z5.InterfaceC7157e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            p371w5.AbstractC6928k.m28382b(r14)     // Catch: java.lang.Exception -> L29 p132S5.C2354T0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L4d
        L29:
            r11 = move-exception
            goto L50
        L2b:
            r11 = move-exception
            goto L5e
        L2d:
            r11 = move-exception
            goto L6c
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            p371w5.AbstractC6928k.m28382b(r14)
            com.google.android.recaptcha.internal.zzdl r14 = new com.google.android.recaptcha.internal.zzdl     // Catch: java.lang.Exception -> L29 p132S5.C2354T0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L29 p132S5.C2354T0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r0.zzc = r3     // Catch: java.lang.Exception -> L29 p132S5.C2354T0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            java.lang.Object r11 = p132S5.AbstractC2358V0.m8039c(r12, r14, r0)     // Catch: java.lang.Exception -> L29 p132S5.C2354T0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            if (r11 != r1) goto L4d
            return r1
        L4d:
            w5.q r11 = p371w5.C6934q.f24811a
            return r11
        L50:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L5e:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L6c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzo(long r7, p392z5.InterfaceC7157e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            com.google.android.recaptcha.internal.zzen r7 = r0.zze
            com.google.android.recaptcha.internal.zzdt r8 = r0.zzd
            p371w5.AbstractC6928k.m28382b(r9)     // Catch: java.lang.Exception -> L2d p132S5.C2354T0 -> L2f com.google.android.recaptcha.internal.zzbd -> L31
            goto L5d
        L2d:
            r9 = move-exception
            goto L6b
        L2f:
            r9 = move-exception
            goto L84
        L31:
            r9 = move-exception
            goto L9d
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            p371w5.AbstractC6928k.m28382b(r9)
            com.google.android.recaptcha.internal.zzek r9 = r6.zzb
            r2 = 22
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzds r2 = new com.google.android.recaptcha.internal.zzds     // Catch: java.lang.Exception -> L61 p132S5.C2354T0 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            r4 = 0
            r2.<init>(r6, r9, r4)     // Catch: java.lang.Exception -> L61 p132S5.C2354T0 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzd = r6     // Catch: java.lang.Exception -> L61 p132S5.C2354T0 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zze = r9     // Catch: java.lang.Exception -> L61 p132S5.C2354T0 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzc = r3     // Catch: java.lang.Exception -> L61 p132S5.C2354T0 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            java.lang.Object r7 = p132S5.AbstractC2358V0.m8039c(r7, r2, r0)     // Catch: java.lang.Exception -> L61 p132S5.C2354T0 -> L63 com.google.android.recaptcha.internal.zzbd -> L65
            if (r7 == r1) goto L60
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L5d:
            com.google.android.recaptcha.internal.zzsc r9 = (com.google.android.recaptcha.internal.zzsc) r9     // Catch: java.lang.Exception -> L2d p132S5.C2354T0 -> L2f com.google.android.recaptcha.internal.zzbd -> L31
            return r9
        L60:
            return r1
        L61:
            r7 = move-exception
            goto L67
        L63:
            r7 = move-exception
            goto L80
        L65:
            r7 = move-exception
            goto L99
        L67:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L6b:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L80:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L84:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L99:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L9d:
            com.google.android.recaptcha.internal.zzbb r0 = r9.zzb()
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r0 = kotlin.jvm.internal.AbstractC5469l.m23024a(r0, r1)
            if (r0 == 0) goto Lad
            com.google.android.recaptcha.internal.zzbd r9 = r8.zzs(r9, r9)
        Lad:
            r7.zzb(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, z5.e):java.lang.Object");
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1421h.m5528a(AbstractC7004D.m28732a(AbstractC7025p.m28868n(zzk, 10)), 16));
            for (zzst zzstVar : zzk) {
                C6926i m28383a = AbstractC6930m.m28383a(zzstVar.zzg(), zzstVar.zzi());
                linkedHashMap.put(m28383a.m28370c(), m28383a.m28371d());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e7) {
            zzf.zzb(e7);
        } catch (Exception e8) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e8.getMessage()));
        }
    }
}
