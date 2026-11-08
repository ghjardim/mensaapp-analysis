package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2932o;

/* loaded from: classes.dex */
public final class zzci {
    private static final ThreadLocal zza = new zzch();

    public static SharedPreferences zza(Context context, String str, int i7, zzcc zzccVar) {
        zzbx.zza();
        zzcg zzcgVar = str.equals(StringUtils.EMPTY) ? new zzcg() : null;
        if (zzcgVar != null) {
            return zzcgVar;
        }
        ThreadLocal threadLocal = zza;
        AbstractC2932o.m10561d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            zza.set(Boolean.TRUE);
            throw th;
        }
    }
}
