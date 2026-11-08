package com.google.android.recaptcha.internal;

import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzil extends AbstractC0068l implements InterfaceC0804p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzil(zzja zzjaVar, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzc = zzjaVar;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzil(this.zzc, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
    
        ((android.webkit.WebView) r7).setWebViewClient(new com.google.android.recaptcha.internal.zzik(r6.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        return p371w5.C6934q.f24811a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0057, code lost:
    
        ((android.webkit.WebView) r7).addJavascriptInterface(r6.zzc.zzq(), "RN");
        r7 = r6.zzc;
        r6.zzb = 4;
        r7 = r7.zzw(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007d, code lost:
    
        return r0;
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
            int r1 = r6.zzb
            java.lang.String r2 = "RN"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L17
            p371w5.AbstractC6928k.m28382b(r7)
            if (r1 == r3) goto L57
            goto L6e
        L17:
            java.lang.Object r1 = r6.zza
            com.google.android.recaptcha.internal.zzja r1 = (com.google.android.recaptcha.internal.zzja) r1
            p371w5.AbstractC6928k.m28382b(r7)
            goto L41
        L1f:
            p371w5.AbstractC6928k.m28382b(r7)
            goto L30
        L23:
            p371w5.AbstractC6928k.m28382b(r7)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zzb = r5
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7d
        L30:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r7.removeJavascriptInterface(r2)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zza = r7
            r6.zzb = r4
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7d
        L41:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            android.webkit.WebSettings r7 = r7.getSettings()
            r7.setJavaScriptEnabled(r5)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r1 = 0
            r6.zza = r1
            r6.zzb = r3
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7d
        L57:
            com.google.android.recaptcha.internal.zzja r1 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzij r1 = r1.zzq()
            r7.addJavascriptInterface(r1, r2)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r1 = 4
            r6.zzb = r1
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 != r0) goto L6e
            goto L7d
        L6e:
            com.google.android.recaptcha.internal.zzja r0 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzik r1 = new com.google.android.recaptcha.internal.zzik
            r1.<init>(r0)
            r7.setWebViewClient(r1)
            w5.q r7 = p371w5.C6934q.f24811a
            return r7
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzil.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
