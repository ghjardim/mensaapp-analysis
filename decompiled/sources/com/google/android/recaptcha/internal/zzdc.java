package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import p125R5.C2280f;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2348Q;

/* loaded from: classes.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final C2280f zza = new C2280f("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j7, RecaptchaAction recaptchaAction) {
        zzbd zzbdVar = !zza.m7722a(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j7 < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(com.google.android.recaptcha.RecaptchaAction r12, long r13, p392z5.InterfaceC7157e r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.internal.zzcy
            if (r0 == 0) goto L13
            r0 = r15
            com.google.android.recaptcha.internal.zzcy r0 = (com.google.android.recaptcha.internal.zzcy) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcy r0 = new com.google.android.recaptcha.internal.zzcy
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p371w5.AbstractC6928k.m28382b(r15)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L52
        L29:
            r12 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            p371w5.AbstractC6928k.m28382b(r15)
            java.util.UUID r15 = java.util.UUID.randomUUID()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            java.lang.String r15 = r15.toString()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzcz r2 = new com.google.android.recaptcha.internal.zzcz     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r10 = 0
            r4 = r2
            r5 = r11
            r6 = r13
            r8 = r12
            r9 = r15
            r4.<init>(r5, r6, r8, r9, r10)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            java.lang.Object r15 = r11.zzg(r15, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            if (r15 != r1) goto L52
            return r1
        L52:
            w5.j r15 = (p371w5.C6927j) r15     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            java.lang.Object r12 = r15.m28380i()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L67
        L59:
            w5.j$a r13 = p371w5.C6927j.f24803b
            com.google.android.recaptcha.RecaptchaException r12 = r12.zzc()
            java.lang.Object r12 = p371w5.AbstractC6928k.m28381a(r12)
            java.lang.Object r12 = p371w5.C6927j.m28373b(r12)
        L67:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzf(com.google.android.recaptcha.RecaptchaAction, long, z5.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(java.lang.String r5, p069J5.InterfaceC0804p r6, p392z5.InterfaceC7157e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzdb
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzdb r0 = (com.google.android.recaptcha.internal.zzdb) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdb r0 = new com.google.android.recaptcha.internal.zzdb
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            p371w5.AbstractC6928k.m28382b(r7)     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L53
        L2b:
            r6 = move-exception
            goto L58
        L2d:
            r6 = move-exception
            goto L69
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p371w5.AbstractC6928k.m28382b(r7)
            com.google.android.recaptcha.internal.zzek r7 = r4.zzd
            com.google.android.recaptcha.internal.zzek r7 = r7.zza()
            r7.zzc(r5)
            r5 = 9
            com.google.android.recaptcha.internal.zzen r5 = r7.zzf(r5)
            r0.zzd = r5     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r0.zzc = r3     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            java.lang.Object r7 = r6.invoke(r7, r0)     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            if (r7 == r1) goto L57
        L53:
            r5.zza()     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            return r7
        L57:
            return r1
        L58:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzX
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r0, r1, r6)
            r5.zzb(r7)
            throw r7
        L69:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzg(java.lang.String, J5.p, z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo29482execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r5, long r6, p392z5.InterfaceC7157e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcw
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzcw r0 = (com.google.android.recaptcha.internal.zzcw) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcw r0 = new com.google.android.recaptcha.internal.zzcw
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            p371w5.AbstractC6928k.m28382b(r8)
            w5.j r8 = (p371w5.C6927j) r8
            java.lang.Object r5 = r8.m28380i()
            goto L43
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p371w5.AbstractC6928k.m28382b(r8)
            r0.zzc = r3
            java.lang.Object r5 = r4.zzf(r5, r6, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.mo29482execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo29483executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, p392z5.InterfaceC7157e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcx
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            p371w5.AbstractC6928k.m28382b(r6)
            w5.j r6 = (p371w5.C6927j) r6
            java.lang.Object r5 = r6.m28380i()
            goto L45
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p371w5.AbstractC6928k.m28382b(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = r4.mo29482execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.mo29483executegIAlus(com.google.android.recaptcha.RecaptchaAction, z5.e):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        InterfaceC2348Q m8126b;
        m8126b = AbstractC2388k.m8126b(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, 10000L, null), 3, null);
        return zzas.zza(m8126b);
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j7) {
        InterfaceC2348Q m8126b;
        m8126b = AbstractC2388k.m8126b(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, j7, null), 3, null);
        return zzas.zza(m8126b);
    }
}
