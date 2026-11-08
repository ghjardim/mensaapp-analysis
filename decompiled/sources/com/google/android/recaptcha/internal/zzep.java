package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2334J;

/* loaded from: classes.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC2334J interfaceC2334J;
        zzes zzesVar = this.zza;
        interfaceC2334J = zzesVar.zzd;
        AbstractC2388k.m8128d(interfaceC2334J, null, null, new zzeq(zzesVar, null), 3, null);
    }
}
