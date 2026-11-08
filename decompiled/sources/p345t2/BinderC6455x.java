package p345t2;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.AbstractC3642a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p031E2.AbstractC0282r;
import p337s2.C6373b;

/* renamed from: t2.x */
/* loaded from: classes.dex */
public final class BinderC6455x extends AbstractBinderC6450s {

    /* renamed from: a */
    public final Context f23358a;

    public BinderC6455x(Context context) {
        this.f23358a = context;
    }

    /* renamed from: a */
    public final void m26951a() {
        if (AbstractC0282r.m1146a(this.f23358a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // p345t2.InterfaceC6451t
    /* renamed from: h */
    public final void mo26946h() {
        m26951a();
        C6449r.m26940c(this.f23358a).m26944d();
    }

    @Override // p345t2.InterfaceC6451t
    /* renamed from: o */
    public final void mo26947o() {
        m26951a();
        C6434c m26918b = C6434c.m26918b(this.f23358a);
        GoogleSignInAccount m26921c = m26918b.m26921c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f12204s;
        if (m26921c != null) {
            googleSignInOptions = m26918b.m26922d();
        }
        C6373b m14781a = AbstractC3642a.m14781a(this.f23358a, googleSignInOptions);
        if (m26921c != null) {
            m14781a.m26682e();
        } else {
            m14781a.signOut();
        }
    }
}
