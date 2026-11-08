package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import p178Z2.AbstractC3037z;

/* loaded from: classes.dex */
public final class zzaa {
    private static final AbstractC3037z zza = AbstractC3037z.m11111w("_syn", "_err", "_el");
    private String zzb;
    private final long zzc;
    private final Map zzd;

    public zzaa(String str, long j7, Map map) {
        this.zzb = str;
        this.zzc = j7;
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object zzd(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.zzc == zzaaVar.zzc && this.zzb.equals(zzaaVar.zzb)) {
            return this.zzd.equals(zzaaVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        long j7 = this.zzc;
        return ((hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.zzd.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.zzb + "', timestamp=" + this.zzc + ", params=" + this.zzd.toString() + "}";
    }

    public final long zza() {
        return this.zzc;
    }

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.zzb, this.zzc, new HashMap(this.zzd));
    }

    public final Object zzc(String str) {
        Map map = this.zzd;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final String zze() {
        return this.zzb;
    }

    public final Map zzf() {
        return this.zzd;
    }

    public final void zzg(String str) {
        this.zzb = str;
    }

    public final void zzh(String str, Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
        } else {
            Map map = this.zzd;
            map.put(str, zzd(str, map.get(str), obj));
        }
    }
}
