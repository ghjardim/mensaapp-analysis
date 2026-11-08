package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONObject;
import p220e4.C4191c;
import p228f4.C4278b;

/* renamed from: com.google.firebase.storage.h */
/* loaded from: classes.dex */
public class RunnableC3992h implements Runnable {

    /* renamed from: a */
    public C4000p f13173a;

    /* renamed from: b */
    public TaskCompletionSource f13174b;

    /* renamed from: c */
    public C4191c f13175c;

    public RunnableC3992h(C4000p c4000p, TaskCompletionSource taskCompletionSource) {
        AbstractC3802r.m15129k(c4000p);
        AbstractC3802r.m15129k(taskCompletionSource);
        this.f13173a = c4000p;
        this.f13174b = taskCompletionSource;
        if (c4000p.m16091r().m16088o().equals(c4000p.m16088o())) {
            throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
        }
        C3990f m16092s = this.f13173a.m16092s();
        this.f13175c = new C4191c(m16092s.m15999a().m17532m(), m16092s.m16001c(), m16092s.m16000b(), m16092s.m16006j());
    }

    /* renamed from: a */
    public final Uri m16016a(JSONObject jSONObject) {
        String optString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String str = optString.split(",", -1)[0];
        Uri.Builder buildUpon = this.f13173a.m16093t().m17603c().buildUpon();
        buildUpon.appendQueryParameter("alt", "media");
        buildUpon.appendQueryParameter("token", str);
        return buildUpon.build();
    }

    @Override // java.lang.Runnable
    public void run() {
        C4278b c4278b = new C4278b(this.f13173a.m16093t(), this.f13173a.m16082i());
        this.f13175c.m17594d(c4278b);
        Uri m16016a = c4278b.m17922v() ? m16016a(c4278b.m17915n()) : null;
        TaskCompletionSource taskCompletionSource = this.f13174b;
        if (taskCompletionSource != null) {
            c4278b.m17905a(taskCompletionSource, m16016a);
        }
    }
}
