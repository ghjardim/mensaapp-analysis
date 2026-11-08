package p346t3;

import com.google.android.gms.internal.p395firebaseauthapi.zzae;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import org.apache.tika.utils.StringUtils;

/* renamed from: t3.J0 */
/* loaded from: classes.dex */
public final class C6477J0 implements Continuation {
    public C6477J0(FirebaseAuth firebaseAuth) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new C6526q("INTERNAL_ERROR", zzae.zzb(exception != null ? exception.getMessage() : StringUtils.EMPTY)));
    }
}
