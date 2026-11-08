package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC3786j;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3768a extends InterfaceC3786j.a {
    /* renamed from: b */
    public static Account m15044b(InterfaceC3786j interfaceC3786j) {
        Account account = null;
        if (interfaceC3786j != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC3786j.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
