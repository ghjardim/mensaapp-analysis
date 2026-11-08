package p286m2;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* renamed from: m2.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5569c extends zzb implements InterfaceC5570d {
    public AbstractBinderC5569c() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            int i9 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            zzc(readInt != 0);
        } else {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
