package p153V5;

import kotlin.jvm.internal.AbstractC5464g;
import p013B5.AbstractC0060d;
import p069J5.InterfaceC0804p;
import p146U5.EnumC2583a;
import p160W5.AbstractC2729e;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: V5.b */
/* loaded from: classes2.dex */
public final class C2629b extends AbstractC2630c {

    /* renamed from: e */
    public final InterfaceC0804p f7781e;

    /* renamed from: V5.b$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f7782a;

        /* renamed from: b */
        public /* synthetic */ Object f7783b;

        /* renamed from: d */
        public int f7785d;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7783b = obj;
            this.f7785d |= Integer.MIN_VALUE;
            return C2629b.this.mo9049f(null, this);
        }
    }

    public /* synthetic */ C2629b(InterfaceC0804p interfaceC0804p, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a, int i8, AbstractC5464g abstractC5464g) {
        this(interfaceC0804p, (i8 & 2) != 0 ? C7162j.f25439a : interfaceC7161i, (i8 & 4) != 0 ? -2 : i7, (i8 & 8) != 0 ? EnumC2583a.f7562a : enumC2583a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p153V5.AbstractC2630c, p160W5.AbstractC2729e
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo9049f(p146U5.InterfaceC2600r r5, p392z5.InterfaceC7157e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p153V5.C2629b.a
            if (r0 == 0) goto L13
            r0 = r6
            V5.b$a r0 = (p153V5.C2629b.a) r0
            int r1 = r0.f7785d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7785d = r1
            goto L18
        L13:
            V5.b$a r0 = new V5.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7783b
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f7785d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f7782a
            U5.r r5 = (p146U5.InterfaceC2600r) r5
            p371w5.AbstractC6928k.m28382b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p371w5.AbstractC6928k.m28382b(r6)
            r0.f7782a = r5
            r0.f7785d = r3
            java.lang.Object r6 = super.mo9049f(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.mo8791s()
            if (r5 == 0) goto L4c
            w5.q r5 = p371w5.C6934q.f24811a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p153V5.C2629b.mo9049f(U5.r, z5.e):java.lang.Object");
    }

    @Override // p160W5.AbstractC2729e
    /* renamed from: g */
    public AbstractC2729e mo9050g(InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        return new C2629b(this.f7781e, interfaceC7161i, i7, enumC2583a);
    }

    public C2629b(InterfaceC0804p interfaceC0804p, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        super(interfaceC0804p, interfaceC7161i, i7, enumC2583a);
        this.f7781e = interfaceC0804p;
    }
}
