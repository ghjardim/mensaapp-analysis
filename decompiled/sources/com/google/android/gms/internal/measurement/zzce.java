package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p178Z2.AbstractC3006U;
import p178Z2.AbstractC3010Y;

/* loaded from: classes.dex */
final class zzce implements SharedPreferences.Editor {
    boolean zza = false;
    final Set zzb = new HashSet();
    final Map zzc = new HashMap();
    final /* synthetic */ zzcg zzd;

    public /* synthetic */ zzce(zzcg zzcgVar, zzcf zzcfVar) {
        this.zzd = zzcgVar;
    }

    private final void zza(String str, Object obj) {
        if (obj != null) {
            this.zzc.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        Map map;
        Set<SharedPreferences.OnSharedPreferenceChangeListener> set;
        Map map2;
        Map map3;
        if (this.zza) {
            map3 = this.zzd.zza;
            map3.clear();
        }
        zzcg zzcgVar = this.zzd;
        map = zzcgVar.zza;
        Set keySet = map.keySet();
        Set set2 = this.zzb;
        keySet.removeAll(set2);
        Map map4 = this.zzc;
        for (Map.Entry entry : map4.entrySet()) {
            map2 = zzcgVar.zza;
            map2.put((String) entry.getKey(), entry.getValue());
        }
        set = zzcgVar.zzb;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : set) {
            AbstractC3010Y it = AbstractC3006U.m10884k(set2, map4.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(zzcgVar, (String) it.next());
            }
        }
        return (!this.zza && set2.isEmpty() && map4.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z6) {
        zza(str, Boolean.valueOf(z6));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f7) {
        zza(str, Float.valueOf(f7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        zza(str, Integer.valueOf(i7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j7) {
        zza(str, Long.valueOf(j7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        zza(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        zza(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.zzb.add(str);
        return this;
    }
}
