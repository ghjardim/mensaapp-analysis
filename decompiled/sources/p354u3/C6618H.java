package p354u3;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.InterfaceC6510i;

/* renamed from: u3.H */
/* loaded from: classes.dex */
public final class C6618H implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f23951a;

    /* renamed from: b */
    public final /* synthetic */ Context f23952b;

    public C6618H(C6604A c6604a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f23951a = taskCompletionSource;
        this.f23952b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f23951a.setResult((InterfaceC6510i) obj);
        C6604A.m27474d(this.f23952b);
    }
}
