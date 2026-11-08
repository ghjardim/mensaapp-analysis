package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Map;
import p052H2.BinderC0553b;
import p052H2.InterfaceC0552a;
import p108P2.AbstractC1453B5;
import p108P2.AbstractC1805q2;
import p108P2.C1460C3;
import p108P2.C1473D7;
import p108P2.C1501H;
import p108P2.C1519J;
import p108P2.C1633W6;
import p108P2.C1772m5;
import p108P2.C1799p5;
import p108P2.C1873x7;
import p108P2.InterfaceC1825s4;
import p108P2.RunnableC1551M4;
import p108P2.RunnableC1567O3;
import p108P2.RunnableC1568O4;
import p108P2.RunnableC1591R4;
import p108P2.RunnableC1616U5;
import p108P2.RunnableC1664a5;
import p108P2.RunnableC1798p4;
import p108P2.RunnableC1835t5;
import p108P2.RunnableC1854v6;
import p334s.C6308a;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends zzcu {

    /* renamed from: a */
    public C1460C3 f12635a = null;

    /* renamed from: b */
    public final Map f12636b = new C6308a();

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdb zzdbVar) {
        try {
            zzdbVar.zze();
        } catch (RemoteException e7) {
            ((C1460C3) AbstractC3802r.m15129k(appMeasurementDynamiteService.f12635a)).mo5624b().m5941w().m5903b("Failed to call IDynamiteUploadBatchesCallback", e7);
        }
    }

    /* renamed from: a */
    public final void m15201a() {
        if (this.f12635a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: b */
    public final void m15202b(zzcy zzcyVar, String str) {
        m15201a();
        this.f12635a.m5619Q().m5698N(zzcyVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void beginAdUnitExposure(String str, long j7) {
        m15201a();
        this.f12635a.m5604A().m5745l(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m15201a();
        this.f12635a.m5613K().m6226x(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearMeasurementEnabled(long j7) {
        m15201a();
        this.f12635a.m5613K().m6202W(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void endAdUnitExposure(String str, long j7) {
        m15201a();
        this.f12635a.m5604A().m5746m(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void generateEventId(zzcy zzcyVar) {
        m15201a();
        long m5684C0 = this.f12635a.m5619Q().m5684C0();
        m15201a();
        this.f12635a.m5619Q().m5697M(zzcyVar, m5684C0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getAppInstanceId(zzcy zzcyVar) {
        m15201a();
        this.f12635a.mo5628f().m6446A(new RunnableC1567O3(this, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCachedAppInstanceId(zzcy zzcyVar) {
        m15201a();
        m15202b(zzcyVar, this.f12635a.m5613K().m6217p0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getConditionalUserProperties(String str, String str2, zzcy zzcyVar) {
        m15201a();
        this.f12635a.mo5628f().m6446A(new RunnableC1616U5(this, zzcyVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenClass(zzcy zzcyVar) {
        m15201a();
        m15202b(zzcyVar, this.f12635a.m5613K().m6218q0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenName(zzcy zzcyVar) {
        m15201a();
        m15202b(zzcyVar, this.f12635a.m5613K().m6219r0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getGmpAppId(zzcy zzcyVar) {
        m15201a();
        C1799p5 m5613K = this.f12635a.m5613K();
        C1460C3 c1460c3 = m5613K.f5129a;
        String str = null;
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5418q1) || m5613K.f5129a.m5620R() == null) {
            try {
                str = AbstractC1453B5.m5580b(c1460c3.mo5625c(), "google_app_id", m5613K.f5129a.m5627e());
            } catch (IllegalStateException e7) {
                m5613K.f5129a.mo5624b().m5936r().m5903b("getGoogleAppId failed with exception", e7);
            }
        } else {
            str = m5613K.f5129a.m5620R();
        }
        m15202b(zzcyVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getMaxUserProperties(String str, zzcy zzcyVar) {
        m15201a();
        this.f12635a.m5613K().m6212j0(str);
        m15201a();
        this.f12635a.m5619Q().m5696L(zzcyVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getSessionId(zzcy zzcyVar) {
        m15201a();
        C1799p5 m5613K = this.f12635a.m5613K();
        m5613K.f5129a.mo5628f().m6446A(new RunnableC1664a5(m5613K, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getTestFlag(zzcy zzcyVar, int i7) {
        m15201a();
        if (i7 == 0) {
            this.f12635a.m5619Q().m5698N(zzcyVar, this.f12635a.m5613K().m6220s0());
            return;
        }
        if (i7 == 1) {
            this.f12635a.m5619Q().m5697M(zzcyVar, this.f12635a.m5613K().m6216o0().longValue());
            return;
        }
        if (i7 != 2) {
            if (i7 == 3) {
                this.f12635a.m5619Q().m5696L(zzcyVar, this.f12635a.m5613K().m6215n0().intValue());
                return;
            } else {
                if (i7 != 4) {
                    return;
                }
                this.f12635a.m5619Q().m5692H(zzcyVar, this.f12635a.m5613K().m6213l0().booleanValue());
                return;
            }
        }
        C1473D7 m5619Q = this.f12635a.m5619Q();
        double doubleValue = this.f12635a.m5613K().m6214m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            m5619Q.f5129a.mo5624b().m5941w().m5903b("Error returning double value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getUserProperties(String str, String str2, boolean z6, zzcy zzcyVar) {
        m15201a();
        this.f12635a.mo5628f().m6446A(new RunnableC1591R4(this, zzcyVar, str, str2, z6));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initForTests(Map map) {
        m15201a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initialize(InterfaceC0552a interfaceC0552a, zzdh zzdhVar, long j7) {
        C1460C3 c1460c3 = this.f12635a;
        if (c1460c3 == null) {
            this.f12635a = C1460C3.m5596J((Context) AbstractC3802r.m15129k((Context) BinderC0553b.m2137b(interfaceC0552a)), zzdhVar, Long.valueOf(j7));
        } else {
            c1460c3.mo5624b().m5941w().m5902a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void isDataCollectionEnabled(zzcy zzcyVar) {
        m15201a();
        this.f12635a.mo5628f().m6446A(new RunnableC1854v6(this, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7) {
        m15201a();
        this.f12635a.m5613K().m6183D(str, str2, bundle, z6, z7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcy zzcyVar, long j7) {
        m15201a();
        AbstractC3802r.m15123e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f12635a.mo5628f().m6446A(new RunnableC1798p4(this, zzcyVar, new C1519J(str2, new C1501H(bundle), "app", j7), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logHealthData(int i7, String str, InterfaceC0552a interfaceC0552a, InterfaceC0552a interfaceC0552a2, InterfaceC0552a interfaceC0552a3) {
        m15201a();
        this.f12635a.mo5624b().m5934G(i7, true, false, str, interfaceC0552a == null ? null : BinderC0553b.m2137b(interfaceC0552a), interfaceC0552a2 == null ? null : BinderC0553b.m2137b(interfaceC0552a2), interfaceC0552a3 != null ? BinderC0553b.m2137b(interfaceC0552a3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreated(InterfaceC0552a interfaceC0552a, Bundle bundle, long j7) {
        m15201a();
        onActivityCreatedByScionActivityInfo(zzdj.zza((Activity) AbstractC3802r.m15129k((Activity) BinderC0553b.m2137b(interfaceC0552a))), bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreatedByScionActivityInfo(zzdj zzdjVar, Bundle bundle, long j7) {
        m15201a();
        C1772m5 c1772m5 = this.f12635a.m5613K().f5291c;
        if (c1772m5 != null) {
            this.f12635a.m5613K().m6227y();
            c1772m5.mo6091a(zzdjVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyed(InterfaceC0552a interfaceC0552a, long j7) {
        m15201a();
        onActivityDestroyedByScionActivityInfo(zzdj.zza((Activity) AbstractC3802r.m15129k((Activity) BinderC0553b.m2137b(interfaceC0552a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyedByScionActivityInfo(zzdj zzdjVar, long j7) {
        m15201a();
        C1772m5 c1772m5 = this.f12635a.m5613K().f5291c;
        if (c1772m5 != null) {
            this.f12635a.m5613K().m6227y();
            c1772m5.mo6093c(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPaused(InterfaceC0552a interfaceC0552a, long j7) {
        m15201a();
        onActivityPausedByScionActivityInfo(zzdj.zza((Activity) AbstractC3802r.m15129k((Activity) BinderC0553b.m2137b(interfaceC0552a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPausedByScionActivityInfo(zzdj zzdjVar, long j7) {
        m15201a();
        C1772m5 c1772m5 = this.f12635a.m5613K().f5291c;
        if (c1772m5 != null) {
            this.f12635a.m5613K().m6227y();
            c1772m5.mo6092b(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumed(InterfaceC0552a interfaceC0552a, long j7) {
        m15201a();
        onActivityResumedByScionActivityInfo(zzdj.zza((Activity) AbstractC3802r.m15129k((Activity) BinderC0553b.m2137b(interfaceC0552a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumedByScionActivityInfo(zzdj zzdjVar, long j7) {
        m15201a();
        C1772m5 c1772m5 = this.f12635a.m5613K().f5291c;
        if (c1772m5 != null) {
            this.f12635a.m5613K().m6227y();
            c1772m5.mo6095e(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceState(InterfaceC0552a interfaceC0552a, zzcy zzcyVar, long j7) {
        m15201a();
        onActivitySaveInstanceStateByScionActivityInfo(zzdj.zza((Activity) AbstractC3802r.m15129k((Activity) BinderC0553b.m2137b(interfaceC0552a))), zzcyVar, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdjVar, zzcy zzcyVar, long j7) {
        m15201a();
        C1772m5 c1772m5 = this.f12635a.m5613K().f5291c;
        Bundle bundle = new Bundle();
        if (c1772m5 != null) {
            this.f12635a.m5613K().m6227y();
            c1772m5.mo6094d(zzdjVar, bundle);
        }
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            this.f12635a.mo5624b().m5941w().m5903b("Error returning bundle value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStarted(InterfaceC0552a interfaceC0552a, long j7) {
        m15201a();
        onActivityStartedByScionActivityInfo(zzdj.zza((Activity) AbstractC3802r.m15129k((Activity) BinderC0553b.m2137b(interfaceC0552a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStartedByScionActivityInfo(zzdj zzdjVar, long j7) {
        m15201a();
        if (this.f12635a.m5613K().f5291c != null) {
            this.f12635a.m5613K().m6227y();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStopped(InterfaceC0552a interfaceC0552a, long j7) {
        m15201a();
        onActivityStoppedByScionActivityInfo(zzdj.zza((Activity) AbstractC3802r.m15129k((Activity) BinderC0553b.m2137b(interfaceC0552a))), j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStoppedByScionActivityInfo(zzdj zzdjVar, long j7) {
        m15201a();
        if (this.f12635a.m5613K().f5291c != null) {
            this.f12635a.m5613K().m6227y();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void performAction(Bundle bundle, zzcy zzcyVar, long j7) {
        m15201a();
        zzcyVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void registerOnMeasurementEventListener(zzde zzdeVar) {
        InterfaceC1825s4 interfaceC1825s4;
        m15201a();
        Map map = this.f12636b;
        synchronized (map) {
            try {
                interfaceC1825s4 = (InterfaceC1825s4) map.get(Integer.valueOf(zzdeVar.zze()));
                if (interfaceC1825s4 == null) {
                    interfaceC1825s4 = new C1873x7(this, zzdeVar);
                    map.put(Integer.valueOf(zzdeVar.zze()), interfaceC1825s4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12635a.m5613K().m6189J(interfaceC1825s4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void resetAnalyticsData(long j7) {
        m15201a();
        this.f12635a.m5613K().m6191L(j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void retrieveAndUploadBatches(final zzdb zzdbVar) {
        m15201a();
        if (this.f12635a.m5605B().m6138P(null, AbstractC1805q2.f5353S0)) {
            this.f12635a.m5613K().m6192M(new Runnable() { // from class: P2.k3
                @Override // java.lang.Runnable
                public final void run() {
                    AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService.this, zzdbVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConditionalUserProperty(Bundle bundle, long j7) {
        m15201a();
        if (bundle == null) {
            this.f12635a.mo5624b().m5936r().m5902a("Conditional user property must not be null");
        } else {
            this.f12635a.m5613K().m6198S(bundle, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsent(final Bundle bundle, final long j7) {
        m15201a();
        final C1799p5 m5613K = this.f12635a.m5613K();
        m5613K.f5129a.mo5628f().m6447B(new Runnable() { // from class: P2.D4
            @Override // java.lang.Runnable
            public final void run() {
                C1799p5 c1799p5 = C1799p5.this;
                if (!TextUtils.isEmpty(c1799p5.f5129a.m5607D().m5571v())) {
                    c1799p5.f5129a.mo5624b().m5942x().m5902a("Using developer consent only; google app id found");
                } else {
                    c1799p5.m6199T(bundle, 0, j7);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsentThirdParty(Bundle bundle, long j7) {
        m15201a();
        this.f12635a.m5613K().m6199T(bundle, -20, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreen(InterfaceC0552a interfaceC0552a, String str, String str2, long j7) {
        m15201a();
        setCurrentScreenByScionActivityInfo(zzdj.zza((Activity) AbstractC3802r.m15129k((Activity) BinderC0553b.m2137b(interfaceC0552a))), str, str2, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreenByScionActivityInfo(zzdj zzdjVar, String str, String str2, long j7) {
        m15201a();
        this.f12635a.m5616N().m5876E(zzdjVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDataCollectionEnabled(boolean z6) {
        m15201a();
        C1799p5 m5613K = this.f12635a.m5613K();
        m5613K.m6082i();
        m5613K.f5129a.mo5628f().m6446A(new RunnableC1551M4(m5613K, z6));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDefaultEventParameters(Bundle bundle) {
        m15201a();
        final C1799p5 m5613K = this.f12635a.m5613K();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m5613K.f5129a.mo5628f().m6446A(new Runnable() { // from class: P2.B4
            @Override // java.lang.Runnable
            public final void run() {
                C1799p5.m6179w0(C1799p5.this, bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setEventInterceptor(zzde zzdeVar) {
        m15201a();
        C1633W6 c1633w6 = new C1633W6(this, zzdeVar);
        if (this.f12635a.mo5628f().m6449E()) {
            this.f12635a.m5613K().m6201V(c1633w6);
        } else {
            this.f12635a.mo5628f().m6446A(new RunnableC1835t5(this, c1633w6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setInstanceIdProvider(zzdg zzdgVar) {
        m15201a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMeasurementEnabled(boolean z6, long j7) {
        m15201a();
        this.f12635a.m5613K().m6202W(Boolean.valueOf(z6));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMinimumSessionDuration(long j7) {
        m15201a();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSessionTimeoutDuration(long j7) {
        m15201a();
        C1799p5 m5613K = this.f12635a.m5613K();
        m5613K.f5129a.mo5628f().m6446A(new RunnableC1568O4(m5613K, j7));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSgtmDebugInfo(Intent intent) {
        m15201a();
        C1799p5 m5613K = this.f12635a.m5613K();
        Uri data = intent.getData();
        if (data == null) {
            m5613K.f5129a.mo5624b().m5939u().m5902a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C1460C3 c1460c3 = m5613K.f5129a;
            c1460c3.mo5624b().m5939u().m5902a("[sgtm] Preview Mode was not enabled.");
            c1460c3.m5605B().m6136N(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            C1460C3 c1460c32 = m5613K.f5129a;
            c1460c32.mo5624b().m5939u().m5903b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            c1460c32.m5605B().m6136N(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserId(final String str, long j7) {
        m15201a();
        final C1799p5 m5613K = this.f12635a.m5613K();
        if (str != null && TextUtils.isEmpty(str)) {
            m5613K.f5129a.mo5624b().m5941w().m5902a("User ID must be non-empty or null");
        } else {
            m5613K.f5129a.mo5628f().m6446A(new Runnable() { // from class: P2.w4
                @Override // java.lang.Runnable
                public final void run() {
                    C1460C3 c1460c3 = C1799p5.this.f5129a;
                    if (c1460c3.m5607D().m5574y(str)) {
                        c1460c3.m5607D().m5573x();
                    }
                }
            });
            m5613K.m6206a0(null, "_id", str, true, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserProperty(String str, String str2, InterfaceC0552a interfaceC0552a, boolean z6, long j7) {
        m15201a();
        this.f12635a.m5613K().m6206a0(str, str2, BinderC0553b.m2137b(interfaceC0552a), z6, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void unregisterOnMeasurementEventListener(zzde zzdeVar) {
        InterfaceC1825s4 interfaceC1825s4;
        m15201a();
        Map map = this.f12636b;
        synchronized (map) {
            interfaceC1825s4 = (InterfaceC1825s4) map.remove(Integer.valueOf(zzdeVar.zze()));
        }
        if (interfaceC1825s4 == null) {
            interfaceC1825s4 = new C1873x7(this, zzdeVar);
        }
        this.f12635a.m5613K().m6208c0(interfaceC1825s4);
    }
}
