package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2334J;

/* loaded from: classes.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC2334J interfaceC2334J;
        zzan zzanVar = this.zza;
        interfaceC2334J = zzanVar.zzb;
        AbstractC2388k.m8128d(interfaceC2334J, null, null, new zzaj(zzanVar, null), 3, null);
    }
}
