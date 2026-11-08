package p354u3;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.InterfaceC6510i;

/* renamed from: u3.C */
/* loaded from: classes.dex */
public final class C6608C implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f23927a;

    /* renamed from: b */
    public final /* synthetic */ Context f23928b;

    public C6608C(C6604A c6604a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f23927a = taskCompletionSource;
        this.f23928b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f23927a.setResult((InterfaceC6510i) obj);
        C6604A.m27474d(this.f23928b);
    }
}
