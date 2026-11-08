package p146U5;

import java.util.concurrent.CancellationException;
import p069J5.InterfaceC0800l;
import p132S5.AbstractC2367a;
import p132S5.C2321C0;
import p132S5.C2411v0;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: U5.e */
/* loaded from: classes2.dex */
public abstract class AbstractC2587e extends AbstractC2367a implements InterfaceC2586d {

    /* renamed from: d */
    public final InterfaceC2586d f7608d;

    public AbstractC2587e(InterfaceC7161i interfaceC7161i, InterfaceC2586d interfaceC2586d, boolean z6, boolean z7) {
        super(interfaceC7161i, z6, z7);
        this.f7608d = interfaceC2586d;
    }

    @Override // p132S5.C2321C0
    /* renamed from: J */
    public void mo7892J(Throwable th) {
        CancellationException m7869G0 = C2321C0.m7869G0(this, th, null, 1, null);
        this.f7608d.cancel(m7869G0);
        m7888H(m7869G0);
    }

    /* renamed from: R0 */
    public final InterfaceC2586d m8846R0() {
        return this.f7608d;
    }

    @Override // p146U5.InterfaceC2601s
    /* renamed from: b */
    public Object mo8768b(InterfaceC7157e interfaceC7157e) {
        return this.f7608d.mo8768b(interfaceC7157e);
    }

    @Override // p132S5.C2321C0, p132S5.InterfaceC2409u0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C2411v0(mo7898M(), null, this);
        }
        mo7892J(cancellationException);
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: d */
    public Object mo8771d(Object obj, InterfaceC7157e interfaceC7157e) {
        return this.f7608d.mo8771d(obj, interfaceC7157e);
    }

    @Override // p146U5.InterfaceC2601s
    /* renamed from: e */
    public Object mo8773e() {
        return this.f7608d.mo8773e();
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: g */
    public void mo8776g(InterfaceC0800l interfaceC0800l) {
        this.f7608d.mo8776g(interfaceC0800l);
    }

    @Override // p146U5.InterfaceC2601s
    public InterfaceC2588f iterator() {
        return this.f7608d.iterator();
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: k */
    public boolean mo8781k(Throwable th) {
        return this.f7608d.mo8781k(th);
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: p */
    public Object mo8787p(Object obj) {
        return this.f7608d.mo8787p(obj);
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: s */
    public boolean mo8791s() {
        return this.f7608d.mo8791s();
    }

    @Override // p132S5.C2321C0, p132S5.InterfaceC2409u0
    public /* synthetic */ void cancel() {
        mo7892J(new C2411v0(mo7898M(), null, this));
    }

    @Override // p132S5.C2321C0, p132S5.InterfaceC2409u0
    public final /* synthetic */ boolean cancel(Throwable th) {
        mo7892J(new C2411v0(mo7898M(), null, this));
        return true;
    }
}
