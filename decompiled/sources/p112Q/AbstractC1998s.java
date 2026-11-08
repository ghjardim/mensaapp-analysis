package p112Q;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p132S5.AbstractC2416y;
import p132S5.InterfaceC2412w;
import p198b6.AbstractC3558c;
import p198b6.InterfaceC3556a;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: Q.s */
/* loaded from: classes.dex */
public abstract class AbstractC1998s {

    /* renamed from: a */
    public final InterfaceC3556a f6163a = AbstractC3558c.m14354b(false, 1, null);

    /* renamed from: b */
    public final InterfaceC2412w f6164b = AbstractC2416y.m8190b(null, 1, null);

    /* renamed from: Q.s$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f6165a;

        /* renamed from: b */
        public Object f6166b;

        /* renamed from: c */
        public /* synthetic */ Object f6167c;

        /* renamed from: e */
        public int f6169e;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f6167c = obj;
            this.f6169e |= Integer.MIN_VALUE;
            return AbstractC1998s.this.m7117c(this);
        }
    }

    /* renamed from: a */
    public final Object m7116a(InterfaceC7157e interfaceC7157e) {
        Object await = this.f6164b.await(interfaceC7157e);
        return await == AbstractC0024c.m76e() ? await : C6934q.f24811a;
    }

    /* renamed from: b */
    public abstract Object mo7074b(InterfaceC7157e interfaceC7157e);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7117c(p392z5.InterfaceC7157e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p112Q.AbstractC1998s.a
            if (r0 == 0) goto L13
            r0 = r7
            Q.s$a r0 = (p112Q.AbstractC1998s.a) r0
            int r1 = r0.f6169e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6169e = r1
            goto L18
        L13:
            Q.s$a r0 = new Q.s$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6167c
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f6169e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f6166b
            b6.a r1 = (p198b6.InterfaceC3556a) r1
            java.lang.Object r0 = r0.f6165a
            Q.s r0 = (p112Q.AbstractC1998s) r0
            p371w5.AbstractC6928k.m28382b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.f6166b
            b6.a r2 = (p198b6.InterfaceC3556a) r2
            java.lang.Object r4 = r0.f6165a
            Q.s r4 = (p112Q.AbstractC1998s) r4
            p371w5.AbstractC6928k.m28382b(r7)
            r7 = r2
            goto L6a
        L4c:
            p371w5.AbstractC6928k.m28382b(r7)
            S5.w r7 = r6.f6164b
            boolean r7 = r7.isCompleted()
            if (r7 == 0) goto L5a
            w5.q r7 = p371w5.C6934q.f24811a
            return r7
        L5a:
            b6.a r7 = r6.f6163a
            r0.f6165a = r6
            r0.f6166b = r7
            r0.f6169e = r4
            java.lang.Object r2 = r7.mo14334a(r5, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r4 = r6
        L6a:
            S5.w r2 = r4.f6164b     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            w5.q r0 = p371w5.C6934q.f24811a     // Catch: java.lang.Throwable -> L78
            r7.mo14336c(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.f6165a = r4     // Catch: java.lang.Throwable -> L78
            r0.f6166b = r7     // Catch: java.lang.Throwable -> L78
            r0.f6169e = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.mo7074b(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            S5.w r7 = r0.f6164b     // Catch: java.lang.Throwable -> L35
            w5.q r0 = p371w5.C6934q.f24811a     // Catch: java.lang.Throwable -> L35
            r7.mo8187v(r0)     // Catch: java.lang.Throwable -> L35
            r1.mo14336c(r5)
            return r0
        L96:
            r1.mo14336c(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p112Q.AbstractC1998s.m7117c(z5.e):java.lang.Object");
    }
}
