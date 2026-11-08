package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC3802r;
import p161X.AbstractActivityC2791u;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes.dex */
public class C3692h {

    /* renamed from: a */
    public final Object f12364a;

    public C3692h(Activity activity) {
        AbstractC3802r.m15130l(activity, "Activity must not be null");
        this.f12364a = activity;
    }

    /* renamed from: a */
    public final Activity m14955a() {
        return (Activity) this.f12364a;
    }

    /* renamed from: b */
    public final AbstractActivityC2791u m14956b() {
        return (AbstractActivityC2791u) this.f12364a;
    }

    /* renamed from: c */
    public final boolean m14957c() {
        return this.f12364a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m14958d() {
        return this.f12364a instanceof AbstractActivityC2791u;
    }
}
