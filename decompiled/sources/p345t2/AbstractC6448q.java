package p345t2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.AbstractC3651i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3688f;
import java.util.Iterator;
import p003A2.C0019a;
import p337s2.C6374c;

/* renamed from: t2.q */
/* loaded from: classes.dex */
public abstract class AbstractC6448q {

    /* renamed from: a */
    public static final C0019a f23353a = new C0019a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m26932a(Context context, GoogleSignInOptions googleSignInOptions) {
        f23353a.m59a("getFallbackSignInIntent()", new Object[0]);
        Intent m26934c = m26934c(context, googleSignInOptions);
        m26934c.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return m26934c;
    }

    /* renamed from: b */
    public static Intent m26933b(Context context, GoogleSignInOptions googleSignInOptions) {
        f23353a.m59a("getNoImplementationSignInIntent()", new Object[0]);
        Intent m26934c = m26934c(context, googleSignInOptions);
        m26934c.setAction("com.google.android.gms.auth.NO_IMPL");
        return m26934c;
    }

    /* renamed from: c */
    public static Intent m26934c(Context context, GoogleSignInOptions googleSignInOptions) {
        f23353a.m59a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: d */
    public static C6374c m26935d(Intent intent) {
        if (intent == null) {
            return new C6374c(null, Status.f12250o);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C6374c(googleSignInAccount, Status.f12248f);
        }
        if (status == null) {
            status = Status.f12250o;
        }
        return new C6374c(null, status);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.common.api.AbstractC3649g m26936e(com.google.android.gms.common.api.AbstractC3648f r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
        /*
            A2.a r0 = p345t2.AbstractC6448q.f23353a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.m59a(r3, r2)
            java.lang.String r2 = "getEligibleSavedSignInResult()"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.m59a(r2, r3)
            com.google.android.gms.common.internal.AbstractC3802r.m15129k(r8)
            t2.r r2 = p345t2.C6449r.m26940c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.m26943b()
            r3 = 0
            if (r2 != 0) goto L22
        L1f:
            r4 = r3
            goto L89
        L22:
            android.accounts.Account r4 = r2.m14766x0()
            android.accounts.Account r5 = r8.m14766x0()
            if (r4 != 0) goto L2f
            if (r5 != 0) goto L1f
            goto L36
        L2f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L36
            goto L1f
        L36:
            boolean r4 = r8.m14764E0()
            if (r4 == 0) goto L3d
            goto L1f
        L3d:
            boolean r4 = r8.m14763D0()
            if (r4 == 0) goto L59
            boolean r4 = r2.m14763D0()
            if (r4 != 0) goto L4a
            goto L1f
        L4a:
            java.lang.String r4 = r8.m14761B0()
            java.lang.String r5 = r2.m14761B0()
            boolean r4 = com.google.android.gms.common.internal.AbstractC3798p.m15099b(r4, r5)
            if (r4 != 0) goto L59
            goto L1f
        L59:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.m14760A0()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.m14760A0()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L72
            goto L1f
        L72:
            t2.r r2 = p345t2.C6449r.m26940c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.m26942a()
            if (r2 == 0) goto L1f
            boolean r4 = r2.m14739E0()
            if (r4 != 0) goto L1f
            s2.c r4 = new s2.c
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.f12248f
            r4.<init>(r2, r5)
        L89:
            if (r4 == 0) goto L97
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r0.m59a(r8, r7)
            com.google.android.gms.common.api.g r6 = com.google.android.gms.common.api.AbstractC3651i.m14822b(r4, r6)
            return r6
        L97:
            if (r9 == 0) goto La9
            s2.c r7 = new s2.c
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            com.google.android.gms.common.api.g r6 = com.google.android.gms.common.api.AbstractC3651i.m14822b(r7, r6)
            return r6
        La9:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "trySilentSignIn()"
            r0.m59a(r1, r9)
            t2.k r9 = new t2.k
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.d r6 = r6.mo14815a(r9)
            com.google.android.gms.common.api.internal.o r7 = new com.google.android.gms.common.api.internal.o
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p345t2.AbstractC6448q.m26936e(com.google.android.gms.common.api.f, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.g");
    }

    /* renamed from: f */
    public static AbstractC3650h m26937f(AbstractC3648f abstractC3648f, Context context, boolean z6) {
        f23353a.m59a("Revoking access", new Object[0]);
        String m26923e = C6434c.m26918b(context).m26923e();
        m26939h(context);
        return z6 ? RunnableC6437f.m26930a(m26923e) : abstractC3648f.mo14816b(new C6446o(abstractC3648f));
    }

    /* renamed from: g */
    public static AbstractC3650h m26938g(AbstractC3648f abstractC3648f, Context context, boolean z6) {
        f23353a.m59a("Signing out", new Object[0]);
        m26939h(context);
        return z6 ? AbstractC3651i.m14823c(Status.f12248f, abstractC3648f) : abstractC3648f.mo14816b(new C6444m(abstractC3648f));
    }

    /* renamed from: h */
    public static void m26939h(Context context) {
        C6449r.m26940c(context).m26944d();
        Iterator it = AbstractC3648f.m14814c().iterator();
        while (it.hasNext()) {
            ((AbstractC3648f) it.next()).m14819f();
        }
        C3688f.m14919a();
    }
}
