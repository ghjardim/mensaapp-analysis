package p187a4;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p187a4.ServiceConnectionC3154k0;
import p381y1.ExecutorC7060k;

/* renamed from: a4.h0 */
/* loaded from: classes.dex */
public class BinderC3148h0 extends Binder {

    /* renamed from: a */
    public final a f9737a;

    /* renamed from: a4.h0$a */
    public interface a {
        /* renamed from: a */
        Task mo11523a(Intent intent);
    }

    public BinderC3148h0(a aVar) {
        this.f9737a = aVar;
    }

    /* renamed from: c */
    public void m11526c(final ServiceConnectionC3154k0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f9737a.mo11523a(aVar.f9751a).addOnCompleteListener(new ExecutorC7060k(), new OnCompleteListener() { // from class: a4.g0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ServiceConnectionC3154k0.a.this.m11536d();
            }
        });
    }
}
