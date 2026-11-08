package p112Q;

import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0058b;
import p013B5.AbstractC0060d;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p153V5.AbstractC2633f;
import p153V5.InterfaceC2631d;
import p153V5.InterfaceC2632e;
import p198b6.AbstractC3558c;
import p198b6.InterfaceC3556a;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: Q.u */
/* loaded from: classes.dex */
public final class C2000u implements InterfaceC1993n {

    /* renamed from: a */
    public final String f6180a;

    /* renamed from: b */
    public final InterfaceC3556a f6181b;

    /* renamed from: c */
    public final C1980a f6182c;

    /* renamed from: d */
    public final InterfaceC2631d f6183d;

    /* renamed from: Q.u$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f6184a;

        /* renamed from: b */
        public Object f6185b;

        /* renamed from: c */
        public /* synthetic */ Object f6186c;

        /* renamed from: e */
        public int f6188e;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6186c = obj;
            this.f6188e |= Integer.MIN_VALUE;
            return C2000u.this.mo7107d(null, this);
        }
    }

    /* renamed from: Q.u$b */
    public static final class b extends AbstractC0060d {

        /* renamed from: a */
        public Object f6189a;

        /* renamed from: b */
        public boolean f6190b;

        /* renamed from: c */
        public /* synthetic */ Object f6191c;

        /* renamed from: e */
        public int f6193e;

        public b(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6191c = obj;
            this.f6193e |= Integer.MIN_VALUE;
            return C2000u.this.mo7108e(null, this);
        }
    }

    /* renamed from: Q.u$c */
    public static final class c extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f6194a;

        public c(InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
            return ((c) create(interfaceC2632e, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new c(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            AbstractC0024c.m76e();
            if (this.f6194a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6928k.m28382b(obj);
            return C6934q.f24811a;
        }
    }

    public C2000u(String filePath) {
        AbstractC5469l.m23028e(filePath, "filePath");
        this.f6180a = filePath;
        this.f6181b = AbstractC3558c.m14354b(false, 1, null);
        this.f6182c = new C1980a(0);
        this.f6183d = AbstractC2633f.m9061j(new c(null));
    }

    @Override // p112Q.InterfaceC1993n
    /* renamed from: a */
    public Object mo7104a(InterfaceC7157e interfaceC7157e) {
        return AbstractC0058b.m151c(this.f6182c.m7032d());
    }

    @Override // p112Q.InterfaceC1993n
    /* renamed from: b */
    public Object mo7105b(InterfaceC7157e interfaceC7157e) {
        return AbstractC0058b.m151c(this.f6182c.m7030b());
    }

    @Override // p112Q.InterfaceC1993n
    /* renamed from: c */
    public InterfaceC2631d mo7106c() {
        return this.f6183d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // p112Q.InterfaceC1993n
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7107d(p069J5.InterfaceC0800l r8, p392z5.InterfaceC7157e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p112Q.C2000u.a
            if (r0 == 0) goto L13
            r0 = r9
            Q.u$a r0 = (p112Q.C2000u.a) r0
            int r1 = r0.f6188e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6188e = r1
            goto L18
        L13:
            Q.u$a r0 = new Q.u$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6186c
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6188e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f6184a
            b6.a r8 = (p198b6.InterfaceC3556a) r8
            p371w5.AbstractC6928k.m28382b(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f6185b
            b6.a r8 = (p198b6.InterfaceC3556a) r8
            java.lang.Object r2 = r0.f6184a
            J5.l r2 = (p069J5.InterfaceC0800l) r2
            p371w5.AbstractC6928k.m28382b(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            p371w5.AbstractC6928k.m28382b(r9)
            b6.a r9 = r7.f6181b
            r0.f6184a = r8
            r0.f6185b = r9
            r0.f6188e = r4
            java.lang.Object r2 = r9.mo14334a(r5, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r0.f6184a = r9     // Catch: java.lang.Throwable -> L6f
            r0.f6185b = r5     // Catch: java.lang.Throwable -> L6f
            r0.f6188e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.mo14336c(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.mo14336c(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C2000u.mo7107d(J5.l, z5.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p112Q.InterfaceC1993n
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7108e(p069J5.InterfaceC0804p r7, p392z5.InterfaceC7157e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p112Q.C2000u.b
            if (r0 == 0) goto L13
            r0 = r8
            Q.u$b r0 = (p112Q.C2000u.b) r0
            int r1 = r0.f6193e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6193e = r1
            goto L18
        L13:
            Q.u$b r0 = new Q.u$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6191c
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6193e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.f6190b
            java.lang.Object r0 = r0.f6189a
            b6.a r0 = (p198b6.InterfaceC3556a) r0
            p371w5.AbstractC6928k.m28382b(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            p371w5.AbstractC6928k.m28382b(r8)
            b6.a r8 = r6.f6181b
            boolean r2 = r8.mo14335b(r4)
            java.lang.Boolean r5 = p013B5.AbstractC0058b.m149a(r2)     // Catch: java.lang.Throwable -> L5d
            r0.f6189a = r8     // Catch: java.lang.Throwable -> L5d
            r0.f6190b = r2     // Catch: java.lang.Throwable -> L5d
            r0.f6193e = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.mo14336c(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.mo14336c(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.C2000u.mo7108e(J5.p, z5.e):java.lang.Object");
    }
}
