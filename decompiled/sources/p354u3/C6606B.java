package p354u3;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: u3.B */
/* loaded from: classes.dex */
public final class C6606B implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f23925a;

    /* renamed from: b */
    public final /* synthetic */ Context f23926b;

    public C6606B(C6604A c6604a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f23925a = taskCompletionSource;
        this.f23926b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f23925a.setException(exc);
        C6604A.m27474d(this.f23926b);
    }
}
