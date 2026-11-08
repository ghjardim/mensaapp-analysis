package com.google.android.recaptcha.internal;

import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(5:17|18|(1:20)|12|13))(4:21|22|23|24))(4:45|46|47|(1:49)(1:50))|25|26|(1:28)|29|31))|54|6|(0)(0)|25|26|(0)|29|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r10 = r0;
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: Exception -> 0x0097, TryCatch #1 {Exception -> 0x0097, blocks: (B:26:0x0086, B:28:0x0093, B:29:0x0099), top: B:25:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(java.lang.String r19, long r20, p392z5.InterfaceC7157e r22) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, z5.e):java.lang.Object");
    }

    public abstract Object zzd(String str, InterfaceC7157e interfaceC7157e);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r12 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:27:0x004d, B:28:0x007f, B:30:0x008e, B:31:0x0091), top: B:26:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(long r9, com.google.android.recaptcha.internal.zzsc r11, p392z5.InterfaceC7157e r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzd
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbd r9 = (com.google.android.recaptcha.internal.zzbd) r9
            p371w5.AbstractC6928k.m28382b(r12)
            goto Lbe
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            p371w5.AbstractC6928k.m28382b(r12)
            goto La9
        L47:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            p371w5.AbstractC6928k.m28382b(r12)     // Catch: java.lang.Exception -> L51
            goto L7f
        L51:
            r11 = move-exception
            goto L9a
        L53:
            p371w5.AbstractC6928k.m28382b(r12)
            com.google.android.recaptcha.internal.zzen r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L6a
            r12.zza()
            w5.j$a r9 = p371w5.C6927j.f24803b
            w5.q r9 = p371w5.C6934q.f24811a
            java.lang.Object r9 = p371w5.C6927j.m28373b(r9)
            return r9
        L6a:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L96
            r2.<init>(r8, r11, r3)     // Catch: java.lang.Exception -> L96
            r0.zza = r8     // Catch: java.lang.Exception -> L96
            r0.zze = r12     // Catch: java.lang.Exception -> L96
            r0.zzd = r6     // Catch: java.lang.Exception -> L96
            java.lang.Object r9 = p132S5.AbstractC2358V0.m8039c(r9, r2, r0)     // Catch: java.lang.Exception -> L96
            if (r9 == r1) goto Lc9
            r10 = r8
            r7 = r12
            r12 = r9
            r9 = r7
        L7f:
            w5.j r12 = (p371w5.C6927j) r12     // Catch: java.lang.Exception -> L51
            java.lang.Object r11 = r12.m28380i()     // Catch: java.lang.Exception -> L51
            p371w5.AbstractC6928k.m28382b(r11)     // Catch: java.lang.Exception -> L51
            w5.q r11 = p371w5.C6934q.f24811a     // Catch: java.lang.Exception -> L51
            r10.zza = r6     // Catch: java.lang.Exception -> L51
            if (r9 == 0) goto L91
            r9.zza()     // Catch: java.lang.Exception -> L51
        L91:
            java.lang.Object r9 = p371w5.C6927j.m28373b(r11)     // Catch: java.lang.Exception -> L51
            return r9
        L96:
            r9 = move-exception
            r11 = r9
            r10 = r8
            r9 = r12
        L9a:
            r12 = 0
            r10.zza = r12
            r0.zza = r10
            r0.zze = r9
            r0.zzd = r5
            java.lang.Object r12 = r10.zzj(r11, r0)
            if (r12 == r1) goto Lc9
        La9:
            r11 = r12
            com.google.android.recaptcha.internal.zzbd r11 = (com.google.android.recaptcha.internal.zzbd) r11
            if (r9 == 0) goto Lb1
            r9.zzb(r11)
        Lb1:
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto Lc9
            r9 = r11
        Lbe:
            w5.j$a r10 = p371w5.C6927j.f24803b
            java.lang.Object r9 = p371w5.AbstractC6928k.m28381a(r9)
            java.lang.Object r9 = p371w5.C6927j.m28373b(r9)
            return r9
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, z5.e):java.lang.Object");
    }

    public abstract Object zzf(String str, InterfaceC7157e interfaceC7157e);

    public Object zzg(zzbd zzbdVar, InterfaceC7157e interfaceC7157e) {
        return C6934q.f24811a;
    }

    public abstract Object zzh(zzsc zzscVar, InterfaceC7157e interfaceC7157e);

    public Object zzi(String str, long j7, Exception exc, InterfaceC7157e interfaceC7157e) {
        return C6934q.f24811a;
    }

    public Object zzj(Exception exc, InterfaceC7157e interfaceC7157e) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
