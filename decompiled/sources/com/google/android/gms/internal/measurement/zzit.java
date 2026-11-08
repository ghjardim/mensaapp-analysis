package com.google.android.gms.internal.measurement;

import java.util.List;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzit extends zzmd implements zzni {
    private static final zzit zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private zzmj zzf = zzmd.zzcn();

    static {
        zzit zzitVar = new zzit();
        zzb = zzitVar;
        zzmd.zzct(zzit.class, zzitVar);
    }

    private zzit() {
    }

    public final String zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", zziz.class});
        }
        if (i8 == 3) {
            return new zzit();
        }
        zzja zzjaVar = null;
        if (i8 == 4) {
            return new zzis(zzjaVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
