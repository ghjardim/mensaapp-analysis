package p134T0;

import java.util.List;
import p078L0.AbstractC0882q;
import p078L0.C0854L;
import p078L0.C0857O;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;

/* renamed from: T0.a */
/* loaded from: classes.dex */
public final class C2428a implements InterfaceC0883r {

    /* renamed from: a */
    public final InterfaceC0883r f7183a;

    public C2428a(int i7) {
        if ((i7 & 1) != 0) {
            this.f7183a = new C0857O(65496, 2, "image/jpeg");
        } else {
            this.f7183a = new C2429b();
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f7183a.mo695a(j7, j8);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f7183a.mo696b(interfaceC0885t);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        return this.f7183a.mo699h(interfaceC0884s, c0854l);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        return this.f7183a.mo700i(interfaceC0884s);
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
        this.f7183a.release();
    }
}
