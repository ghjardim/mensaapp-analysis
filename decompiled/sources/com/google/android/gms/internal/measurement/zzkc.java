package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class zzkc extends zzki {
    public zzkc(zzkf zzkfVar, String str, Boolean bool, boolean z6) {
        super(zzkfVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzjc.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzjc.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.zzb + ": " + obj.toString());
        return null;
    }
}
