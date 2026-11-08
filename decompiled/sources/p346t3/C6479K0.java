package p346t3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p395firebaseauthapi.zzagw;
import com.google.firebase.auth.FirebaseAuth;
import p354u3.InterfaceC6679u0;
import p354u3.InterfaceC6684x;

/* renamed from: t3.K0 */
/* loaded from: classes.dex */
public final class C6479K0 implements InterfaceC6684x, InterfaceC6679u0 {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f23378a;

    public C6479K0(FirebaseAuth firebaseAuth) {
        this.f23378a = firebaseAuth;
    }

    @Override // p354u3.InterfaceC6679u0
    /* renamed from: a */
    public final void mo15386a(zzagw zzagwVar, AbstractC6458A abstractC6458A) {
        this.f23378a.m15360l0(abstractC6458A, zzagwVar, true, true);
    }

    @Override // p354u3.InterfaceC6684x
    public final void zza(Status status) {
        int m14803z0 = status.m14803z0();
        if (m14803z0 == 17011 || m14803z0 == 17021 || m14803z0 == 17005) {
            this.f23378a.m15318F();
        }
    }
}
