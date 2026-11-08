package p134T0;

import p078L0.AbstractC0846D;
import p078L0.C0856N;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;

/* renamed from: T0.e */
/* loaded from: classes.dex */
public final class C2432e implements InterfaceC0885t {

    /* renamed from: a */
    public final long f7201a;

    /* renamed from: b */
    public final InterfaceC0885t f7202b;

    /* renamed from: T0.e$a */
    public class a extends AbstractC0846D {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC0855M f7203b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0855M interfaceC0855M, InterfaceC0855M interfaceC0855M2) {
            super(interfaceC0855M);
            this.f7203b = interfaceC0855M2;
        }

        @Override // p078L0.AbstractC0846D, p078L0.InterfaceC0855M
        /* renamed from: j */
        public InterfaceC0855M.a mo3500j(long j7) {
            InterfaceC0855M.a mo3500j = this.f7203b.mo3500j(j7);
            C0856N c0856n = mo3500j.f2936a;
            C0856N c0856n2 = new C0856N(c0856n.f2941a, c0856n.f2942b + C2432e.this.f7201a);
            C0856N c0856n3 = mo3500j.f2937b;
            return new InterfaceC0855M.a(c0856n2, new C0856N(c0856n3.f2941a, c0856n3.f2942b + C2432e.this.f7201a));
        }
    }

    public C2432e(long j7, InterfaceC0885t interfaceC0885t) {
        this.f7201a = j7;
        this.f7202b = interfaceC0885t;
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: b */
    public InterfaceC0861T mo455b(int i7, int i8) {
        return this.f7202b.mo455b(i7, i8);
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: j */
    public void mo466j(InterfaceC0855M interfaceC0855M) {
        this.f7202b.mo466j(new a(interfaceC0855M, interfaceC0855M));
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: q */
    public void mo472q() {
        this.f7202b.mo472q();
    }
}
