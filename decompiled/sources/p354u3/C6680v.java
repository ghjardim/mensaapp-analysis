package p354u3;

import com.google.android.gms.tasks.OnFailureListener;
import p003A2.C0019a;
import p219e3.C4184n;

/* renamed from: u3.v */
/* loaded from: classes.dex */
public final class C6680v implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ RunnableC6682w f24091a;

    public C6680v(RunnableC6682w runnableC6682w) {
        this.f24091a = runnableC6682w;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        C0019a c0019a;
        if (exc instanceof C4184n) {
            c0019a = C6676t.f24082h;
            c0019a.m64f("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f24091a.f24096b.m27590d();
        }
    }
}
