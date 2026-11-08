package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: classes.dex */
public final class C3725y implements AbstractC3650h.a {

    /* renamed from: a */
    public final /* synthetic */ BasePendingResult f12411a;

    /* renamed from: b */
    public final /* synthetic */ C3652A f12412b;

    public C3725y(C3652A c3652a, BasePendingResult basePendingResult) {
        this.f12412b = c3652a;
        this.f12411a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.AbstractC3650h.a
    /* renamed from: a */
    public final void mo14820a(Status status) {
        Map map;
        map = this.f12412b.f12269a;
        map.remove(this.f12411a);
    }
}
