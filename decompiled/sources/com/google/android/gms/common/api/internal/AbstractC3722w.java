package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3770b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes.dex */
public abstract class AbstractC3722w {
    /* renamed from: a */
    public static void m15007a(Status status, TaskCompletionSource taskCompletionSource) {
        m15008b(status, null, taskCompletionSource);
    }

    /* renamed from: b */
    public static void m15008b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.m14799D0()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(AbstractC3770b.m15045a(status));
        }
    }

    /* renamed from: c */
    public static boolean m15009c(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        return status.m14799D0() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(AbstractC3770b.m15045a(status));
    }
}
