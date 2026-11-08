package p337s2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.C3678a;
import com.google.android.gms.common.api.internal.InterfaceC3716t;
import com.google.android.gms.common.internal.AbstractC3800q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p294n2.AbstractC5772a;
import p345t2.AbstractC6448q;
import p368w2.AbstractC6874o;
import p368w2.C6869j;

/* renamed from: s2.b */
/* loaded from: classes.dex */
public class C6373b extends AbstractC3647e {

    /* renamed from: a */
    public static final C6381j f23064a = new C6381j(null);

    /* renamed from: b */
    public static int f23065b = 1;

    public C6373b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, AbstractC5772a.f21056b, (C3643a.d) googleSignInOptions, (InterfaceC3716t) new C3678a());
    }

    /* renamed from: d */
    public Intent m26681d() {
        Context applicationContext = getApplicationContext();
        int m26684g = m26684g();
        int i7 = m26684g - 1;
        if (m26684g != 0) {
            return i7 != 2 ? i7 != 3 ? AbstractC6448q.m26933b(applicationContext, (GoogleSignInOptions) getApiOptions()) : AbstractC6448q.m26934c(applicationContext, (GoogleSignInOptions) getApiOptions()) : AbstractC6448q.m26932a(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
        throw null;
    }

    /* renamed from: e */
    public Task m26682e() {
        return AbstractC3800q.m15108c(AbstractC6448q.m26937f(asGoogleApiClient(), getApplicationContext(), m26684g() == 3));
    }

    /* renamed from: f */
    public Task m26683f() {
        return AbstractC3800q.m15107b(AbstractC6448q.m26936e(asGoogleApiClient(), getApplicationContext(), (GoogleSignInOptions) getApiOptions(), m26684g() == 3), f23064a);
    }

    /* renamed from: g */
    public final synchronized int m26684g() {
        int i7;
        try {
            i7 = f23065b;
            if (i7 == 1) {
                Context applicationContext = getApplicationContext();
                C6869j m28253n = C6869j.m28253n();
                int mo28258h = m28253n.mo28258h(applicationContext, AbstractC6874o.f24694a);
                if (mo28258h == 0) {
                    i7 = 4;
                    f23065b = 4;
                } else if (m28253n.mo28254b(applicationContext, mo28258h, null) != null || DynamiteModule.m15163a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    f23065b = 2;
                } else {
                    i7 = 3;
                    f23065b = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i7;
    }

    public Task signOut() {
        return AbstractC3800q.m15108c(AbstractC6448q.m26938g(asGoogleApiClient(), getApplicationContext(), m26684g() == 3));
    }

    public C6373b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, AbstractC5772a.f21056b, googleSignInOptions, new AbstractC3647e.a.C7214a().m14813c(new C3678a()).m14811a());
    }
}
