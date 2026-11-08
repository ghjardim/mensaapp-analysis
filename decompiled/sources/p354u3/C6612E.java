package p354u3;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: u3.E */
/* loaded from: classes.dex */
public final class C6612E implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f23937a;

    /* renamed from: b */
    public final /* synthetic */ Context f23938b;

    public C6612E(C6604A c6604a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f23937a = taskCompletionSource;
        this.f23938b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f23937a.setException(exc);
        C6604A.m27474d(this.f23938b);
    }
}
