package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p354u3.C6668p;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzadb extends zzaeg<Void, InterfaceC6679u0> {
    private final String zzaa;
    private final String zzab;
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public zzadb(C6668p c6668p, String str, String str2, long j7, boolean z6, boolean z7, String str3, String str4, String str5, boolean z8) {
        super(8);
        AbstractC3802r.m15129k(c6668p);
        AbstractC3802r.m15123e(str);
        this.zzu = AbstractC3802r.m15123e(c6668p.m27574A0());
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j7;
        this.zzy = z6;
        this.zzz = z7;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z8;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }
}
