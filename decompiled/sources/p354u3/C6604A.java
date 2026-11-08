package p354u3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import p224f0.C4225a;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6508h;
import p346t3.C6543y0;
import p382y2.AbstractC7069e;

/* renamed from: u3.A */
/* loaded from: classes.dex */
public final class C6604A {

    /* renamed from: c */
    public static C6604A f23917c;

    /* renamed from: a */
    public boolean f23918a = false;

    /* renamed from: b */
    public BroadcastReceiver f23919b;

    /* renamed from: a */
    public static AbstractC6508h m27472a(Intent intent) {
        AbstractC3802r.m15129k(intent);
        return C6543y0.m27136E0(((zzaic) AbstractC7069e.m29144b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzaic.CREATOR)).zzc(true));
    }

    /* renamed from: b */
    public static C6604A m27473b() {
        if (f23917c == null) {
            f23917c = new C6604A();
        }
        return f23917c;
    }

    /* renamed from: d */
    public static void m27474d(Context context) {
        C6604A c6604a = f23917c;
        c6604a.f23918a = false;
        if (c6604a.f23919b != null) {
            C4225a.m17659b(context).m17663e(f23917c.f23919b);
        }
        f23917c.f23919b = null;
    }

    /* renamed from: e */
    public static /* synthetic */ void m27475e(C6604A c6604a, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        m27474d(context);
    }

    /* renamed from: c */
    public final void m27479c(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f23919b = broadcastReceiver;
        C4225a.m17659b(activity).m17661c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    /* renamed from: h */
    public final boolean m27480h(Activity activity, TaskCompletionSource taskCompletionSource) {
        if (this.f23918a) {
            return false;
        }
        m27479c(activity, new C6620I(this, activity, taskCompletionSource));
        this.f23918a = true;
        return true;
    }

    /* renamed from: i */
    public final boolean m27481i(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return m27482j(activity, taskCompletionSource, firebaseAuth, null);
    }

    /* renamed from: j */
    public final boolean m27482j(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A) {
        if (this.f23918a) {
            return false;
        }
        m27479c(activity, new C6616G(this, activity, taskCompletionSource, firebaseAuth, abstractC6458A));
        this.f23918a = true;
        return true;
    }
}
