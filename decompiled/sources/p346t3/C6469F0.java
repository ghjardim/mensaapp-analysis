package p346t3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: t3.F0 */
/* loaded from: classes.dex */
public final class C6469F0 implements Continuation {
    public C6469F0(FirebaseAuth firebaseAuth) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return (!task.isSuccessful() && (task.getException() instanceof C6526q) && ((C6526q) task.getException()).m27125a().equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }
}
