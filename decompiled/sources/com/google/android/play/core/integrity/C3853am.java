package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* renamed from: com.google.android.play.core.integrity.am */
/* loaded from: classes.dex */
final class C3853am extends IntegrityTokenRequest.Builder {

    /* renamed from: a */
    private String f12670a;

    /* renamed from: b */
    private Long f12671b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f12670a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        C3854an c3854an = null;
        return new C3855ao(str, this.f12671b, c3854an, c3854an);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j7) {
        this.f12671b = Long.valueOf(j7);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f12670a = str;
        return this;
    }
}
