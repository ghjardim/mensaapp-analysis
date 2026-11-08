package p354u3;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.InterfaceC6510i;

/* renamed from: u3.F */
/* loaded from: classes.dex */
public final class C6614F implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f23940a;

    /* renamed from: b */
    public final /* synthetic */ Context f23941b;

    public C6614F(C6604A c6604a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f23940a = taskCompletionSource;
        this.f23941b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f23940a.setResult((InterfaceC6510i) obj);
        C6604A.m27474d(this.f23941b);
    }
}
