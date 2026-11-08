package p354u3;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: u3.z */
/* loaded from: classes.dex */
public final class C6688z implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f24101a;

    /* renamed from: b */
    public final /* synthetic */ Context f24102b;

    public C6688z(C6604A c6604a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f24101a = taskCompletionSource;
        this.f24102b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f24101a.setException(exc);
        C6604A.m27474d(this.f24102b);
    }
}
