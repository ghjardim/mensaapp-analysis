package p341s6;

import java.util.Queue;
import p333r6.InterfaceC6307g;
import p349t6.AbstractC6566d;
import p349t6.C6575m;

/* renamed from: s6.a */
/* loaded from: classes2.dex */
public class C6400a extends AbstractC6566d {

    /* renamed from: a */
    public String f23106a;

    /* renamed from: b */
    public C6575m f23107b;

    /* renamed from: c */
    public Queue f23108c;

    public C6400a(C6575m c6575m, Queue queue) {
        this.f23107b = c6575m;
        this.f23106a = c6575m.getName();
        this.f23108c = queue;
    }

    @Override // p349t6.AbstractC6563a
    /* renamed from: C */
    public void mo26732C(EnumC6401b enumC6401b, InterfaceC6307g interfaceC6307g, String str, Object[] objArr, Throwable th) {
        C6403d c6403d = new C6403d();
        c6403d.m26745k(System.currentTimeMillis());
        c6403d.m26739e(enumC6401b);
        c6403d.m26740f(this.f23107b);
        c6403d.m26741g(this.f23106a);
        if (interfaceC6307g != null) {
            c6403d.m26735a(interfaceC6307g);
        }
        c6403d.m26742h(str);
        c6403d.m26743i(Thread.currentThread().getName());
        c6403d.m26738d(objArr);
        c6403d.m26744j(th);
        this.f23108c.add(c6403d);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: c */
    public boolean mo26359c() {
        return true;
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: e */
    public boolean mo26361e() {
        return true;
    }

    @Override // p333r6.InterfaceC6304d
    public String getName() {
        return this.f23106a;
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: j */
    public boolean mo26366j() {
        return true;
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: l */
    public boolean mo26368l() {
        return true;
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: o */
    public boolean mo26371o() {
        return true;
    }
}
