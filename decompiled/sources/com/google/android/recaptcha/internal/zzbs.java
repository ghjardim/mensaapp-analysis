package com.google.android.recaptcha.internal;

import android.content.Context;
import p368w2.C6870k;

/* loaded from: classes.dex */
public final class zzbs {
    private final C6870k zza;

    public zzbs(C6870k c6870k) {
        this.zza = c6870k;
    }

    public final int zza(Context context) {
        int mo28257g = this.zza.mo28257g(context);
        return (mo28257g == 1 || mo28257g == 3 || mo28257g == 9) ? 4 : 3;
    }

    public zzbs() {
        this.zza = C6870k.m28272f();
    }
}
