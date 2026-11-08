package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m29480getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j7, InterfaceC7157e interfaceC7157e, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j7 = 10000;
        }
        return recaptcha.m29481getClientBWLJW6A(application, str, j7, interfaceC7157e);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, InterfaceC7157e interfaceC7157e) {
        return zzcq.zzd(application, str, interfaceC7157e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m29481getClientBWLJW6A(android.app.Application r5, java.lang.String r6, long r7, p392z5.InterfaceC7157e r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p371w5.AbstractC6928k.m28382b(r9)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p371w5.AbstractC6928k.m28382b(r9)
            w5.j$a r9 = p371w5.C6927j.f24803b     // Catch: java.lang.Throwable -> L29
            r0.zzc = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r9 != r1) goto L41
            return r1
        L41:
            com.google.android.recaptcha.internal.zzdc r9 = (com.google.android.recaptcha.internal.zzdc) r9     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = p371w5.C6927j.m28373b(r9)     // Catch: java.lang.Throwable -> L29
            goto L52
        L48:
            w5.j$a r6 = p371w5.C6927j.f24803b
            java.lang.Object r5 = p371w5.AbstractC6928k.m28381a(r5)
            java.lang.Object r5 = p371w5.C6927j.m28373b(r5)
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m29481getClientBWLJW6A(android.app.Application, java.lang.String, long, z5.e):java.lang.Object");
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j7) {
        return zzcq.zzc(application, str, j7);
    }
}
