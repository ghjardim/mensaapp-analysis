package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.e */
/* loaded from: classes.dex */
final class C3892e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a */
    private final long f12743a;

    public /* synthetic */ C3892e(long j7, int i7, C3891d c3891d) {
        this.f12743a = j7;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* renamed from: a */
    public final int mo15205a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* renamed from: b */
    public final long mo15206b() {
        return this.f12743a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f12743a == prepareIntegrityTokenRequest.mo15206b()) {
                prepareIntegrityTokenRequest.mo15205a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f12743a;
        return (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f12743a + ", webViewRequestMode=0}";
    }
}
