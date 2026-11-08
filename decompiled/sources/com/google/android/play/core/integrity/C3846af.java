package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.AbstractRunnableC2668H;
import p157W2.C2667G;
import p157W2.C2681g;
import p157W2.InterfaceC2662B;

/* renamed from: com.google.android.play.core.integrity.af */
/* loaded from: classes.dex */
final class C3846af extends AbstractRunnableC2668H {

    /* renamed from: a */
    final /* synthetic */ byte[] f12646a;

    /* renamed from: b */
    final /* synthetic */ Long f12647b;

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f12648c;

    /* renamed from: d */
    final /* synthetic */ IntegrityTokenRequest f12649d;

    /* renamed from: e */
    final /* synthetic */ C3850aj f12650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3846af(C3850aj c3850aj, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l7, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f12650e = c3850aj;
        this.f12646a = bArr;
        this.f12647b = l7;
        this.f12648c = taskCompletionSource2;
        this.f12649d = integrityTokenRequest;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: a */
    public final void mo9146a(Exception exc) {
        if (exc instanceof C2681g) {
            super.mo9146a(new IntegrityServiceException(-9, exc));
        } else {
            super.mo9146a(exc);
        }
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        C2667G c2667g;
        try {
            ((InterfaceC2662B) this.f12650e.f12660a.m9170e()).mo9135S(C3850aj.m15213a(this.f12650e, this.f12646a, this.f12647b, null), new BinderC3849ai(this.f12650e, this.f12648c));
        } catch (RemoteException e7) {
            C3850aj c3850aj = this.f12650e;
            IntegrityTokenRequest integrityTokenRequest = this.f12649d;
            c2667g = c3850aj.f12661b;
            c2667g.m9143c(e7, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.f12648c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
