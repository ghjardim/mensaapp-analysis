package p108P2;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;

/* renamed from: P2.v2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1850v2 extends zzbn implements InterfaceC1859w2 {
    public AbstractBinderC1850v2() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C1593R6.CREATOR);
        zzbo.zzc(parcel);
        zze(createTypedArrayList);
        return true;
    }
}
