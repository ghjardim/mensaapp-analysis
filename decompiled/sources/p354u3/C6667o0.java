package p354u3;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: u3.o0 */
/* loaded from: classes.dex */
public final class C6667o0 implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f24074a;

    public C6667o0(C6610D c6610d, TaskCompletionSource taskCompletionSource) {
        this.f24074a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f24074a.setResult(new C6681v0().mo27581c((String) obj).mo27580b());
    }
}
