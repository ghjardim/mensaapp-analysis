package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.f */
/* loaded from: classes.dex */
final class C3893f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* renamed from: a */
    private String f12744a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new C3895h(this.f12744a, null);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.f12744a = str;
        return this;
    }
}
