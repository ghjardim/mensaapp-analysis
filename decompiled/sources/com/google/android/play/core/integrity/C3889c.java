package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.c */
/* loaded from: classes.dex */
final class C3889c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a */
    private long f12741a;

    /* renamed from: b */
    private byte f12742b;

    /* renamed from: a */
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder m15244a(int i7) {
        this.f12742b = (byte) (this.f12742b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f12742b == 3) {
            return new C3892e(this.f12741a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f12742b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f12742b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j7) {
        this.f12741a = j7;
        this.f12742b = (byte) (this.f12742b | 1);
        return this;
    }
}
