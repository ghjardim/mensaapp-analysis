package p226f2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p170Y1.AbstractC2908o;
import p202c2.AbstractC3570a;
import p234g2.InterfaceC4371d;
import p261j2.AbstractC5364a;

/* renamed from: f2.d */
/* loaded from: classes.dex */
public class C4252d implements InterfaceC4272x {

    /* renamed from: a */
    public final Context f14647a;

    /* renamed from: b */
    public final InterfaceC4371d f14648b;

    /* renamed from: c */
    public final AbstractC4254f f14649c;

    public C4252d(Context context, InterfaceC4371d interfaceC4371d, AbstractC4254f abstractC4254f) {
        this.f14647a = context;
        this.f14648b = interfaceC4371d;
        this.f14649c = abstractC4254f;
    }

    @Override // p226f2.InterfaceC4272x
    /* renamed from: a */
    public void mo17845a(AbstractC2908o abstractC2908o, int i7, boolean z6) {
        ComponentName componentName = new ComponentName(this.f14647a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f14647a.getSystemService("jobscheduler");
        int m17847c = m17847c(abstractC2908o);
        if (!z6 && m17848d(jobScheduler, m17847c, i7)) {
            AbstractC3570a.m14400b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC2908o);
            return;
        }
        long mo18534J = this.f14648b.mo18534J(abstractC2908o);
        JobInfo.Builder m17854c = this.f14649c.m17854c(new JobInfo.Builder(m17847c, componentName), abstractC2908o.mo10457d(), mo18534J, i7);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i7);
        persistableBundle.putString("backendName", abstractC2908o.mo10455b());
        persistableBundle.putInt(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, AbstractC5364a.m22067a(abstractC2908o.mo10457d()));
        if (abstractC2908o.mo10456c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC2908o.mo10456c(), 0));
        }
        m17854c.setExtras(persistableBundle);
        AbstractC3570a.m14401c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC2908o, Integer.valueOf(m17847c), Long.valueOf(this.f14649c.m17855g(abstractC2908o.mo10457d(), mo18534J, i7)), Long.valueOf(mo18534J), Integer.valueOf(i7));
        jobScheduler.schedule(m17854c.build());
    }

    @Override // p226f2.InterfaceC4272x
    /* renamed from: b */
    public void mo17846b(AbstractC2908o abstractC2908o, int i7) {
        mo17845a(abstractC2908o, i7, false);
    }

    /* renamed from: c */
    public int m17847c(AbstractC2908o abstractC2908o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f14647a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC2908o.mo10455b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC5364a.m22067a(abstractC2908o.mo10457d())).array());
        if (abstractC2908o.mo10456c() != null) {
            adler32.update(abstractC2908o.mo10456c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean m17848d(JobScheduler jobScheduler, int i7, int i8) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i9 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i7) {
                return i9 >= i8;
            }
        }
        return false;
    }
}
