package com.google.android.gms.common.api;

import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: classes.dex */
public class C3644b extends Exception {

    @Deprecated
    protected final Status mStatus;

    public C3644b(Status status) {
        super(status.m14803z0() + ": " + (status.m14796A0() != null ? status.m14796A0() : StringUtils.EMPTY));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.m14803z0();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.m14796A0();
    }
}
