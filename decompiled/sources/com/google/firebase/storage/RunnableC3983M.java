package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C3999o;
import org.json.JSONException;
import p220e4.C4191c;
import p228f4.C4287k;

/* renamed from: com.google.firebase.storage.M */
/* loaded from: classes.dex */
public class RunnableC3983M implements Runnable {

    /* renamed from: a */
    public final C4000p f13112a;

    /* renamed from: b */
    public final TaskCompletionSource f13113b;

    /* renamed from: c */
    public final C3999o f13114c;

    /* renamed from: d */
    public C3999o f13115d = null;

    /* renamed from: e */
    public C4191c f13116e;

    public RunnableC3983M(C4000p c4000p, TaskCompletionSource taskCompletionSource, C3999o c3999o) {
        this.f13112a = c4000p;
        this.f13113b = taskCompletionSource;
        this.f13114c = c3999o;
        C3990f m16092s = c4000p.m16092s();
        this.f13116e = new C4191c(m16092s.m15999a().m17532m(), m16092s.m16001c(), m16092s.m16000b(), m16092s.m16006j());
    }

    @Override // java.lang.Runnable
    public void run() {
        C4287k c4287k = new C4287k(this.f13112a.m16093t(), this.f13112a.m16082i(), this.f13114c.m16052q());
        this.f13116e.m17594d(c4287k);
        if (c4287k.m17922v()) {
            try {
                this.f13115d = new C3999o.b(c4287k.m17915n(), this.f13112a).m16062a();
            } catch (JSONException e7) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + c4287k.m17914m(), e7);
                this.f13113b.setException(C3998n.m16024d(e7));
                return;
            }
        }
        TaskCompletionSource taskCompletionSource = this.f13113b;
        if (taskCompletionSource != null) {
            c4287k.m17905a(taskCompletionSource, this.f13115d);
        }
    }
}
