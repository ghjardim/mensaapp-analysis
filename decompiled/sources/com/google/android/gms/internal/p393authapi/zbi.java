package com.google.android.gms.internal.p393authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p313p2.C6106a;

/* loaded from: classes.dex */
public abstract class zbi extends zbb implements zbj {
    public zbi() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p393authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C6106a c6106a = (C6106a) zbc.zba(parcel, C6106a.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c6106a);
        return true;
    }
}
