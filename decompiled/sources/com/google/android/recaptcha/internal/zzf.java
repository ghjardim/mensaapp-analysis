package com.google.android.recaptcha.internal;

import p132S5.C2354T0;

/* loaded from: classes.dex */
public final class zzf {
    public static final zzbd zza(Exception exc, zzbd zzbdVar) {
        return exc instanceof C2354T0 ? new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage()) : exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
