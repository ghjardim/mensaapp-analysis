package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p334s.C6308a;

/* loaded from: classes.dex */
public final class zzjx {
    public static final /* synthetic */ int zza = 0;
    private static final C6308a zzb = new C6308a();

    public static synchronized Uri zza(String str) {
        synchronized (zzjx.class) {
            C6308a c6308a = zzb;
            Uri uri = (Uri) c6308a.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            c6308a.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
