package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.play.core.integrity.ah */
/* loaded from: classes.dex */
final class C3848ah extends AbstractC3914y {

    /* renamed from: a */
    final /* synthetic */ BinderC3849ai f12656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3848ah(BinderC3849ai binderC3849ai, String str, long j7) {
        super(str, j7);
        this.f12656a = binderC3849ai;
    }

    @Override // com.google.android.play.core.integrity.AbstractC3914y
    /* renamed from: b */
    public final Task mo15212b(Activity activity, Bundle bundle) {
        return this.f12656a.f12657a.m15218b(activity, bundle);
    }
}
