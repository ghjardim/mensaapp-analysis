package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes.dex */
public interface InterfaceC3786j extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.j$a */
    public static abstract class a extends zzb implements InterfaceC3786j {
        /* renamed from: a */
        public static InterfaceC3786j m15094a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC3786j ? (InterfaceC3786j) queryLocalInterface : new C3815x0(iBinder);
        }
    }

    Account zzb();
}
