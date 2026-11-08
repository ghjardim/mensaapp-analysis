package p337s2;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;

/* renamed from: s2.c */
/* loaded from: classes.dex */
public class C6374c implements InterfaceC3729l {

    /* renamed from: a */
    public final Status f23066a;

    /* renamed from: b */
    public final GoogleSignInAccount f23067b;

    public C6374c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f23067b = googleSignInAccount;
        this.f23066a = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount m26685a() {
        return this.f23067b;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public Status getStatus() {
        return this.f23066a;
    }
}
