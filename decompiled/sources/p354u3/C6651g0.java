package p354u3;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c;

/* renamed from: u3.g0 */
/* loaded from: classes.dex */
public final class C6651g0 implements ComponentCallbacks2C3682c.a {

    /* renamed from: a */
    public final /* synthetic */ C6653h0 f24027a;

    public C6651g0(C6653h0 c6653h0) {
        this.f24027a = c6653h0;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c.a
    /* renamed from: a */
    public final void mo14842a(boolean z6) {
        boolean m27547f;
        C6676t c6676t;
        if (z6) {
            this.f24027a.f24030c = true;
            this.f24027a.m27544b();
            return;
        }
        this.f24027a.f24030c = false;
        m27547f = this.f24027a.m27547f();
        if (m27547f) {
            c6676t = this.f24027a.f24029b;
            c6676t.m27589c();
        }
    }
}
