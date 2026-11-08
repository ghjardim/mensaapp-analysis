package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC3691g0 extends AbstractC3672U {

    /* renamed from: b */
    public final TaskCompletionSource f12363b;

    public AbstractC3691g0(int i7, TaskCompletionSource taskCompletionSource) {
        super(i7);
        this.f12363b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: a */
    public final void mo14951a(Status status) {
        this.f12363b.trySetException(new C3644b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: b */
    public final void mo14952b(Exception exc) {
        this.f12363b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: c */
    public final void mo14953c(C3663K c3663k) {
        try {
            mo14954h(c3663k);
        } catch (DeadObjectException e7) {
            mo14951a(AbstractC3703m0.m14975e(e7));
            throw e7;
        } catch (RemoteException e8) {
            mo14951a(AbstractC3703m0.m14975e(e8));
        } catch (RuntimeException e9) {
            this.f12363b.trySetException(e9);
        }
    }

    /* renamed from: h */
    public abstract void mo14954h(C3663K c3663k);
}
