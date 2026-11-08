package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2334J;

/* loaded from: classes.dex */
public final class zzfw {
    private final WebView zza;
    private final InterfaceC2334J zzb;

    public zzfw(WebView webView, InterfaceC2334J interfaceC2334J) {
        this.zza = webView;
        this.zzb = interfaceC2334J;
    }

    public final void zzb(String str, String... strArr) {
        AbstractC2388k.m8128d(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}
