package p153V5;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p146U5.InterfaceC2601s;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: V5.h */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2635h {

    /* renamed from: V5.h$a */
    public static final class a extends AbstractC0060d {

        /* renamed from: a */
        public Object f7787a;

        /* renamed from: b */
        public Object f7788b;

        /* renamed from: c */
        public Object f7789c;

        /* renamed from: d */
        public boolean f7790d;

        /* renamed from: e */
        public /* synthetic */ Object f7791e;

        /* renamed from: f */
        public int f7792f;

        public a(InterfaceC7157e interfaceC7157e) {
            super(interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            this.f7791e = obj;
            this.f7792f |= Integer.MIN_VALUE;
            return AbstractC2635h.m9070c(null, null, false, this);
        }
    }

    /* renamed from: b */
    public static final Object m9069b(InterfaceC2632e interfaceC2632e, InterfaceC2601s interfaceC2601s, InterfaceC7157e interfaceC7157e) {
        Object m9070c = m9070c(interfaceC2632e, interfaceC2601s, true, interfaceC7157e);
        return m9070c == AbstractC0024c.m76e() ? m9070c : C6934q.f24811a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:19:0x0077, B:21:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9070c(p153V5.InterfaceC2632e r6, p146U5.InterfaceC2601s r7, boolean r8, p392z5.InterfaceC7157e r9) {
        /*
            boolean r0 = r9 instanceof p153V5.AbstractC2635h.a
            if (r0 == 0) goto L13
            r0 = r9
            V5.h$a r0 = (p153V5.AbstractC2635h.a) r0
            int r1 = r0.f7792f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7792f = r1
            goto L18
        L13:
            V5.h$a r0 = new V5.h$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f7791e
            java.lang.Object r1 = p006A5.AbstractC0024c.m76e()
            int r2 = r0.f7792f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f7790d
            java.lang.Object r6 = r0.f7789c
            U5.f r6 = (p146U5.InterfaceC2588f) r6
            java.lang.Object r7 = r0.f7788b
            U5.s r7 = (p146U5.InterfaceC2601s) r7
            java.lang.Object r2 = r0.f7787a
            V5.e r2 = (p153V5.InterfaceC2632e) r2
            p371w5.AbstractC6928k.m28382b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f7790d
            java.lang.Object r6 = r0.f7789c
            U5.f r6 = (p146U5.InterfaceC2588f) r6
            java.lang.Object r7 = r0.f7788b
            U5.s r7 = (p146U5.InterfaceC2601s) r7
            java.lang.Object r2 = r0.f7787a
            V5.e r2 = (p153V5.InterfaceC2632e) r2
            p371w5.AbstractC6928k.m28382b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            p371w5.AbstractC6928k.m28382b(r9)
            p153V5.AbstractC2633f.m9059h(r6)
            U5.f r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f7787a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f7788b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f7789c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f7790d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f7792f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.mo8807a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f7787a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f7788b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f7789c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f7790d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f7792f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.mo2989e(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            p146U5.AbstractC2593k.m8873a(r7, r6)
        L9a:
            w5.q r6 = p371w5.C6934q.f24811a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            p146U5.AbstractC2593k.m8873a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p153V5.AbstractC2635h.m9070c(V5.e, U5.s, boolean, z5.e):java.lang.Object");
    }
}
