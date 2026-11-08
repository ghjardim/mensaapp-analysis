package p127S0;

import java.util.List;
import p078L0.AbstractC0882q;
import p078L0.C0854L;
import p078L0.C0857O;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p259j0.C5357z;

/* renamed from: S0.a */
/* loaded from: classes.dex */
public final class C2305a implements InterfaceC0883r {

    /* renamed from: a */
    public final C5357z f6998a = new C5357z(4);

    /* renamed from: b */
    public final C0857O f6999b = new C0857O(-1, -1, "image/heif");

    /* renamed from: c */
    private boolean m7818c(InterfaceC0884s interfaceC0884s, int i7) {
        this.f6998a.m21935P(4);
        interfaceC0884s.mo3521t(this.f6998a.m21946e(), 0, 4);
        return this.f6998a.m21928I() == ((long) i7);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f6999b.mo695a(j7, j8);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f6999b.mo696b(interfaceC0885t);
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
        return this.f6999b.mo699h(interfaceC0884s, c0854l);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3515k(4);
        return m7818c(interfaceC0884s, 1718909296) && m7818c(interfaceC0884s, 1751476579);
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
