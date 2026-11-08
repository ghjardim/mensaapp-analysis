package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import p003A2.C0019a;

/* loaded from: classes.dex */
final class zzaff implements OnFailureListener {
    public zzaff(zzafd zzafdVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        C0019a c0019a;
        c0019a = zzafd.zza;
        c0019a.m61c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
