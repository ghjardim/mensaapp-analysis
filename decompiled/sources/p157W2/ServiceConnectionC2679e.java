package p157W2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: W2.e */
/* loaded from: classes.dex */
public final class ServiceConnectionC2679e implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C2680f f7917a;

    public /* synthetic */ ServiceConnectionC2679e(C2680f c2680f, AbstractC2678d abstractC2678d) {
        this.f7917a = c2680f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2667G c2667g;
        c2667g = this.f7917a.f7920b;
        c2667g.m9144d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f7917a.m9169c().post(new C2676b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2667G c2667g;
        c2667g = this.f7917a.f7920b;
        c2667g.m9144d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f7917a.m9169c().post(new C2677c(this));
    }
}
