package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p368w2.C6863d;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* loaded from: classes.dex */
public final class C3699k0 extends AbstractC3672U {

    /* renamed from: b */
    public final AbstractC3720v f12378b;

    /* renamed from: c */
    public final TaskCompletionSource f12379c;

    /* renamed from: d */
    public final InterfaceC3716t f12380d;

    public C3699k0(int i7, AbstractC3720v abstractC3720v, TaskCompletionSource taskCompletionSource, InterfaceC3716t interfaceC3716t) {
        super(i7);
        this.f12379c = taskCompletionSource;
        this.f12378b = abstractC3720v;
        this.f12380d = interfaceC3716t;
        if (i7 == 2 && abstractC3720v.m14986c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: a */
    public final void mo14951a(Status status) {
        this.f12379c.trySetException(this.f12380d.mo14902a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: b */
    public final void mo14952b(Exception exc) {
        this.f12379c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: c */
    public final void mo14953c(C3663K c3663k) {
        try {
            this.f12378b.mo14916b(c3663k.m14882v(), this.f12379c);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            mo14951a(AbstractC3703m0.m14975e(e8));
        } catch (RuntimeException e9) {
            this.f12379c.trySetException(e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3703m0
    /* renamed from: d */
    public final void mo14973d(C3652A c3652a, boolean z6) {
        c3652a.m14827d(this.f12379c, z6);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3672U
    /* renamed from: f */
    public final boolean mo14898f(C3663K c3663k) {
        return this.f12378b.m14986c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3672U
    /* renamed from: g */
    public final C6863d[] mo14899g(C3663K c3663k) {
        return this.f12378b.m14988e();
    }
}
