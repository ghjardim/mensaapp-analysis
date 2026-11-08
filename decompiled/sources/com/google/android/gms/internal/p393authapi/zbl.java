package com.google.android.gms.internal.p393authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p313p2.C6108c;

/* loaded from: classes.dex */
public abstract class zbl extends zbb implements zbm {
    public zbl() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p393authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C6108c c6108c = (C6108c) zbc.zba(parcel, C6108c.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c6108c);
        return true;
    }
}
