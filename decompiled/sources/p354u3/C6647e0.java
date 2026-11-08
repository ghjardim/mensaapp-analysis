package p354u3;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.apache.tika.utils.StringUtils;

/* renamed from: u3.e0 */
/* loaded from: classes.dex */
public final class C6647e0 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ RecaptchaAction f24014a;

    public C6647e0(C6643c0 c6643c0, RecaptchaAction recaptchaAction) {
        this.f24014a = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f24014a);
        }
        Exception exc = (Exception) AbstractC3802r.m15129k(task.getException());
        if (!(exc instanceof C6637Z)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult(StringUtils.EMPTY);
    }
}
