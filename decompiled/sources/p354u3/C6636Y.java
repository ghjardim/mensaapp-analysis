package p354u3;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzadr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* renamed from: u3.Y */
/* loaded from: classes.dex */
public final class C6636Y implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ String f23980a;

    /* renamed from: b */
    public final /* synthetic */ C6643c0 f23981b;

    /* renamed from: c */
    public final /* synthetic */ RecaptchaAction f23982c;

    /* renamed from: d */
    public final /* synthetic */ Continuation f23983d;

    public C6636Y(String str, C6643c0 c6643c0, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f23980a = str;
        this.f23981b = c6643c0;
        this.f23982c = recaptchaAction;
        this.f23983d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzadr.zzc((Exception) AbstractC3802r.m15129k(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f23980a);
        }
        return this.f23981b.m27523b(this.f23980a, Boolean.TRUE, this.f23982c).continueWithTask(this.f23983d);
    }
}
