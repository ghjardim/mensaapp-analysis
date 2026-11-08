package p345t2;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;
import com.google.android.gms.internal.p393authapi.zbat;
import java.util.Iterator;
import p368w2.AbstractC6874o;

/* renamed from: t2.i */
/* loaded from: classes.dex */
public final class C6440i extends AbstractC3780g {

    /* renamed from: a */
    public final GoogleSignInOptions f23347a;

    public C6440i(Context context, Looper looper, C3774d c3774d, GoogleSignInOptions googleSignInOptions, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
        super(context, looper, 91, c3774d, aVar, bVar);
        GoogleSignInOptions.C3641a c3641a = googleSignInOptions != null ? new GoogleSignInOptions.C3641a(googleSignInOptions) : new GoogleSignInOptions.C3641a();
        c3641a.m14778j(zbat.zba());
        if (!c3774d.m15052d().isEmpty()) {
            Iterator it = c3774d.m15052d().iterator();
            while (it.hasNext()) {
                c3641a.m14774f((Scope) it.next(), new Scope[0]);
            }
        }
        this.f23347a = c3641a.m14769a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C6454w ? (C6454w) queryLocalInterface : new C6454w(iBinder);
    }

    /* renamed from: e */
    public final GoogleSignInOptions m26931e() {
        return this.f23347a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return AbstractC6874o.f24694a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final Intent getSignInIntent() {
        return AbstractC6448q.m26934c(getContext(), this.f23347a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final boolean providesSignIn() {
        return true;
    }
}
