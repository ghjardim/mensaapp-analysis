package p108P2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;

/* renamed from: P2.x2 */
/* loaded from: classes.dex */
public final class C1868x2 extends zzbm implements InterfaceC1886z2 {
    public C1868x2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // p108P2.InterfaceC1886z2
    /* renamed from: p */
    public final void mo5960p(C1675b7 c1675b7) {
        Parcel zza = zza();
        zzbo.zzd(zza, c1675b7);
        zzd(2, zza);
    }
}
