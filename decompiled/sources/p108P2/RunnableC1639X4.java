package p108P2;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.apache.tika.utils.StringUtils;

/* renamed from: P2.X4 */
/* loaded from: classes.dex */
public final class RunnableC1639X4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f4988a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f4989b;

    public RunnableC1639X4(C1799p5 c1799p5, Bundle bundle) {
        this.f4988a = bundle;
        this.f4989b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1799p5 c1799p5 = this.f4989b;
        c1799p5.mo5762h();
        c1799p5.m6082i();
        Bundle bundle = this.f4988a;
        AbstractC3802r.m15129k(bundle);
        String m15123e = AbstractC3802r.m15123e(bundle.getString("name"));
        if (!c1799p5.f5129a.m5635o()) {
            c1799p5.f5129a.mo5624b().m5940v().m5902a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c1799p5.f5129a.m5617O().m6389D(new C1739j(bundle.getString("app_id"), StringUtils.EMPTY, new C1891z7(m15123e, 0L, null, StringUtils.EMPTY), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c1799p5.f5129a.m5619Q().m5723q(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), StringUtils.EMPTY, bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
