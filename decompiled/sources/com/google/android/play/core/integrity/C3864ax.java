package com.google.android.play.core.integrity;

import android.content.Context;
import p157W2.AbstractC2682h;

/* renamed from: com.google.android.play.core.integrity.ax */
/* loaded from: classes.dex */
final class C3864ax {

    /* renamed from: a */
    private static InterfaceC3863aw f12688a;

    /* renamed from: a */
    public static synchronized InterfaceC3863aw m15225a(Context context) {
        InterfaceC3863aw interfaceC3863aw;
        synchronized (C3864ax.class) {
            try {
                if (f12688a == null) {
                    C3910u c3910u = new C3910u(null);
                    c3910u.m15253a(AbstractC2682h.m9176a(context));
                    f12688a = c3910u.mo15223b();
                }
                interfaceC3863aw = f12688a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3863aw;
    }
}
