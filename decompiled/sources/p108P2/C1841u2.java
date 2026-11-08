package p108P2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import java.util.List;

/* renamed from: P2.u2 */
/* loaded from: classes.dex */
public final class C1841u2 extends zzbm implements InterfaceC1859w2 {
    public C1841u2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // p108P2.InterfaceC1859w2
    public final void zze(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzd(2, zza);
    }
}
