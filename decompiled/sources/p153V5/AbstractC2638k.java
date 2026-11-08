package p153V5;

import p013B5.AbstractC0060d;
import p069J5.InterfaceC0804p;
import p069J5.InterfaceC0805q;
import p392z5.InterfaceC7157e;

/* renamed from: V5.k */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2638k {

    /* renamed from: V5.k$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f7793a;

        /* renamed from: b */
        public /* synthetic */ Object f7794b;

        /* renamed from: c */
        public int f7795c;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7794b = obj;
            this.f7795c |= Integer.MIN_VALUE;
            return AbstractC2638k.m9079c(null, null, null, this);
        }
    }

    /* renamed from: V5.k$b */
    public static final class b implements InterfaceC2631d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2631d f7796a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC0805q f7797b;

        /* renamed from: V5.k$b$a */
        public static final class a extends AbstractC0060d {

            /* renamed from: a */
            public /* synthetic */ Object f7798a;

            /* renamed from: b */
            public int f7799b;

            /* renamed from: d */
            public Object f7801d;

            /* renamed from: e */
            public Object f7802e;

            public a(InterfaceC7157e interfaceC7157e) {
                super(interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                this.f7798a = obj;
                this.f7799b |= Integer.MIN_VALUE;
                return b.this.mo7083a(null, this);
            }
        }

        public b(InterfaceC2631d interfaceC2631d, InterfaceC0805q interfaceC0805q) {
            this.f7796a = interfaceC2631d;
            this.f7797b = interfaceC0805q;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // p153V5.InterfaceC2631d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo7083a(p153V5.InterfaceC2632e r9, p392z5.InterfaceC7157e r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof p153V5.AbstractC2638k.b.a
                if (r0 == 0) goto L13
                r0 = r10
                V5.k$b$a r0 = (p153V5.AbstractC2638k.b.a) r0
                int r1 = r0.f7799b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7799b = r1
                goto L18
            L13:
                V5.k$b$a r0 = new V5.k$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f7798a
                java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                int r2 = r0.f7799b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f7801d
                W5.n r9 = (p160W5.C2738n) r9
                p371w5.AbstractC6928k.m28382b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f7801d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                p371w5.AbstractC6928k.m28382b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f7802e
                V5.e r9 = (p153V5.InterfaceC2632e) r9
                java.lang.Object r2 = r0.f7801d
                V5.k$b r2 = (p153V5.AbstractC2638k.b) r2
                p371w5.AbstractC6928k.m28382b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                p371w5.AbstractC6928k.m28382b(r10)
                V5.d r10 = r8.f7796a     // Catch: java.lang.Throwable -> L96
                r0.f7801d = r8     // Catch: java.lang.Throwable -> L96
                r0.f7802e = r9     // Catch: java.lang.Throwable -> L96
                r0.f7799b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.mo7083a(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                W5.n r10 = new W5.n
                z5.i r4 = r0.getContext()
                r10.<init>(r9, r4)
                J5.q r9 = r2.f7797b     // Catch: java.lang.Throwable -> L8e
                r0.f7801d = r10     // Catch: java.lang.Throwable -> L8e
                r0.f7802e = r6     // Catch: java.lang.Throwable -> L8e
                r0.f7799b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.AbstractC5468k.m23023a(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.mo3350c(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.AbstractC5468k.m23023a(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                w5.q r9 = p371w5.C6934q.f24811a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                V5.v r10 = new V5.v
                r10.<init>(r9)
                J5.q r2 = r2.f7797b
                r0.f7801d = r9
                r0.f7802e = r6
                r0.f7799b = r4
                java.lang.Object r10 = p153V5.AbstractC2638k.m9077a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2638k.b.mo7083a(V5.e, z5.e):java.lang.Object");
        }
    }

    /* renamed from: V5.k$c */
    public static final class c implements InterfaceC2631d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0804p f7803a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC2631d f7804b;

        /* renamed from: V5.k$c$a */
        public static final class a extends AbstractC0060d {

            /* renamed from: a */
            public /* synthetic */ Object f7805a;

            /* renamed from: b */
            public int f7806b;

            /* renamed from: d */
            public Object f7808d;

            /* renamed from: e */
            public Object f7809e;

            /* renamed from: f */
            public Object f7810f;

            public a(InterfaceC7157e interfaceC7157e) {
                super(interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                this.f7805a = obj;
                this.f7806b |= Integer.MIN_VALUE;
                return c.this.mo7083a(null, this);
            }
        }

        public c(InterfaceC0804p interfaceC0804p, InterfaceC2631d interfaceC2631d) {
            this.f7803a = interfaceC0804p;
            this.f7804b = interfaceC2631d;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // p153V5.InterfaceC2631d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo7083a(p153V5.InterfaceC2632e r7, p392z5.InterfaceC7157e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p153V5.AbstractC2638k.c.a
                if (r0 == 0) goto L13
                r0 = r8
                V5.k$c$a r0 = (p153V5.AbstractC2638k.c.a) r0
                int r1 = r0.f7806b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7806b = r1
                goto L18
            L13:
                V5.k$c$a r0 = new V5.k$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f7805a
                java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                int r2 = r0.f7806b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p371w5.AbstractC6928k.m28382b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f7810f
                W5.n r7 = (p160W5.C2738n) r7
                java.lang.Object r2 = r0.f7809e
                V5.e r2 = (p153V5.InterfaceC2632e) r2
                java.lang.Object r4 = r0.f7808d
                V5.k$c r4 = (p153V5.AbstractC2638k.c) r4
                p371w5.AbstractC6928k.m28382b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                p371w5.AbstractC6928k.m28382b(r8)
                W5.n r8 = new W5.n
                z5.i r2 = r0.getContext()
                r8.<init>(r7, r2)
                J5.p r2 = r6.f7803a     // Catch: java.lang.Throwable -> L86
                r0.f7808d = r6     // Catch: java.lang.Throwable -> L86
                r0.f7809e = r7     // Catch: java.lang.Throwable -> L86
                r0.f7810f = r8     // Catch: java.lang.Throwable -> L86
                r0.f7806b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.AbstractC5468k.m23023a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.AbstractC5468k.m23023a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                V5.d r7 = r4.f7804b
                r8 = 0
                r0.f7808d = r8
                r0.f7809e = r8
                r0.f7810f = r8
                r0.f7806b = r3
                java.lang.Object r7 = r7.mo7083a(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                w5.q r7 = p371w5.C6934q.f24811a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2638k.c.mo7083a(V5.e, z5.e):java.lang.Object");
        }
    }

    /* renamed from: b */
    public static final void m9078b(InterfaceC2632e interfaceC2632e) {
        if (interfaceC2632e instanceof C2649v) {
            throw ((C2649v) interfaceC2632e).f7854a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9079c(p153V5.InterfaceC2632e r4, p069J5.InterfaceC0805q r5, java.lang.Throwable r6, p392z5.InterfaceC7157e r7) {
        /*
            boolean r0 = r7 instanceof p153V5.AbstractC2638k.a
            if (r0 == 0) goto L13
            r0 = r7
            V5.k$a r0 = (p153V5.AbstractC2638k.a) r0
            int r1 = r0.f7795c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7795c = r1
            goto L18
        L13:
            V5.k$a r0 = new V5.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7794b
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f7795c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f7793a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            p371w5.AbstractC6928k.m28382b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            p371w5.AbstractC6928k.m28382b(r7)
            r0.f7793a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f7795c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.mo3350c(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            w5.q r4 = p371w5.C6934q.f24811a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            p371w5.AbstractC6918a.m28362a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2638k.m9079c(V5.e, J5.q, java.lang.Throwable, z5.e):java.lang.Object");
    }

    /* renamed from: d */
    public static final InterfaceC2631d m9080d(InterfaceC2631d interfaceC2631d, InterfaceC0805q interfaceC0805q) {
        return new b(interfaceC2631d, interfaceC0805q);
    }

    /* renamed from: e */
    public static final InterfaceC2631d m9081e(InterfaceC2631d interfaceC2631d, InterfaceC0804p interfaceC0804p) {
        return new c(interfaceC0804p, interfaceC2631d);
    }
}
