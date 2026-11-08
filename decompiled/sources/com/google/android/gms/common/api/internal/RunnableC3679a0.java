package com.google.android.gms.common.api.internal;

import p143U2.C2526l;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* loaded from: classes.dex */
public final class RunnableC3679a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2526l f12323a;

    /* renamed from: b */
    public final /* synthetic */ BinderC3683c0 f12324b;

    public RunnableC3679a0(BinderC3683c0 binderC3683c0, C2526l c2526l) {
        this.f12324b = binderC3683c0;
        this.f12323a = c2526l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3683c0.m14912Z(this.f12324b, this.f12323a);
    }
}
