package p132S5;

import p167X5.AbstractC2850K;
import p167X5.C2842C;
import p371w5.AbstractC6930m;
import p371w5.C6926i;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.X0 */
/* loaded from: classes2.dex */
public final class C2362X0 extends C2842C {

    /* renamed from: e */
    public final ThreadLocal f7090e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2362X0(p392z5.InterfaceC7161i r3, p392z5.InterfaceC7157e r4) {
        /*
            r2 = this;
            S5.Y0 r0 = p132S5.C2364Y0.f7095a
            z5.i$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            z5.i r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f7090e = r0
            z5.i r4 = r4.getContext()
            z5.f$b r0 = p392z5.InterfaceC7158f.f25437m
            z5.i$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof p132S5.AbstractC2328G
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = p167X5.AbstractC2850K.m10280c(r3, r4)
            p167X5.AbstractC2850K.m10278a(r3, r4)
            r2.m8052S0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p132S5.C2362X0.<init>(z5.i, z5.e):void");
    }

    @Override // p167X5.C2842C, p132S5.AbstractC2367a
    /* renamed from: N0 */
    public void mo8035N0(Object obj) {
        if (this.threadLocalIsSet) {
            C6926i c6926i = (C6926i) this.f7090e.get();
            if (c6926i != null) {
                AbstractC2850K.m10278a((InterfaceC7161i) c6926i.m28368a(), c6926i.m28369b());
            }
            this.f7090e.remove();
        }
        Object m7969a = AbstractC2324E.m7969a(obj, this.f8804d);
        InterfaceC7157e interfaceC7157e = this.f8804d;
        InterfaceC7161i context = interfaceC7157e.getContext();
        Object m10280c = AbstractC2850K.m10280c(context, null);
        C2362X0 m7979g = m10280c != AbstractC2850K.f8812a ? AbstractC2326F.m7979g(interfaceC7157e, context, m10280c) : null;
        try {
            this.f8804d.resumeWith(m7969a);
            C6934q c6934q = C6934q.f24811a;
        } finally {
            if (m7979g == null || m7979g.m8051R0()) {
                AbstractC2850K.m10278a(context, m10280c);
            }
        }
    }

    /* renamed from: R0 */
    public final boolean m8051R0() {
        boolean z6 = this.threadLocalIsSet && this.f7090e.get() == null;
        this.f7090e.remove();
        return !z6;
    }

    /* renamed from: S0 */
    public final void m8052S0(InterfaceC7161i interfaceC7161i, Object obj) {
        this.threadLocalIsSet = true;
        this.f7090e.set(AbstractC6930m.m28383a(interfaceC7161i, obj));
    }
}
