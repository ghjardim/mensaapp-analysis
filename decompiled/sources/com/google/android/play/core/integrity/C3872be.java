package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.AbstractC2684j;
import p157W2.AbstractRunnableC2668H;

/* renamed from: com.google.android.play.core.integrity.be */
/* loaded from: classes.dex */
final class C3872be extends AbstractRunnableC2668H {

    /* renamed from: a */
    final /* synthetic */ Context f12699a;

    /* renamed from: b */
    final /* synthetic */ C3881bn f12700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3872be(C3881bn c3881bn, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f12700b = c3881bn;
        this.f12699a = context;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        TaskCompletionSource taskCompletionSource;
        Context context = this.f12699a;
        taskCompletionSource = this.f12700b.f12726d;
        taskCompletionSource.trySetResult(Integer.valueOf(AbstractC2684j.m9178a(context)));
    }
}
