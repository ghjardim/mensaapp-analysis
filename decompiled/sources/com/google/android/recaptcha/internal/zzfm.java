package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.AbstractC6924g;
import p371w5.InterfaceC6923f;

/* loaded from: classes.dex */
public final class zzfm {
    private final InterfaceC6923f zza;

    public zzfm() {
        int i7 = zzav.zza;
        this.zza = AbstractC6924g.m28367a(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        AbstractC5469l.m23026c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
