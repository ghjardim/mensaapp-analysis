package p108P2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.List;
import org.apache.tika.utils.XMLReaderUtils;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: P2.s2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1823s2 extends zzbn implements InterfaceC1832t2 {
    public AbstractBinderC1823s2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC1886z2 interfaceC1886z2 = null;
        InterfaceC1859w2 interfaceC1859w2 = null;
        switch (i7) {
            case 1:
                C1519J c1519j = (C1519J) zzbo.zza(parcel, C1519J.CREATOR);
                C1482E7 c1482e7 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6049i(c1519j, c1482e7);
                parcel2.writeNoException();
                return true;
            case 2:
                C1891z7 c1891z7 = (C1891z7) zzbo.zza(parcel, C1891z7.CREATOR);
                C1482E7 c1482e72 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6056v(c1891z7, c1482e72);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                C1482E7 c1482e73 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6050k(c1482e73);
                parcel2.writeNoException();
                return true;
            case 5:
                C1519J c1519j2 = (C1519J) zzbo.zza(parcel, C1519J.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbo.zzc(parcel);
                mo6032L(c1519j2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                C1482E7 c1482e74 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6057w(c1482e74);
                parcel2.writeNoException();
                return true;
            case 7:
                C1482E7 c1482e75 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                boolean zzf = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                List mo6058z = mo6058z(c1482e75, zzf);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6058z);
                return true;
            case 9:
                C1519J c1519j3 = (C1519J) zzbo.zza(parcel, C1519J.CREATOR);
                String readString3 = parcel.readString();
                zzbo.zzc(parcel);
                byte[] mo6031K = mo6031K(c1519j3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(mo6031K);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbo.zzc(parcel);
                mo6036U(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                C1482E7 c1482e76 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                String mo6047g = mo6047g(c1482e76);
                parcel2.writeNoException();
                parcel2.writeString(mo6047g);
                return true;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                C1739j c1739j = (C1739j) zzbo.zza(parcel, C1739j.CREATOR);
                C1482E7 c1482e77 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6035T(c1739j, c1482e77);
                parcel2.writeNoException();
                return true;
            case 13:
                C1739j c1739j2 = (C1739j) zzbo.zza(parcel, C1739j.CREATOR);
                zzbo.zzc(parcel);
                mo6042d(c1739j2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzf2 = zzbo.zzf(parcel);
                C1482E7 c1482e78 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                List mo6028E = mo6028E(readString7, readString8, zzf2, c1482e78);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6028E);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean zzf3 = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                List mo6026C = mo6026C(readString9, readString10, readString11, zzf3);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6026C);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                C1482E7 c1482e79 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                List mo6037V = mo6037V(readString12, readString13, c1482e79);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6037V);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                zzbo.zzc(parcel);
                List mo6054s = mo6054s(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6054s);
                return true;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                C1482E7 c1482e710 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6027D(c1482e710);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                C1482E7 c1482e711 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6030I(bundle, c1482e711);
                parcel2.writeNoException();
                return true;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C1482E7 c1482e712 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6034R(c1482e712);
                parcel2.writeNoException();
                return true;
            case 21:
                C1482E7 c1482e713 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                C1802q mo6033Q = mo6033Q(c1482e713);
                parcel2.writeNoException();
                if (mo6033Q == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    mo6033Q.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                C1482E7 c1482e714 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                Bundle bundle2 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                zzbo.zzc(parcel);
                List mo6052m = mo6052m(c1482e714, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6052m);
                return true;
            case 25:
                C1482E7 c1482e715 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6029G(c1482e715);
                parcel2.writeNoException();
                return true;
            case 26:
                C1482E7 c1482e716 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6055t(c1482e716);
                parcel2.writeNoException();
                return true;
            case 27:
                C1482E7 c1482e717 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                zzbo.zzc(parcel);
                mo6038X(c1482e717);
                parcel2.writeNoException();
                return true;
            case 29:
                C1482E7 c1482e718 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                C1657Z6 c1657z6 = (C1657Z6) zzbo.zza(parcel, C1657Z6.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    interfaceC1886z2 = queryLocalInterface instanceof InterfaceC1886z2 ? (InterfaceC1886z2) queryLocalInterface : new C1868x2(readStrongBinder);
                }
                zzbo.zzc(parcel);
                mo6044e(c1482e718, c1657z6, interfaceC1886z2);
                parcel2.writeNoException();
                return true;
            case 30:
                C1482E7 c1482e719 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                C1721h c1721h = (C1721h) zzbo.zza(parcel, C1721h.CREATOR);
                zzbo.zzc(parcel);
                mo6051l(c1482e719, c1721h);
                parcel2.writeNoException();
                return true;
            case 31:
                C1482E7 c1482e720 = (C1482E7) zzbo.zza(parcel, C1482E7.CREATOR);
                Bundle bundle3 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    interfaceC1859w2 = queryLocalInterface2 instanceof InterfaceC1859w2 ? (InterfaceC1859w2) queryLocalInterface2 : new C1841u2(readStrongBinder2);
                }
                zzbo.zzc(parcel);
                mo6053q(c1482e720, bundle3, interfaceC1859w2);
                parcel2.writeNoException();
                return true;
        }
    }
}
