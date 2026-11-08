package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import p220e4.C4191c;
import p228f4.C4280d;

/* renamed from: com.google.firebase.storage.k */
/* loaded from: classes.dex */
public class RunnableC3995k implements Runnable {

    /* renamed from: a */
    public final C4000p f13183a;

    /* renamed from: b */
    public final TaskCompletionSource f13184b;

    /* renamed from: c */
    public final C4191c f13185c;

    /* renamed from: d */
    public final String f13186d;

    /* renamed from: e */
    public final Integer f13187e;

    public RunnableC3995k(C4000p c4000p, Integer num, String str, TaskCompletionSource taskCompletionSource) {
        AbstractC3802r.m15129k(c4000p);
        AbstractC3802r.m15129k(taskCompletionSource);
        this.f13183a = c4000p;
        this.f13187e = num;
        this.f13186d = str;
        this.f13184b = taskCompletionSource;
        C3990f m16092s = c4000p.m16092s();
        this.f13185c = new C4191c(m16092s.m15999a().m17532m(), m16092s.m16001c(), m16092s.m16000b(), m16092s.m16005i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C3994j m16017a;
        C4280d c4280d = new C4280d(this.f13183a.m16093t(), this.f13183a.m16082i(), this.f13187e, this.f13186d);
        this.f13185c.m17594d(c4280d);
        if (c4280d.m17922v()) {
            try {
                m16017a = C3994j.m16017a(this.f13183a.m16092s(), c4280d.m17915n());
            } catch (JSONException e7) {
                Log.e("ListTask", "Unable to parse response body. " + c4280d.m17914m(), e7);
                this.f13184b.setException(C3998n.m16024d(e7));
                return;
            }
        } else {
            m16017a = null;
        }
        TaskCompletionSource taskCompletionSource = this.f13184b;
        if (taskCompletionSource != null) {
            c4280d.m17905a(taskCompletionSource, m16017a);
        }
    }
}
