package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.common.api.u */
/* loaded from: classes.dex */
public final class C3738u extends BasePendingResult {
    public C3738u(AbstractC3648f abstractC3648f) {
        super(abstractC3648f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final InterfaceC3729l createFailedResult(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
