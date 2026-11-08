package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzae implements Iterable, zzap, zzal {
    final SortedMap zza;
    final Map zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzc() != zzaeVar.zzc()) {
            return false;
        }
        SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int intValue = ((Integer) sortedMap.firstKey()).intValue(); intValue <= ((Integer) sortedMap.lastKey()).intValue(); intValue++) {
            if (!zze(intValue).equals(zzaeVar.zze(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc() {
        SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzcz(String str, zzg zzgVar, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzbb.zza(str, this, zzgVar, list) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzaeVar.zza.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzaeVar.zza.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzaeVar;
    }

    public final zzap zze(int i7) {
        zzap zzapVar;
        if (i7 < zzc()) {
            return (!zzs(i7) || (zzapVar = (zzap) this.zza.get(Integer.valueOf(i7))) == null) ? zzap.zzf : zzapVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        return "length".equals(str) ? new zzah(Double.valueOf(zzc())) : (!zzt(str) || (zzapVar = (zzap) this.zzb.get(str)) == null) ? zzap.zzf : zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        SortedMap sortedMap = this.zza;
        return sortedMap.size() == 1 ? zze(0).zzh() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int i7 = 0;
            while (true) {
                str2 = str == null ? StringUtils.EMPTY : str;
                if (i7 >= zzc()) {
                    break;
                }
                zzap zze = zze(i7);
                sb.append(str2);
                if (!(zze instanceof zzau) && !(zze instanceof zzan)) {
                    sb.append(zze.zzi());
                }
                i7++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.zza.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i7 = 0; i7 < zzc(); i7++) {
            arrayList.add(zze(i7));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzo(int i7, zzap zzapVar) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i7);
        }
        if (i7 >= zzc()) {
            zzq(i7, zzapVar);
            return;
        }
        SortedMap sortedMap = this.zza;
        for (int intValue = ((Integer) sortedMap.lastKey()).intValue(); intValue >= i7; intValue--) {
            Integer valueOf = Integer.valueOf(intValue);
            zzap zzapVar2 = (zzap) sortedMap.get(valueOf);
            if (zzapVar2 != null) {
                zzq(intValue + 1, zzapVar2);
                sortedMap.remove(valueOf);
            }
        }
        zzq(i7, zzapVar);
    }

    public final void zzp(int i7) {
        SortedMap sortedMap = this.zza;
        int intValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i7 > intValue || i7 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i7));
        if (i7 == intValue) {
            int i8 = i7 - 1;
            Integer valueOf = Integer.valueOf(i8);
            if (sortedMap.containsKey(valueOf) || i8 < 0) {
                return;
            }
            sortedMap.put(valueOf, zzap.zzf);
            return;
        }
        while (true) {
            i7++;
            if (i7 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i7);
            zzap zzapVar = (zzap) sortedMap.get(valueOf2);
            if (zzapVar != null) {
                sortedMap.put(Integer.valueOf(i7 - 1), zzapVar);
                sortedMap.remove(valueOf2);
            }
        }
    }

    public final void zzq(int i7, zzap zzapVar) {
        if (i7 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i7);
        }
        if (zzapVar == null) {
            this.zza.remove(Integer.valueOf(i7));
        } else {
            this.zza.put(Integer.valueOf(i7), zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i7) {
        if (i7 >= 0) {
            SortedMap sortedMap = this.zza;
            if (i7 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i7));
            }
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i7);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                zzq(i7, (zzap) list.get(i7));
            }
        }
    }
}
