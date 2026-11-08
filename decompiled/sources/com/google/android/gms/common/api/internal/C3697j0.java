package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* loaded from: classes.dex */
public final class C3697j0 extends AbstractC3703m0 {

    /* renamed from: b */
    public final AbstractC3684d f12372b;

    public C3697j0(int i7, AbstractC3684d abstractC3684d) {
        super(i7);
        this.f12372b = (AbstractC3684d) AbstractC3802r.m15130l(abstractC3684d, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: a */
    public final void mo14951a(Status status) {
        try {
            this.f12372b.setFailedResult(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: b */
    public final void mo14952b(Exception exc) {
        try {
            this.f12372b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: c */
    public final void mo14953c(C3663K c3663k) {
        try {
            this.f12372b.run(c3663k.m14882v());
        } catch (RuntimeException e7) {
            mo14952b(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: d */
    public final void mo14973d(C3652A c3652a, boolean z6) {
        c3652a.m14826c(this.f12372b, z6);
    }
}
