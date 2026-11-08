package com.google.android.gms.internal.p395firebaseauthapi;

import android.app.Activity;
import com.google.firebase.auth.AbstractC3933b;
import java.util.Map;
import java.util.concurrent.Executor;
import p031E2.C0271g;
import p334s.C6308a;

/* loaded from: classes.dex */
public final class zzafc {
    private static final Map<String, zzafe> zza = new C6308a();

    public static AbstractC3933b.b zza(String str, AbstractC3933b.b bVar, zzaeg zzaegVar) {
        zza(str, zzaegVar);
        return new zzafb(bVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaeg zzaegVar) {
        zza.put(str, new zzafe(zzaegVar, C0271g.m1116d().mo1110a()));
    }

    public static boolean zza(String str, AbstractC3933b.b bVar, Activity activity, Executor executor) {
        Map<String, zzafe> map = zza;
        if (map.containsKey(str)) {
            zzafe zzafeVar = map.get(str);
            if (C0271g.m1116d().mo1110a() - zzafeVar.zzb < 120000) {
                zzaeg zzaegVar = zzafeVar.zza;
                if (zzaegVar == null) {
                    return true;
                }
                zzaegVar.zza(bVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
