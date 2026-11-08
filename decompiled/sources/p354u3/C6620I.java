package p354u3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p395firebaseauthapi.zzadr;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* renamed from: u3.I */
/* loaded from: classes.dex */
public final class C6620I extends BroadcastReceiver {

    /* renamed from: a */
    public final WeakReference f23953a;

    /* renamed from: b */
    public final TaskCompletionSource f23954b;

    /* renamed from: c */
    public final /* synthetic */ C6604A f23955c;

    public C6620I(C6604A c6604a, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f23955c = c6604a;
        this.f23953a = new WeakReference(activity);
        this.f23954b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f23953a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f23954b.setException(zzadr.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C6604A.m27474d(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                C6604A.m27475e(this.f23955c, intent, this.f23954b, context);
                return;
            }
            this.f23954b.setException(zzadr.zza(AbstractC6672r.m27577a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        if (AbstractC6661l0.m27568d(intent)) {
            this.f23954b.setException(zzadr.zza(AbstractC6661l0.m27565a(intent)));
            C6604A.m27474d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f23954b.setException(zzadr.zza(AbstractC6672r.m27577a("WEB_CONTEXT_CANCELED")));
            C6604A.m27474d(context);
        }
    }
}
