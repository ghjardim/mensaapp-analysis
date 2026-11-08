package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.br */
/* loaded from: classes.dex */
final class C3885br extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a */
    private final String f12734a;

    /* renamed from: b */
    private final AbstractC3914y f12735b;

    public C3885br(String str, AbstractC3914y abstractC3914y) {
        this.f12734a = str;
        this.f12735b = abstractC3914y;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i7) {
        return this.f12735b.m15254a(activity, i7);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f12734a;
    }
}
