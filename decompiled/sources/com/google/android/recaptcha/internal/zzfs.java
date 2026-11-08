package com.google.android.recaptcha.internal;

import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzfs extends AbstractC0068l implements InterfaceC0804p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgdVar, zzft zzftVar, String str, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzfs(this.zzd, this.zze, this.zzf, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r7 != r0) goto L20;
     */
    @Override // p013B5.AbstractC0057a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p006A5.AbstractC0024c.m76e()
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L10
            p371w5.AbstractC6928k.m28382b(r7)
            goto L82
        L10:
            java.lang.Object r1 = r6.zzb
            com.google.android.recaptcha.internal.zzjh r1 = (com.google.android.recaptcha.internal.zzjh) r1
            java.lang.Object r2 = r6.zza
            com.google.android.recaptcha.internal.zzub r2 = (com.google.android.recaptcha.internal.zzub) r2
            p371w5.AbstractC6928k.m28382b(r7)     // Catch: java.lang.Exception -> L1c
            goto L5f
        L1c:
            r7 = move-exception
            goto L6f
        L1e:
            p371w5.AbstractC6928k.m28382b(r7)
            com.google.android.recaptcha.internal.zzgd r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbn r1 = new com.google.android.recaptcha.internal.zzbn
            r1.<init>()
            r7.zza = r1
            java.lang.String r7 = r6.zzf     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzkh r1 = com.google.android.recaptcha.internal.zzkh.zzh()     // Catch: java.lang.Exception -> L1c
            byte[] r7 = r1.zzj(r7)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzub r7 = com.google.android.recaptcha.internal.zzub.zzi(r7)     // Catch: java.lang.Exception -> L1c
            r7.zzf()     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzft r1 = r6.zze     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzhx r1 = com.google.android.recaptcha.internal.zzft.zzb(r1)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zztz r1 = r1.zza(r7)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzjh r3 = com.google.android.recaptcha.internal.zzjh.zzb()     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzft r4 = r6.zze     // Catch: java.lang.Exception -> L1c
            java.util.List r1 = r1.zzi()     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzgd r5 = r6.zzd     // Catch: java.lang.Exception -> L1c
            r6.zza = r7     // Catch: java.lang.Exception -> L1c
            r6.zzb = r3     // Catch: java.lang.Exception -> L1c
            r6.zzc = r2     // Catch: java.lang.Exception -> L1c
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzft.zzc(r4, r1, r5, r6)     // Catch: java.lang.Exception -> L1c
            if (r1 == r0) goto L81
            r2 = r7
            r1 = r3
        L5f:
            r1.zzf()     // Catch: java.lang.Exception -> L1c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L1c
            long r3 = r1.zza(r7)     // Catch: java.lang.Exception -> L1c
            p013B5.AbstractC0058b.m152d(r3)     // Catch: java.lang.Exception -> L1c
            r2.zzf()     // Catch: java.lang.Exception -> L1c
            goto L82
        L6f:
            com.google.android.recaptcha.internal.zzft r1 = r6.zze
            com.google.android.recaptcha.internal.zzgd r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzft.zzd(r1, r7, r2, r6)
            if (r7 != r0) goto L82
        L81:
            return r0
        L82:
            w5.q r7 = p371w5.C6934q.f24811a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
