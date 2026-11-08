package p344t1;

import java.util.List;
import p078L0.AbstractC0882q;
import p078L0.C0854L;
import p078L0.C0857O;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p259j0.C5357z;

/* renamed from: t1.a */
/* loaded from: classes.dex */
public final class C6430a implements InterfaceC0883r {

    /* renamed from: a */
    public final C5357z f23331a = new C5357z(4);

    /* renamed from: b */
    public final C0857O f23332b = new C0857O(-1, -1, "image/webp");

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f23332b.mo695a(j7, j8);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f23332b.mo696b(interfaceC0885t);
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
        return this.f23332b.mo699h(interfaceC0884s, c0854l);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        this.f23331a.m21935P(4);
        interfaceC0884s.mo3521t(this.f23331a.m21946e(), 0, 4);
        if (this.f23331a.m21928I() != 1380533830) {
            return false;
        }
        interfaceC0884s.mo3515k(4);
        this.f23331a.m21935P(4);
        interfaceC0884s.mo3521t(this.f23331a.m21946e(), 0, 4);
        return this.f23331a.m21928I() == 1464156752;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
