package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC3703m0 {

    /* renamed from: a */
    public final int f12382a;

    public AbstractC3703m0(int i7) {
        this.f12382a = i7;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m14975e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo14951a(Status status);

    /* renamed from: b */
    public abstract void mo14952b(Exception exc);

    /* renamed from: c */
    public abstract void mo14953c(C3663K c3663k);

    /* renamed from: d */
    public abstract void mo14973d(C3652A c3652a, boolean z6);
}
