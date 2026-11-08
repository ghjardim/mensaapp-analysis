package p354u3;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzadr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: u3.T */
/* loaded from: classes.dex */
public abstract class AbstractC6631T {
    /* renamed from: a */
    public static /* synthetic */ Task m27516a(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) AbstractC3802r.m15129k(task.getException());
        if (zzadr.zzd(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.m15371r0() == null) {
                firebaseAuth.m15362m0(new C6643c0(firebaseAuth.m15359l(), firebaseAuth));
            }
            return m27517d(firebaseAuth.m15371r0(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    /* renamed from: d */
    public static Task m27517d(C6643c0 c6643c0, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task m27523b = c6643c0.m27523b(str, Boolean.FALSE, recaptchaAction);
        return m27523b.continueWithTask(continuation).continueWithTask(new C6636Y(str, c6643c0, recaptchaAction, continuation));
    }

    /* renamed from: b */
    public final Task m27518b(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: u3.V
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                AbstractC6631T abstractC6631T = AbstractC6631T.this;
                if (task.isSuccessful()) {
                    return abstractC6631T.mo15413c((String) task.getResult());
                }
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) AbstractC3802r.m15129k(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                return abstractC6631T.mo15413c("NO_RECAPTCHA");
            }
        };
        C6643c0 m15371r0 = firebaseAuth.m15371r0();
        return (m15371r0 == null || !m15371r0.m27525e(str2)) ? mo15413c(null).continueWithTask(new Continuation() { // from class: u3.W
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return AbstractC6631T.m27516a(RecaptchaAction.this, firebaseAuth, str, continuation, task);
            }
        }) : m27517d(m15371r0, recaptchaAction, str, continuation);
    }

    /* renamed from: c */
    public abstract Task mo15413c(String str);
}
