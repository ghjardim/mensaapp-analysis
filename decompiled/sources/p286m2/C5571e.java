package p286m2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* renamed from: m2.e */
/* loaded from: classes.dex */
public final class C5571e extends zza implements InterfaceC5573g {
    public C5571e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // p286m2.InterfaceC5573g
    /* renamed from: J */
    public final void mo23336J(InterfaceC5570d interfaceC5570d, Account account) {
        Parcel zza = zza();
        zzc.zzd(zza, interfaceC5570d);
        zzc.zzc(zza, account);
        zzc(3, zza);
    }

    @Override // p286m2.InterfaceC5573g
    /* renamed from: M */
    public final void mo23337M(boolean z6) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeInt(z6 ? 1 : 0);
        zzc(1, zza);
    }

    @Override // p286m2.InterfaceC5573g
    /* renamed from: j */
    public final void mo23338j(InterfaceC5570d interfaceC5570d, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, interfaceC5570d);
        zza.writeString(str);
        zzc(2, zza);
    }
}
