package p345t2;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p337s2.C6374c;

/* renamed from: t2.j */
/* loaded from: classes.dex */
public final class BinderC6441j extends AbstractBinderC6436e {

    /* renamed from: a */
    public final /* synthetic */ C6442k f23348a;

    public BinderC6441j(C6442k c6442k) {
        this.f23348a = c6442k;
    }

    @Override // p345t2.AbstractBinderC6436e, p345t2.InterfaceC6453v
    /* renamed from: A */
    public final void mo26927A(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            C6442k c6442k = this.f23348a;
            C6449r.m26940c(c6442k.f23349a).m26945e(c6442k.f23350b, googleSignInAccount);
        }
        this.f23348a.setResult(new C6374c(googleSignInAccount, status));
    }
}
