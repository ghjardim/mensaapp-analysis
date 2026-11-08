package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes.dex */
public interface InterfaceC3690g extends IInterface {

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    public static abstract class a extends zab implements InterfaceC3690g {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static InterfaceC3690g asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof InterfaceC3690g ? (InterfaceC3690g) queryLocalInterface : new C3671T(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 != 1) {
                return false;
            }
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            zac.zab(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(Status status);
}
