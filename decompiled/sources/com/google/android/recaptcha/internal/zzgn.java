package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7025p;

/* loaded from: classes.dex */
public final class zzgn implements zzgx {
    public static final zzgn zza = new zzgn();

    private zzgn() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(AbstractC7025p.m28868n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzue) it.next()).zzR()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        if (!zzb(AbstractC7020k.m28832b0(zzueVarArr))) {
            throw new zzce(4, 5, null);
        }
        for (zzue zzueVar : zzueVarArr) {
            zzgdVar.zzc().zzb(zzueVar.zzi());
        }
    }
}
