package p159W4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.signin.AbstractC3642a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import p337s2.C6373b;

/* renamed from: W4.g */
/* loaded from: classes2.dex */
public class C2713g {
    /* renamed from: a */
    public C6373b m9285a(Context context, GoogleSignInOptions googleSignInOptions) {
        return AbstractC3642a.m14781a(context, googleSignInOptions);
    }

    /* renamed from: b */
    public GoogleSignInAccount m9286b(Context context) {
        return AbstractC3642a.m14782b(context);
    }

    /* renamed from: c */
    public boolean m9287c(GoogleSignInAccount googleSignInAccount, Scope scope) {
        return AbstractC3642a.m14784d(googleSignInAccount, scope);
    }

    /* renamed from: d */
    public void m9288d(Activity activity, int i7, GoogleSignInAccount googleSignInAccount, Scope[] scopeArr) {
        AbstractC3642a.m14785e(activity, i7, googleSignInAccount, scopeArr);
    }
}
