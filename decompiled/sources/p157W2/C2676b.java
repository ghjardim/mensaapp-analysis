package p157W2;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* renamed from: W2.b */
/* loaded from: classes.dex */
public final class C2676b extends AbstractRunnableC2668H {

    /* renamed from: n */
    public final /* synthetic */ IBinder f7914n;

    /* renamed from: o */
    public final /* synthetic */ ServiceConnectionC2679e f7915o;

    public C2676b(ServiceConnectionC2679e serviceConnectionC2679e, IBinder iBinder) {
        this.f7915o = serviceConnectionC2679e;
        this.f7914n = iBinder;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        InterfaceC2674N interfaceC2674N;
        List list;
        List list2;
        interfaceC2674N = this.f7915o.f7917a.f7927i;
        this.f7915o.f7917a.f7932n = (IInterface) interfaceC2674N.mo9149a(this.f7914n);
        C2680f.m9167r(this.f7915o.f7917a);
        this.f7915o.f7917a.f7925g = false;
        list = this.f7915o.f7917a.f7922d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f7915o.f7917a.f7922d;
        list2.clear();
    }
}
