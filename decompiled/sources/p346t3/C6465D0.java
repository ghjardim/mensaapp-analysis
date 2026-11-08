package p346t3;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.C3932a;
import com.google.firebase.auth.FirebaseAuth;
import org.apache.tika.utils.StringUtils;
import p219e3.C4183m;
import p354u3.AbstractC6675s0;
import p354u3.C6610D;

/* renamed from: t3.D0 */
/* loaded from: classes.dex */
public final class C6465D0 implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ C3932a f23364a;

    /* renamed from: b */
    public final /* synthetic */ String f23365b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f23366c;

    public C6465D0(FirebaseAuth firebaseAuth, C3932a c3932a, String str) {
        this.f23364a = c3932a;
        this.f23365b = str;
        this.f23366c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : StringUtils.EMPTY));
            if (exception != null && C6610D.m27493i(exception)) {
                FirebaseAuth.m15307j0((C4183m) exception, this.f23364a, this.f23365b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        this.f23366c.m15355i0(this.f23364a, (AbstractC6675s0) task.getResult());
    }
}
