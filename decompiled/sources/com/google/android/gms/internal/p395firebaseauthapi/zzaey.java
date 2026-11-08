package com.google.android.gms.internal.p395firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import p031E2.AbstractC0265a;
import p031E2.AbstractC0273i;

/* loaded from: classes.dex */
public final class zzaey {
    private final String zza;
    private final String zzb;

    public zzaey(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzaey(Context context, String str) {
        AbstractC3802r.m15129k(context);
        String m15123e = AbstractC3802r.m15123e(str);
        this.zza = m15123e;
        try {
            byte[] m1094a = AbstractC0265a.m1094a(context, m15123e);
            if (m1094a != null) {
                this.zzb = AbstractC0273i.m1126c(m1094a, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
