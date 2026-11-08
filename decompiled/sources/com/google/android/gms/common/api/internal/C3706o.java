package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC3649g;
import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.InterfaceC3729l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes.dex */
public final class C3706o extends AbstractC3649g {

    /* renamed from: a */
    public final BasePendingResult f12385a;

    public C3706o(AbstractC3650h abstractC3650h) {
        this.f12385a = (BasePendingResult) abstractC3650h;
    }

    @Override // com.google.android.gms.common.api.AbstractC3650h
    public final void addStatusListener(AbstractC3650h.a aVar) {
        this.f12385a.addStatusListener(aVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC3650h
    public final InterfaceC3729l await(long j7, TimeUnit timeUnit) {
        return this.f12385a.await(j7, timeUnit);
    }
}
