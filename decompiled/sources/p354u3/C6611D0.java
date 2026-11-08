package p354u3;

import com.google.android.gms.internal.p395firebaseauthapi.zzahg;
import p346t3.AbstractC6496b;
import p346t3.InterfaceC6500d;

/* renamed from: u3.D0 */
/* loaded from: classes.dex */
public final class C6611D0 implements InterfaceC6500d {

    /* renamed from: a */
    public final int f23933a;

    /* renamed from: b */
    public final String f23934b;

    /* renamed from: c */
    public final String f23935c;

    /* renamed from: d */
    public final AbstractC6496b f23936d;

    public C6611D0(zzahg zzahgVar) {
        int i7 = 5;
        this.f23934b = zzahgVar.zzg() ? zzahgVar.zzc() : zzahgVar.zzb();
        this.f23935c = zzahgVar.zzb();
        AbstractC6496b abstractC6496b = null;
        if (!zzahgVar.zzh()) {
            this.f23933a = 3;
            this.f23936d = null;
            return;
        }
        String zzd = zzahgVar.zzd();
        zzd.hashCode();
        switch (zzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i7 = 6;
                break;
            case "PASSWORD_RESET":
                i7 = 0;
                break;
            case "VERIFY_EMAIL":
                i7 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i7 = 4;
                break;
            case "RECOVER_EMAIL":
                i7 = 2;
                break;
            default:
                i7 = 3;
                break;
        }
        this.f23933a = i7;
        if (i7 == 4 || i7 == 3) {
            this.f23936d = null;
            return;
        }
        if (zzahgVar.zzf()) {
            abstractC6496b = new C6613E0(zzahgVar.zzb(), AbstractC6627O.m27505b(zzahgVar.zza()));
        } else if (zzahgVar.zzg()) {
            abstractC6496b = new C6609C0(zzahgVar.zzc(), zzahgVar.zzb());
        } else if (zzahgVar.zze()) {
            abstractC6496b = new C6607B0(zzahgVar.zzb());
        }
        this.f23936d = abstractC6496b;
    }

    @Override // p346t3.InterfaceC6500d
    /* renamed from: a */
    public final int mo27067a() {
        return this.f23933a;
    }

    @Override // p346t3.InterfaceC6500d
    /* renamed from: b */
    public final AbstractC6496b mo27068b() {
        return this.f23936d;
    }
}
