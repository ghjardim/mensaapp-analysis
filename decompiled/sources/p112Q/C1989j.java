package p112Q;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import kotlin.jvm.internal.C5477t;
import kotlin.jvm.internal.C5478u;
import kotlin.jvm.internal.C5480w;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0058b;
import p013B5.AbstractC0060d;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p069J5.InterfaceC0805q;
import p112Q.AbstractC1995p;
import p112Q.C1978A;
import p132S5.AbstractC2384i;
import p132S5.AbstractC2416y;
import p132S5.InterfaceC2334J;
import p132S5.InterfaceC2409u0;
import p132S5.InterfaceC2412w;
import p153V5.AbstractC2633f;
import p153V5.InterfaceC2631d;
import p153V5.InterfaceC2632e;
import p198b6.AbstractC3558c;
import p198b6.InterfaceC3556a;
import p371w5.AbstractC6924g;
import p371w5.AbstractC6928k;
import p371w5.AbstractC6930m;
import p371w5.C6934q;
import p371w5.InterfaceC6923f;
import p378x5.AbstractC7032w;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: Q.j */
/* loaded from: classes.dex */
public final class C1989j implements InterfaceC1987h {

    /* renamed from: m */
    public static final a f6006m = new a(null);

    /* renamed from: a */
    public final InterfaceC2002w f6007a;

    /* renamed from: b */
    public final InterfaceC1983d f6008b;

    /* renamed from: c */
    public final InterfaceC2334J f6009c;

    /* renamed from: d */
    public final InterfaceC2631d f6010d;

    /* renamed from: e */
    public final InterfaceC3556a f6011e;

    /* renamed from: f */
    public int f6012f;

    /* renamed from: g */
    public InterfaceC2409u0 f6013g;

    /* renamed from: h */
    public final C1990k f6014h;

    /* renamed from: i */
    public final b f6015i;

    /* renamed from: j */
    public final InterfaceC6923f f6016j;

    /* renamed from: k */
    public final InterfaceC6923f f6017k;

    /* renamed from: l */
    public final C1999t f6018l;

    /* renamed from: Q.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: Q.j$b */
    public final class b extends AbstractC1998s {

        /* renamed from: c */
        public List f6019c;

        /* renamed from: d */
        public final /* synthetic */ C1989j f6020d;

        /* renamed from: Q.j$b$a */
        public static final class a extends AbstractC0060d {

            /* renamed from: a */
            public Object f6021a;

            /* renamed from: b */
            public /* synthetic */ Object f6022b;

            /* renamed from: d */
            public int f6024d;

            public a(InterfaceC7157e interfaceC7157e) {
                super(interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                this.f6022b = obj;
                this.f6024d |= Integer.MIN_VALUE;
                return b.this.mo7074b(this);
            }
        }

        /* renamed from: Q.j$b$b, reason: collision with other inner class name */
        public static final class C7181b extends AbstractC0068l implements InterfaceC0800l {

            /* renamed from: a */
            public Object f6025a;

            /* renamed from: b */
            public Object f6026b;

            /* renamed from: c */
            public Object f6027c;

            /* renamed from: d */
            public Object f6028d;

            /* renamed from: e */
            public Object f6029e;

            /* renamed from: f */
            public int f6030f;

            /* renamed from: n */
            public int f6031n;

            /* renamed from: o */
            public final /* synthetic */ C1989j f6032o;

            /* renamed from: p */
            public final /* synthetic */ b f6033p;

            /* renamed from: Q.j$b$b$a */
            public static final class a implements InterfaceC1992m {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC3556a f6034a;

                /* renamed from: b */
                public final /* synthetic */ C5477t f6035b;

                /* renamed from: c */
                public final /* synthetic */ C5480w f6036c;

                /* renamed from: d */
                public final /* synthetic */ C1989j f6037d;

                /* renamed from: Q.j$b$b$a$a, reason: collision with other inner class name */
                public static final class C7182a extends AbstractC0060d {

                    /* renamed from: a */
                    public Object f6038a;

                    /* renamed from: b */
                    public Object f6039b;

                    /* renamed from: c */
                    public Object f6040c;

                    /* renamed from: d */
                    public Object f6041d;

                    /* renamed from: e */
                    public Object f6042e;

                    /* renamed from: f */
                    public /* synthetic */ Object f6043f;

                    /* renamed from: o */
                    public int f6045o;

                    public C7182a(InterfaceC7157e interfaceC7157e) {
                        super(interfaceC7157e);
                    }

                    @Override // p013B5.AbstractC0057a
                    public final Object invokeSuspend(Object obj) {
                        this.f6043f = obj;
                        this.f6045o |= Integer.MIN_VALUE;
                        return a.this.mo7076b(null, this);
                    }
                }

                public a(InterfaceC3556a interfaceC3556a, C5477t c5477t, C5480w c5480w, C1989j c1989j) {
                    this.f6034a = interfaceC3556a;
                    this.f6035b = c5477t;
                    this.f6036c = c5480w;
                    this.f6037d = c1989j;
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00db, B:47:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00db A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00db, B:47:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // p112Q.InterfaceC1992m
                /* renamed from: b */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object mo7076b(p069J5.InterfaceC0804p r11, p392z5.InterfaceC7157e r12) {
                    /*
                        Method dump skipped, instructions count: 231
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.b.C7181b.a.mo7076b(J5.p, z5.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7181b(C1989j c1989j, b bVar, InterfaceC7157e interfaceC7157e) {
                super(1, interfaceC7157e);
                this.f6032o = c1989j;
                this.f6033p = bVar;
            }

            @Override // p069J5.InterfaceC0800l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7157e interfaceC7157e) {
                return ((C7181b) create(interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(InterfaceC7157e interfaceC7157e) {
                return new C7181b(this.f6032o, this.f6033p, interfaceC7157e);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x010b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00e4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
            @Override // p013B5.AbstractC0057a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.b.C7181b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(C1989j c1989j, List initTasksList) {
            AbstractC5469l.m23028e(initTasksList, "initTasksList");
            this.f6020d = c1989j;
            this.f6019c = AbstractC7032w.m28889O(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // p112Q.AbstractC1998s
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo7074b(p392z5.InterfaceC7157e r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof p112Q.C1989j.b.a
                if (r0 == 0) goto L13
                r0 = r7
                Q.j$b$a r0 = (p112Q.C1989j.b.a) r0
                int r1 = r0.f6024d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f6024d = r1
                goto L18
            L13:
                Q.j$b$a r0 = new Q.j$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f6022b
                java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                int r2 = r0.f6024d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f6021a
                Q.j$b r0 = (p112Q.C1989j.b) r0
                p371w5.AbstractC6928k.m28382b(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.f6021a
                Q.j$b r0 = (p112Q.C1989j.b) r0
                p371w5.AbstractC6928k.m28382b(r7)
                goto L7d
            L40:
                p371w5.AbstractC6928k.m28382b(r7)
                java.util.List r7 = r6.f6019c
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.AbstractC5469l.m23025b(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                Q.j r7 = r6.f6020d
                Q.n r7 = p112Q.C1989j.m7046d(r7)
                Q.j$b$b r2 = new Q.j$b$b
                Q.j r4 = r6.f6020d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f6021a = r6
                r0.f6024d = r3
                java.lang.Object r7 = r7.mo7107d(r2, r0)
                if (r7 != r1) goto L6a
                return r1
            L6a:
                r0 = r6
            L6b:
                Q.e r7 = (p112Q.C1984e) r7
                goto L7f
            L6e:
                Q.j r7 = r6.f6020d
                r0.f6021a = r6
                r0.f6024d = r4
                r2 = 0
                java.lang.Object r7 = p112Q.C1989j.m7057o(r7, r2, r0)
                if (r7 != r1) goto L7c
                return r1
            L7c:
                r0 = r6
            L7d:
                Q.e r7 = (p112Q.C1984e) r7
            L7f:
                Q.j r0 = r0.f6020d
                Q.k r0 = p112Q.C1989j.m7047e(r0)
                r0.m7102c(r7)
                w5.q r7 = p371w5.C6934q.f24811a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.b.mo7074b(z5.e):java.lang.Object");
        }
    }

    /* renamed from: Q.j$c */
    public static final class c extends AbstractC5470m implements InterfaceC0789a {
        public c() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1993n invoke() {
            return C1989j.this.m7065t().mo7129b();
        }
    }

    /* renamed from: Q.j$d */
    public static final class d extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f6047a;

        /* renamed from: b */
        public int f6048b;

        /* renamed from: c */
        public /* synthetic */ Object f6049c;

        /* renamed from: Q.j$d$a */
        public static final class a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f6051a;

            /* renamed from: b */
            public final /* synthetic */ C1989j f6052b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1989j c1989j, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f6052b = c1989j;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
                return ((a) create(interfaceC2632e, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return new a(this.f6052b, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f6051a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    C1989j c1989j = this.f6052b;
                    this.f6051a = 1;
                    if (c1989j.m7067v(this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return C6934q.f24811a;
            }
        }

        /* renamed from: Q.j$d$b */
        public static final class b extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f6053a;

            /* renamed from: b */
            public /* synthetic */ Object f6054b;

            public b(InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC2001v abstractC2001v, InterfaceC7157e interfaceC7157e) {
                return ((b) create(abstractC2001v, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                b bVar = new b(interfaceC7157e);
                bVar.f6054b = obj;
                return bVar;
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                AbstractC0024c.m76e();
                if (this.f6053a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
                return AbstractC0058b.m149a(!(((AbstractC2001v) this.f6054b) instanceof C1991l));
            }
        }

        /* renamed from: Q.j$d$c */
        public static final class c extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f6055a;

            /* renamed from: b */
            public /* synthetic */ Object f6056b;

            /* renamed from: c */
            public final /* synthetic */ AbstractC2001v f6057c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC2001v abstractC2001v, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f6057c = abstractC2001v;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC2001v abstractC2001v, InterfaceC7157e interfaceC7157e) {
                return ((c) create(abstractC2001v, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                c cVar = new c(this.f6057c, interfaceC7157e);
                cVar.f6056b = obj;
                return cVar;
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                AbstractC0024c.m76e();
                if (this.f6055a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
                AbstractC2001v abstractC2001v = (AbstractC2001v) this.f6056b;
                return AbstractC0058b.m149a((abstractC2001v instanceof C1984e) && abstractC2001v.m7126a() <= this.f6057c.m7126a());
            }
        }

        /* renamed from: Q.j$d$d, reason: collision with other inner class name */
        public static final class C7183d extends AbstractC0068l implements InterfaceC0805q {

            /* renamed from: a */
            public int f6058a;

            /* renamed from: b */
            public final /* synthetic */ C1989j f6059b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7183d(C1989j c1989j, InterfaceC7157e interfaceC7157e) {
                super(3, interfaceC7157e);
                this.f6059b = c1989j;
            }

            @Override // p069J5.InterfaceC0805q
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo3350c(InterfaceC2632e interfaceC2632e, Throwable th, InterfaceC7157e interfaceC7157e) {
                return new C7183d(this.f6059b, interfaceC7157e).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f6058a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    C1989j c1989j = this.f6059b;
                    this.f6058a = 1;
                    if (c1989j.m7062q(this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return C6934q.f24811a;
            }
        }

        /* renamed from: Q.j$d$e */
        public static final class e implements InterfaceC2631d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2631d f6060a;

            /* renamed from: Q.j$d$e$a */
            public static final class a implements InterfaceC2632e {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC2632e f6061a;

                /* renamed from: Q.j$d$e$a$a, reason: collision with other inner class name */
                public static final class C7184a extends AbstractC0060d {

                    /* renamed from: a */
                    public /* synthetic */ Object f6062a;

                    /* renamed from: b */
                    public int f6063b;

                    public C7184a(InterfaceC7157e interfaceC7157e) {
                        super(interfaceC7157e);
                    }

                    @Override // p013B5.AbstractC0057a
                    public final Object invokeSuspend(Object obj) {
                        this.f6062a = obj;
                        this.f6063b |= Integer.MIN_VALUE;
                        return a.this.mo2989e(null, this);
                    }
                }

                public a(InterfaceC2632e interfaceC2632e) {
                    this.f6061a = interfaceC2632e;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // p153V5.InterfaceC2632e
                /* renamed from: e */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object mo2989e(java.lang.Object r5, p392z5.InterfaceC7157e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p112Q.C1989j.d.e.a.C7184a
                        if (r0 == 0) goto L13
                        r0 = r6
                        Q.j$d$e$a$a r0 = (p112Q.C1989j.d.e.a.C7184a) r0
                        int r1 = r0.f6063b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f6063b = r1
                        goto L18
                    L13:
                        Q.j$d$e$a$a r0 = new Q.j$d$e$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f6062a
                        java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                        int r2 = r0.f6063b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p371w5.AbstractC6928k.m28382b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p371w5.AbstractC6928k.m28382b(r6)
                        V5.e r6 = r4.f6061a
                        Q.v r5 = (p112Q.AbstractC2001v) r5
                        boolean r2 = r5 instanceof p112Q.C1996q
                        if (r2 != 0) goto L69
                        boolean r2 = r5 instanceof p112Q.C1984e
                        if (r2 == 0) goto L52
                        Q.e r5 = (p112Q.C1984e) r5
                        java.lang.Object r5 = r5.m7035c()
                        r0.f6063b = r3
                        java.lang.Object r5 = r6.mo2989e(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        w5.q r5 = p371w5.C6934q.f24811a
                        return r5
                    L52:
                        boolean r6 = r5 instanceof p112Q.C1991l
                        if (r6 == 0) goto L57
                        goto L59
                    L57:
                        boolean r3 = r5 instanceof p112Q.C2005z
                    L59:
                        if (r3 == 0) goto L63
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L63:
                        w5.h r5 = new w5.h
                        r5.<init>()
                        throw r5
                    L69:
                        Q.q r5 = (p112Q.C1996q) r5
                        java.lang.Throwable r5 = r5.m7114b()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.d.e.a.mo2989e(java.lang.Object, z5.e):java.lang.Object");
                }
            }

            public e(InterfaceC2631d interfaceC2631d) {
                this.f6060a = interfaceC2631d;
            }

            @Override // p153V5.InterfaceC2631d
            /* renamed from: a */
            public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
                Object mo7083a = this.f6060a.mo7083a(new a(interfaceC2632e), interfaceC7157e);
                return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
            }
        }

        public d(InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
            return ((d) create(interfaceC2632e, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            d dVar = C1989j.this.new d(interfaceC7157e);
            dVar.f6049c = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00bc A[RETURN] */
        @Override // p013B5.AbstractC0057a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p006A5.AbstractC0024c.m76e()
                int r1 = r8.f6048b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                p371w5.AbstractC6928k.m28382b(r9)
                goto Lbd
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.f6047a
                Q.v r1 = (p112Q.AbstractC2001v) r1
                java.lang.Object r3 = r8.f6049c
                V5.e r3 = (p153V5.InterfaceC2632e) r3
                p371w5.AbstractC6928k.m28382b(r9)
                goto L66
            L2a:
                java.lang.Object r1 = r8.f6049c
                V5.e r1 = (p153V5.InterfaceC2632e) r1
                p371w5.AbstractC6928k.m28382b(r9)
                goto L4a
            L32:
                p371w5.AbstractC6928k.m28382b(r9)
                java.lang.Object r9 = r8.f6049c
                V5.e r9 = (p153V5.InterfaceC2632e) r9
                Q.j r1 = p112Q.C1989j.this
                r8.f6049c = r9
                r8.f6048b = r4
                r4 = 0
                java.lang.Object r1 = p112Q.C1989j.m7058p(r1, r4, r8)
                if (r1 != r0) goto L47
                return r0
            L47:
                r7 = r1
                r1 = r9
                r9 = r7
            L4a:
                Q.v r9 = (p112Q.AbstractC2001v) r9
                boolean r4 = r9 instanceof p112Q.C1984e
                if (r4 == 0) goto L69
                r4 = r9
                Q.e r4 = (p112Q.C1984e) r4
                java.lang.Object r4 = r4.m7035c()
                r8.f6049c = r1
                r8.f6047a = r9
                r8.f6048b = r3
                java.lang.Object r3 = r1.mo2989e(r4, r8)
                if (r3 != r0) goto L64
                return r0
            L64:
                r3 = r1
                r1 = r9
            L66:
                r9 = r1
                r1 = r3
                goto L78
            L69:
                boolean r3 = r9 instanceof p112Q.C2005z
                if (r3 != 0) goto Lc7
                boolean r3 = r9 instanceof p112Q.C1996q
                if (r3 != 0) goto Lc0
                boolean r3 = r9 instanceof p112Q.C1991l
                if (r3 == 0) goto L78
                w5.q r9 = p371w5.C6934q.f24811a
                return r9
            L78:
                Q.j r3 = p112Q.C1989j.this
                Q.k r3 = p112Q.C1989j.m7047e(r3)
                V5.d r3 = r3.m7101b()
                Q.j$d$a r4 = new Q.j$d$a
                Q.j r5 = p112Q.C1989j.this
                r6 = 0
                r4.<init>(r5, r6)
                V5.d r3 = p153V5.AbstractC2633f.m9064m(r3, r4)
                Q.j$d$b r4 = new Q.j$d$b
                r4.<init>(r6)
                V5.d r3 = p153V5.AbstractC2633f.m9065n(r3, r4)
                Q.j$d$c r4 = new Q.j$d$c
                r4.<init>(r9, r6)
                V5.d r9 = p153V5.AbstractC2633f.m9056e(r3, r4)
                Q.j$d$e r3 = new Q.j$d$e
                r3.<init>(r9)
                Q.j$d$d r9 = new Q.j$d$d
                Q.j r4 = p112Q.C1989j.this
                r9.<init>(r4, r6)
                V5.d r9 = p153V5.AbstractC2633f.m9063l(r3, r9)
                r8.f6049c = r6
                r8.f6047a = r6
                r8.f6048b = r2
                java.lang.Object r9 = p153V5.AbstractC2633f.m9058g(r1, r9, r8)
                if (r9 != r0) goto Lbd
                return r0
            Lbd:
                w5.q r9 = p371w5.C6934q.f24811a
                return r9
            Lc0:
                Q.q r9 = (p112Q.C1996q) r9
                java.lang.Throwable r9 = r9.m7114b()
                throw r9
            Lc7:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: Q.j$e */
    public static final class e extends AbstractC0060d {

        /* renamed from: a */
        public Object f6065a;

        /* renamed from: b */
        public Object f6066b;

        /* renamed from: c */
        public /* synthetic */ Object f6067c;

        /* renamed from: e */
        public int f6069e;

        public e(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6067c = obj;
            this.f6069e |= Integer.MIN_VALUE;
            return C1989j.this.m7062q(this);
        }
    }

    /* renamed from: Q.j$f */
    public static final class f extends AbstractC0068l implements InterfaceC0800l {

        /* renamed from: a */
        public int f6070a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC0800l f6071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC0800l interfaceC0800l, InterfaceC7157e interfaceC7157e) {
            super(1, interfaceC7157e);
            this.f6071b = interfaceC0800l;
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7157e interfaceC7157e) {
            return ((f) create(interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(InterfaceC7157e interfaceC7157e) {
            return new f(this.f6071b, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f6070a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                InterfaceC0800l interfaceC0800l = this.f6071b;
                this.f6070a = 1;
                obj = interfaceC0800l.invoke(this);
                if (obj == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return obj;
        }
    }

    /* renamed from: Q.j$g */
    public static final class g extends AbstractC0060d {

        /* renamed from: a */
        public Object f6072a;

        /* renamed from: b */
        public Object f6073b;

        /* renamed from: c */
        public Object f6074c;

        /* renamed from: d */
        public /* synthetic */ Object f6075d;

        /* renamed from: f */
        public int f6077f;

        public g(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6075d = obj;
            this.f6077f |= Integer.MIN_VALUE;
            return C1989j.this.m7066u(null, this);
        }
    }

    /* renamed from: Q.j$h */
    public static final class h extends AbstractC0060d {

        /* renamed from: a */
        public Object f6078a;

        /* renamed from: b */
        public Object f6079b;

        /* renamed from: c */
        public /* synthetic */ Object f6080c;

        /* renamed from: e */
        public int f6082e;

        public h(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6080c = obj;
            this.f6082e |= Integer.MIN_VALUE;
            return C1989j.this.m7067v(this);
        }
    }

    /* renamed from: Q.j$i */
    public static final class i extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f6083a;

        /* renamed from: Q.j$i$a */
        public static final class a implements InterfaceC2632e {

            /* renamed from: a */
            public final /* synthetic */ C1989j f6085a;

            public a(C1989j c1989j) {
                this.f6085a = c1989j;
            }

            @Override // p153V5.InterfaceC2632e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2989e(C6934q c6934q, InterfaceC7157e interfaceC7157e) {
                if (this.f6085a.f6014h.m7100a() instanceof C1991l) {
                    return C6934q.f24811a;
                }
                Object m7069x = this.f6085a.m7069x(true, interfaceC7157e);
                return m7069x == AbstractC0024c.m76e() ? m7069x : C6934q.f24811a;
            }
        }

        public i(InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((i) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C1989j.this.new i(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f6083a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                b bVar = C1989j.this.f6015i;
                this.f6083a = 1;
                if (bVar.m7116a(this) == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                    return C6934q.f24811a;
                }
                AbstractC6928k.m28382b(obj);
            }
            InterfaceC2631d m9055d = AbstractC2633f.m9055d(C1989j.this.m7064s().mo7106c());
            a aVar = new a(C1989j.this);
            this.f6083a = 2;
            if (m9055d.mo7083a(aVar, this) == m76e) {
                return m76e;
            }
            return C6934q.f24811a;
        }
    }

    /* renamed from: Q.j$j */
    public static final class j extends AbstractC0060d {

        /* renamed from: a */
        public Object f6086a;

        /* renamed from: b */
        public int f6087b;

        /* renamed from: c */
        public /* synthetic */ Object f6088c;

        /* renamed from: e */
        public int f6090e;

        public j(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6088c = obj;
            this.f6090e |= Integer.MIN_VALUE;
            return C1989j.this.m7068w(this);
        }
    }

    /* renamed from: Q.j$k */
    public static final class k extends AbstractC0060d {

        /* renamed from: a */
        public Object f6091a;

        /* renamed from: b */
        public Object f6092b;

        /* renamed from: c */
        public boolean f6093c;

        /* renamed from: d */
        public /* synthetic */ Object f6094d;

        /* renamed from: f */
        public int f6096f;

        public k(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6094d = obj;
            this.f6096f |= Integer.MIN_VALUE;
            return C1989j.this.m7069x(false, this);
        }
    }

    /* renamed from: Q.j$l */
    public static final class l extends AbstractC0068l implements InterfaceC0800l {

        /* renamed from: a */
        public Object f6097a;

        /* renamed from: b */
        public int f6098b;

        public l(InterfaceC7157e interfaceC7157e) {
            super(1, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7157e interfaceC7157e) {
            return ((l) create(interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(InterfaceC7157e interfaceC7157e) {
            return C1989j.this.new l(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            AbstractC2001v abstractC2001v;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f6098b;
            try {
            } catch (Throwable th2) {
                InterfaceC1993n m7064s = C1989j.this.m7064s();
                this.f6097a = th2;
                this.f6098b = 2;
                Object mo7105b = m7064s.mo7105b(this);
                if (mo7105b == m76e) {
                    return m76e;
                }
                th = th2;
                obj = mo7105b;
            }
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                C1989j c1989j = C1989j.this;
                this.f6098b = 1;
                obj = c1989j.m7071z(true, this);
                if (obj == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.f6097a;
                    AbstractC6928k.m28382b(obj);
                    abstractC2001v = new C1996q(th, ((Number) obj).intValue());
                    return AbstractC6930m.m28383a(abstractC2001v, AbstractC0058b.m149a(true));
                }
                AbstractC6928k.m28382b(obj);
            }
            abstractC2001v = (AbstractC2001v) obj;
            return AbstractC6930m.m28383a(abstractC2001v, AbstractC0058b.m149a(true));
        }
    }

    /* renamed from: Q.j$m */
    public static final class m extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f6100a;

        /* renamed from: b */
        public int f6101b;

        /* renamed from: c */
        public /* synthetic */ boolean f6102c;

        /* renamed from: e */
        public final /* synthetic */ int f6104e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i7, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f6104e = i7;
        }

        /* renamed from: a */
        public final Object m7088a(boolean z6, InterfaceC7157e interfaceC7157e) {
            return ((m) create(Boolean.valueOf(z6), interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            m mVar = C1989j.this.new m(this.f6104e, interfaceC7157e);
            mVar.f6102c = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m7088a(((Boolean) obj).booleanValue(), (InterfaceC7157e) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i7;
            boolean z6;
            AbstractC2001v abstractC2001v;
            boolean z7;
            Object m76e = AbstractC0024c.m76e();
            boolean z8 = this.f6101b;
            try {
            } catch (Throwable th2) {
                if (z8 != 0) {
                    InterfaceC1993n m7064s = C1989j.this.m7064s();
                    this.f6100a = th2;
                    this.f6102c = z8;
                    this.f6101b = 2;
                    Object mo7105b = m7064s.mo7105b(this);
                    if (mo7105b == m76e) {
                        return m76e;
                    }
                    z6 = z8;
                    th = th2;
                    obj = mo7105b;
                } else {
                    boolean z9 = z8;
                    th = th2;
                    i7 = this.f6104e;
                    z6 = z9;
                }
            }
            if (z8 == 0) {
                AbstractC6928k.m28382b(obj);
                boolean z10 = this.f6102c;
                C1989j c1989j = C1989j.this;
                this.f6102c = z10;
                this.f6101b = 1;
                obj = c1989j.m7071z(z10, this);
                z8 = z10;
                if (obj == m76e) {
                    return m76e;
                }
            } else {
                if (z8 != 1) {
                    if (z8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z6 = this.f6102c;
                    th = (Throwable) this.f6100a;
                    AbstractC6928k.m28382b(obj);
                    i7 = ((Number) obj).intValue();
                    C1996q c1996q = new C1996q(th, i7);
                    z7 = z6;
                    abstractC2001v = c1996q;
                    return AbstractC6930m.m28383a(abstractC2001v, AbstractC0058b.m149a(z7));
                }
                boolean z11 = this.f6102c;
                AbstractC6928k.m28382b(obj);
                z8 = z11;
            }
            abstractC2001v = (AbstractC2001v) obj;
            z7 = z8;
            return AbstractC6930m.m28383a(abstractC2001v, AbstractC0058b.m149a(z7));
        }
    }

    /* renamed from: Q.j$n */
    public static final class n extends AbstractC0060d {

        /* renamed from: a */
        public Object f6105a;

        /* renamed from: b */
        public Object f6106b;

        /* renamed from: c */
        public Object f6107c;

        /* renamed from: d */
        public Object f6108d;

        /* renamed from: e */
        public boolean f6109e;

        /* renamed from: f */
        public int f6110f;

        /* renamed from: n */
        public /* synthetic */ Object f6111n;

        /* renamed from: p */
        public int f6113p;

        public n(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6111n = obj;
            this.f6113p |= Integer.MIN_VALUE;
            return C1989j.this.m7071z(false, this);
        }
    }

    /* renamed from: Q.j$o */
    public static final class o extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f6114a;

        /* renamed from: b */
        public int f6115b;

        /* renamed from: c */
        public /* synthetic */ boolean f6116c;

        /* renamed from: e */
        public final /* synthetic */ int f6118e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i7, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f6118e = i7;
        }

        /* renamed from: a */
        public final Object m7089a(boolean z6, InterfaceC7157e interfaceC7157e) {
            return ((o) create(Boolean.valueOf(z6), interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            o oVar = C1989j.this.new o(this.f6118e, interfaceC7157e);
            oVar.f6116c = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m7089a(((Boolean) obj).booleanValue(), (InterfaceC7157e) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
        @Override // p013B5.AbstractC0057a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p006A5.AbstractC0024c.m76e()
                int r1 = r5.f6115b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f6114a
                p371w5.AbstractC6928k.m28382b(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.f6116c
                p371w5.AbstractC6928k.m28382b(r6)
                goto L34
            L22:
                p371w5.AbstractC6928k.m28382b(r6)
                boolean r1 = r5.f6116c
                Q.j r6 = p112Q.C1989j.this
                r5.f6116c = r1
                r5.f6115b = r3
                java.lang.Object r6 = p112Q.C1989j.m7056n(r6, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                if (r1 == 0) goto L50
                Q.j r1 = p112Q.C1989j.this
                Q.n r1 = p112Q.C1989j.m7046d(r1)
                r5.f6114a = r6
                r5.f6115b = r2
                java.lang.Object r1 = r1.mo7105b(r5)
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.f6118e
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                Q.e r1 = new Q.e
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: Q.j$p */
    public static final class p extends AbstractC0068l implements InterfaceC0800l {

        /* renamed from: a */
        public Object f6119a;

        /* renamed from: b */
        public int f6120b;

        /* renamed from: c */
        public final /* synthetic */ C5480w f6121c;

        /* renamed from: d */
        public final /* synthetic */ C1989j f6122d;

        /* renamed from: e */
        public final /* synthetic */ C5478u f6123e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C5480w c5480w, C1989j c1989j, C5478u c5478u, InterfaceC7157e interfaceC7157e) {
            super(1, interfaceC7157e);
            this.f6121c = c5480w;
            this.f6122d = c1989j;
            this.f6123e = c5478u;
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7157e interfaceC7157e) {
            return ((p) create(interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(InterfaceC7157e interfaceC7157e) {
            return new p(this.f6121c, this.f6122d, this.f6123e, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            C5478u c5478u;
            C5480w c5480w;
            C5478u c5478u2;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f6120b;
            try {
            } catch (C1982c unused) {
                C5478u c5478u3 = this.f6123e;
                C1989j c1989j = this.f6122d;
                Object obj2 = this.f6121c.f19710a;
                this.f6119a = c5478u3;
                this.f6120b = 3;
                Object m7061C = c1989j.m7061C(obj2, true, this);
                if (m7061C == m76e) {
                    return m76e;
                }
                c5478u = c5478u3;
                obj = m7061C;
            }
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                c5480w = this.f6121c;
                C1989j c1989j2 = this.f6122d;
                this.f6119a = c5480w;
                this.f6120b = 1;
                obj = c1989j2.m7070y(this);
                if (obj == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    if (i7 == 2) {
                        c5478u2 = (C5478u) this.f6119a;
                        AbstractC6928k.m28382b(obj);
                        c5478u2.f19708a = ((Number) obj).intValue();
                        return C6934q.f24811a;
                    }
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5478u = (C5478u) this.f6119a;
                    AbstractC6928k.m28382b(obj);
                    c5478u.f19708a = ((Number) obj).intValue();
                    return C6934q.f24811a;
                }
                c5480w = (C5480w) this.f6119a;
                AbstractC6928k.m28382b(obj);
            }
            c5480w.f19710a = obj;
            c5478u2 = this.f6123e;
            InterfaceC1993n m7064s = this.f6122d.m7064s();
            this.f6119a = c5478u2;
            this.f6120b = 2;
            obj = m7064s.mo7105b(this);
            if (obj == m76e) {
                return m76e;
            }
            c5478u2.f19708a = ((Number) obj).intValue();
            return C6934q.f24811a;
        }
    }

    /* renamed from: Q.j$q */
    public static final class q extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f6124a;

        /* renamed from: c */
        public final /* synthetic */ boolean f6126c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z6, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f6126c = z6;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((q) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C1989j.this.new q(this.f6126c, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f6124a;
            try {
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    if (C1989j.this.f6014h.m7100a() instanceof C1991l) {
                        return C1989j.this.f6014h.m7100a();
                    }
                    C1989j c1989j = C1989j.this;
                    this.f6124a = 1;
                    if (c1989j.m7068w(this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC6928k.m28382b(obj);
                        return (AbstractC2001v) obj;
                    }
                    AbstractC6928k.m28382b(obj);
                }
                C1989j c1989j2 = C1989j.this;
                boolean z6 = this.f6126c;
                this.f6124a = 2;
                obj = c1989j2.m7069x(z6, this);
                if (obj == m76e) {
                    return m76e;
                }
                return (AbstractC2001v) obj;
            } catch (Throwable th) {
                return new C1996q(th, -1);
            }
        }
    }

    /* renamed from: Q.j$r */
    public static final class r extends AbstractC5470m implements InterfaceC0789a {
        public r() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2003x invoke() {
            return C1989j.this.f6007a.mo7127a();
        }
    }

    /* renamed from: Q.j$s */
    public static final class s extends AbstractC0068l implements InterfaceC0800l {

        /* renamed from: a */
        public Object f6128a;

        /* renamed from: b */
        public int f6129b;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC7161i f6131d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC0804p f6132e;

        /* renamed from: Q.j$s$a */
        public static final class a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f6133a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC0804p f6134b;

            /* renamed from: c */
            public final /* synthetic */ C1984e f6135c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC0804p interfaceC0804p, C1984e c1984e, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f6134b = interfaceC0804p;
                this.f6135c = c1984e;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((a) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return new a(this.f6134b, this.f6135c, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f6133a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    InterfaceC0804p interfaceC0804p = this.f6134b;
                    Object m7035c = this.f6135c.m7035c();
                    this.f6133a = 1;
                    obj = interfaceC0804p.invoke(m7035c, this);
                    if (obj == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC7161i interfaceC7161i, InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
            super(1, interfaceC7157e);
            this.f6131d = interfaceC7161i;
            this.f6132e = interfaceC0804p;
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7157e interfaceC7157e) {
            return ((s) create(interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(InterfaceC7157e interfaceC7157e) {
            return C1989j.this.new s(this.f6131d, this.f6132e, interfaceC7157e);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // p013B5.AbstractC0057a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p006A5.AbstractC0024c.m76e()
                int r1 = r8.f6129b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f6128a
                p371w5.AbstractC6928k.m28382b(r9)
                goto L6c
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f6128a
                Q.e r1 = (p112Q.C1984e) r1
                p371w5.AbstractC6928k.m28382b(r9)
                goto L51
            L27:
                p371w5.AbstractC6928k.m28382b(r9)
                goto L39
            L2b:
                p371w5.AbstractC6928k.m28382b(r9)
                Q.j r9 = p112Q.C1989j.this
                r8.f6129b = r4
                java.lang.Object r9 = p112Q.C1989j.m7057o(r9, r4, r8)
                if (r9 != r0) goto L39
                return r0
            L39:
                r1 = r9
                Q.e r1 = (p112Q.C1984e) r1
                z5.i r9 = r8.f6131d
                Q.j$s$a r5 = new Q.j$s$a
                J5.p r6 = r8.f6132e
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f6128a = r1
                r8.f6129b = r3
                java.lang.Object r9 = p132S5.AbstractC2384i.m8118g(r9, r5, r8)
                if (r9 != r0) goto L51
                return r0
            L51:
                r1.m7034b()
                java.lang.Object r1 = r1.m7035c()
                boolean r1 = kotlin.jvm.internal.AbstractC5469l.m23024a(r1, r9)
                if (r1 != 0) goto L6d
                Q.j r1 = p112Q.C1989j.this
                r8.f6128a = r9
                r8.f6129b = r2
                java.lang.Object r1 = r1.m7061C(r9, r4, r8)
                if (r1 != r0) goto L6b
                return r0
            L6b:
                r0 = r9
            L6c:
                r9 = r0
            L6d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: Q.j$t */
    public static final class t extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f6136a;

        /* renamed from: b */
        public /* synthetic */ Object f6137b;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC0804p f6139d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f6139d = interfaceC0804p;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((t) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            t tVar = C1989j.this.new t(this.f6139d, interfaceC7157e);
            tVar.f6137b = obj;
            return tVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f6136a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                InterfaceC2334J interfaceC2334J = (InterfaceC2334J) this.f6137b;
                InterfaceC2412w m8190b = AbstractC2416y.m8190b(null, 1, null);
                C1989j.this.f6018l.m7122e(new AbstractC1995p.a(this.f6139d, m8190b, C1989j.this.f6014h.m7100a(), interfaceC2334J.mo7995l()));
                this.f6136a = 1;
                obj = m8190b.await(this);
                if (obj == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return obj;
        }
    }

    /* renamed from: Q.j$u */
    public static final class u extends AbstractC5470m implements InterfaceC0800l {
        public u() {
            super(1);
        }

        /* renamed from: a */
        public final void m7096a(Throwable th) {
            if (th != null) {
                C1989j.this.f6014h.m7102c(new C1991l(th));
            }
            if (C1989j.this.f6016j.mo28366d()) {
                C1989j.this.m7065t().close();
            }
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7096a((Throwable) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: Q.j$v */
    public static final class v extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public static final v f6141a = new v();

        public v() {
            super(2);
        }

        /* renamed from: a */
        public final void m7097a(AbstractC1995p.a msg, Throwable th) {
            AbstractC5469l.m23028e(msg, "msg");
            InterfaceC2412w m7110a = msg.m7110a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            m7110a.mo8186r(th);
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7097a((AbstractC1995p.a) obj, (Throwable) obj2);
            return C6934q.f24811a;
        }
    }

    /* renamed from: Q.j$w */
    public static final class w extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f6142a;

        /* renamed from: b */
        public /* synthetic */ Object f6143b;

        public w(InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC1995p.a aVar, InterfaceC7157e interfaceC7157e) {
            return ((w) create(aVar, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            w wVar = C1989j.this.new w(interfaceC7157e);
            wVar.f6143b = obj;
            return wVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f6142a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC1995p.a aVar = (AbstractC1995p.a) this.f6143b;
                C1989j c1989j = C1989j.this;
                this.f6142a = 1;
                if (c1989j.m7066u(aVar, this) == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return C6934q.f24811a;
        }
    }

    /* renamed from: Q.j$x */
    public static final class x extends AbstractC0060d {

        /* renamed from: a */
        public Object f6145a;

        /* renamed from: b */
        public /* synthetic */ Object f6146b;

        /* renamed from: d */
        public int f6148d;

        public x(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6146b = obj;
            this.f6148d |= Integer.MIN_VALUE;
            return C1989j.this.m7061C(null, false, this);
        }
    }

    /* renamed from: Q.j$y */
    public static final class y extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f6149a;

        /* renamed from: b */
        public int f6150b;

        /* renamed from: c */
        public /* synthetic */ Object f6151c;

        /* renamed from: d */
        public final /* synthetic */ C5478u f6152d;

        /* renamed from: e */
        public final /* synthetic */ C1989j f6153e;

        /* renamed from: f */
        public final /* synthetic */ Object f6154f;

        /* renamed from: n */
        public final /* synthetic */ boolean f6155n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(C5478u c5478u, C1989j c1989j, Object obj, boolean z6, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f6152d = c5478u;
            this.f6153e = c1989j;
            this.f6154f = obj;
            this.f6155n = z6;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1979B interfaceC1979B, InterfaceC7157e interfaceC7157e) {
            return ((y) create(interfaceC1979B, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            y yVar = new y(this.f6152d, this.f6153e, this.f6154f, this.f6155n, interfaceC7157e);
            yVar.f6151c = obj;
            return yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
        @Override // p013B5.AbstractC0057a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p006A5.AbstractC0024c.m76e()
                int r1 = r6.f6150b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p371w5.AbstractC6928k.m28382b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f6149a
                kotlin.jvm.internal.u r1 = (kotlin.jvm.internal.C5478u) r1
                java.lang.Object r3 = r6.f6151c
                Q.B r3 = (p112Q.InterfaceC1979B) r3
                p371w5.AbstractC6928k.m28382b(r7)
                goto L45
            L26:
                p371w5.AbstractC6928k.m28382b(r7)
                java.lang.Object r7 = r6.f6151c
                Q.B r7 = (p112Q.InterfaceC1979B) r7
                kotlin.jvm.internal.u r1 = r6.f6152d
                Q.j r4 = r6.f6153e
                Q.n r4 = p112Q.C1989j.m7046d(r4)
                r6.f6151c = r7
                r6.f6149a = r1
                r6.f6150b = r3
                java.lang.Object r3 = r4.mo7104a(r6)
                if (r3 != r0) goto L42
                return r0
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f19708a = r7
                java.lang.Object r7 = r6.f6154f
                r1 = 0
                r6.f6151c = r1
                r6.f6149a = r1
                r6.f6150b = r2
                java.lang.Object r7 = r3.mo7028d(r7, r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                boolean r7 = r6.f6155n
                if (r7 == 0) goto L7d
                Q.j r7 = r6.f6153e
                Q.k r7 = p112Q.C1989j.m7047e(r7)
                Q.e r0 = new Q.e
                java.lang.Object r1 = r6.f6154f
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.u r3 = r6.f6152d
                int r3 = r3.f19708a
                r0.<init>(r1, r2, r3)
                r7.m7102c(r0)
            L7d:
                w5.q r7 = p371w5.C6934q.f24811a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C1989j(InterfaceC2002w storage, List initTasksList, InterfaceC1983d corruptionHandler, InterfaceC2334J scope) {
        AbstractC5469l.m23028e(storage, "storage");
        AbstractC5469l.m23028e(initTasksList, "initTasksList");
        AbstractC5469l.m23028e(corruptionHandler, "corruptionHandler");
        AbstractC5469l.m23028e(scope, "scope");
        this.f6007a = storage;
        this.f6008b = corruptionHandler;
        this.f6009c = scope;
        this.f6010d = AbstractC2633f.m9061j(new d(null));
        this.f6011e = AbstractC3558c.m14354b(false, 1, null);
        this.f6014h = new C1990k();
        this.f6015i = new b(this, initTasksList);
        this.f6016j = AbstractC6924g.m28367a(new r());
        this.f6017k = AbstractC6924g.m28367a(new c());
        this.f6018l = new C1999t(scope, new u(), v.f6141a, new w(null));
    }

    /* renamed from: A */
    public final Object m7059A(boolean z6, InterfaceC7157e interfaceC7157e) {
        return AbstractC2384i.m8118g(this.f6009c.mo7995l(), new q(z6, null), interfaceC7157e);
    }

    /* renamed from: B */
    public final Object m7060B(InterfaceC0804p interfaceC0804p, InterfaceC7161i interfaceC7161i, InterfaceC7157e interfaceC7157e) {
        return m7064s().mo7107d(new s(interfaceC7161i, interfaceC0804p, null), interfaceC7157e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7061C(java.lang.Object r12, boolean r13, p392z5.InterfaceC7157e r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p112Q.C1989j.x
            if (r0 == 0) goto L13
            r0 = r14
            Q.j$x r0 = (p112Q.C1989j.x) r0
            int r1 = r0.f6148d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6148d = r1
            goto L18
        L13:
            Q.j$x r0 = new Q.j$x
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f6146b
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6148d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.f6145a
            kotlin.jvm.internal.u r12 = (kotlin.jvm.internal.C5478u) r12
            p371w5.AbstractC6928k.m28382b(r14)
            goto L58
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            p371w5.AbstractC6928k.m28382b(r14)
            kotlin.jvm.internal.u r14 = new kotlin.jvm.internal.u
            r14.<init>()
            Q.x r2 = r11.m7065t()
            Q.j$y r10 = new Q.j$y
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f6145a = r14
            r0.f6148d = r3
            java.lang.Object r12 = r2.mo7130e(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f19708a
            java.lang.Integer r12 = p013B5.AbstractC0058b.m151c(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.m7061C(java.lang.Object, boolean, z5.e):java.lang.Object");
    }

    @Override // p112Q.InterfaceC1987h
    /* renamed from: a */
    public InterfaceC2631d mo7042a() {
        return this.f6010d;
    }

    @Override // p112Q.InterfaceC1987h
    /* renamed from: b */
    public Object mo7043b(InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
        C1978A c1978a = (C1978A) interfaceC7157e.getContext().get(C1978A.a.C7178a.f5984a);
        if (c1978a != null) {
            c1978a.m7027b(this);
        }
        return AbstractC2384i.m8118g(new C1978A(c1978a, this), new t(interfaceC0804p, null), interfaceC7157e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x004e, B:13:0x0056, B:15:0x005a, B:16:0x0060, B:17:0x0062), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7062q(p392z5.InterfaceC7157e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p112Q.C1989j.e
            if (r0 == 0) goto L13
            r0 = r6
            Q.j$e r0 = (p112Q.C1989j.e) r0
            int r1 = r0.f6069e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6069e = r1
            goto L18
        L13:
            Q.j$e r0 = new Q.j$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6067c
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6069e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f6066b
            b6.a r1 = (p198b6.InterfaceC3556a) r1
            java.lang.Object r0 = r0.f6065a
            Q.j r0 = (p112Q.C1989j) r0
            p371w5.AbstractC6928k.m28382b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            p371w5.AbstractC6928k.m28382b(r6)
            b6.a r6 = r5.f6011e
            r0.f6065a = r5
            r0.f6066b = r6
            r0.f6069e = r3
            java.lang.Object r0 = r6.mo14334a(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.f6012f     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.f6012f = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            S5.u0 r6 = r0.f6013g     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            p132S5.InterfaceC2409u0.a.m8180b(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.f6013g = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            w5.q r6 = p371w5.C6934q.f24811a     // Catch: java.lang.Throwable -> L5e
            r1.mo14336c(r4)
            w5.q r6 = p371w5.C6934q.f24811a
            return r6
        L6a:
            r1.mo14336c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.m7062q(z5.e):java.lang.Object");
    }

    /* renamed from: r */
    public final Object m7063r(boolean z6, InterfaceC0800l interfaceC0800l, InterfaceC7157e interfaceC7157e) {
        return z6 ? interfaceC0800l.invoke(interfaceC7157e) : m7064s().mo7107d(new f(interfaceC0800l, null), interfaceC7157e);
    }

    /* renamed from: s */
    public final InterfaceC1993n m7064s() {
        return (InterfaceC1993n) this.f6017k.getValue();
    }

    /* renamed from: t */
    public final InterfaceC2003x m7065t() {
        return (InterfaceC2003x) this.f6016j.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v21, types: [S5.w] */
    /* JADX WARN: Type inference failed for: r9v28, types: [S5.w] */
    /* JADX WARN: Type inference failed for: r9v3, types: [S5.w] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7066u(p112Q.AbstractC1995p.a r9, p392z5.InterfaceC7157e r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.m7066u(Q.p$a, z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x004e, B:13:0x0055, B:14:0x0069), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7067v(p392z5.InterfaceC7157e r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof p112Q.C1989j.h
            if (r0 == 0) goto L13
            r0 = r12
            Q.j$h r0 = (p112Q.C1989j.h) r0
            int r1 = r0.f6082e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6082e = r1
            goto L18
        L13:
            Q.j$h r0 = new Q.j$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f6080c
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6082e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f6079b
            b6.a r1 = (p198b6.InterfaceC3556a) r1
            java.lang.Object r0 = r0.f6078a
            Q.j r0 = (p112Q.C1989j) r0
            p371w5.AbstractC6928k.m28382b(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            p371w5.AbstractC6928k.m28382b(r12)
            b6.a r12 = r11.f6011e
            r0.f6078a = r11
            r0.f6079b = r12
            r0.f6082e = r3
            java.lang.Object r0 = r12.mo14334a(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.f6012f     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.f6012f = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L69
            S5.J r5 = r0.f6009c     // Catch: java.lang.Throwable -> L67
            Q.j$i r8 = new Q.j$i     // Catch: java.lang.Throwable -> L67
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            S5.u0 r12 = p132S5.AbstractC2384i.m8115d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.f6013g = r12     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r12 = move-exception
            goto L71
        L69:
            w5.q r12 = p371w5.C6934q.f24811a     // Catch: java.lang.Throwable -> L67
            r1.mo14336c(r4)
            w5.q r12 = p371w5.C6934q.f24811a
            return r12
        L71:
            r1.mo14336c(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.m7067v(z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7068w(p392z5.InterfaceC7157e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p112Q.C1989j.j
            if (r0 == 0) goto L13
            r0 = r6
            Q.j$j r0 = (p112Q.C1989j.j) r0
            int r1 = r0.f6090e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6090e = r1
            goto L18
        L13:
            Q.j$j r0 = new Q.j$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6088c
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6090e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f6087b
            java.lang.Object r0 = r0.f6086a
            Q.j r0 = (p112Q.C1989j) r0
            p371w5.AbstractC6928k.m28382b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f6086a
            Q.j r2 = (p112Q.C1989j) r2
            p371w5.AbstractC6928k.m28382b(r6)
            goto L57
        L44:
            p371w5.AbstractC6928k.m28382b(r6)
            Q.n r6 = r5.m7064s()
            r0.f6086a = r5
            r0.f6090e = r4
            java.lang.Object r6 = r6.mo7105b(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            Q.j$b r4 = r2.f6015i     // Catch: java.lang.Throwable -> L6f
            r0.f6086a = r2     // Catch: java.lang.Throwable -> L6f
            r0.f6087b = r6     // Catch: java.lang.Throwable -> L6f
            r0.f6090e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.m7117c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
            return r1
        L6c:
            w5.q r6 = p371w5.C6934q.f24811a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            Q.k r0 = r0.f6014h
            Q.q r2 = new Q.q
            r2.<init>(r6, r1)
            r0.m7102c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.m7068w(z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7069x(boolean r10, p392z5.InterfaceC7157e r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.m7069x(boolean, z5.e):java.lang.Object");
    }

    /* renamed from: y */
    public final Object m7070y(InterfaceC7157e interfaceC7157e) {
        return AbstractC2004y.m7131a(m7065t(), interfaceC7157e);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|85|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0067, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0068, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7071z(boolean r11, p392z5.InterfaceC7157e r12) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C1989j.m7071z(boolean, z5.e):java.lang.Object");
    }
}
