package p345t2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p393authapi.zba;
import com.google.android.gms.internal.p393authapi.zbc;

/* renamed from: t2.w */
/* loaded from: classes.dex */
public final class C6454w extends zba implements IInterface {
    public C6454w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void m26948a(InterfaceC6453v interfaceC6453v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC6453v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(103, zba);
    }

    /* renamed from: b */
    public final void m26949b(InterfaceC6453v interfaceC6453v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC6453v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(102, zba);
    }

    /* renamed from: f */
    public final void m26950f(InterfaceC6453v interfaceC6453v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC6453v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
