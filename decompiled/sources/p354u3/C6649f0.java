package p354u3;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: u3.f0 */
/* loaded from: classes.dex */
public final class C6649f0 implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f24019a;

    /* renamed from: b */
    public final /* synthetic */ String f24020b;

    /* renamed from: c */
    public final /* synthetic */ Activity f24021c;

    /* renamed from: d */
    public final /* synthetic */ boolean f24022d;

    /* renamed from: e */
    public final /* synthetic */ boolean f24023e;

    /* renamed from: f */
    public final /* synthetic */ C6659k0 f24024f;

    /* renamed from: g */
    public final /* synthetic */ TaskCompletionSource f24025g;

    /* renamed from: h */
    public final /* synthetic */ C6610D f24026h;

    public C6649f0(C6610D c6610d, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z6, boolean z7, C6659k0 c6659k0, TaskCompletionSource taskCompletionSource) {
        this.f24019a = firebaseAuth;
        this.f24020b = str;
        this.f24021c = activity;
        this.f24022d = z6;
        this.f24023e = z7;
        this.f24024f = c6659k0;
        this.f24025g = taskCompletionSource;
        this.f24026h = c6610d;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = C6610D.f23930b;
        Log.e(str, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        if (this.f24019a.m15371r0().m27524d("PHONE_PROVIDER")) {
            this.f24026h.m27496c(this.f24019a, this.f24020b, this.f24021c, this.f24022d, this.f24023e, this.f24024f, this.f24025g);
        } else {
            this.f24025g.setResult(new C6681v0().mo27580b());
        }
    }
}
