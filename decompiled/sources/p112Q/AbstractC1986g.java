package p112Q;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p207d.AbstractC4094d;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: Q.g */
/* loaded from: classes.dex */
public abstract class AbstractC1986g {

    /* renamed from: a */
    public static final a f5988a = new a(null);

    /* renamed from: Q.g$a */
    public static final class a {

        /* renamed from: Q.g$a$a, reason: collision with other inner class name */
        public static final class C7179a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f5989a;

            /* renamed from: b */
            public /* synthetic */ Object f5990b;

            /* renamed from: c */
            public final /* synthetic */ List f5991c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7179a(List list, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f5991c = list;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1992m interfaceC1992m, InterfaceC7157e interfaceC7157e) {
                return ((C7179a) create(interfaceC1992m, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                C7179a c7179a = new C7179a(this.f5991c, interfaceC7157e);
                c7179a.f5990b = obj;
                return c7179a;
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f5989a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    InterfaceC1992m interfaceC1992m = (InterfaceC1992m) this.f5990b;
                    a aVar = AbstractC1986g.f5988a;
                    List list = this.f5991c;
                    this.f5989a = 1;
                    if (aVar.m7038c(list, interfaceC1992m, this) == m76e) {
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

        /* renamed from: Q.g$a$b */
        public static final class b extends AbstractC0060d {

            /* renamed from: a */
            public Object f5992a;

            /* renamed from: b */
            public Object f5993b;

            /* renamed from: c */
            public /* synthetic */ Object f5994c;

            /* renamed from: e */
            public int f5996e;

            public b(InterfaceC7157e interfaceC7157e) {
                super(interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                this.f5994c = obj;
                this.f5996e |= Integer.MIN_VALUE;
                return a.this.m7038c(null, null, this);
            }
        }

        /* renamed from: Q.g$a$c */
        public static final class c extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public Object f5997a;

            /* renamed from: b */
            public Object f5998b;

            /* renamed from: c */
            public Object f5999c;

            /* renamed from: d */
            public int f6000d;

            /* renamed from: e */
            public /* synthetic */ Object f6001e;

            /* renamed from: f */
            public final /* synthetic */ List f6002f;

            /* renamed from: n */
            public final /* synthetic */ List f6003n;

            /* renamed from: Q.g$a$c$a, reason: collision with other inner class name */
            public static final class C7180a extends AbstractC0068l implements InterfaceC0800l {

                /* renamed from: a */
                public int f6004a;

                public C7180a(InterfaceC1985f interfaceC1985f, InterfaceC7157e interfaceC7157e) {
                    super(1, interfaceC7157e);
                }

                @Override // p069J5.InterfaceC0800l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7157e interfaceC7157e) {
                    return ((C7180a) create(interfaceC7157e)).invokeSuspend(C6934q.f24811a);
                }

                @Override // p013B5.AbstractC0057a
                public final InterfaceC7157e create(InterfaceC7157e interfaceC7157e) {
                    return new C7180a(null, interfaceC7157e);
                }

                @Override // p013B5.AbstractC0057a
                public final Object invokeSuspend(Object obj) {
                    AbstractC0024c.m76e();
                    int i7 = this.f6004a;
                    if (i7 == 0) {
                        AbstractC6928k.m28382b(obj);
                        this.f6004a = 1;
                        throw null;
                    }
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                    return C6934q.f24811a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f6002f = list;
                this.f6003n = list2;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, InterfaceC7157e interfaceC7157e) {
                return ((c) create(obj, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                c cVar = new c(this.f6002f, this.f6003n, interfaceC7157e);
                cVar.f6001e = obj;
                return cVar;
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                AbstractC0024c.m76e();
                int i7 = this.f6000d;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    obj = this.f6001e;
                    List list2 = this.f6002f;
                    list = this.f6003n;
                    it = list2.iterator();
                } else if (i7 == 1) {
                    Object obj2 = this.f5999c;
                    AbstractC4094d.m17162a(this.f5998b);
                    Iterator it2 = (Iterator) this.f5997a;
                    List list3 = (List) this.f6001e;
                    AbstractC6928k.m28382b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C7180a(null, null));
                        this.f6001e = list3;
                        this.f5997a = it2;
                        this.f5998b = null;
                        this.f5999c = null;
                        this.f6000d = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f5997a;
                    list = (List) this.f6001e;
                    AbstractC6928k.m28382b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                AbstractC4094d.m17162a(it.next());
                this.f6001e = list;
                this.f5997a = it;
                this.f5998b = null;
                this.f5999c = obj;
                this.f6000d = 1;
                throw null;
            }
        }

        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: b */
        public final InterfaceC0804p m7037b(List migrations) {
            AbstractC5469l.m23028e(migrations, "migrations");
            return new C7179a(migrations, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0086 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m7038c(java.util.List r7, p112Q.InterfaceC1992m r8, p392z5.InterfaceC7157e r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof p112Q.AbstractC1986g.a.b
                if (r0 == 0) goto L13
                r0 = r9
                Q.g$a$b r0 = (p112Q.AbstractC1986g.a.b) r0
                int r1 = r0.f5996e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f5996e = r1
                goto L18
            L13:
                Q.g$a$b r0 = new Q.g$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f5994c
                java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
                int r2 = r0.f5996e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f5993b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f5992a
                kotlin.jvm.internal.w r8 = (kotlin.jvm.internal.C5480w) r8
                p371w5.AbstractC6928k.m28382b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f5992a
                java.util.List r7 = (java.util.List) r7
                p371w5.AbstractC6928k.m28382b(r9)
                goto L60
            L46:
                p371w5.AbstractC6928k.m28382b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                Q.g$a$c r2 = new Q.g$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f5992a = r9
                r0.f5996e = r4
                java.lang.Object r7 = r8.mo7076b(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.w r8 = new kotlin.jvm.internal.w
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L92
                java.lang.Object r9 = r7.next()
                J5.l r9 = (p069J5.InterfaceC0800l) r9
                r0.f5992a = r8     // Catch: java.lang.Throwable -> L34
                r0.f5993b = r7     // Catch: java.lang.Throwable -> L34
                r0.f5996e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
                return r1
            L82:
                java.lang.Object r2 = r8.f19710a
                if (r2 != 0) goto L89
                r8.f19710a = r9
                goto L69
            L89:
                kotlin.jvm.internal.AbstractC5469l.m23025b(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                p371w5.AbstractC6918a.m28362a(r2, r9)
                goto L69
            L92:
                java.lang.Object r7 = r8.f19710a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9b
                w5.q r7 = p371w5.C6934q.f24811a
                return r7
            L9b:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p112Q.AbstractC1986g.a.m7038c(java.util.List, Q.m, z5.e):java.lang.Object");
        }

        public a() {
        }
    }
}
