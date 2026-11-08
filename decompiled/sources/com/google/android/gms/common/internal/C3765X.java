package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.X */
/* loaded from: classes.dex */
public final class C3765X implements InterfaceC3792m {

    /* renamed from: a */
    public final IBinder f12460a;

    public C3765X(IBinder iBinder) {
        this.f12460a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12460a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3792m
    /* renamed from: n */
    public final void mo15039n(InterfaceC3790l interfaceC3790l, C3778f c3778f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC3790l != null ? interfaceC3790l.asBinder() : null);
            if (c3778f != null) {
                obtain.writeInt(1);
                C3797o0.m15097a(c3778f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f12460a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
