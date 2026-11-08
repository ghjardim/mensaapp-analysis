package p278l2;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zze;

/* renamed from: l2.m */
/* loaded from: classes.dex */
public final class C5526m implements InterfaceC5527n {

    /* renamed from: a */
    public final /* synthetic */ String f19923a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f19924b;

    public C5526m(String str, Bundle bundle) {
        this.f19923a = str;
        this.f19924b = bundle;
    }

    @Override // p278l2.InterfaceC5527n
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23154a(IBinder iBinder) {
        Bundle zzd = zze.zzb(iBinder).zzd(this.f19923a, this.f19924b);
        AbstractC5528o.m23160f(zzd);
        String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new C5517d(string);
    }
}
