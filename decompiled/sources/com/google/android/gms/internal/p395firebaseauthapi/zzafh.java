package com.google.android.gms.internal.p395firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import p003A2.C0019a;

/* loaded from: classes.dex */
final class zzafh extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzafd zzb;

    public zzafh(zzafd zzafdVar, String str) {
        this.zzb = zzafdVar;
        this.zza = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        C0019a c0019a;
        C0019a c0019a2;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).m14803z0() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                hashMap = this.zzb.zzd;
                zzafk zzafkVar = (zzafk) hashMap.get(this.zza);
                if (zzafkVar == null) {
                    c0019a2 = zzafd.zza;
                    c0019a2.m61c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zza = zzafd.zza(str);
                    zzafkVar.zze = zza;
                    if (zza == null) {
                        c0019a = zzafd.zza;
                        c0019a.m61c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzae.zzc(zzafkVar.zzd)) {
                        zzafd.zzb(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
