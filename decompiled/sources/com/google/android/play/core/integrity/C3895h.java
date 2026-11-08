package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.h */
/* loaded from: classes.dex */
final class C3895h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a */
    private final String f12745a;

    public /* synthetic */ C3895h(String str, C3894g c3894g) {
        this.f12745a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    /* renamed from: a */
    public final String mo15207a() {
        return this.f12745a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f12745a;
        return str == null ? standardIntegrityTokenRequest.mo15207a() == null : str.equals(standardIntegrityTokenRequest.mo15207a());
    }

    public final int hashCode() {
        String str = this.f12745a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f12745a + "}";
    }
}
