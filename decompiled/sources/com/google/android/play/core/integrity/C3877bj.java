package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.play.core.integrity.bj */
/* loaded from: classes.dex */
final class C3877bj extends AbstractC3914y {

    /* renamed from: a */
    final /* synthetic */ BinderC3878bk f12716a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3877bj(BinderC3878bk binderC3878bk, String str, long j7) {
        super(str, j7);
        this.f12716a = binderC3878bk;
    }

    @Override // com.google.android.play.core.integrity.AbstractC3914y
    /* renamed from: b */
    public final Task mo15212b(Activity activity, Bundle bundle) {
        long j7;
        j7 = this.f12716a.f12719e;
        bundle.putLong("cloud.prj", j7);
        return this.f12716a.f12717c.m15240c(activity, bundle);
    }
}
