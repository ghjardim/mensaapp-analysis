package p153V5;

import p013B5.AbstractC0060d;
import p392z5.InterfaceC7157e;

/* renamed from: V5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2628a implements InterfaceC2631d {

    /* renamed from: V5.a$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f7777a;

        /* renamed from: b */
        public /* synthetic */ Object f7778b;

        /* renamed from: d */
        public int f7780d;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7778b = obj;
            this.f7780d |= Integer.MIN_VALUE;
            return AbstractC2628a.this.mo7083a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p153V5.InterfaceC2631d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo7083a(p153V5.InterfaceC2632e r6, p392z5.InterfaceC7157e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p153V5.AbstractC2628a.a
            if (r0 == 0) goto L13
            r0 = r7
            V5.a$a r0 = (p153V5.AbstractC2628a.a) r0
            int r1 = r0.f7780d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7780d = r1
            goto L18
        L13:
            V5.a$a r0 = new V5.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7778b
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f7780d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f7777a
            W5.n r6 = (p160W5.C2738n) r6
            p371w5.AbstractC6928k.m28382b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            p371w5.AbstractC6928k.m28382b(r7)
            W5.n r7 = new W5.n
            z5.i r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f7777a = r7     // Catch: java.lang.Throwable -> L55
            r0.f7780d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo9048d(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            w5.q r6 = p371w5.C6934q.f24811a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2628a.mo7083a(V5.e, z5.e):java.lang.Object");
    }

    /* renamed from: d */
    public abstract Object mo9048d(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e);
}
