package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3770b;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import p337s2.C6373b;
import p337s2.C6374c;
import p345t2.AbstractC6448q;
import p345t2.C6449r;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* loaded from: classes.dex */
public abstract class AbstractC3642a {
    /* renamed from: a */
    public static C6373b m14781a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new C6373b(context, (GoogleSignInOptions) AbstractC3802r.m15129k(googleSignInOptions));
    }

    /* renamed from: b */
    public static GoogleSignInAccount m14782b(Context context) {
        return C6449r.m26940c(context).m26942a();
    }

    /* renamed from: c */
    public static Task m14783c(Intent intent) {
        C6374c m26935d = AbstractC6448q.m26935d(intent);
        GoogleSignInAccount m26685a = m26935d.m26685a();
        return (!m26935d.getStatus().m14799D0() || m26685a == null) ? Tasks.forException(AbstractC3770b.m15045a(m26935d.getStatus())) : Tasks.forResult(m26685a);
    }

    /* renamed from: d */
    public static boolean m14784d(GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.m14747z0().containsAll(hashSet);
    }

    /* renamed from: e */
    public static void m14785e(Activity activity, int i7, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        AbstractC3802r.m15130l(activity, "Please provide a non-null Activity");
        AbstractC3802r.m15130l(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(m14786f(activity, googleSignInAccount, scopeArr), i7);
    }

    /* renamed from: f */
    public static Intent m14786f(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.C3641a c3641a = new GoogleSignInOptions.C3641a();
        if (scopeArr.length > 0) {
            c3641a.m14774f(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.m14743f0())) {
            c3641a.m14776h((String) AbstractC3802r.m15129k(googleSignInAccount.m14743f0()));
        }
        return new C6373b(activity, c3641a.m14769a()).m26681d();
    }
}
