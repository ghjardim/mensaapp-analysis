package com.google.android.gms.internal.p393authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC3690g;
import p313p2.C6107b;
import p313p2.C6110e;
import p313p2.C6111f;

/* loaded from: classes.dex */
public final class zbw extends zba implements IInterface {
    public zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, C6107b c6107b) {
        Parcel zba = zba();
        zbc.zbd(zba, zbmVar);
        zbc.zbc(zba, c6107b);
        zbb(1, zba);
    }

    public final void zbd(zbp zbpVar, C6110e c6110e, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbpVar);
        zbc.zbc(zba, c6110e);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbr zbrVar, C6111f c6111f) {
        Parcel zba = zba();
        zbc.zbd(zba, zbrVar);
        zbc.zbc(zba, c6111f);
        zbb(3, zba);
    }

    public final void zbf(InterfaceC3690g interfaceC3690g, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC3690g);
        zba.writeString(str);
        zbb(2, zba);
    }
}
