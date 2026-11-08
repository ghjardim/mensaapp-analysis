package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.apache.tika.utils.XMLReaderUtils;
import p115Q2.C2012A0;
import p115Q2.C2045R0;
import p115Q2.C2046S;
import p115Q2.C2057X0;
import p115Q2.C2061Z0;
import p115Q2.C2062a;
import p115Q2.C2066b0;
import p115Q2.C2067b1;
import p115Q2.C2073d1;
import p115Q2.C2074e;
import p115Q2.C2080g;
import p115Q2.C2095m;
import p115Q2.C2099o;
import p115Q2.C2103q;
import p115Q2.C2107s;
import p115Q2.C2111u;
import p115Q2.C2119y;
import p115Q2.C2120y0;
import p272k4.C5410A;
import p272k4.C5413D;

/* loaded from: classes.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.pay.internal.IPayServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.pay.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzt(status);
                return true;
            case 3:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2080g c2080g = (C2080g) zzc.zza(parcel, C2080g.CREATOR);
                zzc.zzb(parcel);
                zzo(status2, c2080g);
                return true;
            case 4:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR);
                zzc.zzb(parcel);
                zzp(status3, pendingIntent);
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2066b0 c2066b0 = (C2066b0) zzc.zza(parcel, C2066b0.CREATOR);
                zzc.zzb(parcel);
                zzq(status4, c2066b0);
                return true;
            case 6:
                C2045R0 c2045r0 = (C2045R0) zzc.zza(parcel, C2045R0.CREATOR);
                zzc.zzb(parcel);
                zze(c2045r0);
                return true;
            case 7:
                Status status5 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2099o c2099o = (C2099o) zzc.zza(parcel, C2099o.CREATOR);
                zzc.zzb(parcel);
                zzs(status5, c2099o);
                return true;
            case 8:
                Status status6 = (Status) zzc.zza(parcel, Status.CREATOR);
                boolean z6 = parcel.readInt() != 0;
                zzc.zzb(parcel);
                zzb(status6, z6);
                return true;
            case 9:
                Status status7 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2103q c2103q = (C2103q) zzc.zza(parcel, C2103q.CREATOR);
                zzc.zzb(parcel);
                zzv(status7, c2103q);
                return true;
            case 10:
                C2046S c2046s = (C2046S) zzc.zza(parcel, C2046S.CREATOR);
                zzc.zzb(parcel);
                zzm(c2046s);
                return true;
            case 11:
                Status status8 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2067b1 c2067b1 = (C2067b1) zzc.zza(parcel, C2067b1.CREATOR);
                zzc.zzb(parcel);
                zzk(status8, c2067b1);
                return true;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                Status status9 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2057X0 c2057x0 = (C2057X0) zzc.zza(parcel, C2057X0.CREATOR);
                zzc.zzb(parcel);
                zzd(status9, c2057x0);
                return true;
            case 13:
                Status status10 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2074e c2074e = (C2074e) zzc.zza(parcel, C2074e.CREATOR);
                zzc.zzb(parcel);
                zzn(status10, c2074e);
                return true;
            case 14:
                Status status11 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2012A0 c2012a0 = (C2012A0) zzc.zza(parcel, C2012A0.CREATOR);
                zzc.zzb(parcel);
                zzw(status11, c2012a0);
                return true;
            case 15:
                Status status12 = (Status) zzc.zza(parcel, Status.CREATOR);
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzc(status12, createByteArray);
                return true;
            case 16:
                Status status13 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2073d1 c2073d1 = (C2073d1) zzc.zza(parcel, C2073d1.CREATOR);
                zzc.zzb(parcel);
                zzl(status13, c2073d1);
                return true;
            case 17:
                Status status14 = (Status) zzc.zza(parcel, Status.CREATOR);
                long readLong = parcel.readLong();
                zzc.zzb(parcel);
                zzj(status14, readLong);
                return true;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                Status status15 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzh(status15);
                return true;
            case 19:
                Status status16 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2119y c2119y = (C2119y) zzc.zza(parcel, C2119y.CREATOR);
                zzc.zzb(parcel);
                zzg(status16, c2119y);
                return true;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                Status status17 = (Status) zzc.zza(parcel, Status.CREATOR);
                int readInt = parcel.readInt();
                zzc.zzb(parcel);
                zzi(status17, readInt);
                return true;
            case 21:
                Status status18 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2107s c2107s = (C2107s) zzc.zza(parcel, C2107s.CREATOR);
                zzc.zzb(parcel);
                zzx(status18, c2107s);
                return true;
            case 22:
                Status status19 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2111u c2111u = (C2111u) zzc.zza(parcel, C2111u.CREATOR);
                zzc.zzb(parcel);
                zzz(status19, c2111u);
                return true;
            case 23:
                Status status20 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2095m c2095m = (C2095m) zzc.zza(parcel, C2095m.CREATOR);
                zzc.zzb(parcel);
                zzr(status20, c2095m);
                return true;
            case 24:
                Status status21 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2120y0 c2120y0 = (C2120y0) zzc.zza(parcel, C2120y0.CREATOR);
                zzc.zzb(parcel);
                zzu(status21, c2120y0);
                return true;
            case 25:
                Status status22 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2061Z0 c2061z0 = (C2061Z0) zzc.zza(parcel, C2061Z0.CREATOR);
                zzc.zzb(parcel);
                zzy(status22, c2061z0);
                return true;
            case 26:
                Status status23 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2062a c2062a = (C2062a) zzc.zza(parcel, C2062a.CREATOR);
                zzc.zzb(parcel);
                zzf(status23, c2062a);
                return true;
            default:
                return false;
        }
    }
}
