package com.google.firebase.storage;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p220e4.C4191c;
import p228f4.C4277a;

/* renamed from: com.google.firebase.storage.d */
/* loaded from: classes.dex */
public class RunnableC3988d implements Runnable {

    /* renamed from: a */
    public C4000p f13145a;

    /* renamed from: b */
    public TaskCompletionSource f13146b;

    /* renamed from: c */
    public C4191c f13147c;

    public RunnableC3988d(C4000p c4000p, TaskCompletionSource taskCompletionSource) {
        AbstractC3802r.m15129k(c4000p);
        AbstractC3802r.m15129k(taskCompletionSource);
        this.f13145a = c4000p;
        this.f13146b = taskCompletionSource;
        C3990f m16092s = c4000p.m16092s();
        this.f13147c = new C4191c(m16092s.m15999a().m17532m(), m16092s.m16001c(), m16092s.m16000b(), m16092s.m16005i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C4277a c4277a = new C4277a(this.f13145a.m16093t(), this.f13145a.m16082i());
        this.f13147c.m17594d(c4277a);
        c4277a.m17905a(this.f13146b, null);
    }
}
