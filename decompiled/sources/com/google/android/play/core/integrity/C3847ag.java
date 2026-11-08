package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.AbstractRunnableC2668H;
import p157W2.C2667G;
import p157W2.InterfaceC2662B;

/* renamed from: com.google.android.play.core.integrity.ag */
/* loaded from: classes.dex */
final class C3847ag extends AbstractRunnableC2668H {

    /* renamed from: a */
    final /* synthetic */ Bundle f12651a;

    /* renamed from: b */
    final /* synthetic */ Activity f12652b;

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f12653c;

    /* renamed from: d */
    final /* synthetic */ int f12654d;

    /* renamed from: e */
    final /* synthetic */ C3850aj f12655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3847ag(C3850aj c3850aj, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(taskCompletionSource);
        this.f12655e = c3850aj;
        this.f12651a = bundle;
        this.f12652b = activity;
        this.f12653c = taskCompletionSource2;
        this.f12654d = i7;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        C2667G c2667g;
        C3860at c3860at;
        try {
            InterfaceC2662B interfaceC2662B = (InterfaceC2662B) this.f12655e.f12660a.m9170e();
            Bundle bundle = this.f12651a;
            C3850aj c3850aj = this.f12655e;
            c3860at = c3850aj.f12663d;
            interfaceC2662B.mo9136c(bundle, c3860at.m15221a(this.f12652b, this.f12653c, c3850aj.f12660a));
        } catch (RemoteException e7) {
            C3850aj c3850aj2 = this.f12655e;
            int i7 = this.f12654d;
            c2667g = c3850aj2.f12661b;
            c2667g.m9143c(e7, "requestAndShowDialog(%s)", Integer.valueOf(i7));
            this.f12653c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
