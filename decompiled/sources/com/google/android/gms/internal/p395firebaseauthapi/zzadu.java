package com.google.android.gms.internal.p395firebaseauthapi;

import android.content.Context;
import p368w2.AbstractC6874o;
import p368w2.C6870k;

/* loaded from: classes.dex */
public final class zzadu {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int mo28258h = C6870k.m28272f().mo28258h(context, AbstractC6874o.f24694a);
            zza = Boolean.valueOf(mo28258h == 0 || mo28258h == 2);
        }
        return zza.booleanValue();
    }
}
