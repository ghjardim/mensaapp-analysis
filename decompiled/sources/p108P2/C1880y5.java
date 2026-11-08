package p108P2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzih;

/* renamed from: P2.y5 */
/* loaded from: classes.dex */
public final class C1880y5 extends AbstractC1724h2 {

    /* renamed from: c */
    public JobScheduler f5622c;

    public C1880y5(C1460C3 c1460c3) {
        super(c1460c3);
    }

    @Override // p108P2.AbstractC1724h2
    /* renamed from: l */
    public final void mo5562l() {
        this.f5622c = (JobScheduler) this.f5129a.mo5625c().getSystemService("jobscheduler");
    }

    @Override // p108P2.AbstractC1724h2
    /* renamed from: n */
    public final boolean mo5563n() {
        return true;
    }

    /* renamed from: o */
    public final int m6553o() {
        return "measurement-client".concat(String.valueOf(this.f5129a.mo5625c().getPackageName())).hashCode();
    }

    /* renamed from: p */
    public final zzih m6554p() {
        m6082i();
        mo5762h();
        C1460C3 c1460c3 = this.f5129a;
        if (!c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5353S0)) {
            return zzih.CLIENT_FLAG_OFF;
        }
        if (this.f5622c == null) {
            return zzih.MISSING_JOB_SCHEDULER;
        }
        if (!c1460c3.m5605B().m6145m()) {
            return zzih.NOT_ENABLED_IN_MANIFEST;
        }
        C1460C3 c1460c32 = this.f5129a;
        return c1460c32.m5607D().m5566q() >= 119000 ? !C1473D7.m5675k0(c1460c3.mo5625c(), "com.google.android.gms.measurement.AppMeasurementJobService") ? zzih.MEASUREMENT_SERVICE_NOT_ENABLED : Build.VERSION.SDK_INT >= 24 ? !c1460c32.m5617O().m6402Q() ? zzih.NON_PLAY_MODE : zzih.CLIENT_UPLOAD_ELIGIBLE : zzih.ANDROID_TOO_OLD : zzih.SDK_TOO_OLD;
    }

    /* renamed from: q */
    public final void m6555q(long j7) {
        JobInfo pendingJob;
        m6082i();
        mo5762h();
        JobScheduler jobScheduler = this.f5622c;
        if (jobScheduler != null) {
            pendingJob = jobScheduler.getPendingJob(m6553o());
            if (pendingJob != null) {
                this.f5129a.mo5624b().m5940v().m5902a("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
        }
        zzih m6554p = m6554p();
        if (m6554p != zzih.CLIENT_UPLOAD_ELIGIBLE) {
            this.f5129a.mo5624b().m5940v().m5903b("[sgtm] Not eligible for Scion upload", m6554p.name());
            return;
        }
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.mo5624b().m5940v().m5903b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j7));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        c1460c3.mo5624b().m5940v().m5903b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) AbstractC3802r.m15129k(this.f5622c)).schedule(new JobInfo.Builder(m6553o(), new ComponentName(c1460c3.mo5625c(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j7).setOverrideDeadline(j7 + j7).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }
}
