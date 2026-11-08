package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.h */
/* loaded from: classes.dex */
public abstract class AbstractC3650h {

    /* renamed from: com.google.android.gms.common.api.h$a */
    public interface a {
        /* renamed from: a */
        void mo14820a(Status status);
    }

    public abstract void addStatusListener(a aVar);

    public abstract InterfaceC3729l await(long j7, TimeUnit timeUnit);
}
