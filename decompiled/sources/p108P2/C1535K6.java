package p108P2;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: P2.K6 */
/* loaded from: classes.dex */
public final class C1535K6 {

    /* renamed from: a */
    public final /* synthetic */ C1544L6 f4795a;

    public C1535K6(C1544L6 c1544l6) {
        this.f4795a = c1544l6;
    }

    /* renamed from: a */
    public final void m5894a() {
        C1544L6 c1544l6 = this.f4795a;
        c1544l6.mo5762h();
        C1460C3 c1460c3 = c1544l6.f5129a;
        if (c1460c3.m5611H().m5999A(c1460c3.mo5626d().mo1110a())) {
            c1460c3.m5611H().f5073n.m5974a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c1460c3.mo5624b().m5940v().m5902a("Detected application was in foreground");
                m5896c(c1460c3.mo5626d().mo1110a(), false);
            }
        }
    }

    /* renamed from: b */
    public final void m5895b(long j7, boolean z6) {
        C1544L6 c1544l6 = this.f4795a;
        c1544l6.mo5762h();
        c1544l6.m5910u();
        C1460C3 c1460c3 = c1544l6.f5129a;
        if (c1460c3.m5611H().m5999A(j7)) {
            c1460c3.m5611H().f5073n.m5974a(true);
            c1544l6.f5129a.m5607D().m5573x();
        }
        c1460c3.m5611H().f5077r.m5980b(j7);
        if (c1460c3.m5611H().f5073n.m5975b()) {
            m5896c(j7, z6);
        }
    }

    /* renamed from: c */
    public final void m5896c(long j7, boolean z6) {
        C1544L6 c1544l6 = this.f4795a;
        c1544l6.mo5762h();
        if (c1544l6.f5129a.m5635o()) {
            C1460C3 c1460c3 = c1544l6.f5129a;
            c1460c3.m5611H().f5077r.m5980b(j7);
            c1460c3.mo5624b().m5940v().m5903b("Session started, time", Long.valueOf(c1460c3.mo5626d().mo1111b()));
            long j8 = j7 / 1000;
            C1460C3 c1460c32 = c1544l6.f5129a;
            c1460c32.m5613K().m6207b0("auto", "_sid", Long.valueOf(j8), j7);
            c1460c3.m5611H().f5078s.m5980b(j8);
            c1460c3.m5611H().f5073n.m5974a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j8);
            c1460c32.m5613K().m6186G("auto", "_s", j7, bundle);
            String m5986a = c1460c3.m5611H().f5083x.m5986a();
            if (TextUtils.isEmpty(m5986a)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", m5986a);
            c1460c32.m5613K().m6186G("auto", "_ssr", j7, bundle2);
        }
    }
}
