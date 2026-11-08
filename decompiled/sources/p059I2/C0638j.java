package p059I2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import p052H2.InterfaceC0552a;

/* renamed from: I2.j */
/* loaded from: classes.dex */
public final class C0638j extends zza implements IInterface {
    public C0638j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final InterfaceC0552a m2542a(InterfaceC0552a interfaceC0552a, String str, int i7, InterfaceC0552a interfaceC0552a2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC0552a);
        zza.writeString(str);
        zza.writeInt(i7);
        zzc.zze(zza, interfaceC0552a2);
        Parcel zzB = zzB(2, zza);
        InterfaceC0552a m2136a = InterfaceC0552a.a.m2136a(zzB.readStrongBinder());
        zzB.recycle();
        return m2136a;
    }

    /* renamed from: b */
    public final InterfaceC0552a m2543b(InterfaceC0552a interfaceC0552a, String str, int i7, InterfaceC0552a interfaceC0552a2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC0552a);
        zza.writeString(str);
        zza.writeInt(i7);
        zzc.zze(zza, interfaceC0552a2);
        Parcel zzB = zzB(3, zza);
        InterfaceC0552a m2136a = InterfaceC0552a.a.m2136a(zzB.readStrongBinder());
        zzB.recycle();
        return m2136a;
    }
}
