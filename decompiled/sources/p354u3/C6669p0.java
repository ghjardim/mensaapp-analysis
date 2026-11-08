package p354u3;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: u3.p0 */
/* loaded from: classes.dex */
public final class C6669p0 implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f24080a;

    public C6669p0(C6610D c6610d, TaskCompletionSource taskCompletionSource) {
        this.f24080a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f24080a.setResult(new C6681v0().mo27582d((String) obj).mo27580b());
    }
}
