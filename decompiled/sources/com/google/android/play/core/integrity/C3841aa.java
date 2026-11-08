package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.play.core.integrity.aa */
/* loaded from: classes.dex */
final class C3841aa implements IntegrityManager {

    /* renamed from: a */
    private final C3850aj f12642a;

    public C3841aa(C3850aj c3850aj) {
        this.f12642a = c3850aj;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f12642a.m15219c(integrityTokenRequest);
    }
}
