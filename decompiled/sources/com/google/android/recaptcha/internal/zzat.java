package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0789a;
import p378x5.AbstractC7004D;

/* loaded from: classes.dex */
final class zzat extends AbstractC5470m implements InterfaceC0789a {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map;
        map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7004D.m28732a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // p069J5.InterfaceC0789a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
