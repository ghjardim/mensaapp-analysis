package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC3684d extends BasePendingResult {
    private final C3643a api;
    private final C3643a.c clientKey;

    public AbstractC3684d(C3643a c3643a, AbstractC3648f abstractC3648f) {
        super((AbstractC3648f) AbstractC3802r.m15130l(abstractC3648f, "GoogleApiClient must not be null"));
        AbstractC3802r.m15130l(c3643a, "Api must not be null");
        this.clientKey = c3643a.m14805b();
        this.api = c3643a;
    }

    /* renamed from: c */
    public final void m14915c(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public abstract void doExecute(C3643a.b bVar);

    public final C3643a getApi() {
        return this.api;
    }

    public final C3643a.c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(InterfaceC3729l interfaceC3729l) {
    }

    public final void run(C3643a.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e7) {
            m14915c(e7);
            throw e7;
        } catch (RemoteException e8) {
            m14915c(e8);
        }
    }

    public final void setFailedResult(Status status) {
        AbstractC3802r.m15120b(!status.m14799D0(), "Failed result must not be success");
        InterfaceC3729l createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}
