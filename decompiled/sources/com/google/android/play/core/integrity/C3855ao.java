package com.google.android.play.core.integrity;

/* renamed from: com.google.android.play.core.integrity.ao */
/* loaded from: classes.dex */
final class C3855ao extends IntegrityTokenRequest {

    /* renamed from: a */
    private final String f12672a;

    /* renamed from: b */
    private final Long f12673b;

    /* renamed from: c */
    private final Object f12674c = null;

    public /* synthetic */ C3855ao(String str, Long l7, Object obj, C3854an c3854an) {
        this.f12672a = str;
        this.f12673b = l7;
    }

    /* renamed from: a */
    private static boolean m15220a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f12673b;
    }

    public final boolean equals(Object obj) {
        boolean z6;
        Long l7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f12672a.equals(integrityTokenRequest.nonce()) && ((l7 = this.f12673b) != null ? l7.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z6 = true;
                if ((obj instanceof C3855ao) || !m15220a()) {
                    return z6;
                }
                C3855ao c3855ao = (C3855ao) obj;
                if (!z6) {
                    return false;
                }
                Object obj2 = c3855ao.f12674c;
                return true;
            }
        }
        z6 = false;
        if (obj instanceof C3855ao) {
        }
        return z6;
    }

    public final int hashCode() {
        int hashCode = this.f12672a.hashCode() ^ 1000003;
        Long l7 = this.f12673b;
        int hashCode2 = (hashCode * 1000003) ^ (l7 == null ? 0 : l7.hashCode());
        return m15220a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f12672a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f12672a + ", cloudProjectNumber=" + this.f12673b;
        if (m15220a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
