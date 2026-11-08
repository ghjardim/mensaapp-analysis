package p389z2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.C3810v;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* renamed from: z2.a */
/* loaded from: classes.dex */
public final class C7140a extends zaa implements IInterface {
    public C7140a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: a */
    public final void m29440a(C3810v c3810v) {
        Parcel zaa = zaa();
        zac.zac(zaa, c3810v);
        zad(1, zaa);
    }
}
