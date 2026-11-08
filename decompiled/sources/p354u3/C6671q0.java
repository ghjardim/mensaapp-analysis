package p354u3;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6526q;

/* renamed from: u3.q0 */
/* loaded from: classes.dex */
public final class C6671q0 implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f24081a;

    public C6671q0(C6610D c6610d, TaskCompletionSource taskCompletionSource) {
        this.f24081a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = C6610D.f23930b;
        Log.e(str, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof C6526q) && ((C6526q) exc).m27125a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f24081a.setException(exc);
        } else {
            this.f24081a.setResult(new C6681v0().mo27580b());
        }
    }
}
