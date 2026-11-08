package com.google.android.gms.internal.measurement;

import android.net.Uri;
import org.apache.tika.utils.StringUtils;
import p334s.C6318k;

/* loaded from: classes.dex */
public final class zzjo {
    private final C6318k zza;

    public zzjo(C6318k c6318k) {
        this.zza = c6318k;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        C6318k c6318k = uri != null ? (C6318k) this.zza.get(uri.toString()) : null;
        if (c6318k == null) {
            return null;
        }
        return (String) c6318k.get(StringUtils.EMPTY.concat(str3));
    }
}
