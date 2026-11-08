package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zzago {
    private List<zzagl> zza;

    public zzago() {
        this.zza = new ArrayList();
    }

    public final List<zzagl> zza() {
        return this.zza;
    }

    public zzago(List<zzagl> list) {
        this.zza = DesugarCollections.unmodifiableList(list);
    }
}
