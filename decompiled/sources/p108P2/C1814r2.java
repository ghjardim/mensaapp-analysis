package p108P2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: P2.r2 */
/* loaded from: classes.dex */
public final class C1814r2 extends zzbm implements InterfaceC1832t2 {
    public C1814r2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: C */
    public final List mo6026C(String str, String str2, String str3, boolean z6) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        int i7 = zzbo.zza;
        zza.writeInt(z6 ? 1 : 0);
        Parcel zzb = zzb(15, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(C1891z7.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: D */
    public final void mo6027D(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzc(18, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: E */
    public final List mo6028E(String str, String str2, boolean z6, C1482E7 c1482e7) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i7 = zzbo.zza;
        zza.writeInt(z6 ? 1 : 0);
        zzbo.zzd(zza, c1482e7);
        Parcel zzb = zzb(14, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(C1891z7.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: G */
    public final void mo6029G(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzc(25, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: I */
    public final void mo6030I(Bundle bundle, C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzbo.zzd(zza, c1482e7);
        zzc(19, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: K */
    public final byte[] mo6031K(C1519J c1519j, String str) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1519j);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: Q */
    public final C1802q mo6033Q(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        Parcel zzb = zzb(21, zza);
        C1802q c1802q = (C1802q) zzbo.zza(zzb, C1802q.CREATOR);
        zzb.recycle();
        return c1802q;
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: R */
    public final void mo6034R(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzc(20, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: T */
    public final void mo6035T(C1739j c1739j, C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1739j);
        zzbo.zzd(zza, c1482e7);
        zzc(12, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: U */
    public final void mo6036U(long j7, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j7);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: V */
    public final List mo6037V(String str, String str2, C1482E7 c1482e7) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, c1482e7);
        Parcel zzb = zzb(16, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(C1739j.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: X */
    public final void mo6038X(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzc(27, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: e */
    public final void mo6044e(C1482E7 c1482e7, C1657Z6 c1657z6, InterfaceC1886z2 interfaceC1886z2) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzbo.zzd(zza, c1657z6);
        zzbo.zze(zza, interfaceC1886z2);
        zzc(29, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: g */
    public final String mo6047g(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: i */
    public final void mo6049i(C1519J c1519j, C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1519j);
        zzbo.zzd(zza, c1482e7);
        zzc(1, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: k */
    public final void mo6050k(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzc(4, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: l */
    public final void mo6051l(C1482E7 c1482e7, C1721h c1721h) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzbo.zzd(zza, c1721h);
        zzc(30, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: q */
    public final void mo6053q(C1482E7 c1482e7, Bundle bundle, InterfaceC1859w2 interfaceC1859w2) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzbo.zzd(zza, bundle);
        zzbo.zze(zza, interfaceC1859w2);
        zzc(31, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: s */
    public final List mo6054s(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(C1739j.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: t */
    public final void mo6055t(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzc(26, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: v */
    public final void mo6056v(C1891z7 c1891z7, C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1891z7);
        zzbo.zzd(zza, c1482e7);
        zzc(2, zza);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: w */
    public final void mo6057w(C1482E7 c1482e7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1482e7);
        zzc(6, zza);
    }
}
