package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p125R5.AbstractC2294t;
import p378x5.AbstractC7032w;

/* loaded from: classes.dex */
public final class zzfu {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        Iterator it = AbstractC2294t.m7778g0(str, new char[]{'.'}, false, 0, 6, null).iterator();
        String str2 = StringUtils.EMPTY;
        while (it.hasNext()) {
            String concat = str2.concat(String.valueOf((String) it.next()));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }

    public final void zza(zzrv zzrvVar) {
        this.zza = AbstractC7032w.m28893S(zzrvVar.zzf().zzi());
        this.zzb = AbstractC7032w.m28893S(zzrvVar.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        AbstractC5469l.m23026c(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        AbstractC5469l.m23026c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
