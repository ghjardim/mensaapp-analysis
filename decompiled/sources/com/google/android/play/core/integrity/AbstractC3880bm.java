package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.AbstractRunnableC2668H;
import p157W2.C2681g;

/* renamed from: com.google.android.play.core.integrity.bm */
/* loaded from: classes.dex */
abstract class AbstractC3880bm extends AbstractRunnableC2668H {

    /* renamed from: f */
    final /* synthetic */ C3881bn f12722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3880bm(C3881bn c3881bn, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f12722f = c3881bn;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: a */
    public final void mo9146a(Exception exc) {
        if (!(exc instanceof C2681g)) {
            super.mo9146a(exc);
        } else if (C3881bn.m15239k(this.f12722f)) {
            super.mo9146a(new StandardIntegrityException(-2, exc));
        } else {
            super.mo9146a(new StandardIntegrityException(-9, exc));
        }
    }
}
