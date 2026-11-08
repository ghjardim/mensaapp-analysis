package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p256j$.util.DesugarCollections;

/* renamed from: com.google.android.gms.common.api.internal.A */
/* loaded from: classes.dex */
public final class C3652A {

    /* renamed from: a */
    public final Map f12269a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f12270b = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    public final void m14826c(BasePendingResult basePendingResult, boolean z6) {
        this.f12269a.put(basePendingResult, Boolean.valueOf(z6));
        basePendingResult.addStatusListener(new C3725y(this, basePendingResult));
    }

    /* renamed from: d */
    public final void m14827d(TaskCompletionSource taskCompletionSource, boolean z6) {
        this.f12270b.put(taskCompletionSource, Boolean.valueOf(z6));
        taskCompletionSource.getTask().addOnCompleteListener(new C3726z(this, taskCompletionSource));
    }

    /* renamed from: e */
    public final void m14828e(int i7, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m14831h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void m14829f() {
        m14831h(false, C3688f.f12343w);
    }

    /* renamed from: g */
    public final boolean m14830g() {
        return (this.f12269a.isEmpty() && this.f12270b.isEmpty()) ? false : true;
    }

    /* renamed from: h */
    public final void m14831h(boolean z6, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f12269a) {
            hashMap = new HashMap(this.f12269a);
        }
        synchronized (this.f12270b) {
            hashMap2 = new HashMap(this.f12270b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z6 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z6 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new C3644b(status));
            }
        }
    }
}
