package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.u */
/* loaded from: classes.dex */
public class C3718u extends BasePendingResult {
    public C3718u(AbstractC3648f abstractC3648f) {
        super(abstractC3648f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC3729l createFailedResult(Status status) {
        return status;
    }
}
