package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p170Y1.AbstractC2908o;
import p170Y1.C2913t;
import p261j2.AbstractC5364a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* renamed from: b */
    public final /* synthetic */ void m14701b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR);
        int i8 = jobParameters.getExtras().getInt("attemptNumber");
        C2913t.m10496f(getApplicationContext());
        AbstractC2908o.a mo10461d = AbstractC2908o.m10487a().mo10459b(string).mo10461d(AbstractC5364a.m22068b(i7));
        if (string2 != null) {
            mo10461d.mo10460c(Base64.decode(string2, 0));
        }
        C2913t.m10494c().m10498e().m17882v(mo10461d.mo10458a(), i8, new Runnable() { // from class: f2.e
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m14701b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
