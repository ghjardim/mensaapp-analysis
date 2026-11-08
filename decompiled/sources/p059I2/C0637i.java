package p059I2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import p052H2.InterfaceC0552a;

/* renamed from: I2.i */
/* loaded from: classes.dex */
public final class C0637i extends zza implements IInterface {
    public C0637i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: Y */
    public final InterfaceC0552a m2536Y(InterfaceC0552a interfaceC0552a, String str, int i7, InterfaceC0552a interfaceC0552a2) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC0552a);
        zza.writeString(str);
        zza.writeInt(i7);
        zzc.zze(zza, interfaceC0552a2);
        Parcel zzB = zzB(8, zza);
        InterfaceC0552a m2136a = InterfaceC0552a.a.m2136a(zzB.readStrongBinder());
        zzB.recycle();
        return m2136a;
    }

    /* renamed from: Z */
    public final InterfaceC0552a m2537Z(InterfaceC0552a interfaceC0552a, String str, int i7) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC0552a);
        zza.writeString(str);
        zza.writeInt(i7);
        Parcel zzB = zzB(4, zza);
        InterfaceC0552a m2136a = InterfaceC0552a.a.m2136a(zzB.readStrongBinder());
        zzB.recycle();
        return m2136a;
    }

    /* renamed from: a */
    public final int m2538a(InterfaceC0552a interfaceC0552a, String str, boolean z6) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC0552a);
        zza.writeString(str);
        zza.writeInt(z6 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: a0 */
    public final InterfaceC0552a m2539a0(InterfaceC0552a interfaceC0552a, String str, boolean z6, long j7) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC0552a);
        zza.writeString(str);
        zza.writeInt(z6 ? 1 : 0);
        zza.writeLong(j7);
        Parcel zzB = zzB(7, zza);
        InterfaceC0552a m2136a = InterfaceC0552a.a.m2136a(zzB.readStrongBinder());
        zzB.recycle();
        return m2136a;
    }

    /* renamed from: b */
    public final int m2540b(InterfaceC0552a interfaceC0552a, String str, boolean z6) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC0552a);
        zza.writeString(str);
        zza.writeInt(z6 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final InterfaceC0552a m2541f(InterfaceC0552a interfaceC0552a, String str, int i7) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC0552a);
        zza.writeString(str);
        zza.writeInt(i7);
        Parcel zzB = zzB(2, zza);
        InterfaceC0552a m2136a = InterfaceC0552a.a.m2136a(zzB.readStrongBinder());
        zzB.recycle();
        return m2136a;
    }

    public final int zze() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
