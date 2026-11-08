package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3643a;

/* renamed from: com.google.android.gms.common.api.internal.I */
/* loaded from: classes.dex */
public final class RunnableC3661I implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3662J f12281a;

    public RunnableC3661I(C3662J c3662j) {
        this.f12281a = c3662j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3643a.f fVar;
        C3643a.f fVar2;
        C3663K c3663k = this.f12281a.f12282a;
        fVar = c3663k.f12284b;
        fVar2 = c3663k.f12284b;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
