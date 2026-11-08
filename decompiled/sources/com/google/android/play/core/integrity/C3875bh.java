package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.C2667G;
import p157W2.C2680f;
import p157W2.InterfaceC2697w;

/* renamed from: com.google.android.play.core.integrity.bh */
/* loaded from: classes.dex */
final class C3875bh extends AbstractC3880bm {

    /* renamed from: a */
    final /* synthetic */ Bundle f12709a;

    /* renamed from: b */
    final /* synthetic */ Activity f12710b;

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f12711c;

    /* renamed from: d */
    final /* synthetic */ int f12712d;

    /* renamed from: e */
    final /* synthetic */ C3881bn f12713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3875bh(C3881bn c3881bn, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(c3881bn, taskCompletionSource);
        this.f12713e = c3881bn;
        this.f12709a = bundle;
        this.f12710b = activity;
        this.f12711c = taskCompletionSource2;
        this.f12712d = i7;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        C2667G c2667g;
        C3860at c3860at;
        if (C3881bn.m15239k(this.f12713e)) {
            super.mo9146a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C3881bn c3881bn = this.f12713e;
            C2680f c2680f = c3881bn.f12723a;
            InterfaceC2697w interfaceC2697w = (InterfaceC2697w) c2680f.m9170e();
            Bundle bundle = this.f12709a;
            c3860at = c3881bn.f12727e;
            interfaceC2697w.mo9193c(bundle, c3860at.m15221a(this.f12710b, this.f12711c, c2680f));
        } catch (RemoteException e7) {
            C3881bn c3881bn2 = this.f12713e;
            int i7 = this.f12712d;
            c2667g = c3881bn2.f12724b;
            c2667g.m9143c(e7, "requestAndShowDialog(%s)", Integer.valueOf(i7));
            this.f12711c.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
