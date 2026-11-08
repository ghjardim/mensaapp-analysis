package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7025p;

/* loaded from: classes.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC7020k.m28827W((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return AbstractC7020k.m28833c0((short[]) obj);
        }
        if (obj instanceof int[]) {
            return AbstractC7020k.m28830Z((int[]) obj);
        }
        if (obj instanceof long[]) {
            return AbstractC7020k.m28831a0((long[]) obj);
        }
        if (obj instanceof float[]) {
            return AbstractC7020k.m28829Y((float[]) obj);
        }
        if (obj instanceof double[]) {
            return AbstractC7020k.m28828X((double[]) obj);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i7, zzb(zza2, zza3));
    }

    public final Object zzb(Object obj, Object obj2) {
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(AbstractC7025p.m28868n(zzc2, 10));
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(AbstractC7025p.m28868n(zzc, 10));
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc == null || zzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = Double.valueOf(Math.pow(((Number) zzc.get(i7)).doubleValue(), ((Number) zzc2.get(i7)).doubleValue()));
        }
        return dArr;
    }
}
