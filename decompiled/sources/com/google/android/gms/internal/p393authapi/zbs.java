package com.google.android.gms.internal.p393authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p313p2.C6113h;

/* loaded from: classes.dex */
public abstract class zbs extends zbb implements zbt {
    public zbs() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p393authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C6113h c6113h = (C6113h) zbc.zba(parcel, C6113h.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c6113h);
        return true;
    }
}
