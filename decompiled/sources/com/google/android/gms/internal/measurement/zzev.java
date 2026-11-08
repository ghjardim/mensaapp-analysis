package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p108P2.InterfaceC1816r4;

/* loaded from: classes.dex */
final class zzev extends zzdd {
    private final InterfaceC1816r4 zza;

    public zzev(InterfaceC1816r4 interfaceC1816r4) {
        this.zza = interfaceC1816r4;
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final int zze() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final void zzf(String str, String str2, Bundle bundle, long j7) {
        this.zza.mo5976a(str, str2, bundle, j7);
    }
}
