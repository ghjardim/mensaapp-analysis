package p249i1;

import java.util.List;
import p078L0.AbstractC0882q;
import p078L0.C0854L;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p249i1.InterfaceC4529t;

/* renamed from: i1.u */
/* loaded from: classes.dex */
public class C4530u implements InterfaceC0883r {

    /* renamed from: a */
    public final InterfaceC0883r f16176a;

    /* renamed from: b */
    public final InterfaceC4529t.a f16177b;

    /* renamed from: c */
    public C4531v f16178c;

    public C4530u(InterfaceC0883r interfaceC0883r, InterfaceC4529t.a aVar) {
        this.f16176a = interfaceC0883r;
        this.f16177b = aVar;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        C4531v c4531v = this.f16178c;
        if (c4531v != null) {
            c4531v.m19263a();
        }
        this.f16176a.mo695a(j7, j8);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        C4531v c4531v = new C4531v(interfaceC0885t, this.f16177b);
        this.f16178c = c4531v;
        this.f16176a.mo696b(c4531v);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public InterfaceC0883r mo697d() {
        return this.f16176a;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        return this.f16176a.mo699h(interfaceC0884s, c0854l);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        return this.f16176a.mo700i(interfaceC0884s);
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
        this.f16176a.release();
    }
}
