package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p122R2.C2229a;
import p122R2.C2238j;

/* loaded from: classes.dex */
final class zzaa implements InterfaceC3729l {
    private final Status zza;
    private final C2238j zzb;

    public zzaa(Status status, C2238j c2238j) {
        this.zza = status;
        this.zzb = c2238j;
    }

    public final List<C2229a> getHarmfulAppsList() {
        C2238j c2238j = this.zzb;
        return c2238j == null ? Collections.emptyList() : Arrays.asList(c2238j.f6851b);
    }

    public final int getHoursSinceLastScanWithHarmfulApp() {
        C2238j c2238j = this.zzb;
        if (c2238j == null) {
            return -1;
        }
        return c2238j.f6852c;
    }

    public final long getLastScanTimeMs() {
        C2238j c2238j = this.zzb;
        if (c2238j == null) {
            return 0L;
        }
        return c2238j.f6850a;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.zza;
    }
}
