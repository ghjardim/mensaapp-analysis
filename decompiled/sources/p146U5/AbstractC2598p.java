package p146U5;

import kotlin.jvm.internal.AbstractC5470m;
import p013B5.AbstractC0060d;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2326F;
import p132S5.EnumC2338L;
import p132S5.InterfaceC2334J;
import p132S5.InterfaceC2394n;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: U5.p */
/* loaded from: classes2.dex */
public abstract class AbstractC2598p {

    /* renamed from: U5.p$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f7616a;

        /* renamed from: b */
        public Object f7617b;

        /* renamed from: c */
        public /* synthetic */ Object f7618c;

        /* renamed from: d */
        public int f7619d;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7618c = obj;
            this.f7619d |= Integer.MIN_VALUE;
            return AbstractC2598p.m8878a(null, null, this);
        }
    }

    /* renamed from: U5.p$b */
    public static final class b extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2394n f7620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2394n interfaceC2394n) {
            super(1);
            this.f7620a = interfaceC2394n;
        }

        /* renamed from: a */
        public final void m8881a(Throwable th) {
            InterfaceC2394n interfaceC2394n = this.f7620a;
            C6927j.a aVar = C6927j.f24803b;
            interfaceC2394n.resumeWith(C6927j.m28373b(C6934q.f24811a));
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8881a((Throwable) obj);
            return C6934q.f24811a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8878a(p146U5.InterfaceC2600r r4, p069J5.InterfaceC0789a r5, p392z5.InterfaceC7157e r6) {
        /*
            boolean r0 = r6 instanceof p146U5.AbstractC2598p.a
            if (r0 == 0) goto L13
            r0 = r6
            U5.p$a r0 = (p146U5.AbstractC2598p.a) r0
            int r1 = r0.f7619d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7619d = r1
            goto L18
        L13:
            U5.p$a r0 = new U5.p$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7618c
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f7619d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f7617b
            r5 = r4
            J5.a r5 = (p069J5.InterfaceC0789a) r5
            java.lang.Object r4 = r0.f7616a
            U5.r r4 = (p146U5.InterfaceC2600r) r4
            p371w5.AbstractC6928k.m28382b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            p371w5.AbstractC6928k.m28382b(r6)
            z5.i r6 = r0.getContext()
            S5.u0$b r2 = p132S5.InterfaceC2409u0.f7157j
            z5.i$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f7616a = r4     // Catch: java.lang.Throwable -> L32
            r0.f7617b = r5     // Catch: java.lang.Throwable -> L32
            r0.f7619d = r3     // Catch: java.lang.Throwable -> L32
            S5.o r6 = new S5.o     // Catch: java.lang.Throwable -> L32
            z5.e r2 = p006A5.AbstractC0023b.m74c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.m8147E()     // Catch: java.lang.Throwable -> L32
            U5.p$b r2 = new U5.p$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.mo8776g(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.m8171y()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = p006A5.AbstractC0024c.m76e()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            p013B5.AbstractC0064h.m164c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            w5.q r4 = p371w5.C6934q.f24811a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p146U5.AbstractC2598p.m8878a(U5.r, J5.a, z5.e):java.lang.Object");
    }

    /* renamed from: b */
    public static final InterfaceC2601s m8879b(InterfaceC2334J interfaceC2334J, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a, EnumC2338L enumC2338L, InterfaceC0800l interfaceC0800l, InterfaceC0804p interfaceC0804p) {
        C2599q c2599q = new C2599q(AbstractC2326F.m7976d(interfaceC2334J, interfaceC7161i), AbstractC2589g.m8848b(i7, enumC2583a, null, 4, null));
        if (interfaceC0800l != null) {
            c2599q.invokeOnCompletion(interfaceC0800l);
        }
        c2599q.m8059Q0(enumC2338L, c2599q, interfaceC0804p);
        return c2599q;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC2601s m8880c(InterfaceC2334J interfaceC2334J, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a, EnumC2338L enumC2338L, InterfaceC0800l interfaceC0800l, InterfaceC0804p interfaceC0804p, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC7161i = C7162j.f25439a;
        }
        InterfaceC7161i interfaceC7161i2 = interfaceC7161i;
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        int i9 = i7;
        if ((i8 & 4) != 0) {
            enumC2583a = EnumC2583a.f7562a;
        }
        EnumC2583a enumC2583a2 = enumC2583a;
        if ((i8 & 8) != 0) {
            enumC2338L = EnumC2338L.f7068a;
        }
        EnumC2338L enumC2338L2 = enumC2338L;
        if ((i8 & 16) != 0) {
            interfaceC0800l = null;
        }
        return m8879b(interfaceC2334J, interfaceC7161i2, i9, enumC2583a2, enumC2338L2, interfaceC0800l, interfaceC0804p);
    }
}
