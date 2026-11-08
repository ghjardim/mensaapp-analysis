package com.google.android.play.core.integrity;

import android.content.Context;
import p157W2.AbstractC2682h;

/* renamed from: com.google.android.play.core.integrity.z */
/* loaded from: classes.dex */
final class C3915z {

    /* renamed from: a */
    private static C3908s f12772a;

    /* renamed from: a */
    public static synchronized C3908s m15255a(Context context) {
        C3908s c3908s;
        synchronized (C3915z.class) {
            try {
                if (f12772a == null) {
                    C3906q c3906q = new C3906q(null);
                    c3906q.m15250a(AbstractC2682h.m9176a(context));
                    f12772a = c3906q.mo15251b();
                }
                c3908s = f12772a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3908s;
    }
}
