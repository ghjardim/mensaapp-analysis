package p346t3;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import p354u3.InterfaceC6686y;

/* renamed from: t3.H0 */
/* loaded from: classes.dex */
public final class C6473H0 implements InterfaceC6686y {

    /* renamed from: a */
    public final /* synthetic */ AbstractC6458A f23375a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f23376b;

    public C6473H0(FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A) {
        this.f23375a = abstractC6458A;
        this.f23376b = firebaseAuth;
    }

    @Override // p354u3.InterfaceC6686y
    public final void zza() {
        AbstractC6458A abstractC6458A;
        AbstractC6458A abstractC6458A2;
        abstractC6458A = this.f23376b.f12795f;
        if (abstractC6458A != null) {
            abstractC6458A2 = this.f23376b.f12795f;
            if (abstractC6458A2.mo26979a().equalsIgnoreCase(this.f23375a.mo26979a())) {
                this.f23376b.m15323I0();
            }
        }
    }

    @Override // p354u3.InterfaceC6684x
    public final void zza(Status status) {
        if (status.m14803z0() == 17011 || status.m14803z0() == 17021 || status.m14803z0() == 17005) {
            this.f23376b.m15318F();
        }
    }
}
