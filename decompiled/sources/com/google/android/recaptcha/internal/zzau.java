package com.google.android.recaptcha.internal;

import java.util.Map;
import p069J5.InterfaceC0789a;

/* loaded from: classes.dex */
public final class zzau {
    public static final zzav zza() {
        zzav zzavVar;
        InterfaceC0789a interfaceC0789a;
        Map map;
        zzavVar = zzav.zzb;
        if (zzavVar != null) {
            return zzavVar;
        }
        interfaceC0789a = zzav.zzd;
        zzav zzavVar2 = new zzav((Map) interfaceC0789a.invoke(), null);
        map = zzav.zzc;
        map.clear();
        zzav.zzb = zzavVar2;
        return zzavVar2;
    }
}
