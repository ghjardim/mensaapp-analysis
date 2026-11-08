package com.google.android.gms.internal.p393authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p313p2.C6115j;

/* loaded from: classes.dex */
public abstract class zbu extends zbb implements zbv {
    public zbu() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p393authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C6115j c6115j = (C6115j) zbc.zba(parcel, C6115j.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c6115j);
        return true;
    }
}
