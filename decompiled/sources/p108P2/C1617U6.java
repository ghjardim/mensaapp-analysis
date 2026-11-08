package p108P2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzcj;
import com.google.android.gms.internal.measurement.zzck;

/* renamed from: P2.U6 */
/* loaded from: classes.dex */
public final class C1617U6 extends AbstractC1693d7 {

    /* renamed from: d */
    public final AlarmManager f4954d;

    /* renamed from: e */
    public AbstractC1438A f4955e;

    /* renamed from: f */
    public Integer f4956f;

    public C1617U6(C1828s7 c1828s7) {
        super(c1828s7);
        this.f4954d = (AlarmManager) this.f5129a.mo5625c().getSystemService("alarm");
    }

    /* renamed from: r */
    private final void m5965r() {
        JobScheduler jobScheduler = (JobScheduler) this.f5129a.mo5625c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m5968o());
        }
    }

    @Override // p108P2.AbstractC1693d7
    /* renamed from: l */
    public final boolean mo5961l() {
        AlarmManager alarmManager = this.f4954d;
        if (alarmManager != null) {
            alarmManager.cancel(m5969p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m5965r();
        return false;
    }

    /* renamed from: m */
    public final void m5966m() {
        m6015i();
        this.f5129a.mo5624b().m5940v().m5902a("Unscheduling upload");
        AlarmManager alarmManager = this.f4954d;
        if (alarmManager != null) {
            alarmManager.cancel(m5969p());
        }
        m5970q().m5557b();
        if (Build.VERSION.SDK_INT >= 24) {
            m5965r();
        }
    }

    /* renamed from: n */
    public final void m5967n(long j7) {
        m6015i();
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.mo5623a();
        Context mo5625c = c1460c3.mo5625c();
        if (!C1473D7.m5674j0(mo5625c)) {
            c1460c3.mo5624b().m5935q().m5902a("Receiver not registered/enabled");
        }
        if (!C1473D7.m5676l0(mo5625c, false)) {
            c1460c3.mo5624b().m5935q().m5902a("Service not registered/enabled");
        }
        m5966m();
        c1460c3.mo5624b().m5940v().m5903b("Scheduling upload, millis", Long.valueOf(j7));
        long mo1111b = c1460c3.mo5626d().mo1111b() + j7;
        c1460c3.m5605B();
        if (j7 < Math.max(0L, ((Long) AbstractC1805q2.f5338L.m6159a(null)).longValue()) && !m5970q().m5560e()) {
            m5970q().m5559d(j7);
        }
        c1460c3.mo5623a();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f4954d;
            if (alarmManager != null) {
                c1460c3.m5605B();
                alarmManager.setInexactRepeating(2, mo1111b, Math.max(((Long) AbstractC1805q2.f5328G.m6159a(null)).longValue(), j7), m5969p());
                return;
            }
            return;
        }
        Context mo5625c2 = c1460c3.mo5625c();
        ComponentName componentName = new ComponentName(mo5625c2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m5968o = m5968o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzck.zza(mo5625c2, new JobInfo.Builder(m5968o, componentName).setMinimumLatency(j7).setOverrideDeadline(j7 + j7).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* renamed from: o */
    public final int m5968o() {
        if (this.f4956f == null) {
            this.f4956f = Integer.valueOf("measurement".concat(String.valueOf(this.f5129a.mo5625c().getPackageName())).hashCode());
        }
        return this.f4956f.intValue();
    }

    /* renamed from: p */
    public final PendingIntent m5969p() {
        Context mo5625c = this.f5129a.mo5625c();
        return PendingIntent.getBroadcast(mo5625c, 0, new Intent().setClassName(mo5625c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcj.zza);
    }

    /* renamed from: q */
    public final AbstractC1438A m5970q() {
        if (this.f4955e == null) {
            this.f4955e = new C1609T6(this, this.f4967b.m6315M0());
        }
        return this.f4955e;
    }
}
