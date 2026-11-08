package com.google.android.gms.internal.p393authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import p313p2.C6114i;

/* loaded from: classes.dex */
public final class zbn extends zba implements IInterface {
    public zbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbt zbtVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbtVar);
        zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbv zbvVar, C6114i c6114i) {
        Parcel zba = zba();
        zbc.zbd(zba, zbvVar);
        zbc.zbc(zba, c6114i);
        zbb(2, zba);
    }
}
