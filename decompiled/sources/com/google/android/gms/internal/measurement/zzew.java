package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p108P2.InterfaceC1825s4;

/* loaded from: classes.dex */
final class zzew extends zzdd {
    private final InterfaceC1825s4 zza;

    public zzew(InterfaceC1825s4 interfaceC1825s4) {
        this.zza = interfaceC1825s4;
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final int zze() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final void zzf(String str, String str2, Bundle bundle, long j7) {
        this.zza.mo6272a(str, str2, bundle, j7);
    }
}
