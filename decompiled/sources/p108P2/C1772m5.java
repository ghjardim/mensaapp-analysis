package p108P2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdj;

/* renamed from: P2.m5 */
/* loaded from: classes.dex */
public final class C1772m5 implements Application.ActivityLifecycleCallbacks, InterfaceC1754k5 {

    /* renamed from: a */
    public final /* synthetic */ C1799p5 f5234a;

    public C1772m5(C1799p5 c1799p5) {
        this.f5234a = c1799p5;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // p108P2.InterfaceC1754k5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6091a(com.google.android.gms.internal.measurement.zzdj r9, android.os.Bundle r10) {
        /*
            r8 = this;
            P2.p5 r0 = r8.f5234a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            P2.C3 r1 = r0.f5129a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            P2.N2 r2 = r1.mo5624b()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            P2.L2 r2 = r2.m5940v()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            java.lang.String r3 = "onActivityCreated"
            r2.m5902a(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            android.content.Intent r2 = r9.zzc     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r2 == 0) goto L90
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r3 == 0) goto L2a
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r4 != 0) goto L22
            goto L2a
        L22:
            r4 = r3
            goto L42
        L24:
            r0 = move-exception
            goto Lb0
        L27:
            r0 = move-exception
            goto L9a
        L2a:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            r4 = 0
            if (r3 == 0) goto L42
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r5 != 0) goto L42
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            goto L22
        L42:
            if (r4 == 0) goto L90
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r3 != 0) goto L4b
            goto L90
        L4b:
            r1.m5619Q()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r2 != 0) goto L71
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r2 != 0) goto L71
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r0 == 0) goto L6d
            goto L71
        L6d:
            java.lang.String r0 = "auto"
        L6f:
            r5 = r0
            goto L74
        L71:
            java.lang.String r0 = "gs"
            goto L6f
        L74:
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            if (r10 != 0) goto L7f
            r0 = 1
        L7d:
            r3 = r0
            goto L81
        L7f:
            r0 = 0
            goto L7d
        L81:
            P2.v3 r0 = r1.mo5628f()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            P2.l5 r7 = new P2.l5     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            r0.m6446A(r7)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L27
            goto Lab
        L90:
            P2.C3 r0 = r0.f5129a
        L92:
            P2.J5 r0 = r0.m5616N()
            r0.m5885z(r9, r10)
            return
        L9a:
            P2.p5 r1 = r8.f5234a     // Catch: java.lang.Throwable -> L24
            P2.C3 r1 = r1.f5129a     // Catch: java.lang.Throwable -> L24
            P2.N2 r1 = r1.mo5624b()     // Catch: java.lang.Throwable -> L24
            P2.L2 r1 = r1.m5936r()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.m5903b(r2, r0)     // Catch: java.lang.Throwable -> L24
        Lab:
            P2.p5 r0 = r8.f5234a
            P2.C3 r0 = r0.f5129a
            goto L92
        Lb0:
            P2.p5 r1 = r8.f5234a
            P2.C3 r1 = r1.f5129a
            P2.J5 r1 = r1.m5616N()
            r1.m5885z(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1772m5.mo6091a(com.google.android.gms.internal.measurement.zzdj, android.os.Bundle):void");
    }

    @Override // p108P2.InterfaceC1754k5
    /* renamed from: b */
    public final void mo6092b(zzdj zzdjVar) {
        C1460C3 c1460c3 = this.f5234a.f5129a;
        c1460c3.m5616N().m5873B(zzdjVar);
        C1544L6 m5618P = c1460c3.m5618P();
        C1460C3 c1460c32 = m5618P.f5129a;
        c1460c32.mo5628f().m6446A(new RunnableC1481E6(m5618P, c1460c32.mo5626d().mo1111b()));
    }

    @Override // p108P2.InterfaceC1754k5
    /* renamed from: c */
    public final void mo6093c(zzdj zzdjVar) {
        this.f5234a.f5129a.m5616N().m5872A(zzdjVar);
    }

    @Override // p108P2.InterfaceC1754k5
    /* renamed from: d */
    public final void mo6094d(zzdj zzdjVar, Bundle bundle) {
        this.f5234a.f5129a.m5616N().m5875D(zzdjVar, bundle);
    }

    @Override // p108P2.InterfaceC1754k5
    /* renamed from: e */
    public final void mo6095e(zzdj zzdjVar) {
        C1460C3 c1460c3 = this.f5234a.f5129a;
        C1544L6 m5618P = c1460c3.m5618P();
        C1460C3 c1460c32 = m5618P.f5129a;
        c1460c32.mo5628f().m6446A(new RunnableC1472D6(m5618P, c1460c32.mo5626d().mo1111b()));
        c1460c3.m5616N().m5874C(zzdjVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo6091a(zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        mo6093c(zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        mo6092b(zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        mo6095e(zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo6094d(zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
