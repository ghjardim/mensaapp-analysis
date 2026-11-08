package p345t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;

/* renamed from: t2.c */
/* loaded from: classes.dex */
public class C6434c {

    /* renamed from: c */
    public static final Lock f23338c = new ReentrantLock();

    /* renamed from: d */
    public static C6434c f23339d;

    /* renamed from: a */
    public final Lock f23340a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f23341b;

    public C6434c(Context context) {
        this.f23341b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C6434c m26918b(Context context) {
        AbstractC3802r.m15129k(context);
        Lock lock = f23338c;
        lock.lock();
        try {
            if (f23339d == null) {
                f23339d = new C6434c(context.getApplicationContext());
            }
            C6434c c6434c = f23339d;
            lock.unlock();
            return c6434c;
        } catch (Throwable th) {
            f23338c.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public static final String m26919i(String str, String str2) {
        return str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2;
    }

    /* renamed from: a */
    public void m26920a() {
        this.f23340a.lock();
        try {
            this.f23341b.edit().clear().apply();
        } finally {
            this.f23340a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount m26921c() {
        String m26925g;
        String m26925g2 = m26925g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m26925g2) || (m26925g = m26925g(m26919i("googleSignInAccount", m26925g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m14734G0(m26925g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions m26922d() {
        String m26925g;
        String m26925g2 = m26925g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m26925g2) || (m26925g = m26925g(m26919i("googleSignInOptions", m26925g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m14749G0(m26925g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m26923e() {
        return m26925g("refreshToken");
    }

    /* renamed from: f */
    public void m26924f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC3802r.m15129k(googleSignInAccount);
        AbstractC3802r.m15129k(googleSignInOptions);
        m26926h("defaultGoogleSignInAccount", googleSignInAccount.m14740H0());
        AbstractC3802r.m15129k(googleSignInAccount);
        AbstractC3802r.m15129k(googleSignInOptions);
        String m14740H0 = googleSignInAccount.m14740H0();
        m26926h(m26919i("googleSignInAccount", m14740H0), googleSignInAccount.m14741I0());
        m26926h(m26919i("googleSignInOptions", m14740H0), googleSignInOptions.m14765K0());
    }

    /* renamed from: g */
    public final String m26925g(String str) {
        this.f23340a.lock();
        try {
            return this.f23341b.getString(str, null);
        } finally {
            this.f23340a.unlock();
        }
    }

    /* renamed from: h */
    public final void m26926h(String str, String str2) {
        this.f23340a.lock();
        try {
            this.f23341b.edit().putString(str, str2).apply();
        } finally {
            this.f23340a.unlock();
        }
    }
}
