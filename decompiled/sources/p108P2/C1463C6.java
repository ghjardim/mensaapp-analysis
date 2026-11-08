package p108P2;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzff;
import p256j$.util.Objects;

/* renamed from: P2.C6 */
/* loaded from: classes.dex */
public final class C1463C6 {

    /* renamed from: a */
    public final Context f4575a;

    public C1463C6(Context context) {
        AbstractC3802r.m15129k(context);
        this.f4575a = context;
    }

    /* renamed from: c */
    public static /* synthetic */ void m5642c(C1463C6 c1463c6, JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC1454B6) c1463c6.f4575a).mo5583c(jobParameters, false);
    }

    /* renamed from: d */
    public static /* synthetic */ void m5643d(C1463C6 c1463c6, C1558N2 c1558n2, JobParameters jobParameters) {
        c1558n2.m5940v().m5902a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC1454B6) c1463c6.f4575a).mo5583c(jobParameters, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static /* synthetic */ void m5644e(C1463C6 c1463c6, int i7, C1558N2 c1558n2, Intent intent) {
        Context context = c1463c6.f4575a;
        InterfaceC1454B6 interfaceC1454B6 = (InterfaceC1454B6) context;
        if (interfaceC1454B6.mo5581a(i7)) {
            c1558n2.m5940v().m5903b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i7));
            C1460C3.m5596J(context, null, null).mo5624b().m5940v().m5902a("Completed wakeful intent.");
            interfaceC1454B6.mo5582b(intent);
        }
    }

    /* renamed from: i */
    public static final void m5645i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    /* renamed from: j */
    public static final boolean m5646j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    /* renamed from: a */
    public final int m5647a(final Intent intent, int i7, final int i8) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f4575a;
        C1460C3 m5596J = C1460C3.m5596J(context, null, null);
        final C1558N2 mo5624b = m5596J.mo5624b();
        String action = intent.getAction();
        m5596J.mo5623a();
        mo5624b.m5940v().m5904c("Local AppMeasurementService called. startId, action", Integer.valueOf(i8), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m5652k(C1828s7.m6285S0(context), new Runnable() { // from class: P2.y6
                @Override // java.lang.Runnable
                public final void run() {
                    C1463C6.m5644e(C1463C6.this, i8, mo5624b, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m5648b(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC1699e4(C1828s7.m6285S0(this.f4575a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    /* renamed from: f */
    public final void m5649f() {
        Log.v("FA", this.f4575a.getClass().getSimpleName().concat(" is starting up."));
    }

    /* renamed from: g */
    public final void m5650g() {
        Log.v("FA", this.f4575a.getClass().getSimpleName().concat(" is shutting down."));
    }

    /* renamed from: h */
    public final boolean m5651h(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) AbstractC3802r.m15129k(string);
            C1828s7 m6285S0 = C1828s7.m6285S0(this.f4575a);
            final C1558N2 mo5624b = m6285S0.mo5624b();
            m6285S0.mo5623a();
            mo5624b.m5940v().m5903b("Local AppMeasurementJobService called. action", str);
            m5652k(m6285S0, new Runnable() { // from class: P2.z6
                @Override // java.lang.Runnable
                public final void run() {
                    C1463C6.m5643d(C1463C6.this, mo5624b, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        zzff zzg = zzff.zzg(this.f4575a, null, null, null, null);
        if (!((Boolean) AbstractC1805q2.f5357U0.m6159a(null)).booleanValue()) {
            return true;
        }
        zzg.zzE(new Runnable() { // from class: P2.x6
            @Override // java.lang.Runnable
            public final void run() {
                C1463C6.m5642c(C1463C6.this, jobParameters);
            }
        });
        return true;
    }

    /* renamed from: k */
    public final void m5652k(C1828s7 c1828s7, Runnable runnable) {
        c1828s7.mo5628f().m6446A(new RunnableC1445A6(this, c1828s7, runnable));
    }
}
