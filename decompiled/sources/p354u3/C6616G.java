package p354u3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p395firebaseauthapi.zzadr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import p346t3.AbstractC6458A;

/* renamed from: u3.G */
/* loaded from: classes.dex */
public final class C6616G extends BroadcastReceiver {

    /* renamed from: a */
    public final WeakReference f23942a;

    /* renamed from: b */
    public final TaskCompletionSource f23943b;

    /* renamed from: c */
    public final FirebaseAuth f23944c;

    /* renamed from: d */
    public final AbstractC6458A f23945d;

    /* renamed from: e */
    public final /* synthetic */ C6604A f23946e;

    public C6616G(C6604A c6604a, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A) {
        this.f23946e = c6604a;
        this.f23942a = new WeakReference(activity);
        this.f23943b = taskCompletionSource;
        this.f23944c = firebaseAuth;
        this.f23945d = abstractC6458A;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f23942a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f23943b.setException(zzadr.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C6604A.m27474d(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (AbstractC6661l0.m27568d(intent)) {
                this.f23943b.setException(zzadr.zza(AbstractC6661l0.m27565a(intent)));
                C6604A.m27474d(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f23943b.setException(zzadr.zza(AbstractC6672r.m27577a("WEB_CONTEXT_CANCELED")));
                    C6604A.m27474d(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f23944c.m15312B(C6604A.m27472a(intent)).addOnSuccessListener(new C6608C(r0, r1, context)).addOnFailureListener(new C6688z(this.f23946e, this.f23943b, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            this.f23945d.m26956E0(C6604A.m27472a(intent)).addOnSuccessListener(new C6614F(r0, r1, context)).addOnFailureListener(new C6606B(this.f23946e, this.f23943b, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            this.f23945d.m26957F0(C6604A.m27472a(intent)).addOnSuccessListener(new C6618H(r0, r1, context)).addOnFailureListener(new C6612E(this.f23946e, this.f23943b, context));
        } else {
            this.f23943b.setException(zzadr.zza(AbstractC6672r.m27577a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
