package p345t2;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: t2.r */
/* loaded from: classes.dex */
public final class C6449r {

    /* renamed from: d */
    public static C6449r f23354d;

    /* renamed from: a */
    public final C6434c f23355a;

    /* renamed from: b */
    public GoogleSignInAccount f23356b;

    /* renamed from: c */
    public GoogleSignInOptions f23357c;

    public C6449r(Context context) {
        C6434c m26918b = C6434c.m26918b(context);
        this.f23355a = m26918b;
        this.f23356b = m26918b.m26921c();
        this.f23357c = m26918b.m26922d();
    }

    /* renamed from: c */
    public static synchronized C6449r m26940c(Context context) {
        C6449r m26941f;
        synchronized (C6449r.class) {
            m26941f = m26941f(context.getApplicationContext());
        }
        return m26941f;
    }

    /* renamed from: f */
    public static synchronized C6449r m26941f(Context context) {
        synchronized (C6449r.class) {
            C6449r c6449r = f23354d;
            if (c6449r != null) {
                return c6449r;
            }
            C6449r c6449r2 = new C6449r(context);
            f23354d = c6449r2;
            return c6449r2;
        }
    }

    /* renamed from: a */
    public final synchronized GoogleSignInAccount m26942a() {
        return this.f23356b;
    }

    /* renamed from: b */
    public final synchronized GoogleSignInOptions m26943b() {
        return this.f23357c;
    }

    /* renamed from: d */
    public final synchronized void m26944d() {
        this.f23355a.m26920a();
        this.f23356b = null;
        this.f23357c = null;
    }

    /* renamed from: e */
    public final synchronized void m26945e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f23355a.m26924f(googleSignInAccount, googleSignInOptions);
        this.f23356b = googleSignInAccount;
        this.f23357c = googleSignInOptions;
    }
}
