package p253i5;

import java.io.Closeable;
import p253i5.C4619m0;
import p253i5.InterfaceC4579R0;

/* renamed from: i5.O0 */
/* loaded from: classes2.dex */
public final class C4574O0 extends AbstractC4567L {

    /* renamed from: a */
    public final C4619m0.b f16562a;

    /* renamed from: b */
    public boolean f16563b;

    public C4574O0(C4619m0.b bVar) {
        this.f16562a = bVar;
    }

    @Override // p253i5.AbstractC4567L, p253i5.C4619m0.b
    /* renamed from: a */
    public void mo19529a(InterfaceC4579R0.a aVar) {
        if (!this.f16563b) {
            super.mo19529a(aVar);
        } else if (aVar instanceof Closeable) {
            AbstractC4580S.m19599e((Closeable) aVar);
        }
    }

    @Override // p253i5.AbstractC4567L
    /* renamed from: b */
    public C4619m0.b mo19530b() {
        return this.f16562a;
    }

    @Override // p253i5.AbstractC4567L, p253i5.C4619m0.b
    /* renamed from: c */
    public void mo19531c(boolean z6) {
        this.f16563b = true;
        super.mo19531c(z6);
    }

    @Override // p253i5.AbstractC4567L, p253i5.C4619m0.b
    /* renamed from: e */
    public void mo19533e(Throwable th) {
        this.f16563b = true;
        super.mo19533e(th);
    }
}
