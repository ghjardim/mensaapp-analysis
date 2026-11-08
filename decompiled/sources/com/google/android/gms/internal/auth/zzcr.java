package com.google.android.gms.internal.auth;

import android.net.Uri;
import p334s.C6308a;

/* loaded from: classes.dex */
public final class zzcr {
    private static final C6308a zza = new C6308a();

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            C6308a c6308a = zza;
            Uri uri = (Uri) c6308a.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            c6308a.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
