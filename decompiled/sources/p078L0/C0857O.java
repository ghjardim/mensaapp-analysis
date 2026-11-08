package p078L0;

import java.util.List;
import p232g0.C4327q;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: L0.O */
/* loaded from: classes.dex */
public final class C0857O implements InterfaceC0883r {

    /* renamed from: a */
    public final int f2943a;

    /* renamed from: b */
    public final int f2944b;

    /* renamed from: c */
    public final String f2945c;

    /* renamed from: d */
    public int f2946d;

    /* renamed from: e */
    public int f2947e;

    /* renamed from: f */
    public InterfaceC0885t f2948f;

    /* renamed from: g */
    public InterfaceC0861T f2949g;

    public C0857O(int i7, int i8, String str) {
        this.f2943a = i7;
        this.f2944b = i8;
        this.f2945c = str;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        if (j7 == 0 || this.f2947e == 1) {
            this.f2947e = 1;
            this.f2946d = 0;
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f2948f = interfaceC0885t;
        m3553c(this.f2945c);
    }

    /* renamed from: c */
    public final void m3553c(String str) {
        InterfaceC0861T mo455b = this.f2948f.mo455b(1024, 4);
        this.f2949g = mo455b;
        mo455b.mo566e(new C4327q.b().m18264o0(str).m18234K());
        this.f2948f.mo472q();
        this.f2948f.mo466j(new C0858P(-9223372036854775807L));
        this.f2947e = 1;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public final void m3554e(InterfaceC0884s interfaceC0884s) {
        int mo558a = ((InterfaceC0861T) AbstractC5332a.m21800e(this.f2949g)).mo558a(interfaceC0884s, 1024, true);
        if (mo558a != -1) {
            this.f2946d += mo558a;
            return;
        }
        this.f2947e = 2;
        this.f2949g.mo562c(0L, 1, this.f2946d, 0, null);
        this.f2946d = 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        int i7 = this.f2947e;
        if (i7 == 1) {
            m3554e(interfaceC0884s);
            return 0;
        }
        if (i7 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        AbstractC5332a.m21802g((this.f2943a == -1 || this.f2944b == -1) ? false : true);
        C5357z c5357z = new C5357z(this.f2944b);
        interfaceC0884s.mo3521t(c5357z.m21946e(), 0, this.f2944b);
        return c5357z.m21932M() == this.f2943a;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
