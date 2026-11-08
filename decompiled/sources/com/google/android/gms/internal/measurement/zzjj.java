package com.google.android.gms.internal.measurement;

import android.content.Context;
import p171Y2.InterfaceC2939v;

/* loaded from: classes.dex */
final class zzjj extends zzkg {
    private final Context zza;
    private final InterfaceC2939v zzb;

    public zzjj(Context context, InterfaceC2939v interfaceC2939v) {
        this.zza = context;
        this.zzb = interfaceC2939v;
    }

    public final boolean equals(Object obj) {
        InterfaceC2939v interfaceC2939v;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza()) && ((interfaceC2939v = this.zzb) != null ? interfaceC2939v.equals(zzkgVar.zzb()) : zzkgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        InterfaceC2939v interfaceC2939v = this.zzb;
        return (hashCode * 1000003) ^ (interfaceC2939v == null ? 0 : interfaceC2939v.hashCode());
    }

    public final String toString() {
        InterfaceC2939v interfaceC2939v = this.zzb;
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + String.valueOf(interfaceC2939v) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final InterfaceC2939v zzb() {
        return this.zzb;
    }
}
