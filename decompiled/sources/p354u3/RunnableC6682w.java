package p354u3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p003A2.C0019a;
import p219e3.C4176f;

/* renamed from: u3.w */
/* loaded from: classes.dex */
public final class RunnableC6682w implements Runnable {

    /* renamed from: a */
    public final String f24095a;

    /* renamed from: b */
    public final /* synthetic */ C6676t f24096b;

    public RunnableC6682w(C6676t c6676t, String str) {
        this.f24096b = c6676t;
        this.f24095a = AbstractC3802r.m15123e(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0019a c0019a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4176f.m17518p(this.f24095a));
        if (firebaseAuth.m15361m() != null) {
            Task mo15348d = firebaseAuth.mo15348d(true);
            c0019a = C6676t.f24082h;
            c0019a.m64f("Token refreshing started", new Object[0]);
            mo15348d.addOnFailureListener(new C6680v(this));
        }
    }
}
