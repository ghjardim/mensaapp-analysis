package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.play.core.integrity.aq */
/* loaded from: classes.dex */
final class C3857aq extends IntegrityTokenResponse {

    /* renamed from: a */
    private final String f12675a;

    /* renamed from: b */
    private final AbstractC3914y f12676b;

    public C3857aq(String str, AbstractC3914y abstractC3914y) {
        this.f12675a = str;
        this.f12676b = abstractC3914y;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i7) {
        return this.f12676b.m15254a(activity, i7);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f12675a;
    }
}
