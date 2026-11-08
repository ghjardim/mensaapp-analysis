package p108P2;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;

/* renamed from: P2.y2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1877y2 extends zzbn implements InterfaceC1886z2 {
    public AbstractBinderC1877y2() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        C1675b7 c1675b7 = (C1675b7) zzbo.zza(parcel, C1675b7.CREATOR);
        zzbo.zzc(parcel);
        mo5960p(c1675b7);
        return true;
    }
}
