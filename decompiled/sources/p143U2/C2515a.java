package p143U2;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.internal.AbstractC3772c;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.C3758P;
import com.google.android.gms.common.internal.C3774d;
import p136T2.InterfaceC2444e;
import p345t2.C6434c;
import p368w2.AbstractC6874o;
import p368w2.C6861b;

/* renamed from: U2.a */
/* loaded from: classes.dex */
public class C2515a extends AbstractC3780g implements InterfaceC2444e {

    /* renamed from: e */
    public static final /* synthetic */ int f7358e = 0;

    /* renamed from: a */
    public final boolean f7359a;

    /* renamed from: b */
    public final C3774d f7360b;

    /* renamed from: c */
    public final Bundle f7361c;

    /* renamed from: d */
    public final Integer f7362d;

    public C2515a(Context context, Looper looper, boolean z6, C3774d c3774d, Bundle bundle, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
        super(context, looper, 44, c3774d, aVar, bVar);
        this.f7359a = true;
        this.f7360b = c3774d;
        this.f7361c = bundle;
        this.f7362d = c3774d.m15057i();
    }

    /* renamed from: e */
    public static Bundle m8470e(C3774d c3774d) {
        c3774d.m15056h();
        Integer m15057i = c3774d.m15057i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c3774d.m15049a());
        if (m15057i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m15057i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // p136T2.InterfaceC2444e
    /* renamed from: a */
    public final void mo8310a(InterfaceC2520f interfaceC2520f) {
        AbstractC3802r.m15130l(interfaceC2520f, "Expecting a valid ISignInCallbacks");
        try {
            Account m15051c = this.f7360b.m15051c();
            ((C2521g) getService()).m8472a(new C2524j(1, new C3758P(m15051c, ((Integer) AbstractC3802r.m15129k(this.f7362d)).intValue(), AbstractC3772c.DEFAULT_ACCOUNT.equals(m15051c.name) ? C6434c.m26918b(getContext()).m26921c() : null)), interfaceC2520f);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC2520f.mo8471H(new C2526l(1, new C6861b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    @Override // p136T2.InterfaceC2444e
    /* renamed from: b */
    public final void mo8311b() {
        connect(new AbstractC3772c.d());
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C2521g ? (C2521g) queryLocalInterface : new C2521g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f7360b.m15054f())) {
            this.f7361c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f7360b.m15054f());
        }
        return this.f7361c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return AbstractC6874o.f24694a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c, com.google.android.gms.common.api.C3643a.f
    public final boolean requiresSignIn() {
        return this.f7359a;
    }
}
