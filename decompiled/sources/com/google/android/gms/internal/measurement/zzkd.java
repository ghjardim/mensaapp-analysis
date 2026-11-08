package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class zzkd extends zzki {
    public zzkd(zzkf zzkfVar, String str, Double d7, boolean z6) {
        super(zzkfVar, "measurement.test.double_flag", d7, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + this.zzb + ": " + obj.toString());
        return null;
    }
}
