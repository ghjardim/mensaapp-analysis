package p108P2;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* renamed from: P2.W4 */
/* loaded from: classes.dex */
public final class RunnableC1631W4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f4975a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f4976b;

    public RunnableC1631W4(C1799p5 c1799p5, Bundle bundle) {
        this.f4975a = bundle;
        this.f4976b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1799p5 c1799p5 = this.f4976b;
        c1799p5.mo5762h();
        c1799p5.m6082i();
        Bundle bundle = this.f4975a;
        AbstractC3802r.m15129k(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC3802r.m15123e(string);
        AbstractC3802r.m15123e(string2);
        AbstractC3802r.m15129k(bundle.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
        if (!c1799p5.f5129a.m5635o()) {
            c1799p5.f5129a.mo5624b().m5940v().m5902a("Conditional property not set since app measurement is disabled");
            return;
        }
        C1891z7 c1891z7 = new C1891z7(string, bundle.getLong("triggered_timestamp"), bundle.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR), string2);
        try {
            C1460C3 c1460c3 = c1799p5.f5129a;
            C1519J m5723q = c1460c3.m5619Q().m5723q(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c1799p5.f5129a.m5617O().m6389D(new C1739j(bundle.getString("app_id"), string2, c1891z7, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c1460c3.m5619Q().m5723q(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m5723q, bundle.getLong("time_to_live"), c1460c3.m5619Q().m5723q(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
