package com.google.android.recaptcha.internal;

import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2334J;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* loaded from: classes.dex */
final class zzin extends AbstractC0068l implements InterfaceC0804p {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(zzja zzjaVar, String str, InterfaceC7157e interfaceC7157e) {
        super(2, interfaceC7157e);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // p013B5.AbstractC0057a
    public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
        return new zzin(this.zzb, this.zzc, interfaceC7157e);
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((InterfaceC2334J) obj, (InterfaceC7157e) obj2)).invokeSuspend(C6934q.f24811a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r4 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        return p371w5.C6934q.f24811a;
     */
    @Override // p013B5.AbstractC0057a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = p006A5.AbstractC0024c.m76e()
            int r1 = r3.zza
            r2 = 1
            p371w5.AbstractC6928k.m28382b(r4)
            if (r1 == 0) goto Lf
            if (r1 == r2) goto L19
            goto L2c
        Lf:
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            r3.zza = r2
            java.lang.Object r4 = r4.zzw(r3)
            if (r4 == r0) goto L2f
        L19:
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            r4.clearCache(r2)
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            java.lang.String r1 = r3.zzc
            r2 = 2
            r3.zza = r2
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzja.zzu(r4, r1, r3)
            if (r4 != r0) goto L2c
            goto L2f
        L2c:
            w5.q r4 = p371w5.C6934q.f24811a
            return r4
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
