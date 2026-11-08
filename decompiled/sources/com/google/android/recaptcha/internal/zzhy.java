package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7024o;
import p378x5.AbstractC7032w;

/* loaded from: classes.dex */
public final class zzhy {
    private List zza = AbstractC7024o.m28861g();

    public final long zza(long[] jArr) {
        Iterator it = AbstractC7032w.m28881G(this.zza, AbstractC7020k.m28831a0(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = AbstractC7020k.m28831a0(jArr);
    }
}
