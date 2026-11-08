package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return C3915z.m15255a(context).m15252a();
    }

    public static StandardIntegrityManager createStandard(Context context) {
        return C3864ax.m15225a(context).mo15224a();
    }
}
