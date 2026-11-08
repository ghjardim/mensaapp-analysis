package p153V5;

import kotlin.jvm.internal.C5477t;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p069J5.InterfaceC0804p;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: V5.l */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2639l {

    /* renamed from: V5.l$a */
    public static final class a implements InterfaceC2631d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2631d f7811a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC0804p f7812b;

        public a(InterfaceC2631d interfaceC2631d, InterfaceC0804p interfaceC0804p) {
            this.f7811a = interfaceC2631d;
            this.f7812b = interfaceC0804p;
        }

        @Override // p153V5.InterfaceC2631d
        /* renamed from: a */
        public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
            Object mo7083a = this.f7811a.mo7083a(new b(new C5477t(), interfaceC2632e, this.f7812b), interfaceC7157e);
            return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
        }
    }

    /* renamed from: V5.l$b */
    public static final class b implements InterfaceC2632e {

        /* renamed from: a */
        public final /* synthetic */ C5477t f7813a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC2632e f7814b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC0804p f7815c;

        /* renamed from: V5.l$b$a */
        public static final class a extends AbstractC0060d {

            /* renamed from: a */
            public Object f7816a;

            /* renamed from: b */
            public Object f7817b;

            /* renamed from: c */
            public /* synthetic */ Object f7818c;

            /* renamed from: e */
            public int f7820e;

            public a(InterfaceC7157e interfaceC7157e) {
                super(interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                this.f7818c = obj;
                this.f7820e |= Integer.MIN_VALUE;
                return b.this.mo2989e(null, this);
            }
        }

        public b(C5477t c5477t, InterfaceC2632e interfaceC2632e, InterfaceC0804p interfaceC0804p) {
            this.f7813a = c5477t;
            this.f7814b = interfaceC2632e;
            this.f7815c = interfaceC0804p;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // p153V5.InterfaceC2632e
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo2989e(java.lang.Object r7, p392z5.InterfaceC7157e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p153V5.AbstractC2639l.b.a
                if (r0 == 0) goto L13
                r0 = r8
                V5.l$b$a r0 = (p153V5.AbstractC2639l.b.a) r0
                int r1 = r0.f7820e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7820e = r1
                goto L18
            L13:
                V5.l$b$a r0 = new V5.l$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f7818c
                java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                int r2 = r0.f7820e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                p371w5.AbstractC6928k.m28382b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f7817b
                java.lang.Object r2 = r0.f7816a
                V5.l$b r2 = (p153V5.AbstractC2639l.b) r2
                p371w5.AbstractC6928k.m28382b(r8)
                goto L6c
            L41:
                p371w5.AbstractC6928k.m28382b(r8)
                goto L59
            L45:
                p371w5.AbstractC6928k.m28382b(r8)
                kotlin.jvm.internal.t r8 = r6.f7813a
                boolean r8 = r8.f19707a
                if (r8 == 0) goto L5c
                V5.e r8 = r6.f7814b
                r0.f7820e = r5
                java.lang.Object r7 = r8.mo2989e(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                w5.q r7 = p371w5.C6934q.f24811a
                return r7
            L5c:
                J5.p r8 = r6.f7815c
                r0.f7816a = r6
                r0.f7817b = r7
                r0.f7820e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.t r8 = r2.f7813a
                r8.f19707a = r5
                V5.e r8 = r2.f7814b
                r2 = 0
                r0.f7816a = r2
                r0.f7817b = r2
                r0.f7820e = r3
                java.lang.Object r7 = r8.mo2989e(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                w5.q r7 = p371w5.C6934q.f24811a
                return r7
            L8b:
                w5.q r7 = p371w5.C6934q.f24811a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2639l.b.mo2989e(java.lang.Object, z5.e):java.lang.Object");
        }
    }

    /* renamed from: V5.l$c */
    public static final class c implements InterfaceC2631d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2631d f7821a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC0804p f7822b;

        /* renamed from: V5.l$c$a */
        public static final class a extends AbstractC0060d {

            /* renamed from: a */
            public /* synthetic */ Object f7823a;

            /* renamed from: b */
            public int f7824b;

            /* renamed from: d */
            public Object f7826d;

            public a(InterfaceC7157e interfaceC7157e) {
                super(interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                this.f7823a = obj;
                this.f7824b |= Integer.MIN_VALUE;
                return c.this.mo7083a(null, this);
            }
        }

        public c(InterfaceC2631d interfaceC2631d, InterfaceC0804p interfaceC0804p) {
            this.f7821a = interfaceC2631d;
            this.f7822b = interfaceC0804p;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // p153V5.InterfaceC2631d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo7083a(p153V5.InterfaceC2632e r6, p392z5.InterfaceC7157e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p153V5.AbstractC2639l.c.a
                if (r0 == 0) goto L13
                r0 = r7
                V5.l$c$a r0 = (p153V5.AbstractC2639l.c.a) r0
                int r1 = r0.f7824b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7824b = r1
                goto L18
            L13:
                V5.l$c$a r0 = new V5.l$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f7823a
                java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                int r2 = r0.f7824b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f7826d
                V5.l$d r6 = (p153V5.AbstractC2639l.d) r6
                p371w5.AbstractC6928k.m28382b(r7)     // Catch: p160W5.C2725a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                p371w5.AbstractC6928k.m28382b(r7)
                V5.d r7 = r5.f7821a
                V5.l$d r2 = new V5.l$d
                J5.p r4 = r5.f7822b
                r2.<init>(r4, r6)
                r0.f7826d = r2     // Catch: p160W5.C2725a -> L4e
                r0.f7824b = r3     // Catch: p160W5.C2725a -> L4e
                java.lang.Object r6 = r7.mo7083a(r2, r0)     // Catch: p160W5.C2725a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                p160W5.AbstractC2734j.m9361a(r7, r6)
            L53:
                w5.q r6 = p371w5.C6934q.f24811a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2639l.c.mo7083a(V5.e, z5.e):java.lang.Object");
        }
    }

    /* renamed from: V5.l$d */
    public static final class d implements InterfaceC2632e {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0804p f7827a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC2632e f7828b;

        /* renamed from: V5.l$d$a */
        public static final class a extends AbstractC0060d {

            /* renamed from: a */
            public Object f7829a;

            /* renamed from: b */
            public /* synthetic */ Object f7830b;

            /* renamed from: c */
            public int f7831c;

            /* renamed from: e */
            public Object f7833e;

            public a(InterfaceC7157e interfaceC7157e) {
                super(interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                this.f7830b = obj;
                this.f7831c |= Integer.MIN_VALUE;
                return d.this.mo2989e(null, this);
            }
        }

        public d(InterfaceC0804p interfaceC0804p, InterfaceC2632e interfaceC2632e) {
            this.f7827a = interfaceC0804p;
            this.f7828b = interfaceC2632e;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // p153V5.InterfaceC2632e
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo2989e(java.lang.Object r8, p392z5.InterfaceC7157e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p153V5.AbstractC2639l.d.a
                if (r0 == 0) goto L13
                r0 = r9
                V5.l$d$a r0 = (p153V5.AbstractC2639l.d.a) r0
                int r1 = r0.f7831c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7831c = r1
                goto L18
            L13:
                V5.l$d$a r0 = new V5.l$d$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f7830b
                java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                int r2 = r0.f7831c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f7829a
                V5.l$d r8 = (p153V5.AbstractC2639l.d) r8
                p371w5.AbstractC6928k.m28382b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f7833e
                java.lang.Object r2 = r0.f7829a
                V5.l$d r2 = (p153V5.AbstractC2639l.d) r2
                p371w5.AbstractC6928k.m28382b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                p371w5.AbstractC6928k.m28382b(r9)
                J5.p r9 = r7.f7827a
                r0.f7829a = r7
                r0.f7833e = r8
                r0.f7831c = r4
                r2 = 6
                kotlin.jvm.internal.AbstractC5468k.m23023a(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.AbstractC5468k.m23023a(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                V5.e r2 = r8.f7828b
                r0.f7829a = r8
                r5 = 0
                r0.f7833e = r5
                r0.f7831c = r3
                java.lang.Object r9 = r2.mo2989e(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                w5.q r8 = p371w5.C6934q.f24811a
                return r8
            L81:
                W5.a r9 = new W5.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2639l.d.mo2989e(java.lang.Object, z5.e):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final InterfaceC2631d m9082a(InterfaceC2631d interfaceC2631d, InterfaceC0804p interfaceC0804p) {
        return new a(interfaceC2631d, interfaceC0804p);
    }

    /* renamed from: b */
    public static final InterfaceC2631d m9083b(InterfaceC2631d interfaceC2631d, InterfaceC0804p interfaceC0804p) {
        return new c(interfaceC2631d, interfaceC0804p);
    }
}
