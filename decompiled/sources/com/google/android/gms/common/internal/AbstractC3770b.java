package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.C3727j;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes.dex */
public abstract class AbstractC3770b {
    /* renamed from: a */
    public static C3644b m15045a(Status status) {
        return status.m14797B0() ? new C3727j(status) : new C3644b(status);
    }
}
