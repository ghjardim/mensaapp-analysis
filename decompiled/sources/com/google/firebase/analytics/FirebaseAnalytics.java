package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p108P2.InterfaceC1808q5;
import p144U3.C2534g;
import p227f3.C4273a;
import p227f3.C4276d;
import p227f3.CallableC4274b;
import p227f3.CallableC4275c;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c */
    public static volatile FirebaseAnalytics f12777c;

    /* renamed from: a */
    public final zzff f12778a;

    /* renamed from: b */
    public ExecutorService f12779b;

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    public enum EnumC3926a {
        GRANTED,
        DENIED
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    public enum EnumC3927b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(zzff zzffVar) {
        AbstractC3802r.m15129k(zzffVar);
        this.f12778a = zzffVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f12777c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f12777c == null) {
                        f12777c = new FirebaseAnalytics(zzff.zzg(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f12777c;
    }

    @Keep
    public static InterfaceC1808q5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzff zzg = zzff.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new C4276d(zzg);
    }

    /* renamed from: a */
    public Task m15276a() {
        try {
            return Tasks.call(m15286l(), new CallableC4274b(this));
        } catch (RuntimeException e7) {
            this.f12778a.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e7);
        }
    }

    /* renamed from: b */
    public Task m15277b() {
        try {
            return Tasks.call(m15286l(), new CallableC4275c(this));
        } catch (RuntimeException e7) {
            this.f12778a.zzB(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e7);
        }
    }

    /* renamed from: c */
    public void m15278c(String str, Bundle bundle) {
        this.f12778a.zzy(str, bundle);
    }

    /* renamed from: d */
    public void m15279d() {
        this.f12778a.zzD();
    }

    /* renamed from: e */
    public void m15280e(boolean z6) {
        this.f12778a.zzL(Boolean.valueOf(z6));
    }

    /* renamed from: f */
    public void m15281f(Map map) {
        Bundle bundle = new Bundle();
        EnumC3926a enumC3926a = (EnumC3926a) map.get(EnumC3927b.AD_STORAGE);
        if (enumC3926a != null) {
            int ordinal = enumC3926a.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        EnumC3926a enumC3926a2 = (EnumC3926a) map.get(EnumC3927b.ANALYTICS_STORAGE);
        if (enumC3926a2 != null) {
            int ordinal2 = enumC3926a2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        EnumC3926a enumC3926a3 = (EnumC3926a) map.get(EnumC3927b.AD_USER_DATA);
        if (enumC3926a3 != null) {
            int ordinal3 = enumC3926a3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        EnumC3926a enumC3926a4 = (EnumC3926a) map.get(EnumC3927b.AD_PERSONALIZATION);
        if (enumC3926a4 != null) {
            int ordinal4 = enumC3926a4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f12778a.zzG(bundle);
    }

    /* renamed from: g */
    public void m15282g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f12778a.zzJ(bundle);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(C2534g.m8488q().mo8498a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        } catch (ExecutionException e8) {
            throw new IllegalStateException(e8.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    /* renamed from: h */
    public void m15283h(long j7) {
        this.f12778a.zzM(j7);
    }

    /* renamed from: i */
    public void m15284i(String str) {
        this.f12778a.zzO(str);
    }

    /* renamed from: j */
    public void m15285j(String str, String str2) {
        this.f12778a.zzP(null, str, str2, false);
    }

    /* renamed from: l */
    public final ExecutorService m15286l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f12779b == null) {
                    this.f12779b = new C4273a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.f12779b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f12778a.zzH(zzdj.zza(activity), str, str2);
    }
}
