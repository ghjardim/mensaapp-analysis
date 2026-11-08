package p180Z4;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.C5480w;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0058b;
import p013B5.AbstractC0060d;
import p013B5.AbstractC0068l;
import p026D4.InterfaceC0191a;
import p061I4.InterfaceC0651c;
import p069J5.InterfaceC0804p;
import p112Q.InterfaceC1987h;
import p125R5.AbstractC2291q;
import p132S5.AbstractC2386j;
import p132S5.InterfaceC2334J;
import p140U.AbstractC2494f;
import p140U.AbstractC2496h;
import p140U.AbstractC2497i;
import p140U.C2491c;
import p153V5.AbstractC2633f;
import p153V5.InterfaceC2631d;
import p153V5.InterfaceC2632e;
import p180Z4.InterfaceC3044F;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p378x5.AbstractC7032w;
import p392z5.InterfaceC7157e;

/* renamed from: Z4.K */
/* loaded from: classes2.dex */
public final class C3049K implements InterfaceC0191a, InterfaceC3044F {

    /* renamed from: c */
    public Context f9356c;

    /* renamed from: d */
    public C3045G f9357d;

    /* renamed from: e */
    public InterfaceC3046H f9358e = new C3055b();

    /* renamed from: Z4.K$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9359a;

        /* renamed from: c */
        public final /* synthetic */ List f9361c;

        /* renamed from: Z4.K$a$a, reason: collision with other inner class name */
        public static final class C7197a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f9362a;

            /* renamed from: b */
            public /* synthetic */ Object f9363b;

            /* renamed from: c */
            public final /* synthetic */ List f9364c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7197a(List list, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f9364c = list;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C2491c c2491c, InterfaceC7157e interfaceC7157e) {
                return ((C7197a) create(c2491c, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                C7197a c7197a = new C7197a(this.f9364c, interfaceC7157e);
                c7197a.f9363b = obj;
                return c7197a;
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                AbstractC0024c.m76e();
                if (this.f9362a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
                C2491c c2491c = (C2491c) this.f9363b;
                List list = this.f9364c;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c2491c.m8429i(AbstractC2496h.m8442a((String) it.next()));
                    }
                } else {
                    c2491c.m8426f();
                }
                return C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9361c = list;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((a) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C3049K.this.new a(this.f9361c, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1987h m11205b;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9359a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                Context context = C3049K.this.f9356c;
                if (context == null) {
                    AbstractC5469l.m23037n("context");
                    context = null;
                }
                m11205b = AbstractC3050L.m11205b(context);
                C7197a c7197a = new C7197a(this.f9361c, null);
                this.f9359a = 1;
                obj = AbstractC2497i.m8450a(m11205b, c7197a, this);
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

    /* renamed from: Z4.K$b */
    public static final class b extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9365a;

        /* renamed from: b */
        public /* synthetic */ Object f9366b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC2494f.a f9367c;

        /* renamed from: d */
        public final /* synthetic */ String f9368d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC2494f.a aVar, String str, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9367c = aVar;
            this.f9368d = str;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C2491c c2491c, InterfaceC7157e interfaceC7157e) {
            return ((b) create(c2491c, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            b bVar = new b(this.f9367c, this.f9368d, interfaceC7157e);
            bVar.f9366b = obj;
            return bVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            AbstractC0024c.m76e();
            if (this.f9365a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6928k.m28382b(obj);
            ((C2491c) this.f9366b).m8430j(this.f9367c, this.f9368d);
            return C6934q.f24811a;
        }
    }

    /* renamed from: Z4.K$c */
    public static final class c extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9369a;

        /* renamed from: c */
        public final /* synthetic */ List f9371c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9371c = list;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((c) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C3049K.this.new c(this.f9371c, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9369a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                C3049K c3049k = C3049K.this;
                List list = this.f9371c;
                this.f9369a = 1;
                obj = c3049k.m11183u(list, this);
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

    /* renamed from: Z4.K$d */
    public static final class d extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f9372a;

        /* renamed from: b */
        public int f9373b;

        /* renamed from: c */
        public final /* synthetic */ String f9374c;

        /* renamed from: d */
        public final /* synthetic */ C3049K f9375d;

        /* renamed from: e */
        public final /* synthetic */ C5480w f9376e;

        /* renamed from: Z4.K$d$a */
        public static final class a implements InterfaceC2631d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2631d f9377a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC2494f.a f9378b;

            /* renamed from: Z4.K$d$a$a, reason: collision with other inner class name */
            public static final class C7198a implements InterfaceC2632e {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC2632e f9379a;

                /* renamed from: b */
                public final /* synthetic */ AbstractC2494f.a f9380b;

                /* renamed from: Z4.K$d$a$a$a, reason: collision with other inner class name */
                public static final class C7199a extends AbstractC0060d {

                    /* renamed from: a */
                    public /* synthetic */ Object f9381a;

                    /* renamed from: b */
                    public int f9382b;

                    public C7199a(InterfaceC7157e interfaceC7157e) {
                        super(interfaceC7157e);
                    }

                    @Override // p013B5.AbstractC0057a
                    public final Object invokeSuspend(Object obj) {
                        this.f9381a = obj;
                        this.f9382b |= Integer.MIN_VALUE;
                        return C7198a.this.mo2989e(null, this);
                    }
                }

                public C7198a(InterfaceC2632e interfaceC2632e, AbstractC2494f.a aVar) {
                    this.f9379a = interfaceC2632e;
                    this.f9380b = aVar;
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
                        boolean r0 = r6 instanceof p180Z4.C3049K.d.a.C7198a.C7199a
                        if (r0 == 0) goto L13
                        r0 = r6
                        Z4.K$d$a$a$a r0 = (p180Z4.C3049K.d.a.C7198a.C7199a) r0
                        int r1 = r0.f9382b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f9382b = r1
                        goto L18
                    L13:
                        Z4.K$d$a$a$a r0 = new Z4.K$d$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f9381a
                        java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                        int r2 = r0.f9382b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p371w5.AbstractC6928k.m28382b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p371w5.AbstractC6928k.m28382b(r6)
                        V5.e r6 = r4.f9379a
                        U.f r5 = (p140U.AbstractC2494f) r5
                        U.f$a r2 = r4.f9380b
                        java.lang.Object r5 = r5.mo8424b(r2)
                        r0.f9382b = r3
                        java.lang.Object r5 = r6.mo2989e(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        w5.q r5 = p371w5.C6934q.f24811a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p180Z4.C3049K.d.a.C7198a.mo2989e(java.lang.Object, z5.e):java.lang.Object");
                }
            }

            public a(InterfaceC2631d interfaceC2631d, AbstractC2494f.a aVar) {
                this.f9377a = interfaceC2631d;
                this.f9378b = aVar;
            }

            @Override // p153V5.InterfaceC2631d
            /* renamed from: a */
            public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
                Object mo7083a = this.f9377a.mo7083a(new C7198a(interfaceC2632e, this.f9378b), interfaceC7157e);
                return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C3049K c3049k, C5480w c5480w, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9374c = str;
            this.f9375d = c3049k;
            this.f9376e = c5480w;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((d) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new d(this.f9374c, this.f9375d, this.f9376e, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1987h m11205b;
            C5480w c5480w;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9373b;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC2494f.a m8442a = AbstractC2496h.m8442a(this.f9374c);
                Context context = this.f9375d.f9356c;
                if (context == null) {
                    AbstractC5469l.m23037n("context");
                    context = null;
                }
                m11205b = AbstractC3050L.m11205b(context);
                a aVar = new a(m11205b.mo7042a(), m8442a);
                C5480w c5480w2 = this.f9376e;
                this.f9372a = c5480w2;
                this.f9373b = 1;
                Object m9060i = AbstractC2633f.m9060i(aVar, this);
                if (m9060i == m76e) {
                    return m76e;
                }
                c5480w = c5480w2;
                obj = m9060i;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5480w = (C5480w) this.f9372a;
                AbstractC6928k.m28382b(obj);
            }
            c5480w.f19710a = obj;
            return C6934q.f24811a;
        }
    }

    /* renamed from: Z4.K$e */
    public static final class e extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f9384a;

        /* renamed from: b */
        public int f9385b;

        /* renamed from: c */
        public final /* synthetic */ String f9386c;

        /* renamed from: d */
        public final /* synthetic */ C3049K f9387d;

        /* renamed from: e */
        public final /* synthetic */ C5480w f9388e;

        /* renamed from: Z4.K$e$a */
        public static final class a implements InterfaceC2631d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2631d f9389a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC2494f.a f9390b;

            /* renamed from: c */
            public final /* synthetic */ C3049K f9391c;

            /* renamed from: Z4.K$e$a$a, reason: collision with other inner class name */
            public static final class C7200a implements InterfaceC2632e {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC2632e f9392a;

                /* renamed from: b */
                public final /* synthetic */ AbstractC2494f.a f9393b;

                /* renamed from: c */
                public final /* synthetic */ C3049K f9394c;

                /* renamed from: Z4.K$e$a$a$a, reason: collision with other inner class name */
                public static final class C7201a extends AbstractC0060d {

                    /* renamed from: a */
                    public /* synthetic */ Object f9395a;

                    /* renamed from: b */
                    public int f9396b;

                    public C7201a(InterfaceC7157e interfaceC7157e) {
                        super(interfaceC7157e);
                    }

                    @Override // p013B5.AbstractC0057a
                    public final Object invokeSuspend(Object obj) {
                        this.f9395a = obj;
                        this.f9396b |= Integer.MIN_VALUE;
                        return C7200a.this.mo2989e(null, this);
                    }
                }

                public C7200a(InterfaceC2632e interfaceC2632e, AbstractC2494f.a aVar, C3049K c3049k) {
                    this.f9392a = interfaceC2632e;
                    this.f9393b = aVar;
                    this.f9394c = c3049k;
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
                        boolean r0 = r6 instanceof p180Z4.C3049K.e.a.C7200a.C7201a
                        if (r0 == 0) goto L13
                        r0 = r6
                        Z4.K$e$a$a$a r0 = (p180Z4.C3049K.e.a.C7200a.C7201a) r0
                        int r1 = r0.f9396b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f9396b = r1
                        goto L18
                    L13:
                        Z4.K$e$a$a$a r0 = new Z4.K$e$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f9395a
                        java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                        int r2 = r0.f9396b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p371w5.AbstractC6928k.m28382b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p371w5.AbstractC6928k.m28382b(r6)
                        V5.e r6 = r4.f9392a
                        U.f r5 = (p140U.AbstractC2494f) r5
                        U.f$a r2 = r4.f9393b
                        java.lang.Object r5 = r5.mo8424b(r2)
                        Z4.K r2 = r4.f9394c
                        Z4.H r2 = p180Z4.C3049K.m11179r(r2)
                        java.lang.Object r5 = p180Z4.AbstractC3050L.m11207d(r5, r2)
                        java.lang.Double r5 = (java.lang.Double) r5
                        r0.f9396b = r3
                        java.lang.Object r5 = r6.mo2989e(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        w5.q r5 = p371w5.C6934q.f24811a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p180Z4.C3049K.e.a.C7200a.mo2989e(java.lang.Object, z5.e):java.lang.Object");
                }
            }

            public a(InterfaceC2631d interfaceC2631d, AbstractC2494f.a aVar, C3049K c3049k) {
                this.f9389a = interfaceC2631d;
                this.f9390b = aVar;
                this.f9391c = c3049k;
            }

            @Override // p153V5.InterfaceC2631d
            /* renamed from: a */
            public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
                Object mo7083a = this.f9389a.mo7083a(new C7200a(interfaceC2632e, this.f9390b, this.f9391c), interfaceC7157e);
                return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, C3049K c3049k, C5480w c5480w, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9386c = str;
            this.f9387d = c3049k;
            this.f9388e = c5480w;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((e) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new e(this.f9386c, this.f9387d, this.f9388e, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1987h m11205b;
            C5480w c5480w;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9385b;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC2494f.a m8448g = AbstractC2496h.m8448g(this.f9386c);
                Context context = this.f9387d.f9356c;
                if (context == null) {
                    AbstractC5469l.m23037n("context");
                    context = null;
                }
                m11205b = AbstractC3050L.m11205b(context);
                a aVar = new a(m11205b.mo7042a(), m8448g, this.f9387d);
                C5480w c5480w2 = this.f9388e;
                this.f9384a = c5480w2;
                this.f9385b = 1;
                Object m9060i = AbstractC2633f.m9060i(aVar, this);
                if (m9060i == m76e) {
                    return m76e;
                }
                c5480w = c5480w2;
                obj = m9060i;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5480w = (C5480w) this.f9384a;
                AbstractC6928k.m28382b(obj);
            }
            c5480w.f19710a = obj;
            return C6934q.f24811a;
        }
    }

    /* renamed from: Z4.K$f */
    public static final class f extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f9398a;

        /* renamed from: b */
        public int f9399b;

        /* renamed from: c */
        public final /* synthetic */ String f9400c;

        /* renamed from: d */
        public final /* synthetic */ C3049K f9401d;

        /* renamed from: e */
        public final /* synthetic */ C5480w f9402e;

        /* renamed from: Z4.K$f$a */
        public static final class a implements InterfaceC2631d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2631d f9403a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC2494f.a f9404b;

            /* renamed from: Z4.K$f$a$a, reason: collision with other inner class name */
            public static final class C7202a implements InterfaceC2632e {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC2632e f9405a;

                /* renamed from: b */
                public final /* synthetic */ AbstractC2494f.a f9406b;

                /* renamed from: Z4.K$f$a$a$a, reason: collision with other inner class name */
                public static final class C7203a extends AbstractC0060d {

                    /* renamed from: a */
                    public /* synthetic */ Object f9407a;

                    /* renamed from: b */
                    public int f9408b;

                    public C7203a(InterfaceC7157e interfaceC7157e) {
                        super(interfaceC7157e);
                    }

                    @Override // p013B5.AbstractC0057a
                    public final Object invokeSuspend(Object obj) {
                        this.f9407a = obj;
                        this.f9408b |= Integer.MIN_VALUE;
                        return C7202a.this.mo2989e(null, this);
                    }
                }

                public C7202a(InterfaceC2632e interfaceC2632e, AbstractC2494f.a aVar) {
                    this.f9405a = interfaceC2632e;
                    this.f9406b = aVar;
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
                        boolean r0 = r6 instanceof p180Z4.C3049K.f.a.C7202a.C7203a
                        if (r0 == 0) goto L13
                        r0 = r6
                        Z4.K$f$a$a$a r0 = (p180Z4.C3049K.f.a.C7202a.C7203a) r0
                        int r1 = r0.f9408b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f9408b = r1
                        goto L18
                    L13:
                        Z4.K$f$a$a$a r0 = new Z4.K$f$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f9407a
                        java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                        int r2 = r0.f9408b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p371w5.AbstractC6928k.m28382b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p371w5.AbstractC6928k.m28382b(r6)
                        V5.e r6 = r4.f9405a
                        U.f r5 = (p140U.AbstractC2494f) r5
                        U.f$a r2 = r4.f9406b
                        java.lang.Object r5 = r5.mo8424b(r2)
                        r0.f9408b = r3
                        java.lang.Object r5 = r6.mo2989e(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        w5.q r5 = p371w5.C6934q.f24811a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p180Z4.C3049K.f.a.C7202a.mo2989e(java.lang.Object, z5.e):java.lang.Object");
                }
            }

            public a(InterfaceC2631d interfaceC2631d, AbstractC2494f.a aVar) {
                this.f9403a = interfaceC2631d;
                this.f9404b = aVar;
            }

            @Override // p153V5.InterfaceC2631d
            /* renamed from: a */
            public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
                Object mo7083a = this.f9403a.mo7083a(new C7202a(interfaceC2632e, this.f9404b), interfaceC7157e);
                return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C3049K c3049k, C5480w c5480w, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9400c = str;
            this.f9401d = c3049k;
            this.f9402e = c5480w;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((f) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new f(this.f9400c, this.f9401d, this.f9402e, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1987h m11205b;
            C5480w c5480w;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9399b;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC2494f.a m8447f = AbstractC2496h.m8447f(this.f9400c);
                Context context = this.f9401d.f9356c;
                if (context == null) {
                    AbstractC5469l.m23037n("context");
                    context = null;
                }
                m11205b = AbstractC3050L.m11205b(context);
                a aVar = new a(m11205b.mo7042a(), m8447f);
                C5480w c5480w2 = this.f9402e;
                this.f9398a = c5480w2;
                this.f9399b = 1;
                Object m9060i = AbstractC2633f.m9060i(aVar, this);
                if (m9060i == m76e) {
                    return m76e;
                }
                c5480w = c5480w2;
                obj = m9060i;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5480w = (C5480w) this.f9398a;
                AbstractC6928k.m28382b(obj);
            }
            c5480w.f19710a = obj;
            return C6934q.f24811a;
        }
    }

    /* renamed from: Z4.K$g */
    public static final class g extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9410a;

        /* renamed from: c */
        public final /* synthetic */ List f9412c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9412c = list;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((g) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C3049K.this.new g(this.f9412c, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9410a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                C3049K c3049k = C3049K.this;
                List list = this.f9412c;
                this.f9410a = 1;
                obj = c3049k.m11183u(list, this);
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

    /* renamed from: Z4.K$h */
    public static final class h extends AbstractC0060d {

        /* renamed from: a */
        public Object f9413a;

        /* renamed from: b */
        public Object f9414b;

        /* renamed from: c */
        public Object f9415c;

        /* renamed from: d */
        public Object f9416d;

        /* renamed from: e */
        public Object f9417e;

        /* renamed from: f */
        public /* synthetic */ Object f9418f;

        /* renamed from: o */
        public int f9420o;

        public h(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f9418f = obj;
            this.f9420o |= Integer.MIN_VALUE;
            return C3049K.this.m11183u(null, this);
        }
    }

    /* renamed from: Z4.K$i */
    public static final class i extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f9421a;

        /* renamed from: b */
        public int f9422b;

        /* renamed from: c */
        public final /* synthetic */ String f9423c;

        /* renamed from: d */
        public final /* synthetic */ C3049K f9424d;

        /* renamed from: e */
        public final /* synthetic */ C5480w f9425e;

        /* renamed from: Z4.K$i$a */
        public static final class a implements InterfaceC2631d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2631d f9426a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC2494f.a f9427b;

            /* renamed from: Z4.K$i$a$a, reason: collision with other inner class name */
            public static final class C7204a implements InterfaceC2632e {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC2632e f9428a;

                /* renamed from: b */
                public final /* synthetic */ AbstractC2494f.a f9429b;

                /* renamed from: Z4.K$i$a$a$a, reason: collision with other inner class name */
                public static final class C7205a extends AbstractC0060d {

                    /* renamed from: a */
                    public /* synthetic */ Object f9430a;

                    /* renamed from: b */
                    public int f9431b;

                    public C7205a(InterfaceC7157e interfaceC7157e) {
                        super(interfaceC7157e);
                    }

                    @Override // p013B5.AbstractC0057a
                    public final Object invokeSuspend(Object obj) {
                        this.f9430a = obj;
                        this.f9431b |= Integer.MIN_VALUE;
                        return C7204a.this.mo2989e(null, this);
                    }
                }

                public C7204a(InterfaceC2632e interfaceC2632e, AbstractC2494f.a aVar) {
                    this.f9428a = interfaceC2632e;
                    this.f9429b = aVar;
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
                        boolean r0 = r6 instanceof p180Z4.C3049K.i.a.C7204a.C7205a
                        if (r0 == 0) goto L13
                        r0 = r6
                        Z4.K$i$a$a$a r0 = (p180Z4.C3049K.i.a.C7204a.C7205a) r0
                        int r1 = r0.f9431b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f9431b = r1
                        goto L18
                    L13:
                        Z4.K$i$a$a$a r0 = new Z4.K$i$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f9430a
                        java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                        int r2 = r0.f9431b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p371w5.AbstractC6928k.m28382b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p371w5.AbstractC6928k.m28382b(r6)
                        V5.e r6 = r4.f9428a
                        U.f r5 = (p140U.AbstractC2494f) r5
                        U.f$a r2 = r4.f9429b
                        java.lang.Object r5 = r5.mo8424b(r2)
                        r0.f9431b = r3
                        java.lang.Object r5 = r6.mo2989e(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        w5.q r5 = p371w5.C6934q.f24811a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p180Z4.C3049K.i.a.C7204a.mo2989e(java.lang.Object, z5.e):java.lang.Object");
                }
            }

            public a(InterfaceC2631d interfaceC2631d, AbstractC2494f.a aVar) {
                this.f9426a = interfaceC2631d;
                this.f9427b = aVar;
            }

            @Override // p153V5.InterfaceC2631d
            /* renamed from: a */
            public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
                Object mo7083a = this.f9426a.mo7083a(new C7204a(interfaceC2632e, this.f9427b), interfaceC7157e);
                return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, C3049K c3049k, C5480w c5480w, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9423c = str;
            this.f9424d = c3049k;
            this.f9425e = c5480w;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((i) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new i(this.f9423c, this.f9424d, this.f9425e, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1987h m11205b;
            C5480w c5480w;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9422b;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC2494f.a m8448g = AbstractC2496h.m8448g(this.f9423c);
                Context context = this.f9424d.f9356c;
                if (context == null) {
                    AbstractC5469l.m23037n("context");
                    context = null;
                }
                m11205b = AbstractC3050L.m11205b(context);
                a aVar = new a(m11205b.mo7042a(), m8448g);
                C5480w c5480w2 = this.f9425e;
                this.f9421a = c5480w2;
                this.f9422b = 1;
                Object m9060i = AbstractC2633f.m9060i(aVar, this);
                if (m9060i == m76e) {
                    return m76e;
                }
                c5480w = c5480w2;
                obj = m9060i;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5480w = (C5480w) this.f9421a;
                AbstractC6928k.m28382b(obj);
            }
            c5480w.f19710a = obj;
            return C6934q.f24811a;
        }
    }

    /* renamed from: Z4.K$j */
    public static final class j implements InterfaceC2631d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2631d f9433a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC2494f.a f9434b;

        /* renamed from: Z4.K$j$a */
        public static final class a implements InterfaceC2632e {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2632e f9435a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC2494f.a f9436b;

            /* renamed from: Z4.K$j$a$a, reason: collision with other inner class name */
            public static final class C7206a extends AbstractC0060d {

                /* renamed from: a */
                public /* synthetic */ Object f9437a;

                /* renamed from: b */
                public int f9438b;

                public C7206a(InterfaceC7157e interfaceC7157e) {
                    super(interfaceC7157e);
                }

                @Override // p013B5.AbstractC0057a
                public final Object invokeSuspend(Object obj) {
                    this.f9437a = obj;
                    this.f9438b |= Integer.MIN_VALUE;
                    return a.this.mo2989e(null, this);
                }
            }

            public a(InterfaceC2632e interfaceC2632e, AbstractC2494f.a aVar) {
                this.f9435a = interfaceC2632e;
                this.f9436b = aVar;
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
                    boolean r0 = r6 instanceof p180Z4.C3049K.j.a.C7206a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Z4.K$j$a$a r0 = (p180Z4.C3049K.j.a.C7206a) r0
                    int r1 = r0.f9438b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f9438b = r1
                    goto L18
                L13:
                    Z4.K$j$a$a r0 = new Z4.K$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f9437a
                    java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                    int r2 = r0.f9438b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p371w5.AbstractC6928k.m28382b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p371w5.AbstractC6928k.m28382b(r6)
                    V5.e r6 = r4.f9435a
                    U.f r5 = (p140U.AbstractC2494f) r5
                    U.f$a r2 = r4.f9436b
                    java.lang.Object r5 = r5.mo8424b(r2)
                    r0.f9438b = r3
                    java.lang.Object r5 = r6.mo2989e(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    w5.q r5 = p371w5.C6934q.f24811a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p180Z4.C3049K.j.a.mo2989e(java.lang.Object, z5.e):java.lang.Object");
            }
        }

        public j(InterfaceC2631d interfaceC2631d, AbstractC2494f.a aVar) {
            this.f9433a = interfaceC2631d;
            this.f9434b = aVar;
        }

        @Override // p153V5.InterfaceC2631d
        /* renamed from: a */
        public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
            Object mo7083a = this.f9433a.mo7083a(new a(interfaceC2632e, this.f9434b), interfaceC7157e);
            return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
        }
    }

    /* renamed from: Z4.K$k */
    public static final class k implements InterfaceC2631d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2631d f9440a;

        /* renamed from: Z4.K$k$a */
        public static final class a implements InterfaceC2632e {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC2632e f9441a;

            /* renamed from: Z4.K$k$a$a, reason: collision with other inner class name */
            public static final class C7207a extends AbstractC0060d {

                /* renamed from: a */
                public /* synthetic */ Object f9442a;

                /* renamed from: b */
                public int f9443b;

                public C7207a(InterfaceC7157e interfaceC7157e) {
                    super(interfaceC7157e);
                }

                @Override // p013B5.AbstractC0057a
                public final Object invokeSuspend(Object obj) {
                    this.f9442a = obj;
                    this.f9443b |= Integer.MIN_VALUE;
                    return a.this.mo2989e(null, this);
                }
            }

            public a(InterfaceC2632e interfaceC2632e) {
                this.f9441a = interfaceC2632e;
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
                    boolean r0 = r6 instanceof p180Z4.C3049K.k.a.C7207a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Z4.K$k$a$a r0 = (p180Z4.C3049K.k.a.C7207a) r0
                    int r1 = r0.f9443b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f9443b = r1
                    goto L18
                L13:
                    Z4.K$k$a$a r0 = new Z4.K$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f9442a
                    java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                    int r2 = r0.f9443b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p371w5.AbstractC6928k.m28382b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p371w5.AbstractC6928k.m28382b(r6)
                    V5.e r6 = r4.f9441a
                    U.f r5 = (p140U.AbstractC2494f) r5
                    java.util.Map r5 = r5.mo8423a()
                    java.util.Set r5 = r5.keySet()
                    r0.f9443b = r3
                    java.lang.Object r5 = r6.mo2989e(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    w5.q r5 = p371w5.C6934q.f24811a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p180Z4.C3049K.k.a.mo2989e(java.lang.Object, z5.e):java.lang.Object");
            }
        }

        public k(InterfaceC2631d interfaceC2631d) {
            this.f9440a = interfaceC2631d;
        }

        @Override // p153V5.InterfaceC2631d
        /* renamed from: a */
        public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
            Object mo7083a = this.f9440a.mo7083a(new a(interfaceC2632e), interfaceC7157e);
            return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
        }
    }

    /* renamed from: Z4.K$l */
    public static final class l extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9445a;

        /* renamed from: b */
        public final /* synthetic */ String f9446b;

        /* renamed from: c */
        public final /* synthetic */ C3049K f9447c;

        /* renamed from: d */
        public final /* synthetic */ boolean f9448d;

        /* renamed from: Z4.K$l$a */
        public static final class a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f9449a;

            /* renamed from: b */
            public /* synthetic */ Object f9450b;

            /* renamed from: c */
            public final /* synthetic */ AbstractC2494f.a f9451c;

            /* renamed from: d */
            public final /* synthetic */ boolean f9452d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC2494f.a aVar, boolean z6, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f9451c = aVar;
                this.f9452d = z6;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C2491c c2491c, InterfaceC7157e interfaceC7157e) {
                return ((a) create(c2491c, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                a aVar = new a(this.f9451c, this.f9452d, interfaceC7157e);
                aVar.f9450b = obj;
                return aVar;
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                AbstractC0024c.m76e();
                if (this.f9449a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
                ((C2491c) this.f9450b).m8430j(this.f9451c, AbstractC0058b.m149a(this.f9452d));
                return C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, C3049K c3049k, boolean z6, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9446b = str;
            this.f9447c = c3049k;
            this.f9448d = z6;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((l) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new l(this.f9446b, this.f9447c, this.f9448d, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1987h m11205b;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9445a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC2494f.a m8442a = AbstractC2496h.m8442a(this.f9446b);
                Context context = this.f9447c.f9356c;
                if (context == null) {
                    AbstractC5469l.m23037n("context");
                    context = null;
                }
                m11205b = AbstractC3050L.m11205b(context);
                a aVar = new a(m8442a, this.f9448d, null);
                this.f9445a = 1;
                if (AbstractC2497i.m8450a(m11205b, aVar, this) == m76e) {
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

    /* renamed from: Z4.K$m */
    public static final class m extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9453a;

        /* renamed from: c */
        public final /* synthetic */ String f9455c;

        /* renamed from: d */
        public final /* synthetic */ String f9456d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9455c = str;
            this.f9456d = str2;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((m) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C3049K.this.new m(this.f9455c, this.f9456d, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9453a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                C3049K c3049k = C3049K.this;
                String str = this.f9455c;
                String str2 = this.f9456d;
                this.f9453a = 1;
                if (c3049k.m11182t(str, str2, this) == m76e) {
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

    /* renamed from: Z4.K$n */
    public static final class n extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9457a;

        /* renamed from: b */
        public final /* synthetic */ String f9458b;

        /* renamed from: c */
        public final /* synthetic */ C3049K f9459c;

        /* renamed from: d */
        public final /* synthetic */ double f9460d;

        /* renamed from: Z4.K$n$a */
        public static final class a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f9461a;

            /* renamed from: b */
            public /* synthetic */ Object f9462b;

            /* renamed from: c */
            public final /* synthetic */ AbstractC2494f.a f9463c;

            /* renamed from: d */
            public final /* synthetic */ double f9464d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC2494f.a aVar, double d7, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f9463c = aVar;
                this.f9464d = d7;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C2491c c2491c, InterfaceC7157e interfaceC7157e) {
                return ((a) create(c2491c, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                a aVar = new a(this.f9463c, this.f9464d, interfaceC7157e);
                aVar.f9462b = obj;
                return aVar;
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                AbstractC0024c.m76e();
                if (this.f9461a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
                ((C2491c) this.f9462b).m8430j(this.f9463c, AbstractC0058b.m150b(this.f9464d));
                return C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, C3049K c3049k, double d7, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9458b = str;
            this.f9459c = c3049k;
            this.f9460d = d7;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((n) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new n(this.f9458b, this.f9459c, this.f9460d, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1987h m11205b;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9457a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC2494f.a m8444c = AbstractC2496h.m8444c(this.f9458b);
                Context context = this.f9459c.f9356c;
                if (context == null) {
                    AbstractC5469l.m23037n("context");
                    context = null;
                }
                m11205b = AbstractC3050L.m11205b(context);
                a aVar = new a(m8444c, this.f9460d, null);
                this.f9457a = 1;
                if (AbstractC2497i.m8450a(m11205b, aVar, this) == m76e) {
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

    /* renamed from: Z4.K$o */
    public static final class o extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9465a;

        /* renamed from: c */
        public final /* synthetic */ String f9467c;

        /* renamed from: d */
        public final /* synthetic */ String f9468d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9467c = str;
            this.f9468d = str2;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((o) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C3049K.this.new o(this.f9467c, this.f9468d, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9465a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                C3049K c3049k = C3049K.this;
                String str = this.f9467c;
                String str2 = this.f9468d;
                this.f9465a = 1;
                if (c3049k.m11182t(str, str2, this) == m76e) {
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

    /* renamed from: Z4.K$p */
    public static final class p extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9469a;

        /* renamed from: b */
        public final /* synthetic */ String f9470b;

        /* renamed from: c */
        public final /* synthetic */ C3049K f9471c;

        /* renamed from: d */
        public final /* synthetic */ long f9472d;

        /* renamed from: Z4.K$p$a */
        public static final class a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f9473a;

            /* renamed from: b */
            public /* synthetic */ Object f9474b;

            /* renamed from: c */
            public final /* synthetic */ AbstractC2494f.a f9475c;

            /* renamed from: d */
            public final /* synthetic */ long f9476d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC2494f.a aVar, long j7, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f9475c = aVar;
                this.f9476d = j7;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C2491c c2491c, InterfaceC7157e interfaceC7157e) {
                return ((a) create(c2491c, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                a aVar = new a(this.f9475c, this.f9476d, interfaceC7157e);
                aVar.f9474b = obj;
                return aVar;
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                AbstractC0024c.m76e();
                if (this.f9473a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
                ((C2491c) this.f9474b).m8430j(this.f9475c, AbstractC0058b.m152d(this.f9476d));
                return C6934q.f24811a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, C3049K c3049k, long j7, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9470b = str;
            this.f9471c = c3049k;
            this.f9472d = j7;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((p) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new p(this.f9470b, this.f9471c, this.f9472d, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1987h m11205b;
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9469a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC2494f.a m8447f = AbstractC2496h.m8447f(this.f9470b);
                Context context = this.f9471c.f9356c;
                if (context == null) {
                    AbstractC5469l.m23037n("context");
                    context = null;
                }
                m11205b = AbstractC3050L.m11205b(context);
                a aVar = new a(m8447f, this.f9472d, null);
                this.f9469a = 1;
                if (AbstractC2497i.m8450a(m11205b, aVar, this) == m76e) {
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

    /* renamed from: Z4.K$q */
    public static final class q extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f9477a;

        /* renamed from: c */
        public final /* synthetic */ String f9479c;

        /* renamed from: d */
        public final /* synthetic */ String f9480d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f9479c = str;
            this.f9480d = str2;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((q) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C3049K.this.new q(this.f9479c, this.f9480d, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f9477a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                C3049K c3049k = C3049K.this;
                String str = this.f9479c;
                String str2 = this.f9480d;
                this.f9477a = 1;
                if (c3049k.m11182t(str, str2, this) == m76e) {
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

    /* renamed from: x */
    private final void m11181x(InterfaceC0651c interfaceC0651c, Context context) {
        this.f9356c = context;
        try {
            InterfaceC3044F.f9347b.m11168s(interfaceC0651c, this, "data_store");
            this.f9357d = new C3045G(interfaceC0651c, context, this.f9358e);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        InterfaceC0651c m786b = binding.m786b();
        AbstractC5469l.m23027d(m786b, "getBinaryMessenger(...)");
        Context m785a = binding.m785a();
        AbstractC5469l.m23027d(m785a, "getApplicationContext(...)");
        m11181x(m786b, m785a);
        new C3054a().mo782C(binding);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: a */
    public void mo11120a(String key, boolean z6, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        AbstractC2386j.m8123b(null, new l(key, this, z6, null), 1, null);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: b */
    public Boolean mo11121b(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        C5480w c5480w = new C5480w();
        AbstractC2386j.m8123b(null, new d(key, this, c5480w, null), 1, null);
        return (Boolean) c5480w.f19710a;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: c */
    public String mo11122c(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        C5480w c5480w = new C5480w();
        AbstractC2386j.m8123b(null, new i(key, this, c5480w, null), 1, null);
        return (String) c5480w.f19710a;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: d */
    public Double mo11123d(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        C5480w c5480w = new C5480w();
        AbstractC2386j.m8123b(null, new e(key, this, c5480w, null), 1, null);
        return (Double) c5480w.f19710a;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: e */
    public void mo11124e(String key, String value, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(options, "options");
        AbstractC2386j.m8123b(null, new o(key, value, null), 1, null);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: f */
    public List mo11125f(List list, C3048J options) {
        Object m8123b;
        AbstractC5469l.m23028e(options, "options");
        m8123b = AbstractC2386j.m8123b(null, new g(list, null), 1, null);
        return AbstractC7032w.m28889O(((Map) m8123b).keySet());
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: g */
    public void mo11126g(String key, double d7, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        AbstractC2386j.m8123b(null, new n(key, this, d7, null), 1, null);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: h */
    public void mo11127h(String key, long j7, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        AbstractC2386j.m8123b(null, new p(key, this, j7, null), 1, null);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: i */
    public void mo11128i(List list, C3048J options) {
        AbstractC5469l.m23028e(options, "options");
        AbstractC2386j.m8123b(null, new a(list, null), 1, null);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: j */
    public void mo11129j(String key, String value, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(options, "options");
        AbstractC2386j.m8123b(null, new q(key, value, null), 1, null);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: k */
    public Long mo11130k(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        C5480w c5480w = new C5480w();
        AbstractC2386j.m8123b(null, new f(key, this, c5480w, null), 1, null);
        return (Long) c5480w.f19710a;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: l */
    public Map mo11131l(List list, C3048J options) {
        Object m8123b;
        AbstractC5469l.m23028e(options, "options");
        m8123b = AbstractC2386j.m8123b(null, new c(list, null), 1, null);
        return (Map) m8123b;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: m */
    public List mo11132m(String key, C3048J options) {
        List list;
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        String mo11122c = mo11122c(key, options);
        ArrayList arrayList = null;
        if (mo11122c != null && !AbstractC2291q.m7745u(mo11122c, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null) && AbstractC2291q.m7745u(mo11122c, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null) && (list = (List) AbstractC3050L.m11207d(mo11122c, this.f9358e)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: n */
    public C3053O mo11133n(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        String mo11122c = mo11122c(key, options);
        if (mo11122c == null) {
            return null;
        }
        if (AbstractC2291q.m7745u(mo11122c, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null)) {
            return new C3053O(mo11122c, EnumC3051M.f9485d);
        }
        return AbstractC2291q.m7745u(mo11122c, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null) ? new C3053O(null, EnumC3051M.f9484c) : new C3053O(null, EnumC3051M.f9486e);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: o */
    public void mo11134o(String key, List value, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(options, "options");
        AbstractC2386j.m8123b(null, new m(key, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f9358e.mo11171a(value), null), 1, null);
    }

    /* renamed from: t */
    public final Object m11182t(String str, String str2, InterfaceC7157e interfaceC7157e) {
        InterfaceC1987h m11205b;
        AbstractC2494f.a m8448g = AbstractC2496h.m8448g(str);
        Context context = this.f9356c;
        if (context == null) {
            AbstractC5469l.m23037n("context");
            context = null;
        }
        m11205b = AbstractC3050L.m11205b(context);
        Object m8450a = AbstractC2497i.m8450a(m11205b, new b(m8448g, str2, null), interfaceC7157e);
        return m8450a == AbstractC0024c.m76e() ? m8450a : C6934q.f24811a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a2 -> B:11:0x00a5). Please report as a decompilation issue!!! */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11183u(java.util.List r9, p392z5.InterfaceC7157e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p180Z4.C3049K.h
            if (r0 == 0) goto L13
            r0 = r10
            Z4.K$h r0 = (p180Z4.C3049K.h) r0
            int r1 = r0.f9420o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9420o = r1
            goto L18
        L13:
            Z4.K$h r0 = new Z4.K$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9418f
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f9420o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r9 = r0.f9417e
            U.f$a r9 = (p140U.AbstractC2494f.a) r9
            java.lang.Object r2 = r0.f9416d
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f9415c
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f9414b
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.f9413a
            Z4.K r6 = (p180Z4.C3049K) r6
            p371w5.AbstractC6928k.m28382b(r10)
            goto La5
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L48:
            java.lang.Object r9 = r0.f9415c
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.f9414b
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.f9413a
            Z4.K r4 = (p180Z4.C3049K) r4
            p371w5.AbstractC6928k.m28382b(r10)
            goto L7a
        L58:
            p371w5.AbstractC6928k.m28382b(r10)
            if (r9 == 0) goto L63
            java.util.Set r9 = p378x5.AbstractC7032w.m28893S(r9)
        L61:
            r2 = r9
            goto L65
        L63:
            r9 = 0
            goto L61
        L65:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r0.f9413a = r8
            r0.f9414b = r2
            r0.f9415c = r9
            r0.f9420o = r4
            java.lang.Object r10 = r8.m11185w(r0)
            if (r10 != r1) goto L79
            return r1
        L79:
            r4 = r8
        L7a:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto Lc0
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L86:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lbf
            java.lang.Object r9 = r2.next()
            U.f$a r9 = (p140U.AbstractC2494f.a) r9
            r0.f9413a = r6
            r0.f9414b = r5
            r0.f9415c = r4
            r0.f9416d = r2
            r0.f9417e = r9
            r0.f9420o = r3
            java.lang.Object r10 = r6.m11184v(r9, r0)
            if (r10 != r1) goto La5
            return r1
        La5:
            java.lang.String r7 = r9.toString()
            boolean r7 = p180Z4.AbstractC3050L.m11206c(r7, r10, r5)
            if (r7 == 0) goto L86
            Z4.H r7 = r6.f9358e
            java.lang.Object r10 = p180Z4.AbstractC3050L.m11207d(r10, r7)
            if (r10 == 0) goto L86
            java.lang.String r9 = r9.toString()
            r4.put(r9, r10)
            goto L86
        Lbf:
            r9 = r4
        Lc0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p180Z4.C3049K.m11183u(java.util.List, z5.e):java.lang.Object");
    }

    /* renamed from: v */
    public final Object m11184v(AbstractC2494f.a aVar, InterfaceC7157e interfaceC7157e) {
        InterfaceC1987h m11205b;
        Context context = this.f9356c;
        if (context == null) {
            AbstractC5469l.m23037n("context");
            context = null;
        }
        m11205b = AbstractC3050L.m11205b(context);
        return AbstractC2633f.m9060i(new j(m11205b.mo7042a(), aVar), interfaceC7157e);
    }

    /* renamed from: w */
    public final Object m11185w(InterfaceC7157e interfaceC7157e) {
        InterfaceC1987h m11205b;
        Context context = this.f9356c;
        if (context == null) {
            AbstractC5469l.m23037n("context");
            context = null;
        }
        m11205b = AbstractC3050L.m11205b(context);
        return AbstractC2633f.m9060i(new k(m11205b.mo7042a()), interfaceC7157e);
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        InterfaceC3044F.a aVar = InterfaceC3044F.f9347b;
        InterfaceC0651c m786b = binding.m786b();
        AbstractC5469l.m23027d(m786b, "getBinaryMessenger(...)");
        aVar.m11168s(m786b, null, "data_store");
        C3045G c3045g = this.f9357d;
        if (c3045g != null) {
            c3045g.m11170q();
        }
        this.f9357d = null;
    }
}
