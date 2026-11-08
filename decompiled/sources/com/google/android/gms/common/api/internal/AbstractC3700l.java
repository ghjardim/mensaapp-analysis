package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes.dex */
public abstract class AbstractC3700l {
    /* renamed from: a */
    public static C3698k m14974a(Object obj, Looper looper, String str) {
        AbstractC3802r.m15130l(obj, "Listener must not be null");
        AbstractC3802r.m15130l(looper, "Looper must not be null");
        AbstractC3802r.m15130l(str, "Listener type must not be null");
        return new C3698k(looper, obj, str);
    }
}
