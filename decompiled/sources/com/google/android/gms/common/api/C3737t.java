package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.common.api.t */
/* loaded from: classes.dex */
public final class C3737t extends BasePendingResult {

    /* renamed from: a */
    public final InterfaceC3729l f12417a;

    public C3737t(AbstractC3648f abstractC3648f, InterfaceC3729l interfaceC3729l) {
        super(abstractC3648f);
        this.f12417a = interfaceC3729l;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final InterfaceC3729l createFailedResult(Status status) {
        return this.f12417a;
    }
}
