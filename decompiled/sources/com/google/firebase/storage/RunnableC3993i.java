package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C3999o;
import org.json.JSONException;
import p220e4.C4191c;
import p228f4.C4278b;

/* renamed from: com.google.firebase.storage.i */
/* loaded from: classes.dex */
public class RunnableC3993i implements Runnable {

    /* renamed from: a */
    public C4000p f13176a;

    /* renamed from: b */
    public TaskCompletionSource f13177b;

    /* renamed from: c */
    public C3999o f13178c;

    /* renamed from: d */
    public C4191c f13179d;

    public RunnableC3993i(C4000p c4000p, TaskCompletionSource taskCompletionSource) {
        AbstractC3802r.m15129k(c4000p);
        AbstractC3802r.m15129k(taskCompletionSource);
        this.f13176a = c4000p;
        this.f13177b = taskCompletionSource;
        if (c4000p.m16091r().m16088o().equals(c4000p.m16088o())) {
            throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
        }
        C3990f m16092s = this.f13176a.m16092s();
        this.f13179d = new C4191c(m16092s.m15999a().m17532m(), m16092s.m16001c(), m16092s.m16000b(), m16092s.m16005i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C4278b c4278b = new C4278b(this.f13176a.m16093t(), this.f13176a.m16082i());
        this.f13179d.m17594d(c4278b);
        if (c4278b.m17922v()) {
            try {
                this.f13178c = new C3999o.b(c4278b.m17915n(), this.f13176a).m16062a();
            } catch (JSONException e7) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + c4278b.m17914m(), e7);
                this.f13177b.setException(C3998n.m16024d(e7));
                return;
            }
        }
        TaskCompletionSource taskCompletionSource = this.f13177b;
        if (taskCompletionSource != null) {
            c4278b.m17905a(taskCompletionSource, this.f13178c);
        }
    }
}
